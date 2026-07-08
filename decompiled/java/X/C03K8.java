package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkRichText;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.RichTextExtraInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.logisticis.UsShippingVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.03K8, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03K8 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ UsShippingVH LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ LinkRichText LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C03K8(UsShippingVH usShippingVH, String str, LinkRichText linkRichText) {
        super(0);
        this.LL = usShippingVH;
        this.LLILLJJLI = str;
        this.LLILLL = linkRichText;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        String str;
        HashMap<String, Object> mapLJIIJ;
        String str2;
        IPdpStarter.PdpEnterParam pdpEnterParam;
        Map<String, Object> map;
        Context context = this.LL.itemView.getContext();
        String str3 = this.LLILLJJLI;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        UsShippingVH usShippingVH = this.LL;
        RichTextExtraInfo richTextExtraInfo = this.LLILLL.extraInfo;
        String str4 = richTextExtraInfo != null ? richTextExtraInfo.daInfo : null;
        usShippingVH.getClass();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("EVENT_ORIGIN_FEATURE", "TEMAI");
        PdpViewModel pdpViewModelH6 = usShippingVH.h6();
        if (pdpViewModelH6 != null && (pdpEnterParam = pdpViewModelH6.LLJI) != null && (map = pdpEnterParam.trackParams) != null) {
            Object orDefault = map.getOrDefault("entrance_info", null);
            if ((orDefault instanceof String) && orDefault != null) {
                linkedHashMap2.put("entrance_info", orDefault);
            }
            Object orDefault2 = map.getOrDefault("author_id", null);
            if ((orDefault2 instanceof String) && orDefault2 != null) {
                linkedHashMap2.put("author_id", orDefault2);
            }
        }
        linkedHashMap2.put("previous_page", "product_detail");
        ProductPackStruct productPackStruct = usShippingVH.h6().LLJILLL;
        if (productPackStruct != null && (str2 = productPackStruct.productId) != null) {
            linkedHashMap2.put("product_id", str2);
        }
        if (str4 != null && (mapLJIIJ = C1741890vQh.LJIIJ(str4)) != null) {
            linkedHashMap2.putAll(mapLJIIJ);
        }
        linkedHashMap.put("trackParams", C1741890vQh.LJIIIIZZ(linkedHashMap2));
        C919503ib.LIZIZ(context, str3, linkedHashMap, false).open();
        RichTextExtraInfo richTextExtraInfo2 = this.LLILLL.extraInfo;
        if (richTextExtraInfo2 != null && (str = richTextExtraInfo2.daInfo) != null) {
            UsShippingVH usShippingVH2 = this.LL;
            try {
                C811903Fd c811903FdX5 = usShippingVH2.X5();
                String strDecode = URLDecoder.decode(str);
                usShippingVH2.i6(null, strDecode != null ? C1741890vQh.LJIIJ(strDecode) : null, c811903FdX5);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1019103yf.LIZ(EnumC1014603xw.ERR35, e, null);
            }
        }
        return Unit.LIZ;
    }
}
