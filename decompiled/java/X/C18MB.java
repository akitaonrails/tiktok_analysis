package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.anchor.utils.AnchorBizUtils;
import com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfoModel;
import com.ss.android.ugc.aweme.ecommerce.model.ProductListModel;
import com.ss.android.ugc.aweme.ecommerce.model.SkuItem;
import com.ss.android.ugc.aweme.ecommerce.model.VideoProductDaInfo;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.18MB, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18MB extends C09AY implements Function0<Unit> {
    public final /* synthetic */ View LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ C18MZ LLILLL;
    public final /* synthetic */ AnchorProductInfoModel LLILZ;
    public final /* synthetic */ C197039127h LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ Map LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18MB(View view, int i, C18MZ c18mz, AnchorProductInfoModel anchorProductInfoModel, C197039127h c197039127h, String str, Map map) {
        super(0);
        this.LL = view;
        this.LLILLJJLI = i;
        this.LLILLL = c18mz;
        this.LLILZ = anchorProductInfoModel;
        this.LLILZIL = c197039127h;
        this.LLILZLL = str;
        this.LLIZ = map;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        String str;
        HashMap<String, Object> mapLJIIJ;
        C21271918Mj c21271918Mj = C21271918Mj.LIZ;
        int i = this.LLILLJJLI;
        C18MZ c18mz = this.LLILLL;
        int i2 = c18mz.LLIZLLLIL.panelStyle;
        ProductListModel productListModel = c18mz.LL;
        AnchorProductInfoModel anchorProductInfoModel = this.LLILZ;
        List<SkuItem> listLLLIILIL = c18mz.LLLIILIL(anchorProductInfoModel);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        AnchorBizUtils anchorBizUtils = AnchorBizUtils.LIZ;
        Map<String, VideoProductDaInfo> map = this.LLILLL.LLJL;
        VideoProductDaInfo videoProductDaInfo = map != null ? (VideoProductDaInfo) ((LinkedHashMap) map).get(this.LLILZLL) : null;
        anchorBizUtils.getClass();
        Map mapLJJIZ = AnchorBizUtils.LJJIZ(videoProductDaInfo);
        if (mapLJJIZ != null) {
            linkedHashMap.putAll(mapLJJIZ);
        }
        Map<String, VideoProductDaInfo> map2 = this.LLILLL.LLJL;
        if (map2 != null) {
            VideoProductDaInfo videoProductDaInfo2 = (VideoProductDaInfo) ((LinkedHashMap) map2).get(this.LLILZLL);
            if (videoProductDaInfo2 != null && (str = videoProductDaInfo2.transDaInfo) != null && (mapLJIIJ = C1741890vQh.LJIIJ(str)) != null) {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(C2097908Jt.LIZIZ(mapLJIIJ.size()));
                Iterator<T> it2 = mapLJIIJ.entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    linkedHashMap2.put(entry.getKey(), entry.getValue().toString());
                }
                linkedHashMap.putAll(linkedHashMap2);
            }
        }
        C21272018Mk c21272018Mk = C21272018Mk.LIZ;
        String strValueOf = String.valueOf(this.LLILZ.extraData.productId);
        c21272018Mk.getClass();
        C21272018Mk.LIZJ(strValueOf, linkedHashMap);
        linkedHashMap.putAll(this.LLIZ);
        c21271918Mj.getClass();
        C21271918Mj.LJIIIIZZ(i, i2, anchorProductInfoModel, productListModel, "buy_now", listLLLIILIL, linkedHashMap);
        AnchorBizUtils anchorBizUtils2 = AnchorBizUtils.LIZ;
        String str2 = this.LLILZ.extraData.productUnavailableText;
        Context context = this.LLILZIL.getContext();
        anchorBizUtils2.getClass();
        AnchorBizUtils.LJLIIL(context, str2);
        return Unit.LIZ;
    }
}
