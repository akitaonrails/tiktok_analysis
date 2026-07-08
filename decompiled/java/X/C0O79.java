package X;

import X.InterfaceC613710O5h;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0O79, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0O79<D extends InterfaceC613710O5h> extends C0O7A<D> {
    public final C613970O6h<D> LIZLLL;
    public final D LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0O79)) {
            return false;
        }
        C0O79 c0o79 = (C0O79) obj;
        return Intrinsics.LJFF(this.LIZLLL, c0o79.LIZLLL) && Intrinsics.LJFF(this.LJ, c0o79.LJ);
    }

    public final int hashCode() {
        return (this.LIZLLL.hashCode() * 31) + this.LJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MotaSuccess(req=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", data=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0O79(C613970O6h<D> c613970O6h, D d) {
        super(0);
        this.LIZLLL = c613970O6h;
        this.LJ = d;
    }
}
