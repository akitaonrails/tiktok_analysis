package X;

import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.friendstab.repo.FriendsV3FeedResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rQL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1587910rQL {
    public static final boolean LIZJ() {
        return Intrinsics.LJFF(ComplianceServiceProvider.LJI().LJJIII().getValue(), Boolean.TRUE);
    }

    public static final C1219920hqo LIZ(FriendsV3FeedResponse friendsV3FeedResponse) {
        String str;
        if (!Intrinsics.LJFF(friendsV3FeedResponse.hasMore, Boolean.TRUE) || (str = friendsV3FeedResponse.feedPageToken) == null) {
            return null;
        }
        if (C296400Bja.LIZ() && !LIZJ()) {
            return new C1219920hqo(2, LIZLLL(friendsV3FeedResponse.source), str);
        }
        return new C1219920hqo(1, EnumC1586890rOh.UNKNOWN, str);
    }

    public static final C1219940hqq LIZIZ(FriendsV3FeedResponse friendsV3FeedResponse) {
        String str;
        if (!Intrinsics.LJFF(friendsV3FeedResponse.hasMoreUp, Boolean.TRUE) || (str = friendsV3FeedResponse.feedPageTokenUp) == null) {
            return null;
        }
        return new C1219940hqq(str);
    }

    public static final EnumC1586890rOh LIZLLL(int i) {
        for (EnumC1586890rOh enumC1586890rOh : EnumC1586890rOh.values()) {
            if (enumC1586890rOh.getDataLevel() == i) {
                return enumC1586890rOh;
            }
        }
        if (C296400Bja.LIZ() && !LIZJ()) {
            return EnumC1586890rOh.SORT;
        }
        return EnumC1586890rOh.UNKNOWN;
    }
}
