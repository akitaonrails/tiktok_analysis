package X;

import android.app.Activity;
import android.content.res.Configuration;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.DisplayCutout;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: X.12Kl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19738112Kl {
    public static Rect LIZ(Activity activity) throws Throwable {
        Rect rect = new Rect();
        Configuration configuration = activity.getResources().getConfiguration();
        DisplayCutout displayCutout = null;
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            if (activity.isInMultiWindowMode()) {
                rect.set((Rect) obj.getClass().getDeclaredMethod("getBounds", new Class[0]).invoke(obj, new Object[0]));
            } else {
                rect.set((Rect) obj.getClass().getDeclaredMethod("getAppBounds", new Class[0]).invoke(obj, new Object[0]));
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C2204961BRm.LLILZIL(activity.getWindowManager(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP6pYZPLyHyxbBiYphYiTHLJ6Quah3JPz144QlbHrdhaO0lVfPmJvdVgaN3c", null)).getRectSize(rect);
        }
        Display displayLLILZIL = C2204961BRm.LLILZIL(activity.getWindowManager(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP6pYZPLyHyxbBiYphYiTHLJ6Quah3JPz144QlbHrdhaO0lVfPmJvdVgaN3c", null));
        Point point = new Point();
        displayLLILZIL.getRealSize(point);
        if (!activity.isInMultiWindowMode()) {
            int iLIZIZ = C14KI.LIZIZ(activity);
            int i = rect.bottom + iLIZIZ;
            if (i == point.y) {
                rect.bottom = i;
            } else {
                int i2 = rect.right + iLIZIZ;
                if (i2 == point.x) {
                    rect.right = i2;
                } else if (rect.left == iLIZIZ) {
                    rect.left = 0;
                }
            }
        }
        if ((rect.width() < point.x || rect.height() < point.y) && !activity.isInMultiWindowMode()) {
            try {
                Constructor<?> constructor = Class.forName("android.view.DisplayInfo").getConstructor(new Class[0]);
                constructor.setAccessible(true);
                Object objNewInstance = constructor.newInstance(new Object[0]);
                Method declaredMethod = displayLLILZIL.getClass().getDeclaredMethod("getDisplayInfo", objNewInstance.getClass());
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(displayLLILZIL, objNewInstance);
                Field declaredField2 = objNewInstance.getClass().getDeclaredField("displayCutout");
                declaredField2.setAccessible(true);
                Object obj2 = declaredField2.get(objNewInstance);
                if (obj2 instanceof DisplayCutout) {
                    displayCutout = (DisplayCutout) obj2;
                }
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            if (displayCutout != null) {
                if (rect.left == displayCutout.getSafeInsetLeft()) {
                    rect.left = 0;
                }
                if (point.x - rect.right == displayCutout.getSafeInsetRight()) {
                    rect.right += displayCutout.getSafeInsetRight();
                }
                if (rect.top == displayCutout.getSafeInsetTop()) {
                    rect.top = 0;
                }
                if (point.y - rect.bottom == displayCutout.getSafeInsetBottom()) {
                    rect.bottom += displayCutout.getSafeInsetBottom();
                }
            }
        }
        return rect;
    }
}
