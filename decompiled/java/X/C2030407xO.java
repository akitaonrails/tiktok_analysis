package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07xO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2030407xO extends AbstractC2030507xP {
    public final String LIZ;

    public C2030407xO() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2030407xO) && Intrinsics.LJFF(this.LIZ, ((C2030407xO) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NoGroupLink(msg=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C2030407xO(int i) {
        this.LIZ = "not group link";
    }
}
