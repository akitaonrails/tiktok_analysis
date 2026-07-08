package X;

import android.app.Activity;
import android.app.ActivityOptions;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* JADX INFO: renamed from: X.0jaj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1286830jaj {
    public static void LIZ(Activity activity) {
        InterfaceC1286820jai interfaceC1286820jai = new InterfaceC1286820jai() { // from class: X.0jak
            @Override // X.InterfaceC1286820jai
            public final void LIZ() {
            }
        };
        try {
            Method declaredMethod = Activity.class.getDeclaredMethod("getActivityOptions", new Class[0]);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(activity, new Object[0]);
            for (Class<?> cls : Activity.class.getDeclaredClasses()) {
                if (cls.getSimpleName().equals("TranslucentConversionListener")) {
                    final WeakReference weakReference = new WeakReference(interfaceC1286820jai);
                    Object objNewProxyInstance = Proxy.newProxyInstance(Activity.class.getClassLoader(), new Class[]{cls}, new InvocationHandler(weakReference) { // from class: X.0jah
                        public final WeakReference<InterfaceC1286820jai> LL;

                        {
                            this.LL = weakReference;
                        }

                        @Override // java.lang.reflect.InvocationHandler
                        public final Object invoke(Object obj, Method method, Object[] objArr) {
                            try {
                                if (((Boolean) objArr[0]).booleanValue() && this.LL.get() != null) {
                                    this.LL.get().LIZ();
                                    return null;
                                }
                                return null;
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                                return null;
                            }
                        }
                    });
                    Method declaredMethod2 = Activity.class.getDeclaredMethod("convertToTranslucent", cls, ActivityOptions.class);
                    declaredMethod2.setAccessible(true);
                    declaredMethod2.invoke(activity, objNewProxyInstance, objInvoke);
                    return;
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }
}
