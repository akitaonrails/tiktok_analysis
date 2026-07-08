package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0075, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class AnonymousClass0075 implements InterfaceC0241006d {
    public final Integer LL;
    public final Integer LLILLJJLI;
    public final Integer LLILLL;
    public final String LLILZ;

    public AnonymousClass0075() {
        this(null, null, null, null);
    }

    @Override // X.InterfaceC1282004zy
    public final boolean checkExtraParamKey() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass0075)) {
            return false;
        }
        AnonymousClass0075 anonymousClass0075 = (AnonymousClass0075) obj;
        return Intrinsics.LJFF(this.LL, anonymousClass0075.LL) && Intrinsics.LJFF(this.LLILLJJLI, anonymousClass0075.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, anonymousClass0075.LLILLL) && Intrinsics.LJFF(this.LLILZ, anonymousClass0075.LLILZ);
    }

    public final int hashCode() {
        Integer num = this.LL;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str = this.LLILZ;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> keyParams() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("has_photo_text", this.LL);
        linkedHashMap.put("is_photo_text_translatable", this.LLILLJJLI);
        linkedHashMap.put("is_photo_text_translated", this.LLILLL);
        linkedHashMap.put("photo_text_major_source_lang", this.LLILZ);
        return linkedHashMap;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PhotoTextItemParams(hasPhotoText=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", isPhotoTextTranslatable=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", isPhotoTextTranslated=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", photoTextMajorSourceLang=");
        sbLIZ.append(this.LLILZ);
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

    public AnonymousClass0075(Integer num, Integer num2, Integer num3, String str) {
        this.LL = num;
        this.LLILLJJLI = num2;
        this.LLILLL = num3;
        this.LLILZ = str;
    }
}
