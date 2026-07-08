package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Rpr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class RunnableC707970Rpr implements Runnable {
    public InterfaceC699620RcO LL;
    public Function1<? super InterfaceC699620RcO, Unit> LLILLJJLI;

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("FcpTraceRecorder$RunCmd@36f6.run");
        try {
            InterfaceC699620RcO interfaceC699620RcO = this.LL;
            Function1<? super InterfaceC699620RcO, Unit> function1 = this.LLILLJJLI;
            if (interfaceC699620RcO != null && function1 != null) {
                try {
                    function1.invoke(interfaceC699620RcO);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            this.LL = null;
            this.LLILLJJLI = null;
            C707950Rpp.LIZLLL.offer(this);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FcpTraceRecorder$RunCmd@36f6.run");
    }
}
