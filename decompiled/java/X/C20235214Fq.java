package X;

import Y.AComparatorS49S0000000_30;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.14Fq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20235214Fq {
    public static final C20235214Fq LIZ = new C20235214Fq();
    public static final Map<String, String> LIZIZ = new LinkedHashMap();
    public static final Map<String, String> LIZJ = new LinkedHashMap();

    public static String LIZ() {
        C2252061DCq c2252061DCq;
        String str;
        C2252051DCp.LIZ.getClass();
        ArrayList arrayListLIZLLL = C2252051DCp.LIZLLL(Integer.MAX_VALUE);
        if (arrayListLIZLLL != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : arrayListLIZLLL) {
                String str2 = ((C2252061DCq) obj).LJJIJ;
                if (str2 != null && str2.length() != 0) {
                    arrayList.add(obj);
                }
            }
            List listLJLLLL = C13LP.LJLLLL(new AComparatorS49S0000000_30(21), arrayList);
            if (listLJLLLL != null && (c2252061DCq = (C2252061DCq) C13LP.LJJJLL(listLJLLLL)) != null && (str = c2252061DCq.LIZ) != null) {
                return str;
            }
        }
        return "";
    }

    public static String LIZIZ() {
        return ((C0PM7) C0Q3E.LJI().uF().LIZJ()).LLILZ;
    }

    public static String LIZJ(String str) {
        if (str != null && str.length() != 0) {
            return (String) ((LinkedHashMap) LIZIZ).get(str);
        }
        return null;
    }

    public static String LIZLLL(String str) {
        if (str != null && str.length() != 0) {
            return (String) ((LinkedHashMap) LIZJ).get(str);
        }
        return null;
    }
}
