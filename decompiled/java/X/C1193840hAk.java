package X;

import com.ss.android.ugc.aweme.api.IAccountUtilsService;
import com.ss.android.ugc.aweme.experiment.LSContentSettings;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hAk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1193840hAk {
    public static final C1193840hAk LIZ = new C1193840hAk();
    public static final int LIZIZ;
    public static final C01GW LIZJ;

    static {
        Integer num = LSContentSettings.LIZ().allianceBannerShowCount;
        LIZIZ = num != null ? num.intValue() : 3;
        LIZJ = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(665));
    }

    public static boolean LIZIZ(String str) {
        IAccountUtilsService iAccountUtilsServiceLIZ;
        String curUserId;
        if (str == null || str.length() == 0 || (iAccountUtilsServiceLIZ = C916803iA.LIZ()) == null || (curUserId = iAccountUtilsServiceLIZ.getCurUserId()) == null || curUserId.length() == 0) {
            return false;
        }
        return Intrinsics.LJFF(curUserId, str);
    }

    public static String LIZ(String str, String str2) {
        if (str != null && str.length() != 0 && str2 != null && str2.length() != 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("creator_post_landing_banner_exposure_count__");
            sbLIZ.append(str2);
            sbLIZ.append('_');
            sbLIZ.append(str);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        return null;
    }
}
