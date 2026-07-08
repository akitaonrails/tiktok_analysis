package X;

/* JADX INFO: renamed from: X.0aSd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C935850aSd implements InterfaceC935960aSo {
    public boolean LIZ = false;
    public boolean LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public boolean LJ;

    @Override // X.InterfaceC935960aSo
    public final void LIZLLL() {
        this.LIZ = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C935850aSd)) {
            return false;
        }
        C935850aSd c935850aSd = (C935850aSd) obj;
        return this.LIZ == c935850aSd.LIZ && this.LIZIZ == c935850aSd.LIZIZ && this.LIZJ == c935850aSd.LIZJ && this.LIZLLL == c935850aSd.LIZLLL && this.LJ == c935850aSd.LJ;
    }

    public final int hashCode() {
        return (((((((C786410Ut5.Z2(this.LIZ) * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31) + C786410Ut5.Z2(this.LJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CustomizeItem(selected=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", enable=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", upToMax=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", generateRunning=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", needAnimation=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC935960aSo
    public final boolean LIZJ() {
        return this.LIZ;
    }

    @Override // X.InterfaceC935960aSo
    public final boolean getEnable() {
        return this.LIZIZ;
    }

    public C935850aSd(boolean z, boolean z2, boolean z3, boolean z4) {
        this.LIZIZ = z;
        this.LIZJ = z2;
        this.LIZLLL = z3;
        this.LJ = z4;
    }
}
