package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.ss.android.ugc.aweme.aigc.quality.mob.business.AIGCEntranceInfo;
import com.ss.android.ugc.aweme.aigc.quality.mob.definitions.AIGC;
import com.ss.android.ugc.aweme.theater.service.IAITheaterCreationLauncher;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsBizPluginService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0LhA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C549700LhA implements IAITheaterCreationLauncher {
    public static final C549700LhA LIZ = new C549700LhA();

    @Override // com.ss.android.ugc.aweme.theater.service.IAITheaterCreationLauncher
    public final C19A3 LIZJ() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.theater.service.IAITheaterCreationLauncher
    public final Class<? extends C19A3> LIZLLL() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.theater.service.IAITheaterCreationLauncher
    public final void LJ(IAITheaterCreationLauncher.EnterParams enterParams, Context context) {
    }

    @Override // com.ss.android.ugc.aweme.theater.service.IAITheaterCreationLauncher
    public final boolean LJI() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.theater.service.IAITheaterCreationLauncher
    public final Class<? extends C19A3> generationRootSceneClass() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.theater.service.IAITheaterCreationLauncher
    public final C19A3 generationRootSceneInstance() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.theater.service.IAITheaterCreationLauncher
    public final boolean LIZIZ(Activity activity, Bundle bundle) {
        C537540L6i.LIZ.LIZ("AITheaterPluginNotInstalledLauncher", "handleCreationRoute blocked: plugin not installed");
        CreativeToolsBizPluginService.LIZ.getClass();
        CreativeToolsBizPluginService creativeToolsBizPluginServiceLIZ = C0LOV.LIZ();
        if (creativeToolsBizPluginServiceLIZ != null) {
            creativeToolsBizPluginServiceLIZ.LIZIZ(activity, C546540Lc4.LIZ(AIGC.AICreationSceneName.AI_THEATER_DEEPLINK.INSTANCE.getValue()), true);
        }
        return true;
    }

    public static void LJII(IAITheaterCreationLauncher.EnterParams enterParams, Context context, String str) {
        boolean z;
        AIGC aigc;
        Activity activityLIZIZ = C737910Sx3.LIZIZ(context);
        C547140Ld2 c547140Ld2 = C537540L6i.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(" blocked: plugin not installed, hasActivity=");
        if (activityLIZIZ != null) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        c547140Ld2.LIZ("AITheaterPluginNotInstalledLauncher", C2188811AlT.LIZIZ(sbLIZ));
        AIGCEntranceInfo aIGCEntranceInfo = enterParams.entranceInfo;
        if (aIGCEntranceInfo == null || (aigc = aIGCEntranceInfo.sceneName) == null) {
            aigc = AIGC.AICreationSceneName.NO_NEED.INSTANCE;
        }
        String value = aigc.getValue();
        CreativeToolsBizPluginService.LIZ.getClass();
        CreativeToolsBizPluginService creativeToolsBizPluginServiceLIZ = C0LOV.LIZ();
        if (creativeToolsBizPluginServiceLIZ != null) {
            creativeToolsBizPluginServiceLIZ.LIZIZ(activityLIZIZ, C546540Lc4.LIZ(value), true);
        }
    }

    @Override // com.ss.android.ugc.aweme.theater.service.IAITheaterCreationLauncher
    public final void LJFF(IAITheaterCreationLauncher.EnterParams enterParams, Context context, boolean z) {
        LJII(enterParams, context, "launchCreationPage");
    }

    @Override // com.ss.android.ugc.aweme.theater.service.IAITheaterCreationLauncher
    public final void LIZ(IAITheaterCreationLauncher.EnterParams enterParams, Context context, String str, boolean z, Function0<Unit> function0) {
        LJII(enterParams, context, "launchCreationPageOnAICastEntry");
    }
}
