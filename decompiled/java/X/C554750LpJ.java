package X;

import com.ss.android.ugc.aweme.portrait.service.IAIPortraitFeatureService;
import com.ss.android.ugc.aweme.theater.service.IAITheaterFeatureService;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsBizPluginService;
import kotlin.jvm.internal.AFwS239S0000000_8;

/* JADX INFO: renamed from: X.0LpJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C554750LpJ extends AbstractRunnableC21377818lM implements InterfaceC1408530ml1 {
    @Override // X.InterfaceC1408530ml1
    public final /* synthetic */ boolean LIZ() {
        return false;
    }

    @Override // X.InterfaceC1408530ml1
    public final /* synthetic */ boolean LIZIZ() {
        return false;
    }

    public static void LJIIIZ() {
        InterfaceC558600LvW interfaceC558600LvWLIZIZ;
        if (!((Boolean) C264800AZi.LIZ.getValue()).booleanValue()) {
            C201955140j.LIZLLL(C554740LpI.LIZIZ, "CreativeToolsBizPluginPreloadTask", "run skip: CreativeToolsBizPluginPreloadOnUiShowExp disabled");
            return;
        }
        IAITheaterFeatureService.LIZ.getClass();
        IAITheaterFeatureService iAITheaterFeatureServiceLIZ = C549720LhC.LIZ();
        if (iAITheaterFeatureServiceLIZ == null || (interfaceC558600LvWLIZIZ = iAITheaterFeatureServiceLIZ.LIZIZ()) == null || !interfaceC558600LvWLIZIZ.LJIIJ()) {
            IAIPortraitFeatureService.LIZ.getClass();
            IAIPortraitFeatureService iAIPortraitFeatureServiceLIZ = C547790Le5.LIZ();
            if (iAIPortraitFeatureServiceLIZ == null || !iAIPortraitFeatureServiceLIZ.isFeatureEnabled()) {
                C201955140j.LIZLLL(C554740LpI.LIZIZ, "CreativeToolsBizPluginPreloadTask", "run skip: AI Theater not pending plugin (feature disabled or plugin already installed)");
                return;
            }
        }
        C201955140j.LIZLLL(C554740LpI.LIZIZ, "CreativeToolsBizPluginPreloadTask", "run trigger CreativeToolsBizPluginService.requestInstall");
        CreativeToolsBizPluginService.LIZ.getClass();
        CreativeToolsBizPluginService creativeToolsBizPluginServiceLIZ = C0LOV.LIZ();
        if (creativeToolsBizPluginServiceLIZ != null) {
            creativeToolsBizPluginServiceLIZ.LIZJ();
        }
    }

    @Override // X.AbstractRunnableC21377818lM, java.lang.Runnable, X.InterfaceC1408530ml1
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("CreativeToolsBizPluginPreloadTask@8fe1.run");
        try {
            LJIIIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CreativeToolsBizPluginPreloadTask@8fe1.run");
    }

    public C554750LpJ() {
        LJ(AFwS239S0000000_8.get$arr$(117));
    }

    @Override // X.InterfaceC1408530ml1
    public final EnumC194317110p LIZJ() {
        return EnumC194317110p.P2;
    }
}
