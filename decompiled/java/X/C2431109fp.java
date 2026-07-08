package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;

/* JADX INFO: renamed from: X.09fp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2431109fp {
    public static String LIZ(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        long jLongValue = CastLongProtector.valueOf(str).longValue();
        StringBuilder sb = new StringBuilder();
        do {
            long j = jLongValue % 23;
            jLongValue /= 23;
            if (j > 9) {
                sb.insert(0, (char) ((j + 97) - 10));
            } else {
                sb.insert(0, j);
            }
        } while (jLongValue != 0);
        return sb.toString();
    }
}
