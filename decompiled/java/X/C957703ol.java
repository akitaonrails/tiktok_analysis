package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuSupply;
import com.ss.android.ugc.aweme.ecommerce.dependency.apm.ApmDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.apm.IApmDependencyService;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.03ol, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C957703ol extends C09AY implements Function1<C957403oi, Unit> {
    public final /* synthetic */ Map<String, Object> LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ SkuSupply LLILZLL;
    public final /* synthetic */ Integer LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ String LLJ = "sku";
    public final /* synthetic */ String LLJI;
    public final /* synthetic */ C03W0 LLJIJIL;
    public final /* synthetic */ Boolean LLJILJIL;
    public final /* synthetic */ String LLJILJILJ;
    public final /* synthetic */ Map<String, Object> LLJILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C957703ol(C03W0 c03w0, SkuSupply skuSupply, Boolean bool, Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, Map map, Map map2) {
        super(1);
        this.LL = map;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = str4;
        this.LLILZLL = skuSupply;
        this.LLIZ = num;
        this.LLIZLLLIL = str5;
        this.LLJI = str6;
        this.LLJIJIL = c03w0;
        this.LLJILJIL = bool;
        this.LLJILJILJ = str7;
        this.LLJILLL = map2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C957403oi c957403oi) {
        IECommerceHostService iECommerceHostService;
        String name;
        String str;
        String str2;
        C957403oi c957403oi2 = c957403oi;
        c957403oi2.LJ(this.LL);
        String str3 = this.LLILLJJLI;
        if (str3 != null) {
            c957403oi2.LIZLLL("button_name", str3);
        }
        String str4 = this.LLILLL;
        if (str4 != null) {
            c957403oi2.LIZLLL("button_type", str4);
        }
        String str5 = this.LLILZ;
        if (str5 != null) {
            c957403oi2.LIZLLL("source_button", str5);
        }
        String str6 = this.LLILZIL;
        if (str6 != null) {
            c957403oi2.LIZLLL("sku_id", str6);
        }
        String str7 = this.LLILZIL;
        String str8 = "";
        if (str7 == null) {
            str7 = "";
        }
        c957403oi2.LIZLLL("platform_sku_id", str7);
        SkuSupply skuSupply = this.LLILZLL;
        if (skuSupply != null && (str2 = skuSupply.skuId) != null) {
            str8 = str2;
        }
        c957403oi2.LIZLLL("seller_sku_id", str8);
        Integer num = this.LLIZ;
        if (num != null) {
            num.intValue();
            c957403oi2.LIZLLL("is_single_sku", num);
        }
        String str9 = this.LLIZLLLIL;
        if (str9 != null) {
            c957403oi2.LIZLLL("cart_form", str9);
        }
        String str10 = this.LLJ;
        if (str10 != null) {
            c957403oi2.LIZLLL("page_name", str10);
        }
        if (!this.LL.containsKey("previous_page") && (str = this.LLJI) != null) {
            c957403oi2.LIZLLL("previous_page", str);
        }
        String str11 = this.LLJI;
        if (str11 != null) {
            c957403oi2.LIZLLL("previous_page", str11);
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
        C03W0 c03w0 = this.LLJIJIL;
        if (c03w0 != null) {
            C855703Vz.LJ(c03w0, c957403oi2);
        }
        Boolean bool = this.LLJILJIL;
        if (bool != null) {
            bool.booleanValue();
            c957403oi2.LIZLLL("is_load_data", Integer.valueOf(bool.booleanValue() ? 1 : 0));
        }
        String str12 = this.LLJILJILJ;
        if (str12 != null) {
            c957403oi2.LIZLLL("page_type", str12);
        }
        Map<String, Object> map = this.LLJILLL;
        if (map != null) {
            c957403oi2.LJ(C00H3.LIZ(map));
        }
        return Unit.LIZ;
    }
}
