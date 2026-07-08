package X;

import android.text.TextUtils;
import java.util.Locale;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0LzB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C560870LzB {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str, String str2) {
        C365090ETb.LIZIZ();
        C0CHQ.LIZ().getApplicationService().getClass();
        C844470XAv.LIZ.getClass();
        if (TextUtils.equals(C844470XAv.LJIILL.toLowerCase(Locale.ROOT), "local_test") && str.length() != 0 && str2.length() != 0 && str2.length() > 3052) {
            int i = 0;
            while (str2.length() > 3052) {
                i++;
                String strSubstring = str2.substring(0, 3052);
                str2 = u.LJJIFFI(str2, strSubstring, "", false);
                if (i != 1) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("    截断： ");
                    sbLIZ.append(strSubstring);
                    C2188811AlT.LIZIZ(sbLIZ);
                }
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("    截断： ");
            sbLIZ2.append(str2);
            C2188811AlT.LIZIZ(sbLIZ2);
        }
    }
}
