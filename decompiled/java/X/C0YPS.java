package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0YPS, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YPS {
    public final C0Y8T LIZ;
    public final C869590Y9l LIZIZ;
    public final C0YC9 LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0YPS)) {
            return false;
        }
        C0YPS c0yps = (C0YPS) obj;
        return Intrinsics.LJFF(this.LIZ, c0yps.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0yps.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0yps.LIZJ);
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31;
        C0YC9 c0yc9 = this.LIZJ;
        return iHashCode + (c0yc9 == null ? 0 : c0yc9.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SendMessageResult(conversation=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", message=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", metrics=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0YPS(C0Y8T c0y8t, C869590Y9l c869590Y9l, C0YC9 c0yc9) {
        this.LIZ = c0y8t;
        this.LIZIZ = c869590Y9l;
        this.LIZJ = c0yc9;
    }
}
