package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0hqg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.chatdetail.redesign.operation.manage.viewmodel.ManageGroupViewModel$openWhoCanJoinPanel$2$1", f = "ManageGroupViewModel.kt", l = {}, m = "invokeSuspend")
public final class C1219840hqg extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1222520hv0 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1219840hqg(C1222520hv0 c1222520hv0, InterfaceC1364105Vn<? super C1219840hqg> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1222520hv0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1219840hqg(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ManageGroupViewModel@c59c.openWhoCanJoinPanel$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0FNV.LIZJ(this.LL.LIZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ManageGroupViewModel@c59c.openWhoCanJoinPanel$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
