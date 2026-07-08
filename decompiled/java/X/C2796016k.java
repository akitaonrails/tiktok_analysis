package X;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.016k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2796016k implements InterfaceC0241006d {
    public final int LL;
    public final int LLILLJJLI;
    public final int LLILLL;
    public final int LLILZ;
    public final Integer LLILZIL;
    public final Integer LLILZLL;
    public final String LLIZ;
    public final String LLIZLLLIL;

    public C2796016k() {
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
        if (!(obj instanceof C2796016k)) {
            return false;
        }
        C2796016k c2796016k = (C2796016k) obj;
        return this.LL == c2796016k.LL && this.LLILLJJLI == c2796016k.LLILLJJLI && this.LLILLL == c2796016k.LLILLL && this.LLILZ == c2796016k.LLILZ && Intrinsics.LJFF(this.LLILZIL, c2796016k.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c2796016k.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c2796016k.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c2796016k.LLIZLLLIL);
    }

    public final int hashCode() {
        int i = ((((((this.LL * 31) + this.LLILLJJLI) * 31) + this.LLILLL) * 31) + this.LLILZ) * 31;
        Integer num = this.LLILZIL;
        int iHashCode = (i + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.LLILZLL;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.LLIZ;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LLIZLLLIL;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> keyParams() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("has_text_sticker", Integer.valueOf(this.LL));
        linkedHashMap.put("text_sticker_cnt", Integer.valueOf(this.LLILLJJLI));
        linkedHashMap.put("transparent_text_sticker_cnt", Integer.valueOf(this.LLILLL));
        linkedHashMap.put("opaque_text_sticker_cnt", Integer.valueOf(this.LLILZ));
        linkedHashMap.put("is_text_sticker_translatable", this.LLILZIL);
        linkedHashMap.put("is_text_sticker_translated", this.LLILZLL);
        linkedHashMap.put("text_sticker_source_lang", this.LLIZ);
        linkedHashMap.put("background_reduced_cnt", this.LLIZLLLIL);
        return linkedHashMap;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StickerParams(hasTextSticker=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", textStickerCnt=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", transparentTextStickerCnt=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", opaqueTextStickerCnt=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", isTextStickerTranslatable=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", isTextStickerTranslated=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", textStickerSourceLang=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", backgroundReducedCnt=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> filteredParams() {
        if (!Intrinsics.LJFF(((LinkedHashMap) keyParams()).get("has_text_sticker"), 1)) {
            return new HashMap();
        }
        HashMap map = new HashMap();
        map.putAll(keyParams());
        if (!Intrinsics.LJFF(((LinkedHashMap) keyParams()).get("is_text_sticker_translatable"), 1)) {
            map.remove("is_text_sticker_translated");
        }
        return map;
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> getExtraParam() {
        return C2097608Jq.LJ();
    }

    public /* synthetic */ C2796016k(int i) {
        this(0, 0, 0, 0, null, null, null, null);
    }

    public C2796016k(int i, int i2, int i3, int i4, Integer num, Integer num2, String str, String str2) {
        this.LL = i;
        this.LLILLJJLI = i2;
        this.LLILLL = i3;
        this.LLILZ = i4;
        this.LLILZIL = num;
        this.LLILZLL = num2;
        this.LLIZ = str;
        this.LLIZLLLIL = str2;
    }
}
