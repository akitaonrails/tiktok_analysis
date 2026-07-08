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
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.18Lm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21269618Lm extends C09AY implements Function1<C957403oi, Unit> {
    public final /* synthetic */ ProductListModel LL;
    public final /* synthetic */ AnchorProductInfoModel LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ int LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ Map<String, Object> LLIZLLLIL;
    public final /* synthetic */ List<SkuItem> LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21269618Lm(int i, int i2, AnchorProductInfoModel anchorProductInfoModel, ProductListModel productListModel, String str, String str2, String str3, List list, Map map) {
        super(1);
        this.LL = productListModel;
        this.LLILLJJLI = anchorProductInfoModel;
        this.LLILLL = i;
        this.LLILZ = str;
        this.LLILZIL = str2;
        this.LLILZLL = i2;
        this.LLIZ = str3;
        this.LLIZLLLIL = map;
        this.LLJ = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C957403oi c957403oi) {
        String string;
        String string2;
        IECommerceHostService iECommerceHostService;
        String str;
        boolean z;
        String name;
        AwemeRawAd awemeRawAd;
        Long creativeId;
        AwemeRawAd awemeRawAd2;
        Long adId;
        C957403oi c957403oi2 = c957403oi;
        c957403oi2.LIZLLL("EVENT_ORIGIN_FEATURE", "TEMAI");
        String str2 = this.LL.aid;
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        c957403oi2.LIZLLL("group_id", str2);
        String str4 = this.LL.authorUid;
        if (str4 == null) {
            str4 = "";
        }
        c957403oi2.LIZLLL("author_id", str4);
        String str5 = this.LL.eventType;
        if (str5 == null) {
            str5 = "";
        }
        c957403oi2.LIZLLL("enter_from", str5);
        c957403oi2.LIZLLL("anchor_show_type", "video_cart_tag");
        c957403oi2.LIZLLL("product_source", String.valueOf(this.LLILLJJLI.extraData.platform));
        String str6 = this.LLILLJJLI.extraData.source;
        if (str6 == null) {
            str6 = "";
        }
        c957403oi2.LIZLLL("source", str6);
        c957403oi2.LIZLLL("product_id", String.valueOf(this.LLILLJJLI.extraData.productId));
        AnchorBizUtils anchorBizUtils = AnchorBizUtils.LIZ;
        ProductListModel productListModel = this.LL;
        anchorBizUtils.getClass();
        c957403oi2.LIZLLL("is_ad", Integer.valueOf(AnchorBizUtils.LJJJLIIL(productListModel) ? 1 : 0));
        if (!AnchorBizUtils.LJJJLIIL(this.LL) || (awemeRawAd2 = this.LL.awemeRawAd) == null || (adId = awemeRawAd2.getAdId()) == null || (string = adId.toString()) == null) {
            string = "";
        }
        c957403oi2.LIZLLL("ad_id", string);
        if (!AnchorBizUtils.LJJJLIIL(this.LL) || (awemeRawAd = this.LL.awemeRawAd) == null || (creativeId = awemeRawAd.getCreativeId()) == null || (string2 = creativeId.toString()) == null) {
            string2 = "";
        }
        c957403oi2.LIZLLL("creative_id", string2);
        String str7 = this.LL.requestId;
        if (str7 == null) {
            str7 = "";
        }
        c957403oi2.LIZLLL("request_id", str7);
        String str8 = this.LL.authorUid;
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
        c957403oi2.LIZLLL("is_self", Integer.valueOf(Intrinsics.LJFF(str8, ((IAccountDependencyService) iECommerceHostService).getUserId()) ? 1 : 0));
        c957403oi2.LIZLLL("page_name", "video");
        c957403oi2.LIZLLL("source_page_type", "video");
        c957403oi2.LIZLLL("item_order", String.valueOf(this.LLILLL + 1));
        c957403oi2.LIZLLL("button_name", this.LLILZ);
        String str9 = this.LLILZIL;
        if (str9 != null) {
            str3 = str9;
        }
        c957403oi2.LIZLLL("button_type", str3);
        c957403oi2.LIZLLL("video_shopping_list_style", Integer.valueOf(this.LLILZLL));
        c957403oi2.LIZLLL("list_name", "video_shopping_list");
        c957403oi2.LIZLLL("entrance_form", this.LLIZ);
        ProductListModel productListModel2 = this.LL;
        if (productListModel2 == null || (str = productListModel2.enterListForm) == null) {
            str = "video_multi_anchor";
        }
        c957403oi2.LIZLLL("enter_list_form", str);
        Map<String, Object> map = this.LLIZLLLIL;
        if (map != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(C2097908Jt.LIZIZ(map.size()));
            Iterator<T> it2 = map.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                linkedHashMap.put(entry.getKey(), String.valueOf(entry.getValue()));
            }
            c957403oi2.LJ(linkedHashMap);
        }
        C21272018Mk c21272018Mk = C21272018Mk.LIZ;
        AnchorProductInfo anchorProductInfo = this.LLILLJJLI.extraData;
        List<SkuItem> list = this.LLJ;
        c21272018Mk.getClass();
        c957403oi2.LJ(C21272018Mk.LJIJJ(anchorProductInfo, list));
        return Unit.LIZ;
    }
}
