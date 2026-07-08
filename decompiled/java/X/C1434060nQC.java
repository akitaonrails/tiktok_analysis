package X;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0nQC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1434060nQC {
    public static void LIZ(String str) {
        String str2;
        Map<String, List<InterfaceC1433860nPs>> map = C1434050nQB.LLJILJIL;
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        List list = (List) ((LinkedHashMap) map).get(str2);
        if (list != null) {
            list.clear();
        }
        C19719512Dh.LIZJ(map).remove(str);
    }
}
