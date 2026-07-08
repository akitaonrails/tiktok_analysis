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

/* JADX INFO: renamed from: X.03ok, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C957603ok extends C09AY implements Function1<C957403oi, Unit> {
    public final /* synthetic */ Map<String, Object> LL;
    public final /* synthetic */ Map<String, Object> LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ SkuSupply LLIZ;
    public final /* synthetic */ Integer LLIZLLLIL;
    public final /* synthetic */ String LLJ;
    public final /* synthetic */ String LLJI;
    public final /* synthetic */ String LLJIJIL;
    public final /* synthetic */ C03W0 LLJILJIL;
    public final /* synthetic */ Boolean LLJILJILJ;
    public final /* synthetic */ String LLJILLL;
    public final /* synthetic */ Map<String, Object> LLJJ;
    public final /* synthetic */ Map<String, Object> LLJJI;
    public final /* synthetic */ String LLJJIII;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C957603ok(C03W0 c03w0, SkuSupply skuSupply, Boolean bool, Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Map map, Map map2, Map map3, Map map4) {
        super(1);
        this.LL = map;
        this.LLILLJJLI = map2;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = str3;
        this.LLILZLL = str4;
        this.LLIZ = skuSupply;
        this.LLIZLLLIL = num;
        this.LLJ = str5;
        this.LLJI = str6;
        this.LLJIJIL = str7;
        this.LLJILJIL = c03w0;
        this.LLJILJILJ = bool;
        this.LLJILLL = str8;
        this.LLJJ = map3;
        this.LLJJI = map4;
        this.LLJJIII = str9;
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
        String str3 = this.LLILLL;
        if (str3 != null) {
            c957403oi2.LIZLLL("button_name", str3);
        }
        if (C123100dR.LIZ(this.LLILZ)) {
            c957403oi2.LIZLLL("button_type", this.LLILZ);
        }
        String str4 = this.LLILZIL;
        if (str4 != null) {
            c957403oi2.LIZLLL("source_button", str4);
        }
        String str5 = this.LLILZLL;
        if (str5 != null) {
            c957403oi2.LIZLLL("sku_id", str5);
        }
        SkuSupply skuSupply = this.LLIZ;
        String str6 = "";
        if (skuSupply == null || (str = skuSupply.skuId) == null) {
            str = "";
        }
        c957403oi2.LIZLLL("seller_sku_id", str);
        String str7 = this.LLILZLL;
        if (str7 != null) {
            str6 = str7;
        }
        c957403oi2.LIZLLL("platform_sku_id", str6);
        Integer num = this.LLIZLLLIL;
        if (num != null) {
            num.intValue();
            c957403oi2.LIZLLL("is_single_sku", num);
        }
        String str8 = this.LLJ;
        if (str8 != null) {
            c957403oi2.LIZLLL("cart_form", str8);
        }
        String str9 = this.LLJI;
        if (str9 != null) {
            c957403oi2.LIZLLL("page_name", str9);
        }
        if (!this.LL.containsKey("previous_page") && (str2 = this.LLJIJIL) != null) {
            c957403oi2.LIZLLL("previous_page", str2);
        }
        String str10 = this.LLJIJIL;
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
        C03W0 c03w0 = this.LLJILJIL;
        if (c03w0 != null) {
            C855703Vz.LJ(c03w0, c957403oi2);
        }
        Boolean bool = this.LLJILJILJ;
        if (bool != null) {
            bool.booleanValue();
            c957403oi2.LIZLLL("is_load_data", Integer.valueOf(bool.booleanValue() ? 1 : 0));
        }
        String str11 = this.LLJILLL;
        if (str11 != null) {
            c957403oi2.LIZLLL("sub_page_name", str11);
        }
        Map<String, Object> map2 = this.LLJJ;
        if (map2 != null) {
            c957403oi2.LJ(C00H3.LIZ(map2));
        }
        for (String str12 : C1697810uHb.LJIIJJI("enter_from_merge", "entrance_form", "list_item_id", "search_result_id")) {
            Map<String, Object> map3 = this.LLJJI;
            if (map3 != null && !c957403oi2.LIZ(str12) && (obj = map3.get(str12)) != null) {
                c957403oi2.LIZLLL(str12, obj);
            }
        }
        String str13 = this.LLJJIII;
        if (str13 != null && (mapLJIIJ = C1741890vQh.LJIIJ(str13)) != null) {
            c957403oi2.LJ(mapLJIIJ);
        }
        return Unit.LIZ;
    }
}
