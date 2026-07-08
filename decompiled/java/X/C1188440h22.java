package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi_api.model.PoiLocation;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0h22, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1188440h22 implements InterfaceC1188520h2A, InterfaceC2753014t, Serializable {
    public final String LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final Long LLILZ;
    public final String LLILZIL;
    public final String LLILZLL;
    public final String LLIZ;
    public final String LLIZLLLIL;
    public final String LLJ;
    public final String LLJI;
    public final String LLJIJIL;
    public final String LLJILJIL;
    public final boolean LLJILJILJ;
    public final Boolean LLJILLL;
    public final PoiLocation LLJJ;
    public final String LLJJI;
    public final String LLJJIII;
    public final String LLJJIJI;

    public C1188440h22() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null);
    }

    @InterfaceC1294060jmO
    public static /* synthetic */ void getSourceId$annotations() {
    }

    public final C1188440h22 copy(String str, String str2, String str3, Long l, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, boolean z, Boolean bool, PoiLocation poiLocation, String str12, String str13) {
        return new C1188440h22(str, str2, str3, l, str4, str5, str6, str7, str8, str9, str10, str11, z, bool, poiLocation, str12, str13);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1188440h22)) {
            return false;
        }
        C1188440h22 c1188440h22 = (C1188440h22) obj;
        return Intrinsics.LJFF(this.LL, c1188440h22.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1188440h22.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1188440h22.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1188440h22.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1188440h22.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1188440h22.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c1188440h22.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c1188440h22.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c1188440h22.LLJ) && Intrinsics.LJFF(this.LLJI, c1188440h22.LLJI) && Intrinsics.LJFF(this.LLJIJIL, c1188440h22.LLJIJIL) && Intrinsics.LJFF(this.LLJILJIL, c1188440h22.LLJILJIL) && this.LLJILJILJ == c1188440h22.LLJILJILJ && Intrinsics.LJFF(this.LLJILLL, c1188440h22.LLJILLL) && Intrinsics.LJFF(this.LLJJ, c1188440h22.LLJJ) && Intrinsics.LJFF(this.LLJJI, c1188440h22.LLJJI) && Intrinsics.LJFF(this.LLJJIII, c1188440h22.LLJJIII);
    }

    public int hashCode() {
        String str = this.LL;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l = this.LLILZ;
        int iHashCode4 = (iHashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        String str4 = this.LLILZIL;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.LLILZLL;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.LLIZ;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.LLIZLLLIL;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.LLJ;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.LLJI;
        int iHashCode10 = (iHashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.LLJIJIL;
        int iHashCode11 = (iHashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.LLJILJIL;
        int iHashCode12 = (((iHashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31) + C786410Ut5.Z2(this.LLJILJILJ)) * 31;
        Boolean bool = this.LLJILLL;
        int iHashCode13 = (iHashCode12 + (bool == null ? 0 : bool.hashCode())) * 31;
        PoiLocation poiLocation = this.LLJJ;
        int iHashCode14 = (iHashCode13 + (poiLocation == null ? 0 : poiLocation.hashCode())) * 31;
        String str12 = this.LLJJI;
        int iHashCode15 = (iHashCode14 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.LLJJIII;
        return iHashCode15 + (str13 != null ? str13.hashCode() : 0);
    }

    public String toString() {
        return "PoiAnchorBasicData(fromGroupId=" + this.LL + ", poiId=" + this.LLILLJJLI + ", poiName=" + this.LLILLL + ", videoCount=" + this.LLILZ + ", poiCityCode=" + this.LLILZIL + ", poiCity=" + this.LLILZLL + ", poiRegionCode=" + this.LLIZ + ", collectInfo=" + this.LLIZLLLIL + ", typeLevel=" + this.LLJ + ", fallbackAddress=" + this.LLJI + ", poiInfoSource=" + this.LLJIJIL + ", poiDetailType=" + this.LLJILJIL + ", isCollected=" + this.LLJILJILJ + ", isClaimed=" + this.LLJILLL + ", poiLocation=" + this.LLJJ + ", anchorPassThroughInfo=" + this.LLJJI + ", poiRequestExtraParams=" + this.LLJJIII + ')';
    }

    public final String getAnchorPassThroughInfo() {
        return this.LLJJI;
    }

    public final String getCollectInfo() {
        return this.LLIZLLLIL;
    }

    public final String getFallbackAddress() {
        return this.LLJI;
    }

    public final String getFromGroupId() {
        return this.LL;
    }

    public final String getPoiCity() {
        return this.LLILZLL;
    }

    public final String getPoiCityCode() {
        return this.LLILZIL;
    }

    public final String getPoiDetailType() {
        return this.LLJILJIL;
    }

    public final String getPoiId() {
        return this.LLILLJJLI;
    }

    public final String getPoiInfoSource() {
        return this.LLJIJIL;
    }

    public final PoiLocation getPoiLocation() {
        return this.LLJJ;
    }

    public final String getPoiName() {
        return this.LLILLL;
    }

    public final String getPoiRegionCode() {
        return this.LLIZ;
    }

    public final String getPoiRequestExtraParams() {
        return this.LLJJIII;
    }

    public String getSourceId() {
        return this.LLJJIJI;
    }

    public final String getTypeLevel() {
        return this.LLJ;
    }

    public final Long getVideoCount() {
        return this.LLILZ;
    }

    public final Boolean isClaimed() {
        return this.LLJILLL;
    }

    public final boolean isCollected() {
        return this.LLJILJILJ;
    }

    public final C1188440h22 updateFromPoiDetail(String str, PoiListApi.PoiDetailResponse poiDetailResponse) {
        String collectInfo;
        String str2;
        Boolean boolIsClaimedForMobBoolType;
        String strPoiTypeName;
        String cityCode;
        String regionCode;
        Object c098200Yq;
        Object objOpt;
        String typeLevel = null;
        if (poiDetailResponse != null) {
            collectInfo = poiDetailResponse.getCollectInfo();
        } else {
            collectInfo = null;
        }
        String str3 = this.LLIZLLLIL;
        if (str3 != null) {
            if (collectInfo != null) {
                try {
                    Map<String, Object> mapLIZIZ = C117800ca.LIZIZ(new JSONObject(this.LLIZLLLIL));
                    JSONObject jSONObject = new JSONObject(collectInfo);
                    Iterator<String> itKeys = jSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        if (C123100dR.LIZ(next) && (objOpt = jSONObject.opt(next)) != null) {
                            ((HashMap) mapLIZIZ).put(next, objOpt);
                        }
                    }
                    c098200Yq = C786410Ut5.J3(new JSONObject(mapLIZIZ));
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                if (C189200o6.m7isFailureimpl(c098200Yq)) {
                    c098200Yq = null;
                }
                str2 = (String) c098200Yq;
                if (str2 == null) {
                    String str4 = this.LLIZLLLIL;
                    if (str4 != null) {
                        collectInfo = str4;
                    }
                    str2 = collectInfo;
                }
            } else {
                collectInfo = str3;
                str2 = collectInfo;
            }
        } else {
            str2 = collectInfo;
        }
        if (poiDetailResponse != null) {
            boolIsClaimedForMobBoolType = poiDetailResponse.isClaimedForMobBoolType();
            strPoiTypeName = poiDetailResponse.poiTypeName();
            cityCode = poiDetailResponse.getCityCode();
            regionCode = poiDetailResponse.getRegionCode();
            typeLevel = poiDetailResponse.getTypeLevel();
        } else {
            boolIsClaimedForMobBoolType = null;
            strPoiTypeName = null;
            cityCode = null;
            regionCode = null;
        }
        C1188440h22 c1188440h22Copy = copy(str, this.LLILLJJLI, this.LLILLL, this.LLILZ, cityCode, this.LLILZLL, regionCode, str2, typeLevel, this.LLJI, this.LLJIJIL, strPoiTypeName, this.LLJILJILJ, boolIsClaimedForMobBoolType, this.LLJJ, this.LLJJI, this.LLJJIII);
        C1188460h24.LIZ.getClass();
        C1188460h24.LJI(c1188440h22Copy);
        return c1188440h22Copy;
    }

    public C1188440h22(String str, String str2, String str3, Long l, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, boolean z, Boolean bool, PoiLocation poiLocation, String str12, String str13) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = l;
        this.LLILZIL = str4;
        this.LLILZLL = str5;
        this.LLIZ = str6;
        this.LLIZLLLIL = str7;
        this.LLJ = str8;
        this.LLJI = str9;
        this.LLJIJIL = str10;
        this.LLJILJIL = str11;
        this.LLJILJILJ = z;
        this.LLJILLL = bool;
        this.LLJJ = poiLocation;
        this.LLJJI = str12;
        this.LLJJIII = str13;
        this.LLJJIJI = "PoiAnchorBasicData";
    }
}
