package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.01gQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C396401gQ extends AbstractC401801hI {
    public final boolean LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C396401gQ)) {
            return false;
        }
        C396401gQ c396401gQ = (C396401gQ) obj;
        return this.LIZ == c396401gQ.LIZ && Intrinsics.LJFF(this.LIZIZ, c396401gQ.LIZIZ);
    }

    public final int hashCode() {
        return (C786410Ut5.Z2(this.LIZ) * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FetchError(noAvailableData=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", errorMsg=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C396401gQ(boolean z, String str) {
        this.LIZ = z;
        this.LIZIZ = str;
    }
}
