package X;

import android.app.Activity;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.Window;
import android.view.WindowManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0eht, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1099070eht {
    public static final int LIZ(Window window) {
        Display displayLLILZIL;
        Activity activityLIZLLL;
        if (window != null || ((activityLIZLLL = C1537820q7Y.LIZLLL()) != null && (window = activityLIZLLL.getWindow()) != null)) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            WindowManager windowManager = window.getWindowManager();
            if (windowManager != null && (displayLLILZIL = C2204961BRm.LLILZIL(windowManager, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+rbJLD2SDodnu3a+ZPqatWluc10bpsrtqDEUwzWSNb", null))) != null) {
                displayLLILZIL.getRealMetrics(displayMetrics);
            }
            return displayMetrics.heightPixels;
        }
        return Resources.getSystem().getDisplayMetrics().heightPixels;
    }

    public static final String LIZIZ(String str) {
        try {
            if (str.length() != 8 && str.length() != 9) {
                if (str.length() == 6) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append('#');
                    sbLIZ.append(str);
                    return C2188811AlT.LIZIZ(sbLIZ);
                }
                return str;
            }
            if (u.LJJIIJZLJL(str, "#", false)) {
                str = C13LN.LJLJLJ(1, str);
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(C13LN.LL(2, str));
            sbLIZ2.append(C13LN.LJLL(2, str));
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append('#');
            sbLIZ3.append(strLIZIZ);
            return C2188811AlT.LIZIZ(sbLIZ3);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return "#00000000";
        }
    }
}
