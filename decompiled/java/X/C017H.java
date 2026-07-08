package X;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.017H, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C017H implements InterfaceC0241006d {
    public final int LL;
    public final Long LLILLJJLI;
    public final String LLILLL;
    public final Integer LLILZ;
    public final Integer LLILZIL;
    public final String LLILZLL;
    public String LLIZ;
    public String LLIZLLLIL;

    public C017H() {
        this(0, null, null, null, null, null, 255);
    }

    @Override // X.InterfaceC1282004zy
    public final boolean checkExtraParamKey() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C017H)) {
            return false;
        }
        C017H c017h = (C017H) obj;
        return this.LL == c017h.LL && Intrinsics.LJFF(this.LLILLJJLI, c017h.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c017h.LLILLL) && Intrinsics.LJFF(this.LLILZ, c017h.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c017h.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c017h.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c017h.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c017h.LLIZLLLIL);
    }

    public final int hashCode() {
        int i = this.LL * 31;
        Long l = this.LLILLJJLI;
        int iHashCode = (i + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.LLILLL;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.LLILZ;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.LLILZIL;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.LLILZLL;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LLIZ;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LLIZLLLIL;
        return iHashCode6 + (str4 != null ? str4.hashCode() : 0);
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> keyParams() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("has_ads_component", Integer.valueOf(this.LL));
        linkedHashMap.put("ad_id", this.LLILLJJLI);
        linkedHashMap.put("creative_id", this.LLILLL);
        linkedHashMap.put("is_ads_component_translatable", this.LLILZ);
        linkedHashMap.put("is_ads_component_translated", this.LLILZIL);
        linkedHashMap.put("ads_component_source_lang", this.LLILZLL);
        linkedHashMap.put("ads_component_not_translatable_reason", this.LLIZ);
        linkedHashMap.put("ads_component_not_translated_reason", this.LLIZLLLIL);
        return linkedHashMap;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AdsComponentParams(hasAdsComponent=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", adId=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", creativeId=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", isTranslatable=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", isTranslated=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", sourceLanguage=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", notTranslatableReason=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", notTranslatedReason=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> filteredParams() {
        if (!Intrinsics.LJFF(((LinkedHashMap) keyParams()).get("has_ads_component"), 1)) {
            return new HashMap();
        }
        HashMap map = new HashMap();
        map.putAll(keyParams());
        if (!Intrinsics.LJFF(((LinkedHashMap) keyParams()).get("is_ads_component_translatable"), 1)) {
            map.remove("is_ads_component_translated");
        }
        return map;
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> getExtraParam() {
        return C2097608Jq.LJ();
    }

    public C017H(int i, Long l, String str, Integer num, Integer num2, String str2, int i2) {
        i = (i2 & 1) != 0 ? 0 : i;
        l = (i2 & 2) != 0 ? null : l;
        str = (i2 & 4) != 0 ? null : str;
        num = (i2 & 8) != 0 ? null : num;
        num2 = (i2 & 16) != 0 ? null : num2;
        str2 = (i2 & 32) != 0 ? null : str2;
        this.LL = i;
        this.LLILLJJLI = l;
        this.LLILLL = str;
        this.LLILZ = num;
        this.LLILZIL = num2;
        this.LLILZLL = str2;
        this.LLIZ = null;
        this.LLIZLLLIL = null;
    }
}
