package X;

import android.text.TextUtils;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: X.0X2R, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0X2R {
    public static volatile boolean LIZ;
    public static volatile boolean LIZIZ;
    public static volatile boolean LIZJ;
    public static volatile boolean LIZLLL;
    public static volatile boolean LJ;
    public static volatile boolean LJFF;
    public static final Set<String> LJI = new CopyOnWriteArraySet();

    public static boolean LIZ(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String strTrim = str.trim();
        int iIndexOf = strTrim.indexOf(59);
        if (iIndexOf != -1) {
            strTrim = strTrim.substring(0, iIndexOf);
        }
        for (String str2 : (CopyOnWriteArraySet) LJI) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str2);
            sbLIZ.append("=");
            if (strTrim.startsWith(C2188811AlT.LIZIZ(sbLIZ))) {
                return true;
            }
        }
        return false;
    }
}
