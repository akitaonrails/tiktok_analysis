package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Odl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.workbench.WorkBenchDataManager$markNeedRead$1", f = "WorkBenchDataManager.kt", l = {}, m = "invokeSuspend")
public final class C624030Odl extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C624030Odl(InterfaceC1364105Vn<? super C624030Odl> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C624030Odl(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("WorkBenchDataManager@2241.markNeedRead$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C624110Odt.LIZ.getClass();
        C624110Odt.LIZIZ = C624100Ods.LIZ(C624110Odt.LIZ(), null, true, 7);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("WorkBenchDataManager@2241.markNeedRead$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C624030Odl(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
