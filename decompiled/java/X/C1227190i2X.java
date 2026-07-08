package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0i2X, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1227190i2X {
    public static final EnumC1227200i2Y LIZ(IMUser iMUser) {
        if (iMUser.getFollowStatus() == 2) {
            return EnumC1227200i2Y.MUF;
        }
        if (iMUser.getFollowStatus() == 1) {
            return EnumC1227200i2Y.FOLLOWING;
        }
        if (iMUser.getMatchedFriend() != null) {
            return EnumC1227200i2Y.MAF;
        }
        return EnumC1227200i2Y.OTHER;
    }

    public static final EnumC1227180i2W LIZIZ(C1224840hyk c1224840hyk, boolean z) {
        if ((C1225230hzN.LIZIZ(c1224840hyk) && !Intrinsics.LJFF(c1224840hyk.LLJI.get("is_search_page_default_item"), "1")) || Intrinsics.LJFF(c1224840hyk.LLJI.get("is_search"), Boolean.TRUE)) {
            return EnumC1227180i2W.SEARCH;
        }
        if (Intrinsics.LJFF(c1224840hyk.LLJI.get("is_related_friend_item"), "1")) {
            return EnumC1227180i2W.RELATED;
        }
        if (z && Intrinsics.LJFF(c1224840hyk.LLJI.get("is_recommend_item"), "1")) {
            return EnumC1227180i2W.RECOMMEND;
        }
        return EnumC1227180i2W.NORMAL;
    }
}
