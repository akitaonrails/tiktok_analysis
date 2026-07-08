package X;

import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.view.Display;
import android.view.WindowManager;

/* JADX INFO: renamed from: X.0FV3, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FV3 {
    public static final int LIZ(Context context) throws Throwable {
        WindowManager windowManager = (WindowManager) C786410Ut5.H2(context, "window");
        if (Build.VERSION.SDK_INT >= 30) {
            return C2204961BRm.LLILZ(windowManager, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOytZpuA2j51l9z9J68r4AfOrHoac1GKrtz7wnpJccPqjDE=", null)).getBounds().height();
        }
        Display displayLLILZIL = C2204961BRm.LLILZIL(windowManager, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOytZpuA2j51l9z9J68r4AfOrHoac1GKrtz7wnpJccPqjDE=", null));
        Point point = new Point();
        displayLLILZIL.getRealSize(point);
        return point.y;
    }
}
