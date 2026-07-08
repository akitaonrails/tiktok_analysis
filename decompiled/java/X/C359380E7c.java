package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0E7c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C359380E7c {
    public final C0E80 LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;

    public C359380E7c() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C359380E7c)) {
            return false;
        }
        C359380E7c c359380E7c = (C359380E7c) obj;
        return Intrinsics.LJFF(this.LIZ, c359380E7c.LIZ) && this.LIZIZ == c359380E7c.LIZIZ && this.LIZJ == c359380E7c.LIZJ && this.LIZLLL == c359380E7c.LIZLLL;
    }

    public final int hashCode() {
        return (((((this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31) + C786410Ut5.Z2(this.LIZLLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TrackOperateState(active=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isClipping=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", isDraggingMainTrack=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", isScaling=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C359380E7c(int i) {
        this(new C0E80(0), false, false, false);
    }

    public C359380E7c(C0E80 c0e80, boolean z, boolean z2, boolean z3) {
        this.LIZ = c0e80;
        this.LIZIZ = z;
        this.LIZJ = z2;
        this.LIZLLL = z3;
    }

    public static C359380E7c LIZ(C359380E7c c359380E7c, C0E80 c0e80, boolean z, boolean z2, boolean z3, int i) {
        if ((i & 1) != 0) {
            c0e80 = c359380E7c.LIZ;
        }
        if ((i & 2) != 0) {
            z = c359380E7c.LIZIZ;
        }
        if ((i & 4) != 0) {
            z2 = c359380E7c.LIZJ;
        }
        if ((i & 8) != 0) {
            z3 = c359380E7c.LIZLLL;
        }
        c359380E7c.getClass();
        return new C359380E7c(c0e80, z, z2, z3);
    }
}
