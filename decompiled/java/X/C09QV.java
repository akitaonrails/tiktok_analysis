package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.09QV, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09QV extends C09AY implements Function0<Unit> {
    public final /* synthetic */ long LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ Function0<Unit> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C09QV(long j, long j2, Function0<Unit> function0) {
        super(0);
        this.LL = j;
        this.LLILLJJLI = j2;
        this.LLILLL = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        try {
            C2369309Qd.LIZ(Long.valueOf(System.currentTimeMillis() - this.LLILLJJLI), "pdp_inbox_share", "jump_pdp", String.valueOf(this.LL));
            this.LLILLL.invoke();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
        }
        return Unit.LIZ;
    }
}
