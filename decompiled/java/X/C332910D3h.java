package X;

/* JADX INFO: renamed from: X.0D3h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C332910D3h {
    public final int LIZ;
    public final int LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C332910D3h)) {
            return false;
        }
        C332910D3h c332910D3h = (C332910D3h) obj;
        return this.LIZ == c332910D3h.LIZ && this.LIZIZ == c332910D3h.LIZIZ && this.LIZJ == c332910D3h.LIZJ && this.LIZLLL == c332910D3h.LIZLLL && this.LJ == c332910D3h.LJ && this.LJFF == c332910D3h.LJFF;
    }

    public final int hashCode() {
        return (((((((((this.LIZ * 31) + this.LIZIZ) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31) + C786410Ut5.Z2(this.LJ)) * 31) + C786410Ut5.Z2(this.LJFF);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CheckoutValidationResult(selectedCount=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", requiredCount=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", hasInvalidSelection=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", isComplete=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", hasVariantId=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", isInStock=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean LIZ() {
        return this.LIZLLL && !this.LIZJ && this.LJ && this.LJFF;
    }

    public C332910D3h(boolean z, int i, int i2, boolean z2, boolean z3, boolean z4) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = z;
        this.LIZLLL = z2;
        this.LJ = z3;
        this.LJFF = z4;
    }
}
