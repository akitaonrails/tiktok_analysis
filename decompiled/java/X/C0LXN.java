package X;

import com.bytedance.scene.Scene;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0LXN, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LXN {
    public static final C0LXN LIZ = new C0LXN();

    public static void LIZ(Effect effect, Map map) {
        String str;
        C537040L4k c537040L4kLIZ = C0LXS.LIZ(effect);
        if (c537040L4kLIZ != null && (str = c537040L4kLIZ.LIZIZ) != null && str.length() > 0) {
            HashMap map2 = (HashMap) map;
            map2.put("is_ai_prop", c537040L4kLIZ.LIZ);
            map2.put("ai_prop_type", c537040L4kLIZ.LIZIZ);
            map2.put("sub_ai_prop_type", c537040L4kLIZ.LIZJ);
            map2.put("ai_prop_model_name", c537040L4kLIZ.LIZLLL);
            map2.put("is_async", c537040L4kLIZ.LJ);
        }
    }

    public static void LIZIZ(C0LAB c0lab, Effect effect) {
        String str;
        C537040L4k c537040L4kLIZ = C0LXS.LIZ(effect);
        if (c537040L4kLIZ != null && (str = c537040L4kLIZ.LIZIZ) != null && str.length() > 0) {
            c0lab.LJ("is_ai_prop", c537040L4kLIZ.LIZ);
            c0lab.LJ("ai_prop_type", c537040L4kLIZ.LIZIZ);
            c0lab.LJ("ai_prop_model_name", c537040L4kLIZ.LIZLLL);
            c0lab.LJ("sub_ai_prop_type", c537040L4kLIZ.LIZJ);
            c0lab.LJ("is_async", c537040L4kLIZ.LJ);
        }
    }

    public static void LIZJ(C0LAB c0lab, String str) {
        String str2;
        C537040L4k c537040L4kLIZIZ = C0LXS.LIZIZ(str);
        if (c537040L4kLIZIZ != null && (str2 = c537040L4kLIZIZ.LIZIZ) != null && str2.length() > 0) {
            c0lab.LJ("is_ai_prop", c537040L4kLIZIZ.LIZ);
            c0lab.LJ("ai_prop_type", c537040L4kLIZIZ.LIZIZ);
            c0lab.LJ("ai_prop_model_name", c537040L4kLIZIZ.LIZLLL);
            c0lab.LJ("sub_ai_prop_type", c537040L4kLIZIZ.LIZJ);
            c0lab.LJ("is_async", c537040L4kLIZIZ.LJ);
        }
    }

    public static C0LXP LIZLLL(ShortVideoContext shortVideoContext, Effect effect) {
        String str;
        String str2;
        String str3;
        C537040L4k c537040L4kLIZ = C0LXS.LIZ(effect);
        String str4 = shortVideoContext.shootWay;
        String creationId = shortVideoContext.getCreationId();
        String strLJIJJLI = shortVideoContext.LJIJJLI();
        String effectId = effect.getEffectId();
        String str5 = null;
        if (c537040L4kLIZ != null) {
            str = c537040L4kLIZ.LIZ;
            str2 = c537040L4kLIZ.LIZIZ;
            str3 = c537040L4kLIZ.LIZLLL;
        } else {
            str = null;
            str2 = null;
            str3 = null;
        }
        String string = UUID.randomUUID().toString();
        String str6 = shortVideoContext.creativeModel.aigcMetadataModel.generationTriggerType;
        if (c537040L4kLIZ != null) {
            str5 = c537040L4kLIZ.LIZJ;
        }
        String currentUserID = C0CHQ.LIZ().getAccountService().getCurrentUserID();
        C0CHQ.LIZ().getApplicationService().getClass();
        return new C0LXP(str4, creationId, strLJIJJLI, effectId, str, str2, str3, string, str6, "shooting_effect", str5, currentUserID, AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId(), effect.getResourceId(), shortVideoContext.enterFrom);
    }

    public static void LJFF(C0LXP c0lxp, long j) {
        LJ("ai_task_consume", c0lxp, C2097608Jq.LJIIIIZZ(new Pair("duration_ms", String.valueOf(j)), new Pair(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, "1"), new Pair("enter_from", c0lxp.LJIILJJIL)));
    }

    public static void LJ(String str, C0LXP c0lxp, Map map) {
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("shoot_way", c0lxp.LIZ), new Pair("creation_id", c0lxp.LIZIZ), new Pair("shoot_tab_name", c0lxp.LIZJ), new Pair("prop_id", c0lxp.LIZLLL), new Pair("resource_id", c0lxp.LJIILIIL), new Pair(Scene.SCENE_SERVICE, c0lxp.LJIIIZ), new Pair("user_id", c0lxp.LJIIJJI), new Pair("device_id", c0lxp.LJIIL), new Pair("trigger_type", c0lxp.LJIIIIZZ), new Pair("client_task_id", c0lxp.LJII), new Pair("task_type", c0lxp.LJIIJ));
        String str2 = c0lxp.LJFF;
        if (str2 != null && C123100dR.LIZ(str2)) {
            mapLJIIJ.put("is_ai_prop", String.valueOf(c0lxp.LJ));
            mapLJIIJ.put("ai_prop_type", c0lxp.LJFF);
            mapLJIIJ.put("ai_prop_model_name", c0lxp.LJI);
        }
        mapLJIIJ.putAll(map);
        C20684815ws.LJIILLIIL(str, mapLJIIJ);
    }
}
