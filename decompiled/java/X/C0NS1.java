package X;

import com.ss.android.ugc.aweme.ecommercelive.common.infra.popcard.vo.PopupCardVO;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NS1, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommercelive.common.infra.popcard.click.CouponCardClickListener$claimSurpriseCoupon$4$1", f = "CouponCardClickListener.kt", l = {}, m = "invokeSuspend")
public final class C0NS1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C594180NSe LL;
    public final /* synthetic */ PopupCardVO LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NS1(C594180NSe c594180NSe, PopupCardVO popupCardVO, String str, InterfaceC1364105Vn<? super C0NS1> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c594180NSe;
        this.LLILLJJLI = popupCardVO;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0NS1(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.09AY, kotlin.jvm.functions.Function0] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CouponCardClickListener@b2d3.claimSurpriseCoupon$4$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        ?? r0 = this.LL.LIZIZ.LLJILJILJ;
        if (r0 != 0) {
            r0.invoke();
        }
        this.LL.LIZIZ.LJJLIIIJLJLI(this.LLILLJJLI, this.LLILLL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CouponCardClickListener@b2d3.claimSurpriseCoupon$4$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
