package X;

import android.os.Build;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: X.0uGd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1697210uGd {
    public static void LIZ(View view) {
        try {
            if (!C1697150uGX.LLJJIJIL) {
                C1697150uGX.LLJJIJIL = true;
                if (Build.VERSION.SDK_INT < 28) {
                    C1697150uGX.LLJJIJI = View.class.getDeclaredMethod("updateDisplayListIfDirty", new Class[0]);
                    C1697150uGX.LLJJIJIIJIL = View.class.getDeclaredField("mRecreateDisplayList");
                } else {
                    C1697150uGX.LLJJIJI = (Method) Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass()).invoke(View.class, "updateDisplayListIfDirty", new Class[0]);
                    C1697150uGX.LLJJIJIIJIL = (Field) Class.class.getDeclaredMethod("getDeclaredField", String.class).invoke(View.class, "mRecreateDisplayList");
                }
                Method method = C1697150uGX.LLJJIJI;
                if (method != null) {
                    method.setAccessible(true);
                }
                Field field = C1697150uGX.LLJJIJIIJIL;
                if (field != null) {
                    field.setAccessible(true);
                }
            }
            Field field2 = C1697150uGX.LLJJIJIIJIL;
            if (field2 != null) {
                field2.setBoolean(view, true);
            }
            Method method2 = C1697150uGX.LLJJIJI;
            if (method2 != null) {
                method2.invoke(view, new Object[0]);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1697150uGX.LLJJJ = true;
        }
    }
}
