package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0167, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class AnonymousClass0167 implements InterfaceC0241006d {
    public final Integer LL;
    public final Integer LLILLJJLI;
    public final Integer LLILLL;
    public final Integer LLILZ;
    public final Integer LLILZIL;
    public final Integer LLILZLL;
    public final String LLIZ;
    public final String LLIZLLLIL;
    public final Integer LLJ;
    public final Long LLJI;
    public final String LLJIJIL;

    public AnonymousClass0167() {
        this(null, null, null, null, null, null, null, null, null, 2047);
    }

    @Override // X.InterfaceC1282004zy
    public final boolean checkExtraParamKey() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass0167)) {
            return false;
        }
        AnonymousClass0167 anonymousClass0167 = (AnonymousClass0167) obj;
        return Intrinsics.LJFF(this.LL, anonymousClass0167.LL) && Intrinsics.LJFF(this.LLILLJJLI, anonymousClass0167.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, anonymousClass0167.LLILLL) && Intrinsics.LJFF(this.LLILZ, anonymousClass0167.LLILZ) && Intrinsics.LJFF(this.LLILZIL, anonymousClass0167.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, anonymousClass0167.LLILZLL) && Intrinsics.LJFF(this.LLIZ, anonymousClass0167.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, anonymousClass0167.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, anonymousClass0167.LLJ) && Intrinsics.LJFF(this.LLJI, anonymousClass0167.LLJI) && Intrinsics.LJFF(this.LLJIJIL, anonymousClass0167.LLJIJIL);
    }

    public final int hashCode() {
        Integer num = this.LL;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.LLILZ;
        int iHashCode4 = (iHashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.LLILZIL;
        int iHashCode5 = (iHashCode4 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.LLILZLL;
        int iHashCode6 = (iHashCode5 + (num6 == null ? 0 : num6.hashCode())) * 31;
        String str = this.LLIZ;
        int iHashCode7 = (iHashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LLIZLLLIL;
        int iHashCode8 = (iHashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num7 = this.LLJ;
        int iHashCode9 = (iHashCode8 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Long l = this.LLJI;
        int iHashCode10 = (iHashCode9 + (l == null ? 0 : l.hashCode())) * 31;
        String str3 = this.LLJIJIL;
        return iHashCode10 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> keyParams() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("duration", this.LL);
        linkedHashMap.put("is_first_caption", this.LLILLJJLI);
        linkedHashMap.put("first_caption_delay_duration", this.LLILLL);
        linkedHashMap.put("timestamp", this.LLILZ);
        linkedHashMap.put("caption_index", this.LLILZIL);
        linkedHashMap.put("has_seeked", this.LLILZLL);
        linkedHashMap.put("source_tag", this.LLIZ);
        linkedHashMap.put("original_source_tag", this.LLIZLLLIL);
        linkedHashMap.put("hit_preload", this.LLJ);
        linkedHashMap.put("overdue_duration", this.LLJI);
        linkedHashMap.put("caption_variant", this.LLJIJIL);
        return linkedHashMap;
    }

    public final String toString() {
        return "PerfCaptionFirstDisplayParams(duration=" + this.LL + ", isFirstCaption=" + this.LLILLJJLI + ", firstCaptionDelayDuration=" + this.LLILLL + ", timestamp=" + this.LLILZ + ", index=" + this.LLILZIL + ", hasSeeked=" + this.LLILZLL + ", sourceTag=" + this.LLIZ + ", originalSourceTag=" + this.LLIZLLLIL + ", hitPreload=" + this.LLJ + ", overdueDuration=" + this.LLJI + ", captionVariant=" + this.LLJIJIL + ')';
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> filteredParams() {
        return keyParams();
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> getExtraParam() {
        return C2097608Jq.LJ();
    }

    public AnonymousClass0167(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Long l, String str, int i) {
        num = (i & 1) != 0 ? null : num;
        num2 = (i & 2) != 0 ? null : num2;
        num3 = (i & 4) != 0 ? null : num3;
        num4 = (i & 8) != 0 ? null : num4;
        num5 = (i & 16) != 0 ? null : num5;
        num6 = (i & 32) != 0 ? null : num6;
        num7 = (i & 256) != 0 ? null : num7;
        l = (i & 512) != 0 ? null : l;
        str = (i & 1024) != 0 ? null : str;
        this.LL = num;
        this.LLILLJJLI = num2;
        this.LLILLL = num3;
        this.LLILZ = num4;
        this.LLILZIL = num5;
        this.LLILZLL = num6;
        this.LLIZ = null;
        this.LLIZLLLIL = null;
        this.LLJ = num7;
        this.LLJI = l;
        this.LLJIJIL = str;
    }
}
