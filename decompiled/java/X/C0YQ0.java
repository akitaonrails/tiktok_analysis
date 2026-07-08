package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0YQ0, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YQ0 implements InterfaceC873750YPl {
    public final C0Y8T LIZ;
    public final C869590Y9l LIZIZ;
    public final C0YPQ LIZJ;
    public final C0YC9 LIZLLL = null;
    public final String LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0YQ0)) {
            return false;
        }
        C0YQ0 c0yq0 = (C0YQ0) obj;
        return Intrinsics.LJFF(this.LIZ, c0yq0.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0yq0.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0yq0.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c0yq0.LIZLLL) && Intrinsics.LJFF(this.LJ, c0yq0.LJ);
    }

    public final int hashCode() {
        C0Y8T c0y8t = this.LIZ;
        int iHashCode = (c0y8t == null ? 0 : c0y8t.hashCode()) * 31;
        C869590Y9l c869590Y9l = this.LIZIZ;
        int iHashCode2 = (((iHashCode + (c869590Y9l == null ? 0 : c869590Y9l.hashCode())) * 31) + this.LIZJ.hashCode()) * 31;
        C0YC9 c0yc9 = this.LIZLLL;
        int iHashCode3 = (iHashCode2 + (c0yc9 == null ? 0 : c0yc9.hashCode())) * 31;
        String str = this.LJ;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Failed(conversation=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", message=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", error=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", metrics=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", messageUuid=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0YQ0(C0Y8T c0y8t, C869590Y9l c869590Y9l, C0YPQ c0ypq, String str) {
        this.LIZ = c0y8t;
        this.LIZIZ = c869590Y9l;
        this.LIZJ = c0ypq;
        this.LJ = str;
    }
}
