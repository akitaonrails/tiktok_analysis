package X;

import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.ClaimVoucherRequest;
import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.ClaimVoucherResponse;
import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.ClaimVoucherResponseData;
import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.Voucher;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PopUpButtonExtraInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.VoucherInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.04GS, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.popup.PdpActionMgr$handleClaimCoupon$1", f = "PdpActionMgr.kt", l = {190, 200}, m = "invokeSuspend")
public final class C04GS extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ PopUpButtonExtraInfo LLILLL;
    public final /* synthetic */ C04H5 LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C04GS(PopUpButtonExtraInfo popUpButtonExtraInfo, C04H5 c04h5, InterfaceC1364105Vn<? super C04GS> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = popUpButtonExtraInfo;
        this.LLILZ = c04h5;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C04GS c04gs = new C04GS(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c04gs.LLILLJJLI = obj;
        return c04gs;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        VoucherInfo voucherInfo;
        Voucher voucher;
        Object obj2;
        String str;
        Object obj3;
        String str2;
        HashMap<String, Object> mapLJIIJ;
        HashMap<String, Object> mapLJIIJ2;
        Object objLIZIZ = obj;
        C1C7U.LIZ("PdpActionMgr@d66f.handleClaimCoupon$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        int i2 = 1;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(objLIZIZ);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("PdpActionMgr@d66f.handleClaimCoupon$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(objLIZIZ);
        } else {
            C155000ia.LIZIZ(objLIZIZ);
            PopUpButtonExtraInfo popUpButtonExtraInfo = this.LLILLL;
            if (popUpButtonExtraInfo != null && (voucherInfo = popUpButtonExtraInfo.voucherInfo) != null) {
                String str3 = voucherInfo.voucherTypeId;
                if (str3 == null) {
                    C1019103yf.LIZ(EnumC1014603xw.ERR10008, null, null);
                    Unit unit2 = Unit.LIZ;
                    C1C7U.LIZIZ("PdpActionMgr@d66f.handleClaimCoupon$1");
                    return unit2;
                }
                C1013003xg c1013003xg = IPdpStarter.LIZ;
                IPdpStarter.PdpEnterParam pdpEnterParam = this.LLILZ.LIZ.LLJI;
                c1013003xg.getClass();
                Integer numLJ = C2286608xc.LJ(C1013003xg.LIZJ(pdpEnterParam));
                PopUpButtonExtraInfo popUpButtonExtraInfo2 = this.LLILLL;
                ClaimVoucherRequest claimVoucherRequest = new ClaimVoucherRequest(str3, 1, numLJ, null, null, null, popUpButtonExtraInfo2.transparentFields, popUpButtonExtraInfo2.voucherInfo.instanceKey);
                C1069904Gj c1069904Gj = InterfaceC1069804Gi.LIZ;
                this.LL = 1;
                objLIZIZ = c1069904Gj.LIZIZ(claimVoucherRequest, this);
                if (objLIZIZ == objLJFF) {
                    C1C7U.LIZIZ("PdpActionMgr@d66f.handleClaimCoupon$1");
                    return objLJFF;
                }
            } else {
                C1019103yf.LIZ(EnumC1014603xw.ERR10007, null, null);
                Unit unit3 = Unit.LIZ;
                C1C7U.LIZIZ("PdpActionMgr@d66f.handleClaimCoupon$1");
                return unit3;
            }
        }
        ClaimVoucherResponse claimVoucherResponse = (ClaimVoucherResponse) objLIZIZ;
        C1054004Ag c1054004Ag = this.LLILZ.LIZ.LLJLILLLLZIIL;
        if (c1054004Ag != null) {
            ClaimVoucherResponseData claimVoucherResponseData = (ClaimVoucherResponseData) claimVoucherResponse.data;
            if (claimVoucherResponseData != null) {
                voucher = claimVoucherResponseData.getVoucher();
            } else {
                voucher = null;
            }
            int i3 = claimVoucherResponse.code;
            if (i3 != 0) {
                i2 = 0;
            }
            String strValueOf = String.valueOf(i3);
            String str4 = this.LLILLL.daInfo;
            if (str4 != null && (mapLJIIJ2 = C1741890vQh.LJIIJ(str4)) != null) {
                obj2 = mapLJIIJ2.get("coupon_zone");
            } else {
                obj2 = null;
            }
            if (obj2 instanceof String) {
                str = (String) obj2;
            } else {
                str = null;
            }
            String str5 = this.LLILLL.daInfo;
            if (str5 != null && (mapLJIIJ = C1741890vQh.LJIIJ(str5)) != null) {
                obj3 = mapLJIIJ.get("rec_ug_params");
            } else {
                obj3 = null;
            }
            if (obj3 instanceof String) {
                str2 = (String) obj3;
            } else {
                str2 = null;
            }
            C1054004Ag.LJIILLIIL(c1054004Ag, voucher, i2, strValueOf, str, "get_directly", str2, this.LLILLL);
        }
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
        C04GU c04gu = new C04GU(claimVoucherResponse, this.LLILLL, this.LLILZ, null);
        this.LL = 2;
        if (C23250099c.LJI(this, abstractC2238408pq, c04gu) == objLJFF) {
            C1C7U.LIZIZ("PdpActionMgr@d66f.handleClaimCoupon$1");
            return objLJFF;
        }
        Unit unit4 = Unit.LIZ;
        C1C7U.LIZIZ("PdpActionMgr@d66f.handleClaimCoupon$1");
        return unit4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
