package X;

import android.content.SharedPreferences;
import com.bytedance.bpea.basics.Cert;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0hYN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1208490hYN {
    public final SharedPreferences LIZ;
    public final Map<String, Integer> LIZIZ = Collections.synchronizedMap(new HashMap());
    public final Map<String, Integer> LIZJ = Collections.synchronizedMap(new HashMap());
    public final Map<String, Integer> LIZLLL = Collections.synchronizedMap(new HashMap());
    public final Map<String, Long> LJ = Collections.synchronizedMap(new HashMap());

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, Integer> entry : this.LIZIZ.entrySet()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("lastResult: ");
            sbLIZ.append(entry.getKey());
            sbLIZ.append(": ");
            sbLIZ.append(entry.getValue());
            sbLIZ.append(' ');
            sb.append(C2188811AlT.LIZIZ(sbLIZ));
        }
        for (Map.Entry<String, Integer> entry2 : this.LIZJ.entrySet()) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("count: ");
            sbLIZ2.append(entry2.getKey());
            sbLIZ2.append(": ");
            sbLIZ2.append(entry2.getValue());
            sbLIZ2.append(' ');
            sb.append(C2188811AlT.LIZIZ(sbLIZ2));
        }
        for (Map.Entry<String, Integer> entry3 : this.LIZLLL.entrySet()) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("rejectCount: ");
            sbLIZ3.append(entry3.getKey());
            sbLIZ3.append(": ");
            sbLIZ3.append(entry3.getValue());
            sbLIZ3.append(' ');
            sb.append(C2188811AlT.LIZIZ(sbLIZ3));
        }
        for (Map.Entry<String, Long> entry4 : this.LJ.entrySet()) {
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("lastPopupTime: ");
            sbLIZ4.append(entry4.getKey());
            sbLIZ4.append(": ");
            sbLIZ4.append(entry4.getValue());
            sbLIZ4.append(' ');
            sb.append(C2188811AlT.LIZIZ(sbLIZ4));
        }
        return sb.toString();
    }

    public C1208490hYN(SharedPreferences sharedPreferences) {
        this.LIZ = sharedPreferences;
    }

    public final int LIZ(Cert cert) {
        String strCertToken = cert.certToken();
        if (strCertToken == null) {
            return 0;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("system_promote_count_");
        sbLIZ.append(strCertToken);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        Integer num = this.LIZJ.get(strLIZIZ);
        if (num != null) {
            return num.intValue();
        }
        int i = this.LIZ.getInt(strLIZIZ, 0);
        this.LIZJ.put(strLIZIZ, Integer.valueOf(i));
        return i;
    }
}
