package X;

import com.ss.android.ugc.aweme.ecommerce.mall.mixhome.diversion.traffic.model.MallExtraInfo;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1BdS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2209321BdS implements InterfaceC2209391BdZ {
    public static final C2209321BdS LIZ = new C2209321BdS();

    @Override // X.InterfaceC2209391BdZ
    public final boolean LIZIZ(MallExtraInfo mallExtraInfo, String str) {
        return true;
    }

    @Override // X.InterfaceC2209391BdZ
    public final Map LIZ(MallExtraInfo mallExtraInfo, String str, String str2) {
        String str3 = mallExtraInfo.mallOutSource;
        String strLIZ = mallExtraInfo.LIZ();
        String str4 = mallExtraInfo.campaignId;
        String str5 = "";
        if (str4 == null) {
            str4 = "";
        }
        String str6 = mallExtraInfo.materialId;
        if (str6 == null) {
            str6 = "";
        }
        Map<String, String> map = C2209351BdV.LIZ;
        String strLIZLLL = C2209351BdV.LIZLLL(mallExtraInfo, null);
        String str7 = mallExtraInfo.vtScores;
        if (str7 != null) {
            str5 = str7;
        }
        if (Intrinsics.LJFF(strLIZ, "1")) {
            return C2209351BdV.LIZIZ(str3, str6, str4, strLIZLLL, str5);
        }
        if (Intrinsics.LJFF(strLIZ, "2")) {
            if (str3 != null && str3.length() != 0) {
                return C2209351BdV.LIZIZ(C2209351BdV.LJ(str3, str2), str6, str4, strLIZLLL, str5);
            }
            return C2209351BdV.LIZ;
        }
        return C2209351BdV.LIZ;
    }
}
