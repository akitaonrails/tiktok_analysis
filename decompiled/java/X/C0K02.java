package X;

import com.bytedance.android.live.base.model.user.SubscribeInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.livesetting.linkmic.TTliveAnchorDeviceScoreSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostUser;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ttnet.TTNetInit;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0K02, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public class C0K02 extends C0K04 {
    public static HashMap LJIIL() {
        Boolean boolValueOf;
        String str;
        HashMap map = new HashMap();
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        InterfaceC2262081DgM curUser = ((IHostUser) C1161920gLG.LIZJ(IHostUser.class)).getCurUser();
        map.put("room_id", Room.isValid(room) ? room.getIdStr() : CardStruct.IStatusCode.DEFAULT);
        long id = curUser != null ? curUser.getId() : 0L;
        long ownerUserId = Room.isValid(room) ? room.getOwnerUserId() : 0L;
        map.put("current_user_id", Long.valueOf(id));
        map.put("current_anchor_id", Long.valueOf(ownerUserId));
        if (Room.isValid(room)) {
            if (room != null && room.getOwner() != null) {
                if (Room.isValid(room)) {
                    User owner = room.getOwner();
                    boolValueOf = owner != null ? Boolean.valueOf(owner.isAnchorHasSubQualification()) : null;
                } else {
                    boolValueOf = Boolean.FALSE;
                }
                map.put("anchor_qualification", boolValueOf);
                if (room.getOwner().isSubscribed()) {
                    str = "subscribed_not_expired";
                } else {
                    SubscribeInfo subscribeInfo = room.getOwner().getSubscribeInfo();
                    str = !C500260Jjc.LJJIJIIJIL(subscribeInfo != null ? Boolean.valueOf(subscribeInfo.isInGracePeriod()) : null) ? "subscribed_expired_grace_period" : "not_subscribed";
                }
                if (room.getOwner() == null || !room.getOwner().isAnchorHasSubQualification()) {
                    map.put("is_subscription", "-1");
                } else if (room.getOwner().isSubscribed()) {
                    map.put("is_subscription", "1");
                } else {
                    map.put("is_subscription", CardStruct.IStatusCode.DEFAULT);
                }
                map.put("subscribe_state", str);
            }
        }
        map.put("device_score", Float.valueOf(TTliveAnchorDeviceScoreSetting.INSTANCE.getValue()));
        map.put("network_type", Long.valueOf(TTNetInit.getEffectiveConnectionType()));
        return map;
    }

    public static void LJIIJ(JSONObject jSONObject) {
        Object value;
        for (Map.Entry entry : LJIIL().entrySet()) {
            if (!jSONObject.has((String) entry.getKey()) && (value = entry.getValue()) != null) {
                String str = (String) entry.getKey();
                if (value instanceof Long) {
                    C0K04.LJ(str, ((Number) value).longValue(), jSONObject);
                } else if (value instanceof Float) {
                    C0K04.LJIIIIZZ(jSONObject, str, ((Number) value).floatValue());
                } else if (value instanceof Double) {
                    C0K04.LIZJ(((Number) value).doubleValue(), str, jSONObject);
                } else if (value instanceof JSONObject) {
                    C0K04.LJII(str, jSONObject, (JSONObject) value);
                } else if (value instanceof String) {
                    C0K04.LJFF(str, (String) value, jSONObject);
                } else {
                    C0K04.LJFF(str, value.toString(), jSONObject);
                }
            }
        }
        if (!jSONObject.has("server_timestamp")) {
            C0K04.LJ("server_timestamp", C963140bAe.LIZIZ(), jSONObject);
        }
        if (!jSONObject.has("client_and_server_diff_time")) {
            C0K04.LJ("client_and_server_diff_time", C963140bAe.LIZLLL, jSONObject);
        }
        if (!jSONObject.has("client_timestamp")) {
            C0K04.LJ("client_timestamp", System.currentTimeMillis(), jSONObject);
        }
    }

    public static final void LJIIJJI(Throwable th, JSONObject jSONObject) {
        String message;
        int errorCode;
        if (th != null) {
            message = th.toString();
        } else {
            message = null;
        }
        if (th instanceof C501470JlZ) {
            C501470JlZ c501470JlZ = (C501470JlZ) th;
            errorCode = c501470JlZ.getErrorCode();
            message = c501470JlZ.getErrorMsg();
        } else if (th instanceof C1811850xFX) {
            C1811850xFX c1811850xFX = (C1811850xFX) th;
            errorCode = c1811850xFX.statusCode;
            message = c1811850xFX.getMessage();
        } else {
            errorCode = 100001;
        }
        C0K04.LJ("error_msg", errorCode, jSONObject);
        C0K04.LJFF("error_detail", message, jSONObject);
        if (th != null) {
            C0K04.LJFF("error_class", th.getClass().getName(), jSONObject);
        }
    }
}
