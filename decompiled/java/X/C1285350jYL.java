package X;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.HandlerThread;
import android.view.Surface;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: X.0jYL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1285350jYL {
    public static final C1285350jYL LJI = new C1285350jYL();
    public boolean LIZ = true;
    public final C1285470jYX LIZIZ = new C1285470jYX();
    public final HashMap<C1285260jYC, InterfaceC1285250jYB> LIZJ = new HashMap<>();
    public final boolean LIZLLL = true;
    public final C1285410jYR LJ = C1285410jYR.LJ;
    public final C1285470jYX LJFF = new C1285470jYX();

    public final InterfaceC1285250jYB LIZIZ(MediaFormat mediaFormat, C1285260jYC c1285260jYC) throws IOException {
        C1285470jYX c1285470jYX;
        AbstractC1285340jYK next;
        final MediaCodec mediaCodecCreateDecoderByType;
        AbstractC1285340jYK abstractC1285340jYK;
        boolean zContains = c1285260jYC.LJII.contains("video");
        if (C1283990jW9.LIZ >= 23 && c1285260jYC.LIZ) {
            C1285360jYM c1285360jYMLIZ = C1285360jYM.LIZ(mediaFormat);
            if (zContains) {
                c1285470jYX = this.LJFF;
            } else {
                c1285470jYX = this.LIZIZ;
            }
            C1285380jYO c1285380jYO = c1285470jYX.LIZ;
            Iterator<AbstractC1285340jYK> it2 = c1285380jYO.LIZJ.iterator();
            while (true) {
                next = null;
                if (!it2.hasNext()) {
                    break;
                }
                next = it2.next();
                if (!next.LJ && next.LJII(c1285360jYMLIZ) != EnumC1285430jYT.CODEC_RESULT_NO) {
                    break;
                }
                int i = next.LJIIIIZZ + 1;
                next.LJIIIIZZ = i;
                if (i >= 3) {
                    c1285380jYO.LIZIZ(next);
                }
            }
            if (next != null) {
                c1285380jYO.LIZJ.remove(next);
                EnumC1285430jYT enumC1285430jYTLJII = next.LJII(c1285360jYMLIZ);
                next.LJIILL = enumC1285430jYTLJII;
                if (enumC1285430jYTLJII == EnumC1285430jYT.CODEC_RESULT_YES_WITHOUT_RECONFIGURATION || enumC1285430jYTLJII == EnumC1285430jYT.CODEC_RESULT_YES_WITH_RECONFIGURATION) {
                    next.LJIIIIZZ = 0;
                    if (next.LJIILLIIL == EnumC1285420jYS.Running) {
                        try {
                            next.flush();
                        } catch (IllegalStateException e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                    next.LJIIL = true;
                    return next;
                }
            }
            String string = mediaFormat.getString("mime");
            final C1285360jYM c1285360jYMLIZ2 = C1285360jYM.LIZ(mediaFormat);
            C1285410jYR c1285410jYR = LJI.LJ;
            int iMax = Math.max(c1285410jYR.LIZJ, c1285360jYMLIZ2.LJIIIIZZ);
            int iMax2 = Math.max(c1285410jYR.LIZIZ, c1285360jYMLIZ2.LJIIIZ);
            if (c1285410jYR.LIZLLL) {
                c1285410jYR.LIZJ = iMax;
                c1285410jYR.LIZIZ = iMax2;
            }
            int iMax3 = Math.max(0, C1285010jXn.LIZ(iMax, iMax2, c1285360jYMLIZ2.LJII));
            c1285360jYMLIZ2.LIZLLL = iMax;
            c1285360jYMLIZ2.LJ = iMax2;
            c1285360jYMLIZ2.LJFF = iMax3;
            if (iMax3 > 0) {
                mediaFormat.setInteger("max-input-size", iMax3);
            }
            if (!c1285360jYMLIZ2.LIZJ) {
                c1285360jYMLIZ2.LIZJ = true;
                c1285360jYMLIZ2.LIZIZ = c1285360jYMLIZ2.LJII.contains("video");
            }
            if (c1285360jYMLIZ2.LIZIZ) {
                mediaFormat.setInteger("max-width", iMax);
                mediaFormat.setInteger("max-height", iMax2);
            }
            if (c1285260jYC.LIZLLL == EnumC1153070g6z.CreateByName) {
                mediaCodecCreateDecoderByType = MediaCodec.createByCodecName(c1285260jYC.LJFF);
            } else {
                mediaCodecCreateDecoderByType = MediaCodec.createDecoderByType(string);
            }
            if (string.contains("video")) {
                abstractC1285340jYK = new AbstractC1285340jYK(mediaCodecCreateDecoderByType, c1285360jYMLIZ2) { // from class: X.0jYN
                    @Override // X.AbstractC1285340jYK
                    public final boolean LJIIJJI() {
                        return super.LJIIJJI() && this.LJFF != null && this.LJIIJJI.LJI <= 0;
                    }

                    @Override // X.AbstractC1285340jYK
                    public final String toString() {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("VideoCodecAdapter[");
                        sbLIZ.append(hashCode());
                        sbLIZ.append(']');
                        return C2188811AlT.LIZIZ(sbLIZ);
                    }

                    @Override // X.AbstractC1285340jYK
                    public final EnumC1285430jYT LJII(C1285360jYM c1285360jYM) {
                        int i2;
                        int iLIZ;
                        if (C1285400jYQ.LIZ(this, c1285360jYM)) {
                            int i3 = c1285360jYM.LJIIIIZZ;
                            C1285480jYY c1285480jYY = this.LIZJ;
                            if (i3 <= c1285480jYY.LIZ && (i2 = c1285360jYM.LJIIIZ) <= c1285480jYY.LIZIZ) {
                                if (c1285360jYM.LJFF == -1) {
                                    iLIZ = C1285010jXn.LIZ(i3, i2, c1285360jYM.LJII);
                                } else {
                                    int length = 0;
                                    for (int i4 = 0; i4 < c1285360jYM.LIZ.size(); i4++) {
                                        length += ((byte[]) ListProtector.get(c1285360jYM.LIZ, i4)).length;
                                    }
                                    iLIZ = c1285360jYM.LJFF + length;
                                }
                                if (iLIZ <= this.LIZJ.LIZJ) {
                                    C1285360jYM c1285360jYM2 = this.LJIIJJI;
                                    if (c1285360jYM.LIZ.size() == c1285360jYM2.LIZ.size()) {
                                        for (int i5 = 0; i5 < c1285360jYM.LIZ.size(); i5++) {
                                            if (Arrays.equals((byte[]) ListProtector.get(c1285360jYM.LIZ, i5), (byte[]) ListProtector.get(c1285360jYM2.LIZ, i5))) {
                                            }
                                        }
                                        return EnumC1285430jYT.CODEC_RESULT_YES_WITHOUT_RECONFIGURATION;
                                    }
                                    return EnumC1285430jYT.CODEC_RESULT_YES_WITH_RECONFIGURATION;
                                }
                            }
                        }
                        return EnumC1285430jYT.CODEC_RESULT_NO;
                    }
                };
            } else {
                abstractC1285340jYK = new AbstractC1285340jYK(mediaCodecCreateDecoderByType, c1285360jYMLIZ2) { // from class: X.0jYP
                    @Override // X.AbstractC1285340jYK
                    public final String toString() {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("AudioCodecAdapter[");
                        sbLIZ.append(hashCode());
                        sbLIZ.append(']');
                        return C2188811AlT.LIZIZ(sbLIZ);
                    }

                    @Override // X.AbstractC1285340jYK
                    public final EnumC1285430jYT LJII(C1285360jYM c1285360jYM) {
                        if (C1285400jYQ.LIZ(this, c1285360jYM)) {
                            return EnumC1285430jYT.CODEC_RESULT_YES_WITHOUT_RECONFIGURATION;
                        }
                        return EnumC1285430jYT.CODEC_RESULT_NO;
                    }
                };
            }
            this.LIZJ.put(c1285260jYC, abstractC1285340jYK);
            return abstractC1285340jYK;
        }
        if (c1285260jYC.LIZLLL == EnumC1153070g6z.CreateByName) {
            final MediaCodec mediaCodecCreateByCodecName = MediaCodec.createByCodecName(c1285260jYC.LJFF);
            return new InterfaceC1285250jYB(mediaCodecCreateByCodecName) { // from class: X.0jVI
                public static final AtomicInteger LJFF = new AtomicInteger(0);
                public final MediaCodec LIZ;
                public C1285240jYA LIZIZ;
                public BPEAHandler LIZJ;
                public HandlerThread LIZLLL;
                public boolean LJ;

                @Override // X.InterfaceC1285250jYB
                public final void flush() {
                    this.LIZ.flush();
                }

                @Override // X.InterfaceC1285250jYB
                public final void release() {
                    HandlerThread handlerThread = this.LIZLLL;
                    if (handlerThread != null) {
                        handlerThread.quit();
                    }
                    this.LIZ.release();
                    LJFF.decrementAndGet();
                }

                @Override // X.InterfaceC1285250jYB
                public final void start() {
                    this.LIZ.start();
                }

                @Override // X.InterfaceC1285250jYB
                public final void stop() {
                    this.LIZ.stop();
                }

                @Override // X.InterfaceC1285250jYB
                public final void LIZ() {
                }

                @Override // X.InterfaceC1285250jYB
                public final MediaCodec LIZIZ() {
                    return this.LIZ;
                }

                @Override // X.InterfaceC1285250jYB
                public final void LIZJ() {
                }

                @Override // X.InterfaceC1285250jYB
                public final BPEAHandler LIZLLL() {
                    return this.LIZJ;
                }

                @Override // X.InterfaceC1285250jYB
                public final boolean LJFF() {
                    return this.LJ;
                }

                {
                    this.LIZ = mediaCodecCreateByCodecName;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("DirectCodecAdapter sCodecNum:");
                    sbLIZ.append(LJFF.incrementAndGet());
                    C2188811AlT.LIZIZ(sbLIZ);
                }

                @Override // X.InterfaceC1285250jYB
                public final int dequeueInputBuffer(long j) {
                    return this.LIZ.dequeueInputBuffer(j);
                }

                @Override // X.InterfaceC1285250jYB
                public final void setOutputSurface(Surface surface) {
                    if (C1283990jW9.LIZ >= 23) {
                        this.LIZ.setOutputSurface(surface);
                    }
                }

                @Override // X.InterfaceC1285250jYB
                public final void LJ(MediaFormat mediaFormat2, Surface surface) throws Exception {
                    try {
                        this.LIZ.configure(mediaFormat2, surface, (MediaCrypto) null, 0);
                    } catch (Exception e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("DirectCodecAdapter configure exception:");
                        sbLIZ.append(e2);
                        C2188811AlT.LIZIZ(sbLIZ);
                        this.LJ = true;
                        throw e2;
                    }
                }

                @Override // X.InterfaceC1285250jYB
                public final void LJI(C1285260jYC c1285260jYC2, C1285230jY9 c1285230jY9) {
                    if (C1283990jW9.LIZ < 23) {
                        return;
                    }
                    C1285240jYA c1285240jYA = this.LIZIZ;
                    if (c1285240jYA == null) {
                        HandlerThread handlerThread = new HandlerThread("mc2_async_direct");
                        this.LIZLLL = handlerThread;
                        handlerThread.start();
                        this.LIZIZ = new C1285240jYA(c1285260jYC2, c1285230jY9);
                        BPEAHandler bPEAHandler = new BPEAHandler(C786410Ut5.W2(this.LIZLLL));
                        this.LIZJ = bPEAHandler;
                        this.LIZ.setCallback(this.LIZIZ, bPEAHandler);
                        return;
                    }
                    c1285240jYA.LIZ = c1285230jY9;
                }

                @Override // X.InterfaceC1285250jYB
                public final int dequeueOutputBuffer(MediaCodec.BufferInfo bufferInfo, long j) {
                    return this.LIZ.dequeueOutputBuffer(bufferInfo, j);
                }

                @Override // X.InterfaceC1285250jYB
                public final void releaseOutputBuffer(int i2, long j) {
                    if (C1283990jW9.LIZ >= 21) {
                        this.LIZ.releaseOutputBuffer(i2, j);
                    }
                }

                @Override // X.InterfaceC1285250jYB
                public final void releaseOutputBuffer(int i2, boolean z) {
                    this.LIZ.releaseOutputBuffer(i2, z);
                }

                @Override // X.InterfaceC1285250jYB
                public final void queueInputBuffer(int i2, int i3, int i4, long j, int i5) {
                    this.LIZ.queueInputBuffer(i2, i3, i4, j, i5);
                }
            };
        }
        final MediaCodec mediaCodecCreateDecoderByType2 = MediaCodec.createDecoderByType(c1285260jYC.LJFF);
        return new InterfaceC1285250jYB(mediaCodecCreateDecoderByType2) { // from class: X.0jVI
            public static final AtomicInteger LJFF = new AtomicInteger(0);
            public final MediaCodec LIZ;
            public C1285240jYA LIZIZ;
            public BPEAHandler LIZJ;
            public HandlerThread LIZLLL;
            public boolean LJ;

            @Override // X.InterfaceC1285250jYB
            public final void flush() {
                this.LIZ.flush();
            }

            @Override // X.InterfaceC1285250jYB
            public final void release() {
                HandlerThread handlerThread = this.LIZLLL;
                if (handlerThread != null) {
                    handlerThread.quit();
                }
                this.LIZ.release();
                LJFF.decrementAndGet();
            }

            @Override // X.InterfaceC1285250jYB
            public final void start() {
                this.LIZ.start();
            }

            @Override // X.InterfaceC1285250jYB
            public final void stop() {
                this.LIZ.stop();
            }

            @Override // X.InterfaceC1285250jYB
            public final void LIZ() {
            }

            @Override // X.InterfaceC1285250jYB
            public final MediaCodec LIZIZ() {
                return this.LIZ;
            }

            @Override // X.InterfaceC1285250jYB
            public final void LIZJ() {
            }

            @Override // X.InterfaceC1285250jYB
            public final BPEAHandler LIZLLL() {
                return this.LIZJ;
            }

            @Override // X.InterfaceC1285250jYB
            public final boolean LJFF() {
                return this.LJ;
            }

            {
                this.LIZ = mediaCodecCreateDecoderByType2;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("DirectCodecAdapter sCodecNum:");
                sbLIZ.append(LJFF.incrementAndGet());
                C2188811AlT.LIZIZ(sbLIZ);
            }

            @Override // X.InterfaceC1285250jYB
            public final int dequeueInputBuffer(long j) {
                return this.LIZ.dequeueInputBuffer(j);
            }

            @Override // X.InterfaceC1285250jYB
            public final void setOutputSurface(Surface surface) {
                if (C1283990jW9.LIZ >= 23) {
                    this.LIZ.setOutputSurface(surface);
                }
            }

            @Override // X.InterfaceC1285250jYB
            public final void LJ(MediaFormat mediaFormat2, Surface surface) throws Exception {
                try {
                    this.LIZ.configure(mediaFormat2, surface, (MediaCrypto) null, 0);
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("DirectCodecAdapter configure exception:");
                    sbLIZ.append(e2);
                    C2188811AlT.LIZIZ(sbLIZ);
                    this.LJ = true;
                    throw e2;
                }
            }

            @Override // X.InterfaceC1285250jYB
            public final void LJI(C1285260jYC c1285260jYC2, C1285230jY9 c1285230jY9) {
                if (C1283990jW9.LIZ < 23) {
                    return;
                }
                C1285240jYA c1285240jYA = this.LIZIZ;
                if (c1285240jYA == null) {
                    HandlerThread handlerThread = new HandlerThread("mc2_async_direct");
                    this.LIZLLL = handlerThread;
                    handlerThread.start();
                    this.LIZIZ = new C1285240jYA(c1285260jYC2, c1285230jY9);
                    BPEAHandler bPEAHandler = new BPEAHandler(C786410Ut5.W2(this.LIZLLL));
                    this.LIZJ = bPEAHandler;
                    this.LIZ.setCallback(this.LIZIZ, bPEAHandler);
                    return;
                }
                c1285240jYA.LIZ = c1285230jY9;
            }

            @Override // X.InterfaceC1285250jYB
            public final int dequeueOutputBuffer(MediaCodec.BufferInfo bufferInfo, long j) {
                return this.LIZ.dequeueOutputBuffer(bufferInfo, j);
            }

            @Override // X.InterfaceC1285250jYB
            public final void releaseOutputBuffer(int i2, long j) {
                if (C1283990jW9.LIZ >= 21) {
                    this.LIZ.releaseOutputBuffer(i2, j);
                }
            }

            @Override // X.InterfaceC1285250jYB
            public final void releaseOutputBuffer(int i2, boolean z) {
                this.LIZ.releaseOutputBuffer(i2, z);
            }

            @Override // X.InterfaceC1285250jYB
            public final void queueInputBuffer(int i2, int i3, int i4, long j, int i5) {
                this.LIZ.queueInputBuffer(i2, i3, i4, j, i5);
            }
        };
    }

    public final void LIZ(InterfaceC1285250jYB interfaceC1285250jYB, MediaFormat mediaFormat, Surface surface, C1285260jYC c1285260jYC) {
        c1285260jYC.getClass();
        interfaceC1285250jYB.LIZ();
        if (this.LIZLLL) {
            if (interfaceC1285250jYB instanceof C1285370jYN) {
                C1285470jYX c1285470jYX = this.LJFF;
                AbstractC1285340jYK abstractC1285340jYK = (AbstractC1285340jYK) interfaceC1285250jYB;
                c1285470jYX.getClass();
                c1285470jYX.LIZ.LIZIZ(abstractC1285340jYK);
                c1285470jYX.LIZIZ.LIZ(abstractC1285340jYK);
            } else if (interfaceC1285250jYB instanceof C1285390jYP) {
                C1285470jYX c1285470jYX2 = this.LIZIZ;
                AbstractC1285340jYK abstractC1285340jYK2 = (AbstractC1285340jYK) interfaceC1285250jYB;
                c1285470jYX2.getClass();
                c1285470jYX2.LIZ.LIZIZ(abstractC1285340jYK2);
                c1285470jYX2.LIZIZ.LIZ(abstractC1285340jYK2);
            }
        }
        interfaceC1285250jYB.LJ(mediaFormat, surface);
    }
}
