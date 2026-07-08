package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yby, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1864200yby implements InterfaceC1618180sDA<C1864200yby> {
    public final String LL;
    public final String LLILLJJLI;
    public final String LLILLL;

    @Override // X.InterfaceC1282004zy
    public final boolean checkExtraParamKey() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1864200yby)) {
            return false;
        }
        C1864200yby c1864200yby = (C1864200yby) obj;
        return Intrinsics.LJFF(this.LL, c1864200yby.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1864200yby.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1864200yby.LLILLL);
    }

    public final int hashCode() {
        String str = this.LL;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LLILLJJLI;
        return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.LLILLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoSubConversationState(sessionId=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", sessionSource=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", sourceId=");
        sbLIZ.append(this.LLILLL);
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

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> keyParams() {
        return C2097608Jq.LJ();
    }

    public C1864200yby(String str, String str2, String str3) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
    }
}
