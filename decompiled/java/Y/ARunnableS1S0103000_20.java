package Y;

import X.C0UHL;
import X.C1266350j3h;
import X.C1266620j48;
import X.C1267610j5j;
import X.C1267620j5k;
import X.C1269140j8C;
import X.C1269160j8E;
import X.C1269570j8t;
import X.C1269600j8w;
import X.C1C7U;
import X.EnumC1269590j8v;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.base.log.LynxLog;
import com.lynx.tasm.core.LynxEngineProxy;
import com.ss.ttlivestreamer.core.utils.TEBundle;
import com.ss.ttlivestreamer.livestreamv2.capture.LiveStreamVideoCapture;

/* JADX INFO: loaded from: classes21.dex */
public class ARunnableS1S0103000_20 implements Runnable {
    public final int $t;
    public int i1;
    public int i2;
    public int i3;
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
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        if (((C1266350j3h) this.l0).LLJJ()) {
            C1266350j3h c1266350j3h = (C1266350j3h) this.l0;
            c1266350j3h.LLLZZIL = this.i1;
            c1266350j3h.LLZ = this.i2;
            c1266350j3h.LLZIL = this.i3;
            return;
        }
        if (!((C1266350j3h) this.l0).LLJJI()) {
            C1266350j3h c1266350j3h2 = (C1266350j3h) this.l0;
            c1266350j3h2.LLLZZIL = this.i1;
            c1266350j3h2.LLZ = this.i2;
            c1266350j3h2.LLZIL = this.i3;
            return;
        }
        C1269600j8w c1269600j8w = (C1269600j8w) C1269570j8t.LIZIZ(EnumC1269590j8v.UpdateVideoParameters, C1269570j8t.LJ);
        int i = this.i1;
        int i2 = this.i2;
        int i3 = this.i3;
        c1269600j8w.LJIILIIL = i;
        c1269600j8w.LJIILJJIL = i2;
        c1269600j8w.LJIILL = i3;
        c1269600j8w.LIZJ(C1269570j8t.LIZIZ);
        ((C1266350j3h) this.l0).LJLILLLLZI(c1269600j8w);
    }

    public final void LIZ$1() {
        if (((C1266350j3h) this.l0).LLJJ()) {
            ((C1266350j3h) this.l0).LLILZLL.LJJJJLL(this.i1, this.i2);
            ((C1266350j3h) this.l0).LLILZLL.LJLLI = this.i3;
            return;
        }
        C1266350j3h c1266350j3h = (C1266350j3h) this.l0;
        LiveStreamVideoCapture liveStreamVideoCapture = c1266350j3h.LLJJIJIL;
        int iLJJIJIIJI = this.i3;
        C1269160j8E c1269160j8E = c1266350j3h.LLILZLL;
        if (c1269160j8E != null) {
            int i = c1269160j8E.LIZ.mPushBase.capAdaptedQuirks;
            if (iLJJIJIIJI < 1) {
                iLJJIJIIJI = c1269160j8E.LJJIJIIJI();
            }
            TEBundle tEBundle = ((C1266350j3h) this.l0).LLLLLLIL;
            if (tEBundle != null) {
                tEBundle.setBool("video_adapter_enable_smooth", false);
                ((C1266350j3h) this.l0).LLLLLLIL.setBool("video_adapter_enable_drop_adapt", false);
                ((C1266350j3h) this.l0).LLLLLLIL.setBool("video_adapter_disable_drop_frame", false);
                ((C1266350j3h) this.l0).LLLLLLIL.setInt("video_adapter_ext_fps", 0);
            }
            c1269160j8E.LIZ.mPushBase.getClass();
            c1269160j8E.LIZ.mPushBase.getClass();
            c1269160j8E.LIZ.mPushBase.getClass();
            c1269160j8E.LIZ.mPushBase.getClass();
            C1266350j3h c1266350j3h2 = (C1266350j3h) this.l0;
            if (c1266350j3h2.LLLLLLIL == null) {
                c1266350j3h2.LLLLLLIL = new TEBundle();
            }
            ((C1266350j3h) this.l0).LLLLLLIL.setBool("video_adapter_enable_smooth", false);
            ((C1266350j3h) this.l0).LLLLLLIL.setBool("video_adapter_enable_drop_adapt", false);
            ((C1266350j3h) this.l0).LLLLLLIL.setBool("video_adapter_disable_drop_frame", true);
            ((C1266350j3h) this.l0).LLLLLLIL.setInt("video_adapter_ext_fps", 0);
            if (c1269160j8E.LJJIJ) {
                C1266350j3h c1266350j3h3 = (C1266350j3h) this.l0;
                if (c1266350j3h3.LLLLLLIL == null) {
                    c1266350j3h3.LLLLLLIL = new TEBundle();
                }
            }
            TEBundle tEBundle2 = ((C1266350j3h) this.l0).LLLLLLIL;
            if (tEBundle2 != null) {
                tEBundle2.setBool("video_fov_small_window_opt", c1269160j8E.LJJIJ);
                ((C1266350j3h) this.l0).LLLLLLIL.setInt("video_fov_crop_aspect_width", c1269160j8E.LJJIJIIJI);
                ((C1266350j3h) this.l0).LLLLLLIL.setInt("video_fov_crop_aspect_height", c1269160j8E.LJJIJIIJIL);
                ((C1266350j3h) this.l0).LLLLLLIL.setLong("video_fov_opt_max_piexel_size", c1269160j8E.LJJIJIL);
            }
            C1266350j3h c1266350j3h4 = (C1266350j3h) this.l0;
            TEBundle tEBundle3 = c1266350j3h4.LLLLLLIL;
            C1267620j5k c1267620j5k = c1266350j3h4.LLLZL;
            int i2 = this.i1;
            int i3 = this.i2;
            if (c1267620j5k.LIZ.LIZ != i2 || c1267620j5k.LIZ.LIZIZ != i3) {
                c1267620j5k.LIZ.LIZ = i2;
                c1267620j5k.LIZ.LIZIZ = i3;
            }
            C1266350j3h c1266350j3h5 = (C1266350j3h) this.l0;
            C1267620j5k c1267620j5k2 = c1266350j3h5.LLLZL;
            int iLJJIIZI = c1266350j3h5.LLILZLL.LJJIIZI();
            int iLJJIIJ = ((C1266350j3h) this.l0).LLILZLL.LJJIIJ();
            if (c1267620j5k2.LIZJ.LIZ != iLJJIIZI || c1267620j5k2.LIZJ.LIZIZ != iLJJIIJ) {
                c1267620j5k2.LIZJ.LIZ = iLJJIIZI;
                c1267620j5k2.LIZJ.LIZIZ = iLJJIIJ;
            }
            C1266350j3h c1266350j3h6 = (C1266350j3h) this.l0;
            C1267610j5j c1267610j5j = c1266350j3h6.LLLZLL;
            c1267610j5j.LIZ = i;
            c1267610j5j.LIZIZ = liveStreamVideoCapture;
            c1267610j5j.LIZJ = iLJJIJIIJI;
            c1267610j5j.LIZLLL = tEBundle3;
            c1266350j3h6.LLLZL.LIZ(c1266350j3h6.LLJLILLLLZIIL, c1267610j5j, true);
        }
    }

    public final void LIZ$2() {
        C0UHL c0uhl;
        int i = this.i1;
        if (i == 1) {
            C0UHL c0uhl2 = ((C1266350j3h) this.l0).LLJJIJI;
            if (c0uhl2 != null) {
                try {
                    c0uhl2.LIZLLL(i, this.i2, this.i3);
                    return;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    return;
                }
            }
            return;
        }
        if (i == 3) {
            ((C1266350j3h) this.l0).LJJLIIIIJ(38, this.i2, this.i3);
            return;
        }
        if (i == 4) {
            C0UHL c0uhl3 = ((C1266350j3h) this.l0).LLJJIJI;
            if (c0uhl3 != null) {
                try {
                    c0uhl3.LIZLLL(44, this.i2, this.i3);
                    return;
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    return;
                }
            }
            return;
        }
        if (i != 5) {
            if (i != 6 || (c0uhl = ((C1266350j3h) this.l0).LLJJIJI) == null) {
                return;
            }
            try {
                c0uhl.LIZLLL(45, this.i2, this.i3);
                return;
            } catch (Throwable th3) {
                TryCatchGuardChecker.doCheck(th3);
                return;
            }
        }
        C1269160j8E c1269160j8E = ((C1266350j3h) this.l0).LLILZLL;
        if (c1269160j8E != null) {
            int i2 = this.i2;
            int i3 = this.i3;
            C1269140j8C c1269140j8C = c1269160j8E.LJLJI;
            if (c1269140j8C.LJJJIL != 0 || c1269140j8C.LJJJJ != 0 || i2 <= 0 || i3 <= 0) {
                return;
            }
            c1269140j8C.LJJJIL = i2;
            c1269140j8C.LJJJJ = i3;
            if (c1269160j8E.LJLIIIL == 1) {
                C1266620j48 c1266620j48 = c1269160j8E.LJLIIL;
                c1266620j48.LIZJ = i2;
                c1266620j48.LIZLLL = i3;
            }
        }
    }

    public static final void run$0(ARunnableS1S0103000_20 aRunnableS1S0103000_20) {
        boolean zLIZ;
        C1C7U.LIZ("LynxEngineProxy@d809.onPseudoStatusChanged$1");
        try {
            LynxEngineProxy lynxEngineProxy = (LynxEngineProxy) aRunnableS1S0103000_20.l0;
            long j = lynxEngineProxy.LIZ;
            if (j == 0) {
                LynxLog.e("LynxEngineProxy", "OnPseudoStatusChanged failed since mNativePtr is null");
            } else {
                lynxEngineProxy.nativeOnPseudoStatusChanged(j, aRunnableS1S0103000_20.i1, aRunnableS1S0103000_20.i2, aRunnableS1S0103000_20.i3);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LynxEngineProxy@d809.onPseudoStatusChanged$1");
    }

    public static final void run$1(ARunnableS1S0103000_20 aRunnableS1S0103000_20) {
        boolean zLIZ;
        C1C7U.LIZ("LiveStream@24e7.setVideoPerformanceLevel$1");
        try {
            aRunnableS1S0103000_20.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveStream@24e7.setVideoPerformanceLevel$1");
    }

    public static final void run$2(ARunnableS1S0103000_20 aRunnableS1S0103000_20) {
        boolean zLIZ;
        C1C7U.LIZ("LiveStream@24e7.adaptedVideoResolution$1");
        try {
            aRunnableS1S0103000_20.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveStream@24e7.adaptedVideoResolution$1");
    }

    public static final void run$3(ARunnableS1S0103000_20 aRunnableS1S0103000_20) {
        boolean zLIZ;
        C1C7U.LIZ("LiveStream@24e7.onVideoCaptureInfo$1");
        try {
            aRunnableS1S0103000_20.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveStream@24e7.onVideoCaptureInfo$1");
    }

    public ARunnableS1S0103000_20(Object obj, int i, int i2, int i3, int i4) {
        this.$t = i4;
        this.l0 = obj;
        this.i1 = i;
        this.i2 = i2;
        this.i3 = i3;
    }
}
