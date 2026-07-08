package X;

import android.util.Log;
import java.util.Map;
import kotlin.Pair;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0OGH, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OGH {
    public static Map LIZ(Exception exc) {
        String strLJJIFFI;
        String strLJLJLJ;
        String strLJJIFFI2;
        String string = exc.toString();
        String stackTraceString = Log.getStackTraceString(exc);
        Object objLJJJLL = C13LP.LJJJLL(a0.LJJLIIIJILLIZJL(string, new String[]{":"}, 2, 2));
        String str = "";
        if (objLJJJLL == null) {
            objLJJJLL = "";
        }
        if (stackTraceString != null && (strLJLJLJ = C13LN.LJLJLJ(string.length(), stackTraceString)) != null && (strLJJIFFI2 = u.LJJIFFI(strLJLJLJ, "android.database.sqlite", "adr", false)) != null) {
            strLJJIFFI = u.LJJIFFI(strLJJIFFI2, "androidx.sqlite.db.framework", "adrx", false);
        } else {
            strLJJIFFI = null;
        }
        Pair[] pairArr = new Pair[3];
        pairArr[0] = new Pair("error", string);
        pairArr[1] = new Pair("error_class", objLJJJLL);
        if (strLJJIFFI != null) {
            str = strLJJIFFI;
        }
        pairArr[2] = new Pair("error_stack", str);
        return C2097608Jq.LJIIIIZZ(pairArr);
    }
}
