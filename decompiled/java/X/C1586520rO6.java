package X;

import com.ss.android.ugc.aweme.friendstab.exp.FriendsLaunchDowngradeConfig;

/* JADX INFO: renamed from: X.0rO6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1586520rO6 {
    public static final FriendsLaunchDowngradeConfig LIZ = new FriendsLaunchDowngradeConfig(false, true, true, true, true);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C1586550rO9());

    public static FriendsLaunchDowngradeConfig LIZ() {
        return (FriendsLaunchDowngradeConfig) LIZIZ.getValue();
    }

    public static boolean LIZIZ() {
        return LIZ().enableDowngrade && LIZ().downgradeMainPageFriends;
    }

    public static boolean LIZJ() {
        return LIZ().enableDowngrade && LIZ().downgradeObserversInitialize;
    }
}
