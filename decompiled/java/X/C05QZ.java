package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.05QZ, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C05QZ {
    public final C05P1<Boolean> LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C05QZ) && Intrinsics.LJFF(this.LIZ, ((C05QZ) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DndState(isDoNotDisturbModeEnabled=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C05QZ(C05P0 c05p0) {
        this.LIZ = c05p0;
    }
}
