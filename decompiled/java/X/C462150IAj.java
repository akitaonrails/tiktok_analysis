package X;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0IAj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C462150IAj implements InterfaceC0148002o {
    public final LinkedHashSet<String> LL;
    public final Set<String> LLILLJJLI;

    public C462150IAj() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C462150IAj)) {
            return false;
        }
        C462150IAj c462150IAj = (C462150IAj) obj;
        return Intrinsics.LJFF(this.LL, c462150IAj.LL) && Intrinsics.LJFF(this.LLILLJJLI, c462150IAj.LLILLJJLI);
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ReEditUIState(reportedUuids=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", expiredUuids=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C462150IAj(int i) {
        this(new LinkedHashSet(), C08CX.INSTANCE);
    }

    public C462150IAj(LinkedHashSet<String> linkedHashSet, Set<String> set) {
        this.LL = linkedHashSet;
        this.LLILLJJLI = set;
    }
}
