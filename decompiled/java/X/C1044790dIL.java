package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0dIL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1044790dIL extends AbstractC1044870dIT {
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1044790dIL) && Intrinsics.LJFF(this.LIZ, ((C1044790dIL) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Failure(message=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1044790dIL(String str) {
        this.LIZ = str;
    }
}
