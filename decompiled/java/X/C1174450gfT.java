package X;

import com.ss.android.ugc.aweme.poi.mapmode.model.PoiLandmark;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gfT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1174450gfT implements Serializable {
    public final String filterDistance;
    public final String filterDistanceForDisplay;
    public final PoiLandmark poiLandmark;
    public final String tabCode;

    public C1174450gfT() {
        this(null, null, null, null);
    }

    public final C1174450gfT copy(String str, PoiLandmark poiLandmark, String str2, String str3) {
        return new C1174450gfT(str, poiLandmark, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1174450gfT)) {
            return false;
        }
        C1174450gfT c1174450gfT = (C1174450gfT) obj;
        return Intrinsics.LJFF(this.tabCode, c1174450gfT.tabCode) && Intrinsics.LJFF(this.poiLandmark, c1174450gfT.poiLandmark) && Intrinsics.LJFF(this.filterDistance, c1174450gfT.filterDistance) && Intrinsics.LJFF(this.filterDistanceForDisplay, c1174450gfT.filterDistanceForDisplay);
    }

    public int hashCode() {
        String str = this.tabCode;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        PoiLandmark poiLandmark = this.poiLandmark;
        int iHashCode2 = (iHashCode + (poiLandmark == null ? 0 : poiLandmark.hashCode())) * 31;
        String str2 = this.filterDistance;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.filterDistanceForDisplay;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public C1174450gfT(String str, PoiLandmark poiLandmark, String str2, String str3) {
        this.tabCode = str;
        this.poiLandmark = poiLandmark;
        this.filterDistance = str2;
        this.filterDistanceForDisplay = str3;
    }
}
