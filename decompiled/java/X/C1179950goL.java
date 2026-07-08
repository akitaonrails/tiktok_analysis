package X;

import com.ss.android.ugc.aweme.poi.map.LocationDetailMobParam;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0goL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1179950goL implements InterfaceC111300bX {
    public final String LL;
    public final LocationDetailMobParam LLILLJJLI;

    public C1179950goL() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1179950goL)) {
            return false;
        }
        C1179950goL c1179950goL = (C1179950goL) obj;
        return Intrinsics.LJFF(this.LL, c1179950goL.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1179950goL.LLILLJJLI);
    }

    public final int hashCode() {
        String str = this.LL;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        LocationDetailMobParam locationDetailMobParam = this.LLILLJJLI;
        return iHashCode + (locationDetailMobParam != null ? locationDetailMobParam.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LocationDetailInfoHierarchyData(poiId=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", mobParam=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1179950goL(String str, LocationDetailMobParam locationDetailMobParam) {
        this.LL = str;
        this.LLILLJJLI = locationDetailMobParam;
    }
}
