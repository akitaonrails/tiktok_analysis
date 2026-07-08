package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0tjU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1676660tjU {
    public final float LIZ;
    public final long LIZIZ;
    public final InterfaceC1675680thu<Float> LIZJ;

    public C1676660tjU() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1676660tjU)) {
            return false;
        }
        C1676660tjU c1676660tjU = (C1676660tjU) obj;
        return Float.compare(this.LIZ, c1676660tjU.LIZ) == 0 && C1676680tjW.LIZ(this.LIZIZ, c1676660tjU.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1676660tjU.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Scale(scale=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", transformOrigin=");
        sbLIZ.append((Object) C1676680tjW.LIZLLL(this.LIZIZ));
        sbLIZ.append(", animationSpec=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        int iFloatToIntBits = Float.floatToIntBits(this.LIZ) * 31;
        long j = this.LIZIZ;
        int i = C1676680tjW.LIZJ;
        return ((iFloatToIntBits + C786410Ut5.Y2(j)) * 31) + this.LIZJ.hashCode();
    }

    public C1676660tjU(float f, long j, InterfaceC1675680thu interfaceC1675680thu) {
        this.LIZ = f;
        this.LIZIZ = j;
        this.LIZJ = interfaceC1675680thu;
    }
}
