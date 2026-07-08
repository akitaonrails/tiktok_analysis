package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuSupply;
import com.ss.android.ugc.aweme.ecommerce.dependency.apm.ApmDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.apm.IApmDependencyService;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.03om, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C957803om extends C09AY implements Function1<C957403oi, Unit> {
    public final /* synthetic */ Map<String, Object> LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ SkuSupply LLILZIL;
    public final /* synthetic */ Integer LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ String LLJ;
    public final /* synthetic */ Map<String, Object> LLJI;
    public final /* synthetic */ C03W0 LLJIJIL;
    public final /* synthetic */ Boolean LLJILJIL;
    public final /* synthetic */ String LLJILJILJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C957803om(C03W0 c03w0, SkuSupply skuSupply, Boolean bool, Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, Map map, Map map2) {
        super(1);
        this.LL = map;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = skuSupply;
        this.LLILZLL = num;
        this.LLIZ = str4;
        this.LLIZLLLIL = str5;
        this.LLJ = str6;
        this.LLJI = map2;
        this.LLJIJIL = c03w0;
        this.LLJILJIL = bool;
        this.LLJILJILJ = str7;
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
            c957403oi2.LIZLLL("source_button", str4);
        }
        String str5 = this.LLILZ;
        if (str5 != null) {
            c957403oi2.LIZLLL("sku_id", str5);
        }
        String str6 = this.LLILZ;
        String str7 = "";
        if (str6 == null) {
            str6 = "";
        }
        c957403oi2.LIZLLL("platform_sku_id", str6);
        SkuSupply skuSupply = this.LLILZIL;
        if (skuSupply != null && (str2 = skuSupply.skuId) != null) {
            str7 = str2;
        }
        c957403oi2.LIZLLL("seller_sku_id", str7);
        Integer num = this.LLILZLL;
        if (num != null) {
            num.intValue();
            c957403oi2.LIZLLL("is_single_sku", num);
        }
        String str8 = this.LLIZ;
        if (str8 != null) {
            c957403oi2.LIZLLL("cart_form", str8);
        }
        String str9 = this.LLIZLLLIL;
        if (str9 != null) {
            c957403oi2.LIZLLL("page_name", str9);
        }
        if (!this.LL.containsKey("previous_page") && (str = this.LLJ) != null) {
            c957403oi2.LIZLLL("previous_page", str);
        }
        String str10 = this.LLJ;
        if (str10 != null) {
            c957403oi2.LIZLLL("previous_page", str10);
        }
        Map<String, Object> map = this.LLJI;
        if (map != null) {
            c957403oi2.LJ(C00H3.LIZ(map));
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
        String str11 = this.LLJILJILJ;
        if (str11 != null) {
            c957403oi2.LIZLLL("sub_page_name", str11);
        }
        return Unit.LIZ;
    }
}
