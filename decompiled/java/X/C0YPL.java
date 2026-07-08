package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0YPL, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YPL implements InterfaceC873750YPl {
    public final C0Y8T LIZ;
    public final C869590Y9l LIZIZ;
    public final C0YC9 LIZJ = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0YPL)) {
            return false;
        }
        C0YPL c0ypl = (C0YPL) obj;
        return Intrinsics.LJFF(this.LIZ, c0ypl.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0ypl.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0ypl.LIZJ);
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31;
        C0YC9 c0yc9 = this.LIZJ;
        return iHashCode + (c0yc9 == null ? 0 : c0yc9.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Succeeded(conversation=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", message=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", metrics=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0YPL(C0Y8T c0y8t, C869590Y9l c869590Y9l) {
        this.LIZ = c0y8t;
        this.LIZIZ = c869590Y9l;
    }
}
