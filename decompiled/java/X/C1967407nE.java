package X;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: X.07nE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1967407nE {
    public static Field LIZ;
    public static Field LIZIZ;

    public static boolean LIZ() {
        if (LIZ == null) {
            try {
                Field declaredField = Class.forName("android.view.ViewGroup").getDeclaredField("mFirstTouchTarget");
                LIZ = declaredField;
                if (declaredField != null) {
                    declaredField.setAccessible(true);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            try {
                Field field = LIZ;
                if (field != null) {
                    Class<?> type = field.getType();
                    Field declaredField2 = type != null ? type.getDeclaredField("child") : null;
                    LIZIZ = declaredField2;
                    if (declaredField2 != null) {
                        declaredField2.setAccessible(true);
                    }
                }
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
        return (LIZ == null || LIZIZ == null) ? false : true;
    }

    public static View LIZIZ(ViewGroup viewGroup) {
        View viewLIZJ;
        if (viewGroup == null || !LIZ()) {
            return null;
        }
        View viewLIZJ2 = LIZJ(viewGroup);
        while ((viewLIZJ2 instanceof ViewGroup) && (viewLIZJ = LIZJ((ViewGroup) viewLIZJ2)) != null) {
            viewLIZJ2 = viewLIZJ;
        }
        return viewLIZJ2;
    }

    public static View LIZJ(ViewGroup viewGroup) {
        Object obj;
        Object obj2;
        try {
            Field field = LIZ;
            if (field != null) {
                obj = field.get(viewGroup);
            } else {
                obj = null;
            }
            if (obj != null) {
                Field field2 = LIZIZ;
                if (field2 != null) {
                    obj2 = field2.get(obj);
                } else {
                    obj2 = null;
                }
                if (obj2 instanceof View) {
                    return (View) obj2;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return null;
    }
}
