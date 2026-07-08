package X;

/* JADX INFO: renamed from: X.0tsx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1682530tsx implements InterfaceC1679150tnV {
    public final float LIZ;
    public final float LIZIZ;
    public final float LIZJ;
    public final float LIZLLL;

    public final int hashCode() {
        return (((((Float.floatToIntBits(this.LIZ) * 31) + Float.floatToIntBits(this.LIZIZ)) * 31) + Float.floatToIntBits(this.LIZJ)) * 31) + Float.floatToIntBits(this.LIZLLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PaddingValues(start=");
        sbLIZ.append((Object) C1668650tWZ.LJFF(this.LIZ));
        sbLIZ.append(", top=");
        sbLIZ.append((Object) C1668650tWZ.LJFF(this.LIZIZ));
        sbLIZ.append(", end=");
        sbLIZ.append((Object) C1668650tWZ.LJFF(this.LIZJ));
        sbLIZ.append(", bottom=");
        sbLIZ.append((Object) C1668650tWZ.LJFF(this.LIZLLL));
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1679150tnV
    public final float LIZIZ() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC1679150tnV
    public final float LIZLLL() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC1679150tnV
    public final float LIZ(EnumC1671200tag enumC1671200tag) {
        if (enumC1671200tag == EnumC1671200tag.Ltr) {
            return this.LIZ;
        }
        return this.LIZJ;
    }

    @Override // X.InterfaceC1679150tnV
    public final float LIZJ(EnumC1671200tag enumC1671200tag) {
        if (enumC1671200tag == EnumC1671200tag.Ltr) {
            return this.LIZJ;
        }
        return this.LIZ;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1682530tsx)) {
            return false;
        }
        C1682530tsx c1682530tsx = (C1682530tsx) obj;
        if (!C1668650tWZ.LIZJ(this.LIZ, c1682530tsx.LIZ) || !C1668650tWZ.LIZJ(this.LIZIZ, c1682530tsx.LIZIZ) || !C1668650tWZ.LIZJ(this.LIZJ, c1682530tsx.LIZJ) || !C1668650tWZ.LIZJ(this.LIZLLL, c1682530tsx.LIZLLL)) {
            return false;
        }
        return true;
    }

    public C1682530tsx(float f, float f2, float f3, float f4) {
        boolean z;
        boolean z2;
        boolean z3;
        this.LIZ = f;
        this.LIZIZ = f2;
        this.LIZJ = f3;
        this.LIZLLL = f4;
        if (f >= 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (f2 >= 0.0f) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z4 = z & z2;
        if (f3 >= 0.0f) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!(z4 & z3 & (f4 >= 0.0f))) {
            C1679560toA.LIZ("Padding must be non-negative");
        }
    }
}
