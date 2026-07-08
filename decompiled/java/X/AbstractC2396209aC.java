package X;

import android.os.SystemClock;
import com.bytedance.retrofit2.RequestFactory;
import com.bytedance.retrofit2.Retrofit;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

/* JADX INFO: renamed from: X.09aC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC2396209aC<T> {
    public abstract T LIZ(Object[] objArr);

    public static AbstractC2394709Zx LIZIZ(Retrofit retrofit, Method method, C1494570ozn c1494570ozn) {
        c1494570ozn.LJLILLLLZI.LIZJ.LIZIZ();
        c1494570ozn.LJIJ = SystemClock.uptimeMillis();
        try {
            RequestFactory annotations = RequestFactory.parseAnnotations(retrofit, method, c1494570ozn);
            C1494670ozx c1494670ozx = c1494570ozn.LJLILLLLZI.LIZJ;
            c1494670ozx.LIZIZ = c1494670ozx.LIZ();
            Type genericReturnType = method.getGenericReturnType();
            if (!C2396109aB.LJII(genericReturnType)) {
                if (genericReturnType != Void.TYPE) {
                    c1494570ozn.LJLILLLLZI.LIZJ.LIZIZ();
                    c1494570ozn.LJIJI = SystemClock.uptimeMillis();
                    try {
                        AbstractC2394709Zx abstractC2394709ZxLIZLLL = AbstractC2394709Zx.LIZLLL(retrofit, method, annotations);
                        C1494670ozx c1494670ozx2 = c1494570ozn.LJLILLLLZI.LIZJ;
                        c1494670ozx2.LIZJ = c1494670ozx2.LIZ();
                        return abstractC2394709ZxLIZLLL;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C1494670ozx c1494670ozx3 = c1494570ozn.LJLILLLLZI.LIZJ;
                        c1494670ozx3.LIZJ = c1494670ozx3.LIZ();
                        throw th;
                    }
                }
                throw C2396109aB.LJIIIZ(method, null, "Service methods cannot return void.", new Object[0]);
            }
            throw C2396109aB.LJIIIZ(method, null, "Method return type must not include a type variable or wildcard: %s", genericReturnType);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C1494670ozx c1494670ozx4 = c1494570ozn.LJLILLLLZI.LIZJ;
            c1494670ozx4.LIZIZ = c1494670ozx4.LIZ();
            throw th2;
        }
    }
}
