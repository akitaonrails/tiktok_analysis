package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wHJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1774510wHJ {
    public final C1774740wHg LIZ;
    public final C1774520wHK LIZIZ;
    public final C1774520wHK LIZJ;
    public final Integer LIZLLL;
    public final Integer LJ;

    public final int hashCode() {
        int iHashCode = ((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31;
        Integer num = this.LIZLLL;
        int iIntValue = (iHashCode + (num != null ? num.intValue() : 0)) * 31;
        Integer num2 = this.LJ;
        return iIntValue + (num2 != null ? num2.intValue() : 0);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1774510wHJ) {
            C1774510wHJ c1774510wHJ = (C1774510wHJ) obj;
            if (Intrinsics.LJFF(this.LIZ, c1774510wHJ.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1774510wHJ.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1774510wHJ.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1774510wHJ.LIZLLL) && Intrinsics.LJFF(this.LJ, c1774510wHJ.LJ)) {
                return true;
            }
            return false;
        }
        return super.equals(obj);
    }

    public C1774510wHJ(C1774740wHg c1774740wHg, C1774520wHK c1774520wHK, C1774520wHK c1774520wHK2, Integer num, Integer num2) {
        this.LIZ = c1774740wHg;
        this.LIZIZ = c1774520wHK;
        this.LIZJ = c1774520wHK2;
        this.LIZLLL = num;
        this.LJ = num2;
    }
}
