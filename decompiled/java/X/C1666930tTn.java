package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0tTn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1666930tTn implements InterfaceC1673420teG {
    public final float LIZ;
    public final float LIZIZ;
    public final float LIZJ;
    public final C1693430uAX LIZLLL;
    public final float LJ;
    public final float LJFF;
    public final InterfaceC1679150tnV LJI;
    public final float LJII;

    public final int hashCode() {
        return (((((((((((((Float.floatToIntBits(this.LIZ) * 31) + Float.floatToIntBits(this.LIZIZ)) * 31) + Float.floatToIntBits(this.LIZJ)) * 31) + this.LIZLLL.hashCode()) * 31) + Float.floatToIntBits(this.LJ)) * 31) + Float.floatToIntBits(this.LJFF)) * 31) + this.LJI.hashCode()) * 31) + Float.floatToIntBits(this.LJII);
    }

    @Override // X.InterfaceC1673420teG
    public final float LIZ() {
        return this.LJFF;
    }

    @Override // X.InterfaceC1673420teG
    public final float LIZIZ() {
        return this.LIZ;
    }

    @Override // X.InterfaceC1673420teG
    public final InterfaceC1679150tnV LIZJ() {
        return this.LJI;
    }

    @Override // X.InterfaceC1673420teG
    public final float LIZLLL() {
        return this.LJII;
    }

    @Override // X.InterfaceC1673420teG
    public final C1693430uAX LJ() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC1673420teG
    public final float LJFF() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC1673420teG
    public final float LJI() {
        return this.LJ;
    }

    @Override // X.InterfaceC1673420teG
    public final float LJII() {
        return this.LIZJ;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1666930tTn.class != obj.getClass()) {
            return false;
        }
        C1666930tTn c1666930tTn = (C1666930tTn) obj;
        if (C1668650tWZ.LIZJ(this.LIZ, c1666930tTn.LIZ) && C1668650tWZ.LIZJ(this.LIZIZ, c1666930tTn.LIZIZ) && C1668650tWZ.LIZJ(this.LIZJ, c1666930tTn.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1666930tTn.LIZLLL) && C1668650tWZ.LIZJ(this.LJ, c1666930tTn.LJ) && C1668650tWZ.LIZJ(this.LJFF, c1666930tTn.LJFF) && Intrinsics.LJFF(this.LJI, c1666930tTn.LJI) && C1668650tWZ.LIZJ(this.LJII, c1666930tTn.LJII)) {
            return true;
        }
        return false;
    }

    public C1666930tTn(float f, float f2, float f3, C1693430uAX c1693430uAX, float f4, float f5, InterfaceC1679150tnV interfaceC1679150tnV, float f6) {
        this.LIZ = f;
        this.LIZIZ = f2;
        this.LIZJ = f3;
        this.LIZLLL = c1693430uAX;
        this.LJ = f4;
        this.LJFF = f5;
        this.LJI = interfaceC1679150tnV;
        this.LJII = f6;
    }
}
