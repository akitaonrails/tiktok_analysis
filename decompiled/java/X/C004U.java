package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.004U, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C004U implements InterfaceC0241006d {
    public final String LL;
    public final String LLILLJJLI;

    @Override // X.InterfaceC1282004zy
    public final boolean checkExtraParamKey() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C004U)) {
            return false;
        }
        C004U c004u = (C004U) obj;
        return Intrinsics.LJFF(this.LL, c004u.LL) && Intrinsics.LJFF(this.LLILLJJLI, c004u.LLILLJJLI);
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        String str = this.LLILLJJLI;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> keyParams() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("enter_method", this.LL);
        linkedHashMap.put("captions_unavailable_reason", this.LLILLJJLI);
        return linkedHashMap;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CaptionSheetParams(enterMethod=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", captionUnavailableReason=");
        sbLIZ.append(this.LLILLJJLI);
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

    public C004U(String str, String str2) {
        this.LL = str;
        this.LLILLJJLI = str2;
    }
}
