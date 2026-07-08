package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07xN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2030307xN extends AbstractC2030507xP {
    public final Throwable LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2030307xN) && Intrinsics.LJFF(this.LIZ, ((C2030307xN) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Error(throwable=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C2030307xN(Throwable th) {
        this.LIZ = th;
    }
}
