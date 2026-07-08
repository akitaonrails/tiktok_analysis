package X;

import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.00hq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C150400hq {
    public static final Map<Long, C149800hk> LIZ = new LinkedHashMap();

    public static int LIZ() {
        Object obj;
        String strValueOf = String.valueOf(UserService.getInstance().user().getCurrentUserId());
        Map map = (Map) DataChannelGlobal.LLILZ.gg0(C1148040fys.class);
        if (map == null || (obj = map.get("anchor_id")) == null) {
            obj = 0;
        }
        return Intrinsics.LJFF(strValueOf, obj) ? 1 : 0;
    }

    public static void LIZIZ(long j) {
        JSONObject jSONObject = new JSONObject();
        C1123380fL6.LIZ(jSONObject);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("travel_gift_entrance_click");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJIIJZLJL(jSONObject);
        c474500IjALIZ.LJJII(Integer.valueOf(LIZ()), "is_anchor");
        c474500IjALIZ.LJJII(C1130100fVw.LIZ.LIZ, "guide_from");
        c474500IjALIZ.LJJII(String.valueOf(UserService.getInstance().user().getCurrentUserId()), "user_id");
        c474500IjALIZ.LJJII(Long.valueOf(j), "gift_id");
        c474500IjALIZ.LIZ();
    }

    public static void LIZJ(long j) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("travel_gift_entrance_show");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJII(Integer.valueOf(LIZ()), "is_anchor");
        c474500IjALIZ.LJJII(C1130100fVw.LIZ.LIZ, "guide_from");
        c474500IjALIZ.LJJII(String.valueOf(UserService.getInstance().user().getCurrentUserId()), "user_id");
        c474500IjALIZ.LJJII(Long.valueOf(j), "gift_id");
        c474500IjALIZ.LIZ();
    }
}
