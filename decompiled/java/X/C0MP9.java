package X;

import com.ss.android.ugc.templatecore.templatedata.MvThemeData;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0MP9, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MP9 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(boolean z, MvThemeData mvThemeData, Pair pair) {
        String strLIZLLL;
        String strLJ;
        String string;
        Object second;
        if (z) {
            C1637890six.LJ("mv_template_process_error_rate", 0, null);
            return;
        }
        C543670LTx c543670LTx = new C543670LTx();
        Object obj = "";
        if (mvThemeData == null || (strLIZLLL = mvThemeData.LIZLLL()) == null) {
            strLIZLLL = "";
        }
        c543670LTx.LIZ.put("url", strLIZLLL);
        if (mvThemeData == null || (strLJ = mvThemeData.LJ()) == null) {
            strLJ = "";
        }
        c543670LTx.LIZ.put("mv_res_id", strLJ);
        if (pair == null || (string = Integer.valueOf(((Number) pair.getFirst()).intValue()).toString()) == null) {
            string = "";
        }
        c543670LTx.LIZ.put("error_code", string);
        if (pair != null && (second = pair.getSecond()) != null) {
            obj = second;
        }
        c543670LTx.LIZ.put("error_message", obj);
        C1637890six.LJ("mv_template_process_error_rate", 1, c543670LTx.LJ());
    }
}
