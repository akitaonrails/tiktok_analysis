package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0fgG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1136500fgG {
    public static final /* synthetic */ int LIZ = 0;

    public static final void LJ(InterfaceC1136020ffU interfaceC1136020ffU) {
        String string;
        String str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("gift_id", String.valueOf(interfaceC1136020ffU.getGiftId()));
        InterfaceC1136800fgk interfaceC1136800fgkLJIILL = interfaceC1136020ffU.LJIILL();
        if (interfaceC1136800fgkLJIILL == null || (string = Long.valueOf(interfaceC1136800fgkLJIILL.getId()).toString()) == null) {
            string = "";
        }
        linkedHashMap.put("from_user_id", string);
        linkedHashMap.put("message_id", String.valueOf(interfaceC1136020ffU.getMessageId()));
        linkedHashMap.put("error_msg", "");
        C01GW c01gw = C1140890fnL.LIZ;
        linkedHashMap.put("render_sdk_version", String.valueOf(1));
        if (C1135800ff8.LJJII()) {
            str = "_anchor";
        } else {
            str = "_guest";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("gift_sticker_create_effect_message_fail");
        sbLIZ.append(str);
        LIZ(C2188811AlT.LIZIZ(sbLIZ), linkedHashMap, new Throwable("default"), false);
    }

    public static final void LJFF(GiftMessage giftMessage) {
        String string;
        String str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("gift_id", String.valueOf(giftMessage.giftId));
        User user = giftMessage.fromUser;
        if (user == null || (string = Long.valueOf(user.getId()).toString()) == null) {
            string = "";
        }
        linkedHashMap.put("from_user_id", string);
        linkedHashMap.put("message_id", String.valueOf(giftMessage.getMessageId()));
        linkedHashMap.put("error_msg", "");
        C01GW c01gw = C1140890fnL.LIZ;
        linkedHashMap.put("render_sdk_version", String.valueOf(1));
        if (C1135800ff8.LJJII()) {
            str = "_anchor";
        } else {
            str = "_guest";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("gift_sticker_create_effect_message_fail");
        sbLIZ.append(str);
        LIZ(C2188811AlT.LIZIZ(sbLIZ), linkedHashMap, new Throwable("default"), false);
    }

    public static void LIZLLL(long j, Throwable th) {
        String str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("effect_id", String.valueOf(j));
        String message = th.getMessage();
        if (message == null) {
            message = "";
        }
        linkedHashMap.put("error_msg", message);
        if (C1135800ff8.LJJII()) {
            str = "_anchor";
        } else {
            str = "_guest";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("live_facial_algo_model_async_download_error");
        sbLIZ.append(str);
        LIZ(C2188811AlT.LIZIZ(sbLIZ), linkedHashMap, th, false);
    }

    public static void LIZJ(String str, JSONObject jSONObject, int i) {
        JSONObject jSONObject2;
        if ((i & 2) != 0) {
            jSONObject = new JSONObject();
        }
        JSONObject jSONObject3 = null;
        if ((i & 4) != 0) {
            jSONObject2 = new JSONObject();
        } else {
            jSONObject2 = null;
        }
        if ((i & 8) != 0) {
            jSONObject3 = new JSONObject();
        }
        try {
            jSONObject.putOpt(Scene.SCENE_SERVICE, str);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ttlive_");
            sbLIZ.append("gift_effect_render_error_monitor");
            C1CC2.LJ(C2188811AlT.LIZIZ(sbLIZ), jSONObject, jSONObject2, jSONObject3);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("livesdk_");
            sbLIZ2.append("gift_effect_render_error_monitor");
            C474500IjA c474500IjALIZ = C0IJT.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
            c474500IjALIZ.LJJIIJZLJL(jSONObject);
            c474500IjALIZ.LJJIIJZLJL(jSONObject2);
            c474500IjALIZ.LJJIIJZLJL(jSONObject3);
            c474500IjALIZ.LIZ();
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public static final void LIZ(String str, Map<String, String> map, Throwable th, boolean z) {
        Map<String, String> mapLJ;
        try {
            IHostAction iHostAction = (IHostAction) C1161920gLG.LIZJ(IHostAction.class);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ttlive_");
            sbLIZ.append("gift_effect_render_error_monitor");
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            if (map == null) {
                mapLJ = C2097608Jq.LJ();
            } else {
                mapLJ = map;
            }
            iHostAction.reportNpthBizException(strLIZIZ, th, str, mapLJ, z);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("livesdk_");
            sbLIZ2.append("gift_effect_render_error_monitor");
            C474500IjA c474500IjALIZ = C0IJT.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
            if (map == null) {
                map = C2097608Jq.LJ();
            }
            c474500IjALIZ.LJJIIZI(map);
            c474500IjALIZ.LIZ();
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C189200o6.m2constructorimpl(new C098200Yq(th2));
        }
    }
}
