package X;

import android.app.Activity;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.DisplayCutout;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: X.12Kk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19738012Kk implements InterfaceC1385590mA1 {
    public static final C19738012Kk LIZIZ = new C19738012Kk();

    @Override // X.InterfaceC1385590mA1
    public final Rect LIZ(Activity activity) throws Exception {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        DisplayCutout displayCutout;
        Object obj;
        int dimensionPixelSize;
        Rect rect = new Rect();
        Configuration configuration = activity.getResources().getConfiguration();
        boolean z8 = true;
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj2 = declaredField.get(configuration);
            if (activity.isInMultiWindowMode()) {
                rect.set((Rect) obj2.getClass().getDeclaredMethod("getBounds", new Class[0]).invoke(obj2, new Object[0]));
            } else {
                rect.set((Rect) obj2.getClass().getDeclaredMethod("getAppBounds", new Class[0]).invoke(obj2, new Object[0]));
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            if (e instanceof NoSuchFieldException) {
                z = true;
            } else {
                z = e instanceof NoSuchMethodException;
            }
            if (z) {
                z2 = true;
            } else {
                z2 = e instanceof IllegalAccessException;
            }
            if (z2) {
                z3 = true;
            } else {
                z3 = e instanceof InvocationTargetException;
            }
            if (z3) {
                activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
            } else {
                throw e;
            }
        }
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        if (!activity.isInMultiWindowMode()) {
            Resources resources = activity.getResources();
            int iN3 = C786410Ut5.n3(resources, "navigation_bar_height", "dimen", "android");
            if (iN3 > 0) {
                dimensionPixelSize = resources.getDimensionPixelSize(iN3);
            } else {
                dimensionPixelSize = 0;
            }
            int i = rect.bottom + dimensionPixelSize;
            if (i == point.y) {
                rect.bottom = i;
            } else {
                int i2 = rect.right + dimensionPixelSize;
                if (i2 == point.x) {
                    rect.right = i2;
                } else if (rect.left == dimensionPixelSize) {
                    rect.left = 0;
                }
            }
        }
        if ((rect.width() < point.x || rect.height() < point.y) && !activity.isInMultiWindowMode()) {
            try {
                Constructor<?> constructor = Class.forName("android.view.DisplayInfo").getConstructor(new Class[0]);
                constructor.setAccessible(true);
                Object objNewInstance = constructor.newInstance(new Object[0]);
                Method declaredMethod = defaultDisplay.getClass().getDeclaredMethod("getDisplayInfo", objNewInstance.getClass());
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(defaultDisplay, objNewInstance);
                Field declaredField2 = objNewInstance.getClass().getDeclaredField("displayCutout");
                declaredField2.setAccessible(true);
                obj = declaredField2.get(objNewInstance);
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                if (e2 instanceof ClassNotFoundException) {
                    z4 = true;
                } else {
                    z4 = e2 instanceof NoSuchMethodException;
                }
                if (z4) {
                    z5 = true;
                } else {
                    z5 = e2 instanceof NoSuchFieldException;
                }
                if (z5) {
                    z6 = true;
                } else {
                    z6 = e2 instanceof IllegalAccessException;
                }
                if (z6) {
                    z7 = true;
                } else {
                    z7 = e2 instanceof InvocationTargetException;
                }
                if (!z7) {
                    z8 = e2 instanceof InstantiationException;
                }
                if (!z8) {
                    throw e2;
                }
            }
            if (obj instanceof DisplayCutout) {
                displayCutout = (DisplayCutout) obj;
            } else {
                displayCutout = null;
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
