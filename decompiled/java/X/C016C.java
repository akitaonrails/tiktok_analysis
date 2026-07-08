package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.016C, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C016C implements InterfaceC0241006d {
    public final String LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final String LLILZIL;
    public final String LLILZLL;
    public final int LLIZ;
    public final Integer LLIZLLLIL;
    public final Integer LLJ;
    public Integer LLJI;
    public final Long LLJIJIL;
    public final String LLJILJIL;
    public final String LLJILJILJ;
    public final Integer LLJILLL;

    @Override // X.InterfaceC1282004zy
    public final boolean checkExtraParamKey() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C016C)) {
            return false;
        }
        C016C c016c = (C016C) obj;
        return Intrinsics.LJFF(this.LL, c016c.LL) && Intrinsics.LJFF(this.LLILLJJLI, c016c.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c016c.LLILLL) && Intrinsics.LJFF(this.LLILZ, c016c.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c016c.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c016c.LLILZLL) && this.LLIZ == c016c.LLIZ && Intrinsics.LJFF(this.LLIZLLLIL, c016c.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c016c.LLJ) && Intrinsics.LJFF(this.LLJI, c016c.LLJI) && Intrinsics.LJFF(this.LLJIJIL, c016c.LLJIJIL) && Intrinsics.LJFF(this.LLJILJIL, c016c.LLJILJIL) && Intrinsics.LJFF(this.LLJILJILJ, c016c.LLJILJILJ) && Intrinsics.LJFF(this.LLJILLL, c016c.LLJILLL);
    }

    public final int hashCode() {
        int iHashCode = ((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31;
        String str = this.LLILZ;
        int iHashCode2 = (((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.LLILZIL.hashCode()) * 31) + this.LLILZLL.hashCode()) * 31) + this.LLIZ) * 31;
        Integer num = this.LLIZLLLIL;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.LLJ;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.LLJI;
        int iHashCode5 = (iHashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Long l = this.LLJIJIL;
        int iHashCode6 = (iHashCode5 + (l == null ? 0 : l.hashCode())) * 31;
        String str2 = this.LLJILJIL;
        int iHashCode7 = (iHashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LLJILJILJ;
        int iHashCode8 = (iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num4 = this.LLJILLL;
        return iHashCode8 + (num4 != null ? num4.hashCode() : 0);
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> keyParams() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("subtitle_id", this.LL);
        linkedHashMap.put("cla_subtitle_id", this.LLILLJJLI);
        linkedHashMap.put("target_language", this.LLILLL);
        linkedHashMap.put("caption_original_language", this.LLILZ);
        linkedHashMap.put("caption_type", this.LLILZIL);
        linkedHashMap.put("trigger_method", this.LLILZLL);
        linkedHashMap.put("is_lazy_load", Integer.valueOf(this.LLIZ));
        linkedHashMap.put("url_expired", this.LLIZLLLIL);
        linkedHashMap.put("is_translated_caption", this.LLJ);
        linkedHashMap.put("is_fullscreen", this.LLJI);
        linkedHashMap.put("video_first_caption_pts", this.LLJIJIL);
        linkedHashMap.put("source_tag", this.LLJILJIL);
        linkedHashMap.put("original_source_tag", this.LLJILJILJ);
        linkedHashMap.put("is_smart_lazy_load", this.LLJILLL);
        return linkedHashMap;
    }

    public final String toString() {
        return "PerfCaptionLoadStartParams(subtitleId=" + this.LL + ", claSubtitleId=" + this.LLILLJJLI + ", targetLanguage=" + this.LLILLL + ", captionOriginalLanguage=" + this.LLILZ + ", captionType=" + this.LLILZIL + ", triggerMethod=" + this.LLILZLL + ", isLazyload=" + this.LLIZ + ", isUrlExpired=" + this.LLIZLLLIL + ", isTranslatedCaption=" + this.LLJ + ", isFullScreen=" + this.LLJI + ", videoFirstCaptionPts=" + this.LLJIJIL + ", sourceTag=" + this.LLJILJIL + ", originalSourceTag=" + this.LLJILJILJ + ", isSmartLazyLoad=" + this.LLJILLL + ')';
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> filteredParams() {
        return keyParams();
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> getExtraParam() {
        return C2097608Jq.LJ();
    }

    public C016C(String str, String str2, String str3, String str4, String str5, String str6, int i, Integer num, Integer num2, Integer num3, Long l, String str7, String str8, Integer num4) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = str4;
        this.LLILZIL = str5;
        this.LLILZLL = str6;
        this.LLIZ = i;
        this.LLIZLLLIL = num;
        this.LLJ = num2;
        this.LLJI = num3;
        this.LLJIJIL = l;
        this.LLJILJIL = str7;
        this.LLJILJILJ = str8;
        this.LLJILLL = num4;
    }
}
