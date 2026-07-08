package X;

import X.InterfaceC613710O5h;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0O77, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0O77<D extends InterfaceC613710O5h> extends C0O7B<D> {
    public final C613970O6h<D> LJ;
    public final C614090O6t LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0O77)) {
            return false;
        }
        C0O77 c0o77 = (C0O77) obj;
        return Intrinsics.LJFF(this.LJ, c0o77.LJ) && Intrinsics.LJFF(this.LJFF, c0o77.LJFF);
    }

    public final int hashCode() {
        return (this.LJ.hashCode() * 31) + this.LJFF.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MotaMerge(r=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", e=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0O77(C613970O6h<D> c613970O6h, C614090O6t c614090O6t) {
        super(c614090O6t);
        this.LJ = c613970O6h;
        this.LJFF = c614090O6t;
    }
}
