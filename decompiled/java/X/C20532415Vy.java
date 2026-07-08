package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.15Vy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20532415Vy implements C15W0 {
    public final String LIZ;
    public final String LIZIZ;
    public final boolean LIZJ;
    public final long LIZLLL;
    public final boolean LJ;
    public final Map<String, String> LJFF;
    public final String LJI;
    public final boolean LJII;
    public final String LJIIIIZZ;

    public C20532415Vy() {
        throw null;
    }

    @Override // X.C15W0
    public final Map<String, String> LIZ() {
        Pair[] pairArr = new Pair[7];
        pairArr[0] = new Pair("enter_from", this.LIZ);
        String str = this.LIZIZ;
        if (str == null) {
            str = "";
        }
        pairArr[1] = new Pair("enter_method", str);
        pairArr[2] = new Pair("is_cache", this.LIZJ ? "1" : CardStruct.IStatusCode.DEFAULT);
        pairArr[3] = new Pair("first_frame_duration", String.valueOf(this.LIZLLL));
        pairArr[4] = new Pair("is_load_success", this.LJ ? "1" : CardStruct.IStatusCode.DEFAULT);
        String str2 = this.LJI;
        pairArr[5] = new Pair("from_explore_page", str2 != null ? str2 : "");
        pairArr[6] = new Pair("is_empty_data", this.LJII ? "1" : CardStruct.IStatusCode.DEFAULT);
        Map<String, String> mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        Map<String, String> map = this.LJFF;
        if (map != null) {
            mapLJIIJ.putAll(map);
        }
        return mapLJIIJ;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20532415Vy)) {
            return false;
        }
        C20532415Vy c20532415Vy = (C20532415Vy) obj;
        return Intrinsics.LJFF(this.LIZ, c20532415Vy.LIZ) && Intrinsics.LJFF(this.LIZIZ, c20532415Vy.LIZIZ) && this.LIZJ == c20532415Vy.LIZJ && this.LIZLLL == c20532415Vy.LIZLLL && this.LJ == c20532415Vy.LJ && Intrinsics.LJFF(this.LJFF, c20532415Vy.LJFF) && Intrinsics.LJFF(this.LJI, c20532415Vy.LJI) && this.LJII == c20532415Vy.LJII;
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        String str = this.LIZIZ;
        int iHashCode2 = (((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31) + C786410Ut5.Y2(this.LIZLLL)) * 31) + C786410Ut5.Z2(this.LJ)) * 31;
        Map<String, String> map = this.LJFF;
        int iHashCode3 = (iHashCode2 + (map == null ? 0 : map.hashCode())) * 31;
        String str2 = this.LJI;
        return ((iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LJII);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ExploreFirstFrameV2Et(enterFrom=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", enterMethod=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", isCache=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", firstFrameDuration=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", isLoadSuccess=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", stage=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", fromExplorePage=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", isEmptyData=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C15W0
    public final String getEventName() {
        return this.LJIIIIZZ;
    }

    public C20532415Vy(String str, boolean z, long j, boolean z2, Map map, String str2, boolean z3) {
        this.LIZ = "homepage_explore";
        this.LIZIZ = str;
        this.LIZJ = z;
        this.LIZLLL = j;
        this.LJ = z2;
        this.LJFF = map;
        this.LJI = str2;
        this.LJII = z3;
        this.LJIIIIZZ = "homepage_explore_first_frame_v2";
    }
}
