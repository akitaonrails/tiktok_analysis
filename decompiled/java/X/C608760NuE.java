package X;

import com.ss.android.ugc.aweme.feed.assem.share.InterceptorEventViewModel;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NuE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.assem.share.InterceptorEventViewModel$postEvent$1", f = "InterceptorEventViewModel.kt", l = {}, m = "invokeSuspend")
public final class C608760NuE extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C608820NuK LL;
    public final /* synthetic */ InterceptorEventViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C608760NuE(C608820NuK c608820NuK, InterceptorEventViewModel interceptorEventViewModel, InterfaceC1364105Vn<? super C608760NuE> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c608820NuK;
        this.LLILLJJLI = interceptorEventViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C608760NuE(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Pair pair;
        C1C7U.LIZ("InterceptorEventViewModel@737d.postEvent$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C608820NuK c608820NuK = this.LL;
        int i = c608820NuK.LIZ;
        if (i == 0) {
            Pair pair2 = (Pair) C13LP.LJJJLL(C2097808Js.LJIL(this.LLILLJJLI.LL));
            if (pair2 != null) {
                AbstractC608770NuF abstractC608770NuF = (AbstractC608770NuF) pair2.getSecond();
                abstractC608770NuF.LIZIZ = c608820NuK;
                abstractC608770NuF.LIZIZ(c608820NuK);
            }
        } else if (i == 1 && (pair = (Pair) C13LP.LJJJLL(C2097808Js.LJIL(this.LLILLJJLI.LLILLJJLI))) != null) {
            AbstractC608770NuF abstractC608770NuF2 = (AbstractC608770NuF) pair.getSecond();
            abstractC608770NuF2.LIZIZ = c608820NuK;
            abstractC608770NuF2.LIZIZ(c608820NuK);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("InterceptorEventViewModel@737d.postEvent$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
