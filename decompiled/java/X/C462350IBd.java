package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0IBd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C462350IBd {
    public final C462360IBe LIZ;
    public final InterfaceC462330IBb LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C462350IBd)) {
            return false;
        }
        C462350IBd c462350IBd = (C462350IBd) obj;
        return Intrinsics.LJFF(this.LIZ, c462350IBd.LIZ) && Intrinsics.LJFF(this.LIZIZ, c462350IBd.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShareRepost(title=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", notes=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C462350IBd(C462360IBe c462360IBe, InterfaceC462330IBb interfaceC462330IBb) {
        this.LIZ = c462360IBe;
        this.LIZIZ = interfaceC462330IBb;
    }
}
