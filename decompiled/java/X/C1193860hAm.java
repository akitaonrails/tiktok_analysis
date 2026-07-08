package X;

import com.ss.android.ugc.aweme.api.IAccountUtilsService;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hAm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1193860hAm {
    public static final C1193860hAm LIZ = new C1193860hAm();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(666));

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
            sbLIZ.append("ttls_poi_bannerbottom_banner_local_alliance_profile_shuanggao_");
            sbLIZ.append(str2);
            sbLIZ.append('_');
            sbLIZ.append(str);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        return null;
    }
}
