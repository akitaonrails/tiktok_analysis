package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07t0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2003207t0 implements InterfaceC0148002o {
    public final Map<String, Boolean> LL;
    public final Map<String, Boolean> LLILLJJLI;

    public C2003207t0() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2003207t0)) {
            return false;
        }
        C2003207t0 c2003207t0 = (C2003207t0) obj;
        return Intrinsics.LJFF(this.LL, c2003207t0.LL) && Intrinsics.LJFF(this.LLILLJJLI, c2003207t0.LLILLJJLI);
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MinisInternalShareUserStatusState(contactRegionStatus=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", contactAgeStatus=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C2003207t0(int i) {
        this(C2097608Jq.LJ(), C2097608Jq.LJ());
    }

    public C2003207t0(Map<String, Boolean> map, Map<String, Boolean> map2) {
        this.LL = map;
        this.LLILLJJLI = map2;
    }
}
