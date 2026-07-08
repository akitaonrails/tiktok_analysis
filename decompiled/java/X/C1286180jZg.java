package X;

import Y.ARunnableS120S0100000_20;
import android.media.MediaCodec;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0jZg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1286180jZg extends MediaCodec.Callback {
    public int LIZ;
    public int LIZIZ;
    public final List<Long> LIZJ = new ArrayList();
    public final List<Long> LIZLLL = new ArrayList();
    public long LJ = 0;
    public final /* synthetic */ MediaExtractor LJFF;
    public final /* synthetic */ List[] LJI;
    public final /* synthetic */ List LJII;
    public final /* synthetic */ C1286240jZm LJIIIIZZ;

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
            C1286240jZm c1286240jZm = this.LJIIIIZZ;
            if (i2 >= c1286240jZm.LIZLLL.length) {
                c1286240jZm.LJIIL.queueInputBuffer(i, 0, 0, 0L, 4);
                C2484209oO.LJI(this.LJIIIIZZ.LIZIZ, "onInputBufferAvailable end");
                return;
            }
            int sampleData = this.LJFF.readSampleData(c1286240jZm.LJIIL.getInputBuffer(i), 0);
            long sampleTime = this.LJFF.getSampleTime();
            if (this.LJFF.getSampleFlags() == 1) {
                this.LJ = sampleTime;
            }
            ((ArrayList) this.LIZJ).add(Long.valueOf(sampleTime));
            if (sampleData > 0 && sampleTime >= 0) {
                this.LJIIIIZZ.LJIIL.queueInputBuffer(i, 0, sampleData, sampleTime, 0);
                if (!this.LIZJ.containsAll(this.LJI[this.LIZ])) {
                    this.LJFF.advance();
                    return;
                }
                ((ArrayList) this.LIZJ).clear();
                int i3 = this.LIZ + 1;
                this.LIZ = i3;
                C1286240jZm c1286240jZm2 = this.LJIIIIZZ;
                if (i3 < c1286240jZm2.LIZLLL.length) {
                    int iIndexOf = this.LJII.indexOf(Long.valueOf(this.LJ));
                    long jLongValue2 = ((Long) this.LJI[this.LIZ].get(0)).longValue();
                    if (iIndexOf != -1 && iIndexOf < this.LJII.size() - 1) {
                        jLongValue = ((Long) this.LJII.get(iIndexOf + 1)).longValue();
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
                C2484209oO.LJI(c1286240jZm2.LIZIZ, "timer begin");
                C786410Ut5.LJLIIL(1000L, new BPEAHandler(), new ARunnableS120S0100000_20(this, 76));
                return;
            }
            String str = this.LJIIIIZZ.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onInputBufferAvailable sampSize<0 or time<0 sampSize");
            sbLIZ.append(sampleData);
            sbLIZ.append(" time: ");
            sbLIZ.append(sampleTime);
            C2484209oO.LJI(str, C2188811AlT.LIZIZ(sbLIZ));
            this.LJIIIIZZ.LIZJ();
            this.LJIIIIZZ.LIZLLL();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C2484209oO.LJI(this.LJIIIIZZ.LIZIZ, "onInputBufferAvailable crash");
            this.LJIIIIZZ.LIZJ();
            this.LJIIIIZZ.LIZLLL();
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        try {
            int i2 = this.LIZIZ;
            if (i2 < this.LJIIIIZZ.LIZLLL.length && this.LJI[i2].contains(Long.valueOf(bufferInfo.presentationTimeUs))) {
                ((ArrayList) this.LIZLLL).add(Long.valueOf(bufferInfo.presentationTimeUs));
                synchronized (this.LJIIIIZZ) {
                    try {
                        mediaCodec.releaseOutputBuffer(i, true);
                        this.LJIIIIZZ.wait(0L);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
                if (this.LIZLLL.containsAll(this.LJI[this.LIZIZ])) {
                    this.LIZIZ++;
                    ((ArrayList) this.LIZLLL).clear();
                }
                int i3 = this.LIZIZ;
                C1286240jZm c1286240jZm = this.LJIIIIZZ;
                if (i3 >= c1286240jZm.LIZLLL.length) {
                    c1286240jZm.LIZLLL();
                    return;
                }
                return;
            }
            mediaCodec.releaseOutputBuffer(i, false);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            this.LJIIIIZZ.LIZJ();
            this.LJIIIIZZ.LIZLLL();
        }
    }

    public C1286180jZg(C1286240jZm c1286240jZm, MediaExtractor mediaExtractor, List[] listArr, List list) {
        this.LJIIIIZZ = c1286240jZm;
        this.LJFF = mediaExtractor;
        this.LJI = listArr;
        this.LJII = list;
    }
}
