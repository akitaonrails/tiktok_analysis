package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yUx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1859850yUx {
    public final int LIZ;
    public final int LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final InterfaceC1859200yTu LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1859850yUx)) {
            return false;
        }
        C1859850yUx c1859850yUx = (C1859850yUx) obj;
        return this.LIZ == c1859850yUx.LIZ && this.LIZIZ == c1859850yUx.LIZIZ && Intrinsics.LJFF(this.LIZJ, c1859850yUx.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1859850yUx.LIZLLL) && Intrinsics.LJFF(this.LJ, c1859850yUx.LJ);
    }

    public final int hashCode() {
        return (((((((this.LIZ * 31) + this.LIZIZ) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CachedWidget(startIndex=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", endIndex=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", dataType=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", dataValue=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", widget=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1859850yUx(int i, int i2, String str, String str2, InterfaceC1859200yTu interfaceC1859200yTu) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = str;
        this.LIZLLL = str2;
        this.LJ = interfaceC1859200yTu;
    }
}
