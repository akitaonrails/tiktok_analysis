package X;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Qc6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.middle.EcSearchMiddleFirstScreenPerfMonitor$onEvent$1$1", f = "EcSearchMiddlePrefMonitor.kt", l = {}, m = "invokeSuspend")
public final class C673960Qc6 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Map<String, Object> LL;
    public final /* synthetic */ EnumC673930Qc3 LLILLJJLI;
    public final /* synthetic */ EnumC673970Qc7 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C673960Qc6(Map<String, Object> map, EnumC673930Qc3 enumC673930Qc3, EnumC673970Qc7 enumC673970Qc7, InterfaceC1364105Vn<? super C673960Qc6> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = map;
        this.LLILLJJLI = enumC673930Qc3;
        this.LLILLL = enumC673970Qc7;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C673960Qc6(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EcSearchMiddleFirstScreenPerfMonitor@66ad.onEvent$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Map<String, Object> map = this.LL;
        EnumC673930Qc3 enumC673930Qc3 = this.LLILLJJLI;
        EnumC673970Qc7 enumC673970Qc7 = this.LLILLL;
        map.put("current_state", enumC673930Qc3.getValue());
        if (enumC673970Qc7 != null) {
            map.put("current_page", enumC673970Qc7.getValue());
        }
        C1421105hJ.LIZJ("rd_tiktokec_search_middle_perf", map);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EcSearchMiddleFirstScreenPerfMonitor@66ad.onEvent$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
