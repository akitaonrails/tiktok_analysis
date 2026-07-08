package X;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: X.09N0, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09N0 {
    public static boolean LIZLLL() {
        return Build.VERSION.SDK_INT >= 29;
    }

    public static void LIZ(C0VSP c0vsp) {
        if (c0vsp == null) {
            return;
        }
        try {
            c0vsp.close();
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static void LIZIZ(OutputStream outputStream) {
        if (outputStream == null) {
            return;
        }
        try {
            outputStream.close();
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static String LJ(String str) {
        int length = str.length();
        char[] charArray = str.toCharArray();
        int i = 0;
        char c = 0;
        int i2 = 0;
        while (i < length) {
            char c2 = charArray[i];
            if (c2 != '/' || c != '/') {
                charArray[i2] = c2;
                i2++;
            }
            i++;
            c = c2;
        }
        if (c == '/' && length > 1) {
            i2--;
        }
        if (i2 != length) {
            return new String(charArray, 0, i2);
        }
        return str;
    }

    public static Bundle LIZJ(int i, int i2, String str, String str2, String[] strArr) {
        Bundle bundle = new Bundle();
        if (LIZLLL()) {
            C786410Ut5.LJJJI("android:query-arg-sql-selection", str, bundle);
            bundle.putStringArray("android:query-arg-sql-selection-args", strArr);
            if (TextUtils.isEmpty(str2)) {
                C786410Ut5.LJJJI("android:query-arg-sql-sort-order", "_id DESC", bundle);
            } else {
                C786410Ut5.LJJJI("android:query-arg-sql-sort-order", str2, bundle);
            }
            if (LIZLLL() && i > 0) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(i);
                sbLIZ.append(" offset ");
                sbLIZ.append(i2);
                C786410Ut5.LJJJI("android:query-arg-sql-limit", C2188811AlT.LIZIZ(sbLIZ), bundle);
            }
        }
        return bundle;
    }
}
