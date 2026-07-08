package X;

import com.bytedance.lynx.hybrid.param.HybridSchemaParam;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0q7q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1538000q7q {
    public static final void LIZ(C1537910q7h c1537910q7h, HybridSchemaParam hybridSchemaParam) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        String group;
        String preloadFonts = hybridSchemaParam.getPreloadFonts();
        if (preloadFonts != null && preloadFonts.length() != 0) {
            c1537910q7h.LJJI(hybridSchemaParam.getPreloadFonts());
        }
        if (hybridSchemaParam.getLynxviewWidth() != null) {
            c1537910q7h.LJIILL = hybridSchemaParam.getLynxviewWidth();
        }
        if (hybridSchemaParam.getLynxviewHeight() != null) {
            c1537910q7h.LJIILLIIL = hybridSchemaParam.getLynxviewHeight();
        }
        if (hybridSchemaParam.getPresetWidth() != -1) {
            c1537910q7h.LJIJ = Integer.valueOf(hybridSchemaParam.getPresetWidth());
        }
        if (hybridSchemaParam.getPresetHeight() != -1) {
            c1537910q7h.LJIIZILJ = Integer.valueOf(hybridSchemaParam.getPresetHeight());
        }
        c1537910q7h.LJJIIJZLJL = hybridSchemaParam.getLandscapeScreenSizeAsPortrait();
        c1537910q7h.LJJIIZI = hybridSchemaParam.getEnablePendingJsTask();
        c1537910q7h.LJJIJ = hybridSchemaParam.getEnableJSRuntime();
        c1537910q7h.LJJIJIIJI = hybridSchemaParam.getEnableAirStrictMode();
        if (hybridSchemaParam.getEnableCodeCache() == 1) {
            z = true;
        } else {
            z = false;
        }
        c1537910q7h.LJJIJIL = z;
        if (hybridSchemaParam.getEnablePreCodeCache() == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        c1537910q7h.LJJIJL = z2;
        if (hybridSchemaParam.getEnablePreDecode() == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        c1537910q7h.LJJIJLIJ = z3;
        if (hybridSchemaParam.getEnableExtraInfo() == 1) {
            z4 = true;
        } else {
            z4 = false;
        }
        c1537910q7h.LJJIZ = z4;
        c1537910q7h.LJJIIZ = hybridSchemaParam.getNeedSetScreenSize();
        hybridSchemaParam.getEnableAutoConcurrency();
        Integer numValueOf = Integer.valueOf(hybridSchemaParam.getThreadStrategy());
        if (numValueOf.intValue() != 0) {
            int iIntValue = numValueOf.intValue();
            C649560Pdq c649560Pdq = new C649560Pdq();
            c649560Pdq.LIZIZ = Integer.valueOf(iIntValue);
            c649560Pdq.LIZ = Boolean.valueOf(hybridSchemaParam.getPresetSafePoint());
            c1537910q7h.LJIJJ(c649560Pdq);
        }
        hybridSchemaParam.getGroup();
        if (!Intrinsics.LJFF(hybridSchemaParam.getGroup(), "default_lynx_group") || (group = c1537910q7h.LJIILJJIL) == null) {
            group = hybridSchemaParam.getGroup();
        }
        boolean shareGroup = hybridSchemaParam.getShareGroup();
        boolean enableCanvas = hybridSchemaParam.getEnableCanvas();
        boolean enableDynamicV8 = hybridSchemaParam.getEnableDynamicV8();
        Boolean enableCanvasOptimization = hybridSchemaParam.getEnableCanvasOptimization();
        boolean enableStorageGroup = hybridSchemaParam.getEnableStorageGroup();
        boolean enableJsGroupThread = hybridSchemaParam.getEnableJsGroupThread();
        boolean forceSingleGroup = hybridSchemaParam.getForceSingleGroup();
        c1537910q7h.LJIILJJIL = group;
        C1299370jux.LIZ.getClass();
        c1537910q7h.LJIILIIL = C1299370jux.LIZIZ(enableCanvasOptimization, group, shareGroup, enableCanvas, enableDynamicV8, enableStorageGroup, enableJsGroupThread, forceSingleGroup);
        c1537910q7h.LJJIIJ = hybridSchemaParam;
    }
}
