package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.portrait.service.IAIPortraitFeatureService;
import com.ss.android.ugc.aweme.theater.service.IAITheaterFeatureService;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService;

/* JADX INFO: renamed from: X.0KzB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C535390KzB {
    public static final C535390KzB LIZ = new C535390KzB();

    public static final boolean LIZ() {
        Object c098200Yq;
        InterfaceC558600LvW interfaceC558600LvWLIZIZ;
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "ai_self_enable", true, false)) {
            LIZ.getClass();
            try {
                c098200Yq = Class.forName("com.ss.android.ugc.aweme.aime.services.AIMEServicesImpl");
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (!C189200o6.m7isFailureimpl(c098200Yq) && c098200Yq != null) {
                IAITheaterFeatureService.LIZ.getClass();
                IAITheaterFeatureService iAITheaterFeatureServiceLIZ = C549720LhC.LIZ();
                if (iAITheaterFeatureServiceLIZ == null || (interfaceC558600LvWLIZIZ = iAITheaterFeatureServiceLIZ.LIZIZ()) == null || !interfaceC558600LvWLIZIZ.isFeatureEnabled()) {
                    IAIPortraitFeatureService.LIZ.getClass();
                    IAIPortraitFeatureService iAIPortraitFeatureServiceLIZ = C547790Le5.LIZ();
                    if (iAIPortraitFeatureServiceLIZ == null || !iAIPortraitFeatureServiceLIZ.isFeatureEnabled()) {
                        if (C0C64.LJIILLIIL().LJIJ(31744, 1, "fix_aiself_crash_ve_plugin", true) != 1) {
                            return true;
                        }
                        CreativeToolsPluginService creativeToolsPluginServiceLIZ = C535670Kzd.LIZ();
                        C844470XAv.LIZ.getClass();
                        if (creativeToolsPluginServiceLIZ.LJI(C844470XAv.LIZ())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}
