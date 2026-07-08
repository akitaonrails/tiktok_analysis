package X;

import com.ss.android.ugc.aweme.portrait.tab.AIPortraitTabViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Caa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.portrait.tab.AIPortraitTabViewModel$observeCameoStateChanges$1", f = "AIPortraitTabViewModel.kt", l = {534}, m = "invokeSuspend")
public final class C316300Caa extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AIPortraitTabViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C316300Caa(AIPortraitTabViewModel aIPortraitTabViewModel, InterfaceC1364105Vn<? super C316300Caa> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = aIPortraitTabViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C316300Caa(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC346201Wa<InterfaceC549230LgP> interfaceC346201WaLJIIJJI;
        C1C7U.LIZ("AIPortraitTabViewModel@fa0d.observeCameoStateChanges$1");
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
            InterfaceC550750Lir interfaceC550750Lir = this.LLILLJJLI.LL.LIZ;
            if (interfaceC550750Lir == null || (interfaceC346201WaLJIIJJI = interfaceC550750Lir.LJIIJJI()) == null) {
                interfaceC346201WaLJIIJJI = C1518305wz.LL;
            }
            C316320Cac c316320Cac = new C316320Cac(this.LLILLJJLI);
            this.LL = 1;
            if (interfaceC346201WaLJIIJJI.collect(c316320Cac, this) == objLJFF) {
                C1C7U.LIZIZ("AIPortraitTabViewModel@fa0d.observeCameoStateChanges$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AIPortraitTabViewModel@fa0d.observeCameoStateChanges$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
