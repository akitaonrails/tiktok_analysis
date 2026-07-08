package X;

import com.ss.android.ugc.aweme.friendstab.exp.FriendSimpleFeedInteractionConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1A1F, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1A1F {
    public static final FriendSimpleFeedInteractionConfig LIZ = new FriendSimpleFeedInteractionConfig(0, 0);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C1A1G());

    public static boolean LIZ(String str) {
        if (Intrinsics.LJFF(str, "homepage_friends") && ((FriendSimpleFeedInteractionConfig) LIZIZ.getValue()).exposeFriendComments > 0) {
            return true;
        }
        return false;
    }

    public static boolean LIZIZ(String str) {
        if (Intrinsics.LJFF(str, "homepage_friends") && ((FriendSimpleFeedInteractionConfig) LIZIZ.getValue()).exposeMessageBox > 0) {
            return true;
        }
        return false;
    }
}
