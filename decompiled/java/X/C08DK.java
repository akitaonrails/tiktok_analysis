package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.08DK, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08DK {
    public static C08DL LIZ(String str, String str2) {
        boolean z;
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z && u.LJJIIJZLJL(str, "/", false)) {
            String absolutePath = new C0VSJ(str).getAbsolutePath();
            String absolutePath2 = new C0VSJ(str2).getAbsolutePath();
            if (!u.LJJIIJZLJL(absolutePath, absolutePath2, false)) {
                return null;
            }
            String strSubstring = absolutePath.substring(absolutePath2.length());
            if (u.LJJIIJZLJL(strSubstring, File.separator, false)) {
                strSubstring = strSubstring.substring(1);
            }
            if (strSubstring.length() == 0) {
                return null;
            }
            List listLJJLIIIJ = a0.LJJLIIIJ(strSubstring, new char[]{File.separatorChar, '/'}, false, 0, 6);
            ArrayList arrayList = new ArrayList();
            for (Object obj : listLJJLIIIJ) {
                if (((String) obj).length() > 0) {
                    arrayList.add(obj);
                }
            }
            if (arrayList.size() < 5) {
                return null;
            }
            String str3 = (String) ListProtector.get(arrayList, 0);
            if (str3.length() != 0 && str3.length() <= 128) {
                for (int i = 0; i < str3.length(); i++) {
                    char cCharAt = str3.charAt(i);
                    if (!Character.isDigit(cCharAt)) {
                        if ('a' <= cCharAt) {
                            if (cCharAt < 'g') {
                            }
                        } else if ('A' > cCharAt || cCharAt >= 'G') {
                        }
                    }
                }
                String str4 = (String) ListProtector.get(arrayList, 1);
                int iIndexOf = arrayList.indexOf("res");
                if (iIndexOf > 1 && iIndexOf < arrayList.size() - 1) {
                    String strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList.subList(iIndexOf + 1, arrayList.size()), "/", null, null, 0, null, null, 62);
                    if (strLJJLIIIJ.length() == 0) {
                        return null;
                    }
                    return new C08DL(str3, str4, strLJJLIIIJ);
                }
            }
            return null;
        }
        return null;
    }
}
