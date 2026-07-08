package X;

import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.saas.host.api.websocket.IMWebSocketBridgeApi;
import java.util.List;

/* JADX INFO: renamed from: X.0iSV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1243290iSV {
    public static final C1243290iSV LIZ = new C1243290iSV();

    public static void LIZJ(C1243290iSV c1243290iSV, int i, int i2) {
        C0I0B.LJFF.LIZIZ();
        c1243290iSV.getClass();
        C830490Whz c830490Whz = new C830490Whz();
        c830490Whz.put("expired_user_count", String.valueOf(i));
        c830490Whz.put("valid_user_count", String.valueOf(i2));
        C20684815ws.LJIILLIIL("contact_user_cache_clean", c830490Whz);
    }

    public static void LIZLLL(C1243290iSV c1243290iSV, String str, boolean z) {
        String str2;
        C0I0B.LJFF.LIZIZ();
        C830490Whz c830490Whz = new C830490Whz();
        c830490Whz.put(Scene.SCENE_SERVICE, str);
        if (z) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c830490Whz.put("hit", str2);
        C20684815ws.LJIILLIIL("contact_user_cache_hit", c830490Whz);
    }

    public static void LJ(C1243290iSV c1243290iSV, String str, String str2) {
        C0I0B.LJFF.LIZIZ();
        c1243290iSV.getClass();
        C830490Whz c830490Whz = new C830490Whz();
        c830490Whz.put("feature_name", str);
        c830490Whz.put("cache_result", str2);
        C20684815ws.LJIILLIIL("user_feature_cache_access", c830490Whz);
    }

    public static void LIZ(C1243290iSV c1243290iSV, long j, int i, int i2) {
        C0I0B.LJFF.LIZIZ();
        c1243290iSV.getClass();
        C830490Whz c830490Whz = new C830490Whz();
        c830490Whz.put("duration", String.valueOf(j));
        c830490Whz.put("upload_type", String.valueOf(i));
        c830490Whz.put("count", String.valueOf(i2));
        C20684815ws.LJIILLIIL("contact_bytesync_coldstart_updated", c830490Whz);
    }

    public static void LIZIZ(C1243290iSV c1243290iSV, int i, long j, boolean z) {
        Object obj;
        C0I0B.LJFF.LIZIZ();
        c1243290iSV.getClass();
        C830490Whz c830490Whz = new C830490Whz();
        c830490Whz.put("type", String.valueOf(i));
        c830490Whz.put("time_delta_contact", String.valueOf(j));
        String str = "1";
        if (z) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        c830490Whz.put("is_history", obj);
        IMWebSocketBridgeApi.LIZ.getClass();
        IMWebSocketBridgeApi iMWebSocketBridgeApiLIZ = C892310YzV.LIZ();
        if (iMWebSocketBridgeApiLIZ == null || !iMWebSocketBridgeApiLIZ.isConnected()) {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c830490Whz.put("connection_status", str);
        C20684815ws.LJIILLIIL("contact_bytesync_event_receive", c830490Whz);
    }

    public static void LJFF(C1243290iSV c1243290iSV, String str, List list, long j) {
        C0I0B.LJFF.LIZIZ();
        c1243290iSV.getClass();
        C830490Whz c830490Whz = new C830490Whz();
        c830490Whz.put("request_type", str);
        c830490Whz.put("feature_names", C13LP.LJJLIIIJ(list, ",", null, null, 0, null, null, 62));
        c830490Whz.put("duration", String.valueOf(j));
        c830490Whz.put("is_success", "1");
        c830490Whz.put("experiment_group", "1");
        C20684815ws.LJIILLIIL("user_feature_remote_request", c830490Whz);
    }
}
