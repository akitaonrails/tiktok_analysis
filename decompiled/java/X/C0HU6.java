package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0HU6, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HU6 implements InterfaceC19745512Nh {
    public final C1342130l1v LIZ;
    public final C1342130l1v LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0HU6)) {
            return false;
        }
        C0HU6 c0hu6 = (C0HU6) obj;
        return Intrinsics.LJFF(this.LIZ, c0hu6.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0hu6.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SpringParam(stiffness=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", damping=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0HU6(C1342130l1v c1342130l1v, C1342130l1v c1342130l1v2) {
        this.LIZ = c1342130l1v;
        this.LIZIZ = c1342130l1v2;
    }
}
