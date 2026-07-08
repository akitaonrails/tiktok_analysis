package X;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.07lX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1956907lX {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(String str) {
        boolean z;
        if (!a0.LJJJIL(str)) {
            Integer numValueOf = Integer.valueOf(a0.LJJIZ(str, '?', 0, false, 6));
            if (numValueOf.intValue() != -1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                str = str.substring(0, numValueOf.intValue());
            }
            Integer numValueOf2 = Integer.valueOf(a0.LJJIZ(str, '#', 0, false, 6));
            if (numValueOf2.intValue() != -1) {
                return str.substring(0, numValueOf2.intValue());
            }
            return str;
        }
        return str;
    }

    public static C1533510q0b LIZIZ(String str, String str2) {
        boolean z;
        if (str.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z && str2.length() > 0) {
            Integer numValueOf = Integer.valueOf(a0.LJJIZ(str, '?', 0, false, 6));
            if (numValueOf.intValue() != -1) {
                str = str.substring(0, numValueOf.intValue());
            }
            Integer numValueOf2 = Integer.valueOf(a0.LJJIZ(str, '#', 0, false, 6));
            if (numValueOf2.intValue() != -1) {
                str = str.substring(0, numValueOf2.intValue());
            }
            if (!a0.LJJIJIIJIL(str2, '/')) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str2);
                sbLIZ.append('/');
                str2 = C2188811AlT.LIZIZ(sbLIZ);
            }
            Integer numValueOf3 = Integer.valueOf(a0.LJJJ(str, str2, 0, false, 6));
            if (numValueOf3.intValue() != -1) {
                String strSubstring = str.substring(numValueOf3.intValue() + str2.length());
                Integer numValueOf4 = Integer.valueOf(a0.LJJIZ(strSubstring, '/', 0, false, 6));
                if (numValueOf4.intValue() != -1) {
                    int iIntValue = numValueOf4.intValue();
                    String strSubstring2 = strSubstring.substring(0, iIntValue);
                    String strSubstring3 = strSubstring.substring(iIntValue + 1);
                    if ((!a0.LJJJIL(strSubstring2)) && (!a0.LJJJIL(strSubstring3))) {
                        Map<String, String> map = C1957007lY.LIZ.LJIJJ;
                        if (map != null) {
                            String str3 = (String) ((HashMap) map).get(strSubstring2);
                            if (!TextUtils.isEmpty(str3)) {
                                strSubstring2 = str3;
                            }
                        }
                        return new C1533510q0b("", strSubstring2, strSubstring3);
                    }
                }
            }
        }
        return null;
    }
}
