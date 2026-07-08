package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.PatternProtector;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: X.0VNz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C796930VNz {
    public static final Pattern LIZ = PatternProtector.compile("\\s*\\d+\\s*(,\\s*\\d+\\s*)?");

    public static void LIZ(StringBuilder sb, String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            sb.append(str);
            sb.append(str2);
        }
    }

    public static String LIZIZ(String str, String[] strArr, String str2, String str3) {
        if (TextUtils.isEmpty(null) && !TextUtils.isEmpty(null)) {
            throw new IllegalArgumentException("HAVING clauses are only permitted when using a groupBy clause");
        }
        if (!TextUtils.isEmpty("1") && !LIZ.matcher("1").matches()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("invalid LIMIT clauses:");
            sbLIZ.append("1");
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
        }
        StringBuilder sb = new StringBuilder(120);
        sb.append("SELECT ");
        if (strArr.length != 0) {
            int length = strArr.length;
            for (int i = 0; i < length; i++) {
                String str4 = strArr[i];
                if (str4 != null) {
                    if (i > 0) {
                        sb.append(", ");
                    }
                    sb.append(str4);
                }
            }
            sb.append(' ');
        } else {
            sb.append("* ");
        }
        sb.append("FROM ");
        sb.append(str);
        LIZ(sb, " WHERE ", str2);
        LIZ(sb, " GROUP BY ", null);
        LIZ(sb, " HAVING ", null);
        LIZ(sb, " ORDER BY ", str3);
        LIZ(sb, " LIMIT ", "1");
        return sb.toString();
    }
}
