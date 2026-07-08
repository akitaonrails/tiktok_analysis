package X;

import com.bytedance.android.livesdk.userservice.UserService;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.01EZ, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01EZ {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("entrance_action_type", str);
        linkedHashMap.put("user_type", C917520Zz4.LJIILL(UserService.getInstance().user().LJIJJLI()));
        C01Z4.LIZ(null, linkedHashMap);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_send_gift_all_user_entrance");
        c474500IjALIZ.LJJIIZI(linkedHashMap);
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LIZ();
    }
}
