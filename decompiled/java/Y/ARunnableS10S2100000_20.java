package Y;

import X.C1168400gVi;
import X.C1272090jCx;
import X.C1272260jDE;
import X.C1274810jHL;
import X.C1274830jHN;
import X.C1274890jHT;
import X.C1288370jdD;
import X.C1301310jy5;
import X.C1301320jy6;
import X.C1301430jyH;
import X.C1303600k1m;
import X.C1309800kBm;
import X.C1321510kUf;
import X.C1321520kUg;
import X.C1C7U;
import X.C2188811AlT;
import X.InterfaceC1316380kMO;
import X.RunnableC1315870kLZ;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.base.log.LynxLog;
import com.lynx.tasm.LynxError;
import com.ss.bytertc.engine.type.MessageConfig;
import com.ss.ttlivestreamer.core.effect.EffectWrapper;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.tts.oecverify.BdTuring;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public class ARunnableS10S2100000_20 implements Runnable {
    public final int $t;
    public Object l2;
    public String s0;
    public String s1;

    public final void LIZ$3() {
        AVLog.debugTrace(this.s0, this.s1);
        C1274830jHN c1274830jHN = ((C1274810jHL) this.l2).LJIIIIZZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("");
        sbLIZ.append(this);
        sbLIZ.append(", interactId ");
        sbLIZ.append(this.s0);
        sbLIZ.append(", message ");
        sbLIZ.append(this.s1);
        c1274830jHN.LJIIIIZZ("sendUserMessage", C2188811AlT.LIZIZ(sbLIZ));
        C1274890jHT c1274890jHT = ((C1274810jHL) this.l2).LJI;
        if (c1274890jHT != null) {
            c1274890jHT.sendUserMessage(this.s0, this.s1, MessageConfig.UNRELIABLE_ORDERED);
        }
    }

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
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Load resource start decode the data url, the url: ");
            sbLIZ.append(this.s0);
            C1288370jdD.LIZJ("KryptonCanvasLoaderService", C2188811AlT.LIZIZ(sbLIZ));
            byte[] bArrLIZJ = C1301430jyH.LIZJ(this.s1);
            if (bArrLIZJ != null) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Load resource with data url success, the url: ");
                sbLIZ2.append(this.s0);
                C1288370jdD.LIZJ("KryptonCanvasLoaderService", C2188811AlT.LIZIZ(sbLIZ2));
                ((C1301310jy5) this.l2).LIZIZ(bArrLIZJ);
                return;
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("Load resource with data url failed, the url: ");
            sbLIZ3.append(this.s0);
            C1288370jdD.LIZIZ("KryptonCanvasLoaderService", C2188811AlT.LIZIZ(sbLIZ3));
            C1301310jy5 c1301310jy5 = (C1301310jy5) this.l2;
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("Decoder return null data with url: ");
            sbLIZ4.append(this.s0);
            c1301310jy5.LIZ(C2188811AlT.LIZIZ(sbLIZ4));
        } catch (IllegalArgumentException e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("Load resource with data url with exception, the url: ");
            sbLIZ5.append(this.s0);
            C1288370jdD.LIZIZ("KryptonCanvasLoaderService", C2188811AlT.LIZIZ(sbLIZ5));
            ((C1301310jy5) this.l2).LIZ(e.toString());
        }
    }

    public final void LIZ$1() {
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Load resource start decode the data url, the url: ");
            sbLIZ.append(this.s0);
            C1288370jdD.LIZJ("LynxKryptonLoaderServiceImpl", C2188811AlT.LIZIZ(sbLIZ));
            byte[] bArrLIZJ = C1301430jyH.LIZJ(this.s1);
            if (bArrLIZJ != null) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Load resource with data url success, the url: ");
                sbLIZ2.append(this.s0);
                C1288370jdD.LIZJ("LynxKryptonLoaderServiceImpl", C2188811AlT.LIZIZ(sbLIZ2));
                ((C1301320jy6) this.l2).LIZIZ(bArrLIZJ);
                return;
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("Load resource with data url failed, the url: ");
            sbLIZ3.append(this.s0);
            C1288370jdD.LIZIZ("LynxKryptonLoaderServiceImpl", C2188811AlT.LIZIZ(sbLIZ3));
            C1301320jy6 c1301320jy6 = (C1301320jy6) this.l2;
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("Decoder return null data with url: ");
            sbLIZ4.append(this.s0);
            c1301320jy6.LIZ(C2188811AlT.LIZIZ(sbLIZ4));
        } catch (IllegalArgumentException e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("Load resource with data url with exception, the url: ");
            sbLIZ5.append(this.s0);
            C1288370jdD.LIZIZ("LynxKryptonLoaderServiceImpl", C2188811AlT.LIZIZ(sbLIZ5));
            ((C1301320jy6) this.l2).LIZ(e.toString());
        }
    }

    public final void LIZ$2() {
        RunnableC1315870kLZ runnableC1315870kLZ = (RunnableC1315870kLZ) this.l2;
        if (runnableC1315870kLZ.LLILLL) {
            if (TextUtils.equals(runnableC1315870kLZ.LL, runnableC1315870kLZ.LLILZLL.LJIJJLI)) {
                ((RunnableC1315870kLZ) this.l2).LLILZLL.LJJI(this.s0);
            } else {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("image redirect check failed curUrl = ");
                sbLIZ.append(((RunnableC1315870kLZ) this.l2).LLILZLL.LJIJJLI);
                sbLIZ.append(" preUrl = ");
                sbLIZ.append(((RunnableC1315870kLZ) this.l2).LL);
                LynxLog.w("Lynx-Image", C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        RunnableC1315870kLZ runnableC1315870kLZ2 = (RunnableC1315870kLZ) this.l2;
        if (runnableC1315870kLZ2.LLILZIL) {
            runnableC1315870kLZ2.LLILZLL.LJIJJLI(this.s1);
        }
        InterfaceC1316380kMO interfaceC1316380kMO = ((RunnableC1315870kLZ) this.l2).LLILZLL.LJJIFFI;
        if (interfaceC1316380kMO != null) {
            interfaceC1316380kMO.LIZ();
        }
    }

    public static final void run$0(ARunnableS10S2100000_20 aRunnableS10S2100000_20) {
        boolean zLIZ;
        C1C7U.LIZ("CanvasLoaderService@ea14.loadResWithDataUrl$1");
        try {
            aRunnableS10S2100000_20.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CanvasLoaderService@ea14.loadResWithDataUrl$1");
    }

    public static final void run$1(ARunnableS10S2100000_20 aRunnableS10S2100000_20) {
        boolean zLIZ;
        C1C7U.LIZ("LynxKryptonLoaderServiceImpl@6a62.loadResWithDataUrl$1");
        try {
            aRunnableS10S2100000_20.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LynxKryptonLoaderServiceImpl@6a62.loadResWithDataUrl$1");
    }

    public static final void run$2(ARunnableS10S2100000_20 aRunnableS10S2100000_20) {
        boolean zLIZ;
        C1C7U.LIZ("MynaLottieElementViewManager@499.applySourceWithResolver$handled$1$3");
        try {
            C1168400gVi.LIZJ(new C1321520kUg(aRunnableS10S2100000_20.s1, aRunnableS10S2100000_20.s0));
            ((C1321510kUf) aRunnableS10S2100000_20.l2).getView().setSource(aRunnableS10S2100000_20.s0);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MynaLottieElementViewManager@499.applySourceWithResolver$handled$1$3");
    }

    public static final void run$3(ARunnableS10S2100000_20 aRunnableS10S2100000_20) {
        boolean zLIZ;
        C1C7U.LIZ("LynxTemplateRender$InnerLoadedCallback@57df.onFailed$1");
        try {
            LynxError lynxError = new LynxError(10203, "Error occurred while fetching app bundle resource");
            lynxError.LJIIIIZZ(aRunnableS10S2100000_20.s0);
            lynxError.LJII(aRunnableS10S2100000_20.s1);
            ((C1309800kBm) aRunnableS10S2100000_20.l2).LJFF.onErrorOccurred(lynxError);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LynxTemplateRender$InnerLoadedCallback@57df.onFailed$1");
    }

    public static final void run$4(ARunnableS10S2100000_20 aRunnableS10S2100000_20) {
        boolean zLIZ;
        C1C7U.LIZ("LynxTemplateRender$InnerSSRLoadedCallback@f367.onFailed$1");
        try {
            LynxError lynxError = new LynxError(10203, "Error occurred while fetching app bundle resource");
            lynxError.LJIIIIZZ(aRunnableS10S2100000_20.s0);
            lynxError.LJII(aRunnableS10S2100000_20.s1);
            ((C1303600k1m) aRunnableS10S2100000_20.l2).LIZJ.onErrorOccurred(lynxError);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LynxTemplateRender$InnerSSRLoadedCallback@f367.onFailed$1");
    }

    public static final void run$5(ARunnableS10S2100000_20 aRunnableS10S2100000_20) {
        boolean zLIZ;
        C1C7U.LIZ("ImageDelegate@8dd.setRedirectImageSource$1$1");
        try {
            aRunnableS10S2100000_20.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ImageDelegate@8dd.setRedirectImageSource$1$1");
    }

    public static final void run$6(ARunnableS10S2100000_20 aRunnableS10S2100000_20) {
        boolean zLIZ;
        C1C7U.LIZ("FilterManager@d45d.setRenderCacheStringAsync$1");
        try {
            if (((C1272090jCx) aRunnableS10S2100000_20.l2).isValid()) {
                ((C1272090jCx) aRunnableS10S2100000_20.l2).LLJJIJIIJIL.setRenderCacheString(aRunnableS10S2100000_20.s0, aRunnableS10S2100000_20.s1);
                ((C1272090jCx) aRunnableS10S2100000_20.l2).LLJJJJJIL(aRunnableS10S2100000_20.s1);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FilterManager@d45d.setRenderCacheStringAsync$1");
    }

    public static final void run$7(ARunnableS10S2100000_20 aRunnableS10S2100000_20) {
        EffectWrapper effectWrapper;
        C1272260jDE c1272260jDE = (C1272260jDE) aRunnableS10S2100000_20.l2;
        String str = aRunnableS10S2100000_20.s0;
        String str2 = aRunnableS10S2100000_20.s1;
        C1C7U.LIZ("EffectManager@a3e3.setRenderCacheStringAsync$1L");
        if (c1272260jDE.isValid()) {
            if (Intrinsics.LJFF("bone_file_path", str) && (effectWrapper = c1272260jDE.LLIZLLLIL) != null) {
                effectWrapper.addAmazingAllowedPath(str2);
            }
            EffectWrapper effectWrapper2 = c1272260jDE.LLIZLLLIL;
            if (effectWrapper2 != null) {
                effectWrapper2.setRenderCacheString(str, str2);
            }
            c1272260jDE.LIZIZ(str2);
        }
        C1C7U.LIZIZ("EffectManager@a3e3.setRenderCacheStringAsync$1L");
    }

    public static final void run$8(ARunnableS10S2100000_20 aRunnableS10S2100000_20) {
        EffectWrapper effectWrapper;
        C1272260jDE c1272260jDE = (C1272260jDE) aRunnableS10S2100000_20.l2;
        String str = aRunnableS10S2100000_20.s0;
        String str2 = aRunnableS10S2100000_20.s1;
        C1C7U.LIZ("EffectManager@a3e3.setCustomEffect$1L");
        if (c1272260jDE.isValid() && (effectWrapper = c1272260jDE.LLIZLLLIL) != null) {
            effectWrapper.setCustomEffect(str, str2);
        }
        C1C7U.LIZIZ("EffectManager@a3e3.setCustomEffect$1L");
    }

    public static final void run$9(ARunnableS10S2100000_20 aRunnableS10S2100000_20) {
        boolean zLIZ;
        C1C7U.LIZ("ClientImpl@5fd5.sendUserMessage$1");
        try {
            aRunnableS10S2100000_20.LIZ$3();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ClientImpl@5fd5.sendUserMessage$1");
    }

    public ARunnableS10S2100000_20(Object obj, String str, String str2, int i) {
        this.$t = i;
        this.s0 = str;
        this.s1 = str2;
        this.l2 = obj;
    }
}
