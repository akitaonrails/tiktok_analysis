package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.016l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2797016l implements InterfaceC0241006d {
    public final Integer LL;
    public final Integer LLILLJJLI;
    public final Integer LLILLL;
    public final String LLILZ;

    public C2797016l() {
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
        if (!(obj instanceof C2797016l)) {
            return false;
        }
        C2797016l c2797016l = (C2797016l) obj;
        return Intrinsics.LJFF(this.LL, c2797016l.LL) && Intrinsics.LJFF(this.LLILLJJLI, c2797016l.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c2797016l.LLILLL) && Intrinsics.LJFF(this.LLILZ, c2797016l.LLILZ);
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
        linkedHashMap.put("is_photo_text_translatable_currentphoto", this.LL);
        linkedHashMap.put("has_photo_text_currentphoto", this.LLILLJJLI);
        linkedHashMap.put("pic_location", this.LLILLL);
        linkedHashMap.put("photo_text_source_lang_currentphoto", this.LLILZ);
        return linkedHashMap;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PhotoTextSlideParams(isPhotoTextTranslatable=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", hasPhotoText=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", picLocation=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", photoTextSourceLang=");
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

    public C2797016l(Integer num, Integer num2, Integer num3, String str) {
        this.LL = num;
        this.LLILLJJLI = num2;
        this.LLILLL = num3;
        this.LLILZ = str;
    }
}
