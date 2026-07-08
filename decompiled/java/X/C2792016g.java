package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.016g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2792016g implements InterfaceC0241006d {
    public String LL;
    public final Integer LLILLJJLI;
    public final Integer LLILLL;
    public Integer LLILZ;
    public Integer LLILZIL;
    public String LLILZLL;
    public String LLIZ;

    public C2792016g() {
        this(0);
    }

    @Override // X.InterfaceC1282004zy
    public final boolean checkExtraParamKey() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2792016g)) {
            return false;
        }
        C2792016g c2792016g = (C2792016g) obj;
        return Intrinsics.LJFF(this.LL, c2792016g.LL) && Intrinsics.LJFF(this.LLILLJJLI, c2792016g.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c2792016g.LLILLL) && Intrinsics.LJFF(this.LLILZ, c2792016g.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c2792016g.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c2792016g.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c2792016g.LLIZ);
    }

    public final int hashCode() {
        String str = this.LL;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.LLILZ;
        int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.LLILZIL;
        int iHashCode5 = (iHashCode4 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str2 = this.LLILZLL;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LLIZ;
        return iHashCode6 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> keyParams() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("translation_status", this.LL);
        linkedHashMap.put("is_video_translatable", this.LLILLJJLI);
        linkedHashMap.put("is_video_translated", this.LLILLL);
        linkedHashMap.put("trigger_default_dnt", this.LLILZ);
        linkedHashMap.put("is_video_in_dnt", this.LLILZIL);
        linkedHashMap.put("not_translate_langs", this.LLILZLL);
        linkedHashMap.put("default_dnt_lang", this.LLIZ);
        return linkedHashMap;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VideoPlayCLATranslationParams(translationStatus=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", isVideoTranslatable=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", isVideoTranslated=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", triggerDefaultDnt=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", isVideoInDnt=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", notTranslateLangs=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", defaultDntLang=");
        sbLIZ.append(this.LLIZ);
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

    public C2792016g(int i) {
        this.LL = null;
        this.LLILLJJLI = null;
        this.LLILLL = null;
        this.LLILZ = null;
        this.LLILZIL = null;
        this.LLILZLL = null;
        this.LLIZ = null;
    }
}
