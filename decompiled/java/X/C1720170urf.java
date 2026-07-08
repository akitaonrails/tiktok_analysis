package X;

import com.bytedance.pipo.stellar.base.fragment.StellarViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0urf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.bytedance.pipo.stellar.base.fragment.StellarViewModel$processAction$7", f = "StellarViewModel.kt", l = {546}, m = "invokeSuspend")
public final class C1720170urf extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ StellarViewModel LLILLJJLI;
    public final /* synthetic */ AbstractC2201008jo LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1720170urf(StellarViewModel stellarViewModel, AbstractC2201008jo abstractC2201008jo, InterfaceC1364105Vn<? super C1720170urf> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = stellarViewModel;
        this.LLILLL = abstractC2201008jo;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1720170urf(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StellarViewModel@1bbc.processAction$7");
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
            C2252331DDr c2252331DDr = this.LLILLJJLI.LLJ;
            C1720160ure c1720160ureLIZ = C1720390us1.LIZ(((C1720130urb) this.LLILLL).LIZ);
            this.LL = 1;
            if (c2252331DDr.emit(c1720160ureLIZ, this) == objLJFF) {
                C1C7U.LIZIZ("StellarViewModel@1bbc.processAction$7");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StellarViewModel@1bbc.processAction$7");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
