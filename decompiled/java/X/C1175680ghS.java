package X;

import com.ss.android.ugc.aweme.placediscovery.param.MapBounds;
import com.ss.android.ugc.aweme.poi.mapdetail.model.PoiMapDetailResponse;
import com.ss.android.ugc.aweme.poi.mapmode.model.PoiMapModeTargetData;
import com.ss.android.ugc.aweme.poi_api.model.PoiLocation;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ghS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1175680ghS implements Serializable, InterfaceC2753014t {
    public final C1176590giv LL;
    public final PoiMapModeTargetData LLILLJJLI;
    public final PoiMapDetailResponse LLILLL;
    public final String LLILZ;
    public final String LLILZIL;
    public final String LLILZLL;
    public final MapBounds LLIZ;
    public final EnumC1985707qB LLIZLLLIL;

    public C1175680ghS() {
        this(null, null, null, null, null, null, null, null);
    }

    @InterfaceC1294060jmO
    public static /* synthetic */ void getSourceId$annotations() {
    }

    public final C1175680ghS copy(C1176590giv c1176590giv, PoiMapModeTargetData poiMapModeTargetData, PoiMapDetailResponse poiMapDetailResponse, String str, String str2, String str3, MapBounds mapBounds, EnumC1985707qB enumC1985707qB) {
        return new C1175680ghS(c1176590giv, poiMapModeTargetData, poiMapDetailResponse, str, str2, str3, mapBounds, enumC1985707qB);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1175680ghS)) {
            return false;
        }
        C1175680ghS c1175680ghS = (C1175680ghS) obj;
        return Intrinsics.LJFF(this.LL, c1175680ghS.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1175680ghS.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1175680ghS.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1175680ghS.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1175680ghS.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1175680ghS.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c1175680ghS.LLIZ) && this.LLIZLLLIL == c1175680ghS.LLIZLLLIL;
    }

    public String getSourceId() {
        return "PoiMapModeDataParams";
    }

    public int hashCode() {
        C1176590giv c1176590giv = this.LL;
        int iHashCode = (c1176590giv == null ? 0 : c1176590giv.hashCode()) * 31;
        PoiMapModeTargetData poiMapModeTargetData = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (poiMapModeTargetData == null ? 0 : poiMapModeTargetData.hashCode())) * 31;
        PoiMapDetailResponse poiMapDetailResponse = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (poiMapDetailResponse == null ? 0 : poiMapDetailResponse.hashCode())) * 31;
        String str = this.LLILZ;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LLILZIL;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LLILZLL;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        MapBounds mapBounds = this.LLIZ;
        int iHashCode7 = (iHashCode6 + (mapBounds == null ? 0 : mapBounds.hashCode())) * 31;
        EnumC1985707qB enumC1985707qB = this.LLIZLLLIL;
        return iHashCode7 + (enumC1985707qB != null ? enumC1985707qB.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiMapDetailDataParams(accInitData=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", targetPoiData=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", preLoadPoiDiscoveryResponse=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", pagePoiId=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", regionName=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", selectedTabCode=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", initialMapBounds=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", initialSheetState=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean isTargetPoiValid$poi_release() {
        PoiLocation poiLocation;
        PoiMapModeTargetData poiMapModeTargetData = this.LLILLJJLI;
        return (!C123100dR.LIZ(poiMapModeTargetData != null ? poiMapModeTargetData.targetPoiId : null) || (poiLocation = this.LLILLJJLI.targetPoiLocation) == null || poiLocation.lat == null || poiLocation.lng == null) ? false : true;
    }

    public final C1176590giv getAccInitData() {
        return this.LL;
    }

    public final MapBounds getInitialMapBounds() {
        return this.LLIZ;
    }

    public final EnumC1985707qB getInitialSheetState() {
        return this.LLIZLLLIL;
    }

    public final String getPagePoiId() {
        return this.LLILZ;
    }

    public final PoiMapDetailResponse getPreLoadPoiDiscoveryResponse() {
        return this.LLILLL;
    }

    public final String getRegionName() {
        return this.LLILZIL;
    }

    public final String getSelectedTabCode() {
        return this.LLILZLL;
    }

    public final PoiMapModeTargetData getTargetPoiData() {
        return this.LLILLJJLI;
    }

    public C1175680ghS(C1176590giv c1176590giv, PoiMapModeTargetData poiMapModeTargetData, PoiMapDetailResponse poiMapDetailResponse, String str, String str2, String str3, MapBounds mapBounds, EnumC1985707qB enumC1985707qB) {
        this.LL = c1176590giv;
        this.LLILLJJLI = poiMapModeTargetData;
        this.LLILLL = poiMapDetailResponse;
        this.LLILZ = str;
        this.LLILZIL = str2;
        this.LLILZLL = str3;
        this.LLIZ = mapBounds;
        this.LLIZLLLIL = enumC1985707qB;
    }
}
