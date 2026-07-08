package X;

import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01pp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel$handleAddCartResult$1$animation$1", f = "PdpViewModel.kt", l = {2847, 2848}, m = "invokeSuspend")
public final class C454701pp extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public Object LL;
    public Object LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ PdpViewModel LLILZ;
    public final /* synthetic */ View LLILZIL;
    public final /* synthetic */ View LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C454701pp(PdpViewModel pdpViewModel, View view, View view2, InterfaceC1364105Vn<? super C454701pp> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = pdpViewModel;
        this.LLILZIL = view;
        this.LLILZLL = view2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C454701pp(this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PdpViewModel@6cb1.handleAddCartResult$1$animation$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    C1C7U.LIZIZ("PdpViewModel@6cb1.handleAddCartResult$1$animation$1");
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            this.LLILLL = 1;
            if (AnonymousClass0958.LIZIZ(100L, this) == objLJFF) {
                C1C7U.LIZIZ("PdpViewModel@6cb1.handleAddCartResult$1$animation$1");
                return objLJFF;
            }
        }
        PdpViewModel pdpViewModel = this.LLILZ;
        View view = this.LLILZIL;
        View view2 = this.LLILZLL;
        this.LL = view;
        this.LLILLJJLI = view2;
        this.LLILLL = 2;
        C23260099m c23260099m = new C23260099m(C099M.LIZLLL(this));
        pdpViewModel.rR2(view.getContext(), view2, null, new C5183020f(c23260099m, 364));
        obj = c23260099m.LIZ();
        if (obj == C099R.LJFF()) {
            C099Q.LIZJ(this);
        }
        if (obj == objLJFF) {
            C1C7U.LIZIZ("PdpViewModel@6cb1.handleAddCartResult$1$animation$1");
            return objLJFF;
        }
        C1C7U.LIZIZ("PdpViewModel@6cb1.handleAddCartResult$1$animation$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
