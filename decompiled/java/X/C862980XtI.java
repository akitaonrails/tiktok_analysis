package X;

import com.ss.android.ugc.aweme.ecommerce.mixmall.container.ECMMKViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0XtI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.mixmall.container.ECMMKViewModel$onPageTraceCallback$1$onLoadRequiredError$1", f = "ECMMKViewModel.kt", l = {131}, m = "invokeSuspend")
public final class C862980XtI extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ ECMMKViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C862980XtI(ECMMKViewModel eCMMKViewModel, InterfaceC1364105Vn<? super C862980XtI> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = eCMMKViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C862980XtI(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ECMMKViewModel@3d42.onPageTraceCallback$1$onLoadRequiredError$1");
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
            C2252321DDq c2252321DDq = this.LLILLJJLI.LLJJIJI;
            C1774390wH7 c1774390wH7 = C1774390wH7.LIZ;
            this.LL = 1;
            c2252321DDq.setValue(c1774390wH7);
            if (Unit.LIZ == objLJFF) {
                C1C7U.LIZIZ("ECMMKViewModel@3d42.onPageTraceCallback$1$onLoadRequiredError$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ECMMKViewModel@3d42.onPageTraceCallback$1$onLoadRequiredError$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
