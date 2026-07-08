package X;

import com.ss.android.ugc.aweme.im.message.content.ShareLiveContent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZCi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C895820ZCi {
    public static final boolean LIZIZ(ShareLiveContent shareLiveContent) {
        if (!Intrinsics.LJFF(shareLiveContent.getShareLiveIntent(), "multi_guest_invite") && !Intrinsics.LJFF(shareLiveContent.getShareLiveIntent(), "multi_guest_invite_by_capsule") && !Intrinsics.LJFF(shareLiveContent.getShareLiveIntent(), "multi_guest_invite_by_empty_mask") && !Intrinsics.LJFF(shareLiveContent.getShareLiveIntent(), "multi_guest_invite_suggest") && !Intrinsics.LJFF(shareLiveContent.getShareLiveIntent(), "multi_guest_invite_guest_invite_friend") && !Intrinsics.LJFF(shareLiveContent.getShareLiveIntent(), "multi_guest_invite_admin_invite")) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String LIZ(com.ss.android.ugc.aweme.im.message.content.ShareLiveContent r7, X.C869590Y9l r8, boolean r9) {
        /*
            X.0ZVS r0 = com.ss.android.ugc.aweme.im.saas.host.api.live.IMLiveService.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.im.saas.host.api.live.IMLiveService r3 = X.C0ZVS.LIZ()
            java.lang.String r5 = ""
            if (r3 != 0) goto Le
            return r5
        Le:
            r4 = 0
            if (r8 == 0) goto L21
            boolean r0 = X.C0ZDX.LJJIJIIJIL(r8)
            r6 = 1
            if (r0 != r6) goto L21
        L18:
            if (r9 == 0) goto L23
            java.lang.String r0 = "pm_pt_invited_by_card"
            java.lang.String r0 = r3.LJII(r0)
            return r0
        L21:
            r6 = 0
            goto L18
        L23:
            if (r8 == 0) goto L6e
            long r0 = r8.getSender()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = r7.getRoomOwnerId()
            boolean r2 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            boolean r0 = X.C0ZDX.LJJJJIZL(r8)
            if (r0 == 0) goto L42
            java.lang.String r0 = "pm_pt_invite_guest_group"
            java.lang.String r0 = r3.LJII(r0)
            return r0
        L42:
            java.lang.String r1 = "%1$s"
            if (r2 == 0) goto L5a
            if (r6 == 0) goto L53
            java.lang.String r0 = "pm_pt_guest_be_invited_by_owner_group"
            java.lang.String r0 = r3.LJII(r0)
            java.lang.String r0 = kotlin.text.u.LJJIFFI(r0, r1, r5, r4)
            return r0
        L53:
            java.lang.String r0 = "pm_pt_guest_be_invited_by_owner_single"
            java.lang.String r0 = r3.LJII(r0)
            return r0
        L5a:
            if (r6 == 0) goto L67
            java.lang.String r0 = "pm_pt_guest_be_invited_by_guest_group"
            java.lang.String r0 = r3.LJII(r0)
            java.lang.String r0 = kotlin.text.u.LJJIFFI(r0, r1, r5, r4)
            return r0
        L67:
            java.lang.String r0 = "pm_pt_guest_be_invited_by_guest_single"
            java.lang.String r0 = r3.LJII(r0)
            return r0
        L6e:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C895820ZCi.LIZ(com.ss.android.ugc.aweme.im.message.content.ShareLiveContent, X.0Y9l, boolean):java.lang.String");
    }
}
