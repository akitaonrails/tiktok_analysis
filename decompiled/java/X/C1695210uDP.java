package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0uDP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1695210uDP extends AbstractC1695860uES {
    public static final /* synthetic */ int LJFF = 0;
    public final float LIZ;
    public final float LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final InterfaceC1669090tXH LJ;

    public final int hashCode() {
        int iFloatToIntBits = ((((((Float.floatToIntBits(this.LIZ) * 31) + Float.floatToIntBits(this.LIZIZ)) * 31) + this.LIZJ) * 31) + this.LIZLLL) * 31;
        InterfaceC1669090tXH interfaceC1669090tXH = this.LJ;
        return iFloatToIntBits + (interfaceC1669090tXH != null ? interfaceC1669090tXH.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Stroke(width=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", miter=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", cap=");
        sbLIZ.append((Object) C1695600uE2.LIZ(this.LIZJ));
        sbLIZ.append(", join=");
        int i = this.LIZLLL;
        sbLIZ.append((Object) (i == 0 ? "Miter" : i == 1 ? "Round" : i == 2 ? "Bevel" : "Unknown"));
        sbLIZ.append(", pathEffect=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1695210uDP)) {
            return false;
        }
        C1695210uDP c1695210uDP = (C1695210uDP) obj;
        if (this.LIZ == c1695210uDP.LIZ && this.LIZIZ == c1695210uDP.LIZIZ && this.LIZJ == c1695210uDP.LIZJ && this.LIZLLL == c1695210uDP.LIZLLL && Intrinsics.LJFF(this.LJ, c1695210uDP.LJ)) {
            return true;
        }
        return false;
    }

    public C1695210uDP(float f, float f2, int i, int i2, C1669080tXG c1669080tXG, int i3) {
        f = (i3 & 1) != 0 ? 0.0f : f;
        f2 = (i3 & 2) != 0 ? 4.0f : f2;
        i = (i3 & 4) != 0 ? 0 : i;
        i2 = (i3 & 8) != 0 ? 0 : i2;
        c1669080tXG = (i3 & 16) != 0 ? null : c1669080tXG;
        this.LIZ = f;
        this.LIZIZ = f2;
        this.LIZJ = i;
        this.LIZLLL = i2;
        this.LJ = c1669080tXG;
    }
}
