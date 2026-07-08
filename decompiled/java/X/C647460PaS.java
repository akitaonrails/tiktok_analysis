package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PaS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C647460PaS implements InterfaceC1618170sD9<C647460PaS> {
    public final Map<String, String> LL;
    public final String LLILLJJLI;
    public final boolean LLILLL;
    public final String LLILZ;
    public final String LLILZIL;

    public C647460PaS() {
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
        if (!(obj instanceof C647460PaS)) {
            return false;
        }
        C647460PaS c647460PaS = (C647460PaS) obj;
        return Intrinsics.LJFF(this.LL, c647460PaS.LL) && Intrinsics.LJFF(this.LLILLJJLI, c647460PaS.LLILLJJLI) && this.LLILLL == c647460PaS.LLILLL && Intrinsics.LJFF(this.LLILZ, c647460PaS.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c647460PaS.LLILZIL);
    }

    public final int hashCode() {
        int iHashCode = ((((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + C786410Ut5.Z2(this.LLILLL)) * 31) + this.LLILZ.hashCode()) * 31;
        String str = this.LLILZIL;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> keyParams() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("extra_log_params", this.LL);
        linkedHashMap.put("enter_comment_id", this.LLILLJJLI);
        linkedHashMap.put("is_from_outside", Boolean.valueOf(this.LLILLL));
        linkedHashMap.put("is_from_photo", this.LLILZ);
        linkedHashMap.put("ls_attribution_params", this.LLILZIL);
        return linkedHashMap;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchEventState(extraLogParams=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", enterCommentId=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", isFromOutside=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", isFromPhoto=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", lsAttributionParams=");
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

    public /* synthetic */ C647460PaS(int i) {
        this("", "", null, C2097608Jq.LJ(), false);
    }

    public static C647460PaS LIZ(C647460PaS c647460PaS, String str, int i) {
        Map<String, String> map;
        String str2;
        boolean z;
        String str3 = str;
        String str4 = null;
        if ((i & 1) != 0) {
            map = c647460PaS.LL;
        } else {
            map = null;
        }
        if ((i & 2) != 0) {
            str2 = c647460PaS.LLILLJJLI;
        } else {
            str2 = null;
        }
        if ((i & 4) != 0) {
            z = c647460PaS.LLILLL;
        } else {
            z = false;
        }
        if ((i & 8) != 0) {
            str4 = c647460PaS.LLILZ;
        }
        if ((i & 16) != 0) {
            str3 = c647460PaS.LLILZIL;
        }
        c647460PaS.getClass();
        return new C647460PaS(str2, str4, str3, map, z);
    }

    public C647460PaS(String str, String str2, String str3, Map map, boolean z) {
        this.LL = map;
        this.LLILLJJLI = str;
        this.LLILLL = z;
        this.LLILZ = str2;
        this.LLILZIL = str3;
        C0P8T.LIZ();
    }
}
