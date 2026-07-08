package X;

import android.text.TextUtils;

/* JADX INFO: renamed from: X.0woN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1795010woN {
    public static C1795840wpi LIZ(C1795400wp0 c1795400wp0, C1794480wnW c1794480wnW) {
        String str;
        String str2;
        String strLIZLLL = c1794480wnW.LIZLLL();
        C1792170wjn c1792170wjn = c1794480wnW.LIZ;
        String str3 = c1792170wjn.LIZIZ;
        String str4 = c1794480wnW.LIZLLL;
        String str5 = c1792170wjn.LJIIJ;
        int i = c1794480wnW.LJIIIZ;
        Integer numValueOf = null;
        if (i != -1 && Integer.valueOf(i) != null && (str2 = c1794480wnW.LJIIIIZZ) != null && !str2.isEmpty()) {
            C1795830wph c1795830wph = new C1795830wph();
            c1795830wph.LIZ = c1794480wnW.LJIIIIZZ;
            int i2 = c1794480wnW.LJIIIZ;
            if (i2 != -1) {
                numValueOf = Integer.valueOf(i2);
            }
            c1795830wph.LIZLLL = numValueOf.intValue();
            c1795400wp0.LIZIZ(c1795830wph.LIZ());
        }
        if (!TextUtils.isEmpty(c1794480wnW.LJJII) && !TextUtils.isEmpty(c1794480wnW.LJJIII)) {
            c1795400wp0.LIZ = c1794480wnW.LJJII;
            c1795400wp0.LIZIZ = c1794480wnW.LJJIII;
            return c1795400wp0.LIZ();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("newstr");
        String[] strArr = new String[2];
        strArr[0] = strLIZLLL;
        if (TextUtils.isEmpty(c1794480wnW.LJFF)) {
            str = ((C1795210woh) ((C1794240wn8) C1794240wn8.LJIIIIZZ()).LIZ()).LIZ.LJFF.LJI;
        } else {
            str = c1794480wnW.LJFF;
        }
        strArr[1] = str;
        StringBuilder sb = new StringBuilder();
        for (int i3 = 0; i3 < 2; i3++) {
            sb.append(strArr[i3]);
            sb.append("\n");
        }
        String string = sb.toString();
        if (string.endsWith("\n")) {
            string = string.substring(0, string.length() - 1);
        }
        StringBuilder sb2 = new StringBuilder();
        int i4 = 1;
        while (i4 < string.length()) {
            sb2.append((char) ((string.charAt(i4 - 1) << '\b') + string.charAt(i4)));
            i4 += 2;
        }
        if (i4 == string.length()) {
            sb2.append(string.charAt(i4 - 1));
        }
        sbLIZ.append(sb2.toString());
        c1795400wp0.LIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (str3.length() > 64) {
            c1795400wp0.LIZIZ = str3.substring(0, 64);
        } else {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(str3);
            sbLIZ2.append("\n");
            sbLIZ2.append(str4);
            if (C2188811AlT.LIZIZ(sbLIZ2).length() > 64) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(str3);
                sbLIZ3.append("\n");
                sbLIZ3.append(str4);
                c1795400wp0.LIZIZ = C2188811AlT.LIZIZ(sbLIZ3).substring(0, 64);
            } else {
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append(str3);
                sbLIZ4.append("\n");
                sbLIZ4.append(str4);
                sbLIZ4.append("\n");
                sbLIZ4.append(str5);
                if (C2188811AlT.LIZIZ(sbLIZ4).length() > 64) {
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append(str3);
                    sbLIZ5.append("\n");
                    sbLIZ5.append(str4);
                    sbLIZ5.append("\n");
                    sbLIZ5.append(str5);
                    c1795400wp0.LIZIZ = C2188811AlT.LIZIZ(sbLIZ5).substring(0, 64);
                } else {
                    StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                    sbLIZ6.append(str3);
                    sbLIZ6.append("\n");
                    sbLIZ6.append(str4);
                    sbLIZ6.append("\n");
                    sbLIZ6.append(str5);
                    c1795400wp0.LIZIZ = C2188811AlT.LIZIZ(sbLIZ6);
                }
            }
        }
        return c1795400wp0.LIZ();
    }
}
