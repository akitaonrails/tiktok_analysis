package X;

import android.os.Looper;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Objects;

/* JADX INFO: renamed from: X.1B9o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2200301B9o implements InterfaceC2200341B9s {
    public final /* synthetic */ C199520134s LIZ;
    public final /* synthetic */ C1BAY LIZIZ;

    @Override // X.InterfaceC2200341B9s
    public final void LIZ() {
        C2200451BAd.LJI("BillingClient", "Reconnection attempt failed.");
        try {
            this.LIZ.LIZ(C2200541BAm.LJIIIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        C1BAY c1bay = this.LIZIZ;
        if (c1bay.LJJIJ != null) {
            Runnable runnable = new Runnable() { // from class: X.1B9q
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("zzbt@8a66.run");
                    try {
                        try {
                            this.LL.LIZIZ.LJJIJ.LIZ();
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                        }
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("zzbt@8a66.run");
                }
            };
            if (Looper.myLooper() == Looper.getMainLooper()) {
                runnable.run();
            } else {
                C786410Ut5.LJJZZIII(c1bay.LJ, runnable);
            }
        }
    }

    @Override // X.InterfaceC2200341B9s
    public final void LJ(final C19885612rG c19885612rG) {
        int i = c19885612rG.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Reconnection finished with result: ");
        sbLIZ.append(i);
        C2200451BAd.LJI("BillingClient", C2188811AlT.LIZIZ(sbLIZ));
        try {
            this.LIZ.LIZ(c19885612rG);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        C1BAY c1bay = this.LIZIZ;
        if (c1bay.LJJIJ != null) {
            Runnable runnable = new Runnable() { // from class: X.1B9p
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("zzbu@8a65.run");
                    try {
                        C2200301B9o c2200301B9o = this.LL;
                        try {
                            c2200301B9o.LIZIZ.LJJIJ.LJ(c19885612rG);
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                        }
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("zzbu@8a65.run");
                }
            };
            if (Looper.myLooper() == Looper.getMainLooper()) {
                runnable.run();
            } else {
                C786410Ut5.LJJZZIII(c1bay.LJ, runnable);
            }
        }
    }

    public C2200301B9o(C1BAY c1bay, C199520134s c199520134s) {
        this.LIZ = c199520134s;
        Objects.requireNonNull(c1bay);
        this.LIZIZ = c1bay;
    }
}
