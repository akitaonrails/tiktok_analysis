package X;

import android.os.Build;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS219S0000000_30;
import kotlin.jvm.internal.AFwS274S0000000_30;
import kotlin.text.Regex;

/* JADX INFO: renamed from: X.13WF, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13WF {
    public static final String LIZ;
    public static final C01GW LIZIZ;
    public static final C01GW LIZJ;

    static {
        LIZ = Build.VERSION.SDK_INT >= 29 ? "\\p{Extended_Pictographic}" : "[\\x{1F300}-\\x{1F9FF}\\x{2600}-\\x{26FF}\\x{2700}-\\x{27BF}]";
        LIZIZ = C452501pT.LIZIZ(AFwS219S0000000_30.get$arr$(274));
        LIZJ = C452501pT.LIZIZ(AFwS219S0000000_30.get$arr$(275));
    }

    public static String LIZ(String str) {
        boolean z;
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        try {
            String str2 = (String) C13LP.LJLL(C09RB.LJJII(C09RB.LJJI(C09RB.LJI(new C08LY(Regex.findAll$default((Regex) LIZJ.getValue(), str, 0, 2, null), AFwS274S0000000_30.get$arr$(269))), 2)));
            if (str2 == null) {
                return null;
            }
            if (!((Regex) LIZIZ.getValue()).matches(str2)) {
                return null;
            }
            return str2;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static List LIZIZ(String str) {
        boolean z;
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        List listLJJII = C09RB.LJJII(new C08LY(Regex.findAll$default(new Regex("\\X"), str, 0, 2, null), AFwS274S0000000_30.get$arr$(270)));
        if (listLJJII.isEmpty()) {
            return null;
        }
        return C13LP.LJJJJI(listLJJII);
    }

    public static String LIZJ(String str) {
        String str2;
        Object next;
        if (C1702606lc.LIZ()) {
            return LIZ(str);
        }
        try {
            List listLIZIZ = LIZIZ(str);
            if (listLIZIZ == null || listLIZIZ.size() != 1) {
                return null;
            }
            if (Build.VERSION.SDK_INT >= 29) {
                str2 = "\\p{Extended_Pictographic}";
            } else {
                str2 = "[\\x{1F300}-\\x{1F9FF}\\x{2600}-\\x{26FF}\\x{2700}-\\x{27BF}]";
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(".*");
            sbLIZ.append(str2);
            sbLIZ.append(".*");
            Regex regex = new Regex(C2188811AlT.LIZIZ(sbLIZ));
            Iterator it2 = listLIZIZ.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (regex.matches((String) next)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            return (String) next;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return null;
    }

    public static boolean LIZLLL(String str) {
        String str2;
        if (C1702606lc.LIZ()) {
            if (LIZ(str) != null) {
                return true;
            }
            return false;
        }
        try {
            List listLIZIZ = LIZIZ(str);
            if (listLIZIZ != null) {
                if (Build.VERSION.SDK_INT >= 29) {
                    str2 = "\\p{Extended_Pictographic}";
                } else {
                    str2 = "[\\x{1F300}-\\x{1F9FF}\\x{2600}-\\x{26FF}\\x{2700}-\\x{27BF}]";
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(".*");
                sbLIZ.append(str2);
                sbLIZ.append(".*");
                Regex regex = new Regex(C2188811AlT.LIZIZ(sbLIZ));
                if (listLIZIZ.size() == 1) {
                    if (listLIZIZ.isEmpty()) {
                        return true;
                    }
                    Iterator it2 = listLIZIZ.iterator();
                    while (it2.hasNext()) {
                        if (!regex.matches((String) it2.next())) {
                        }
                    }
                    return true;
                }
                return false;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return false;
    }
}
