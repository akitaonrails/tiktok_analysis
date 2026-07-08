package X;

import android.text.TextUtils;

/* JADX INFO: renamed from: X.0oOq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1471660oOq {
    public static int LIZ = 112;
    public static InterfaceC1469330oL5 LIZIZ = null;
    public static int LIZJ = 116;

    public static void LIZ(String str, String str2) {
        if (LIZIZ != null && !TextUtils.isEmpty(str2)) {
            InterfaceC1469330oL5 interfaceC1469330oL5 = LIZIZ;
            if (!TextUtils.isEmpty(str)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("TTVideoEngine: tag = ");
                sbLIZ.append(str);
                sbLIZ.append(";  ");
                sbLIZ.append(str2);
                str2 = C2188811AlT.LIZIZ(sbLIZ);
            }
            ((C1471680oOs) ((C1471670oOr) interfaceC1469330oL5).LIZ).LIZ.getConfig().getALog().d(str2);
        }
    }

    public static void LIZIZ(String str, String str2) {
        if (((LIZJ >> 6) & 1) == 1) {
            LIZ(str, str2);
        }
    }

    public static void LIZJ(String str, String str2) {
        if (((LIZJ >> 2) & 1) == 1) {
            LIZ(str, str2);
        }
    }
}
