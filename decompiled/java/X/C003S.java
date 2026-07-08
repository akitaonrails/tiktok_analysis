package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.003S, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C003S implements InterfaceC0241006d {
    public final int LL;
    public final String LLILLJJLI;

    public C003S() {
        this(0, null);
    }

    @Override // X.InterfaceC1282004zy
    public final boolean checkExtraParamKey() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C003S)) {
            return false;
        }
        C003S c003s = (C003S) obj;
        return this.LL == c003s.LL && Intrinsics.LJFF(this.LLILLJJLI, c003s.LLILLJJLI);
    }

    public final int hashCode() {
        int i = this.LL * 31;
        String str = this.LLILLJJLI;
        return i + (str == null ? 0 : str.hashCode());
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> keyParams() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("subtitle_dnt_flag", Integer.valueOf(this.LL));
        linkedHashMap.put("subtitle_dnt_reason", this.LLILLJJLI);
        return linkedHashMap;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SubtitleDNTParams(subtitleDNTFlag=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", subtitleDNTReason=");
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

    public C003S(int i, String str) {
        this.LL = i;
        this.LLILLJJLI = str;
    }
}
