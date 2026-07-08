package X;

import androidx.fragment.app.Fragment;
import com.bytedance.android.btm.api.model.PageFinder;
import com.ss.android.ugc.aweme.poi.album.PoiAlbumFragment;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiCommonMobParams;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiModuleMobCommonParams;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiPageMobCommonParams;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0ggm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1175260ggm extends C09AY implements Function1<PoiCommonMobParams, PoiCommonMobParams> {
    public final /* synthetic */ PoiAlbumFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1175260ggm(PoiAlbumFragment poiAlbumFragment) {
        super(1);
        this.LL = poiAlbumFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final PoiCommonMobParams invoke(PoiCommonMobParams poiCommonMobParams) {
        LinkedHashMap linkedHashMap;
        PoiCommonMobParams poiCommonMobParams2 = poiCommonMobParams;
        Map mapLIZIZ = C18JG.LIZIZ("a4257.b90326", PageFinder.via((Fragment) this.LL));
        if (mapLIZIZ != null) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry entry : mapLIZIZ.entrySet()) {
                if (entry.getValue() != null) {
                    linkedHashMap2.put(entry.getKey(), entry.getValue());
                }
            }
            linkedHashMap = new LinkedHashMap(C2097908Jt.LIZIZ(linkedHashMap2.size()));
            for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                linkedHashMap.put(entry2.getKey(), String.valueOf(entry2.getValue()));
            }
        } else {
            linkedHashMap = null;
        }
        PoiPageMobCommonParams poiPageMobCommonParams = poiCommonMobParams2.getPoiPageMobCommonParams();
        if (poiPageMobCommonParams != null) {
            poiPageMobCommonParams.setBtmReportParams(linkedHashMap);
        }
        PoiModuleMobCommonParams poiModuleMobCommonParams = poiCommonMobParams2.getPoiModuleMobCommonParams();
        if (poiModuleMobCommonParams != null) {
            poiModuleMobCommonParams.setBtmReportParams(linkedHashMap);
        }
        return poiCommonMobParams2;
    }
}
