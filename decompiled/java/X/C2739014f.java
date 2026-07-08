package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.014f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2739014f implements InterfaceC0241006d {
    public final int LL;
    public final int LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;

    public C2739014f() {
        this(0, 0, "na", null);
    }

    @Override // X.InterfaceC1282004zy
    public final boolean checkExtraParamKey() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2739014f)) {
            return false;
        }
        C2739014f c2739014f = (C2739014f) obj;
        return this.LL == c2739014f.LL && this.LLILLJJLI == c2739014f.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c2739014f.LLILLL) && Intrinsics.LJFF(this.LLILZ, c2739014f.LLILZ);
    }

    public final int hashCode() {
        int iHashCode = ((((this.LL * 31) + this.LLILLJJLI) * 31) + this.LLILLL.hashCode()) * 31;
        String str = this.LLILZ;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> keyParams() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("has_dubbing", Integer.valueOf(this.LL));
        linkedHashMap.put("is_dubbed", Integer.valueOf(this.LLILLJJLI));
        linkedHashMap.put("dubbing_language", this.LLILLL);
        linkedHashMap.put("dub_model", this.LLILZ);
        return linkedHashMap;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DubbingParams(hasDubbing=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", isDubbed=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", dubbingLanguage=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", dubbingModel=");
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

    public C2739014f(int i, int i2, String str, String str2) {
        this.LL = i;
        this.LLILLJJLI = i2;
        this.LLILLL = str;
        this.LLILZ = str2;
    }
}
