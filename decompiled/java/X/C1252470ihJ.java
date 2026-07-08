package X;

import android.os.Bundle;
import java.util.Map;
import kotlin.jvm.internal.AwS633S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ihJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1252470ihJ {
    public static final C1252480ihK LIZIZ(Bundle bundle) {
        if (bundle == null) {
            return new C1252480ihK(null, null, false, null, null, null, null, null, null, null, null);
        }
        return new C1252480ihK(bundle.getString("live_enter_module"), bundle.getString("live_feed_enter_from"), bundle.getBoolean("is_from_live"), bundle.getString("from_room_id"), bundle.getString("from_anchor_id"), bundle.getString("room_request_id"), bundle.getString("page_user_id"), bundle.getString("from_live_module"), bundle.getString("enter_from_merge"), bundle.getString("enter_method"), bundle.getString("action_type"));
    }

    public static final void LIZ(C2344009Gk c2344009Gk, C1252480ihK c1252480ihK) {
        if (!Intrinsics.LJFF(c2344009Gk.LJIIIZ("component_field"), "bio")) {
            return;
        }
        AwS633S0100000_19 awS633S0100000_19 = new AwS633S0100000_19(c2344009Gk, 197);
        if (c1252480ihK != null) {
            awS633S0100000_19.invoke("live_feed_enter_from", c1252480ihK.liveFeedEnterFrom);
            awS633S0100000_19.invoke("live_enter_module", c1252480ihK.liveEnterModule);
            awS633S0100000_19.invoke("room_request_id", c1252480ihK.roomRequestId);
            awS633S0100000_19.invoke("from_room_id", c1252480ihK.fromRoomId);
            awS633S0100000_19.invoke("from_anchor_id", c1252480ihK.fromAnchorId);
            awS633S0100000_19.invoke("from_live_module", c1252480ihK.fromLiveModule);
            awS633S0100000_19.invoke("enter_from_merge", c1252480ihK.enterFromMerge);
            awS633S0100000_19.invoke("live_enter_method", c1252480ihK.enterMethod);
            awS633S0100000_19.invoke("action_type", c1252480ihK.actionType);
        }
    }

    public static final void LIZJ(C1252480ihK c1252480ihK, Map<String, String> map) {
        String str = c1252480ihK.pageUserId;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        map.put("page_user_id", str);
        String str3 = c1252480ihK.fromLiveModule;
        if (str3 == null) {
            str3 = "";
        }
        map.put("from_live_module", str3);
        String str4 = c1252480ihK.enterFromMerge;
        if (str4 == null) {
            str4 = "";
        }
        map.put("enter_from_merge", str4);
        String str5 = c1252480ihK.enterMethod;
        if (str5 == null) {
            str5 = "";
        }
        map.put("enter_method", str5);
        String str6 = c1252480ihK.actionType;
        if (str6 != null) {
            str2 = str6;
        }
        map.put("action_type", str2);
    }
}
