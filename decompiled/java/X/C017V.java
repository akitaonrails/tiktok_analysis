package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.017V, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C017V implements InterfaceC0241006d {
    public final int LL;
    public final String LLILLJJLI;
    public final int LLILLL;
    public final String LLILZ;
    public final int LLILZIL;
    public final int LLILZLL;
    public final int LLIZ;
    public final String LLIZLLLIL;
    public final String LLJ;

    public C017V() {
        this(0, 0, 0, 0, 0, null, null, null, null);
    }

    @Override // X.InterfaceC1282004zy
    public final boolean checkExtraParamKey() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C017V)) {
            return false;
        }
        C017V c017v = (C017V) obj;
        return this.LL == c017v.LL && Intrinsics.LJFF(this.LLILLJJLI, c017v.LLILLJJLI) && this.LLILLL == c017v.LLILLL && Intrinsics.LJFF(this.LLILZ, c017v.LLILZ) && this.LLILZIL == c017v.LLILZIL && this.LLILZLL == c017v.LLILZLL && this.LLIZ == c017v.LLIZ && Intrinsics.LJFF(this.LLIZLLLIL, c017v.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c017v.LLJ);
    }

    public final int hashCode() {
        int i = this.LL * 31;
        String str = this.LLILLJJLI;
        int iHashCode = (((i + (str == null ? 0 : str.hashCode())) * 31) + this.LLILLL) * 31;
        String str2 = this.LLILZ;
        int iHashCode2 = (((((((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.LLILZIL) * 31) + this.LLILZLL) * 31) + this.LLIZ) * 31;
        String str3 = this.LLIZLLLIL;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LLJ;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> keyParams() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("desc_translatable_cnt", Integer.valueOf(this.LL));
        linkedHashMap.put("desc_translatable_post_index", this.LLILLJJLI);
        linkedHashMap.put("desc_translated_cnt", Integer.valueOf(this.LLILLL));
        linkedHashMap.put("desc_translated_post_index", this.LLILZ);
        linkedHashMap.put("pull_type", Integer.valueOf(this.LLILZIL));
        linkedHashMap.put("title_contains_translated_cnt", Integer.valueOf(this.LLILZLL));
        linkedHashMap.put("title_translatable_cnt", Integer.valueOf(this.LLIZ));
        linkedHashMap.put("title_translatable_post_index", this.LLIZLLLIL);
        linkedHashMap.put("title_translated_post_index", this.LLJ);
        return linkedHashMap;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FeedWithClaTranslationParams(descTranslatableCnt=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", descTranslatablePostIndex=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", descTranslatedCnt=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", descTranslatedPostIndex=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", pullType=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", titleContainsTranslatedCnt=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", titleTranslatableCnt=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", titleTranslatablePostIndex=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(", titleTranslatedPostIndex=");
        sbLIZ.append(this.LLJ);
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

    public C017V(int i, int i2, int i3, int i4, int i5, String str, String str2, String str3, String str4) {
        this.LL = i;
        this.LLILLJJLI = str;
        this.LLILLL = i2;
        this.LLILZ = str2;
        this.LLILZIL = i3;
        this.LLILZLL = i4;
        this.LLIZ = i5;
        this.LLIZLLLIL = str3;
        this.LLJ = str4;
    }
}
