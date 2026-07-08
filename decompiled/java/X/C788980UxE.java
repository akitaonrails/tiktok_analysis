package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0UxE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C788980UxE implements InterfaceC788970UxD {
    public final C869590Y9l LIZ;
    public final int LIZIZ;
    public final boolean LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C788980UxE)) {
            return false;
        }
        C788980UxE c788980UxE = (C788980UxE) obj;
        return Intrinsics.LJFF(this.LIZ, c788980UxE.LIZ) && this.LIZIZ == c788980UxE.LIZIZ && this.LIZJ == c788980UxE.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31) + C786410Ut5.Z2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OnVisibleToTheUser(message=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", position=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", isFirstVisible=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C788980UxE(C869590Y9l c869590Y9l, int i, boolean z) {
        this.LIZ = c869590Y9l;
        this.LIZIZ = i;
        this.LIZJ = z;
    }
}
