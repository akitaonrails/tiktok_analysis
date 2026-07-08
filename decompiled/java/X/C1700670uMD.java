package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0uMD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1700670uMD extends C09AY implements Function0<Unit> {
    public final /* synthetic */ InterfaceC1700660uMC LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1700670uMD(C1581680rGI c1581680rGI) {
        super(0);
        this.LL = c1581680rGI;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        InterfaceC1700660uMC interfaceC1700660uMC = this.LL;
        List<InterfaceC1700660uMC> list = C1700650uMB.LIZ;
        synchronized (list) {
            try {
                ((ArrayList) list).add(interfaceC1700660uMC);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return Unit.LIZ;
    }
}
