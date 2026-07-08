package X;

import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS580S0100000_1;
import njp.a;

/* JADX INFO: renamed from: X.045C, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel$addCart$1$animation$1", f = "SeaPdpViewModel.kt", l = {3091}, m = "invokeSuspend")
public final class C045C extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public Object LL;
    public Object LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ SeaPdpViewModel LLILZ;
    public final /* synthetic */ View LLILZIL;
    public final /* synthetic */ View LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C045C(SeaPdpViewModel seaPdpViewModel, View view, View view2, InterfaceC1364105Vn<? super C045C> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = seaPdpViewModel;
        this.LLILZIL = view;
        this.LLILZLL = view2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C045C(this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SeaPdpViewModel@98e7.addCart$1$animation$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            SeaPdpViewModel seaPdpViewModel = this.LLILZ;
            View view = this.LLILZIL;
            View view2 = this.LLILZLL;
            this.LL = view;
            this.LLILLJJLI = view2;
            this.LLILLL = 1;
            C23260099m c23260099m = new C23260099m(C099M.LIZLLL(this));
            seaPdpViewModel.wR2(view.getContext(), view2, null, new AwS580S0100000_1(c23260099m, 719));
            obj = c23260099m.LIZ();
            if (obj == C099R.LJFF()) {
                C099Q.LIZJ(this);
            }
            if (obj == objLJFF) {
                C1C7U.LIZIZ("SeaPdpViewModel@98e7.addCart$1$animation$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("SeaPdpViewModel@98e7.addCart$1$animation$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
