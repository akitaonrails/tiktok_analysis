package X;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04ws, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1262804ws implements InterfaceC702960Rhm {
    public final long LIZ;
    public final Set<String> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1262804ws)) {
            return false;
        }
        C1262804ws c1262804ws = (C1262804ws) obj;
        return this.LIZ == c1262804ws.LIZ && Intrinsics.LJFF(this.LIZIZ, c1262804ws.LIZIZ);
    }

    public final int hashCode() {
        return (C786410Ut5.Y2(this.LIZ) * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StartExecute(executeId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", slotIds=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1262804ws(long j, Set<String> set) {
        this.LIZ = j;
        this.LIZIZ = set;
    }
}
