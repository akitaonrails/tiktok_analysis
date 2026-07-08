package X;

import com.ss.android.ugc.aweme.poi.detail.container.newarchi.data.PoiDetailApi;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gAs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1155480gAs implements InterfaceC0148002o {
    public final String LL;
    public final List<PoiDetailApi.PoiGuide> LLILLJJLI;

    public C1155480gAs() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1155480gAs)) {
            return false;
        }
        C1155480gAs c1155480gAs = (C1155480gAs) obj;
        return Intrinsics.LJFF(this.LL, c1155480gAs.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1155480gAs.LLILLJJLI);
    }

    public final int hashCode() {
        String str = this.LL;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<PoiDetailApi.PoiGuide> list = this.LLILLJJLI;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiDetailGuidesState(guideTitle=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", poiGuides=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1155480gAs(String str, List<PoiDetailApi.PoiGuide> list) {
        this.LL = str;
        this.LLILLJJLI = list;
    }
}
