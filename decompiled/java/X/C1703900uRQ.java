package X;

import com.ss.android.ugc.aweme.ecommerce.ug.perf.MallLandingPerfTracker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0uRQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.ug.perf.MallLandingPerfTracker$trackStep$2$1", f = "MallLandingPerfTracker.kt", l = {401}, m = "invokeSuspend")
public final class C1703900uRQ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ MallLandingPerfTracker LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1703900uRQ(MallLandingPerfTracker mallLandingPerfTracker, String str, InterfaceC1364105Vn<? super C1703900uRQ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = mallLandingPerfTracker;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1703900uRQ(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MallLandingPerfTracker@76af.trackStep$2$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            long jLongValue = ((Number) C1704070uRh.LIZJ.getValue()).longValue();
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(jLongValue, this) == objLJFF) {
                C1C7U.LIZIZ("MallLandingPerfTracker@76af.trackStep$2$1");
                return objLJFF;
            }
        }
        this.LLILLJJLI.LJIIIZ(EnumC1704040uRe.NO_LANDING_FINISHED, this.LLILLL, null);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MallLandingPerfTracker@76af.trackStep$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
