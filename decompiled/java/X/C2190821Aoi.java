package X;

import android.icu.util.ULocale;
import android.os.Build;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: X.1Aoi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2190821Aoi {
    public static HashMap LIZ(Object obj, List list, List list2) {
        C2190841Aok c2190841Aok;
        InterfaceC2190701AoW<?> c2192801Aru;
        Object obj2;
        HashMap map = new HashMap();
        String str = (String) C20129313pT.LIZ(obj, "localeMatcher");
        int i = 0;
        if (Build.VERSION.SDK_INT >= 24 && !str.equals("lookup")) {
            String[] strArr = (String[]) list.toArray(new String[list.size()]);
            c2190841Aok = new C2190841Aok();
            int length = strArr.length;
            while (true) {
                if (i < length) {
                    InterfaceC2190701AoW interfaceC2190701AoWLIZ = C2190551AoH.LIZ(strArr[i]);
                    ULocale uLocaleLIZIZ = C2190831Aoj.LIZIZ(interfaceC2190701AoWLIZ);
                    if (uLocaleLIZIZ != null) {
                        c2190841Aok.LIZ = new C2190541AoG(uLocaleLIZIZ);
                        c2190841Aok.LIZIZ = interfaceC2190701AoWLIZ.LIZ();
                        break;
                    }
                    i++;
                } else {
                    c2190841Aok.LIZ = new C2190541AoG(ULocale.getDefault(ULocale.Category.FORMAT));
                    break;
                }
            }
        } else {
            String[] strArr2 = (String[]) list.toArray(new String[list.size()]);
            String[] strArrLIZLLL = C2190831Aoj.LIZLLL();
            c2190841Aok = new C2190841Aok();
            int length2 = strArr2.length;
            while (true) {
                if (i < length2) {
                    InterfaceC2190701AoW interfaceC2190701AoWLIZ2 = C2190551AoH.LIZ(strArr2[i]);
                    String strLIZ = C2190831Aoj.LIZ(interfaceC2190701AoWLIZ2.LJ(), strArrLIZLLL);
                    if (!strLIZ.isEmpty()) {
                        c2190841Aok.LIZ = C2190551AoH.LIZ(strLIZ);
                        c2190841Aok.LIZIZ = interfaceC2190701AoWLIZ2.LIZ();
                        break;
                    }
                    i++;
                } else {
                    if (Build.VERSION.SDK_INT >= 24) {
                        c2192801Aru = new C2190541AoG(ULocale.getDefault(ULocale.Category.FORMAT));
                    } else {
                        c2192801Aru = new C2192801Aru(Locale.getDefault());
                    }
                    c2190841Aok.LIZ = c2192801Aru;
                }
            }
        }
        HashSet<String> hashSet = new HashSet();
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            String str2 = (String) it2.next();
            C20129213pS c20129213pS = C20129313pT.LIZIZ;
            if (!c2190841Aok.LIZIZ.isEmpty() && c2190841Aok.LIZIZ.containsKey(str2)) {
                String str3 = c2190841Aok.LIZIZ.get(str2);
                boolean zIsEmpty = str3.isEmpty();
                String str4 = str3;
                if (zIsEmpty) {
                    str4 = "true";
                }
                hashSet.add(str2);
                obj2 = str4;
            } else {
                obj2 = c20129213pS;
            }
            Object obj3 = obj2;
            if (((HashMap) obj).containsKey(str2)) {
                Object objLIZ = C20129313pT.LIZ(obj, str2);
                boolean z = objLIZ instanceof String;
                Object bool = objLIZ;
                if (z) {
                    boolean zIsEmpty2 = ((String) objLIZ).isEmpty();
                    bool = objLIZ;
                    if (zIsEmpty2) {
                        bool = new Boolean(true);
                    }
                }
                obj3 = obj2;
                if (!(bool instanceof C20129413pU)) {
                    boolean zEquals = bool.equals(obj2);
                    obj3 = obj2;
                    if (!zEquals) {
                        hashSet.remove(str2);
                        obj3 = bool;
                    }
                }
            }
            boolean z2 = obj3 instanceof C20129213pS;
            Object objLIZIZ = obj3;
            if (!z2) {
                objLIZIZ = C2190211Anj.LIZIZ(obj3, str2);
            }
            if ((objLIZIZ instanceof String) && !C2190211Anj.LIZ(str2, (String) objLIZIZ, c2190841Aok.LIZ)) {
                map.put(str2, c20129213pS);
            } else {
                map.put(str2, objLIZIZ);
            }
        }
        for (String str5 : hashSet) {
            ArrayList<String> arrayList = new ArrayList<>();
            String str6 = (String) C2190211Anj.LIZIZ(c2190841Aok.LIZIZ.get(str5), str5);
            if (!(str6 instanceof String) || C2190211Anj.LIZ(str5, str6, c2190841Aok.LIZ)) {
                arrayList.add(str6);
                c2190841Aok.LIZ.LJFF(str5, arrayList);
            }
        }
        map.put("locale", c2190841Aok.LIZ);
        return map;
    }
}
