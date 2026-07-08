package X;

import com.ss.android.ugc.aweme.profile.model.User;

/* JADX INFO: renamed from: X.0dx4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1070040dx4 {
    public static final EnumC1070050dx5 LIZ(User user) {
        if (user.getFollowStatus() == 2) {
            return EnumC1070050dx5.FRIENDS;
        }
        if (user.getFollowStatus() == 1) {
            return EnumC1070050dx5.FOLLOWING;
        }
        if (user.getMatchedFriendStruct() != null) {
            return EnumC1070050dx5.MAF;
        }
        return EnumC1070050dx5.MORE_FRIENDS;
    }
}
