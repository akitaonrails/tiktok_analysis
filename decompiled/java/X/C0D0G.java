package X;

import Y.AComparatorS503S0100000_4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0D0G, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0D0G {
    public static final C0D0G LIZ = new C0D0G();

    public static Integer LIZJ(String str) {
        String lowerCase;
        String string;
        if (str == null || (string = a0.LJLIIIL(str).toString()) == null || (lowerCase = string.toLowerCase(Locale.ROOT)) == null) {
            lowerCase = "";
        }
        if (a0.LJJJIL(lowerCase)) {
            return null;
        }
        if (!u.LJJIIJZLJL(lowerCase, "aweme://acshop/acppdp", false) && !a0.LJJIIZI(lowerCase, "//acshop/acppdp", false)) {
            if (!u.LJJIIJZLJL(lowerCase, "aweme://acshop/ucppdp", false) && !a0.LJJIIZI(lowerCase, "//acshop/ucppdp", false)) {
                return null;
            }
            return 0;
        }
        return 1;
    }

    public static String LIZLLL(String str) {
        String string;
        if (str == null || (string = a0.LJLIIIL(str).toString()) == null) {
            string = "";
        }
        if (string.length() <= 0) {
            return null;
        }
        return string;
    }

    public static List LJ(List list) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (list == null) {
            list = C13BV.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            LIZ.getClass();
            String strLIZLLL = LIZLLL(str);
            if (strLIZLLL != null && linkedHashSet.add(strLIZLLL.toLowerCase(Locale.ROOT))) {
                arrayList.add(strLIZLLL);
            }
        }
        return arrayList;
    }

    public static int LIZ(String str, String str2) {
        if (str.length() == str2.length()) {
            return str.compareTo(str2);
        }
        return Intrinsics.LJI(str.length(), str2.length());
    }

    public static String LIZIZ(String str, List list) {
        String str2;
        String strLIZLLL;
        Iterator it2 = list.iterator();
        while (true) {
            str2 = null;
            if (!it2.hasNext()) {
                break;
            }
            List list2 = (List) it2.next();
            if (list2 != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : list2) {
                    LIZ.getClass();
                    if (LIZLLL((String) obj) == null || (strLIZLLL = LIZLLL(str)) == null || (!u.LJIJI(r2, strLIZLLL, true))) {
                        arrayList.add(obj);
                    }
                }
                List listLJLLLL = C13LP.LJLLLL(new AComparatorS503S0100000_4(LIZ, 2), arrayList);
                if (listLJLLLL != null && (str2 = (String) C13LP.LJJJLL(listLJLLLL)) != null) {
                    break;
                }
            }
        }
        return str2;
    }
}
