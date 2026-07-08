package X;

import com.ss.android.ugc.aweme.feed.assem.share.InterceptorEventViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NuI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.assem.share.InterceptorEventViewModel$unRegisterEventHandlerChain$1", f = "InterceptorEventViewModel.kt", l = {}, m = "invokeSuspend")
public final class C608800NuI extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ InterceptorEventViewModel LLILLJJLI;
    public final /* synthetic */ AbstractC608770NuF LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C608800NuI(int i, InterceptorEventViewModel interceptorEventViewModel, AbstractC608770NuF abstractC608770NuF, InterfaceC1364105Vn<? super C608800NuI> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = i;
        this.LLILLJJLI = interceptorEventViewModel;
        this.LLILLL = abstractC608770NuF;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C608800NuI(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("InterceptorEventViewModel@737d.unRegisterEventHandlerChain$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        int i = this.LL;
        if (i == 0) {
            this.LLILLJJLI.LL.remove(C2286608xc.LJ(this.LLILLL.LIZ()));
            InterceptorEventViewModel interceptorEventViewModel = this.LLILLJJLI;
            interceptorEventViewModel.wQ2(interceptorEventViewModel.LL);
        } else if (i == 1) {
            this.LLILLJJLI.LLILLJJLI.remove(C2286608xc.LJ(this.LLILLL.LIZ()));
            InterceptorEventViewModel interceptorEventViewModel2 = this.LLILLJJLI;
            interceptorEventViewModel2.wQ2(interceptorEventViewModel2.LLILLJJLI);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("InterceptorEventViewModel@737d.unRegisterEventHandlerChain$1");
        return unit;
    }
}
