package X;

import com.ss.android.ugc.aweme.api.component.idlepreload.eventrack.CommerceIdlePreloadEventTracker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS103S0110000_16;
import njp.a;

/* JADX INFO: renamed from: X.0cAy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.api.component.idlepreload.rescollect.ResourceScoreStrategyModule$checkResAvailable$1", f = "ResourceScoreStrategyModule.kt", l = {}, m = "invokeSuspend")
public final class C1001780cAy extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1006690cIt LL;
    public final /* synthetic */ C1001810cB1 LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1001780cAy(C1006690cIt c1006690cIt, C1001810cB1 c1001810cB1, boolean z, InterfaceC1364105Vn<? super C1001780cAy> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1006690cIt;
        this.LLILLJJLI = c1001810cB1;
        this.LLILLL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1001780cAy(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ResourceScoreStrategyModule@39ea.checkResAvailable$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        CommerceIdlePreloadEventTracker commerceIdlePreloadEventTracker = this.LL.LJ;
        C1001790cAz.LIZ.getClass();
        commerceIdlePreloadEventTracker.log(C1001790cAz.LIZLLL, new AwS103S0110000_16(this.LLILLJJLI, this.LLILLL, 5));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ResourceScoreStrategyModule@39ea.checkResAvailable$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
