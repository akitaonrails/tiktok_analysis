package X;

import com.bytedance.android.livesdk.userservice.UserService;

/* JADX INFO: renamed from: X.00h7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C145900h7 {
    public static final void LIZ(int i, long j, long j2, String str) {
        long currentUserId = UserService.getInstance().user().getCurrentUserId();
        C474500IjA c474500IjALIZ = C0IJT.LIZ("interactive_challenge_anchor_receive_result");
        c474500IjALIZ.LJJII(Long.valueOf(j), "room_id");
        c474500IjALIZ.LJJII(Long.valueOf(currentUserId), "anchor_id");
        c474500IjALIZ.LJJII(Long.valueOf(j2), "gift_id");
        c474500IjALIZ.LJJII(str, "result");
        c474500IjALIZ.LJJII(Integer.valueOf(i), "decline_reason");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("report interactive_challenge_anchor_receive_result: roomId=");
        sbLIZ.append(j);
        sbLIZ.append(", anchorId=");
        sbLIZ.append(currentUserId);
        sbLIZ.append(", giftId=");
        sbLIZ.append(j2);
        sbLIZ.append(", result=");
        sbLIZ.append(str);
        sbLIZ.append(", declineReason=");
        sbLIZ.append(i);
        C20441214yg.LJIIIZ("MinuteGameMetrics__ttlive_gift_render", C2188811AlT.LIZIZ(sbLIZ));
    }
}
