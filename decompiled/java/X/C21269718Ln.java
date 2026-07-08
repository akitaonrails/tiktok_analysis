package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.ecommerce.anchor.utils.AnchorBizUtils;
import com.ss.android.ugc.aweme.ecommerce.dependency.account.AccountDependencyService;
import com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfo;
import com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfoModel;
import com.ss.android.ugc.aweme.ecommerce.model.ProductListModel;
import com.ss.android.ugc.aweme.ecommerce.model.SkuItem;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.account.IAccountDependencyService;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.18Ln, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21269718Ln extends C09AY implements Function1<C957403oi, Unit> {
    public final /* synthetic */ ProductListModel LL;
    public final /* synthetic */ AnchorProductInfoModel LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ Map<String, Object> LLIZ;
    public final /* synthetic */ List<SkuItem> LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21269718Ln(ProductListModel productListModel, AnchorProductInfoModel anchorProductInfoModel, int i, boolean z, int i2, String str, Map<String, ? extends Object> map, List<SkuItem> list) {
        super(1);
        this.LL = productListModel;
        this.LLILLJJLI = anchorProductInfoModel;
        this.LLILLL = i;
        this.LLILZ = z;
        this.LLILZIL = i2;
        this.LLILZLL = str;
        this.LLIZ = map;
        this.LLIZLLLIL = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C957403oi c957403oi) {
        String string;
        String string2;
        IECommerceHostService iECommerceHostService;
        String str;
        String str2;
        String str3;
        String str4;
        boolean z;
        String name;
        AwemeRawAd awemeRawAd;
        Long creativeId;
        AwemeRawAd awemeRawAd2;
        Long adId;
        C957403oi c957403oi2 = c957403oi;
        c957403oi2.LIZLLL("EVENT_ORIGIN_FEATURE", "TEMAI");
        String str5 = this.LL.aid;
        String str6 = "";
        if (str5 == null) {
            str5 = "";
        }
        c957403oi2.LIZLLL("group_id", str5);
        String str7 = this.LL.authorUid;
        if (str7 == null) {
            str7 = "";
        }
        c957403oi2.LIZLLL("author_id", str7);
        String str8 = this.LL.eventType;
        if (str8 == null) {
            str8 = "";
        }
        c957403oi2.LIZLLL("enter_from", str8);
        c957403oi2.LIZLLL("anchor_show_type", "video_cart_tag");
        c957403oi2.LIZLLL("product_source", String.valueOf(this.LLILLJJLI.extraData.platform));
        String str9 = this.LLILLJJLI.extraData.source;
        if (str9 == null) {
            str9 = "";
        }
        c957403oi2.LIZLLL("source", str9);
        c957403oi2.LIZLLL("product_id", String.valueOf(this.LLILLJJLI.extraData.productId));
        C21272018Mk c21272018Mk = C21272018Mk.LIZ;
        AnchorProductInfoModel anchorProductInfoModel = this.LLILLJJLI;
        c21272018Mk.getClass();
        c957403oi2.LIZLLL("biz_type", C21272018Mk.LJIIJJI(anchorProductInfoModel));
        AnchorBizUtils anchorBizUtils = AnchorBizUtils.LIZ;
        ProductListModel productListModel = this.LL;
        anchorBizUtils.getClass();
        c957403oi2.LIZLLL("is_ad", Integer.valueOf(AnchorBizUtils.LJJJLIIL(productListModel) ? 1 : 0));
        if (!AnchorBizUtils.LJJJLIIL(this.LL) || (awemeRawAd2 = this.LL.awemeRawAd) == null || (adId = awemeRawAd2.getAdId()) == null || (string = adId.toString()) == null) {
            string = "";
        }
        c957403oi2.LIZLLL("ad_id", string);
        String str10 = this.LL.requestId;
        if (str10 == null) {
            str10 = "";
        }
        c957403oi2.LIZLLL("request_id", str10);
        if (!AnchorBizUtils.LJJJLIIL(this.LL) || (awemeRawAd = this.LL.awemeRawAd) == null || (creativeId = awemeRawAd.getCreativeId()) == null || (string2 = creativeId.toString()) == null) {
            string2 = "";
        }
        c957403oi2.LIZLLL("creative_id", string2);
        String str11 = this.LL.authorUid;
        int i = 1;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            IAccountDependencyService iAccountDependencyServiceCreateIAccountDependencyServicebyMonsterPlugin = AccountDependencyService.createIAccountDependencyServicebyMonsterPlugin(false);
            if (iAccountDependencyServiceCreateIAccountDependencyServicebyMonsterPlugin != null) {
                z = true;
            } else {
                z = false;
            }
            String name2 = IAccountDependencyService.class.getName();
            if (iAccountDependencyServiceCreateIAccountDependencyServicebyMonsterPlugin != null) {
                name = iAccountDependencyServiceCreateIAccountDependencyServicebyMonsterPlugin.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
            iECommerceHostService = iAccountDependencyServiceCreateIAccountDependencyServicebyMonsterPlugin;
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IAccountDependencyService.class);
        }
        c957403oi2.LIZLLL("is_self", Integer.valueOf(Intrinsics.LJFF(str11, ((IAccountDependencyService) iECommerceHostService).getUserId()) ? 1 : 0));
        ProductListModel productListModel2 = this.LL;
        if (productListModel2 == null || (str = productListModel2.pageName) == null) {
            str = "video";
        }
        c957403oi2.LIZLLL("page_name", str);
        c957403oi2.LIZLLL("source_page_type", "video");
        c957403oi2.LIZLLL("item_order", String.valueOf(this.LLILLL + 1));
        c957403oi2.LIZLLL("button_name", "add_to_cart");
        if (this.LLILZ) {
            str2 = "able_to_cart";
        } else {
            str2 = "unable_to_cart";
        }
        c957403oi2.LIZLLL("button_type", str2);
        c957403oi2.LIZLLL("video_shopping_list_style", Integer.valueOf(this.LLILZIL));
        c957403oi2.LIZLLL("entrance_form", this.LLILZLL);
        ProductListModel productListModel3 = this.LL;
        if (productListModel3 == null || (str3 = productListModel3.enterListForm) == null) {
            str3 = "video_multi_anchor";
        }
        c957403oi2.LIZLLL("enter_list_form", str3);
        c957403oi2.LIZLLL("list_name", "video_shopping_list");
        List<SkuItem> list = this.LLILLJJLI.extraData.skus;
        if (list != null && list.size() > 0) {
            i = 0;
        }
        c957403oi2.LIZLLL("is_single_sku", Integer.valueOf(i));
        Map<String, Object> map = this.LLIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap(C2097908Jt.LIZIZ(map.size()));
        Iterator<T> it2 = map.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            linkedHashMap.put(entry.getKey(), String.valueOf(entry.getValue()));
        }
        c957403oi2.LJ(linkedHashMap);
        C21272018Mk c21272018Mk2 = C21272018Mk.LIZ;
        AnchorProductInfo anchorProductInfo = this.LLILLJJLI.extraData;
        List<SkuItem> list2 = this.LLIZLLLIL;
        c21272018Mk2.getClass();
        c957403oi2.LJ(C21272018Mk.LJIJJ(anchorProductInfo, list2));
        HashMap<String, String> map2 = this.LL.mobParams;
        if (map2 != null && (str4 = map2.get("source_module")) != null) {
            str6 = str4;
        }
        c957403oi2.LIZLLL("source_module", str6);
        return Unit.LIZ;
    }
}
