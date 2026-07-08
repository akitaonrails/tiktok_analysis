package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.016B, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C016B implements InterfaceC0241006d {
    public final int LL;
    public final int LLILLJJLI;
    public final int LLILLL;
    public final Integer LLILZ;
    public final Integer LLILZIL;
    public final Integer LLILZLL;
    public final Integer LLIZ;
    public final String LLIZLLLIL;
    public final Integer LLJ;
    public final Integer LLJI;
    public final String LLJIJIL;
    public final Integer LLJILJIL;
    public final Long LLJILJILJ;
    public final Long LLJILLL;
    public final String LLJJ;
    public final String LLJJI;

    @Override // X.InterfaceC1282004zy
    public final boolean checkExtraParamKey() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C016B)) {
            return false;
        }
        C016B c016b = (C016B) obj;
        return this.LL == c016b.LL && this.LLILLJJLI == c016b.LLILLJJLI && this.LLILLL == c016b.LLILLL && Intrinsics.LJFF(this.LLILZ, c016b.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c016b.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c016b.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c016b.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c016b.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c016b.LLJ) && Intrinsics.LJFF(this.LLJI, c016b.LLJI) && Intrinsics.LJFF(this.LLJIJIL, c016b.LLJIJIL) && Intrinsics.LJFF(this.LLJILJIL, c016b.LLJILJIL) && Intrinsics.LJFF(this.LLJILJILJ, c016b.LLJILJILJ) && Intrinsics.LJFF(this.LLJILLL, c016b.LLJILLL) && Intrinsics.LJFF(this.LLJJ, c016b.LLJJ) && Intrinsics.LJFF(this.LLJJI, c016b.LLJJI);
    }

    public final int hashCode() {
        int i = ((((this.LL * 31) + this.LLILLJJLI) * 31) + this.LLILLL) * 31;
        Integer num = this.LLILZ;
        int iHashCode = (i + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.LLILZIL;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.LLILZLL;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.LLIZ;
        int iHashCode4 = (iHashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str = this.LLIZLLLIL;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num5 = this.LLJ;
        int iHashCode6 = (iHashCode5 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.LLJI;
        int iHashCode7 = (iHashCode6 + (num6 == null ? 0 : num6.hashCode())) * 31;
        String str2 = this.LLJIJIL;
        int iHashCode8 = (iHashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num7 = this.LLJILJIL;
        int iHashCode9 = (iHashCode8 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Long l = this.LLJILJILJ;
        int iHashCode10 = (iHashCode9 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.LLJILLL;
        int iHashCode11 = (iHashCode10 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str3 = this.LLJJ;
        int iHashCode12 = (iHashCode11 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LLJJI;
        return iHashCode12 + (str4 != null ? str4.hashCode() : 0);
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> keyParams() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("result_code", Integer.valueOf(this.LL));
        linkedHashMap.put("duration", Integer.valueOf(this.LLILLJJLI));
        linkedHashMap.put("is_from_kernel", Integer.valueOf(this.LLILLL));
        linkedHashMap.put("player_error_code", this.LLILZ);
        linkedHashMap.put("player_cache_hit", this.LLILZIL);
        linkedHashMap.put("player_download_duration", this.LLILZLL);
        linkedHashMap.put("player_file_size", this.LLIZ);
        linkedHashMap.put("player_error_msg", this.LLIZLLLIL);
        linkedHashMap.put("hit_preload", this.LLJ);
        linkedHashMap.put("first_pts", this.LLJI);
        linkedHashMap.put("biz_error_msg", this.LLJIJIL);
        linkedHashMap.put("ignore_in_funnel", this.LLJILJIL);
        linkedHashMap.put("end_video_pts", this.LLJILJILJ);
        linkedHashMap.put("overdue_duration", this.LLJILLL);
        linkedHashMap.put("source_tag", this.LLJJ);
        linkedHashMap.put("original_source_tag", this.LLJJI);
        return linkedHashMap;
    }

    public final String toString() {
        return "PerfCaptionLoadEndParams(resultCode=" + this.LL + ", duration=" + this.LLILLJJLI + ", isFromKernel=" + this.LLILLL + ", playerErrorCode=" + this.LLILZ + ", playerCacheHit=" + this.LLILZIL + ", playerDownloadDuration=" + this.LLILZLL + ", playerFileSize=" + this.LLIZ + ", playerErrorMsg=" + this.LLIZLLLIL + ", hitPreload=" + this.LLJ + ", firstPts=" + this.LLJI + ", bizErrorMsg=" + this.LLJIJIL + ", ignoreInFunnel=" + this.LLJILJIL + ", endVideoPts=" + this.LLJILJILJ + ", overdueDuration=" + this.LLJILLL + ", sourceTag=" + this.LLJJ + ", originalSourceTag=" + this.LLJJI + ')';
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> filteredParams() {
        return keyParams();
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> getExtraParam() {
        return C2097608Jq.LJ();
    }

    public /* synthetic */ C016B(int i, int i2, Integer num, Integer num2, Integer num3, Integer num4, String str, Integer num5, String str2, int i3) {
        this(i, -1, (i3 & 4) != 0 ? 0 : i2, (i3 & 8) != 0 ? null : num, (i3 & 16) != 0 ? null : num2, (i3 & 32) != 0 ? null : num3, (i3 & 64) != 0 ? null : num4, (i3 & 128) != 0 ? null : str, null, (i3 & 512) != 0 ? null : num5, (i3 & 1024) == 0 ? str2 : null, null, null, null, null, null);
    }

    public C016B(int i, int i2, int i3, Integer num, Integer num2, Integer num3, Integer num4, String str, Integer num5, Integer num6, String str2, Integer num7, Long l, Long l2, String str3, String str4) {
        this.LL = i;
        this.LLILLJJLI = i2;
        this.LLILLL = i3;
        this.LLILZ = num;
        this.LLILZIL = num2;
        this.LLILZLL = num3;
        this.LLIZ = num4;
        this.LLIZLLLIL = str;
        this.LLJ = num5;
        this.LLJI = num6;
        this.LLJIJIL = str2;
        this.LLJILJIL = num7;
        this.LLJILJILJ = l;
        this.LLJILLL = l2;
        this.LLJJ = str3;
        this.LLJJI = str4;
    }
}
