package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0XLM, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XLM {
    public final Map<String, List<String>> LIZ = new LinkedHashMap();

    public final String LIZJ(String str) {
        List list = (List) ((LinkedHashMap) this.LIZ).get(str);
        if (list != null) {
            return (String) C13LP.LJJJLL(list);
        }
        return null;
    }

    public final void LIZ(String str, String str2) {
        String strLIZJ;
        String strLIZJ2 = C0XLR.LIZJ(0, str.length(), str, true);
        if (str2 == null) {
            strLIZJ = null;
        } else {
            strLIZJ = C0XLR.LIZJ(0, str2.length(), str2, true);
        }
        List<String> arrayList = (List) ((LinkedHashMap) this.LIZ).get(strLIZJ2);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.LIZ.put(strLIZJ2, arrayList);
        }
        arrayList.add(strLIZJ);
    }

    public final void LIZIZ(String str, String str2) {
        String strLIZIZ;
        String strLIZIZ2 = C0XLR.LIZIZ(str, true, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", true);
        if (str2 != null) {
            strLIZIZ = C0XLR.LIZIZ(str2, true, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", true);
        } else {
            strLIZIZ = null;
        }
        LIZ(strLIZIZ2, strLIZIZ);
    }

    public final void LIZLLL(String str, String str2) {
        List list = (List) ((LinkedHashMap) this.LIZ).get(str);
        if (list != null) {
            list.clear();
        }
        LIZIZ(str, str2);
    }

    public final void LJ(String str, String str2) {
        List list = (List) ((LinkedHashMap) this.LIZ).get(str);
        if (list != null) {
            list.clear();
        }
        LIZIZ(str, str2);
    }
}
