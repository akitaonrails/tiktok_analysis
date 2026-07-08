package X;

import Y.ARunnableS120S0100000_20;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.Surface;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.ttm.player.DummySurface;
import java.util.HashSet;
import java.util.concurrent.ExecutorService;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0jYK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public abstract class AbstractC1285340jYK implements InterfaceC1285250jYB {
    public final boolean LIZ;
    public final MediaCodec LIZIZ;
    public final C1285480jYY LIZJ;
    public final String LIZLLL;
    public boolean LJ;
    public Surface LJFF;
    public final String LJI;
    public DummySurface LJII;
    public int LJIIIIZZ;
    public final int[] LJIIIZ;
    public boolean LJIIJ;
    public final C1285360jYM LJIIJJI;
    public boolean LJIIL;
    public final HashSet<Integer> LJIILIIL;
    public boolean LJIILJJIL;
    public EnumC1285430jYT LJIILL;
    public EnumC1285420jYS LJIILLIIL;
    public C1285240jYA LJIIZILJ;
    public BPEAHandler LJIJ;
    public HandlerThread LJIJI;
    public boolean LJIJJ;

    @Override // X.InterfaceC1285250jYB
    public final void LIZ() {
    }

    public abstract EnumC1285430jYT LJII(C1285360jYM c1285360jYM);

    @Override // X.InterfaceC1285250jYB
    public final void release() {
        this.LJIILJJIL = true;
        if (!LJIIJJI()) {
            C1285350jYL c1285350jYL = C1285350jYL.LJI;
            if (c1285350jYL.LIZLLL) {
                if (this instanceof C1285370jYN) {
                    C1285470jYX c1285470jYX = c1285350jYL.LJFF;
                    c1285470jYX.getClass();
                    c1285470jYX.LIZIZ.LIZIZ(this);
                } else if (this instanceof C1285390jYP) {
                    C1285470jYX c1285470jYX2 = c1285350jYL.LIZIZ;
                    c1285470jYX2.getClass();
                    c1285470jYX2.LIZIZ.LIZIZ(this);
                }
            }
            LJIILIIL();
            this.LJIILLIIL = EnumC1285420jYS.Released;
            return;
        }
        try {
            flush();
        } catch (IllegalStateException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (this.LJII == null) {
            this.LJII = DummySurface.newInstanceV17(false);
        }
        LJIIJ(this.LJII);
        C1285350jYL c1285350jYL2 = C1285350jYL.LJI;
        if (c1285350jYL2.LIZLLL) {
            if (this instanceof C1285370jYN) {
                C1285470jYX c1285470jYX3 = c1285350jYL2.LJFF;
                c1285470jYX3.getClass();
                c1285470jYX3.LIZIZ.LIZIZ(this);
                c1285470jYX3.LIZ.LIZ(this);
                return;
            }
            if (this instanceof C1285390jYP) {
                C1285470jYX c1285470jYX4 = c1285350jYL2.LIZIZ;
                c1285470jYX4.getClass();
                c1285470jYX4.LIZIZ.LIZIZ(this);
                c1285470jYX4.LIZ.LIZ(this);
            }
        }
    }

    public boolean LJIIJJI() {
        if (this.LJIIJ || !this.LJIJJ) {
            return false;
        }
        C1285350jYL c1285350jYL = C1285350jYL.LJI;
        return c1285350jYL.LIZLLL && c1285350jYL.LIZ;
    }

    public final void LJIILIIL() {
        if (this.LJ) {
            return;
        }
        this.LJ = true;
        if (this.LJIILLIIL != EnumC1285420jYS.Uninitialized) {
            try {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("stop codec, state =");
                sbLIZ.append(this.LJIILLIIL);
                C2188811AlT.LIZIZ(sbLIZ);
                this.LIZIZ.stop();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("stop codec error =");
                sbLIZ2.append(th.getLocalizedMessage());
                C2188811AlT.LIZIZ(sbLIZ2);
            }
        }
        ARunnableS120S0100000_20 aRunnableS120S0100000_20 = new ARunnableS120S0100000_20(this, 261);
        ExecutorService executorService = C2113708Pv.LIZ;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            C2113708Pv.LIZ.execute(aRunnableS120S0100000_20);
        } else {
            aRunnableS120S0100000_20.run();
        }
        this.LJIILLIIL = EnumC1285420jYS.Uninitialized;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0026  */
    @Override // X.InterfaceC1285250jYB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void flush() {
        /*
            r3 = this;
            android.media.MediaCodec r0 = r3.LIZIZ     // Catch: java.lang.Throwable -> La
            r0.flush()     // Catch: java.lang.Throwable -> La
            X.0jYS r0 = X.EnumC1285420jYS.Flushed     // Catch: java.lang.Throwable -> La
            r3.LJIILLIIL = r0     // Catch: java.lang.Throwable -> La
            return
        La:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            int r1 = X.C1283990jW9.LIZ
            r0 = 21
            if (r1 < r0) goto L26
            boolean r0 = r2 instanceof android.media.MediaCodec.CodecException
            if (r0 != 0) goto L23
            boolean r0 = r2 instanceof java.lang.IllegalStateException
            if (r0 == 0) goto L26
            r1 = 4000(0xfa0, float:5.605E-42)
        L1e:
            r0 = 0
            r3.LJIIIIZZ(r1, r0, r2)
            throw r2
        L23:
            r1 = 4001(0xfa1, float:5.607E-42)
            goto L1e
        L26:
            r1 = 0
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1285340jYK.flush():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0034  */
    @Override // X.InterfaceC1285250jYB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void start() {
        /*
            r3 = this;
            X.0jYS r1 = r3.LJIILLIIL     // Catch: java.lang.Throwable -> L18
            X.0jYS r0 = X.EnumC1285420jYS.Configured     // Catch: java.lang.Throwable -> L18
            if (r1 == r0) goto Le
            X.0jYS r0 = X.EnumC1285420jYS.Flushed     // Catch: java.lang.Throwable -> L18
            if (r1 != r0) goto L17
            X.0jYA r0 = r3.LJIIZILJ     // Catch: java.lang.Throwable -> L18
            if (r0 == 0) goto L17
        Le:
            android.media.MediaCodec r0 = r3.LIZIZ     // Catch: java.lang.Throwable -> L18
            r0.start()     // Catch: java.lang.Throwable -> L18
            X.0jYS r0 = X.EnumC1285420jYS.Running     // Catch: java.lang.Throwable -> L18
            r3.LJIILLIIL = r0     // Catch: java.lang.Throwable -> L18
        L17:
            return
        L18:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            int r1 = X.C1283990jW9.LIZ
            r0 = 21
            if (r1 < r0) goto L34
            boolean r0 = r2 instanceof android.media.MediaCodec.CodecException
            if (r0 != 0) goto L31
            boolean r0 = r2 instanceof java.lang.IllegalStateException
            if (r0 == 0) goto L34
            r1 = 9000(0x2328, float:1.2612E-41)
        L2c:
            r0 = 0
            r3.LJIIIIZZ(r1, r0, r2)
            throw r2
        L31:
            r1 = 9001(0x2329, float:1.2613E-41)
            goto L2c
        L34:
            r1 = 0
            goto L2c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1285340jYK.start():void");
    }

    @Override // X.InterfaceC1285250jYB
    public final void LIZJ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setReusable =");
        sbLIZ.append(false);
        C2188811AlT.LIZIZ(sbLIZ);
        this.LJIJJ = false;
    }

    @Override // X.InterfaceC1285250jYB
    public final void stop() {
        if (LJIIJJI()) {
            return;
        }
        try {
            this.LIZIZ.stop();
            this.LJIILLIIL = EnumC1285420jYS.Uninitialized;
        } catch (IllegalStateException e) {
            TryCatchGuardChecker.doCheck(e);
            this.LJIIJ = true;
            this.LJIILLIIL = EnumC1285420jYS.Uninitialized;
            throw e;
        }
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(super.toString());
        sbLIZ.append(" mReleaseCalled:");
        sbLIZ.append(this.LJIILJJIL);
        sbLIZ.append(" isRecycled:");
        sbLIZ.append(this.LJ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1285250jYB
    public final MediaCodec LIZIZ() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC1285250jYB
    public final BPEAHandler LIZLLL() {
        return this.LJIJ;
    }

    @Override // X.InterfaceC1285250jYB
    public final boolean LJFF() {
        return this.LJIIJ;
    }

    public final void LJIIJ(Surface surface) {
        int i;
        try {
            LJIILJJIL(surface);
            this.LIZIZ.setOutputSurface(surface);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (!(th instanceof IllegalStateException)) {
                if (th instanceof IllegalArgumentException) {
                    i = 8001;
                } else {
                    i = 0;
                }
            } else {
                i = 8000;
            }
            LJIIIZ(i, null, th, true, surface);
            throw th;
        }
    }

    public final void LJIILJJIL(Surface surface) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this);
        sbLIZ.append(", oldSurface:");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(" CodecAdapterSetSurface surface:");
        sbLIZ.append(surface);
        C2188811AlT.LIZIZ(sbLIZ);
        this.LJFF = surface;
    }

    @Override // X.InterfaceC1285250jYB
    public final int dequeueInputBuffer(long j) {
        int i;
        try {
            int iDequeueInputBuffer = this.LIZIZ.dequeueInputBuffer(j);
            this.LJIILLIIL = EnumC1285420jYS.Running;
            return iDequeueInputBuffer;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (!(th instanceof IllegalStateException)) {
                if (th instanceof IllegalArgumentException) {
                    i = 2001;
                } else {
                    i = 0;
                }
            } else {
                i = 2000;
            }
            LJIIIIZZ(i, null, th);
            throw th;
        }
    }

    @Override // X.InterfaceC1285250jYB
    public final void setOutputSurface(Surface surface) {
        LJIIJ(surface);
    }

    public AbstractC1285340jYK(MediaCodec mediaCodec, C1285360jYM c1285360jYM) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ReuseCodecAdapter[");
        sbLIZ.append(hashCode());
        sbLIZ.append(e3.f);
        this.LJI = C2188811AlT.LIZIZ(sbLIZ);
        this.LJIILIIL = new HashSet<>();
        this.LJIIIZ = new int[2];
        this.LJIILLIIL = EnumC1285420jYS.Uninitialized;
        this.LJIILL = EnumC1285430jYT.CODEC_RESULT_NO;
        this.LJIIJ = false;
        this.LJIIIIZZ = 0;
        this.LIZIZ = mediaCodec;
        this.LJIIJJI = c1285360jYM;
        this.LIZJ = new C1285480jYY(c1285360jYM.LIZLLL, c1285360jYM.LJ, c1285360jYM.LJFF);
        String name = mediaCodec.getName();
        this.LIZLLL = name;
        int i = C1283990jW9.LIZ;
        if (i <= 25 && !"OMX.Exynos.avc.dec.secure".equals(name) && i < 24 && ("OMX.Nvidia.h264.decode".equals(name) || "OMX.Nvidia.h264.decode.secure".equals(name))) {
            String str = C1283990jW9.LIZIZ;
            if (!"flounder".equals(str) && !"flounder_lte".equals(str) && !"grouper".equals(str)) {
                "tilapia".equals(str);
            }
        }
        this.LIZ = true;
        this.LJIJJ = true;
    }

    @Override // X.InterfaceC1285250jYB
    public final void LJ(MediaFormat mediaFormat, Surface surface) {
        int i = 0;
        this.LJIILJJIL = false;
        if (this.LJIILLIIL == EnumC1285420jYS.Uninitialized) {
            try {
                this.LIZIZ.configure(mediaFormat, surface, (MediaCrypto) null, 0);
                LJIILJJIL(surface);
                this.LJIILLIIL = EnumC1285420jYS.Configured;
                return;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                if (!(th instanceof IllegalStateException)) {
                    if (th instanceof MediaCodec.CryptoException) {
                        i = 1001;
                    }
                } else {
                    i = LSPassThroughRecordSizeConfig.DEFAULT;
                }
                LJIIIZ(i, null, th, true, surface);
                throw th;
            }
        }
        if (surface != null) {
            int[] iArr = this.LJIIIZ;
            iArr[0] = 0;
            iArr[1] = 0;
            LJIIJ(surface);
        }
    }

    @Override // X.InterfaceC1285250jYB
    public final void LJI(C1285260jYC c1285260jYC, C1285230jY9 c1285230jY9) {
        if (C1283990jW9.LIZ < 23) {
            return;
        }
        C1285240jYA c1285240jYA = this.LJIIZILJ;
        if (c1285240jYA == null) {
            this.LJIIZILJ = new C1285240jYA(c1285260jYC, c1285230jY9);
            HandlerThread handlerThread = new HandlerThread("mc2_async");
            this.LJIJI = handlerThread;
            handlerThread.start();
            BPEAHandler bPEAHandler = new BPEAHandler(C786410Ut5.W2(this.LJIJI));
            this.LJIJ = bPEAHandler;
            this.LIZIZ.setCallback(this.LJIIZILJ, bPEAHandler);
            return;
        }
        c1285240jYA.LIZ = c1285230jY9;
        c1285240jYA.LIZIZ = c1285260jYC;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    @Override // X.InterfaceC1285250jYB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int dequeueOutputBuffer(android.media.MediaCodec.BufferInfo r4, long r5) {
        /*
            r3 = this;
            android.media.MediaCodec r0 = r3.LIZIZ     // Catch: java.lang.Throwable -> L10
            int r2 = r0.dequeueOutputBuffer(r4, r5)     // Catch: java.lang.Throwable -> L10
            java.util.HashSet<java.lang.Integer> r1 = r3.LJIILIIL     // Catch: java.lang.Throwable -> L10
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L10
            r1.add(r0)     // Catch: java.lang.Throwable -> L10
            return r2
        L10:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            int r1 = X.C1283990jW9.LIZ
            r0 = 21
            if (r1 < r0) goto L2c
            boolean r0 = r2 instanceof android.media.MediaCodec.CodecException
            if (r0 != 0) goto L29
            boolean r0 = r2 instanceof java.lang.IllegalStateException
            if (r0 == 0) goto L2c
            r1 = 3000(0xbb8, float:4.204E-42)
        L24:
            r0 = 0
            r3.LJIIIIZZ(r1, r0, r2)
            throw r2
        L29:
            r1 = 3001(0xbb9, float:4.205E-42)
            goto L24
        L2c:
            r1 = 0
            goto L24
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1285340jYK.dequeueOutputBuffer(android.media.MediaCodec$BufferInfo, long):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0041  */
    @Override // X.InterfaceC1285250jYB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void releaseOutputBuffer(int r4, boolean r5) {
        /*
            r3 = this;
            java.util.HashSet<java.lang.Integer> r1 = r3.LJIILIIL     // Catch: java.lang.Throwable -> Lf
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> Lf
            r1.remove(r0)     // Catch: java.lang.Throwable -> Lf
            android.media.MediaCodec r0 = r3.LIZIZ     // Catch: java.lang.Throwable -> Lf
            r0.releaseOutputBuffer(r4, r5)     // Catch: java.lang.Throwable -> Lf
            return
        Lf:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            X.0jYS r1 = r3.LJIILLIIL
            X.0jYS r0 = X.EnumC1285420jYS.Flushed
            if (r1 == r0) goto L28
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            r1.append(r3)
            java.lang.String r0 = ", releaseOutputBuffer failed, ignore e:"
            r1.append(r0)
            X.C2188811AlT.LIZIZ(r1)
        L28:
            int r1 = X.C1283990jW9.LIZ
            r0 = 21
            if (r1 < r0) goto L41
            boolean r0 = r2 instanceof android.media.MediaCodec.CodecException
            if (r0 == 0) goto L3a
            r1 = 6001(0x1771, float:8.409E-42)
        L34:
            java.lang.String r0 = r3.LJI
            r3.LJIIIIZZ(r1, r0, r2)
            return
        L3a:
            boolean r0 = r2 instanceof java.lang.IllegalStateException
            if (r0 == 0) goto L41
            r1 = 6000(0x1770, float:8.408E-42)
            goto L34
        L41:
            r1 = 0
            goto L34
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1285340jYK.releaseOutputBuffer(int, boolean):void");
    }

    @Override // X.InterfaceC1285250jYB
    public final void releaseOutputBuffer(int i, long j) {
        int i2;
        this.LJIILIIL.remove(Integer.valueOf(i));
        try {
            this.LIZIZ.releaseOutputBuffer(i, j);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (!(th instanceof MediaCodec.CodecException)) {
                if (th instanceof IllegalStateException) {
                    i2 = 6000;
                } else {
                    i2 = 0;
                }
            } else {
                i2 = 6001;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this);
            sbLIZ.append(", releaseOutputBuffer index:");
            sbLIZ.append(i);
            sbLIZ.append(" renderTimestampNs:");
            sbLIZ.append(j);
            LJIIIIZZ(i2, C2188811AlT.LIZIZ(sbLIZ), th);
            throw th;
        }
    }

    public final void LJIIIIZZ(int i, String str, Throwable th) {
        LJIIIZ(i, str, th, false, this.LJFF);
    }

    public final void LJIIIZ(int i, String str, Throwable th, boolean z, Surface surface) {
        this.LJIIJ = true;
        String localizedMessage = th.getLocalizedMessage();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append("exception:");
        sbLIZ.append(localizedMessage);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (z) {
            if (surface == null) {
                i = 1003;
            } else if (!surface.isValid()) {
                i = 1004;
            }
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("hasReused:");
        sbLIZ2.append(this.LJIIL);
        sbLIZ2.append("errorCode:");
        sbLIZ2.append(i);
        sbLIZ2.append(", ");
        sbLIZ2.append(strLIZIZ);
        C2188811AlT.LIZIZ(sbLIZ2);
    }

    public final void LJIIL(int i, int i2, int i3, int i4, long j) {
        int i5 = C1285450jYV.LIZ[this.LJIILL.ordinal()];
        if (i5 != EnumC1285430jYT.CODEC_RESULT_NO.ordinal()) {
            if (i5 == EnumC1285430jYT.CODEC_RESULT_YES_WITH_RECONFIGURATION.ordinal()) {
                this.LIZIZ.queueInputBuffer(i, i2, i3, j, i4);
            } else {
                if (i5 != EnumC1285430jYT.CODEC_RESULT_YES_WITHOUT_RECONFIGURATION.ordinal()) {
                    return;
                }
                this.LIZIZ.queueInputBuffer(i, i2, i3, j, i4);
            }
        }
    }

    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0068: INVOKE (r4 I:X.0jYK), (r2 I:int), (r0 I:java.lang.String), (r3 I:java.lang.Throwable) VIRTUAL call: X.0jYK.LJIIIIZZ(int, java.lang.String, java.lang.Throwable):void A[MD:(int, java.lang.String, java.lang.Throwable):void (m)] (LINE:83886184), block:B:18:0x0038 */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x0041: INVOKE (r1v1 ?? I:java.lang.StringBuilder), (r5 I:int) VIRTUAL call: java.lang.StringBuilder.append(int):java.lang.StringBuilder A[MD:(int):java.lang.StringBuilder (c)] (LINE:83886145), block:B:18:0x0038 */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0049: INVOKE (r1v1 ?? I:java.lang.StringBuilder), (r6 I:int) VIRTUAL call: java.lang.StringBuilder.append(int):java.lang.StringBuilder A[MD:(int):java.lang.StringBuilder (c)] (LINE:83886153), block:B:18:0x0038 */
    /* JADX WARN: Not initialized variable reg: 7, insn: 0x0051: INVOKE (r1v1 ?? I:java.lang.StringBuilder), (r7 I:int) VIRTUAL call: java.lang.StringBuilder.append(int):java.lang.StringBuilder A[MD:(int):java.lang.StringBuilder (c)] (LINE:83886161), block:B:18:0x0038 */
    /* JADX WARN: Not initialized variable reg: 8, insn: 0x0061: INVOKE (r1v1 ?? I:java.lang.StringBuilder), (r8 I:int) VIRTUAL call: java.lang.StringBuilder.append(int):java.lang.StringBuilder A[MD:(int):java.lang.StringBuilder (c)] (LINE:83886177), block:B:18:0x0038 */
    /* JADX WARN: Not initialized variable reg: 9, insn: 0x0059: INVOKE (r1v1 ?? I:java.lang.StringBuilder), (r9 I:long) VIRTUAL call: java.lang.StringBuilder.append(long):java.lang.StringBuilder A[MD:(long):java.lang.StringBuilder (c)] (LINE:83886169), block:B:18:0x0038 */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0072  */
    @Override // X.InterfaceC1285250jYB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void queueInputBuffer(int r19, int r20, int r21, long r22, int r24) {
        /*
            r18 = this;
            r8 = r24
            r9 = r22
            r7 = r21
            r6 = r20
            r5 = r19
            r4 = r18
            boolean r0 = r4.LJIIL     // Catch: java.lang.Throwable -> L20
            if (r0 == 0) goto L14
            r4.LJIIL(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L20
            return
        L14:
            android.media.MediaCodec r11 = r4.LIZIZ     // Catch: java.lang.Throwable -> L20
            r12 = r5
            r13 = r6
            r14 = r7
            r15 = r9
            r17 = r8
            r11.queueInputBuffer(r12, r13, r14, r15, r17)     // Catch: java.lang.Throwable -> L20
            return
        L20:
            r3 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3)
            int r1 = X.C1283990jW9.LIZ
            r0 = 21
            if (r1 < r0) goto L72
            boolean r0 = r3 instanceof android.media.MediaCodec.CodecException
            if (r0 != 0) goto L6f
            boolean r0 = r3 instanceof java.lang.IllegalStateException
            if (r0 != 0) goto L6c
            boolean r0 = r3 instanceof android.media.MediaCodec.CryptoException
            if (r0 == 0) goto L72
            r2 = 5002(0x138a, float:7.009E-42)
        L38:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "index = "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = " offset = "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = " size = "
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " presentationTimeUs = "
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = " flags = "
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r4.LJIIIIZZ(r2, r0, r3)
            throw r3
        L6c:
            r2 = 5000(0x1388, float:7.006E-42)
            goto L38
        L6f:
            r2 = 5001(0x1389, float:7.008E-42)
            goto L38
        L72:
            r2 = 0
            goto L38
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1285340jYK.queueInputBuffer(int, int, int, long, int):void");
    }
}
