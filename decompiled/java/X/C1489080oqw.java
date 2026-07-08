package X;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0oqw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1489080oqw {
    public View LIZIZ;
    public final Map<String, Object> LIZ = new HashMap();
    public final ArrayList<AbstractC21463118z7> LIZJ = new ArrayList<>();

    public final int hashCode() {
        return (this.LIZIZ.hashCode() * 31) + this.LIZ.hashCode();
    }

    public C1489080oqw() {
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TransitionValues@");
        sbLIZ.append(Integer.toHexString(hashCode()));
        sbLIZ.append(":\n");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(strLIZIZ);
        sbLIZ2.append("    view = ");
        sbLIZ2.append(this.LIZIZ);
        sbLIZ2.append("\n");
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(strLIZIZ2);
        sbLIZ3.append("    values:");
        String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ3);
        for (String str : ((HashMap) this.LIZ).keySet()) {
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append(strLIZIZ3);
            sbLIZ4.append("    ");
            sbLIZ4.append(str);
            sbLIZ4.append(": ");
            sbLIZ4.append(((HashMap) this.LIZ).get(str));
            sbLIZ4.append("\n");
            strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ4);
        }
        return strLIZIZ3;
    }

    public C1489080oqw(View view) {
        this.LIZIZ = view;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1489080oqw) {
            C1489080oqw c1489080oqw = (C1489080oqw) obj;
            if (this.LIZIZ == c1489080oqw.LIZIZ && this.LIZ.equals(c1489080oqw.LIZ)) {
                return true;
            }
            return false;
        }
        return false;
    }
}
