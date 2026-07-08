package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;

/* JADX INFO: renamed from: X.04BV, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel", f = "PdpViewModel.kt", l = {2624, 2626}, m = "openSecondPageForResult")
public final class C04BV<R> extends AbstractC23140094w {
    public boolean LL;
    public Object LLILLJJLI;
    public C013C LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ PdpViewModel LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C04BV(PdpViewModel pdpViewModel, InterfaceC1364105Vn<? super C04BV> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = pdpViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PdpViewModel@6cb1.openSecondPageForResult$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objGS2 = this.LLILZIL.gS2(this, null, false);
        C1C7U.LIZIZ("PdpViewModel@6cb1.openSecondPageForResult$1");
        return objGS2;
    }
}
