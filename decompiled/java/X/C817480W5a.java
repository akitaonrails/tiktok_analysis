package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.internal.AFwS200S0000000_13;

/* JADX INFO: renamed from: X.0W5a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C817480W5a {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(355));

    public static Keva LIZ() {
        return (Keva) LIZ.getValue();
    }

    public static String LIZIZ(String str, String str2, String str3) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append('_');
        sbLIZ.append(str2);
        sbLIZ.append('_');
        sbLIZ.append(str3);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static void LIZJ(long j, long j2, String str, String str2, String str3, String str4) {
        if (LIZ().count() > 10000) {
            LIZ().clear();
        }
        String strLIZIZ = C461720I8s.LIZIZ();
        LIZ().storeString(LIZIZ(strLIZIZ, str, "_msg_type"), str2);
        LIZ().storeLong(LIZIZ(strLIZIZ, str, "_create_time"), j);
        LIZ().storeLong(LIZIZ(strLIZIZ, str, "_push_rec_time"), j2);
        LIZ().storeString(LIZIZ(strLIZIZ, str, "_to_uid"), str3);
        LIZ().storeString(LIZIZ(strLIZIZ, str, "_gd_label"), str4);
    }
}
