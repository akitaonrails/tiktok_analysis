package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00vu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C237600vu {
    public final List<C20611915l7> LIZ;
    public final boolean LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C237600vu)) {
            return false;
        }
        C237600vu c237600vu = (C237600vu) obj;
        return Intrinsics.LJFF(this.LIZ, c237600vu.LIZ) && this.LIZIZ == c237600vu.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SugSearchResult(users=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", hasMore=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C237600vu(List<C20611915l7> list, boolean z) {
        this.LIZ = list;
        this.LIZIZ = z;
    }
}
