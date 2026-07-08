package X;

import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: X.07mc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1963607mc {
    public static Object LIZ(View view) {
        if (view != null && view.isAttachedToWindow()) {
            try {
                Field declaredField = View.class.getDeclaredField("mAttachInfo");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(view);
                if (obj == null) {
                    return null;
                }
                Field declaredField2 = Class.forName("android.view.View$AttachInfo").getDeclaredField("mViewRootImpl");
                declaredField2.setAccessible(true);
                return declaredField2.get(obj);
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return null;
    }

    public static void LIZIZ(View view) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException {
        Object objLIZ = LIZ(view);
        if (objLIZ != null) {
            Field declaredField = objLIZ.getClass().getDeclaredField("mDrawsNeededToReport");
            declaredField.setAccessible(true);
            int iIntValue = ((Integer) declaredField.get(objLIZ)).intValue();
            Method declaredMethod = objLIZ.getClass().getDeclaredMethod("reportDrawFinished", new Class[0]);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(objLIZ, new Object[0]);
            declaredField.set(objLIZ, Integer.valueOf(iIntValue));
        }
    }
}
