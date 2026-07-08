package X;

/* JADX INFO: renamed from: X.0tyw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1686240tyw {
    public final boolean LIZ;
    public final long LIZIZ;
    public final EnumC1427820nG8 LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1686240tyw)) {
            return false;
        }
        C1686240tyw c1686240tyw = (C1686240tyw) obj;
        return this.LIZ == c1686240tyw.LIZ && C1685910tyP.LJ(this.LIZIZ, c1686240tyw.LIZIZ) && this.LIZJ == c1686240tyw.LIZJ;
    }

    public final int hashCode() {
        return (((C786410Ut5.Z2(this.LIZ) * 31) + C1685910tyP.LJIIJ(this.LIZIZ)) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BarStyle(show=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", color=");
        sbLIZ.append((Object) C1685910tyP.LJIIJJI(this.LIZIZ));
        sbLIZ.append(", darkFont=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1686240tyw(long j) {
        EnumC1427820nG8 enumC1427820nG8 = EnumC1427820nG8.Auto;
        this.LIZ = true;
        this.LIZIZ = j;
        this.LIZJ = enumC1427820nG8;
    }
}
