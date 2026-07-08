package X;

import com.bytedance.ies.nle.editor_jni.INLEFilterRuntime;
import com.bytedance.ies.nle.editor_jni.NLEFilterRuntimeController;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecInt;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0oCQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1463960oCQ extends C0FRA implements INLEFilterRuntime {
    public final NLEFilterRuntimeController LIZJ() {
        C1464240oCs c1464240oCs = this.LIZ;
        if (c1464240oCs.LIZ == null || c1464240oCs.LIZLLL.get()) {
            return null;
        }
        return (NLEFilterRuntimeController) c1464240oCs.LJII.getValue();
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEFilterRuntime
    public final int doLensOneKeyDetect() {
        int iDoLensOneKeyDetect;
        synchronized (this.LIZ) {
            try {
                NLEFilterRuntimeController nLEFilterRuntimeControllerLIZJ = LIZJ();
                iDoLensOneKeyDetect = nLEFilterRuntimeControllerLIZJ != null ? nLEFilterRuntimeControllerLIZJ.doLensOneKeyDetect() : -1;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return iDoLensOneKeyDetect;
    }

    public C1463960oCQ(C1464240oCs c1464240oCs) {
        super(c1464240oCs);
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEFilterRuntime
    public final float getColorFilterIntensity(String str) {
        NLEFilterRuntimeController nLEFilterRuntimeControllerLIZJ = LIZJ();
        if (nLEFilterRuntimeControllerLIZJ != null) {
            return nLEFilterRuntimeControllerLIZJ.getColorFilterIntensity(str);
        }
        return 0.0f;
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEFilterRuntime
    public final String getAmazingFilterParam(String str, String str2) {
        String amazingFilterParam;
        NLEFilterRuntimeController nLEFilterRuntimeControllerLIZJ = LIZJ();
        if (nLEFilterRuntimeControllerLIZJ == null || (amazingFilterParam = nLEFilterRuntimeControllerLIZJ.getAmazingFilterParam(str, str2)) == null) {
            return "";
        }
        return amazingFilterParam;
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEFilterRuntime
    public final void updateMultiComposerNodesInSwing(NLETrackSlot nLETrackSlot, NLETrackSlot nLETrackSlot2) {
        NLEFilterRuntimeController nLEFilterRuntimeControllerLIZJ = LIZJ();
        if (nLEFilterRuntimeControllerLIZJ != null) {
            nLEFilterRuntimeControllerLIZJ.updateMultiComposerNodesInSwing(nLETrackSlot, nLETrackSlot2);
        }
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEFilterRuntime
    public final VecInt checkComposerNodeExclusion(String str, String str2, String str3) {
        VecInt vecIntCheckComposerNodeExclusion;
        NLEFilterRuntimeController nLEFilterRuntimeControllerLIZJ = LIZJ();
        if (nLEFilterRuntimeControllerLIZJ == null || (vecIntCheckComposerNodeExclusion = nLEFilterRuntimeControllerLIZJ.checkComposerNodeExclusion(str, str2, str3)) == null) {
            return new VecInt();
        }
        return vecIntCheckComposerNodeExclusion;
    }
}
