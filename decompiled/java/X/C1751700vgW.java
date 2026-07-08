package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellerDetailInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellerInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ShopPerformance;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.spark.PdpSparkLiteCardHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.vo.StoreLabel;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.vo.StoreOfficialLabel;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0vgW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.spark.PdpSparkLiteCardHolder$onCreate$2", f = "PdpSparkLiteCardHolder.kt", l = {}, m = "invokeSuspend")
public final class C1751700vgW extends C09AX implements InterfaceC1631620sYq<Map<String, ? extends Object>, Map<String, ? extends Object>, InterfaceC1364105Vn<? super AbstractC1470205pE>, Object> {
    public /* synthetic */ Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ PdpSparkLiteCardHolder LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1751700vgW(PdpSparkLiteCardHolder pdpSparkLiteCardHolder, InterfaceC1364105Vn<? super C1751700vgW> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
        this.LLILLL = pdpSparkLiteCardHolder;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c1470005pC;
        C19EG activity;
        SellerInfo sellerInfo;
        Float fLJIIIIZZ;
        Object obj2;
        String str;
        Object obj3;
        String str2;
        Object obj4;
        String str3;
        Object obj5;
        String str4;
        String str5;
        Object obj6;
        String str6;
        StoreOfficialLabel storeOfficialLabel;
        C1C7U.LIZ("PdpSparkLiteCardHolder@81b6.onCreate$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Map map = (Map) this.LL;
        C1751710vgX c1751710vgX = new Object() { // from class: X.0vgX
        };
        PdpViewModel pdpViewModelC6 = this.LLILLL.c6();
        View view = this.LLILLL.itemView;
        c1751710vgX.getClass();
        Fragment fragmentLIZ = C946803n0.LIZ(view);
        if (fragmentLIZ != null && (activity = fragmentLIZ.getActivity()) != null) {
            ProductPackStruct productPackStruct = pdpViewModelC6.LLJILLL;
            if (productPackStruct != null && (sellerInfo = productPackStruct.sellerInfo) != null) {
                String str7 = sellerInfo.shopLink;
                if (str7 == null) {
                    str7 = "";
                }
                String str8 = sellerInfo.name;
                String str9 = sellerInfo.rating;
                if (str9 != null) {
                    fLJIIIIZZ = C2327809Ae.LJIIIIZZ(str9);
                } else {
                    fLJIIIIZZ = null;
                }
                if (map != null) {
                    obj2 = map.get("entranceType");
                } else {
                    obj2 = null;
                }
                if (obj2 instanceof String) {
                    str = (String) obj2;
                } else {
                    str = null;
                }
                int iTg2 = pdpViewModelC6.Tg2();
                List<SellerDetailInfo> list = sellerInfo.sellerDetailInfos;
                if (map != null) {
                    obj3 = map.get("enterMethod");
                } else {
                    obj3 = null;
                }
                if (obj3 instanceof String) {
                    str2 = (String) obj3;
                } else {
                    str2 = null;
                }
                if (map != null) {
                    obj4 = map.get("clickArea");
                } else {
                    obj4 = null;
                }
                if (obj4 instanceof String) {
                    str3 = (String) obj4;
                } else {
                    str3 = null;
                }
                if (map != null) {
                    obj5 = map.get("sellingPoint");
                } else {
                    obj5 = null;
                }
                if (obj5 instanceof String) {
                    str4 = (String) obj5;
                } else {
                    str4 = null;
                }
                ShopPerformance shopPerformance = sellerInfo.shopPerformance;
                StoreLabel storeLabel = sellerInfo.storeLabel;
                if (storeLabel != null && (storeOfficialLabel = storeLabel.officialLabel) != null) {
                    str5 = storeOfficialLabel.labelTypeStr;
                } else {
                    str5 = null;
                }
                if (map != null) {
                    obj6 = map.get("btm");
                } else {
                    obj6 = null;
                }
                if (obj6 instanceof String) {
                    str6 = (String) obj6;
                } else {
                    str6 = null;
                }
                PdpViewModel.VR2(pdpViewModelC6, activity, str7, str8, fLJIIIIZZ, str, str5, iTg2, null, null, str2, list, str3, str4, shopPerformance, null, str6, null, null, null, 958848);
                c1470005pC = new C1470305pF(C2097908Jt.LIZJ(new Pair("schema", "")), 2);
            } else {
                c1470005pC = new C1470005pC(0, "jsb state error", null);
            }
        } else {
            c1470005pC = new C1470005pC(0, "activity is null", null);
        }
        C1C7U.LIZIZ("PdpSparkLiteCardHolder@81b6.onCreate$2");
        return c1470005pC;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(Map<String, ? extends Object> map, Map<String, ? extends Object> map2, InterfaceC1364105Vn<? super AbstractC1470205pE> interfaceC1364105Vn) {
        C1751700vgW c1751700vgW = new C1751700vgW(this.LLILLL, interfaceC1364105Vn);
        c1751700vgW.LL = map;
        c1751700vgW.LLILLJJLI = map2;
        return c1751700vgW.invokeSuspend(Unit.LIZ);
    }
}
