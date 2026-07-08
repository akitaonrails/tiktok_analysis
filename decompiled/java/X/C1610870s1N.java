package X;

import com.ss.android.ugc.aweme.friendstab.experiment.FriendsMuteConfig;
import kotlin.jvm.internal.AFwS213S0000000_24;

/* JADX INFO: renamed from: X.0s1N, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1610870s1N {
    public static final C1610870s1N LIZ = new C1610870s1N();
    public static final FriendsMuteConfig LIZIZ = new FriendsMuteConfig(0, 0, 0, 0);
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(643));

    public static boolean LIZ() {
        return ((FriendsMuteConfig) LIZJ.getValue()).fiAvatarLongPressMute > 0;
    }

    public static boolean LIZIZ() {
        return ((FriendsMuteConfig) LIZJ.getValue()).fiMuteAllIncludeLives > 0;
    }

    public static int LIZJ() {
        return ((FriendsMuteConfig) LIZJ.getValue()).fiMuteSplitUiType;
    }

    public static boolean LIZLLL() {
        return ((FriendsMuteConfig) LIZJ.getValue()).fiMuteSplitEnable > 0;
    }
}
