package X;

import com.ss.android.ugc.aweme.friendstab.experiment.FriendsV3CommentConfig;
import kotlin.jvm.internal.AFwS209S0000000_21;

/* JADX INFO: renamed from: X.0lGL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1351070lGL {
    public static final FriendsV3CommentConfig LIZ = new FriendsV3CommentConfig(5, 10, 600000);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(625));

    public static int LIZ() {
        if (C296440Bje.LIZ()) {
            C01GW c01gw = LIZIZ;
            return ((FriendsV3CommentConfig) c01gw.getValue()).defaultShowCount + ((FriendsV3CommentConfig) c01gw.getValue()).viewMoreShowCount;
        }
        C01GW c01gw2 = LIZIZ;
        return ((FriendsV3CommentConfig) c01gw2.getValue()).defaultShowCount + ((FriendsV3CommentConfig) c01gw2.getValue()).viewMoreShowCount + 5;
    }
}
