package X;

import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04vT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1254104vT extends AbstractC1254204vU {
    public final Map<String, String> LIZ;
    public final Set<String> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1254104vT)) {
            return false;
        }
        C1254104vT c1254104vT = (C1254104vT) obj;
        return Intrinsics.LJFF(this.LIZ, c1254104vT.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1254104vT.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MutateHeaders(updates=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", removals=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1254104vT() {
        this(C2097608Jq.LJ(), C08CX.INSTANCE);
    }

    public C1254104vT(Map<String, String> map, Set<String> set) {
        this.LIZ = map;
        this.LIZIZ = set;
    }
}
