package X;

import com.bytedance.android.live.base.model.user.PrivilegeLogExtra;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import com.bytedance.android.livesdk.model.BorderInfo;
import com.bytedance.android.livesdk.rank.impl.RankService;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import qo2.w;

/* JADX INFO: renamed from: X.0JeJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C496970JeJ {
    public static InterfaceC496980JeK LIZ;

    public static BorderInfo LIZ(User user) {
        if (user == null) {
            return null;
        }
        if (user.getBorders() != null && !user.getBorders().isEmpty()) {
            if (LIZ == null) {
                return (BorderInfo) ListProtector.get(user.getBorders(), 0);
            }
            for (BorderInfo borderInfo : user.getBorders()) {
                if (borderInfo != null && ((RankService) LIZ).LIZ(borderInfo)) {
                    return borderInfo;
                }
            }
        } else if (LIZ != null && user.getBorder() != null) {
            if (((RankService) LIZ).LIZ(user.getBorder())) {
                return user.getBorder();
            }
        }
        return null;
    }

    public static void LIZIZ(User user, String str, String str2, boolean z) {
        LIZJ(user, str, str2, z, LIZ(user));
    }

    public static void LIZJ(User user, String str, String str2, boolean z, BorderInfo borderInfo) {
        boolean z2;
        Object obj;
        if (borderInfo != null) {
            PrivilegeLogExtra privilegeLogExtra = borderInfo.borderLogExtra;
            if (user.getLiveRoomId() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_avatar_frame_privilege_show");
            String str3 = "anchor";
            if (z) {
                obj = "anchor";
            } else {
                obj = "user";
            }
            c474500IjALIZ.LJJII(obj, "user_type");
            if (!z2) {
                str3 = "user";
            }
            c474500IjALIZ.LJJII(str3, "to_user_type");
            c474500IjALIZ.LJJII(str, "privilege_scenario");
            c474500IjALIZ.LJJII(str2, "show_place");
            c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "user_id");
            c474500IjALIZ.LJJII(Long.valueOf(user.getId()), "to_user_id");
            c474500IjALIZ.LJJII(Integer.valueOf(C0IUA.LIZJ), "online_user");
            if (privilegeLogExtra != null) {
                c474500IjALIZ.LJJII(privilegeLogExtra.privilege_id, "privilege_id");
                c474500IjALIZ.LJJII(privilegeLogExtra.privilege_order_id, "privilege_order_id");
                c474500IjALIZ.LJJII(privilegeLogExtra.privilege_version, "privilege_version_id");
                c474500IjALIZ.LJJII(privilegeLogExtra.data_version, "data_version_id");
            } else {
                c474500IjALIZ.LJJII("", "privilege_id");
                c474500IjALIZ.LJJII("", "privilege_order_id");
                c474500IjALIZ.LJJII("", "privilege_version_id");
                c474500IjALIZ.LJJII("", "data_version_id");
            }
            if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(c474500IjALIZ.LJIJ())) {
                c474500IjALIZ.LJIL();
                c474500IjALIZ.LIZ();
                return;
            }
            c474500IjALIZ.LJJIJLIJ();
            w wVar = w.LIZ;
            wVar.getClass();
            c474500IjALIZ.LJJII(w.LIZLLL(), "action_type");
            c474500IjALIZ.LJJII(wVar.LIZJ(), "live_type");
            c474500IjALIZ.LJIIIIZZ();
            c474500IjALIZ.LJJIJL();
        }
    }
}
