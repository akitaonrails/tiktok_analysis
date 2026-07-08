package X;

import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.level.BarrageGradeResConfig;
import com.bytedance.android.livesdk.model.message.BarrageMessage;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0eUY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1090800eUY {
    public static final /* synthetic */ int LIZ = 0;

    public static JSONObject LIZ(DataChannel dataChannel, BarrageMessage barrageMessage, long j, String str) {
        long currentUserId;
        long id;
        String str2;
        String str3;
        String str4;
        String str5;
        Room room;
        try {
            int iLJI = C1090780eUW.LJI(barrageMessage);
            int iLJII = C1090780eUW.LJII(barrageMessage);
            BarrageGradeResConfig barrageGradeResConfigLJIIJJI = C1090780eUW.LJIIJJI(iLJI, barrageMessage.msgType);
            InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
            if (interfaceC500940JkiUser != null) {
                currentUserId = interfaceC500940JkiUser.getCurrentUserId();
            } else {
                currentUserId = -1;
            }
            if (dataChannel == null || (room = (Room) dataChannel.gg0(RoomChannel.class)) == null) {
                id = 0;
            } else {
                id = room.getId();
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("grade", iLJI);
            String strLIZ = C0KVU.LIZ(C1090780eUW.LJIIIIZZ(barrageMessage));
            String str6 = "";
            if (strLIZ == null) {
                strLIZ = "";
            }
            jSONObject.put("user_name", strLIZ);
            jSONObject.put("user_id", currentUserId);
            jSONObject.put("room_id", id);
            jSONObject.put("display_config", iLJII);
            if (str == null) {
                str = "";
            }
            jSONObject.put("text", str);
            jSONObject.put("raw_barrage_data", C19748512Ol.LIZIZ.LJIILL(barrageMessage));
            JSONObject jSONObject2 = new JSONObject();
            if (barrageGradeResConfigLJIIJJI == null || (str2 = barrageGradeResConfigLJIIJJI.background) == null) {
                str2 = "";
            }
            jSONObject2.put("barrage_background", str2);
            if (barrageGradeResConfigLJIIJJI != null) {
                str3 = barrageGradeResConfigLJIIJJI.ribbon;
            } else {
                str3 = null;
            }
            jSONObject2.put("barrage_ribbon", str3);
            if (barrageGradeResConfigLJIIJJI == null || (str4 = barrageGradeResConfigLJIIJJI.barrageChannel) == null) {
                str4 = "";
            }
            jSONObject2.put("gecko_channel", str4);
            jSONObject2.put("anim_duration", j);
            if (barrageGradeResConfigLJIIJJI != null && (str5 = barrageGradeResConfigLJIIJJI.barrageWebp) != null) {
                str6 = str5;
            }
            jSONObject2.put("barrage_webp_animation", str6);
            jSONObject.put("container_status", "new");
            jSONObject.put("resource_config", jSONObject2);
            jSONObject.put("business_id", "kGBLFlexPanelFansBarrageBizId");
            return jSONObject;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return new JSONObject();
        }
    }
}
