package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.friends.model.MutualStruct;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import com.ss.android.ugc.aweme.profile.model.User;

/* JADX INFO: renamed from: X.0SgI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C727520SgI {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(Aweme aweme) {
        User author;
        MatchedFriendStruct matchedFriendStruct;
        if (aweme != null && (author = aweme.getAuthor()) != null && (matchedFriendStruct = author.getMatchedFriendStruct()) != null) {
            return matchedFriendStruct.relationType;
        }
        return null;
    }

    public static MutualStruct LIZIZ(Aweme aweme) {
        User author;
        MatchedFriendStruct matchedFriendStruct;
        if (aweme != null && (author = aweme.getAuthor()) != null && (matchedFriendStruct = author.getMatchedFriendStruct()) != null) {
            return matchedFriendStruct.mMutualStruct;
        }
        return null;
    }

    public static String LIZJ(Aweme aweme) {
        User author;
        MatchedFriendStruct matchedFriendStruct;
        if (aweme != null && (author = aweme.getAuthor()) != null && (matchedFriendStruct = author.getMatchedFriendStruct()) != null) {
            return matchedFriendStruct.recType;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZLLL(com.ss.android.ugc.aweme.feed.model.Aweme r1) {
        /*
            if (r1 == 0) goto L23
            com.ss.android.ugc.aweme.profile.model.User r0 = r1.getAuthor()
            if (r0 == 0) goto L12
            com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct r0 = r0.getMatchedFriendStruct()
            if (r0 == 0) goto L12
            java.lang.String r0 = r0.recType
            if (r0 != 0) goto L1e
        L12:
            com.ss.android.ugc.aweme.feed.model.AwemeRelationRecommendModel r0 = r1.getRelationRecommendInfo()
            if (r0 == 0) goto L23
            long r0 = r0.recommendType
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
        L1e:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            return r0
        L23:
            r0 = 0
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C727520SgI.LIZLLL(com.ss.android.ugc.aweme.feed.model.Aweme):java.lang.String");
    }

    public static boolean LJ(Aweme aweme) {
        String str;
        User author;
        MatchedFriendStruct matchedFriendStruct;
        if (aweme != null && (author = aweme.getAuthor()) != null && (matchedFriendStruct = author.getMatchedFriendStruct()) != null) {
            str = matchedFriendStruct.recType;
        } else {
            str = null;
        }
        return C123100dR.LIZ(str);
    }

    public static boolean LJFF(Aweme aweme) {
        User author;
        MatchedFriendStruct matchedFriendStruct;
        if (aweme != null && (author = aweme.getAuthor()) != null && (matchedFriendStruct = author.getMatchedFriendStruct()) != null && matchedFriendStruct.recType != null) {
            return false;
        }
        return true;
    }

    public static boolean LJI(Aweme aweme) {
        MutualStruct mutualStruct;
        User author;
        MatchedFriendStruct matchedFriendStruct;
        MutualStruct mutualStruct2;
        User author2;
        MatchedFriendStruct matchedFriendStruct2;
        if (aweme != null && (author2 = aweme.getAuthor()) != null && (matchedFriendStruct2 = author2.getMatchedFriendStruct()) != null) {
            mutualStruct = matchedFriendStruct2.mMutualStruct;
        } else {
            mutualStruct = null;
        }
        if (mutualStruct == null || ((author = aweme.getAuthor()) != null && (matchedFriendStruct = author.getMatchedFriendStruct()) != null && (mutualStruct2 = matchedFriendStruct.mMutualStruct) != null && mutualStruct2.total == 0)) {
            return true;
        }
        return false;
    }
}
