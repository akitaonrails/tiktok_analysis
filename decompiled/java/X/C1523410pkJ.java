package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS567S0100000_23;
import njp.a;

/* JADX INFO: renamed from: X.0pkJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.router.MetricsTrackManager$registerNewMetrics$timerJob$1", f = "EcomNativePrefetchInterceptor.kt", l = {595}, m = "invokeSuspend")
public final class C1523410pkJ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1523440pkM LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1523410pkJ(C1523440pkM c1523440pkM, String str, InterfaceC1364105Vn<? super C1523410pkJ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1523440pkM;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1523410pkJ(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MetricsTrackManager@9690.registerNewMetrics$timerJob$1");
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
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(20000L, this) == objLJFF) {
                C1C7U.LIZIZ("MetricsTrackManager@9690.registerNewMetrics$timerJob$1");
                return objLJFF;
            }
        }
        C1523430pkL c1523430pkLRemove = this.LLILLJJLI.LIZ.remove(this.LLILLL);
        if (c1523430pkLRemove == null) {
            C1507560pKk.LIZ();
        } else {
            c1523430pkLRemove.LJIIIZ = "timeout";
            c1523430pkLRemove.LJIIIIZZ = System.currentTimeMillis();
            c1523430pkLRemove.LIZ();
            new AwS567S0100000_23(c1523430pkLRemove, 181);
            C1507560pKk.LIZ();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MetricsTrackManager@9690.registerNewMetrics$timerJob$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
