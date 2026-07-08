package X;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0h8p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1192650h8p implements Serializable, InterfaceC2753014t {
    public final String LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final String LLILZIL;
    public final String LLILZLL;
    public final String LLIZ;
    public final String LLIZLLLIL;
    public final String LLJ;
    public final Map<String, Object> LLJI;
    public final Map<String, Object> LLJIJIL;
    public final String LLJILJIL;
    public final String LLJILJILJ;
    public final String LLJILLL;

    public C1192650h8p() {
        this(null, null, null, null, null, null, null, null, null, new LinkedHashMap(), new LinkedHashMap(), null, null, null);
    }

    public final C1192650h8p copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Map<String, Object> map, Map<String, Object> map2, String str10, String str11, String str12) {
        return new C1192650h8p(str, str2, str3, str4, str5, str6, str7, str8, str9, map, map2, str10, str11, str12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1192650h8p)) {
            return false;
        }
        C1192650h8p c1192650h8p = (C1192650h8p) obj;
        return Intrinsics.LJFF(this.LL, c1192650h8p.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1192650h8p.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1192650h8p.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1192650h8p.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1192650h8p.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1192650h8p.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c1192650h8p.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c1192650h8p.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c1192650h8p.LLJ) && Intrinsics.LJFF(this.LLJI, c1192650h8p.LLJI) && Intrinsics.LJFF(this.LLJIJIL, c1192650h8p.LLJIJIL) && Intrinsics.LJFF(this.LLJILJIL, c1192650h8p.LLJILJIL) && Intrinsics.LJFF(this.LLJILJILJ, c1192650h8p.LLJILJILJ) && Intrinsics.LJFF(this.LLJILLL, c1192650h8p.LLJILLL);
    }

    public String getSourceId() {
        return "PoiOrderSubmitTrackParams";
    }

    public int hashCode() {
        String str = this.LL;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LLILZ;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.LLILZIL;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.LLILZLL;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.LLIZ;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.LLIZLLLIL;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.LLJ;
        int iHashCode9 = (((((iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31) + this.LLJI.hashCode()) * 31) + this.LLJIJIL.hashCode()) * 31;
        String str10 = this.LLJILJIL;
        int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.LLJILJILJ;
        int iHashCode11 = (iHashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.LLJILLL;
        return iHashCode11 + (str12 != null ? str12.hashCode() : 0);
    }

    public String toString() {
        return "PoiOrderSubmitTrackParams(poiId=" + this.LL + ", enterFrom=" + this.LLILLJJLI + ", enterMethod=" + this.LLILLL + ", poiDetailEnterFrom=" + this.LLILZ + ", poiDetailEnterMethod=" + this.LLILZIL + ", pdpEnterFrom=" + this.LLILZLL + ", pdpEnterMethod=" + this.LLIZ + ", collectInfo=" + this.LLIZLLLIL + ", pdpAtmosphereTagIds=" + this.LLJ + ", passThroughInfo=" + this.LLJI + ", trackInfo=" + this.LLJIJIL + ", btmPageId=" + this.LLJILJIL + ", oneClickBookingTypeAble=" + this.LLJILJILJ + ", oneClickBookingTypeActual=" + this.LLJILLL + ')';
    }

    public final JSONObject toJSONObject() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        C1189060h32.LJJI("poi_id", this.LL, jSONObject);
        C1189060h32.LJJI("enter_from", this.LLILLJJLI, jSONObject);
        C1189060h32.LJJI("enter_method", this.LLILLL, jSONObject);
        C1189060h32.LJJI("poi_detail_enter_from", this.LLILZ, jSONObject);
        C1189060h32.LJJI("poi_detail_enter_method", this.LLILZIL, jSONObject);
        C1189060h32.LJJI("pdp_enter_from", this.LLILZLL, jSONObject);
        C1189060h32.LJJI("pdp_enter_method", this.LLIZ, jSONObject);
        C1189060h32.LJJI("collect_info", this.LLIZLLLIL, jSONObject);
        C1189060h32.LJJI("btm_page_id", this.LLJILJIL, jSONObject);
        C1189060h32.LJJI("one_click_booking_type_able", this.LLJILJILJ, jSONObject);
        C1189060h32.LJJI("one_click_booking_type_actual", this.LLJILLL, jSONObject);
        for (Map.Entry<String, Object> entry : this.LLJI.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            C1189060h32.LJJI(key, value != null ? value.toString() : null, jSONObject);
        }
        for (Map.Entry<String, Object> entry2 : this.LLJIJIL.entrySet()) {
            String key2 = entry2.getKey();
            Object value2 = entry2.getValue();
            if (C123100dR.LIZ(key2) && value2 != null) {
                jSONObject.put(key2, value2.toString());
            }
        }
        return jSONObject;
    }

    public final String getBtmPageId() {
        return this.LLJILJIL;
    }

    public final String getCollectInfo() {
        return this.LLIZLLLIL;
    }

    public final String getEnterFrom() {
        return this.LLILLJJLI;
    }

    public final String getEnterMethod() {
        return this.LLILLL;
    }

    public final String getOneClickBookingTypeAble() {
        return this.LLJILJILJ;
    }

    public final String getOneClickBookingTypeActual() {
        return this.LLJILLL;
    }

    public final Map<String, Object> getPassThroughInfo() {
        return this.LLJI;
    }

    public final String getPdpAtmosphereTagIds() {
        return this.LLJ;
    }

    public final String getPdpEnterFrom() {
        return this.LLILZLL;
    }

    public final String getPdpEnterMethod() {
        return this.LLIZ;
    }

    public final String getPoiDetailEnterFrom() {
        return this.LLILZ;
    }

    public final String getPoiDetailEnterMethod() {
        return this.LLILZIL;
    }

    public final String getPoiId() {
        return this.LL;
    }

    public final Map<String, Object> getTrackInfo() {
        return this.LLJIJIL;
    }

    public C1192650h8p(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Map<String, Object> map, Map<String, Object> map2, String str10, String str11, String str12) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = str4;
        this.LLILZIL = str5;
        this.LLILZLL = str6;
        this.LLIZ = str7;
        this.LLIZLLLIL = str8;
        this.LLJ = str9;
        this.LLJI = map;
        this.LLJIJIL = map2;
        this.LLJILJIL = str10;
        this.LLJILJILJ = str11;
        this.LLJILLL = str12;
    }
}
