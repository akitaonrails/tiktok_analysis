package X;

/* JADX INFO: renamed from: X.03FB, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03FB {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;

    public C03FB() {
        this(false, false, false, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C03FB)) {
            return false;
        }
        C03FB c03fb = (C03FB) obj;
        return this.LIZ == c03fb.LIZ && this.LIZIZ == c03fb.LIZIZ && this.LIZJ == c03fb.LIZJ && this.LIZLLL == c03fb.LIZLLL;
    }

    public final int hashCode() {
        return (((((C786410Ut5.Z2(this.LIZ) * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31) + C786410Ut5.Z2(this.LIZLLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BackgroundModel(isTopCorner=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isBottomCorner=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", isShowBg=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", isShowBottomLine=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C03FB(boolean z, boolean z2, boolean z3, boolean z4) {
        this.LIZ = z;
        this.LIZIZ = z2;
        this.LIZJ = z3;
        this.LIZLLL = z4;
    }
}
