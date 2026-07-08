package X;

import com.bytedance.assem.arch.core.AssemSupervisor;
import com.bytedance.assem.arch.reused.ReusedAssem;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.PrintStream;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Sal, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C724090Sal extends C09AY implements Function0<Unit> {
    public final /* synthetic */ ReusedAssem<?> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C724090Sal(ReusedAssem<?> reusedAssem) {
        super(0);
        this.LL = reusedAssem;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        try {
            AssemSupervisor supervisor = this.LL.getSupervisor();
            ReusedAssem<?> reusedAssem = this.LL;
            C724040Sag.LIZ((List) supervisor.LLILLL.getValue(), new C724080Sak(reusedAssem, reusedAssem.LLILLJJLI));
            return Unit.LIZ;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            PrintStream printStream = System.err;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onChildAssemActiveChanged error in ");
            sbLIZ.append(this.LL);
            printStream.println(C2188811AlT.LIZIZ(sbLIZ));
            throw th;
        }
    }
}
