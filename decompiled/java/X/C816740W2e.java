package X;

import com.google.gson.n;
import com.ss.android.ugc.aweme.friends.model.MutualStruct;
import com.ss.android.ugc.aweme.profile.model.ExternalRecommendReasonStruct;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import com.ss.android.ugc.aweme.relation.storage.model.UserData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0W2e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C816740W2e {
    public static final MatchedFriendStruct LIZJ(C816680W1y c816680W1y) {
        MutualStruct mutualStruct;
        C816680W1y c816680W1yLIZ = c816680W1y.LIZ();
        ExternalRecommendReasonStruct externalRecommendReasonStruct = null;
        if (c816680W1yLIZ == null) {
            return null;
        }
        String str = c816680W1yLIZ.LIZJ;
        String str2 = c816680W1yLIZ.LIZIZ;
        String str3 = c816680W1yLIZ.LIZLLL;
        String str4 = c816680W1yLIZ.LJFF;
        if (str4 != null) {
            mutualStruct = (MutualStruct) C08JS.LIZ(str4, MutualStruct.class);
        } else {
            mutualStruct = null;
        }
        String str5 = c816680W1yLIZ.LJ;
        String str6 = c816680W1yLIZ.LJI;
        if (str6 != null) {
            externalRecommendReasonStruct = (ExternalRecommendReasonStruct) C08JS.LIZ(str6, ExternalRecommendReasonStruct.class);
        }
        return new MatchedFriendStruct(str, str2, str3, mutualStruct, null, str5, externalRecommendReasonStruct, Boolean.FALSE, Boolean.TRUE, null, null, null, null, null, null, Boolean.FALSE, 0, null, null, 0, 0, Boolean.FALSE);
    }

    public static final C816670W1x LIZ(UserData userData, long j) {
        String string;
        Integer num;
        String str = userData.uid;
        if (str == null) {
            str = "";
        }
        String str2 = userData.nickname;
        boolean z = true;
        if (!Intrinsics.LJFF(userData.isPrivateAccount, Boolean.TRUE) && ((num = userData.isSecret) == null || num.intValue() != 1)) {
            z = false;
        }
        Boolean boolValueOf = Boolean.valueOf(z);
        String string2 = userData.LIZ;
        C816680W1y c816680W1yLIZIZ = null;
        if (string2 == null) {
            n nVar = userData.avatar168;
            if (nVar != null) {
                string2 = nVar.toString();
            } else {
                string2 = null;
            }
        }
        n nVar2 = userData.avatar300;
        if (nVar2 != null) {
            string = nVar2.toString();
        } else {
            string = null;
        }
        C816640W1u c816640W1uLIZ = new C816640W1u(j, boolValueOf, str, str2, string2, string).LIZ();
        C816650W1v c816650W1vLIZ = new C816650W1v(str, userData.followStatus, userData.followerStatus, userData.isBlock, j).LIZ();
        MatchedFriendStruct matchedFriendStruct = userData.matchedFriendStruct;
        if (matchedFriendStruct != null) {
            c816680W1yLIZIZ = LIZIZ(matchedFriendStruct, str, j);
        }
        return new C816670W1x(str, c816640W1uLIZ, c816680W1yLIZIZ, c816650W1vLIZ);
    }

    public static final C816680W1y LIZIZ(MatchedFriendStruct matchedFriendStruct, String str, long j) {
        String strLIZLLL;
        String str2 = matchedFriendStruct.recommendReason;
        String str3 = matchedFriendStruct.recType;
        if (str3 == null) {
            str3 = "";
        }
        String str4 = matchedFriendStruct.relationType;
        String str5 = matchedFriendStruct.socialInfo;
        MutualStruct mutualStruct = matchedFriendStruct.mMutualStruct;
        String strLIZLLL2 = null;
        if (mutualStruct != null) {
            strLIZLLL = C08JS.LIZLLL(mutualStruct);
        } else {
            strLIZLLL = null;
        }
        ExternalRecommendReasonStruct externalRecommendReasonStruct = matchedFriendStruct.externalRecommendReasonStruct;
        if (externalRecommendReasonStruct != null) {
            strLIZLLL2 = C08JS.LIZLLL(externalRecommendReasonStruct);
        }
        return new C816680W1y(str, str3, j, str2, str4, str5, strLIZLLL, strLIZLLL2).LIZ();
    }
}
