package X;

import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.ClaimExpansionVoucherResponse;
import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.ClaimExpansionVoucherResponseData;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BasicPopUp;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PopUpButtonExtraInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.04GQ, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.popup.PdpActionMgr$handleClaimExpansionCoupon$1$1", f = "PdpActionMgr.kt", l = {}, m = "invokeSuspend")
public final class C04GQ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ ClaimExpansionVoucherResponse LL;
    public final /* synthetic */ C04H5 LLILLJJLI;
    public final /* synthetic */ PopUpButtonExtraInfo LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C04GQ(ClaimExpansionVoucherResponse claimExpansionVoucherResponse, C04H5 c04h5, PopUpButtonExtraInfo popUpButtonExtraInfo, InterfaceC1364105Vn<? super C04GQ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = claimExpansionVoucherResponse;
        this.LLILLJJLI = c04h5;
        this.LLILLL = popUpButtonExtraInfo;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C04GQ(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        ClaimExpansionVoucherResponseData claimExpansionVoucherResponseData;
        C1C7U.LIZ("PdpActionMgr@d66f.handleClaimExpansionCoupon$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        ClaimExpansionVoucherResponse claimExpansionVoucherResponse = this.LL;
        if (claimExpansionVoucherResponse.code != 0 || ((claimExpansionVoucherResponseData = (ClaimExpansionVoucherResponseData) claimExpansionVoucherResponse.data) != null && Intrinsics.LJFF(claimExpansionVoucherResponseData.isSuccessUpgrade(), false))) {
            this.LLILLJJLI.LIZ.LLLLJ.LJIILJJIL(R.raw.icon_exclamation_mark_circle_fill, C2286608xc.LJ(2131832605));
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("PdpActionMgr@d66f.handleClaimExpansionCoupon$1$1");
            return unit;
        }
        C04H5 c04h5 = this.LLILLJJLI;
        PdpViewModel pdpViewModel = c04h5.LIZ;
        pdpViewModel.LLLLLLLLLL.LIZIZ = true;
        BasicPopUp basicPopUp = this.LLILLL.nextPopUp;
        if (basicPopUp != null) {
            c04h5.LIZIZ(basicPopUp);
            this.LLILLJJLI.LIZ.LLLLJ.LJIIIIZZ(this.LLILLL.nextPopUp, null, null);
        } else {
            pdpViewModel.LLLLJ.LJIILJJIL(R.raw.icon_tick_circle_fill, C2286608xc.LJ(2131832603));
        }
        this.LLILLJJLI.LIZ.d();
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("PdpActionMgr@d66f.handleClaimExpansionCoupon$1$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
