package X;

import Y.AgS208S0200000_25;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0sYv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.aweme.toolbar.legacy.DmCameraRecordToolbarCreator$wireFrontCameraOnlyReverseDisable$1", f = "DmCameraRecordToolbarCreator.kt", l = {57}, m = "invokeSuspend")
public final class C1631670sYv extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ InterfaceC1625000sOA LLILLJJLI;
    public final /* synthetic */ C1650560t3O LLILLL;
    public final /* synthetic */ InterfaceC1651800t5O LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1631670sYv(InterfaceC1625000sOA interfaceC1625000sOA, C1650560t3O c1650560t3O, InterfaceC1651800t5O interfaceC1651800t5O, InterfaceC1364105Vn<? super C1631670sYv> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC1625000sOA;
        this.LLILLL = c1650560t3O;
        this.LLILZ = interfaceC1651800t5O;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1631670sYv(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DmCameraRecordToolbarCreator@776.wireFrontCameraOnlyReverseDisable$1");
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
            C095D c095dLJJ = this.LLILLJJLI.C0().LJII().LJJ();
            AgS208S0200000_25 agS208S0200000_25 = new AgS208S0200000_25(this.LLILLL, this.LLILZ, 11);
            this.LL = 1;
            if (c095dLJJ.collect(agS208S0200000_25, this) == objLJFF) {
                C1C7U.LIZIZ("DmCameraRecordToolbarCreator@776.wireFrontCameraOnlyReverseDisable$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DmCameraRecordToolbarCreator@776.wireFrontCameraOnlyReverseDisable$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
