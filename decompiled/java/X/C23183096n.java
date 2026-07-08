package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;
import kotlin.jvm.internal.AwS582S0100000_3;

/* JADX INFO: renamed from: X.096n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C23183096n {
    public static C099F LIZ(ListenableFuture listenableFuture) {
        if (listenableFuture.isDone()) {
            try {
                return C090F.LIZ(C23184096o.LIZ(listenableFuture));
            } catch (ExecutionException e) {
                e = e;
                TryCatchGuardChecker.doCheck(e);
                C099F c099fLIZIZ = C090F.LIZIZ();
                Throwable cause = e.getCause();
                if (cause != null) {
                    e = cause;
                }
                c099fLIZIZ.LJJJJJ(e);
                return c099fLIZIZ;
            }
        }
        final C099F c099fLIZIZ2 = C090F.LIZIZ();
        C11U6<Object> c11u6 = new C11U6<Object>() { // from class: X.096m
            @Override // X.C11U6
            public final void onFailure(Throwable th) {
                c099fLIZIZ2.LJJJJJ(th);
            }

            @Override // X.C11U6
            public final void onSuccess(Object obj) {
                c099fLIZIZ2.LJIIZILJ(obj);
            }
        };
        listenableFuture.LJIIJJI(new C135Q(listenableFuture, c11u6), EnumC2272608vM.LL);
        C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C23015090b(3000L, c099fLIZIZ2, listenableFuture, null), 2);
        c099fLIZIZ2.LJII(new AwS582S0100000_3(listenableFuture, (ListenableFuture<Object>) 13));
        return c099fLIZIZ2;
    }
}
