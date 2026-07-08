package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0IA0, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0IA0 extends C0IA2 {
    public final C0IA3 LIZJ;
    public final C0IA3 LIZLLL;

    public C0IA0() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0IA0)) {
            return false;
        }
        C0IA0 c0ia0 = (C0IA0) obj;
        return Intrinsics.LJFF(this.LIZJ, c0ia0.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c0ia0.LIZLLL);
    }

    public final int hashCode() {
        C0IA3 c0ia3 = this.LIZJ;
        int iHashCode = (c0ia3 == null ? 0 : c0ia3.hashCode()) * 31;
        C0IA3 c0ia32 = this.LIZLLL;
        return iHashCode + (c0ia32 != null ? c0ia32.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StackDirectly(topTask=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", midTask=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C0IA2
    public final C0IA3 LIZ() {
        return this.LIZLLL;
    }

    @Override // X.C0IA2
    public final C0IA3 LIZIZ() {
        return this.LIZJ;
    }

    public C0IA0(C0IA3 c0ia3, C0IA3 c0ia32) {
        this.LIZJ = c0ia3;
        this.LIZLLL = c0ia32;
    }
}
