package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.014d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2737014d implements InterfaceC0241006d {
    public final String LL;
    public final int LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final String LLILZIL;
    public final int LLILZLL;
    public final String LLIZ;
    public final Integer LLIZLLLIL;
    public final Integer LLJ;

    @Override // X.InterfaceC1282004zy
    public final boolean checkExtraParamKey() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2737014d)) {
            return false;
        }
        C2737014d c2737014d = (C2737014d) obj;
        return Intrinsics.LJFF(this.LL, c2737014d.LL) && this.LLILLJJLI == c2737014d.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c2737014d.LLILLL) && Intrinsics.LJFF(this.LLILZ, c2737014d.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c2737014d.LLILZIL) && this.LLILZLL == c2737014d.LLILZLL && Intrinsics.LJFF(this.LLIZ, c2737014d.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c2737014d.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c2737014d.LLJ);
    }

    public final int hashCode() {
        int iHashCode = ((((((((((this.LL.hashCode() * 31) + this.LLILLJJLI) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ.hashCode()) * 31) + this.LLILZIL.hashCode()) * 31) + this.LLILZLL) * 31;
        String str = this.LLIZ;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.LLIZLLLIL;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.LLJ;
        return iHashCode3 + (num2 != null ? num2.hashCode() : 0);
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> keyParams() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("enter_from", this.LL);
        linkedHashMap.put("aweme_type", Integer.valueOf(this.LLILLJJLI));
        linkedHashMap.put("group_id", this.LLILLL);
        linkedHashMap.put("enter_method", this.LLILZ);
        linkedHashMap.put("auto_trans_status", this.LLILZIL);
        linkedHashMap.put("entrance_pos", Integer.valueOf(this.LLILZLL));
        linkedHashMap.put("target_language", this.LLIZ);
        linkedHashMap.put("has_dubbing", this.LLIZLLLIL);
        linkedHashMap.put("is_dubbed", this.LLJ);
        return linkedHashMap;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TranslationButtonShowParams(enterFrom=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", awemeType=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", groupId=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", enterMethod=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", autoTransStatus=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", entrancePos=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", targetLanguage=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", hasDubbing=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(", isDubbed=");
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

    public C2737014d(String str, int i, String str2, Integer num, Integer num2, int i2, String str3, String str4, String str5) {
        this.LL = str;
        this.LLILLJJLI = i;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = str4;
        this.LLILZLL = i2;
        this.LLIZ = str5;
        this.LLIZLLLIL = num;
        this.LLJ = num2;
    }
}
