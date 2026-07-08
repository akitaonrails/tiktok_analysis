package X;

import java.util.List;

/* JADX INFO: renamed from: X.0l4l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1343890l4l {
    public static final List<String> LIZ = C1697810uHb.LJIIJJI("homepage_hot", "homepage_follow", "homepage_friends", "others_homepage");

    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.EnumC1343880l4k LIZ(com.ss.android.ugc.aweme.profile.model.User r2, java.lang.String r3) {
        /*
            boolean r0 = X.C295200Bhe.LIZIZ
            if (r0 == 0) goto L42
            java.util.List<java.lang.String> r0 = X.C1343890l4l.LIZ
            boolean r0 = X.C13LP.LJJJJ(r3, r0)
            if (r0 == 0) goto L42
            if (r2 == 0) goto L35
            int r1 = r2.getFollowStatus()
            X.0SY7 r0 = X.C0SY7.FOLLOWED
            int r0 = r0.getValue()
            if (r1 != r0) goto L1d
            X.0l4k r0 = X.EnumC1343880l4k.FOLLOW
            return r0
        L1d:
            int r1 = r2.getFollowStatus()
            X.0SY7 r0 = X.C0SY7.FOLLOW_MUTUAL
            int r0 = r0.getValue()
            if (r1 != r0) goto L2c
            X.0l4k r0 = X.EnumC1343880l4k.MUTUAL_FOLLOW
            return r0
        L2c:
            com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct r0 = r2.getMatchedFriendStruct()
            if (r0 == 0) goto L35
            java.lang.String r0 = r0.recType
            goto L36
        L35:
            r0 = 0
        L36:
            boolean r0 = X.C123100dR.LIZ(r0)
            if (r0 == 0) goto L3f
            X.0l4k r0 = X.EnumC1343880l4k.MATCHED_FRIEND
            return r0
        L3f:
            X.0l4k r0 = X.EnumC1343880l4k.NO_RELATION
            return r0
        L42:
            X.0l4k r0 = X.EnumC1343880l4k.DEFAULT
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1343890l4l.LIZ(com.ss.android.ugc.aweme.profile.model.User, java.lang.String):X.0l4k");
    }
}
