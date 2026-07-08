package X;

import Y.AgS306S0100000_26;
import com.ss.android.ugc.aweme.ecommerce.mixmall.container.ECMMKViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0XtK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.mixmall.container.ECMMKViewModel$pageState$1$1", f = "ECMMKViewModel.kt", l = {293}, m = "invokeSuspend")
public final class C863000XtK extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ InterfaceC332260D0u<AbstractC1772290wDj> LLILLJJLI;
    public final /* synthetic */ ECMMKViewModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C863000XtK(InterfaceC332260D0u<AbstractC1772290wDj> interfaceC332260D0u, ECMMKViewModel eCMMKViewModel, InterfaceC1364105Vn<? super C863000XtK> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC332260D0u;
        this.LLILLL = eCMMKViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C863000XtK(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ECMMKViewModel@3d42.pageState$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            InterfaceC332260D0u<AbstractC1772290wDj> interfaceC332260D0u = this.LLILLJJLI;
            AgS306S0100000_26 agS306S0100000_26 = new AgS306S0100000_26(this.LLILLL, 5);
            this.LL = 1;
            if (interfaceC332260D0u.collect(agS306S0100000_26, this) == objLJFF) {
                C1C7U.LIZIZ("ECMMKViewModel@3d42.pageState$1$1");
                return objLJFF;
            }
        }
        throw new C2197108jB();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
