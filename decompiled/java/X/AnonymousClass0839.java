package X;

import android.os.Build;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* JADX INFO: renamed from: X.0839, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class AnonymousClass0839 extends AnonymousClass0835 {
    static {
        final int i = 0;
        AnonymousClass0835.LIZJ("activityDestroyed", new AnonymousClass0838(i) { // from class: X.083A
            @Override // X.AnonymousClass0838
            public final Object LIZIZ(Object obj, Method method, Object[] objArr) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(method.getName());
                sbLIZ.append(" is called!");
                AnonymousClass0892.LIZ("IActivityTaskManagerProxy", C2188811AlT.LIZIZ(sbLIZ));
                return null;
            }
        });
        AnonymousClass0835.LIZJ("activitySlept", new AnonymousClass0838(i) { // from class: X.083A
            @Override // X.AnonymousClass0838
            public final Object LIZIZ(Object obj, Method method, Object[] objArr) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(method.getName());
                sbLIZ.append(" is called!");
                AnonymousClass0892.LIZ("IActivityTaskManagerProxy", C2188811AlT.LIZIZ(sbLIZ));
                return null;
            }
        });
    }

    public final void LIZLLL() {
        Object objA0;
        if (Build.VERSION.SDK_INT < 29) {
            AnonymousClass0892.LIZ("IActivityTaskManagerProxy", "Below android Q,return.");
            return;
        }
        try {
            Field fieldLIZ = C1962907mV.LIZ(Class.forName("android.app.ActivityTaskManager"), "IActivityTaskManagerSingleton");
            Object objLIZIZ = fieldLIZ != null ? C1962907mV.LIZIZ(fieldLIZ, null) : null;
            if (Class.forName("android.util.Singleton").isInstance(objLIZIZ)) {
                C1963107mX.LIZ(objLIZIZ, "target object must not be null");
                Field fieldLIZ2 = C1962907mV.LIZ(objLIZIZ.getClass(), "mInstance");
                if (((fieldLIZ2 == null || (objA0 = C1962907mV.LIZIZ(fieldLIZ2, objLIZIZ)) == null) && (objA0 = C2204961BRm.a0(C1964607mm.LIZ(objLIZIZ.getClass(), "get", new Class[0]), objLIZIZ, new Object[0], new C0WZX("dzBzEgAjS8/YVFkiQFyUajCVf5LEaLPJXoSSIWKcBqrc2zK9vvqYSIWPh8nVwsSsGs7Nlu/3cwru7vL9JZhDhFZgrTykpDqsZu8BGhvDvtigY0U=", null))) == null) || Proxy.isProxyClass(objA0.getClass())) {
                    return;
                }
                this.LLILZ = true;
                this.LLILLJJLI = objA0;
                C1962907mV.LIZJ(objLIZIZ, "mInstance", C1961307mF.LIZ(objA0, this));
                AnonymousClass0892.LIZ("IActivityTaskManagerProxy", "Hook proxy ActivityTaskManager success!!!");
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            AnonymousClass0892.LIZ("IActivityTaskManagerProxy", "Hook proxy ActivityTaskManager Failed!!!");
        }
    }
}
