package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.014e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2738014e implements InterfaceC0241006d {
    public final String LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final Integer LLILZ;
    public final Integer LLILZIL;

    @Override // X.InterfaceC1282004zy
    public final boolean checkExtraParamKey() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2738014e)) {
            return false;
        }
        C2738014e c2738014e = (C2738014e) obj;
        return Intrinsics.LJFF(this.LL, c2738014e.LL) && Intrinsics.LJFF(this.LLILLJJLI, c2738014e.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c2738014e.LLILLL) && Intrinsics.LJFF(this.LLILZ, c2738014e.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c2738014e.LLILZIL);
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        String str = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.LLILZ;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.LLILZIL;
        return iHashCode4 + (num2 != null ? num2.hashCode() : 0);
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> keyParams() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("action_type", this.LL);
        linkedHashMap.put("auto_trans_status", this.LLILLJJLI);
        linkedHashMap.put("target_language", this.LLILLL);
        linkedHashMap.put("has_dubbing", this.LLILZ);
        linkedHashMap.put("is_dubbed", this.LLILZIL);
        return linkedHashMap;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ClickSeeTranslationParams(actionType=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", autoTransStatus=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", targetLanguage=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", hasDubbing=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", isDubbed=");
        sbLIZ.append(this.LLILZIL);
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

    public /* synthetic */ C2738014e(String str, String str2) {
        this(str, str2, null, null, null);
    }

    public C2738014e(String str, String str2, String str3, Integer num, Integer num2) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = num;
        this.LLILZIL = num2;
    }
}
