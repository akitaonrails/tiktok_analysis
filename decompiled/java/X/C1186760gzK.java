package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.poi.activity.PoiActivityApi;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gzK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1186760gzK {
    public final Aweme LIZ;
    public final List<Object> LIZIZ;
    public final PoiListApi.PoiReviewCardModel LIZJ;
    public final List<PoiActivityApi.PoiBannerInfo> LIZLLL;

    public C1186760gzK() {
        this(null, null, null, 15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1186760gzK)) {
            return false;
        }
        C1186760gzK c1186760gzK = (C1186760gzK) obj;
        return Intrinsics.LJFF(this.LIZ, c1186760gzK.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1186760gzK.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1186760gzK.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1186760gzK.LIZLLL);
    }

    public C1186760gzK(Aweme aweme, PoiListApi.PoiReviewCardModel poiReviewCardModel, List list, int i) {
        aweme = (i & 1) != 0 ? null : aweme;
        poiReviewCardModel = (i & 4) != 0 ? null : poiReviewCardModel;
        list = (i & 8) != 0 ? null : list;
        this.LIZ = aweme;
        this.LIZIZ = null;
        this.LIZJ = poiReviewCardModel;
        this.LIZLLL = list;
    }
}
