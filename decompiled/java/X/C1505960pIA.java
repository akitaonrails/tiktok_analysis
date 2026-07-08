package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0pIA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1505960pIA {
    public final EnumC1486630omz LIZ;
    public final EnumC1486630omz LIZIZ;
    public final String LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;
    public final C1505980pIC LJFF;
    public final C1505980pIC LJI;
    public final C1505980pIC LJII;
    public final int LJIIIIZZ;
    public final int LJIIIZ;
    public final int LJIIJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1505960pIA)) {
            return false;
        }
        C1505960pIA c1505960pIA = (C1505960pIA) obj;
        return this.LIZ == c1505960pIA.LIZ && this.LIZIZ == c1505960pIA.LIZIZ && Intrinsics.LJFF(this.LIZJ, c1505960pIA.LIZJ) && this.LIZLLL == c1505960pIA.LIZLLL && this.LJ == c1505960pIA.LJ && Intrinsics.LJFF(this.LJFF, c1505960pIA.LJFF) && Intrinsics.LJFF(this.LJI, c1505960pIA.LJI) && Intrinsics.LJFF(this.LJII, c1505960pIA.LJII) && this.LJIIIIZZ == c1505960pIA.LJIIIIZZ && this.LJIIIZ == c1505960pIA.LJIIIZ && this.LJIIJ == c1505960pIA.LJIIJ;
    }

    public final int hashCode() {
        return (((((((((((((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31) + C786410Ut5.Z2(this.LJ)) * 31) + this.LJFF.hashCode()) * 31) + this.LJI.hashCode()) * 31) + this.LJII.hashCode()) * 31) + this.LJIIIIZZ) * 31) + this.LJIIIZ) * 31) + this.LJIIJ;
    }

    public final String toString() {
        return "CategoryResult(category=" + this.LIZ + ", baseCategory=" + this.LIZIZ + ", changeReason=" + this.LIZJ + ", pendingDowngraded=" + this.LIZLLL + ", pendingIncluded=" + this.LJ + ", imgTputMetric=" + this.LJFF + ", apiTtfbMetric=" + this.LJI + ", pendingMetric=" + this.LJII + ", imgTputCount=" + this.LJIIIIZZ + ", apiTtfbCount=" + this.LJIIIZ + ", pendingCount=" + this.LJIIJ + ')';
    }

    public C1505960pIA(EnumC1486630omz enumC1486630omz, EnumC1486630omz enumC1486630omz2, String str, boolean z, boolean z2, C1505980pIC c1505980pIC, C1505980pIC c1505980pIC2, C1505980pIC c1505980pIC3, int i, int i2, int i3) {
        this.LIZ = enumC1486630omz;
        this.LIZIZ = enumC1486630omz2;
        this.LIZJ = str;
        this.LIZLLL = z;
        this.LJ = z2;
        this.LJFF = c1505980pIC;
        this.LJI = c1505980pIC2;
        this.LJII = c1505980pIC3;
        this.LJIIIIZZ = i;
        this.LJIIIZ = i2;
        this.LJIIJ = i3;
    }
}
