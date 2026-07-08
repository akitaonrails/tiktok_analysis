package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import com.ss.android.ugc.aweme.profile.model.User;

/* JADX INFO: renamed from: X.0l85, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1345950l85 {
    public static boolean LIZJ(Aweme aweme) {
        User author;
        if (aweme == null || (author = aweme.getAuthor()) == null) {
            return true;
        }
        MatchedFriendStruct matchedFriendStruct = author.getMatchedFriendStruct();
        if ((matchedFriendStruct != null && matchedFriendStruct.recType != null) || author.getFollowStatus() == 2) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:134:0x025c A[PHI: r0 r57
      0x025c: PHI (r0v31 com.ss.android.ugc.aweme.feed.model.search.WordStruct) = 
      (r0v30 com.ss.android.ugc.aweme.feed.model.search.WordStruct)
      (r0v33 com.ss.android.ugc.aweme.feed.model.search.WordStruct)
     binds: [B:133:0x025a, B:131:0x0256] A[DONT_GENERATE, DONT_INLINE]
      0x025c: PHI (r57v5 java.lang.String) = (r57v3 java.lang.String), (r57v6 java.lang.String) binds: [B:133:0x025a, B:131:0x0256] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0262 A[PHI: r57
      0x0262: PHI (r57v4 java.lang.String) = (r57v3 java.lang.String), (r57v5 java.lang.String) binds: [B:133:0x025a, B:135:0x0260] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0155  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C11NZ LIZ(java.lang.String r56, long r57, int r59, java.lang.String r60, int r61, int r62, com.ss.android.ugc.aweme.feed.model.Aweme r63, java.lang.String r64, java.util.List r65, java.lang.String r66, java.lang.Long r67, java.lang.Integer r68, kotlin.jvm.functions.Function0 r69, boolean r70, java.lang.Integer r71, boolean r72, java.lang.String r73, java.lang.Long r74) {
        /*
            Method dump skipped, instruction units count: 759
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1345950l85.LIZ(java.lang.String, long, int, java.lang.String, int, int, com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String, java.util.List, java.lang.String, java.lang.Long, java.lang.Integer, kotlin.jvm.functions.Function0, boolean, java.lang.Integer, boolean, java.lang.String, java.lang.Long):X.11NZ");
    }
}
