package X;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NaQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.middle.EcSearchBlankPageTraceEventMonitor$onEvent$1", f = "EcSearchMiddlePrefMonitor.kt", l = {}, m = "invokeSuspend")
public final class C596480NaQ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Map<String, Object> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C596480NaQ(Map<String, Object> map, InterfaceC1364105Vn<? super C596480NaQ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = map;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C596480NaQ(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EcSearchBlankPageTraceEventMonitor@6e18.onEvent$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1421105hJ.LIZJ("rd_ec_search_blankpage_trace", this.LL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EcSearchBlankPageTraceEventMonitor@6e18.onEvent$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
