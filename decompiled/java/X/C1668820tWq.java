package X;

/* JADX INFO: renamed from: X.0tWq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1668820tWq extends AbstractC1676270tir {
    public final long LLILZLL;
    public C1685400txa LLIZLLLIL;
    public float LLIZ = 1.0f;
    public final long LLJ = 9205357640488583168L;

    public final int hashCode() {
        return C1685910tyP.LJIIJ(this.LLILZLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ColorPainter(color=");
        sbLIZ.append((Object) C1685910tyP.LJIIJJI(this.LLILZLL));
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1676270tir
    public final long LJIIIIZZ() {
        return this.LLJ;
    }

    public C1668820tWq(long j) {
        this.LLILZLL = j;
    }

    @Override // X.AbstractC1676270tir
    public final boolean LIZ(float f) {
        this.LLIZ = f;
        return true;
    }

    @Override // X.AbstractC1676270tir
    public final boolean LIZIZ(C1685400txa c1685400txa) {
        this.LLIZLLLIL = c1685400txa;
        return true;
    }

    @Override // X.AbstractC1676270tir
    public final void LJIIIZ(InterfaceC1675870tiD interfaceC1675870tiD) {
        C1675860tiC.LJIIJ(interfaceC1675870tiD, this.LLILZLL, 0L, 0L, this.LLIZ, null, this.LLIZLLLIL, 0, 86);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C1668820tWq) && C1685910tyP.LJ(this.LLILZLL, ((C1668820tWq) obj).LLILZLL)) {
            return true;
        }
        return false;
    }
}
