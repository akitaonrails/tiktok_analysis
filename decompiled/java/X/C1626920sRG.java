package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0sRG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1626920sRG {
    public final boolean LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final InterfaceC1626470sQX LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1626920sRG)) {
            return false;
        }
        C1626920sRG c1626920sRG = (C1626920sRG) obj;
        return this.LIZ == c1626920sRG.LIZ && this.LIZIZ == c1626920sRG.LIZIZ && this.LIZJ == c1626920sRG.LIZJ && Intrinsics.LJFF(this.LIZLLL, c1626920sRG.LIZLLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CarouselElementLoading(isLoading=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", progress=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", loadingPosition=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", slipEffect=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1626920sRG(boolean z, int i, int i2, InterfaceC1626470sQX interfaceC1626470sQX) {
        this.LIZ = z;
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = interfaceC1626470sQX;
    }
}
