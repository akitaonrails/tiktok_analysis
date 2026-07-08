package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;

/* JADX INFO: renamed from: X.04BU, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel", f = "SeaPdpViewModel.kt", l = {2949, 2951}, m = "openSecondPageForResult")
public final class C04BU<R> extends AbstractC23140094w {
    public boolean LL;
    public Object LLILLJJLI;
    public C013C LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ SeaPdpViewModel LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C04BU(SeaPdpViewModel seaPdpViewModel, InterfaceC1364105Vn<? super C04BU> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = seaPdpViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SeaPdpViewModel@98e7.openSecondPageForResult$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objRS2 = this.LLILZIL.rS2(this, null, false);
        C1C7U.LIZIZ("SeaPdpViewModel@98e7.openSecondPageForResult$1");
        return objRS2;
    }
}
