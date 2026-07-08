package X;

import com.ss.android.ugc.aweme.poi.mapmode.model.PoiLandmark;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gfU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1174460gfU implements Serializable, InterfaceC2753014t {
    public final List<PoiLandmark> LL;
    public final C1174450gfT LLILLJJLI;

    public final C1174460gfU copy(List<PoiLandmark> list, C1174450gfT c1174450gfT) {
        return new C1174460gfU(list, c1174450gfT);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1174460gfU)) {
            return false;
        }
        C1174460gfU c1174460gfU = (C1174460gfU) obj;
        return Intrinsics.LJFF(this.LL, c1174460gfU.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1174460gfU.LLILLJJLI);
    }

    public String getSourceId() {
        return "MapModeFilterData";
    }

    public int hashCode() {
        List<PoiLandmark> list = this.LL;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        C1174450gfT c1174450gfT = this.LLILLJJLI;
        return iHashCode + (c1174450gfT != null ? c1174450gfT.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MapModeFilterData(landmarkList=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", mapCategoryStatus=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final List<PoiLandmark> getLandmarkList() {
        return this.LL;
    }

    public final C1174450gfT getMapCategoryStatus() {
        return this.LLILLJJLI;
    }

    public C1174460gfU(List<PoiLandmark> list, C1174450gfT c1174450gfT) {
        this.LL = list;
        this.LLILLJJLI = c1174450gfT;
    }
}
