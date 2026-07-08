package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0kYB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1323690kYB {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [T] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public static final InterfaceC1870830ymf LIZ(Context context) {
        C1323680kYA c1323680kYA = C1323620kY4.LIZJ;
        Context contextN3 = C786410Ut5.N3(context);
        ?? r1 = c1323680kYA.LIZIZ;
        if (r1 == 0) {
            synchronized (c1323680kYA) {
                try {
                    Object obj = c1323680kYA.LIZIZ;
                    r1 = obj;
                    if (obj == null) {
                        ?? Invoke = c1323680kYA.LIZ.invoke(contextN3);
                        c1323680kYA.LIZIZ = Invoke;
                        c1323680kYA.LIZ = null;
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
