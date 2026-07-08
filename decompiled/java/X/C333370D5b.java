package X;

import com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.pdp.PdpFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0D5b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.pdp.PdpFragment$observeViewModel$1$1", f = "PdpFragment.kt", l = {}, m = "invokeSuspend")
public final class C333370D5b extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ PdpFragment LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C333370D5b(PdpFragment pdpFragment, InterfaceC1364105Vn<? super C333370D5b> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = pdpFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C333370D5b c333370D5b = new C333370D5b(this.LLILLJJLI, interfaceC1364105Vn);
        c333370D5b.LL = obj;
        return c333370D5b;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PdpFragment@d2f1.observeViewModel$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LL;
        C23250099c.LIZLLL(interfaceC497601wk, null, null, new C333390D5d(this.LLILLJJLI, null), 3);
        C23250099c.LIZLLL(interfaceC497601wk, null, null, new C333360D5a(this.LLILLJJLI, null), 3);
        C23250099c.LIZLLL(interfaceC497601wk, null, null, new C333400D5e(this.LLILLJJLI, null), 3);
        C23250099c.LIZLLL(interfaceC497601wk, null, null, new C0D5Y(this.LLILLJJLI, null), 3);
        C23250099c.LIZLLL(interfaceC497601wk, null, null, new C333410D5f(this.LLILLJJLI, null), 3);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PdpFragment@d2f1.observeViewModel$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
