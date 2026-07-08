package X;

import android.os.IBinder;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* JADX INFO: renamed from: X.082z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C20543082z implements InvocationHandler {
    public final IBinder LL;
    public IBinder LLILLJJLI;
    public final AnonymousClass0830 LLILLL;
    public final Class<?> LLILZ;
    public final Class<?> LLILZIL;

    public C20543082z(IBinder iBinder, AnonymousClass0830 anonymousClass0830) {
        this.LL = iBinder;
        this.LLILLL = anonymousClass0830;
        try {
            String strLIZIZ = anonymousClass0830.LIZIZ();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(strLIZIZ);
            sbLIZ.append("$Stub");
            this.LLILZ = Class.forName(C2188811AlT.LIZIZ(sbLIZ));
            this.LLILZIL = Class.forName(strLIZIZ);
        } catch (ClassNotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        if ("queryLocalInterface".equals(method.getName())) {
            ClassLoader classLoader = obj.getClass().getClassLoader();
            Class[] clsArr = {this.LLILZIL};
            final IBinder iBinder = this.LL;
            final Class<?> cls = this.LLILZ;
            final AnonymousClass0830 anonymousClass0830 = this.LLILLL;
            final IBinder iBinder2 = this.LLILLJJLI;
            return Proxy.newProxyInstance(classLoader, clsArr, new InvocationHandler(iBinder, cls, anonymousClass0830, iBinder2) { // from class: X.0831
                public final Object LL;
                public final AnonymousClass0830 LLILLJJLI;
                public final IBinder LLILLL;

                @Override // java.lang.reflect.InvocationHandler
                public final Object invoke(Object obj2, Method method2, Object[] objArr2) {
                    if (this.LLILLL != null && method2.getName().equals("asBinder")) {
                        return this.LLILLL;
                    }
                    this.LLILLJJLI.LIZ(method2, objArr2);
                    return C2204961BRm.a0(method2, this.LL, objArr2, new C0WZX("dzBzEgAjS8/YVFkiQFyFdhv++dO64Aq4UVsxMWiEM9TNxOCJyQfXF+hVKAWHnJjR", null));
                }

                {
                    try {
                        this.LL = cls.getDeclaredMethod("asInterface", IBinder.class).invoke(null, iBinder);
                        this.LLILLJJLI = anonymousClass0830;
                        this.LLILLL = iBinder2;
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
            });
        }
        return C2204961BRm.a0(method, this.LL, objArr, new C0WZX("dzBzEgAjS8/YVFkiQFyFdhv++dO64Aq4UVsxMWiEM9TNxOCJyR/KF/tkAQSMm7XCuh3J6kE=", null));
    }
}
