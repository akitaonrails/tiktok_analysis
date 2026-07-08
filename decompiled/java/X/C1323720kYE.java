package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0kYE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1323720kYE {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [T] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public static final InterfaceC1870830ymf LIZ(Context context) {
        C1323710kYD c1323710kYD = C1323600kY2.LIZIZ;
        Context contextN3 = C786410Ut5.N3(context);
        ?? r1 = c1323710kYD.LIZIZ;
        if (r1 == 0) {
            synchronized (c1323710kYD) {
                try {
                    Object obj = c1323710kYD.LIZIZ;
                    r1 = obj;
                    if (obj == null) {
                        ?? Invoke = c1323710kYD.LIZ.invoke(contextN3);
                        c1323710kYD.LIZIZ = Invoke;
                        c1323710kYD.LIZ = null;
                        r1 = Invoke;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return (InterfaceC1870830ymf) r1;
    }
}
