package X;

import java.util.HashMap;
import java.util.Set;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.018K, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C018K {
    public final String LIZIZ;
    public final HashMap<String, String> LIZ = new HashMap<>();
    public final String LIZJ = "UTF-8";

    public final String LIZIZ() {
        if (this.LIZ.isEmpty()) {
            return this.LIZIZ;
        }
        HashMap<String, String> map = this.LIZ;
        String str = this.LIZJ;
        StringBuilder sb = new StringBuilder();
        Set<String> setKeySet = map.keySet();
        String string = "";
        if (setKeySet != null && !setKeySet.isEmpty()) {
            for (String str2 : setKeySet) {
                String strLIZ = C018J.LIZ(str2, str);
                String str3 = map.get(str2);
                String strLIZ2 = str3 != null ? C018J.LIZ(str3, str) : "";
                if (sb.length() > 0) {
                    sb.append("&");
                }
                sb.append(strLIZ);
                sb.append("=");
                sb.append(strLIZ2);
            }
            string = sb.toString();
        }
        String str4 = this.LIZIZ;
        if (str4 == null || str4.length() == 0) {
            return string;
        }
        if (a0.LJJIZ(this.LIZIZ, '?', 0, false, 6) >= 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.LIZIZ);
            sbLIZ.append('&');
            sbLIZ.append(string);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(this.LIZIZ);
        sbLIZ2.append('?');
        sbLIZ2.append(string);
        return C2188811AlT.LIZIZ(sbLIZ2);
    }

    public final String toString() {
        return LIZIZ();
    }

    public C018K(String str) {
        this.LIZIZ = str;
    }

    public final void LIZ(String str, String str2) {
        this.LIZ.put(str, str2);
    }
}
