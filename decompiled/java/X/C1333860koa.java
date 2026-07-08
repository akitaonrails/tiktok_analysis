package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0koa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1333860koa {
    public static boolean LIZ;
    public static Class LIZIZ;
    public static Object LIZJ;
    public static Field LIZLLL;
    public static Class LJ;
    public static boolean LJFF;

    public static void LIZ() {
        if (LJFF) {
            return;
        }
        if (!LIZ) {
            try {
                Class<?> cls = Class.forName("android.view.WindowManagerGlobal");
                LIZLLL = cls.getDeclaredField("mViews");
                Field declaredField = cls.getDeclaredField("sDefaultWindowManager");
                LIZLLL.setAccessible(true);
                if (LIZLLL.getType() != ArrayList.class) {
                    LIZLLL.getType();
                }
                declaredField.setAccessible(true);
                LIZJ = declaredField.get(null);
            } catch (ClassNotFoundException e) {
                TryCatchGuardChecker.doCheck(e);
            } catch (IllegalAccessException e2) {
                TryCatchGuardChecker.doCheck(e2);
            } catch (NoSuchFieldException e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
            try {
                Class.forName("com.android.internal.view.menu.ListMenuItemView");
                Class.forName("com.android.internal.view.menu.MenuView$ItemView").getDeclaredMethod("getItemData", new Class[0]);
            } catch (ClassNotFoundException e4) {
                TryCatchGuardChecker.doCheck(e4);
            } catch (NoSuchMethodException e5) {
                TryCatchGuardChecker.doCheck(e5);
            }
        }
        try {
            LJ = Class.forName("com.android.internal.policy.PhoneWindow$DecorView");
        } catch (ClassNotFoundException e6) {
            try {
                TryCatchGuardChecker.doCheck(e6);
                LJ = Class.forName("com.android.internal.policy.DecorView");
            } catch (ClassNotFoundException e7) {
                TryCatchGuardChecker.doCheck(e7);
            }
        }
        try {
            LIZIZ = Class.forName("android.widget.PopupWindow$PopupDecorView");
        } catch (ClassNotFoundException e8) {
            TryCatchGuardChecker.doCheck(e8);
        }
        LJFF = true;
    }
}
