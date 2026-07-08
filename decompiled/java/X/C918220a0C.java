package X;

import com.bytedance.android.livesdk.model.message.linkcore.Player;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS381S0200000_15;
import tikcast.linkmic.controller.InviteResultInfo;

/* JADX INFO: renamed from: X.0a0C, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C918220a0C {
    public static final C918350a0P LIZ(C918350a0P c918350a0P, Function1<? super C918230a0D, Unit> function1) {
        C918360a0Q c918360a0Q = c918350a0P.LIZJ;
        return C918350a0P.LIZ(c918350a0P, null, C918360a0Q.LIZ(c918360a0Q, new AwS381S0200000_15(c918360a0Q.LIZJ, function1, (Function1<? super C918230a0D, Unit>) 147)), null, 11);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x006b A[PHI: r4
      0x006b: PHI (r4v1 tikcast.linkmic.controller.InviteResultInfo) = 
      (r4v0 tikcast.linkmic.controller.InviteResultInfo)
      (r4v0 tikcast.linkmic.controller.InviteResultInfo)
      (r4v4 tikcast.linkmic.controller.InviteResultInfo)
      (r4v4 tikcast.linkmic.controller.InviteResultInfo)
     binds: [B:3:0x0005, B:5:0x0009, B:15:0x0029, B:17:0x002d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.Map<java.lang.String, java.lang.String> LIZIZ(long r8, X.C918230a0D r10) {
        /*
            com.bytedance.android.livesdk.model.message.linkcore.InviteResponse r0 = r10.LJI
            r4 = 0
            r3 = 1
            r7 = 0
            if (r0 == 0) goto L6b
            java.util.List<tikcast.linkmic.controller.InviteResultInfo> r0 = r0.inviteResultList
            if (r0 == 0) goto L6b
            java.util.Iterator r6 = r0.iterator()
        Lf:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L27
            java.lang.Object r5 = r6.next()
            r0 = r5
            tikcast.linkmic.controller.InviteResultInfo r0 = (tikcast.linkmic.controller.InviteResultInfo) r0
            com.bytedance.android.livesdk.model.message.linkcore.Player r0 = r0.player
            if (r0 == 0) goto Lf
            long r1 = r0.uid
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r0 != 0) goto Lf
            r4 = r5
        L27:
            tikcast.linkmic.controller.InviteResultInfo r4 = (tikcast.linkmic.controller.InviteResultInfo) r4
            if (r4 == 0) goto L6b
            int r0 = r4.actionType
            if (r0 != 0) goto L6b
            java.lang.String r6 = "room_viewer"
        L31:
            r0 = 3
            kotlin.Pair[] r5 = new kotlin.Pair[r0]
            X.0a1F r0 = r10.LIZ
            java.lang.String r0 = r0.name()
            java.util.Locale r4 = java.util.Locale.ROOT
            java.lang.String r2 = r0.toLowerCase(r4)
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "invite_entry_type"
            r1.<init>(r0, r2)
            r5[r7] = r1
            X.0a1E r0 = r10.LIZIZ
            java.lang.String r0 = r0.name()
            java.lang.String r2 = r0.toLowerCase(r4)
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "invite_execute_path"
            r1.<init>(r0, r2)
            r5[r3] = r1
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "invitee_user_type"
            r1.<init>(r0, r6)
            r0 = 2
            r5[r0] = r1
            java.util.Map r0 = X.C2097608Jq.LJIIIIZZ(r5)
            return r0
        L6b:
            com.bytedance.android.livesdk.model.message.linkcore.InviteResponse r0 = r10.LJI
            if (r0 == 0) goto L88
            webcast.data.multilive_biz.BizInviteResponse r0 = r0.multiGuestRespExtra
            if (r0 == 0) goto L88
            webcast.data.multilive_biz.BizInviteResponse$ResponseData r0 = r0.data
            if (r0 == 0) goto L88
            java.util.List<java.lang.Long> r1 = r0.friendInviteeUids
            if (r1 == 0) goto L88
            java.lang.Long r0 = java.lang.Long.valueOf(r8)
            boolean r0 = r1.contains(r0)
            if (r0 != r3) goto L88
            java.lang.String r6 = "outroom_friend"
            goto L31
        L88:
            if (r4 == 0) goto L91
            int r0 = r4.actionType
            if (r0 != r3) goto L91
            java.lang.String r6 = "outroom_recommend_user"
            goto L31
        L91:
            java.lang.String r6 = ""
            goto L31
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C918220a0C.LIZIZ(long, X.0a0D):java.util.Map");
    }

    public static final boolean LIZJ(long j, List list, boolean z) {
        Object next;
        if (list != null) {
            Iterator it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    Player player = ((InviteResultInfo) next).player;
                    if (player != null && player.uid == j) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            InviteResultInfo inviteResultInfo = (InviteResultInfo) next;
            if (inviteResultInfo != null) {
                if (inviteResultInfo.actionType == 0) {
                    return true;
                }
                return false;
            }
        }
        return z;
    }
}
