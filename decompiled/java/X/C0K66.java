package X;

import com.ss.android.ugc.aweme.subscription.pgc.api.bridge.SubscriptionSceneContext;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0K66, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0K66 {
    public static final String LIZIZ(String str) {
        if (str == null || !(!a0.LJJJIL(str))) {
            return null;
        }
        return str;
    }

    public static final void LIZJ(C0K6F c0k6f) {
        String str;
        String str2;
        String str3;
        String str4;
        SubscriptionSceneContext subscriptionSceneContextLIZ = C0K4B.LIZ();
        Map<String, String> mapLIZ = C1973307oB.LIZ();
        String str5 = null;
        if (subscriptionSceneContextLIZ != null) {
            str = subscriptionSceneContextLIZ.enterFromMerge;
        } else {
            str = null;
        }
        Object objLIZIZ = LIZIZ(str);
        Object obj = "";
        if (objLIZIZ == null && (objLIZIZ = ((LinkedHashMap) mapLIZ).get("enter_from_merge")) == null) {
            objLIZIZ = "";
        }
        c0k6f.LIZJ(objLIZIZ, "enter_from_merge");
        if (subscriptionSceneContextLIZ != null) {
            str2 = subscriptionSceneContextLIZ.enterMethod;
        } else {
            str2 = null;
        }
        Object objLIZIZ2 = LIZIZ(str2);
        if (objLIZIZ2 == null && (objLIZIZ2 = ((LinkedHashMap) mapLIZ).get("enter_method")) == null) {
            objLIZIZ2 = "";
        }
        c0k6f.LIZJ(objLIZIZ2, "enter_method");
        if (subscriptionSceneContextLIZ != null) {
            str3 = subscriptionSceneContextLIZ.requestId;
        } else {
            str3 = null;
        }
        Object objLIZIZ3 = LIZIZ(str3);
        if (objLIZIZ3 == null && (objLIZIZ3 = ((LinkedHashMap) mapLIZ).get("request_id")) == null) {
            objLIZIZ3 = "";
        }
        c0k6f.LIZJ(objLIZIZ3, "request_id");
        if (subscriptionSceneContextLIZ != null) {
            str4 = subscriptionSceneContextLIZ.videoId;
        } else {
            str4 = null;
        }
        String strLIZIZ = LIZIZ(str4);
        if (strLIZIZ == null) {
            Object obj2 = ((LinkedHashMap) mapLIZ).get("video_id");
            if (obj2 != null) {
                obj = obj2;
            }
        } else {
            obj = strLIZIZ;
        }
        c0k6f.LIZJ(obj, "video_id");
        if (subscriptionSceneContextLIZ != null) {
            if (subscriptionSceneContextLIZ.roomId > 0) {
                c0k6f.LIZJ(Long.valueOf(subscriptionSceneContextLIZ.roomId), "room_id");
            }
            if (subscriptionSceneContextLIZ.anchorUid > 0) {
                c0k6f.LIZJ(Long.valueOf(subscriptionSceneContextLIZ.anchorUid), "anchor_id");
            }
            str5 = subscriptionSceneContextLIZ.anchorSecUid;
        }
        String strLIZIZ2 = LIZIZ(str5);
        if (strLIZIZ2 != null) {
            c0k6f.LIZJ(strLIZIZ2, "sec_anchor_id");
        }
    }

    public static final void LIZ(C0K6F c0k6f, String str, Object obj) {
        if (obj == null) {
            return;
        }
        if (!(obj instanceof Boolean) && !(obj instanceof Number) && !(obj instanceof String)) {
            c0k6f.LIZJ(obj.toString(), str);
        } else {
            c0k6f.LIZLLL.put(str, obj.toString());
        }
    }
}
