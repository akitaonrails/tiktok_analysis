package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.016X, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C016X implements InterfaceC0241006d {
    public final int LL;
    public final String LLILLJJLI;
    public final Integer LLILLL;
    public final String LLILZ;
    public final String LLILZIL;
    public final String LLILZLL;
    public final Integer LLIZ;
    public final Integer LLIZLLLIL;
    public final String LLJ;
    public final String LLJI;
    public final Integer LLJIJIL;
    public final String LLJILJIL;
    public final Integer LLJILJILJ;

    public C016X() {
        this(0, null, null, null, null, null, null, null, null, null, null, null, null, 8191);
    }

    @Override // X.InterfaceC1282004zy
    public final boolean checkExtraParamKey() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C016X)) {
            return false;
        }
        C016X c016x = (C016X) obj;
        return this.LL == c016x.LL && Intrinsics.LJFF(this.LLILLJJLI, c016x.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c016x.LLILLL) && Intrinsics.LJFF(this.LLILZ, c016x.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c016x.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c016x.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c016x.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c016x.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c016x.LLJ) && Intrinsics.LJFF(this.LLJI, c016x.LLJI) && Intrinsics.LJFF(this.LLJIJIL, c016x.LLJIJIL) && Intrinsics.LJFF(this.LLJILJIL, c016x.LLJILJIL) && Intrinsics.LJFF(this.LLJILJILJ, c016x.LLJILJILJ);
    }

    public final int hashCode() {
        int i = this.LL * 31;
        String str = this.LLILLJJLI;
        int iHashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.LLILLL;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.LLILZ;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LLILZIL;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LLILZLL;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num2 = this.LLIZ;
        int iHashCode6 = (iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.LLIZLLLIL;
        int iHashCode7 = (iHashCode6 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str5 = this.LLJ;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.LLJI;
        int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num4 = this.LLJIJIL;
        int iHashCode10 = (iHashCode9 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str7 = this.LLJILJIL;
        int iHashCode11 = (iHashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Integer num5 = this.LLJILJILJ;
        return iHashCode11 + (num5 != null ? num5.hashCode() : 0);
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> keyParams() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("has_subtitle", Integer.valueOf(this.LL));
        linkedHashMap.put("subtitle_type", this.LLILLJJLI);
        linkedHashMap.put("is_burned_in", this.LLILLL);
        linkedHashMap.put("captions_show_type", this.LLILZ);
        linkedHashMap.put("subtitle_source_lang", this.LLILZIL);
        linkedHashMap.put("subtitle_load_type", this.LLILZLL);
        linkedHashMap.put("have_transl", this.LLIZ);
        linkedHashMap.put("use_transl", this.LLIZLLLIL);
        linkedHashMap.put("subtitle_lang", this.LLJ);
        linkedHashMap.put("translation_subtitle_type", this.LLJI);
        linkedHashMap.put("has_burned_in_captions", this.LLJIJIL);
        linkedHashMap.put("burned_in_captions_source_lang", this.LLJILJIL);
        linkedHashMap.put("is_external_subtitle_block", this.LLJILJILJ);
        return linkedHashMap;
    }

    public final String toString() {
        return "SubtitleParams(hasSubtitle=" + this.LL + ", subtitleType=" + this.LLILLJJLI + ", isBurnedIn=" + this.LLILLL + ", captionsShowType=" + this.LLILZ + ", subtitleSourceLang=" + this.LLILZIL + ", subtitleLoadType=" + this.LLILZLL + ", haveTransl=" + this.LLIZ + ", useTransl=" + this.LLIZLLLIL + ", subtitleLang=" + this.LLJ + ", translationSubtitleType=" + this.LLJI + ", hasBurnedInCaptions=" + this.LLJIJIL + ", burnedInCaptionsSourceLang=" + this.LLJILJIL + ", isExternalSubtitleBlock=" + this.LLJILJILJ + ')';
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> filteredParams() {
        if (!Intrinsics.LJFF(((LinkedHashMap) keyParams()).get("has_subtitle"), 1)) {
            return new HashMap();
        }
        HashMap map = new HashMap();
        map.putAll(keyParams());
        if (Intrinsics.LJFF(((LinkedHashMap) keyParams()).get("subtitle_load_type"), "")) {
            map.remove("subtitle_load_type");
        }
        return map;
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> getExtraParam() {
        return C2097608Jq.LJ();
    }

    public C016X(int i, String str, Integer num, String str2, String str3, String str4, Integer num2, Integer num3, String str5, String str6, Integer num4, String str7, Integer num5, int i2) {
        i = (i2 & 1) != 0 ? 0 : i;
        str = (i2 & 2) != 0 ? null : str;
        num = (i2 & 4) != 0 ? null : num;
        str2 = (i2 & 8) != 0 ? null : str2;
        str3 = (i2 & 16) != 0 ? null : str3;
        str4 = (i2 & 32) != 0 ? null : str4;
        num2 = (i2 & 64) != 0 ? null : num2;
        num3 = (i2 & 128) != 0 ? null : num3;
        str5 = (i2 & 256) != 0 ? null : str5;
        str6 = (i2 & 512) != 0 ? null : str6;
        num4 = (i2 & 1024) != 0 ? null : num4;
        str7 = (i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? null : str7;
        Integer num6 = (i2 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) == 0 ? num5 : null;
        this.LL = i;
        this.LLILLJJLI = str;
        this.LLILLL = num;
        this.LLILZ = str2;
        this.LLILZIL = str3;
        this.LLILZLL = str4;
        this.LLIZ = num2;
        this.LLIZLLLIL = num3;
        this.LLJ = str5;
        this.LLJI = str6;
        this.LLJIJIL = num4;
        this.LLJILJIL = str7;
        this.LLJILJILJ = num6;
    }
}
