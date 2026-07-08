package X;

import Y.AgS285S0100000_4;
import com.ss.android.ugc.aweme.aiportrait.detail.model.AIPortraitDetailViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CcJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aiportrait.detail.model.AIPortraitDetailViewModel$observeCameoStateChanges$1", f = "AIPortraitDetailViewModel.kt", l = {80}, m = "invokeSuspend")
public final class C317370CcJ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ InterfaceC550750Lir LLILLJJLI;
    public final /* synthetic */ AIPortraitDetailViewModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C317370CcJ(InterfaceC550750Lir interfaceC550750Lir, AIPortraitDetailViewModel aIPortraitDetailViewModel, InterfaceC1364105Vn<? super C317370CcJ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC550750Lir;
        this.LLILLL = aIPortraitDetailViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C317370CcJ(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AIPortraitDetailViewModel@daa2.observeCameoStateChanges$1");
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
            InterfaceC346201Wa<InterfaceC549230LgP> interfaceC346201WaLJIIJJI = this.LLILLJJLI.LJIIJJI();
            AgS285S0100000_4 agS285S0100000_4 = new AgS285S0100000_4(this.LLILLL, 61);
            this.LL = 1;
            if (interfaceC346201WaLJIIJJI.collect(agS285S0100000_4, this) == objLJFF) {
                C1C7U.LIZIZ("AIPortraitDetailViewModel@daa2.observeCameoStateChanges$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AIPortraitDetailViewModel@daa2.observeCameoStateChanges$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
