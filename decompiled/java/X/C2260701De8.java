package X;

import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.Voucher;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BCMStandardTrack;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.shop.USSESSellerModuleV3VH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.shop.USSESSellerModuleVO;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.api.FollowShopAndClaimRequest;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS401S0200000_35;
import kotlin.jvm.internal.AwS646S0100000_32;
import njp.a;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1De8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.shop.USSESSellerModuleV3VH$bindFollowButton$1$1$4", f = "USSESSellerModuleV3VH.kt", l = {}, m = "invokeSuspend")
public final class C2260701De8 extends C09AX implements Function1<InterfaceC1364105Vn<? super Boolean>, Object> {
    public final /* synthetic */ C1751830vgj LL;
    public final /* synthetic */ USSESSellerModuleVO LLILLJJLI;
    public final /* synthetic */ USSESSellerModuleV3VH LLILLL;
    public final /* synthetic */ User LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2260701De8(C1751830vgj c1751830vgj, USSESSellerModuleVO uSSESSellerModuleVO, USSESSellerModuleV3VH uSSESSellerModuleV3VH, User user, InterfaceC1364105Vn<? super C2260701De8> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LL = c1751830vgj;
        this.LLILLJJLI = uSSESSellerModuleVO;
        this.LLILLL = uSSESSellerModuleV3VH;
        this.LLILZ = user;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2260701De8(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v3 */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        ?? r2;
        Object obj2;
        List list;
        String str;
        Map<String, String> trackParam;
        Map<String, Object> map;
        C1C7U.LIZ("USSESSellerModuleV3VH@636f.bindFollowButton$1$1$4");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1748720vbi.LIZLLL(this.LL, new C049Y(), new AwS401S0200000_35(this.LLILLL, this.LLILLJJLI, 63));
        USSESSellerModuleVO uSSESSellerModuleVO = this.LLILLJJLI;
        Voucher voucher = uSSESSellerModuleVO.followVoucher;
        if (voucher != null) {
            r2 = 1;
            USSESSellerModuleV3VH uSSESSellerModuleV3VH = this.LLILLL;
            User user = this.LLILZ;
            C1751830vgj c1751830vgjT6 = uSSESSellerModuleV3VH.T6();
            if (c1751830vgjT6 != null) {
                c1751830vgjT6.setLoading(true);
            }
            C04H8 c04h8 = uSSESSellerModuleV3VH.t7().LLLLLLLLL;
            String str2 = uSSESSellerModuleVO.sellerId;
            String voucherTypeID = voucher.getVoucherTypeID();
            Integer numLJ = C2286608xc.LJ(4);
            IPdpStarter.PdpEnterParam pdpEnterParam = uSSESSellerModuleV3VH.t7().LLJI;
            if (pdpEnterParam != null && (map = pdpEnterParam.trackParams) != null) {
                obj2 = map.get("traffic_source_list");
            } else {
                obj2 = null;
            }
            if (obj2 instanceof List) {
                list = (List) obj2;
            } else {
                list = null;
            }
            BCMStandardTrack bcmStandardTrack = voucher.getBcmStandardTrack();
            if (bcmStandardTrack != null && (trackParam = bcmStandardTrack.getTrackParam()) != null) {
                str = trackParam.get("bcm_coupon_id");
            } else {
                str = null;
            }
            C948503nH.LJFF(c04h8.LIZ, C0PEM.LIZJ, new C05F4(new FollowShopAndClaimRequest(str2, voucherTypeID, numLJ, list, str, "a2270.b6661.c2857.d2919"), user.getUid(), new AwS646S0100000_32(uSSESSellerModuleV3VH, 26), null));
        } else {
            r2 = 0;
        }
        C1351210lGZ c1351210lGZ = (C1351210lGZ) this.LLILLL.LLLLLLJ.getValue();
        if (c1351210lGZ != null) {
            c1351210lGZ.LIZIZ(15, 50);
        }
        if (r2 != 0) {
            C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
            JSONObject jSONObject = new JSONObject();
            User user2 = this.LLILZ;
            USSESSellerModuleV3VH uSSESSellerModuleV3VH2 = this.LLILLL;
            jSONObject.put("with_coupon", (int) r2);
            jSONObject.put("page_name", "product_detail");
            jSONObject.put("to_user_id", user2.getUid());
            jSONObject.put("enter_method", "pdp_showcase_detail");
            jSONObject.put("button_name", "shop_follow_icon");
            jSONObject.put("sub_page", "shop_follow_icon");
            jSONObject.put("enter_from", "product_detail");
            jSONObject.put("author_id", uSSESSellerModuleV3VH2.t7().UR2("author_id"));
            jSONObject.put("previous_page", uSSESSellerModuleV3VH2.t7().UR2("previous_page"));
            c1507790pL7.getClass();
            C1507790pL7.LIZLLL("follow", jSONObject);
        }
        Boolean boolValueOf = Boolean.valueOf((boolean) r2);
        C1C7U.LIZIZ("USSESSellerModuleV3VH@636f.bindFollowButton$1$1$4");
        return boolValueOf;
    }
}
