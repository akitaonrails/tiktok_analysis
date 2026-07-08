package X;

import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS555S0100000_11;
import njp.a;

/* JADX INFO: renamed from: X.01Ui, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.touchpoint.core.diversion.DiversionReport$reportToken$1", f = "DiversionReport.kt", l = {}, m = "invokeSuspend")
public final class C341801Ui extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ HashMap<String, Object> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C341801Ui(HashMap<String, Object> map, InterfaceC1364105Vn<? super C341801Ui> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = map;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C341801Ui(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DiversionReport@ad2e.reportToken$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C01U6.LIZIZ(new AwS555S0100000_11((HashMap) this.LL, (HashMap<String, String>) 1553));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DiversionReport@ad2e.reportToken$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
