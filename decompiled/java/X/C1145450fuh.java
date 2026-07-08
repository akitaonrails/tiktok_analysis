package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0fuh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1145450fuh extends C09AY implements Function0<Unit> {
    public final /* synthetic */ long LL;
    public final /* synthetic */ long LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1145450fuh(long j, long j2) {
        super(0);
        this.LL = j;
        this.LLILLJJLI = j2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        try {
            C1145500fum c1145500fumLJI = C1145410fud.LJI(this.LL, this.LLILLJJLI);
            if (c1145500fumLJI != null) {
                c1145500fumLJI.LJIIIIZZ();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        C1145410fud.LJ(this.LL, this.LLILLJJLI);
        return Unit.LIZ;
    }
}
