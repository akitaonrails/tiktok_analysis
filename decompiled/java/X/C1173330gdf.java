package X;

import com.ss.android.ugc.aweme.poi.mapmode.model.PoiDiscoveryCard;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0gdf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1173330gdf {
    public static final List<C1173350gdh> LIZ(List<PoiDiscoveryCard> list) {
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<PoiDiscoveryCard> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(new C1173350gdh(it2.next()));
        }
        return arrayList;
    }
}
