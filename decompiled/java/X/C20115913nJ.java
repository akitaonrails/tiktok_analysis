package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: X.13nJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20115913nJ {
    public static final Integer LIZ(Context context) {
        try {
            Method declaredMethod = Context.class.getDeclaredMethod("getThemeResId", new Class[0]);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(context, new Object[0]);
            if (objInvoke != null) {
                return (Integer) objInvoke;
            }
            throw new C2482109o3("null cannot be cast to non-null type kotlin.Int");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }
}
