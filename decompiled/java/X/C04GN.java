package X;

import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.ClaimExpansionVoucherRequest;
import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.ClaimExpansionVoucherResponse;
import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.ClaimExpansionVoucherResponseData;
import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.Voucher;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PopUpButtonExtraInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.VoucherInfo;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.04GN, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.popup.PdpActionMgr$handleClaimExpansionCoupon$1", f = "PdpActionMgr.kt", l = {291, 312}, m = "invokeSuspend")
public final class C04GN extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ PopUpButtonExtraInfo LLILLL;
    public final /* synthetic */ C04H5 LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C04GN(PopUpButtonExtraInfo popUpButtonExtraInfo, C04H5 c04h5, InterfaceC1364105Vn<? super C04GN> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = popUpButtonExtraInfo;
        this.LLILZ = c04h5;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C04GN c04gn = new C04GN(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c04gn.LLILLJJLI = obj;
        return c04gn;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        VoucherInfo voucherInfo;
        C04GV c04gv;
        Voucher voucher;
        String str;
        VoucherInfo voucherInfo2;
        int i;
        Object obj2;
        String str2;
        HashMap<String, Object> mapLJIIJ;
        ClaimExpansionVoucherResponseData claimExpansionVoucherResponseData;
        Voucher voucher2;
        int i2;
        Object obj3;
        String str3;
        Object obj4;
        String str4;
        HashMap<String, Object> mapLJIIJ2;
        HashMap<String, Object> mapLJIIJ3;
        Object objLIZ = obj;
        C1C7U.LIZ("PdpActionMgr@d66f.handleClaimExpansionCoupon$1");
        Object objLJFF = C099R.LJFF();
        int i3 = this.LL;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 == 2) {
                    C155000ia.LIZIZ(objLIZ);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("PdpActionMgr@d66f.handleClaimExpansionCoupon$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            voucherInfo = (VoucherInfo) this.LLILLJJLI;
            C155000ia.LIZIZ(objLIZ);
        } else {
            C155000ia.LIZIZ(objLIZ);
            PopUpButtonExtraInfo popUpButtonExtraInfo = this.LLILLL;
            if (popUpButtonExtraInfo != null && (voucherInfo = popUpButtonExtraInfo.voucherInfo) != null) {
                C1069904Gj c1069904Gj = InterfaceC1069804Gi.LIZ;
                String str5 = voucherInfo.voucherTypeId;
                String str6 = voucherInfo.basicVoucherId;
                if (str6 != null && str6.length() != 0) {
                    c04gv = C04GV.UPGRADE;
                } else {
                    c04gv = C04GV.LOTTERY;
                }
                ClaimExpansionVoucherRequest claimExpansionVoucherRequest = new ClaimExpansionVoucherRequest("pdp_surprise_voucher", str5, C2286608xc.LJ(c04gv.getValue()), voucherInfo.basicVoucherTypeId, voucherInfo.basicVoucherId);
                this.LLILLJJLI = voucherInfo;
                this.LL = 1;
                objLIZ = c1069904Gj.LIZ(claimExpansionVoucherRequest, this);
                if (objLIZ == objLJFF) {
                    C1C7U.LIZIZ("PdpActionMgr@d66f.handleClaimExpansionCoupon$1");
                    return objLJFF;
                }
            } else {
                C1019103yf.LIZ(EnumC1014603xw.ERR10007, null, null);
                Unit unit2 = Unit.LIZ;
                C1C7U.LIZIZ("PdpActionMgr@d66f.handleClaimExpansionCoupon$1");
                return unit2;
            }
        }
        ClaimExpansionVoucherResponse claimExpansionVoucherResponse = (ClaimExpansionVoucherResponse) objLIZ;
        C1054004Ag c1054004Ag = this.LLILZ.LIZ.LLJLILLLLZIIL;
        if (c1054004Ag != null) {
            ClaimExpansionVoucherResponseData claimExpansionVoucherResponseData2 = (ClaimExpansionVoucherResponseData) claimExpansionVoucherResponse.data;
            if (claimExpansionVoucherResponseData2 != null) {
                voucher2 = claimExpansionVoucherResponseData2.getVoucher();
            } else {
                voucher2 = null;
            }
            int i4 = claimExpansionVoucherResponse.code;
            if (i4 == 0) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            String strValueOf = String.valueOf(i4);
            String str7 = this.LLILLL.daInfo;
            if (str7 != null && (mapLJIIJ3 = C1741890vQh.LJIIJ(str7)) != null) {
                obj3 = mapLJIIJ3.get("coupon_zone");
            } else {
                obj3 = null;
            }
            if (!(obj3 instanceof String) || (str3 = (String) obj3) == null) {
                str3 = "algo_voucher";
            }
            String str8 = this.LLILLL.daInfo;
            if (str8 != null && (mapLJIIJ2 = C1741890vQh.LJIIJ(str8)) != null) {
                obj4 = mapLJIIJ2.get("rec_ug_params");
            } else {
                obj4 = null;
            }
            if (obj4 instanceof String) {
                str4 = (String) obj4;
            } else {
                str4 = null;
            }
            C1054004Ag.LJIILLIIL(c1054004Ag, voucher2, i2, strValueOf, str3, "upgrade", str4, this.LLILLL);
        }
        if (C123100dR.LIZ(voucherInfo.basicVoucherId)) {
            C04H5 c04h5 = this.LLILZ;
            PopUpButtonExtraInfo popUpButtonExtraInfo2 = this.LLILLL;
            c04h5.getClass();
            ClaimExpansionVoucherResponseData claimExpansionVoucherResponseData3 = (ClaimExpansionVoucherResponseData) claimExpansionVoucherResponse.data;
            if (claimExpansionVoucherResponseData3 == null || (voucher = claimExpansionVoucherResponseData3.getVoucher()) == null) {
                if (popUpButtonExtraInfo2 == null || (voucherInfo2 = popUpButtonExtraInfo2.voucherInfo) == null || (str = voucherInfo2.voucherTypeId) == null) {
                    str = "-1";
                }
                voucher = new Voucher("-1", str, null, 0, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, "", "", "", "", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
            }
            C1054004Ag c1054004Ag2 = c04h5.LIZ.LLJLILLLLZIIL;
            if (c1054004Ag2 != null) {
                if (claimExpansionVoucherResponse.code == 0 && (claimExpansionVoucherResponseData = (ClaimExpansionVoucherResponseData) claimExpansionVoucherResponse.data) != null && Intrinsics.LJFF(claimExpansionVoucherResponseData.isSuccessUpgrade(), Boolean.TRUE)) {
                    i = 1;
                } else {
                    i = 0;
                }
                if (popUpButtonExtraInfo2 != null && (str2 = popUpButtonExtraInfo2.daInfo) != null && (mapLJIIJ = C1741890vQh.LJIIJ(str2)) != null) {
                    obj2 = mapLJIIJ.get("rec_ug_params");
                } else {
                    obj2 = null;
                }
                if (!(obj2 instanceof String)) {
                    obj2 = null;
                }
                String strValueOf2 = String.valueOf(claimExpansionVoucherResponse.code);
                C04C8 c04c8 = new C04C8() { // from class: X.04F2
                };
                C04CA.LJ(C04CA.LIZJ(Boolean.FALSE, C1697810uHb.LJIILJJIL(voucher)), c04c8, c1054004Ag2.LIZIZ);
                c04c8.LJFF("algo_voucher");
                Integer numValueOf = Integer.valueOf(i);
                if (numValueOf != null) {
                    numValueOf.intValue();
                    c04c8.LIZIZ.put("is_success", numValueOf);
                }
                if (obj2 != null) {
                    c04c8.LIZIZ.put("rec_ug_params", obj2);
                }
                if (strValueOf2 != null) {
                    c04c8.LIZIZ.put("fail_reason", strValueOf2);
                }
                c04c8.LIZIZ();
            }
        }
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
        C04GQ c04gq = new C04GQ(claimExpansionVoucherResponse, this.LLILZ, this.LLILLL, null);
        this.LLILLJJLI = null;
        this.LL = 2;
        if (C23250099c.LJI(this, abstractC2238408pq, c04gq) == objLJFF) {
            C1C7U.LIZIZ("PdpActionMgr@d66f.handleClaimExpansionCoupon$1");
            return objLJFF;
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("PdpActionMgr@d66f.handleClaimExpansionCoupon$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
