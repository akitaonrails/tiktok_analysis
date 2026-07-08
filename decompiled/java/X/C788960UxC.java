package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0UxC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C788960UxC implements InterfaceC788970UxD {
    public final C869590Y9l LIZ;
    public final int LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C788960UxC)) {
            return false;
        }
        C788960UxC c788960UxC = (C788960UxC) obj;
        return Intrinsics.LJFF(this.LIZ, c788960UxC.LIZ) && this.LIZIZ == c788960UxC.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OnBind(message=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", position=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C788960UxC(C869590Y9l c869590Y9l, int i) {
        this.LIZ = c869590Y9l;
        this.LIZIZ = i;
    }
}
