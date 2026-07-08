package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00I7, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00I7 implements InterfaceC0241006d {
    public final String LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final String LLILZIL;
    public final String LLILZLL;
    public final int LLIZ;
    public final int LLIZLLLIL;
    public final Integer LLJ;
    public final String LLJI;

    @Override // X.InterfaceC1282004zy
    public final boolean checkExtraParamKey() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C00I7)) {
            return false;
        }
        C00I7 c00i7 = (C00I7) obj;
        return Intrinsics.LJFF(this.LL, c00i7.LL) && Intrinsics.LJFF(this.LLILLJJLI, c00i7.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c00i7.LLILLL) && Intrinsics.LJFF(this.LLILZ, c00i7.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c00i7.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c00i7.LLILZLL) && this.LLIZ == c00i7.LLIZ && this.LLIZLLLIL == c00i7.LLIZLLLIL && Intrinsics.LJFF(this.LLJ, c00i7.LLJ) && Intrinsics.LJFF(this.LLJI, c00i7.LLJI);
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ.hashCode()) * 31) + this.LLILZIL.hashCode()) * 31) + this.LLILZLL.hashCode()) * 31) + this.LLIZ) * 31) + this.LLIZLLLIL) * 31;
        Integer num = this.LLJ;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.LLJI;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> keyParams() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("group_id", this.LL);
        linkedHashMap.put("user_id", this.LLILLJJLI);
        linkedHashMap.put("author_id", this.LLILLL);
        linkedHashMap.put("enter_from", this.LLILZ);
        linkedHashMap.put("item_duration", this.LLILZIL);
        linkedHashMap.put("target_lang", this.LLILZLL);
        linkedHashMap.put("is_author", Integer.valueOf(this.LLIZ));
        linkedHashMap.put("is_landscape_screen", Integer.valueOf(this.LLIZLLLIL));
        linkedHashMap.put("aweme_type", this.LLJ);
        linkedHashMap.put("player_session_id", this.LLJI);
        return linkedHashMap;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CommonParams(groupId=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", userId=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", authorId=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", enterFrom=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", itemDuration=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", targetLang=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", isAuthor=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", isLandscapeScreen=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(", awemeType=");
        sbLIZ.append(this.LLJ);
        sbLIZ.append(", playerSessionId=");
        sbLIZ.append(this.LLJI);
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

    public C00I7(String str, String str2, String str3, String str4, String str5, String str6, int i, int i2, Integer num, String str7) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = str4;
        this.LLILZIL = str5;
        this.LLILZLL = str6;
        this.LLIZ = i;
        this.LLIZLLLIL = i2;
        this.LLJ = num;
        this.LLJI = str7;
    }
}
