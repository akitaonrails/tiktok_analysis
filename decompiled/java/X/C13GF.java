package X;

import Y.AObjectS79S0000000_30;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: X.13GF, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13GF {
    public static final C13DN<LifecycleOwner> LIZ;

    static {
        Object c098200Yq;
        try {
            Method method = LifecycleOwner.class.getClassLoader().loadClass("androidx.compose.ui.platform.AndroidCompositionLocals_androidKt").getMethod("getLocalLifecycleOwner", new Class[0]);
            Annotation[] annotations = method.getAnnotations();
            int length = annotations.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    Object objInvoke = method.invoke(null, new Object[0]);
                    if (objInvoke instanceof C13DN) {
                        c098200Yq = (C13DN) objInvoke;
                    }
                } else if (annotations[i] instanceof InterfaceC1294060jmO) {
                    break;
                } else {
                    i++;
                }
            }
            c098200Yq = null;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C13DN<LifecycleOwner> c13dr = (C13DN) (C189200o6.m7isFailureimpl(c098200Yq) ? null : c098200Yq);
        if (c13dr == null) {
            c13dr = new C13DR<>(new AObjectS79S0000000_30(14));
        }
        LIZ = c13dr;
    }
}
