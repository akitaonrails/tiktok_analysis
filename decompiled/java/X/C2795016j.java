package X;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.016j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2795016j implements InterfaceC0241006d {
    public final int LL;
    public final int LLILLJJLI;
    public final int LLILLL;
    public final Integer LLILZ;
    public final Integer LLILZIL;
    public final String LLILZLL;
    public final Integer LLIZ;
    public final String LLIZLLLIL;
    public final Integer LLJ;
    public final Integer LLJI;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public C2795016j() {
        int i = 0;
        this(i, i, i, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 1023);
    }

    @Override // X.InterfaceC1282004zy
    public final boolean checkExtraParamKey() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2795016j)) {
            return false;
        }
        C2795016j c2795016j = (C2795016j) obj;
        return this.LL == c2795016j.LL && this.LLILLJJLI == c2795016j.LLILLJJLI && this.LLILLL == c2795016j.LLILLL && Intrinsics.LJFF(this.LLILZ, c2795016j.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c2795016j.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c2795016j.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c2795016j.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c2795016j.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c2795016j.LLJ) && Intrinsics.LJFF(this.LLJI, c2795016j.LLJI);
    }

    public final int hashCode() {
        int i = ((((this.LL * 31) + this.LLILLJJLI) * 31) + this.LLILLL) * 31;
        Integer num = this.LLILZ;
        int iHashCode = (i + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.LLILZIL;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.LLILZLL;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num3 = this.LLIZ;
        int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str2 = this.LLIZLLLIL;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num4 = this.LLJ;
        int iHashCode6 = (iHashCode5 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.LLJI;
        return iHashCode6 + (num5 != null ? num5.hashCode() : 0);
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> keyParams() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("has_title", Integer.valueOf(this.LL));
        linkedHashMap.put("title_length", Integer.valueOf(this.LLILLJJLI));
        linkedHashMap.put("title_without_hashtag_length", Integer.valueOf(this.LLILLL));
        linkedHashMap.put("is_title_translatable", this.LLILZ);
        linkedHashMap.put("is_title_translated", this.LLILZIL);
        linkedHashMap.put("title_source_lang", this.LLILZLL);
        linkedHashMap.put("has_title_rich_text", this.LLIZ);
        linkedHashMap.put("title_rich_text_type", this.LLIZLLLIL);
        linkedHashMap.put("is_title_rich_text_translatable", this.LLJ);
        linkedHashMap.put("is_title_rich_text_translated", this.LLJI);
        return linkedHashMap;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TitleParams(hasTitle=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", titleLength=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", titleWithoutHashtagLength=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", isTitleTranslatable=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", isTitleTranslated=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", titleSourceLang=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", hasTitleRichText=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", titleRichTextType=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(", isTitleRichTextTranslatable=");
        sbLIZ.append(this.LLJ);
        sbLIZ.append(", isTitleRichTextTranslated=");
        sbLIZ.append(this.LLJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> filteredParams() {
        if (!Intrinsics.LJFF(((LinkedHashMap) keyParams()).get("has_title"), 1)) {
            return new HashMap();
        }
        HashMap map = new HashMap();
        map.putAll(keyParams());
        if (!Intrinsics.LJFF(((LinkedHashMap) keyParams()).get("is_title_translatable"), 1)) {
            map.remove("is_title_translated");
        }
        return map;
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> getExtraParam() {
        return C2097608Jq.LJ();
    }

    public /* synthetic */ C2795016j(int i, int i2, int i3, Integer num, Integer num2, String str, int i4) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? 0 : i3, (i4 & 8) != 0 ? null : num, (i4 & 16) != 0 ? null : num2, (i4 & 32) != 0 ? null : str, null, null, null, null);
    }

    public C2795016j(int i, int i2, int i3, Integer num, Integer num2, String str, Integer num3, String str2, Integer num4, Integer num5) {
        this.LL = i;
        this.LLILLJJLI = i2;
        this.LLILLL = i3;
        this.LLILZ = num;
        this.LLILZIL = num2;
        this.LLILZLL = str;
        this.LLIZ = num3;
        this.LLIZLLLIL = str2;
        this.LLJ = num4;
        this.LLJI = num5;
    }
}
