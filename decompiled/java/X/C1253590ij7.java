package X;

import com.ss.android.ugc.profile.business.ci.experiment.ProfileViewersExpConfig;
import kotlin.jvm.internal.AFwS207S0000000_19;

/* JADX INFO: renamed from: X.0ij7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1253590ij7 {
    public static final ProfileViewersExpConfig LIZ = new ProfileViewersExpConfig(Boolean.FALSE, Boolean.FALSE, Boolean.FALSE, 0);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(767));

    public static boolean LIZ() {
        Boolean bool;
        ProfileViewersExpConfig profileViewersExpConfig = (ProfileViewersExpConfig) LIZIZ.getValue();
        if (profileViewersExpConfig == null || (bool = profileViewersExpConfig.profileViewersEnable) == null) {
            return false;
        }
        return bool.booleanValue();
    }
}
