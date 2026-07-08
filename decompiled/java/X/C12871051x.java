package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.051x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C12871051x {
    public final InterfaceC1921807fs LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C12871051x) && Intrinsics.LJFF(this.LIZ, ((C12871051x) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IdentifierParsed(left=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C12871051x(InterfaceC1921807fs interfaceC1921807fs) {
        this.LIZ = interfaceC1921807fs;
    }
}
