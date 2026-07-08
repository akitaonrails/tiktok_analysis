package X;

/* JADX INFO: renamed from: X.0tqP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1680950tqP extends AbstractC1668700tWe {
    public final long LIZIZ;

    public final int hashCode() {
        return C1685910tyP.LJIIJ(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SolidColor(value=");
        sbLIZ.append((Object) C1685910tyP.LJIIJJI(this.LIZIZ));
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1680950tqP(long j) {
        this.LIZIZ = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C1680950tqP) && C1685910tyP.LJ(this.LIZIZ, ((C1680950tqP) obj).LIZIZ)) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC1668700tWe
    public final void LIZ(float f, long j, InterfaceC1695240uDS interfaceC1695240uDS) {
        long jLIZJ;
        interfaceC1695240uDS.setAlpha(1.0f);
        if (f == 1.0f) {
            jLIZJ = this.LIZIZ;
        } else {
            long j2 = this.LIZIZ;
            jLIZJ = C1685910tyP.LIZJ(C1685910tyP.LJFF(j2) * f, j2);
        }
        interfaceC1695240uDS.LJIIIZ(jLIZJ);
        if (interfaceC1695240uDS.LJIILJJIL() != null) {
            interfaceC1695240uDS.LJIILL(null);
        }
    }
}
