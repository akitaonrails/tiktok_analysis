package X;

import android.content.Context;
import android.graphics.Point;
import android.view.Display;
import android.view.WindowManager;

/* JADX INFO: renamed from: X.0FVe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C391120FVe {
    public static final float LIZ(Context context) throws Throwable {
        Display displayLLILZIL = C2204961BRm.LLILZIL((WindowManager) C786410Ut5.H2(context, "window"), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPm8apzF2SAT8Yr+kSnfiy0XURUWbVwvh/Rt/+/rzMAe78HwR161C3lxHoKo4n76rQ9T6rqb2w==", null));
        Point point = new Point();
        displayLLILZIL.getSize(point);
        int i = point.x;
        float fLIZIZ = C11VU.LIZIZ(12.0f, context);
        float fLIZIZ2 = C11VU.LIZIZ(20.0f, context);
        float fLIZIZ3 = C11VU.LIZIZ(52.0f, context);
        float fLIZIZ4 = C11VU.LIZIZ(80.0f, context);
        float f = (float) (((double) ((i - fLIZIZ2) - (fLIZIZ * 5))) / 5.3d);
        if (f >= fLIZIZ3) {
            if (f > fLIZIZ4) {
                fLIZIZ3 = fLIZIZ4;
            } else {
                fLIZIZ3 = f;
            }
        }
        return fLIZIZ3 + C11VU.LIZIZ(12.0f, context);
    }
}
