package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.CancellationException;
import v7.o;

/* JADX INFO: renamed from: X.09oE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC2483209oE implements Runnable {
    public final /* synthetic */ C2472709mX LL;
    public final /* synthetic */ o LLILLJJLI;
    public final /* synthetic */ InterfaceC2385309Wh LLILLL;
    public final /* synthetic */ C15O7 LLILZ;

    public final void LIZ() {
        C2472709mX c2472709mX = this.LL;
        if (c2472709mX != null && c2472709mX.LIZ()) {
            this.LLILLJJLI.LIZ();
            return;
        }
        try {
            this.LLILLJJLI.LIZJ(this.LLILLL.then(this.LLILZ));
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            this.LLILLJJLI.LIZ();
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            this.LLILLJJLI.LIZIZ(e2);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            LIZ();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (!C2179971ATj.LIZ(th)) {
                throw th;
            }
        }
    }

    public RunnableC2483209oE(C2472709mX c2472709mX, o oVar, InterfaceC2385309Wh interfaceC2385309Wh, C15O7 c15o7) {
        this.LL = c2472709mX;
        this.LLILLJJLI = oVar;
        this.LLILLL = interfaceC2385309Wh;
        this.LLILZ = c15o7;
    }
}
