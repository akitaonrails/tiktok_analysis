package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.050V, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C050V {
    public final boolean LIZ;
    public final InterfaceC1177904jB LIZIZ;
    public final InterfaceC1177904jB LIZJ;

    public C050V() {
        this(7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C050V)) {
            return false;
        }
        C050V c050v = (C050V) obj;
        return this.LIZ == c050v.LIZ && Intrinsics.LJFF(this.LIZIZ, c050v.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c050v.LIZJ);
    }

    public final int hashCode() {
        return (((C786410Ut5.Z2(this.LIZ) * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TabletBottomControlBarModel(visible=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", leftRail=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", rightRail=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C050V(int i) {
        boolean z;
        C050W c050w;
        if ((i & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        if ((i & 2) != 0) {
            c050w = C050W.LIZ;
        } else {
            c050w = null;
        }
        this(z, c050w, (i & 4) != 0 ? C050W.LIZ : null);
    }

    public C050V(boolean z, InterfaceC1177904jB interfaceC1177904jB, InterfaceC1177904jB interfaceC1177904jB2) {
        this.LIZ = z;
        this.LIZIZ = interfaceC1177904jB;
        this.LIZJ = interfaceC1177904jB2;
    }
}
