package X;

import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.ClaimVoucherResponse;
import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.ClaimVoucherResponseData;
import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.InstanceInfo;
import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.Voucher;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BasicPopUp;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PopUpButtonExtraInfo;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.04GU, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.popup.PdpActionMgr$handleClaimCoupon$1$1", f = "PdpActionMgr.kt", l = {}, m = "invokeSuspend")
public final class C04GU extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ ClaimVoucherResponse LL;
    public final /* synthetic */ PopUpButtonExtraInfo LLILLJJLI;
    public final /* synthetic */ C04H5 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C04GU(ClaimVoucherResponse claimVoucherResponse, PopUpButtonExtraInfo popUpButtonExtraInfo, C04H5 c04h5, InterfaceC1364105Vn<? super C04GU> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = claimVoucherResponse;
        this.LLILLJJLI = popUpButtonExtraInfo;
        this.LLILLL = c04h5;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C04GU(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Voucher voucher;
        String voucherTypeID;
        InstanceInfo instanceInfo;
        String voucherID;
        InstanceInfo instanceInfo2;
        C1C7U.LIZ("PdpActionMgr@d66f.handleClaimCoupon$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        ClaimVoucherResponseData claimVoucherResponseData = (ClaimVoucherResponseData) this.LL.data;
        String instanceKey = null;
        if (claimVoucherResponseData != null) {
            voucher = claimVoucherResponseData.getVoucher();
        } else {
            voucher = null;
        }
        if (this.LL.code == 0) {
            BasicPopUp basicPopUp = this.LLILLJJLI.nextPopUp;
            if (basicPopUp != null) {
                this.LLILLL.LIZIZ(basicPopUp);
                this.LLILLL.LIZ.LLLLJ.LJIIIIZZ(this.LLILLJJLI.nextPopUp, null, null);
            } else {
                this.LLILLL.LIZ.LLLLJ.LJIILJJIL(R.raw.icon_tick_circle_fill, C2286608xc.LJ(2131832603));
            }
            if (voucher != null && (voucherID = voucher.getVoucherID()) != null && C123100dR.LIZ(voucherID)) {
                C04H5 c04h5 = this.LLILLL;
                String voucherTypeID2 = voucher.getVoucherTypeID();
                List<InstanceInfo> instanceInfoList = voucher.getInstanceInfoList();
                if (instanceInfoList != null && (instanceInfo2 = (InstanceInfo) C13LP.LJJJLL(instanceInfoList)) != null) {
                    instanceKey = instanceInfo2.getInstanceKey();
                }
                c04h5.LIZJ(voucherTypeID2, instanceKey, true);
            }
            this.LLILLL.LIZ.d();
        } else {
            this.LLILLL.LIZ.LLLLJ.LJIILJJIL(R.raw.icon_exclamation_mark_circle_fill, C2286608xc.LJ(2131832605));
            C04H5 c04h52 = this.LLILLL;
            if (voucher != null) {
                voucherTypeID = voucher.getVoucherTypeID();
                List<InstanceInfo> instanceInfoList2 = voucher.getInstanceInfoList();
                if (instanceInfoList2 != null && (instanceInfo = (InstanceInfo) C13LP.LJJJLL(instanceInfoList2)) != null) {
                    instanceKey = instanceInfo.getInstanceKey();
                }
            } else {
                voucherTypeID = null;
            }
            c04h52.LIZJ(voucherTypeID, instanceKey, false);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PdpActionMgr@d66f.handleClaimCoupon$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
