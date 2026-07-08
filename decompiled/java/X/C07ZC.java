package X;

/* JADX INFO: renamed from: X.07ZC, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07ZC implements InterfaceC935960aSo {
    public boolean LIZ;
    public final boolean LIZIZ;

    public C07ZC() {
        this(false, 3);
    }

    @Override // X.InterfaceC935960aSo
    public final void LIZLLL() {
        this.LIZ = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C07ZC)) {
            return false;
        }
        C07ZC c07zc = (C07ZC) obj;
        return this.LIZ == c07zc.LIZ && this.LIZIZ == c07zc.LIZIZ;
    }

    public final int hashCode() {
        return (C786410Ut5.Z2(this.LIZ) * 31) + C786410Ut5.Z2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NoSelectItem(selected=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", enable=");
        sbLIZ.append(this.LIZIZ);
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

    public C07ZC(boolean z, int i) {
        z = (i & 1) != 0 ? false : z;
        boolean z2 = (i & 2) != 0;
        this.LIZ = z;
        this.LIZIZ = z2;
    }
}
