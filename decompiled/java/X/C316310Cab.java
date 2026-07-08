package X;

import Y.AgS305S0100000_25;
import com.ss.android.ugc.aweme.portrait.preview.AIPortraitStylePreviewViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Cab, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.portrait.preview.AIPortraitStylePreviewViewModel$observeCameoStateChanges$1", f = "AIPortraitStylePreviewViewModel.kt", l = {160}, m = "invokeSuspend")
public final class C316310Cab extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AIPortraitStylePreviewViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C316310Cab(AIPortraitStylePreviewViewModel aIPortraitStylePreviewViewModel, InterfaceC1364105Vn<? super C316310Cab> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = aIPortraitStylePreviewViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C316310Cab(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC346201Wa<InterfaceC549230LgP> interfaceC346201WaLJIIJJI;
        C1C7U.LIZ("AIPortraitStylePreviewViewModel@ee01.observeCameoStateChanges$1");
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
            AgS305S0100000_25 agS305S0100000_25 = new AgS305S0100000_25(this.LLILLJJLI, 38);
            this.LL = 1;
            if (interfaceC346201WaLJIIJJI.collect(agS305S0100000_25, this) == objLJFF) {
                C1C7U.LIZIZ("AIPortraitStylePreviewViewModel@ee01.observeCameoStateChanges$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AIPortraitStylePreviewViewModel@ee01.observeCameoStateChanges$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
