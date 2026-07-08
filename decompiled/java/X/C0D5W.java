package X;

import com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.pdp.PdpFragment;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.pdp.PdpViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0D5W, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.pdp.PdpFragment$observeViewModel$1$1$4$1", f = "PdpFragment.kt", l = {}, m = "invokeSuspend")
public final class C0D5W extends C09AX implements Function2<C0D5X, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ PdpFragment LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0D5W(PdpFragment pdpFragment, InterfaceC1364105Vn<? super C0D5W> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = pdpFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0D5W c0d5w = new C0D5W(this.LLILLJJLI, interfaceC1364105Vn);
        c0d5w.LL = obj;
        return c0d5w;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C332690D2l c332690D2l;
        C332690D2l c332690D2l2;
        C1C7U.LIZ("PdpFragment@d2f1.observeViewModel$1$1$4$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0D5X c0d5x = (C0D5X) this.LL;
        PdpViewModel pdpViewModel = this.LLILLJJLI.LLJ;
        if (pdpViewModel != null && (c332690D2l = pdpViewModel.LLILZLL) != null) {
            if (!Intrinsics.LJFF(c0d5x.sessionId, c332690D2l.getUniqueId$ucp_impl_release())) {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("PdpFragment@d2f1.observeViewModel$1$1$4$1");
                return unit;
            }
            PdpViewModel pdpViewModel2 = this.LLILLJJLI.LLJ;
            if (pdpViewModel2 != null && (c332690D2l2 = pdpViewModel2.LLILZLL) != null && Intrinsics.LJFF(c0d5x.sessionId, c332690D2l2.getUniqueId$ucp_impl_release()) && c0d5x.changed) {
                pdpViewModel2.LLJILJIL.LJIIJJI(c0d5x.selectedSkuOptions);
            }
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("PdpFragment@d2f1.observeViewModel$1$1$4$1");
            return unit2;
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("PdpFragment@d2f1.observeViewModel$1$1$4$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C0D5X c0d5x, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c0d5x, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
