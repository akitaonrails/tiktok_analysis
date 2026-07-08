package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ENZ, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0ENZ extends AbstractC363520ENa {
    public final C0ENU LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0ENZ) && Intrinsics.LJFF(this.LIZ, ((C0ENZ) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LinearMask(baseData=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC363520ENa
    public final C0ENU LIZ() {
        return this.LIZ;
    }

    public C0ENZ(C0ENU c0enu) {
        this.LIZ = c0enu;
    }
}
