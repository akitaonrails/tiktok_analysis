package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeCommentConfig;
import com.ss.android.ugc.aweme.feed.model.QuickMention;
import com.ss.android.ugc.aweme.profile.model.User;

/* JADX INFO: renamed from: X.0lGt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1351410lGt {
    public static final boolean LIZ(User user) {
        if (!((Boolean) C275950Arh.LIZ.getValue()).booleanValue() || user == null || user.isVerifiedTako != 1) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZIZ(X.C1351430lGv r7) {
        /*
            java.lang.String r1 = r7.LIZIZ
            java.lang.String r0 = "1"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L48
            java.lang.String r1 = r7.LIZ
            java.lang.String r0 = "show"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L48
            java.lang.String r4 = r7.LIZJ
            java.lang.String r2 = r7.LIZLLL
            long r5 = java.lang.System.currentTimeMillis()
            if (r4 == 0) goto L48
            int r0 = r4.length()
            r1 = 0
            if (r0 <= 0) goto L48
            r0 = 1
            r3 = 0
            if (r0 == 0) goto L48
            if (r2 == 0) goto L73
            int r0 = r2.length()
            if (r0 <= 0) goto L73
            java.lang.String r0 = X.C1351420lGu.LIZ
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r4)
            if (r0 == 0) goto L41
            java.lang.String r0 = X.C1351420lGu.LIZIZ
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r2)
            if (r0 != 0) goto L42
        L41:
            r1 = 1
        L42:
            X.C1351420lGu.LIZ = r4
            X.C1351420lGu.LIZIZ = r2
            if (r1 != 0) goto L73
        L48:
            X.09Gk r2 = new X.09Gk
            r2.<init>()
            java.lang.String r1 = "btn_type"
            java.lang.String r0 = "quick_mention"
            r2.LJIIIIZZ(r1, r0)
            java.lang.String r1 = r7.LIZ
            java.lang.String r0 = "action_type"
            r2.LJIIIIZZ(r0, r1)
            java.lang.String r1 = r7.LIZIZ
            java.lang.String r0 = "is_at_tako"
            r2.LJIIIIZZ(r0, r1)
            java.lang.String r1 = r7.LIZJ
            if (r1 == 0) goto L6b
            java.lang.String r0 = "to_user_id"
            r2.LJFF(r0, r1)
        L6b:
            java.util.Map<java.lang.String, java.lang.String> r1 = r2.LIZ
            java.lang.String r0 = "show_fast_panel"
            X.C20684815ws.LJIILLIIL(r0, r1)
            return
        L73:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "tako_guide_last_show_time_"
            r1.append(r0)
            r1.append(r4)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.Long r0 = java.lang.Long.valueOf(r5)
            X.C0TSK.LJFF(r1, r0)
            java.lang.String r2 = X.C1351420lGu.LIZJ(r4)
            java.lang.String r1 = X.C1351420lGu.LIZJ(r4)
            r0 = 6
            int r0 = X.C0TSK.LIZJ(r0, r1, r3)
            int r0 = r0 + 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            X.C0TSK.LJFF(r2, r0)
            goto L48
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1351410lGt.LIZIZ(X.0lGv):void");
    }

    public static final User LIZJ(Aweme aweme) {
        AwemeCommentConfig commentConfig;
        QuickMention quickMention;
        if (aweme != null && (commentConfig = aweme.getCommentConfig()) != null && (quickMention = commentConfig.quickMention) != null) {
            User user = quickMention.candidate;
            if (LIZ(user)) {
                return user;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j = jCurrentTimeMillis - ((long) 86400000);
            long j2 = quickMention.timestamp;
            if (j <= j2 && j2 <= jCurrentTimeMillis) {
                return user;
            }
        }
        return null;
    }

    public static final User LIZLLL(Aweme aweme) {
        AwemeCommentConfig commentConfig;
        QuickMention quickMention;
        User user;
        if (aweme == null || (commentConfig = aweme.getCommentConfig()) == null || (quickMention = commentConfig.quickMention) == null || (user = quickMention.candidate) == null || !LIZ(user)) {
            return null;
        }
        return user;
    }
}
