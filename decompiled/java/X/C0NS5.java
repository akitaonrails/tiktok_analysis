package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.LiveVoucher;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.VoucherAction;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.popcard.vo.PopupCardVO;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0NS5, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommercelive.common.infra.popcard.click.CouponCardClickListener$onClickBySurpriseCoupon$1", f = "CouponCardClickListener.kt", l = {355, 360}, m = "invokeSuspend")
public final class C0NS5 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ C594180NSe LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NS5(C594180NSe c594180NSe, InterfaceC1364105Vn<? super C0NS5> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c594180NSe;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0NS5(this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        Integer num;
        int iLJIJ;
        LiveVoucher liveVoucher;
        VoucherAction voucherAction;
        String str;
        C1C7U.LIZ("CouponCardClickListener@b2d3.onClickBySurpriseCoupon$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            num = (Integer) this.LL;
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C594180NSe c594180NSe = this.LLILLL;
            PopupCardVO popupCardVO = c594180NSe.LIZIZ.LL;
            if (popupCardVO != null && (liveVoucher = popupCardVO.popVoucher) != null && (voucherAction = liveVoucher.action) != null) {
                num = voucherAction.type;
            } else {
                num = null;
            }
            if (c594180NSe.LIZ) {
                this.LL = num;
                this.LLILLJJLI = 1;
                if (c594180NSe.LJIIIZ(this) == objLJFF) {
                    C1C7U.LIZIZ("CouponCardClickListener@b2d3.onClickBySurpriseCoupon$1");
                    return objLJFF;
                }
            } else if (num != null && num.intValue() == 7) {
                C594180NSe c594180NSe2 = this.LLILLL;
                try {
                    iLJIJ = C0C64.LJIILLIIL().LJIJ(31744, 0, "ec_live_sea_voucher_card_use_type", true);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    iLJIJ = 0;
                }
                c594180NSe2.LJ(iLJIJ, false);
            } else {
                C594180NSe c594180NSe3 = this.LLILLL;
                this.LL = num;
                this.LLILLJJLI = 2;
                if (c594180NSe3.LIZJ(this) == objLJFF) {
                    C1C7U.LIZIZ("CouponCardClickListener@b2d3.onClickBySurpriseCoupon$1");
                    return objLJFF;
                }
            }
        }
        C594180NSe c594180NSe4 = this.LLILLL;
        if (c594180NSe4.LIZ) {
            str = "unpin";
        } else {
            str = "cta";
        }
        c594180NSe4.LJII(num, str);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CouponCardClickListener@b2d3.onClickBySurpriseCoupon$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
