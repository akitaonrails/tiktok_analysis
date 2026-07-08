package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZOY, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZOY implements C0ZOW {
    public final C14IR LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0ZOY) && Intrinsics.LJFF(this.LIZ, ((C0ZOY) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Single(slot=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0ZOY(C14IR c14ir) {
        this.LIZ = c14ir;
    }
}
