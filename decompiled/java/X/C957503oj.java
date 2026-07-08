package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuSupply;
import com.ss.android.ugc.aweme.ecommerce.dependency.apm.ApmDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.apm.IApmDependencyService;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.03oj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C957503oj extends C09AY implements Function1<C957403oi, Unit> {
    public final /* synthetic */ Map<String, Object> LL;
    public final /* synthetic */ Map<String, Object> LLILLJJLI;
    public final /* synthetic */ Map<String, Object> LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ SkuSupply LLIZLLLIL;
    public final /* synthetic */ Integer LLJ;
    public final /* synthetic */ String LLJI;
    public final /* synthetic */ String LLJIJIL;
    public final /* synthetic */ String LLJILJIL;
    public final /* synthetic */ C03W0 LLJILJILJ;
    public final /* synthetic */ Boolean LLJILLL;
    public final /* synthetic */ Map<String, Object> LLJJ;
    public final /* synthetic */ Map<String, Object> LLJJI;
    public final /* synthetic */ String LLJJIII;
    public final /* synthetic */ String LLJJIJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C957503oj(C03W0 c03w0, SkuSupply skuSupply, Boolean bool, Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Map map, Map map2, Map map3, Map map4, Map map5) {
        super(1);
        this.LL = map;
        this.LLILLJJLI = map2;
        this.LLILLL = map3;
        this.LLILZ = str;
        this.LLILZIL = str2;
        this.LLILZLL = str3;
        this.LLIZ = str4;
        this.LLIZLLLIL = skuSupply;
        this.LLJ = num;
        this.LLJI = str5;
        this.LLJIJIL = str6;
        this.LLJILJIL = str7;
        this.LLJILJILJ = c03w0;
        this.LLJILLL = bool;
        this.LLJJ = map4;
        this.LLJJI = map5;
        this.LLJJIII = str8;
        this.LLJJIJI = str9;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C957403oi c957403oi) {
        String str;
        IECommerceHostService iECommerceHostService;
        HashMap<String, Object> mapLJIIJ;
        Object obj;
        String name;
        String str2;
        C957403oi c957403oi2 = c957403oi;
        c957403oi2.LJ(this.LL);
        Map<String, ? extends Object> map = this.LLILLJJLI;
        if (map != null) {
            c957403oi2.LJ(map);
        }
        Map<String, ? extends Object> map2 = this.LLILLL;
        if (map2 != null) {
            c957403oi2.LJ(map2);
        }
        String str3 = this.LLILZ;
        if (str3 != null) {
            c957403oi2.LIZLLL("button_name", str3);
        }
        if (C123100dR.LIZ(this.LLILZIL)) {
            c957403oi2.LIZLLL("button_type", this.LLILZIL);
        }
        String str4 = this.LLILZLL;
        if (str4 != null) {
            c957403oi2.LIZLLL("source_button", str4);
        }
        String str5 = this.LLIZ;
        if (str5 != null) {
            c957403oi2.LIZLLL("sku_id", str5);
        }
        SkuSupply skuSupply = this.LLIZLLLIL;
        String str6 = "";
        if (skuSupply == null || (str = skuSupply.skuId) == null) {
            str = "";
        }
        c957403oi2.LIZLLL("seller_sku_id", str);
        String str7 = this.LLIZ;
        if (str7 != null) {
            str6 = str7;
        }
        c957403oi2.LIZLLL("platform_sku_id", str6);
        Integer num = this.LLJ;
        if (num != null) {
            num.intValue();
            c957403oi2.LIZLLL("is_single_sku", num);
        }
        String str8 = this.LLJI;
        if (str8 != null) {
            c957403oi2.LIZLLL("cart_form", str8);
        }
        String str9 = this.LLJIJIL;
        if (str9 != null) {
            c957403oi2.LIZLLL("page_name", str9);
        }
        if (!this.LL.containsKey("previous_page") && (str2 = this.LLJILJIL) != null) {
            c957403oi2.LIZLLL("previous_page", str2);
        }
        String str10 = this.LLJILJIL;
        if (str10 != null) {
            c957403oi2.LIZLLL("previous_page", str10);
        }
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            boolean z = false;
            IApmDependencyService iApmDependencyServiceCreateIApmDependencyServicebyMonsterPlugin = ApmDependencyService.createIApmDependencyServicebyMonsterPlugin(false);
            if (iApmDependencyServiceCreateIApmDependencyServicebyMonsterPlugin != null) {
                z = true;
            }
            String name2 = IApmDependencyService.class.getName();
            if (iApmDependencyServiceCreateIApmDependencyServicebyMonsterPlugin != null) {
                name = iApmDependencyServiceCreateIApmDependencyServicebyMonsterPlugin.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
            iECommerceHostService = iApmDependencyServiceCreateIApmDependencyServicebyMonsterPlugin;
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApmDependencyService.class);
        }
        c957403oi2.LIZLLL("traceparent", ((IApmDependencyService) iECommerceHostService).newTrackingTraceparent());
        C03W0 c03w0 = this.LLJILJILJ;
        if (c03w0 != null) {
            C855703Vz.LJ(c03w0, c957403oi2);
        }
        Boolean bool = this.LLJILLL;
        if (bool != null) {
            bool.booleanValue();
            c957403oi2.LIZLLL("is_load_data", Integer.valueOf(bool.booleanValue() ? 1 : 0));
        }
        Map<String, Object> map3 = this.LLJJ;
        if (map3 != null) {
            c957403oi2.LJ(C00H3.LIZ(map3));
        }
        for (String str11 : C1697810uHb.LJIIJJI("enter_from_merge", "entrance_form", "list_item_id", "search_result_id")) {
            Map<String, Object> map4 = this.LLJJI;
            if (map4 != null && !c957403oi2.LIZ(str11) && (obj = map4.get(str11)) != null) {
                c957403oi2.LIZLLL(str11, obj);
            }
        }
        String str12 = this.LLJJIII;
        if (str12 != null && (mapLJIIJ = C1741890vQh.LJIIJ(str12)) != null) {
            c957403oi2.LJ(mapLJIIJ);
        }
        String str13 = this.LLJJIJI;
        if (str13 != null) {
            c957403oi2.LIZLLL("page_type", str13);
        }
        return Unit.LIZ;
    }
}
