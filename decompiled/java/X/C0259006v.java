package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.006v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0259006v implements InterfaceC0241006d {
    public final String LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;

    @Override // X.InterfaceC1282004zy
    public final boolean checkExtraParamKey() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0259006v)) {
            return false;
        }
        C0259006v c0259006v = (C0259006v) obj;
        return Intrinsics.LJFF(this.LL, c0259006v.LL) && Intrinsics.LJFF(this.LLILLJJLI, c0259006v.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c0259006v.LLILLL) && Intrinsics.LJFF(this.LLILZ, c0259006v.LLILZ);
    }

    public final int hashCode() {
        String str = this.LL;
        int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.LLILLJJLI.hashCode()) * 31;
        String str2 = this.LLILLL;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LLILZ;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> keyParams() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("enter_method", this.LL);
        linkedHashMap.put("target_lang", this.LLILLJJLI);
        linkedHashMap.put("bio_card_lang", this.LLILLL);
        linkedHashMap.put("enter_from", this.LLILZ);
        return linkedHashMap;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BioTranslationParams(enterMethod=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", targetLang=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", bioCardLang=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", enterFrom=");
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

    public C0259006v(String str, String str2, String str3, String str4) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = str4;
    }
}
