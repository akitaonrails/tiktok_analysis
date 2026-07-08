package X;

/* JADX INFO: renamed from: X.0uEp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1696090uEp {
    public final float LIZ;
    public final float LIZIZ;
    public final float LIZJ;
    public final float LIZLLL;
    public final boolean LJ = true;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1696090uEp)) {
            return false;
        }
        C1696090uEp c1696090uEp = (C1696090uEp) obj;
        return C1668650tWZ.LIZJ(this.LIZ, c1696090uEp.LIZ) && C1668650tWZ.LIZJ(this.LIZIZ, c1696090uEp.LIZIZ) && C1668650tWZ.LIZJ(this.LIZJ, c1696090uEp.LIZJ) && C1668650tWZ.LIZJ(this.LIZLLL, c1696090uEp.LIZLLL) && this.LJ == c1696090uEp.LJ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DpTouchBoundsExpansion(start=");
        sbLIZ.append((Object) C1668650tWZ.LJFF(this.LIZ));
        sbLIZ.append(", top=");
        sbLIZ.append((Object) C1668650tWZ.LJFF(this.LIZIZ));
        sbLIZ.append(", end=");
        sbLIZ.append((Object) C1668650tWZ.LJFF(this.LIZJ));
        sbLIZ.append(", bottom=");
        sbLIZ.append((Object) C1668650tWZ.LJFF(this.LIZLLL));
        sbLIZ.append(", isLayoutDirectionAware=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return (((((((Float.floatToIntBits(this.LIZ) * 31) + Float.floatToIntBits(this.LIZIZ)) * 31) + Float.floatToIntBits(this.LIZJ)) * 31) + Float.floatToIntBits(this.LIZLLL)) * 31) + C786410Ut5.Z2(this.LJ);
    }

    public final long LIZ(InterfaceC1690500u5o interfaceC1690500u5o) {
        return C20082313ht.LIZ(interfaceC1690500u5o.LJLLJ(this.LIZ), interfaceC1690500u5o.LJLLJ(this.LIZIZ), interfaceC1690500u5o.LJLLJ(this.LIZJ), interfaceC1690500u5o.LJLLJ(this.LIZLLL), this.LJ);
    }

    public C1696090uEp(float f, float f2, float f3, float f4) {
        this.LIZ = f;
        this.LIZIZ = f2;
        this.LIZJ = f3;
        this.LIZLLL = f4;
        if (f < 0.0f) {
            C1696250uF5.LIZ("Left must be non-negative");
        }
        if (f2 < 0.0f) {
            C1696250uF5.LIZ("Top must be non-negative");
        }
        if (f3 < 0.0f) {
            C1696250uF5.LIZ("Right must be non-negative");
        }
        if (f4 < 0.0f) {
            C1696250uF5.LIZ("Bottom must be non-negative");
        }
    }
}
