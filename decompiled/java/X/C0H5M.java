package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.internal.AFwS192S0000000_6;

/* JADX INFO: renamed from: X.0H5M, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0H5M {
    public static final C0H5M LIZ = new C0H5M();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(469));

    public static int LIZ(String str) {
        if (str == null || str.length() == 0) {
            return 0;
        }
        return ((Keva) LIZIZ.getValue()).getInt(LIZIZ("show_count", str), 0);
    }

    public static void LIZJ(String str) {
        if (str != null && str.length() != 0) {
            ((Keva) LIZIZ.getValue()).storeBoolean(LIZIZ("suppressed", str), true);
        }
    }

    public static String LIZIZ(String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append('_');
        sbLIZ.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        sbLIZ.append('_');
        sbLIZ.append(str2);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
