package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.09AZ, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public class C09AZ extends C09RC {
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0057, code lost:
    
        r9 = r2.length();
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00af A[PHI: r0
      0x00af: PHI (r0v12 java.lang.String) = (r0v11 java.lang.String), (r0v13 java.lang.String) binds: [B:34:0x00aa, B:36:0x00ad] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String LIZJ(java.lang.String r11) {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C09AZ.LIZJ(java.lang.String):java.lang.String");
    }

    public static String LIZLLL(String str) {
        if (!a0.LJJJIL("|")) {
            List<String> listLJJJJIZL = a0.LJJJJIZL(str);
            int length = str.length();
            listLJJJJIZL.size();
            int i = length + 0;
            int size = listLJJJJIZL.size() - 1;
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            for (String str2 : listLJJJJIZL) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    String str3 = str2;
                    if ((i2 != 0 && i2 != size) || !a0.LJJJIL(str3)) {
                        int length2 = str3.length();
                        int i4 = 0;
                        while (true) {
                            if (i4 >= length2) {
                                break;
                            }
                            if (!C1244080iTm.LJ(str3.charAt(i4))) {
                                if (i4 == -1 || !str3.startsWith("|", i4) || (strSubstring = str3.substring(i4 + 1)) == null) {
                                    break;
                                }
                            } else {
                                i4++;
                            }
                        }
                        String strSubstring = str3;
                        arrayList.add(strSubstring);
                    }
                    i2 = i3;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            StringBuilder sb = new StringBuilder(i);
            C13LP.LJJLIIIIJ(arrayList, sb, "\n", null, 124);
            return sb.toString();
        }
        "marginPrefix must be non-blank string.".toString();
        throw new IllegalArgumentException("marginPrefix must be non-blank string.");
    }
}
