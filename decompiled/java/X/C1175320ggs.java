package X;

import com.bytedance.android.btm.api.model.PageFinder;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiCommonMobParams;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiModuleMobCommonParams;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiPageMobCommonParams;
import com.ss.android.ugc.aweme.poi.uiwidget.gallery.dishes.PoiDishesGalleryActivity;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0ggs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1175320ggs extends C09AY implements Function1<PoiCommonMobParams, PoiCommonMobParams> {
    public final /* synthetic */ PoiDishesGalleryActivity LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1175320ggs(PoiDishesGalleryActivity poiDishesGalleryActivity) {
        super(1);
        this.LL = poiDishesGalleryActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final PoiCommonMobParams invoke(PoiCommonMobParams poiCommonMobParams) {
        PoiCommonMobParams poiCommonMobParams2 = poiCommonMobParams;
        Map mapLIZIZ = C18JG.LIZIZ("a4257.b3357", PageFinder.via(this.LL));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : mapLIZIZ.entrySet()) {
            if (entry.getValue() != null) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(C2097908Jt.LIZIZ(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry2.getKey(), String.valueOf(entry2.getValue()));
        }
        PoiPageMobCommonParams poiPageMobCommonParams = poiCommonMobParams2.getPoiPageMobCommonParams();
        if (poiPageMobCommonParams != null) {
            poiPageMobCommonParams.setBtmReportParams(linkedHashMap2);
        }
        PoiModuleMobCommonParams poiModuleMobCommonParams = poiCommonMobParams2.getPoiModuleMobCommonParams();
        if (poiModuleMobCommonParams != null) {
            poiModuleMobCommonParams.setBtmReportParams(linkedHashMap2);
        }
        return poiCommonMobParams2;
    }
}
