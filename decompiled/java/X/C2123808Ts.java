package X;

import android.app.Application;
import android.os.Build;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Method;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.08Ts, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2123808Ts extends C09AY implements Function0<Object> {
    public C2123808Ts() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String processName;
        C2123608Tq.LIZ.getClass();
        if (Build.VERSION.SDK_INT >= 28) {
            processName = Application.getProcessName();
        } else {
            processName = null;
            try {
                Method declaredMethod = Class.forName("android.app.ActivityThread").getDeclaredMethod("currentProcessName", new Class[0]);
                declaredMethod.setAccessible(true);
                Object objInvoke = declaredMethod.invoke(null, new Object[0]);
                if (objInvoke instanceof String) {
                    processName = (String) objInvoke;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        return processName == null ? "unknown" : processName;
    }
}
