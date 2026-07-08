package X;

import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.ClaimVoucherResponse;
import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.ClaimVoucherResponseData;
import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.InstanceInfo;
import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.Voucher;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BasicPopUp;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PopUpButtonExtraInfo;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.04GR, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.popup.PdpActionMgr$handleClaimCouponFromComponent$1$1", f = "PdpActionMgr.kt", l = {}, m = "invokeSuspend")
public final class C04GR extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ ClaimVoucherResponse LL;
    public final /* synthetic */ PopUpButtonExtraInfo LLILLJJLI;
    public final /* synthetic */ C04H5 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C04GR(ClaimVoucherResponse claimVoucherResponse, PopUpButtonExtraInfo popUpButtonExtraInfo, C04H5 c04h5, InterfaceC1364105Vn<? super C04GR> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = claimVoucherResponse;
        this.LLILLJJLI = popUpButtonExtraInfo;
        this.LLILLL = c04h5;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C04GR(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Voucher voucher;
        String voucherTypeID;
        String instanceKey;
        InstanceInfo instanceInfo;
        Object obj2;
        String str;
        Object obj3;
        HashMap<String, Object> mapLJIIJ;
        HashMap<String, Object> mapLJIIJ2;
        String voucherID;
        String instanceKey2;
        InstanceInfo instanceInfo2;
        C1C7U.LIZ("PdpActionMgr@d66f.handleClaimCouponFromComponent$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        ClaimVoucherResponseData claimVoucherResponseData = (ClaimVoucherResponseData) this.LL.data;
        String str2 = null;
        if (claimVoucherResponseData != null) {
            voucher = claimVoucherResponseData.getVoucher();
        } else {
            voucher = null;
        }
        int i = 0;
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
                    instanceKey2 = instanceInfo2.getInstanceKey();
                } else {
                    instanceKey2 = null;
                }
                c04h5.LIZJ(voucherTypeID2, instanceKey2, true);
            }
        } else {
            this.LLILLL.LIZ.LLLLJ.LJIILJJIL(R.raw.icon_exclamation_mark_circle_fill, C2286608xc.LJ(2131832605));
            C04H5 c04h52 = this.LLILLL;
            if (voucher != null) {
                voucherTypeID = voucher.getVoucherTypeID();
                List<InstanceInfo> instanceInfoList2 = voucher.getInstanceInfoList();
                if (instanceInfoList2 != null && (instanceInfo = (InstanceInfo) C13LP.LJJJLL(instanceInfoList2)) != null) {
                    instanceKey = instanceInfo.getInstanceKey();
                }
                c04h52.LIZJ(voucherTypeID, instanceKey, false);
            } else {
                voucherTypeID = null;
            }
            instanceKey = null;
            c04h52.LIZJ(voucherTypeID, instanceKey, false);
        }
        C1054004Ag c1054004Ag = this.LLILLL.LIZ.LLJLILLLLZIIL;
        if (c1054004Ag != null) {
            int i2 = this.LL.code;
            if (i2 == 0) {
                i = 1;
            }
            String strValueOf = String.valueOf(i2);
            String str3 = this.LLILLJJLI.daInfo;
            if (str3 != null && (mapLJIIJ2 = C1741890vQh.LJIIJ(str3)) != null) {
                obj2 = mapLJIIJ2.get("coupon_zone");
            } else {
                obj2 = null;
            }
            if (!(obj2 instanceof String) || (str = (String) obj2) == null) {
                str = "discounts_module";
            }
            String str4 = this.LLILLJJLI.daInfo;
            if (str4 != null && (mapLJIIJ = C1741890vQh.LJIIJ(str4)) != null) {
                obj3 = mapLJIIJ.get("rec_ug_params");
            } else {
                obj3 = null;
            }
            if (obj3 instanceof String) {
                str2 = (String) obj3;
            }
            C1054004Ag.LJIILLIIL(c1054004Ag, voucher, i, strValueOf, str, null, str2, this.LLILLJJLI);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PdpActionMgr@d66f.handleClaimCouponFromComponent$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
