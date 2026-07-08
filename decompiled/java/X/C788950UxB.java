package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0UxB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C788950UxB implements InterfaceC788970UxD {
    public final C869590Y9l LIZ;
    public final int LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C788950UxB)) {
            return false;
        }
        C788950UxB c788950UxB = (C788950UxB) obj;
        return Intrinsics.LJFF(this.LIZ, c788950UxB.LIZ) && this.LIZIZ == c788950UxB.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OnAttachedToWindow(message=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", position=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C788950UxB(C869590Y9l c869590Y9l, int i) {
        this.LIZ = c869590Y9l;
        this.LIZIZ = i;
    }
}
