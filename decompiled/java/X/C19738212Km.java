package X;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.inputmethodservice.InputMethodService;
import android.os.Build;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.WindowManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: X.12Km, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19738212Km implements C0IKF {
    public static final C19738212Km LIZIZ = new C19738212Km();

    static {
        C1697810uHb.LJ(1, 2, 4, 8, 16, 32, 64, 128);
    }

    public static final C19738412Ko LIZ(Activity activity) throws Exception {
        Rect rect;
        int i;
        C20246014Ju c20246014JuLIZ;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            rect = C2204961BRm.LLILZ((WindowManager) activity.getSystemService(WindowManager.class), new C0WZX("dTF6Tg0zW9KSQl4vQR2TKA0Eo9m7BJCp0EOADDME/pXd5zhXdk3m50MijEiCZeJM/MQvHg==", new String[]{"01789"})).getBounds();
        } else {
            int dimensionPixelSize = 0;
            if (i2 >= 29) {
                Configuration configuration = activity.getResources().getConfiguration();
                try {
                    Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
                    declaredField.setAccessible(true);
                    Object obj = declaredField.get(configuration);
                    rect = new Rect((Rect) obj.getClass().getDeclaredMethod("getBounds", new Class[0]).invoke(obj, new Object[0]));
                } catch (IllegalAccessException e) {
                    TryCatchGuardChecker.doCheck(e);
                    rect = LIZLLL(activity);
                } catch (NoSuchFieldException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    rect = LIZLLL(activity);
                } catch (NoSuchMethodException e3) {
                    TryCatchGuardChecker.doCheck(e3);
                    rect = LIZLLL(activity);
                } catch (InvocationTargetException e4) {
                    TryCatchGuardChecker.doCheck(e4);
                    rect = LIZLLL(activity);
                }
            } else if (i2 >= 28) {
                rect = LIZLLL(activity);
            } else if (i2 >= 24) {
                rect = new Rect();
                Display displayLLILZIL = C2204961BRm.LLILZIL(activity.getWindowManager(), new C0WZX("dTF6Tg0zW9KSQl4vQR2TKA0Eo9m7BJCLzUSITQcm9ZWhL+3mRcnFLV8IRx94PnLQTzQYHA==", new String[]{"01789"}));
                displayLLILZIL.getRectSize(rect);
                if (!activity.isInMultiWindowMode()) {
                    Point point = new Point();
                    displayLLILZIL.getRealSize(point);
                    Resources resources = activity.getResources();
                    int iN3 = C786410Ut5.n3(resources, "navigation_bar_height", "dimen", "android");
                    if (iN3 > 0) {
                        dimensionPixelSize = resources.getDimensionPixelSize(iN3);
                    }
                    int i3 = rect.bottom + dimensionPixelSize;
                    if (i3 == point.y) {
                        rect.bottom = i3;
                    } else {
                        int i4 = rect.right + dimensionPixelSize;
                        if (i4 == point.x) {
                            rect.right = i4;
                        }
                    }
                }
            } else {
                Display displayLLILZIL2 = C2204961BRm.LLILZIL(activity.getWindowManager(), new C0WZX("dTF6Tg0zW9KSQl4vQR2TKA0Eo9m7BJCLzUSITQcm9ZWhL+3mRcnFLV8IRx94PnLQTzQYHA==", new String[]{"01789"}));
                Point point2 = new Point();
                displayLLILZIL2.getRealSize(point2);
                rect = new Rect();
                int i5 = point2.x;
                if (i5 != 0 && (i = point2.y) != 0) {
                    rect.right = i5;
                    rect.bottom = i;
                } else {
                    displayLLILZIL2.getRectSize(rect);
                }
            }
        }
        if (Build.VERSION.SDK_INT >= 30) {
            c20246014JuLIZ = LJ(activity);
        } else {
            c20246014JuLIZ = new C20246414Jy().LIZ();
        }
        return new C19738412Ko(new C19738512Kp(rect), c20246014JuLIZ);
    }

    public static final C19738412Ko LIZJ(Context context) throws Exception {
        Rect rect;
        C20246014Ju c20246014JuLIZ;
        if (Build.VERSION.SDK_INT >= 30) {
            rect = ((WindowManager) context.getSystemService(WindowManager.class)).getMaximumWindowMetrics().getBounds();
            c20246014JuLIZ = LJ(context);
        } else {
            Display displayLLILZIL = C2204961BRm.LLILZIL((WindowManager) C786410Ut5.H2(context, "window"), new C0WZX("dTF6Tg0zW9KSQl4vQR2TKA0Eo9m7BJCLzUSITQcm9ZWhL+3mRcnFLV8IRx94PnLQTzQYHA==", new String[]{"01789"}));
            Point point = new Point();
            displayLLILZIL.getRealSize(point);
            rect = new Rect(0, 0, point.x, point.y);
            c20246014JuLIZ = new C20246414Jy().LIZ();
        }
        return new C19738412Ko(new C19738512Kp(rect), c20246014JuLIZ);
    }

    public static Rect LIZLLL(Activity activity) throws Throwable {
        DisplayCutout displayCutout;
        Object obj;
        int dimensionPixelSize;
        Rect rect = new Rect();
        Configuration configuration = activity.getResources().getConfiguration();
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj2 = declaredField.get(configuration);
            if (activity.isInMultiWindowMode()) {
                rect.set((Rect) obj2.getClass().getDeclaredMethod("getBounds", new Class[0]).invoke(obj2, new Object[0]));
            } else {
                rect.set((Rect) obj2.getClass().getDeclaredMethod("getAppBounds", new Class[0]).invoke(obj2, new Object[0]));
            }
        } catch (IllegalAccessException e) {
            TryCatchGuardChecker.doCheck(e);
            LJFF(activity, rect);
        } catch (NoSuchFieldException e2) {
            TryCatchGuardChecker.doCheck(e2);
            LJFF(activity, rect);
        } catch (NoSuchMethodException e3) {
            TryCatchGuardChecker.doCheck(e3);
            LJFF(activity, rect);
        } catch (InvocationTargetException e4) {
            TryCatchGuardChecker.doCheck(e4);
            LJFF(activity, rect);
        }
        Display displayLLILZIL = C2204961BRm.LLILZIL(activity.getWindowManager(), new C0WZX("dTF6Tg0zW9KSQl4vQR2TKA0Eo9m7BJCLzUSITQcm9ZWhL+3mRcnFLV8IRx94PnLQTzQYHA==", new String[]{"01789"}));
        Point point = new Point();
        displayLLILZIL.getRealSize(point);
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
                Method declaredMethod = displayLLILZIL.getClass().getDeclaredMethod("getDisplayInfo", objNewInstance.getClass());
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(displayLLILZIL, objNewInstance);
                Field declaredField2 = objNewInstance.getClass().getDeclaredField("displayCutout");
                declaredField2.setAccessible(true);
                obj = declaredField2.get(objNewInstance);
            } catch (ClassNotFoundException e5) {
                TryCatchGuardChecker.doCheck(e5);
            } catch (IllegalAccessException e6) {
                TryCatchGuardChecker.doCheck(e6);
            } catch (InstantiationException e7) {
                TryCatchGuardChecker.doCheck(e7);
            } catch (NoSuchFieldException e8) {
                TryCatchGuardChecker.doCheck(e8);
            } catch (NoSuchMethodException e9) {
                TryCatchGuardChecker.doCheck(e9);
            } catch (InvocationTargetException e10) {
                TryCatchGuardChecker.doCheck(e10);
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

    public static C20246014Ju LJ(Context context) throws Exception {
        if (Build.VERSION.SDK_INT >= 30) {
            return C20246014Ju.LJIIJJI(null, C2204961BRm.LLILZ((WindowManager) context.getSystemService(WindowManager.class), new C0WZX("dTF6Tg0zW9KSQl4vQR2TKA0Eo9m7BJCp0EOADDME/pXd5zhXdk3m50MijEiCZeJM/MQvHg==", new String[]{"01789"})).getWindowInsets());
        }
        throw new Exception("Incompatible SDK version");
    }

    public final C19738412Ko LIZIZ(Context context) {
        if (Build.VERSION.SDK_INT >= 30) {
            WindowManager windowManager = (WindowManager) context.getSystemService(WindowManager.class);
            return new C19738412Ko(C2204961BRm.LLILZ(windowManager, new C0WZX("dTF6Tg0zW9KSQl4vQR2TKA0Eo9m7BJCp0EOADDME/pXd5zhXdk3m50MijEiCZeJM/MQvHg==", new String[]{"01789"})).getBounds(), C20246014Ju.LJIIJJI(null, C2204961BRm.LLILZ(windowManager, new C0WZX("dTF6Tg0zW9KSQl4vQR2TKA0Eo9m7BJCp0EOADDME/pXd5zhXdk3m50MijEiCZeJM/MQvHg==", new String[]{"01789"})).getWindowInsets()));
        }
        Context baseContext = context;
        while (baseContext instanceof ContextWrapper) {
            if (baseContext instanceof Activity) {
                return LIZ((Activity) context);
            }
            if (!(baseContext instanceof InputMethodService)) {
                ContextWrapper contextWrapper = (ContextWrapper) baseContext;
                if (contextWrapper.getBaseContext() != null) {
                    baseContext = contextWrapper.getBaseContext();
                }
            }
            if (baseContext instanceof InputMethodService) {
                Display displayLLILZIL = C2204961BRm.LLILZIL((WindowManager) C786410Ut5.H2(context, "window"), new C0WZX("dTF6Tg0zW9KSQl4vQR2TKA0Eo9m7BJCLzUSITQcm9ZWhL+3mRcnFLV8IRx94PnLQTzQYHA==", new String[]{"01789"}));
                Point point = new Point();
                displayLLILZIL.getRealSize(point);
                return new C19738412Ko(new Rect(0, 0, point.x, point.y), new C20246414Jy().LIZ());
            }
            throw new IllegalArgumentException(context + " is not a UiContext");
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Context ");
        sbLIZ.append(context);
        sbLIZ.append(" is not a UiContext");
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static void LJFF(Activity activity, Rect rect) {
        C2204961BRm.LLILZIL(activity.getWindowManager(), new C0WZX("dTF6Tg0zW9KSQl4vQR2TKA0Eo9m7BJCLzUSITQcm9ZWhL+3mRcnFLV8IRx94PnLQTzQYHA==", new String[]{"01789"})).getRectSize(rect);
    }
}
