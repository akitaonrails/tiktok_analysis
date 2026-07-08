package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.016d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2789016d implements InterfaceC0241006d {
    public Integer LL;
    public String LLILLJJLI;
    public String LLILLL;
    public String LLILZ;

    public C2789016d() {
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
        if (!(obj instanceof C2789016d)) {
            return false;
        }
        C2789016d c2789016d = (C2789016d) obj;
        return Intrinsics.LJFF(this.LL, c2789016d.LL) && Intrinsics.LJFF(this.LLILLJJLI, c2789016d.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c2789016d.LLILLL) && Intrinsics.LJFF(this.LLILZ, c2789016d.LLILZ);
    }

    public final int hashCode() {
        Integer num = this.LL;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LLILZ;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> keyParams() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("text_sticker_length", this.LL);
        linkedHashMap.put("text_sticker_not_translatable_reason", this.LLILLJJLI);
        linkedHashMap.put("text_sticker_not_translated_reason", this.LLILLL);
        linkedHashMap.put("translate_sticker_status", this.LLILZ);
        return linkedHashMap;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VideoPlayStickerExtraParams(textStickerLength=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", textStickerNotTranslatableReason=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", textStickerNotTranslatedReason=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", translateStickerStatus=");
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

    public C2789016d(int i) {
        this.LL = null;
        this.LLILLJJLI = null;
        this.LLILLL = null;
        this.LLILZ = null;
    }
}
