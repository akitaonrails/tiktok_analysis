package X;

import com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.pdp.PdpFragment;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.pdp.PdpViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0D5a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.pdp.PdpFragment$observeViewModel$1$1$2", f = "PdpFragment.kt", l = {686}, m = "invokeSuspend")
public final class C333360D5a extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ PdpFragment LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C333360D5a(PdpFragment pdpFragment, InterfaceC1364105Vn<? super C333360D5a> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = pdpFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C333360D5a(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        AnonymousClass0950 anonymousClass0950;
        C1C7U.LIZ("PdpFragment@d2f1.observeViewModel$1$1$2");
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
            PdpFragment pdpFragment = this.LLILLJJLI;
            PdpViewModel pdpViewModel = pdpFragment.LLJ;
            if (pdpViewModel != null && (anonymousClass0950 = pdpViewModel.LLILLL) != null) {
                C333430D5h c333430D5h = new C333430D5h(pdpFragment, null);
                this.LL = 1;
                if (C09IC.LJII(anonymousClass0950, this, c333430D5h) == objLJFF) {
                    C1C7U.LIZIZ("PdpFragment@d2f1.observeViewModel$1$1$2");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PdpFragment@d2f1.observeViewModel$1$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
