package X;

import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CX0, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.router.MetricsTrackManager$updatePerfDataAsyncReport$1$1", f = "EcomNativePrefetchInterceptor.kt", l = {}, m = "invokeSuspend")
public final class C0CX0 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ HashMap<String, Object> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0CX0(String str, HashMap<String, Object> map, InterfaceC1364105Vn<? super C0CX0> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = map;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0CX0(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MetricsTrackManager@9690.updatePerfDataAsyncReport$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1523590pkb c1523590pkb = C1523590pkb.LIZ;
        String str = this.LL;
        HashMap<String, Object> map = this.LLILLJJLI;
        c1523590pkb.getClass();
        C1523590pkb.LJFF(str, map);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MetricsTrackManager@9690.updatePerfDataAsyncReport$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
