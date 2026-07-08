package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0YQY, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YQY implements InterfaceC873750YPl {
    public final C0Y8T LIZ;
    public final C869590Y9l LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0YQY)) {
            return false;
        }
        C0YQY c0yqy = (C0YQY) obj;
        return Intrinsics.LJFF(this.LIZ, c0yqy.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0yqy.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MessageAdded(conversation=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", message=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0YQY(C0Y8T c0y8t, C869590Y9l c869590Y9l) {
        this.LIZ = c0y8t;
        this.LIZIZ = c869590Y9l;
    }
}
