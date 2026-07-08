package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0NJp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.service.INowsServiceKt$nowsTabService$2", f = "INowsService.kt", l = {}, m = "invokeSuspend")
public final class C591950NJp extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C591950NJp(InterfaceC1364105Vn<? super C591950NJp> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C591950NJp(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("INowsServiceKt@f371.nowsTabService$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C591970NJr.LIZ();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("INowsServiceKt@f371.nowsTabService$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C591950NJp(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
