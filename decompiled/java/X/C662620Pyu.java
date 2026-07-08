package X;

import com.ss.android.ugc.aweme.friends.model.MutualStruct;
import com.ss.android.ugc.aweme.friends.model.MutualUser;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;

/* JADX INFO: renamed from: X.0Pyu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C662620Pyu {
    public static final String LIZ(User user) {
        if (user != null) {
            String relationShip = user.getRelationShip();
            if (relationShip != null && relationShip.length() > 0) {
                return relationShip;
            }
            MutualStruct mutualStruct = user.getMutualStruct();
            if (mutualStruct != null) {
                List<MutualUser> list = mutualStruct.userList;
                if (list == null || list.isEmpty()) {
                    if (mutualStruct != null) {
                        if (mutualStruct.total > 0) {
                            return "Mutual connections";
                        }
                    } else {
                        return "";
                    }
                }
                if (mutualStruct != null) {
                    if (mutualStruct.isMutualTagHidden() == 1) {
                        return "Mutual connections";
                    }
                    Integer numValueOf = Integer.valueOf(mutualStruct.mutualType);
                    if (numValueOf != null) {
                        if (numValueOf.intValue() == 1) {
                            return "Friends with";
                        }
                        if (numValueOf.intValue() == 2) {
                            return "Followed by";
                        }
                        if (numValueOf.intValue() == 3) {
                            return "Follows";
                        }
                        return "";
                    }
                    return "";
                }
                return "";
            }
            return "";
        }
        return "";
    }
}
