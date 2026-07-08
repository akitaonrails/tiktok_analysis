package X;

import com.bytedance.ies.ugc.aweme.rich.model.CommonAdData;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.pdp.PdpFragment;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.pdp.PdpViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS583S0100000_4;
import njp.a;

/* JADX INFO: renamed from: X.0D5g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.pdp.PdpFragment$observeViewModel$1$1$3$1", f = "PdpFragment.kt", l = {}, m = "invokeSuspend")
public final class C333420D5g extends C09AX implements Function2<C0D40, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ PdpFragment LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C333420D5g(PdpFragment pdpFragment, InterfaceC1364105Vn<? super C333420D5g> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = pdpFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C333420D5g c333420D5g = new C333420D5g(this.LLILLJJLI, interfaceC1364105Vn);
        c333420D5g.LL = obj;
        return c333420D5g;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        CommonAdData commonAdDataEe;
        C332690D2l c332690D2l;
        CommonAdData commonAdDataEe2;
        C332690D2l c332690D2l2;
        C1C7U.LIZ("PdpFragment@d2f1.observeViewModel$1$1$3$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0D40 c0d40 = (C0D40) this.LL;
        PdpFragment pdpFragment = this.LLILLJJLI;
        C335000DBi c335000DBi = pdpFragment.LLJJ;
        if (c335000DBi != null) {
            C1023960ckk c1023960ckk = C2264961Dl0.LIZ;
            PdpViewModel pdpViewModel = pdpFragment.LLJ;
            if (pdpViewModel == null || (c332690D2l2 = pdpViewModel.LLILZLL) == null || (commonAdDataEe2 = c332690D2l2.rawAdData) == null) {
                commonAdDataEe2 = pdpFragment.ee();
            }
            c335000DBi.logAd(c1023960ckk, commonAdDataEe2, new AwS583S0100000_4(c0d40, 61));
        }
        C335000DBi c335000DBi2 = this.LLILLJJLI.LLJJ;
        if (c335000DBi2 != null) {
            C1023960ckk c1023960ckkLJIIIIZZ = C0DEO.LIZ.LJIIIIZZ("product_detail");
            PdpFragment pdpFragment2 = this.LLILLJJLI;
            PdpViewModel pdpViewModel2 = pdpFragment2.LLJ;
            if (pdpViewModel2 == null || (c332690D2l = pdpViewModel2.LLILZLL) == null || (commonAdDataEe = c332690D2l.rawAdData) == null) {
                commonAdDataEe = pdpFragment2.ee();
            }
            c335000DBi2.logAd(c1023960ckkLJIIIIZZ, commonAdDataEe, new AwS583S0100000_4(c0d40, 62));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PdpFragment@d2f1.observeViewModel$1$1$3$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C0D40 c0d40, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c0d40, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
