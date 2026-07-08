package X;

import com.bytedance.android.livesdk.model.UserAttr;
import com.bytedance.android.livesdk.userservice.UserService;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: renamed from: X.01ZF, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01ZF {
    public static final String LIZ() {
        if (C950220apo.LJI()) {
            return "anchor";
        }
        UserAttr userAttr = UserService.getInstance().user().LJIJJLI().getUserAttr();
        return (userAttr == null || !userAttr.isAdmin) ? C930540aK4.LJ() ? "guest" : "audience" : "moderator";
    }

    public static final void LIZIZ(String str, String str2, List<String> list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String strLIZ = LIZ();
        linkedHashMap.put("use_id", String.valueOf(C950220apo.LJFF()));
        linkedHashMap.put("anchor_id", String.valueOf(C950220apo.LJ()));
        linkedHashMap.put("room_id", String.valueOf(C950220apo.LIZLLL()));
        linkedHashMap.put("user_type", strLIZ);
        linkedHashMap.put("stage_reaction_id", str);
        linkedHashMap.put("stage_reaction_list", list.toString());
        linkedHashMap.put("action_type", str2);
        C0KX4.LIZ("livesdk_multi_stage_reaction_select", linkedHashMap, null, true);
    }
}
