package X;

import androidx.lifecycle.ViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.041C, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.sku.vm.ISkuPanelViewModel$sendUncheckedSpecData$1", f = "ISkuPanelViewModel.kt", l = {466}, m = "invokeSuspend")
public final class C041C extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C043B<ViewModel> LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C041C(C043B<ViewModel> c043b, String str, InterfaceC1364105Vn<? super C041C> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c043b;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C041C(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ISkuPanelViewModel@f37b.sendUncheckedSpecData$1");
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
            C2252331DDr c2252331DDrQv = this.LLILLJJLI.Qv();
            C047L c047l = new C047L(this.LLILLL, this.LLILLJJLI.Bn());
            this.LL = 1;
            if (c2252331DDrQv.emit(c047l, this) == objLJFF) {
                C1C7U.LIZIZ("ISkuPanelViewModel@f37b.sendUncheckedSpecData$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ISkuPanelViewModel@f37b.sendUncheckedSpecData$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
