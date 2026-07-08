package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0YJC, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YJC {
    public final C0YJE LIZ;

    public C0YJC() {
        this(100);
    }

    public C0YJC(int i) {
        this.LIZ = new C0YJE(i);
    }

    public final void LIZLLL(String str) {
        if (str.length() == 0) {
            return;
        }
        C0YJE c0yje = this.LIZ;
        c0yje.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append('_');
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        Set<String> setKeySet = c0yje.LIZ.snapshot().keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : setKeySet) {
            if (u.LJJIIJZLJL((String) obj, strLIZIZ, false)) {
                arrayList.add(obj);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            c0yje.LIZ.remove((String) it2.next());
        }
    }

    public static String LIZIZ(String str, String str2) {
        if (str.length() != 0 && str2.length() != 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append('_');
            sbLIZ.append(str2);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        return null;
    }

    public final String LIZ(String str, String str2) {
        String strLIZIZ = LIZIZ(str, str2);
        if (strLIZIZ != null) {
            C0YJF c0yjf = this.LIZ.LIZ.get(strLIZIZ);
            if (c0yjf instanceof C0YJD) {
                return ((C0YJD) c0yjf).LIZ;
            }
            return null;
        }
        return null;
    }

    public final void LIZJ(String str, String str2, String str3) {
        String strLIZIZ;
        C0YJF c0yjd;
        if (str.length() != 0 && str2.length() != 0 && (strLIZIZ = LIZIZ(str, str2)) != null) {
            C0YJE c0yje = this.LIZ;
            c0yje.getClass();
            if (str3 != null) {
                c0yjd = new C0YJD(str3);
            } else {
                c0yjd = new C0YJF() { // from class: X.0YJG
                };
            }
            c0yje.LIZ.put(strLIZIZ, c0yjd);
        }
    }
}
