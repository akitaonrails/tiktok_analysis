package X;

import com.ss.android.ugc.aweme.audiomode.vopclone.experiment.InstantCloneConfig;
import kotlin.jvm.internal.AFwS218S0000000_29;

/* JADX INFO: renamed from: X.10yi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19422210yi {
    public static final C19422210yi LIZ = new C19422210yi();
    public static final InstantCloneConfig LIZIZ = new InstantCloneConfig(false, false, false);
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(388));

    public static final boolean LIZ() {
        if (!((InstantCloneConfig) LIZJ.getValue()).enableMusicDetailPage) {
            return false;
        }
        LIZ.getClass();
        return LIZLLL();
    }

    public static final boolean LIZIZ() {
        if (!((InstantCloneConfig) LIZJ.getValue()).enableTTSPanel) {
            return false;
        }
        LIZ.getClass();
        return LIZLLL();
    }

    public static final boolean LIZJ() {
        if (!((InstantCloneConfig) LIZJ.getValue()).enableVoiceAnchor) {
            return false;
        }
        LIZ.getClass();
        return LIZLLL();
    }

    public static boolean LIZLLL() {
        return (!((AbstractC848400XPy) C0XQ7.LJFF()).isLogin() || (((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().getAccountType() == 3) || ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().isAccuratePrivateAccount()) ? false : true;
    }
}
