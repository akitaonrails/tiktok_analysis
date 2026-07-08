package X;

import com.ss.android.ugc.aweme.minidrama.common.component.model.ShortDramaOverview;
import com.ss.android.ugc.aweme.series.feed.api.SeriesCenterListResponse;
import com.ss.android.ugc.aweme.series.feed.model.SeriesCenterCenterScene;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0r2b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1573190r2b {
    public static final boolean LIZ(SeriesCenterListResponse seriesCenterListResponse) {
        if (seriesCenterListResponse == null) {
            return false;
        }
        List<SeriesCenterCenterScene> list = seriesCenterListResponse.scenes;
        if (list != null && !list.isEmpty()) {
            return false;
        }
        List<ShortDramaOverview> list2 = seriesCenterListResponse.safeCollections;
        if (list2 == null || list2.isEmpty()) {
            List<ShortDramaOverview> list3 = seriesCenterListResponse.collections;
            if (list3 == null || list3.isEmpty()) {
                return false;
            }
            List<ShortDramaOverview> list4 = seriesCenterListResponse.collections;
            if (!(list4 instanceof Collection) || !list4.isEmpty()) {
                Iterator<ShortDramaOverview> it2 = list4.iterator();
                while (it2.hasNext()) {
                    if (Intrinsics.LJFF(it2.next().isSafe(), Boolean.FALSE)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
