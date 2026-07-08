package X;

import com.ss.android.ugc.aweme.poi.activity.PoiActivityApi;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gAx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1155530gAx implements InterfaceC0148002o {
    public final List<PoiActivityApi.PoiBannerInfo> LL;

    public C1155530gAx() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1155530gAx) && Intrinsics.LJFF(this.LL, ((C1155530gAx) obj).LL);
    }

    public final int hashCode() {
        List<PoiActivityApi.PoiBannerInfo> list = this.LL;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiActivityState(banners=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1155530gAx(List<PoiActivityApi.PoiBannerInfo> list) {
        this.LL = list;
    }
}
