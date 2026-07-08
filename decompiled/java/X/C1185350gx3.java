package X;

import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gx3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1185350gx3 implements InterfaceC111300bX {
    public final String LL;
    public final String LLILLJJLI;
    public final PoiListApi.PoiDetailResponse LLILLL;
    public final C1188440h22 LLILZ;
    public final C1185410gx9 LLILZIL;
    public final C1185490gxH LLILZLL;
    public final Integer LLIZ;
    public final boolean LLIZLLLIL;

    public C1185350gx3() {
        this(null, null, null, null, null, null, null, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1185350gx3)) {
            return false;
        }
        C1185350gx3 c1185350gx3 = (C1185350gx3) obj;
        return Intrinsics.LJFF(this.LL, c1185350gx3.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1185350gx3.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1185350gx3.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1185350gx3.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1185350gx3.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1185350gx3.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c1185350gx3.LLIZ) && this.LLIZLLLIL == c1185350gx3.LLIZLLLIL;
    }

    public final int hashCode() {
        String str = this.LL;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        PoiListApi.PoiDetailResponse poiDetailResponse = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (poiDetailResponse == null ? 0 : poiDetailResponse.hashCode())) * 31;
        C1188440h22 c1188440h22 = this.LLILZ;
        int iHashCode4 = (iHashCode3 + (c1188440h22 == null ? 0 : c1188440h22.hashCode())) * 31;
        C1185410gx9 c1185410gx9 = this.LLILZIL;
        int iHashCode5 = (iHashCode4 + (c1185410gx9 == null ? 0 : c1185410gx9.hashCode())) * 31;
        C1185490gxH c1185490gxH = this.LLILZLL;
        int iHashCode6 = (iHashCode5 + (c1185490gxH == null ? 0 : c1185490gxH.hashCode())) * 31;
        Integer num = this.LLIZ;
        return ((iHashCode6 + (num != null ? num.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LLIZLLLIL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiAlbumHierarchyData(poiId=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", collectInfo=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", poiDetailResponse=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", poiAnchorData=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", poiDetailParams=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", poiAnchorMobData=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", imageSize=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", hasAnchorModule=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1185350gx3(String str, String str2, PoiListApi.PoiDetailResponse poiDetailResponse, C1188440h22 c1188440h22, C1185410gx9 c1185410gx9, C1185490gxH c1185490gxH, Integer num, boolean z) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = poiDetailResponse;
        this.LLILZ = c1188440h22;
        this.LLILZIL = c1185410gx9;
        this.LLILZLL = c1185490gxH;
        this.LLIZ = num;
        this.LLIZLLLIL = z;
    }
}
