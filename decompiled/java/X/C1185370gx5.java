package X;

import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi.model.PoiCurrentSessionInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gx5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1185370gx5 implements InterfaceC111300bX {
    public final String LL;
    public final String LLILLJJLI;
    public final PoiListApi.PoiDetailResponse LLILLL;
    public final C1188440h22 LLILZ;
    public final C1185410gx9 LLILZIL;
    public final C1185490gxH LLILZLL;
    public final Integer LLIZ;
    public final PoiCurrentSessionInfo LLIZLLLIL;
    public final String LLJ;
    public final String LLJI;

    public C1185370gx5() {
        this(null, null, null, null, null, null, null, null, null, 1023);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1185370gx5)) {
            return false;
        }
        C1185370gx5 c1185370gx5 = (C1185370gx5) obj;
        return Intrinsics.LJFF(this.LL, c1185370gx5.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1185370gx5.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1185370gx5.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1185370gx5.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1185370gx5.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1185370gx5.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c1185370gx5.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c1185370gx5.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c1185370gx5.LLJ) && Intrinsics.LJFF(this.LLJI, c1185370gx5.LLJI);
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
        int iHashCode7 = (iHashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        PoiCurrentSessionInfo poiCurrentSessionInfo = this.LLIZLLLIL;
        int iHashCode8 = (iHashCode7 + (poiCurrentSessionInfo == null ? 0 : poiCurrentSessionInfo.hashCode())) * 31;
        String str3 = this.LLJ;
        int iHashCode9 = (iHashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LLJI;
        return iHashCode9 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiAlbumMixHierarchyData(poiId=");
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
        sbLIZ.append(", currentPoiInfo=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(", scrollAnchorId=");
        sbLIZ.append(this.LLJ);
        sbLIZ.append(", selectedTabCode=");
        sbLIZ.append(this.LLJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1185370gx5(String str, String str2, PoiListApi.PoiDetailResponse poiDetailResponse, C1188440h22 c1188440h22, C1185410gx9 c1185410gx9, C1185490gxH c1185490gxH, PoiCurrentSessionInfo poiCurrentSessionInfo, String str3, String str4, int i) {
        str = (i & 1) != 0 ? null : str;
        str2 = (i & 2) != 0 ? null : str2;
        poiDetailResponse = (i & 4) != 0 ? null : poiDetailResponse;
        c1188440h22 = (i & 8) != 0 ? null : c1188440h22;
        c1185410gx9 = (i & 16) != 0 ? null : c1185410gx9;
        c1185490gxH = (i & 32) != 0 ? null : c1185490gxH;
        poiCurrentSessionInfo = (i & 128) != 0 ? null : poiCurrentSessionInfo;
        str3 = (i & 256) != 0 ? null : str3;
        str4 = (i & 512) != 0 ? null : str4;
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = poiDetailResponse;
        this.LLILZ = c1188440h22;
        this.LLILZIL = c1185410gx9;
        this.LLILZLL = c1185490gxH;
        this.LLIZ = null;
        this.LLIZLLLIL = poiCurrentSessionInfo;
        this.LLJ = str3;
        this.LLJI = str4;
    }
}
