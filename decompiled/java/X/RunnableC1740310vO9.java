package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.mall.service.IECommerceMallService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function2;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0vO9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class RunnableC1740310vO9 implements Runnable {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ C1740600vOc LLILLL;
    public final /* synthetic */ Function2<Uri, Map<String, Object>, Map<String, Object>> LLILZ;

    /* JADX WARN: Multi-variable type inference failed */
    public RunnableC1740310vO9(String str, String str2, C1740600vOc c1740600vOc, Function2<? super Uri, ? super Map<String, Object>, ? extends Map<String, Object>> function2) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = c1740600vOc;
        this.LLILZ = function2;
    }

    public final void LIZ() {
        try {
            String str = this.LL;
            if (str == null || a0.LJJJIL(str)) {
                return;
            }
            Uri uri = UriProtector.parse(this.LL);
            String strLIZ = C1521105xR.LIZ(this.LLILLJJLI);
            if (strLIZ == null) {
                strLIZ = AnonymousClass0185.LJ(uri, "url");
            }
            String strLJ = AnonymousClass0185.LJ(uri, "previous_page");
            String strLJ2 = AnonymousClass0185.LJ(uri, "enter_from");
            String strLJ3 = AnonymousClass0185.LJ(uri, "deeplink_type");
            String strLJ4 = AnonymousClass0185.LJ(uri, "top_product_ids");
            if (a0.LJJJIL(strLJ4)) {
                strLJ4 = AnonymousClass0185.LJ(uri, "product_id_list");
            }
            String strLJ5 = AnonymousClass0185.LJ(uri, "creative_id");
            String strLJ6 = AnonymousClass0185.LJ(uri, "campaign_id");
            String strLJ7 = AnonymousClass0185.LJ(uri, "mall_extra_info");
            String str2 = ((IECommerceMallService) ServiceManager.get().getService(IECommerceMallService.class)).shouldShowMall2TabOrTopTab() ? "1" : CardStruct.IStatusCode.DEFAULT;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String str3 = this.LL;
            try {
                linkedHashMap.put("EVENT_ORIGIN_FEATURE", "TEMAI");
                linkedHashMap.put("page_url", strLIZ);
                linkedHashMap.put("previous_page", strLJ);
                linkedHashMap.put("enter_from", strLJ2);
                linkedHashMap.put("deeplink_type", strLJ3);
                linkedHashMap.put("deeplink_url", str3);
                linkedHashMap.put("top_product_ids", strLJ4);
                linkedHashMap.put("creative_id", strLJ5);
                linkedHashMap.put("campaign_id", strLJ6);
                linkedHashMap.put("mall_extra_info", strLJ7);
                linkedHashMap.put("is_have_shoptab", str2);
                linkedHashMap.put("is_shoptab_link", "1");
                Map mapLIZ = C1740590vOb.LIZ(this.LLILLL);
                if (mapLIZ != null) {
                    linkedHashMap.putAll(mapLIZ);
                }
                C1768000w6o c1768000w6o = C1768000w6o.LIZ;
                Map<String, Object> mapInvoke = this.LLILZ.invoke(uri, linkedHashMap);
                c1768000w6o.getClass();
                C1768000w6o.LIZIZ("tiktokec_enter_screen_type", mapInvoke);
                return;
            } catch (Throwable th) {
                th = th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        TryCatchGuardChecker.doCheck(th);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("EcUgPopupLogger@d033.sendEnterScreenType$1");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("EcUgPopupLogger@d033.sendEnterScreenType$1");
    }
}
