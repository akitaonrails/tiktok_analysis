package X;

import android.text.TextUtils;
import android.util.Log;
import com.ss.android.account.TTAccountInit;

/* JADX INFO: renamed from: X.0XFF, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XFF {
    public static void LIZ(String str, String str2) {
        LIZLLL(3, str, str2, null);
    }

    public static void LIZIZ(String str, String str2) {
        LIZLLL(6, str, str2, null);
    }

    public static void LIZJ(String str, String str2) {
        LIZLLL(4, str, str2, null);
    }

    public static void LIZLLL(int i, String str, String str2, Throwable th) {
        if (th != null) {
            if (TextUtils.isEmpty(str2)) {
                str2 = Log.getStackTraceString(th);
            } else {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str2);
                sbLIZ.append("\n");
                sbLIZ.append(Log.getStackTraceString(th));
                str2 = C2188811AlT.LIZIZ(sbLIZ);
            }
        }
        if (!TextUtils.isEmpty(str2) && TTAccountInit.LIZJ != null) {
            TTAccountInit.LIZJ.getClass();
            C0WQI.LIZ(i, str, str2);
        }
    }
}
