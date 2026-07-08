package X;

import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13A2, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13A2 implements InterfaceC1618180sDA<C13A2> {
    public final Set<String> LL;
    public final String LLILLJJLI;

    public C13A2() {
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
        if (!(obj instanceof C13A2)) {
            return false;
        }
        C13A2 c13a2 = (C13A2) obj;
        return Intrinsics.LJFF(this.LL, c13a2.LL) && Intrinsics.LJFF(this.LLILLJJLI, c13a2.LLILLJJLI);
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoDebounceRunState(debounceKeySet=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", sourceId=");
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

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> keyParams() {
        return C2097608Jq.LJ();
    }

    public /* synthetic */ C13A2(int i) {
        this(new LinkedHashSet(), UUID.randomUUID().toString());
    }

    public C13A2(Set<String> set, String str) {
        this.LL = set;
        this.LLILLJJLI = str;
    }
}
