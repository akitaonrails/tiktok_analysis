package X;

import Y.ARunnableS120S0100000_20;
import android.media.MediaCodec;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ttve.nativePort.TEVideoUtils;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0jZh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1286190jZh extends MediaCodec.Callback {
    public int LIZ;
    public int LIZIZ;
    public final List<Long> LIZJ = new ArrayList();
    public final List<Long> LIZLLL = new ArrayList();
    public long LJ = 0;
    public final /* synthetic */ MediaExtractor LJFF;
    public final /* synthetic */ List LJI;
    public final /* synthetic */ List[] LJII;
    public final /* synthetic */ List LJIIIIZZ;
    public final /* synthetic */ C1286230jZl LJIIIZ;

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        long jLongValue;
        try {
            int i2 = this.LIZ;
            C1286230jZl c1286230jZl = this.LJIIIZ;
            if (i2 >= c1286230jZl.LIZLLL.length) {
                c1286230jZl.LJIIL.queueInputBuffer(i, 0, 0, 0L, 4);
                C2484209oO.LJI(this.LJIIIZ.LIZIZ, "onInputBufferAvailable end");
                return;
            }
            ByteBuffer inputBuffer = c1286230jZl.LJIIL.getInputBuffer(i);
            int sampleData = this.LJFF.readSampleData(inputBuffer, 0);
            long sampleTime = this.LJFF.getSampleTime();
            int sampleFlags = this.LJFF.getSampleFlags();
            C1286230jZl c1286230jZl2 = this.LJIIIZ;
            if (c1286230jZl2.LJJI || c1286230jZl2.LJJIFFI) {
                System.currentTimeMillis();
                while (true) {
                    if (this.LJIIIZ.LJIL || sampleTime < 0 || sampleFlags == 1 || !TEVideoUtils.nativeIsFrameCanDrop(inputBuffer, inputBuffer.remaining(), this.LJIIIZ.LJJIFFI) || this.LJI.contains(Long.valueOf(sampleTime))) {
                        break;
                    }
                    System.currentTimeMillis();
                    if (!this.LJFF.advance()) {
                        C2484209oO.LIZJ(this.LJIIIZ.LIZIZ, "onInputBufferAvailable end");
                        break;
                    }
                    inputBuffer.clear();
                    this.LJFF.readSampleData(inputBuffer, 0);
                    sampleTime = this.LJFF.getSampleTime();
                    sampleFlags = this.LJFF.getSampleFlags();
                }
            }
            if (sampleFlags == 1) {
                this.LJ = sampleTime;
            }
            ((ArrayList) this.LIZJ).add(Long.valueOf(sampleTime));
            if (sampleData > 0 && sampleTime >= 0) {
                this.LJIIIZ.LJIIL.queueInputBuffer(i, 0, sampleData, sampleTime, 0);
                if (!this.LIZJ.containsAll(this.LJII[this.LIZ])) {
                    this.LJFF.advance();
                    return;
                }
                ((ArrayList) this.LIZJ).clear();
                int i3 = this.LIZ + 1;
                this.LIZ = i3;
                C1286230jZl c1286230jZl3 = this.LJIIIZ;
                if (i3 < c1286230jZl3.LIZLLL.length) {
                    int iIndexOf = this.LJIIIIZZ.indexOf(Long.valueOf(this.LJ));
                    long jLongValue2 = ((Long) this.LJII[this.LIZ].get(0)).longValue();
                    if (iIndexOf != -1 && iIndexOf < this.LJIIIIZZ.size() - 1) {
                        jLongValue = ((Long) this.LJIIIIZZ.get(iIndexOf + 1)).longValue();
                    } else {
                        jLongValue = Long.MAX_VALUE;
                    }
                    if (jLongValue2 > sampleTime && jLongValue2 < jLongValue) {
                        this.LJFF.advance();
                        return;
                    } else {
                        this.LJFF.seekTo(jLongValue2, 0);
                        return;
                    }
                }
                C2484209oO.LJI(c1286230jZl3.LIZIZ, "timer begin");
                C786410Ut5.LJLIIL(1000L, new BPEAHandler(), new ARunnableS120S0100000_20(this, 77));
                return;
            }
            C2484209oO.LJI(this.LJIIIZ.LIZIZ, "onInputBufferAvailable sampSize<0 or time<0 sampSize" + sampleData + " time: " + sampleTime);
            this.LJIIIZ.LIZJ();
            this.LJIIIZ.LIZLLL();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C2484209oO.LJI(this.LJIIIZ.LIZIZ, "onInputBufferAvailable crash");
            this.LJIIIZ.LIZJ();
            this.LJIIIZ.LIZLLL();
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        try {
            if (bufferInfo.flags != 4) {
                int i2 = this.LIZIZ;
                List[] listArr = this.LJII;
                if (i2 < listArr.length) {
                    if (i2 < this.LJIIIZ.LIZLLL.length && listArr[i2].contains(Long.valueOf(bufferInfo.presentationTimeUs))) {
                        ((ArrayList) this.LIZLLL).add(Long.valueOf(bufferInfo.presentationTimeUs));
                        synchronized (this.LJIIIZ) {
                            try {
                                mediaCodec.releaseOutputBuffer(i, true);
                                this.LJIIIZ.wait(0L);
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                throw th;
                            }
                        }
                        if (this.LIZLLL.containsAll(this.LJII[this.LIZIZ])) {
                            this.LIZIZ++;
                            ((ArrayList) this.LIZLLL).clear();
                        }
                        int i3 = this.LIZIZ;
                        C1286230jZl c1286230jZl = this.LJIIIZ;
                        if (i3 >= c1286230jZl.LIZLLL.length) {
                            c1286230jZl.LIZLLL();
                            return;
                        }
                        return;
                    }
                    mediaCodec.releaseOutputBuffer(i, false);
                    return;
                }
            }
            this.LJIIIZ.LIZJ();
            this.LJIIIZ.LIZLLL();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            this.LJIIIZ.LIZJ();
            this.LJIIIZ.LIZLLL();
        }
    }

    public C1286190jZh(C1286230jZl c1286230jZl, MediaExtractor mediaExtractor, List list, List[] listArr, List list2) {
        this.LJIIIZ = c1286230jZl;
        this.LJFF = mediaExtractor;
        this.LJI = list;
        this.LJII = listArr;
        this.LJIIIIZZ = list2;
    }
}
