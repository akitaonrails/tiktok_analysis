package X;

import com.ss.android.ugc.aweme.profile.model.User;

/* JADX INFO: renamed from: X.0Sur, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C736550Sur {
    public static final EnumC736570Sut LIZ(User user) {
        int followStatus = user.getFollowStatus();
        if (followStatus != 0) {
            if (followStatus != 1) {
                if (followStatus != 2) {
                    return EnumC736570Sut.UNFOLLOW;
                }
                return EnumC736570Sut.MUTUAL_FOLLOW;
            }
            return EnumC736570Sut.SINGLE_FOLLOW;
        }
        if (user.getFollowerStatus() == 1) {
            return EnumC736570Sut.SINGLE_FOLLOWED;
        }
        return EnumC736570Sut.UNFOLLOW;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean LIZIZ(com.ss.android.ugc.aweme.profile.model.User r7) {
        /*
            java.lang.String r2 = r7.getAccurateRecType()
            java.lang.String r0 = r7.getSocialInfo()
            r6 = 1
            r5 = 0
            if (r0 == 0) goto L2c
            int r0 = r0.length()
            if (r0 == 0) goto L2c
            r0 = 0
        L13:
            r4 = 0
            if (r0 == 0) goto L27
            com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct r0 = r7.getMatchedFriendStruct()
            if (r0 == 0) goto L4d
            java.lang.String r3 = r0.socialInfo
        L1e:
            if (r3 == 0) goto L4d
            int r0 = r3.length()
            if (r0 == 0) goto L4d
            goto L2e
        L27:
            java.lang.String r3 = r7.getSocialInfo()
            goto L1e
        L2c:
            r0 = 1
            goto L13
        L2e:
            com.google.gson.Gson r1 = X.C09C2.LIZ()     // Catch: java.lang.Exception -> L49
            java.lang.Class<com.google.gson.n> r0 = com.google.gson.n.class
            java.lang.Object r1 = r1.LJII(r3, r0)     // Catch: java.lang.Exception -> L49
            com.google.gson.n r1 = (com.google.gson.n) r1     // Catch: java.lang.Exception -> L49
            if (r1 == 0) goto L4d
            java.lang.String r0 = "friend_type_str"
            com.google.gson.k r0 = r1.LJJIIZ(r0)     // Catch: java.lang.Exception -> L49
            if (r0 == 0) goto L4d
            java.lang.String r1 = r0.LJIL()     // Catch: java.lang.Exception -> L49
            goto L4e
        L49:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L4d:
            r1 = r4
        L4e:
            com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct r0 = r7.getMatchedFriendStruct()
            if (r0 == 0) goto L62
            com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct r0 = r7.getMatchedFriendStruct()
            java.lang.String r0 = r0.relationType
            if (r0 == 0) goto L62
            com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct r0 = r7.getMatchedFriendStruct()
            java.lang.String r4 = r0.relationType
        L62:
            if (r2 == 0) goto L9d
            java.lang.String r0 = "1-"
            boolean r0 = kotlin.text.a0.LJJIIZI(r2, r0, r5)
            if (r0 != 0) goto L7c
            java.lang.String r0 = "3-"
            boolean r0 = kotlin.text.a0.LJJIIZI(r2, r0, r5)
            if (r0 != 0) goto L7c
            java.lang.String r0 = "6-1"
            boolean r0 = kotlin.text.a0.LJJIIZI(r2, r0, r5)
            if (r0 == 0) goto L9d
        L7c:
            r3 = 1
        L7d:
            java.lang.String r2 = "43"
            if (r1 == 0) goto L9b
            boolean r0 = kotlin.text.a0.LJJIIZI(r1, r2, r5)
            if (r0 == 0) goto L9b
            r1 = 1
        L88:
            if (r4 == 0) goto L99
            boolean r0 = kotlin.text.a0.LJJIIZI(r4, r2, r5)
            if (r0 == 0) goto L99
            r0 = 1
        L91:
            if (r3 != 0) goto L98
            if (r1 != 0) goto L98
            if (r0 != 0) goto L98
            r6 = 0
        L98:
            return r6
        L99:
            r0 = 0
            goto L91
        L9b:
            r1 = 0
            goto L88
        L9d:
            r3 = 0
            goto L7d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C736550Sur.LIZIZ(com.ss.android.ugc.aweme.profile.model.User):boolean");
    }
}
