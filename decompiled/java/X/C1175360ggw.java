package X;

import com.ss.android.ugc.aweme.poi.detail.container.newarchi.data.PoiDetailApi;
import com.ss.android.ugc.aweme.poi.uiwidget.gallery.PoiGalleryAnchorData;
import com.ss.android.ugc.aweme.poi.uiwidget.gallery.dishes.PoiDishesGalleryMobData;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0ggw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1175360ggw implements Serializable {
    public final ArrayList<PoiGalleryAnchorData> anchorDataArray;
    public final List<PoiDetailApi.RecommendedDish> images;
    public final Integer index;
    public final PoiDishesGalleryMobData mobData;
    public final String poiId;

    public C1175360ggw() {
        this(null, null, null, null, null);
    }

    public C1175360ggw(ArrayList<PoiGalleryAnchorData> arrayList, PoiDishesGalleryMobData poiDishesGalleryMobData, String str, List<PoiDetailApi.RecommendedDish> list, Integer num) {
        this.anchorDataArray = arrayList;
        this.mobData = poiDishesGalleryMobData;
        this.poiId = str;
        this.images = list;
        this.index = num;
    }
}
