package X;

import com.ss.android.ugc.aweme.aigc.quality.mob.definitions.AIGC;
import com.ss.android.ugc.aweme.theater.service.IAITheaterFeatureService;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsBizPluginService;

/* JADX INFO: renamed from: X.0LhG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C549760LhG {
    public static final void LIZ(IAITheaterFeatureService iAITheaterFeatureService, AIGC.AICreationSceneName aICreationSceneName) {
        InterfaceC558600LvW interfaceC558600LvWLIZIZ = iAITheaterFeatureService.LIZIZ();
        if (interfaceC558600LvWLIZIZ != null && interfaceC558600LvWLIZIZ.LJIIJ()) {
            CreativeToolsBizPluginService.LIZ.getClass();
            CreativeToolsBizPluginService creativeToolsBizPluginServiceLIZ = C0LOV.LIZ();
            if (creativeToolsBizPluginServiceLIZ != null) {
                creativeToolsBizPluginServiceLIZ.LIZLLL(C546540Lc4.LIZ(aICreationSceneName.getValue()), false);
            }
        }
    }
}
