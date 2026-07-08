package Y;

import X.AbstractC2254741DMy;
import X.C1C7U;
import X.C2253401DHu;
import X.C2254151DKr;
import X.C2273581Dyu;
import X.C2273601Dyw;
import X.C2273641Dz0;
import X.C786410Ut5;
import X.InterfaceC2183551Acz;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.live.render.engine.alphaplayer.player.TTMultiplePlayerImpl;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;

/* JADX INFO: loaded from: classes36.dex */
public class ARunnableS46S0101000_35 implements Runnable {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
            case 5:
                run$5(this);
                break;
            case 6:
                run$6(this);
                break;
            case 7:
                run$7(this);
                break;
            case 8:
                run$8(this);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                run$9(this);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                run$10(this);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                run$11(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x01f1, code lost:
    
        r1 = X.C2188811AlT.LIZ();
        r1.append("decodeVideo, Output EOS for decoder ");
        r1.append(r5);
        X.C20441214yg.LJIIIZ("TTMultiplePlayerImplV2_gift_video_engine", X.C2188811AlT.LIZIZ(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0206, code lost:
    
        if (r5 != r6.LIZLLL) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0208, code lost:
    
        r6.LJ();
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0095 A[Catch: Exception -> 0x020e, all -> 0x024b, TryCatch #0 {Exception -> 0x020e, blocks: (B:8:0x0022, B:9:0x002a, B:11:0x0032, B:15:0x0040, B:17:0x0046, B:19:0x004c, B:21:0x0052, B:24:0x008f, B:26:0x0095, B:30:0x00a2, B:32:0x00aa, B:34:0x00ae, B:36:0x00b2, B:38:0x00bc, B:39:0x00bf, B:40:0x00e7, B:61:0x01f1, B:63:0x0208, B:43:0x00ff, B:45:0x010a, B:46:0x010f, B:48:0x011e, B:22:0x007a), top: B:76:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0178  */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ$0() {
        /*
            Method dump skipped, instruction units count: 637
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS46S0101000_35.LIZ$0():void");
    }

    public final void LIZ$1() {
        try {
            if (((C2273601Dyw) this.l0).LJIIIZ && this.i1 == ((C2273601Dyw) this.l0).LJIIJ) {
                C2273601Dyw c2273601Dyw = (C2273601Dyw) this.l0;
                c2273601Dyw.LJIIIIZZ = true;
                c2273601Dyw.LJFF = C2273581Dyu.LIZ(c2273601Dyw.LIZJ);
                C2273601Dyw c2273601Dyw2 = (C2273601Dyw) this.l0;
                BPEAHandler bPEAHandler = c2273601Dyw2.LJ;
                ARunnableS46S0101000_35 aRunnableS46S0101000_35 = c2273601Dyw2.LJIIJJI;
                if (bPEAHandler == null || aRunnableS46S0101000_35 == null) {
                    return;
                }
                bPEAHandler.removeCallbacks(aRunnableS46S0101000_35);
                C786410Ut5.LJLIIL(((C2273601Dyw) this.l0).LIZ.backgroundWindowMs, bPEAHandler, aRunnableS46S0101000_35);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public final void LIZ$2() {
        try {
            if (((C2273601Dyw) this.l0).LJIIIZ && this.i1 == ((C2273601Dyw) this.l0).LJIIJ) {
                C2273601Dyw c2273601Dyw = (C2273601Dyw) this.l0;
                BPEAHandler bPEAHandler = c2273601Dyw.LJ;
                ARunnableS46S0101000_35 aRunnableS46S0101000_35 = c2273601Dyw.LJIIJJI;
                if (bPEAHandler != null && aRunnableS46S0101000_35 != null) {
                    bPEAHandler.removeCallbacks(aRunnableS46S0101000_35);
                }
                C2273601Dyw c2273601Dyw2 = (C2273601Dyw) this.l0;
                if (c2273601Dyw2.LJIIIIZZ) {
                    c2273601Dyw2.LIZ();
                }
                C2273601Dyw c2273601Dyw3 = (C2273601Dyw) this.l0;
                c2273601Dyw3.LJIIIIZZ = false;
                c2273601Dyw3.LJFF = null;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static final void run$0(ARunnableS46S0101000_35 aRunnableS46S0101000_35) {
        boolean zLIZ;
        C1C7U.LIZ("TTMultiplePlayerImplV2@1a58.startDecoder$1");
        try {
            aRunnableS46S0101000_35.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TTMultiplePlayerImplV2@1a58.startDecoder$1");
    }

    public static final void run$1(ARunnableS46S0101000_35 aRunnableS46S0101000_35) {
        C2253401DHu.fd((C2253401DHu) aRunnableS46S0101000_35.l0, aRunnableS46S0101000_35.i1);
    }

    public static final void run$10(ARunnableS46S0101000_35 aRunnableS46S0101000_35) {
        TTMultiplePlayerImpl tTMultiplePlayerImpl = (TTMultiplePlayerImpl) aRunnableS46S0101000_35.l0;
        int i = aRunnableS46S0101000_35.i1;
        tTMultiplePlayerImpl.getClass();
        C1C7U.LIZ("TTMultiplePlayerImpl@7584.handleSwitchDecoder$1L");
        tTMultiplePlayerImpl.LJIIIZ(i, true);
        C1C7U.LIZIZ("TTMultiplePlayerImpl@7584.handleSwitchDecoder$1L");
    }

    public static final void run$11(ARunnableS46S0101000_35 aRunnableS46S0101000_35) {
        boolean zLIZ;
        C1C7U.LIZ("TECameraModeBase@80c5.triggerUpdateCaptureRequest$1");
        try {
            AbstractC2254741DMy abstractC2254741DMy = (AbstractC2254741DMy) aRunnableS46S0101000_35.l0;
            abstractC2254741DMy.LJFF.LIZJ(abstractC2254741DMy.LJIIIZ, abstractC2254741DMy.LJII.LLILLJJLI, aRunnableS46S0101000_35.i1, "updateCapture : something wrong.");
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TECameraModeBase@80c5.triggerUpdateCaptureRequest$1");
    }

    public static final void run$2(ARunnableS46S0101000_35 aRunnableS46S0101000_35) {
        ((InterfaceC2183551Acz) aRunnableS46S0101000_35.l0).onDone(aRunnableS46S0101000_35.i1);
    }

    public static final void run$3(ARunnableS46S0101000_35 aRunnableS46S0101000_35) {
        boolean zLIZ;
        C1C7U.LIZ("MainThreadNativeInitCallback@7536.onNativeInitCallBack$1");
        try {
            ((C2254151DKr) aRunnableS46S0101000_35.l0).LIZIZ.LIZ(aRunnableS46S0101000_35.i1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MainThreadNativeInitCallback@7536.onNativeInitCallBack$1");
    }

    public static final void run$4(ARunnableS46S0101000_35 aRunnableS46S0101000_35) {
        BPEAHandler bPEAHandler;
        ARunnableS46S0101000_35 aRunnableS46S0101000_352;
        C2273601Dyw c2273601Dyw = (C2273601Dyw) aRunnableS46S0101000_35.l0;
        int i = aRunnableS46S0101000_35.i1;
        c2273601Dyw.getClass();
        C1C7U.LIZ("BackgroundWindowSampler@cbfb.start$1L");
        if (c2273601Dyw.LJIIIZ && i == c2273601Dyw.LJIIJ && c2273601Dyw.LJIIIIZZ) {
            try {
                c2273601Dyw.LIZ();
                bPEAHandler = c2273601Dyw.LJ;
                aRunnableS46S0101000_352 = c2273601Dyw.LJIIJJI;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                bPEAHandler = c2273601Dyw.LJ;
                aRunnableS46S0101000_352 = c2273601Dyw.LJIIJJI;
                if (c2273601Dyw.LJIIIZ && i == c2273601Dyw.LJIIJ && c2273601Dyw.LJIIIIZZ && bPEAHandler != null && aRunnableS46S0101000_352 != null) {
                }
            }
            if (c2273601Dyw.LJIIIZ && i == c2273601Dyw.LJIIJ && c2273601Dyw.LJIIIIZZ && bPEAHandler != null && aRunnableS46S0101000_352 != null) {
                C786410Ut5.LJLIIL(c2273601Dyw.LIZ.backgroundWindowMs, bPEAHandler, aRunnableS46S0101000_352);
            }
        }
        C1C7U.LIZIZ("BackgroundWindowSampler@cbfb.start$1L");
    }

    public static final void run$5(ARunnableS46S0101000_35 aRunnableS46S0101000_35) {
        boolean zLIZ;
        C1C7U.LIZ("BackgroundWindowSampler@cbfb.onBackground$1");
        try {
            aRunnableS46S0101000_35.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("BackgroundWindowSampler@cbfb.onBackground$1");
    }

    public static final void run$6(ARunnableS46S0101000_35 aRunnableS46S0101000_35) {
        boolean zLIZ;
        C1C7U.LIZ("BackgroundWindowSampler@cbfb.onForeground$1");
        try {
            aRunnableS46S0101000_35.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("BackgroundWindowSampler@cbfb.onForeground$1");
    }

    public static final void run$7(ARunnableS46S0101000_35 aRunnableS46S0101000_35) {
        C2273641Dz0 c2273641Dz0 = (C2273641Dz0) aRunnableS46S0101000_35.l0;
        int i = aRunnableS46S0101000_35.i1;
        c2273641Dz0.getClass();
        C1C7U.LIZ("GlobalWindowSampler@301c.start$1L");
        c2273641Dz0.LIZ(i);
        C1C7U.LIZIZ("GlobalWindowSampler@301c.start$1L");
    }

    public static final void run$8(ARunnableS46S0101000_35 aRunnableS46S0101000_35) {
        C2273641Dz0 c2273641Dz0 = (C2273641Dz0) aRunnableS46S0101000_35.l0;
        int i = aRunnableS46S0101000_35.i1;
        c2273641Dz0.getClass();
        C1C7U.LIZ("GlobalWindowSampler@301c.onTick$3L");
        c2273641Dz0.LIZ(i);
        C1C7U.LIZIZ("GlobalWindowSampler@301c.onTick$3L");
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x019a, code lost:
    
        r1 = X.C2188811AlT.LIZ();
        r1.append("decodeVideo, Output EOS for decoder ");
        r1.append(r6);
        X.C20441214yg.LIZIZ("TTMultiplePlayerImpl", X.C2188811AlT.LIZIZ(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x01af, code lost:
    
        if (r6 != r7.LJIIJJI) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x01b1, code lost:
    
        r7.LIZLLL();
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0097 A[Catch: Exception -> 0x01b7, all -> 0x01e3, TryCatch #0 {all -> 0x01e3, blocks: (B:6:0x0026, B:7:0x002e, B:9:0x0036, B:13:0x0042, B:15:0x0048, B:17:0x004e, B:19:0x0054, B:22:0x0091, B:24:0x0097, B:28:0x00a6, B:30:0x00ae, B:32:0x00b2, B:52:0x019a, B:54:0x01b1, B:35:0x00de, B:37:0x00e6, B:38:0x00eb, B:40:0x00fc, B:42:0x0109, B:43:0x0144, B:44:0x0147, B:58:0x01b8, B:47:0x0155, B:50:0x017f, B:20:0x007c), top: B:67:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0152  */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void run$9(Y.ARunnableS46S0101000_35 r28) {
        /*
            Method dump skipped, instruction units count: 566
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS46S0101000_35.run$9(Y.ARunnableS46S0101000_35):void");
    }

    public ARunnableS46S0101000_35(C2273601Dyw c2273601Dyw, int i, int i2) {
        this.$t = i2;
        if (4 - i2 != 0) {
            this.l0 = c2273601Dyw;
            this.i1 = i;
        } else {
            this.l0 = c2273601Dyw;
            this.i1 = i;
        }
    }

    public ARunnableS46S0101000_35(Object obj, int i, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.i1 = i;
    }
}
