package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleCoroutineScope;
import com.ss.android.ugc.aweme.aigc.quality.mob.business.AIGCCameoDisplayInfo;
import com.ss.android.ugc.aweme.aigc.quality.mob.business.AIGCEntranceInfo;
import com.ss.android.ugc.aweme.aigc.quality.mob.definitions.AIGC;
import com.ss.android.ugc.aweme.creative.model.aigc.AIGCSocialModel;
import com.ss.android.ugc.aweme.theater.service.IAITheaterCreationLauncher;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsBizPluginService;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS239S0000000_8;
import kotlin.jvm.internal.AwS32S0600000_14;

/* JADX INFO: renamed from: X.0LhB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C549710LhB implements InterfaceC550020Lhg {
    public static final C549710LhB LIZ = new C549710LhB();

    @Override // X.InterfaceC550020Lhg
    public final void LIZ(String str, Map<String, String> map) {
    }

    @Override // X.InterfaceC550020Lhg
    public final void LIZIZ(int i, int i2, Intent intent, Fragment fragment) {
    }

    @Override // X.InterfaceC550020Lhg
    public final InterfaceC901690ZYx LIZJ(String str, List list, AFwS239S0000000_8 aFwS239S0000000_8, AwS32S0600000_14 awS32S0600000_14, Map map) {
        return null;
    }

    @Override // X.InterfaceC550020Lhg
    public final void LIZLLL(Integer num, String str, String str2, String str3) {
    }

    @Override // X.InterfaceC550020Lhg
    public final boolean LJFF(String str) {
        return false;
    }

    @Override // X.InterfaceC550020Lhg
    public final String LJI(AIGCSocialModel aIGCSocialModel) {
        return null;
    }

    @Override // X.InterfaceC550020Lhg
    public final void LJII(LifecycleCoroutineScope lifecycleCoroutineScope, Context context, String str, String str2, boolean z, String str3, List<String> list) {
    }

    @Override // X.InterfaceC550020Lhg
    public final void LJ(Context context, IAITheaterCreationLauncher.EnterParams enterParams, AIGCCameoDisplayInfo aIGCCameoDisplayInfo, Function0<Unit> function0) {
        boolean z;
        AIGC aigc;
        Activity activityLIZIZ = C737910Sx3.LIZIZ(context);
        C547140Ld2 c547140Ld2 = C537540L6i.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("showInvitationCard blocked: plugin not installed, hasActivity=");
        if (activityLIZIZ != null) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        c547140Ld2.LIZ("AITheaterPluginNotInstalledSocialService", C2188811AlT.LIZIZ(sbLIZ));
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
}
