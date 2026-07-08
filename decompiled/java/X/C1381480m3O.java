package X;

import android.app.Activity;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;

/* JADX INFO: renamed from: X.0m3O, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1381480m3O {
    public static final /* synthetic */ int LIZ = 0;

    public static Rect LIZ(Activity activity) throws Throwable {
        Rect rect = new Rect();
        Display displayLLILZIL = C2204961BRm.LLILZIL(activity.getWindowManager(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP6pYZPLyHyxbBiYphYiTHLJ6Quah3JPz144QlbHrdhaO0lVfPmJvdVgaN3Q", null));
        displayLLILZIL.getRectSize(rect);
        if (!activity.isInMultiWindowMode()) {
            Point point = new Point();
            displayLLILZIL.getRealSize(point);
            int iLIZIZ = C14KI.LIZIZ(activity);
            int i = rect.bottom + iLIZIZ;
            if (i == point.y) {
                rect.bottom = i;
            } else {
                int i2 = rect.right + iLIZIZ;
                if (i2 == point.x) {
                    rect.right = i2;
                    return rect;
                }
            }
        }
        return rect;
    }
}
