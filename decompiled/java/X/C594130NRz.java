package X;

import com.ss.android.ugc.aweme.ecommercelive.common.infra.popcard.vo.PopupCardVO;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NRz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommercelive.common.infra.popcard.click.CouponCardClickListener$claim$3$1", f = "CouponCardClickListener.kt", l = {}, m = "invokeSuspend")
public final class C594130NRz extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C594180NSe LL;
    public final /* synthetic */ PopupCardVO LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C594130NRz(C594180NSe c594180NSe, PopupCardVO popupCardVO, InterfaceC1364105Vn<? super C594130NRz> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c594180NSe;
        this.LLILLJJLI = popupCardVO;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C594130NRz(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CouponCardClickListener@b2d3.claim$3$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LIZIZ.LJJLIIIJLJLI(this.LLILLJJLI, "");
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CouponCardClickListener@b2d3.claim$3$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
