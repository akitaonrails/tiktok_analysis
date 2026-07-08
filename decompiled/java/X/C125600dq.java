package X;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00dq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C125600dq implements InterfaceC0241006d {
    public final int LL;
    public final String LLILLJJLI;
    public final Integer LLILLL;
    public final Integer LLILZ;
    public final String LLILZIL;

    public C125600dq() {
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
        if (!(obj instanceof C125600dq)) {
            return false;
        }
        C125600dq c125600dq = (C125600dq) obj;
        return this.LL == c125600dq.LL && Intrinsics.LJFF(this.LLILLJJLI, c125600dq.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c125600dq.LLILLL) && Intrinsics.LJFF(this.LLILZ, c125600dq.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c125600dq.LLILZIL);
    }

    public final int hashCode() {
        int i = this.LL * 31;
        String str = this.LLILLJJLI;
        int iHashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.LLILLL;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.LLILZ;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.LLILZIL;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> keyParams() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("has_photo_title", Integer.valueOf(this.LL));
        linkedHashMap.put("photo_title_source_lang", this.LLILLJJLI);
        linkedHashMap.put("is_photo_title_translatable", this.LLILLL);
        linkedHashMap.put("is_photo_title_translated", this.LLILZ);
        linkedHashMap.put("photo_title_not_translated_reason", this.LLILZIL);
        return linkedHashMap;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VideoPlayPhotoTitleParams(hasPhotoTitle=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", photoTitleSourceLang=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", isPhotoTitleTranslatable=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", isPhotoTitleTranslated=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", photoTitleNotTranslatedReason=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> filteredParams() {
        if (!Intrinsics.LJFF(((LinkedHashMap) keyParams()).get("has_photo_title"), 1)) {
            return new HashMap();
        }
        HashMap map = new HashMap();
        map.putAll(keyParams());
        if (!Intrinsics.LJFF(((LinkedHashMap) keyParams()).get("is_photo_title_translatable"), 1)) {
            map.remove("is_photo_title_translatable");
        }
        return map;
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> getExtraParam() {
        return C2097608Jq.LJ();
    }

    public /* synthetic */ C125600dq(int i) {
        this(null, 0, null, null, null);
    }

    public C125600dq(String str, int i, Integer num, Integer num2, String str2) {
        this.LL = i;
        this.LLILLJJLI = str;
        this.LLILLL = num;
        this.LLILZ = num2;
        this.LLILZIL = str2;
    }
}
