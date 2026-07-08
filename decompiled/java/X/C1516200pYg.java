package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0pYg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1516200pYg extends AbstractC1516230pYj {
    public final Throwable LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1516200pYg) && Intrinsics.LJFF(this.LIZ, ((C1516200pYg) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Failure(throwable=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1516200pYg(Throwable th) {
        this.LIZ = th;
    }
}
