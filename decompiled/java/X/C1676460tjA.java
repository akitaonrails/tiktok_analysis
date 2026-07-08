package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0tjA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1676460tjA extends AbstractC1676270tir {
    public final InterfaceC1680820tqC LLILZLL;
    public final long LLIZ;
    public final long LLIZLLLIL;
    public int LLJ;
    public final long LLJI;
    public float LLJIJIL;
    public C1685400txa LLJILJIL;

    @Override // X.AbstractC1676270tir
    public final long LJIIIIZZ() {
        return C1296570jqR.LIZIZ(this.LLJI);
    }

    public final int hashCode() {
        return (((((this.LLILZLL.hashCode() * 31) + C786410Ut5.Y2(this.LLIZ)) * 31) + C786410Ut5.Y2(this.LLIZLLLIL)) * 31) + this.LLJ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BitmapPainter(image=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", srcOffset=");
        sbLIZ.append((Object) C1676820tjk.LJFF(this.LLIZ));
        sbLIZ.append(", srcSize=");
        sbLIZ.append((Object) C1682900ttY.LIZLLL(this.LLIZLLLIL));
        sbLIZ.append(", filterQuality=");
        int i = this.LLJ;
        sbLIZ.append((Object) (i == 0 ? "None" : i == 1 ? "Low" : i == 2 ? "Medium" : i == 3 ? "High" : "Unknown"));
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1676460tjA(InterfaceC1680820tqC interfaceC1680820tqC) {
        this(interfaceC1680820tqC, 0L, (((long) interfaceC1680820tqC.getWidth()) << 32) | (((long) interfaceC1680820tqC.getHeight()) & 4294967295L));
    }

    @Override // X.AbstractC1676270tir
    public final boolean LIZ(float f) {
        this.LLJIJIL = f;
        return true;
    }

    @Override // X.AbstractC1676270tir
    public final boolean LIZIZ(C1685400txa c1685400txa) {
        this.LLJILJIL = c1685400txa;
        return true;
    }

    @Override // X.AbstractC1676270tir
    public final void LJIIIZ(InterfaceC1675870tiD interfaceC1675870tiD) {
        InterfaceC1680820tqC interfaceC1680820tqC = this.LLILZLL;
        long j = this.LLIZ;
        long j2 = this.LLIZLLLIL;
        int iRound = Math.round(Float.intBitsToFloat((int) (interfaceC1675870tiD.LIZIZ() >> 32)));
        C1675860tiC.LJ(interfaceC1675870tiD, interfaceC1680820tqC, j, j2, (((long) Math.round(Float.intBitsToFloat((int) (interfaceC1675870tiD.LIZIZ() & 4294967295L)))) & 4294967295L) | (((long) iRound) << 32), this.LLJIJIL, this.LLJILJIL, this.LLJ, 328);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1676460tjA)) {
            return false;
        }
        C1676460tjA c1676460tjA = (C1676460tjA) obj;
        if (Intrinsics.LJFF(this.LLILZLL, c1676460tjA.LLILZLL) && C1676820tjk.LIZIZ(this.LLIZ, c1676460tjA.LLIZ) && C1682900ttY.LIZIZ(this.LLIZLLLIL, c1676460tjA.LLIZLLLIL) && this.LLJ == c1676460tjA.LLJ) {
            return true;
        }
        return false;
    }

    public C1676460tjA(InterfaceC1680820tqC interfaceC1680820tqC, long j, long j2) {
        int i;
        int i2;
        this.LLILZLL = interfaceC1680820tqC;
        this.LLIZ = j;
        this.LLIZLLLIL = j2;
        this.LLJ = 1;
        if (((int) (j >> 32)) >= 0 && C1676820tjk.LIZJ(j) >= 0 && (i = (int) (j2 >> 32)) >= 0 && (i2 = (int) (4294967295L & j2)) >= 0 && i <= interfaceC1680820tqC.getWidth() && i2 <= interfaceC1680820tqC.getHeight()) {
            this.LLJI = j2;
            this.LLJIJIL = 1.0f;
        } else {
            "Failed requirement.".toString();
            throw new IllegalArgumentException("Failed requirement.");
        }
    }
}
