package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.offline.tools.debug.gp.IToolsDebugGpService;
import com.ss.android.ugc.gamora.editor.mixediting.resource.feature.cache.AlgorithmResult;
import java.util.List;
import kotlin.jvm.internal.AFwS189S0000000_3;

/* JADX INFO: renamed from: X.08wF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2278108wF {
    public static final C2278108wF LIZ = new C2278108wF();
    public static final C2278408wI LIZIZ = new C2278408wI();
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1319));

    public static void LIZ(int i, String str, String str2, List list) {
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "studio_bach_result_cache_max_count", true) * 1024 * 1024 > 0 && str.length() != 0) {
            ((IToolsDebugGpService) ServiceManager.get().getService(IToolsDebugGpService.class)).isOpen();
            C2278708wL c2278708wL = (C2278708wL) LIZJ.getValue();
            AlgorithmResult algorithmResult = new AlgorithmResult(list, i, null, 4, null);
            if (c2278708wL.LIZIZ != null) {
                C1227904rF.LIZ.getClass();
                String strLJI = C1227904rF.LJI(algorithmResult);
                if (strLJI != null) {
                    C13SF c13sf = c2278708wL.LIZIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(str);
                    sbLIZ.append('_');
                    sbLIZ.append(str2);
                    c13sf.LJIIJ(C2188811AlT.LIZIZ(sbLIZ), strLJI, "");
                    return;
                }
                return;
            }
            return;
        }
        C201955140j.LJIIIIZZ(C0MJ8.LIZIZ, "MIX_EDITING_FEATURE_EXTRACTION", "updateFeatureExtractionCache; mediaId is empty");
    }
}
