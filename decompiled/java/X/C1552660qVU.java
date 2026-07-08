package X;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: X.0qVU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1552660qVU {
    public static final C1552660qVU LIZ = new C1552660qVU();

    public static void LIZ(List list) {
        SharedPreferences sharedPreferencesLIZJ;
        Context contextLJ;
        Set<String> setLIZ;
        Context contextLJ2;
        C1551940qUK c1551940qUK = C797990VSb.LIZ;
        Context contextLJ3 = c1551940qUK.LJ();
        if (contextLJ3 != null && (sharedPreferencesLIZJ = C810670Vr7.LIZJ(contextLJ3, 0, "gecko_ng_invalid_records")) != null && (contextLJ = c1551940qUK.LJ()) != null && (setLIZ = C1551440qTW.LIZ.LIZ(contextLJ, "gecko_ng_invalid_list")) != null) {
            int size = setLIZ.size();
            SharedPreferences.Editor editorEdit = sharedPreferencesLIZJ.edit();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                String string = ((C1552740qVc) it2.next()).toString();
                if (sharedPreferencesLIZJ.contains(string)) {
                    editorEdit.remove(string);
                }
                setLIZ.remove(string);
            }
            editorEdit.apply();
            if (setLIZ.size() != size && (contextLJ2 = C797990VSb.LIZ.LJ()) != null) {
                C1551440qTW.LIZ.LIZLLL(contextLJ2, "gecko_ng_invalid_list", setLIZ);
            }
        }
    }
}
