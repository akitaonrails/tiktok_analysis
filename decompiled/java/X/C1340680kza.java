package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0kza, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1340680kza implements InterfaceC1704540uSS {
    public final C09AE LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1340680kza) && Intrinsics.LJFF(this.LIZ, ((C1340680kza) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DrainFinished(job=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1340680kza(C09AE c09ae) {
        this.LIZ = c09ae;
    }
}
