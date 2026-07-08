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
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.18Lk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21269418Lk extends C09AY implements Function1<C957403oi, Unit> {
    public final /* synthetic */ ProductListModel LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ AnchorProductInfoModel LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ Map<String, Object> LLILZLL;
    public final /* synthetic */ List<SkuItem> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21269418Lk(int i, int i2, AnchorProductInfoModel anchorProductInfoModel, ProductListModel productListModel, String str, List list, Map map) {
        super(1);
        this.LL = productListModel;
        this.LLILLJJLI = i;
        this.LLILLL = anchorProductInfoModel;
        this.LLILZ = str;
        this.LLILZIL = i2;
        this.LLILZLL = map;
        this.LLIZ = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C957403oi c957403oi) {
        IECommerceHostService iECommerceHostService;
        AnchorProductInfo anchorProductInfo;
        Long l;
        String string;
        boolean z;
        String name;
        C957403oi c957403oi2 = c957403oi;
        c957403oi2.LIZLLL("EVENT_ORIGIN_FEATURE", "TEMAI");
        String str = this.LL.aid;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        c957403oi2.LIZLLL("group_id", str);
        String str3 = this.LL.authorUid;
        if (str3 == null) {
            str3 = "";
        }
        c957403oi2.LIZLLL("author_id", str3);
        String str4 = this.LL.eventType;
        if (str4 == null) {
            str4 = "";
        }
        c957403oi2.LIZLLL("enter_from", str4);
        String str5 = this.LL.requestId;
        if (str5 == null) {
            str5 = "";
        }
        c957403oi2.LIZLLL("request_id", str5);
        AnchorBizUtils anchorBizUtils = AnchorBizUtils.LIZ;
        ProductListModel productListModel = this.LL;
        anchorBizUtils.getClass();
        c957403oi2.LIZLLL("is_ad", Integer.valueOf(AnchorBizUtils.LJJJLIIL(productListModel) ? 1 : 0));
        c957403oi2.LIZLLL("item_order", Integer.valueOf(this.LLILLJJLI + 1));
        String str6 = this.LL.authorUid;
        AnchorProductInfo anchorProductInfo2 = null;
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
        c957403oi2.LIZLLL("is_self", Integer.valueOf(Intrinsics.LJFF(str6, ((IAccountDependencyService) iECommerceHostService).getUserId()) ? 1 : 0));
        c957403oi2.LIZLLL("page_name", "video");
        c957403oi2.LIZLLL("source_page_type", "video");
        AnchorProductInfoModel anchorProductInfoModel = this.LLILLL;
        if (anchorProductInfoModel != null && (anchorProductInfo = anchorProductInfoModel.extraData) != null && (l = anchorProductInfo.productId) != null && (string = l.toString()) != null) {
            str2 = string;
        }
        c957403oi2.LIZLLL("product_id", str2);
        c957403oi2.LIZLLL("button_name", this.LLILZ);
        c957403oi2.LIZLLL("video_shopping_list_style", String.valueOf(this.LLILZIL));
        Map<String, Object> map = this.LLILZLL;
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
        AnchorProductInfoModel anchorProductInfoModel2 = this.LLILLL;
        if (anchorProductInfoModel2 != null) {
            anchorProductInfo2 = anchorProductInfoModel2.extraData;
        }
        List<SkuItem> list = this.LLIZ;
        c21272018Mk.getClass();
        Map mapLJIJJ = C21272018Mk.LJIJJ(anchorProductInfo2, list);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(C2097908Jt.LIZIZ(mapLJIJJ.size()));
        for (Map.Entry entry2 : ((LinkedHashMap) mapLJIJJ).entrySet()) {
            linkedHashMap2.put(entry2.getKey(), entry2.getValue().toString());
        }
        c957403oi2.LJ(linkedHashMap2);
        return Unit.LIZ;
    }
}
