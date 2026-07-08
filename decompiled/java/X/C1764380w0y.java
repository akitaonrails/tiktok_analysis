package X;

import android.content.Context;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.price.SeaPriceBffVO;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.container.di.TrackParamsContext;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AwS570S0100000_26;

/* JADX INFO: renamed from: X.0w0y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1764380w0y extends AbstractC1764350w0v<SeaPriceBffVO, C1764420w12> {
    public final C01GW LLJJIII;

    public C1764380w0y(InterfaceC665370Q7z interfaceC665370Q7z, SeaPriceBffVO seaPriceBffVO, C04FN c04fn) {
        super(interfaceC665370Q7z, seaPriceBffVO, c04fn);
        this.LLJJIII = C452501pT.LIZIZ(new AwS570S0100000_26(interfaceC665370Q7z, 1492));
    }

    public final void LJIILIIL(String str, Context context, int i, String str2, String str3, String str4, String str5, Boolean bool) {
        Map mapLIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (str5 != null) {
            linkedHashMap.put("entrance_info", str5);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        TrackParamsContext trackParamsContext = (TrackParamsContext) this.LLILZLL.getValue();
        if (trackParamsContext != null && (mapLIZ = C1765430w2f.LIZ(trackParamsContext.LL)) != null) {
            linkedHashMap2.putAll(mapLIZ);
        }
        if (str2 != null) {
            linkedHashMap2.put("source_info", str2);
        }
        linkedHashMap2.put("previous_page", "product_detail");
        linkedHashMap.put("trackParams", linkedHashMap2);
        linkedHashMap.put("height", Integer.valueOf(i));
        linkedHashMap.put("init_time", Long.valueOf(System.currentTimeMillis()));
        if (str4 != null) {
            linkedHashMap.put("traffic_source", str4);
        }
        if (str3 != null) {
            linkedHashMap.put("sku_id", str3);
        }
        if (bool != null) {
            linkedHashMap.put("from_fullscreen_pdp", Integer.valueOf(bool.booleanValue() ? 1 : 0));
        }
        linkedHashMap.put("showAddCartBtn", 0);
        linkedHashMap.put("showBuyNowBtn", 0);
        if (str != null) {
            C919503ib.LIZIZ(context, str, linkedHashMap, false).open();
        }
    }
}
