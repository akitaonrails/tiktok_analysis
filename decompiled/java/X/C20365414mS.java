package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.14mS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20365414mS implements InterfaceC20365314mR, InterfaceC951240arS<Object> {
    public final C20361214lm LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final String LJ;
    public final boolean LJFF;
    public final boolean LJI;
    public final EnumC20429514wn LJII;
    public final boolean LJIIIIZZ;
    public String LJIIIZ;
    public int LJIIJ;
    public int LJIIJJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20365414mS)) {
            return false;
        }
        C20365414mS c20365414mS = (C20365414mS) obj;
        return Intrinsics.LJFF(this.LIZ, c20365414mS.LIZ) && this.LIZIZ == c20365414mS.LIZIZ && this.LIZJ == c20365414mS.LIZJ && this.LIZLLL == c20365414mS.LIZLLL && Intrinsics.LJFF(this.LJ, c20365414mS.LJ) && this.LJFF == c20365414mS.LJFF && this.LJI == c20365414mS.LJI && this.LJII == c20365414mS.LJII && this.LJIIIIZZ == c20365414mS.LJIIIIZZ && Intrinsics.LJFF(this.LJIIIZ, c20365414mS.LJIIIZ) && this.LJIIJ == c20365414mS.LJIIJ && this.LJIIJJI == c20365414mS.LJIIJJI;
    }

    public final int hashCode() {
        int iHashCode = ((((((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31) + this.LIZJ) * 31) + this.LIZLLL) * 31;
        String str = this.LJ;
        return ((((((((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + C786410Ut5.Z2(this.LJFF)) * 31) + C786410Ut5.Z2(this.LJI)) * 31) + this.LJII.hashCode()) * 31) + C786410Ut5.Z2(this.LJIIIIZZ)) * 31) + this.LJIIIZ.hashCode()) * 31) + this.LJIIJ) * 31) + this.LJIIJJI;
    }

    public final String toString() {
        return "PlaybookDetailTaskModel(playbookTask=" + this.LIZ + ", taskListSize=" + this.LIZIZ + ", taskIndex=" + this.LIZJ + ", stepIndex=" + this.LIZLLL + ", conditionText=" + this.LJ + ", isHighLightRunning=" + this.LJFF + ", isDecorationStepRunning=" + this.LJI + ", taskDecorationState=" + this.LJII + ", isShowStepDecorationItem=" + this.LJIIIIZZ + ", group=" + this.LJIIIZ + ", groupIndex=" + this.LJIIJ + ", color=" + this.LJIIJJI + ')';
    }

    public final C20365414mS LJIIIZ() {
        return new C20365414mS(this.LIZ.LIZ(), this.LIZIZ, this.LIZJ, this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ, this.LJIIJJI);
    }

    @Override // X.InterfaceC20365314mR
    public final int LIZJ() {
        return this.LJIIJ;
    }

    @Override // X.InterfaceC20365314mR
    public final C20361214lm LJFF() {
        return this.LIZ;
    }

    @Override // X.InterfaceC20365314mR
    public final String LJI() {
        return this.LJIIIZ;
    }

    @Override // X.InterfaceC20365314mR
    public final void LIZ(int i) {
        this.LJIIJJI = i;
    }

    @Override // X.InterfaceC951240arS
    public final boolean LIZIZ(Object obj) {
        return Intrinsics.LJFF(obj, this);
    }

    @Override // X.InterfaceC20365314mR
    public final void LJ(int i) {
        this.LJIIJ = i;
    }

    @Override // X.InterfaceC951240arS
    public final boolean LJII(Object obj) {
        return obj instanceof C20365414mS;
    }

    @Override // X.InterfaceC20365314mR
    public final void LJIIIIZZ(String str) {
        this.LJIIIZ = str;
    }

    public /* synthetic */ C20365414mS(C20361214lm c20361214lm, int i, int i2, int i3, String str, boolean z, boolean z2, EnumC20429514wn enumC20429514wn, boolean z3, int i4) {
        this(c20361214lm, i, i2, i3, (i4 & 16) != 0 ? null : str, (i4 & 32) != 0 ? false : z, (i4 & 64) != 0 ? false : z2, (i4 & 128) != 0 ? EnumC20429514wn.IDLE : enumC20429514wn, (i4 & 256) != 0 ? false : z3, (i4 & 512) != 0 ? "" : null, 0, 0);
    }

    public C20365414mS(C20361214lm c20361214lm, int i, int i2, int i3, String str, boolean z, boolean z2, EnumC20429514wn enumC20429514wn, boolean z3, String str2, int i4, int i5) {
        this.LIZ = c20361214lm;
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = i3;
        this.LJ = str;
        this.LJFF = z;
        this.LJI = z2;
        this.LJII = enumC20429514wn;
        this.LJIIIIZZ = z3;
        this.LJIIIZ = str2;
        this.LJIIJ = i4;
        this.LJIIJJI = i5;
    }
}
