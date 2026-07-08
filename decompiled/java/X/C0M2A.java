package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0M2A, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0M2A {
    public final AbstractC561800M1q LIZ;
    public final List<C0M0P> LIZIZ;
    public final long LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0M2A)) {
            return false;
        }
        C0M2A c0m2a = (C0M2A) obj;
        return Intrinsics.LJFF(this.LIZ, c0m2a.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0m2a.LIZIZ) && this.LIZJ == c0m2a.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Y2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DraftOrganizerSection(bucket=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", items=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", totalBytes=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0M2A(AbstractC561800M1q abstractC561800M1q, List<C0M0P> list, long j) {
        this.LIZ = abstractC561800M1q;
        this.LIZIZ = list;
        this.LIZJ = j;
    }
}
