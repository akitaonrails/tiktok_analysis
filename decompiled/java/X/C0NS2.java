package X;

import com.ss.android.ugc.aweme.ecommercelive.common.infra.popcard.vo.PopupCardVO;

/* JADX INFO: renamed from: X.0NS2, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommercelive.common.infra.popcard.click.CouponCardClickListener", f = "CouponCardClickListener.kt", l = {400, 426, 437, 439, 446}, m = "claimSurpriseCoupon")
public final class C0NS2 extends AbstractC23140094w {
    public int LL;
    public Object LLILLJJLI;
    public PopupCardVO LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ C594180NSe LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NS2(C594180NSe c594180NSe, InterfaceC1364105Vn<? super C0NS2> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = c594180NSe;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("CouponCardClickListener@b2d3.claimSurpriseCoupon$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objLIZJ = this.LLILZIL.LIZJ(this);
        C1C7U.LIZIZ("CouponCardClickListener@b2d3.claimSurpriseCoupon$1");
        return objLIZJ;
    }
}
