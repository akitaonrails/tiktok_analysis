package X;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0Qvm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C686160Qvm {
    public ArrayList<String> LIZ;
    public ArrayList<String> LIZIZ;
    public ArrayList<String> LIZJ;

    public static boolean LIZ(String str, ArrayList arrayList) {
        if (arrayList == null) {
            return false;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            if (((String) it2.next()).equals(str)) {
                return true;
            }
        }
        return false;
    }
}
