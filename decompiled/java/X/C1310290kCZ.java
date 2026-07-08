package X;

import com.lynx.base.log.LynxLog;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.LynxEnv;
import com.lynx.tasm.behavior.LynxUIRenderer;
import com.lynx.tasm.behavior.ui.UIBody;
import j27.s;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.LinkedList;

/* JADX INFO: renamed from: X.0kCZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1310290kCZ {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final String LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;
    public final boolean LJI;
    public final boolean LJII;
    public final boolean LJIIIIZZ;
    public final boolean LJIIIZ;
    public final String LJIIJ;
    public final boolean LJIIJJI;
    public final boolean LJIIL;
    public final boolean LJIILIIL;
    public final boolean LJIILJJIL;
    public final boolean LJIILL;
    public final boolean LJIILLIIL;
    public final boolean LJIIZILJ;
    public final boolean LJIJ;
    public final boolean LJIJI;
    public final boolean LJIJJ;
    public final boolean LJIJJLI;
    public final boolean LJIL;
    public final boolean LJJ;
    public final boolean LJJI;
    public final boolean LJJIFFI;
    public final boolean LJJII;
    public final boolean LJJIII;
    public final boolean LJJIIJ;
    public final boolean LJJIIJZLJL;
    public final boolean LJJIIZ;
    public final boolean LJJIIZI;
    public final boolean LJJIJ;
    public final boolean LJJIJIIJI;
    public final boolean LJJIJIIJIL;
    public final int LJJIJIL;
    public final boolean LJJIJL;
    public final int LJJIJLIJ;
    public final double LJJIL;
    public final boolean LJJIZ;
    public final boolean LJJJ;
    public final boolean LJJJI;
    public final boolean LJJJIL;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PageConfig{autoExpose=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", pageVersion='");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1310290kCZ(ReadableMap readableMap) {
        this.LIZ = true;
        this.LJFF = true;
        this.LJI = true;
        this.LJIIIIZZ = true;
        this.LJIIJ = "50px";
        this.LJIIJJI = true;
        this.LJIILJJIL = true;
        this.LJIILL = true;
        this.LJIL = true;
        this.LJJIFFI = true;
        this.LJJII = true;
        this.LJJIJIL = 20;
        this.LJJIJLIJ = -1;
        this.LJJIL = -1.0d;
        this.LJJIZ = true;
        this.LIZ = true;
        this.LIZLLL = "error";
        if (readableMap != null) {
            if (readableMap.hasKey("autoExpose")) {
                this.LIZ = readableMap.getBoolean("autoExpose");
            }
            if (readableMap.hasKey("pageVersion")) {
                this.LIZLLL = readableMap.getString("pageVersion");
            }
            if (readableMap.hasKey("enableEventThrough")) {
                this.LIZIZ = readableMap.getBoolean("enableEventThrough");
            }
            if (readableMap.hasKey("defaultOverflowVisible")) {
                this.LIZJ = readableMap.getBoolean("defaultOverflowVisible");
            }
            if (readableMap.hasKey("syncImageAttach")) {
                this.LJFF = readableMap.getBoolean("syncImageAttach");
            }
            if (readableMap.hasKey("enableCheckLocalImage")) {
                this.LJI = readableMap.getBoolean("enableCheckLocalImage");
            }
            if (readableMap.hasKey("enableAsyncRequestImage")) {
                this.LJII = readableMap.getBoolean("enableAsyncRequestImage");
            }
            if (readableMap.hasKey("useImagePostProcessor")) {
                readableMap.getBoolean("useImagePostProcessor");
            }
            if (readableMap.hasKey("enableNewImage")) {
                readableMap.getBoolean("enableNewImage");
            }
            if (readableMap.hasKey("asyncRedirect")) {
                this.LJ = readableMap.getBoolean("asyncRedirect");
            }
            if (readableMap.hasKey("pageType")) {
                readableMap.getString("pageType");
            }
            if (readableMap.hasKey("cliVersion")) {
                readableMap.getString("cliVersion");
            }
            if (readableMap.hasKey("customData")) {
                readableMap.getString("customData");
            }
            if (readableMap.hasKey("useNewSwiper")) {
                this.LJIIIIZZ = readableMap.getBoolean("useNewSwiper");
            }
            if (readableMap.hasKey("enableAsyncInitVideoEngine")) {
                this.LJIIIZ = readableMap.getBoolean("enableAsyncInitVideoEngine");
            }
            if (readableMap.hasKey("targetSdkVersion")) {
                readableMap.getString("targetSdkVersion");
            }
            if (readableMap.hasKey("enableFlattenTranslateZ")) {
                this.LJJIIJZLJL = readableMap.getBoolean("enableFlattenTranslateZ");
            }
            if (readableMap.hasKey("enableNewGesture")) {
                this.LJJIIZ = readableMap.getBoolean("enableNewGesture");
            }
            if (readableMap.hasKey("enablePlatformGesture")) {
                this.LJJIIZI = readableMap.getBoolean("enablePlatformGesture");
            }
            if (readableMap.hasKey("includeFontPadding")) {
                this.LJJI = readableMap.getBoolean("includeFontPadding");
            }
            if (readableMap.hasKey("lepusVersion")) {
                readableMap.getString("lepusVersion");
            }
            if (readableMap.hasKey("enableLepusNG")) {
                readableMap.getBoolean("enableLepusNG");
            }
            if (readableMap.hasKey("tapSlop")) {
                this.LJIIJ = readableMap.getString("tapSlop");
            }
            if (readableMap.hasKey("enableCreateViewAsync")) {
                this.LJIIJJI = readableMap.getBoolean("enableCreateViewAsync");
            }
            if (readableMap.hasKey("enableVsyncAlignedFlush")) {
                this.LJIIL = readableMap.getBoolean("enableVsyncAlignedFlush");
            }
            if (readableMap.hasKey("cssAlignWithLegacyW3c")) {
                this.LJIILIIL = readableMap.getBoolean("cssAlignWithLegacyW3c");
            }
            if (readableMap.hasKey("enableAccessibilityElement")) {
                this.LJIILJJIL = readableMap.getBoolean("enableAccessibilityElement");
            }
            if (readableMap.hasKey("enableOverlapForAccessibilityElement")) {
                this.LJIILL = readableMap.getBoolean("enableOverlapForAccessibilityElement", true);
            }
            if (readableMap.hasKey("enableNewAccessibility")) {
                this.LJIILLIIL = readableMap.getBoolean("enableNewAccessibility", false);
            }
            if (readableMap.hasKey("enableA11yIDMutationObserver")) {
                this.LJIIZILJ = readableMap.getBoolean("enableA11yIDMutationObserver", false);
            }
            if (readableMap.hasKey("enableA11y")) {
                this.LJIJ = readableMap.getBoolean("enableA11y", false);
            }
            if (readableMap.hasKey("reactVersion")) {
                readableMap.getString("reactVersion");
            }
            if (readableMap.hasKey("enableTextRefactor")) {
                this.LJIJI = readableMap.getBoolean("enableTextRefactor");
            }
            if (readableMap.hasKey("enableTextOverflow")) {
                this.LJIJJ = readableMap.getBoolean("enableTextOverflow");
            }
            if (readableMap.hasKey("enableTextBoringLayout")) {
                this.LJIJJLI = readableMap.getBoolean("enableTextBoringLayout");
            } else {
                this.LJIJJLI = LynxEnv.inst().enableTextBoringLayout();
            }
            if (readableMap.hasKey("enableNewClipMode")) {
                this.LJIL = readableMap.getBoolean("enableNewClipMode");
            }
            if (readableMap.hasKey("keyboardCallbackPassRelativeHeight")) {
                this.LJJ = readableMap.getBoolean("keyboardCallbackPassRelativeHeight");
            }
            if (readableMap.hasKey("enableCSSParser")) {
                readableMap.getBoolean("enableCSSParser");
            }
            if (readableMap.hasKey("enableEventRefactor")) {
                this.LJJIFFI = readableMap.getBoolean("enableEventRefactor");
            }
            if (readableMap.hasKey("enableDisexposureWhenLynxHidden")) {
                this.LJJII = readableMap.getBoolean("enableDisexposureWhenLynxHidden");
            }
            if (readableMap.hasKey("enableExposureWhenLayout")) {
                this.LJJIII = readableMap.getBoolean("enableExposureWhenLayout", false);
            }
            if (readableMap.hasKey("enableExposureWhenReload")) {
                this.LJJIIJ = readableMap.getBoolean("enableExposureWhenReload", false);
            }
            if (readableMap.hasKey("enableNewIntersectionObserver")) {
                this.LJJIJ = readableMap.getBoolean("enableNewIntersectionObserver");
            }
            if (readableMap.hasKey("observerFrameRate")) {
                this.LJJIJIL = readableMap.getInt("observerFrameRate");
            }
            if (readableMap.hasKey("enableExposureUIMargin")) {
                this.LJJIJL = readableMap.getBoolean("enableExposureUIMargin");
            }
            if (readableMap.hasKey("longPressDuration")) {
                this.LJJIJLIJ = readableMap.getInt("longPressDuration");
            }
            if (readableMap.hasKey("mapContainerType")) {
                readableMap.getInt("mapContainerType");
            }
            if (readableMap.hasKey("pageFlatten")) {
                readableMap.getBoolean("pageFlatten");
            }
            if (readableMap.hasKey("enableNewGesture")) {
                this.LJJIIZ = readableMap.getBoolean("enableNewGesture");
            }
            if (readableMap.hasKey("user")) {
                readableMap.getString("user");
            }
            if (readableMap.hasKey("git")) {
                readableMap.getString("git");
            }
            if (readableMap.hasKey("filePath")) {
                readableMap.getString("filePath");
            }
            if (readableMap.hasKey("enableFiber")) {
                this.LJJIJIIJI = readableMap.getBoolean("enableFiber");
            }
            if (readableMap.hasKey("enableMultiTouch")) {
                this.LJJIJIIJIL = readableMap.getBoolean("enableMultiTouch");
            }
            if (readableMap.hasKey("enableLynxScrollFluency")) {
                this.LJJIL = readableMap.getDouble("enableLynxScrollFluency");
            }
            if (readableMap.hasKey("enableTextLayoutCache")) {
                this.LJJIZ = readableMap.getBoolean("enableTextLayoutCache");
            } else {
                this.LJJIZ = LynxEnv.inst().enableTextLayoutCache();
            }
            if (readableMap.hasKey("enableTransformedTouchPosition")) {
                this.LJJJ = readableMap.getBoolean("enableTransformedTouchPosition");
            }
            if (readableMap.hasKey("enableNewSticky")) {
                this.LJJJI = readableMap.getBoolean("enableNewSticky");
            }
            if (readableMap.hasKey("enableDispatchCustomEventForUI")) {
                this.LJJJIL = readableMap.getBoolean("enableDispatchCustomEventForUI");
            }
        }
    }

    public static void LIZ(C1310290kCZ c1310290kCZ, s sVar, InterfaceC1309730kBf interfaceC1309730kBf) {
        s sVar2;
        UIBody uIBody;
        if (c1310290kCZ == null) {
            LynxLog.e("PageConfig", "PageConfig is null when exec onPageConfigDecoded from TemplateBundle.");
            return;
        }
        if (sVar != null) {
            sVar.LLLIIII = c1310290kCZ;
        } else {
            LynxLog.e("PageConfig", "lynx context free in used: LynxUI configs may be not valid from TemplateBundle.");
        }
        if (interfaceC1309730kBf != null) {
            LynxUIRenderer lynxUIRenderer = (LynxUIRenderer) interfaceC1309730kBf;
            lynxUIRenderer.LJII = true;
            s sVar3 = null;
            if (!"50px".equals(c1310290kCZ.LJIIJ)) {
                lynxUIRenderer.LJIIIIZZ = c1310290kCZ.LJIIJ;
            } else {
                WeakReference<s> weakReference = lynxUIRenderer.LIZ;
                if (weakReference != null && (sVar2 = weakReference.get()) != null) {
                    lynxUIRenderer.LJIIIIZZ = sVar2.LLLIL;
                }
            }
            lynxUIRenderer.LJIIIZ = c1310290kCZ.LJJIJIIJIL;
            lynxUIRenderer.LJIIJ = c1310290kCZ.LJJIJIIJI;
            lynxUIRenderer.LJIIL = c1310290kCZ.LJJIIZI;
            boolean z = c1310290kCZ.LJJIIZ;
            lynxUIRenderer.LJIIJJI = z;
            if (z && (!C1299180jue.LIZ.booleanValue())) {
                WeakReference<s> weakReference2 = lynxUIRenderer.LIZ;
                if (weakReference2 != null) {
                    sVar3 = weakReference2.get();
                }
                C1311720kEs c1311720kEs = lynxUIRenderer.LIZIZ;
                if (c1311720kEs.LJIILJJIL == null) {
                    c1311720kEs.LJIILJJIL = new C1311400kEM();
                }
                C1311400kEM c1311400kEM = c1311720kEs.LJIILJJIL;
                c1311400kEM.LJFF = true;
                if (c1311400kEM.LIZJ()) {
                    c1311400kEM.LJ = new C1310330kCd(c1311400kEM);
                    c1311400kEM.LIZ = new HashMap();
                    c1311400kEM.LIZIZ = new LinkedList<>();
                    c1311400kEM.LIZJ = new LinkedList<>();
                    c1311400kEM.LJII = new C1311390kEL(sVar3, c1311400kEM.LJ);
                }
            }
            C1311720kEs c1311720kEs2 = lynxUIRenderer.LIZIZ;
            if (c1311720kEs2 != null && (uIBody = c1311720kEs2.LIZIZ) != null && uIBody.LLILZIL != null) {
                C1310360kCg c1310360kCg = uIBody.LLILZIL;
                c1310360kCg.getClass();
                boolean z2 = c1310290kCZ.LJIILLIIL;
                c1310360kCg.LIZIZ = z2;
                boolean z3 = c1310290kCZ.LJIJ;
                c1310360kCg.LIZJ = z3;
                boolean z4 = c1310290kCZ.LJIILJJIL;
                c1310360kCg.LIZLLL = z4;
                boolean z5 = c1310290kCZ.LJIILL;
                c1310360kCg.LJ = z5;
                c1310360kCg.LJFF = c1310290kCZ.LJIIZILJ;
                if (c1310360kCg.LJIILJJIL) {
                    c1310360kCg.LIZLLL();
                    return;
                }
                if (!z2 && !z3 && c1310360kCg.LJIIJJI != null) {
                    C1318830kQL c1318830kQL = c1310360kCg.LJIIJJI;
                    c1318830kQL.LJII = z4;
                    c1318830kQL.LJIIIIZZ = z5;
                    return;
                }
                UIBody uIBodyLJII = c1310360kCg.LJII();
                if (uIBodyLJII == null || uIBodyLJII.LL == null || c1310360kCg.LJIIIIZZ == null) {
                    return;
                }
                if (c1310360kCg.LJIIIZ == null) {
                    c1310360kCg.LJIIIZ = new C1310300kCa(c1310360kCg.LJIIIIZZ, c1310360kCg);
                }
                if (c1310360kCg.LJIIJ == null) {
                    c1310360kCg.LJIIJ = new C1300290jwR();
                }
                if (c1310360kCg.LIZJ) {
                    c1310360kCg.LJIIIZ(uIBodyLJII, uIBodyLJII.LL);
                } else {
                    if (!c1310360kCg.LIZIZ) {
                        return;
                    }
                    c1310360kCg.LJIIIIZZ(uIBodyLJII);
                }
            }
        }
    }
}
