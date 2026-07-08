package X;

import com.bytedance.android.livesdk.model.message.PunishEventInfo;
import com.bytedance.android.livesdk.userservice.UserService;

/* JADX INFO: renamed from: X.0ILW, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0ILW {
    public static final void LIZ(String str, String str2) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_mask_layer_click");
        c474500IjALIZ.LJJII(str2, "click_icon");
        c474500IjALIZ.LJ(str);
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LIZ();
    }

    public static final void LIZIZ(String str, PunishEventInfo punishEventInfo, Long l) {
        String str2;
        String str3;
        Long lValueOf;
        String str4;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_violation_mask_layer");
        c474500IjALIZ.LJJII(str, "action_type");
        String str5 = "";
        if (punishEventInfo == null || (str2 = punishEventInfo.punishType) == null) {
            str2 = "";
        }
        c474500IjALIZ.LJJII(str2, "violation_type");
        if (punishEventInfo == null || (str3 = punishEventInfo.punishId) == null) {
            str3 = "";
        }
        c474500IjALIZ.LJJII(str3, "record_id");
        if (punishEventInfo != null && (str4 = punishEventInfo.punishReason) != null) {
            str5 = str4;
        }
        c474500IjALIZ.LJJII(str5, "violation_reason");
        if (punishEventInfo != null) {
            lValueOf = Long.valueOf(punishEventInfo.violationUid);
        } else {
            lValueOf = null;
        }
        c474500IjALIZ.LJJII(lValueOf, "violation_anchor_id");
        c474500IjALIZ.LJJII(l, "violation_room_id");
        c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "user_id");
        c474500IjALIZ.LIZ();
    }
}
