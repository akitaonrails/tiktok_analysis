package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.016f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2791016f implements InterfaceC0241006d {
    public String LL;
    public Integer LLILLJJLI;
    public String LLILLL;
    public String LLILZ;
    public String LLILZIL;
    public String LLILZLL;
    public final Integer LLIZ;
    public Long LLIZLLLIL;

    public C2791016f() {
        this(null, null, 255);
    }

    @Override // X.InterfaceC1282004zy
    public final boolean checkExtraParamKey() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2791016f)) {
            return false;
        }
        C2791016f c2791016f = (C2791016f) obj;
        return Intrinsics.LJFF(this.LL, c2791016f.LL) && Intrinsics.LJFF(this.LLILLJJLI, c2791016f.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c2791016f.LLILLL) && Intrinsics.LJFF(this.LLILZ, c2791016f.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c2791016f.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c2791016f.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c2791016f.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c2791016f.LLIZLLLIL);
    }

    public final int hashCode() {
        String str = this.LL;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LLILZ;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LLILZIL;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.LLILZLL;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num2 = this.LLIZ;
        int iHashCode7 = (iHashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l = this.LLIZLLLIL;
        return iHashCode7 + (l != null ? l.hashCode() : 0);
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> keyParams() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("subtitle_setting_status", this.LL);
        linkedHashMap.put("subtitle_length", this.LLILLJJLI);
        linkedHashMap.put("subtitle_not_translatable_reason", this.LLILLL);
        linkedHashMap.put("subtitle_not_translated_reason", this.LLILZ);
        linkedHashMap.put("original_caption_variant", this.LLILZIL);
        linkedHashMap.put("subtitle_version", this.LLILZLL);
        linkedHashMap.put("is_captions_intro_show", this.LLIZ);
        linkedHashMap.put("realtime_caption_prefetch_advanced_by_ms", this.LLIZLLLIL);
        return linkedHashMap;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VideoPlaySubtitleExtraParams(subtitleSettingStatus=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", subtitleLength=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", subtitleNotTranslatableReason=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", subtitleNotTranslatedReason=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", originalCaptionVariant=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", subtitleVersion=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", isCaptionsIntroShow=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", realtimeCaptionPrefetchAdvancedByMs=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> filteredParams() {
        return keyParams();
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> getExtraParam() {
        return C2097608Jq.LJ();
    }

    public C2791016f(Integer num, String str, int i) {
        num = (i & 2) != 0 ? null : num;
        str = (i & 16) != 0 ? null : str;
        this.LL = null;
        this.LLILLJJLI = num;
        this.LLILLL = null;
        this.LLILZ = null;
        this.LLILZIL = str;
        this.LLILZLL = null;
        this.LLIZ = null;
        this.LLIZLLLIL = null;
    }
}
