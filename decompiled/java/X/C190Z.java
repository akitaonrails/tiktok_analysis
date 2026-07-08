package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.190Z, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C190Z implements InterfaceC214749192l {
    public final int LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final Integer LIZLLL;
    public final AbstractC861810XrP LJ;
    public final int LJFF;
    public final AbstractC861810XrP LJI;
    public final boolean LJII;
    public final Boolean LJIIIIZZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C190Z)) {
            return false;
        }
        C190Z c190z = (C190Z) obj;
        return this.LIZ == c190z.LIZ && this.LIZIZ == c190z.LIZIZ && this.LIZJ == c190z.LIZJ && Intrinsics.LJFF(this.LIZLLL, c190z.LIZLLL) && Intrinsics.LJFF(this.LJ, c190z.LJ) && this.LJFF == c190z.LJFF && Intrinsics.LJFF(this.LJI, c190z.LJI) && this.LJII == c190z.LJII && Intrinsics.LJFF(this.LJIIIIZZ, c190z.LJIIIIZZ);
    }

    public final int hashCode() {
        int iZ2 = ((((this.LIZ * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31;
        Integer num = this.LIZLLL;
        int iHashCode = (((((iZ2 + (num == null ? 0 : num.hashCode())) * 31) + this.LJ.hashCode()) * 31) + this.LJFF) * 31;
        AbstractC861810XrP abstractC861810XrP = this.LJI;
        int iHashCode2 = (((iHashCode + (abstractC861810XrP == null ? 0 : abstractC861810XrP.hashCode())) * 31) + C786410Ut5.Z2(this.LJII)) * 31;
        Boolean bool = this.LJIIIIZZ;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SwitcherCellPublishOptionStates(visibility=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isEnabled=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", showAlertBadge=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", prefixIconRes=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", titleString=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", titleMaxLines=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", subtitleString=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", isChecked=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", withSeparator=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC214749192l
    public final Integer LIZ() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC214749192l
    public final int LIZIZ() {
        return this.LJFF;
    }

    @Override // X.InterfaceC214749192l
    public final AbstractC861810XrP LIZJ() {
        return this.LJI;
    }

    @Override // X.InterfaceC214749192l
    public final AbstractC861810XrP LIZLLL() {
        return this.LJ;
    }

    @Override // X.InterfaceC214749192l
    public final boolean LJ() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC214749192l
    public final Boolean LJI() {
        return this.LJIIIIZZ;
    }

    @Override // X.InterfaceC214749192l
    public final int getVisibility() {
        return this.LIZ;
    }

    @Override // X.InterfaceC214749192l
    public final boolean isChecked() {
        return this.LJII;
    }

    @Override // X.InterfaceC214749192l
    public final boolean isEnabled() {
        return this.LIZIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C190Z(Integer num, int i, CharSequence charSequence, boolean z, boolean z2) {
        C861800XrO c861800XrO;
        C861820XrQ c861820XrQ = new C861820XrQ(i);
        if (charSequence != null) {
            c861800XrO = new C861800XrO(charSequence);
        } else {
            c861800XrO = null;
        }
        this(0, z2, 0 == true ? 1 : 0, num, c861820XrQ, c861800XrO, z, 293);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C190Z(Integer num, String str, CharSequence charSequence, boolean z, boolean z2) {
        C861800XrO c861800XrO;
        C861800XrO c861800XrO2 = new C861800XrO(str);
        if (charSequence != null) {
            c861800XrO = new C861800XrO(charSequence);
        } else {
            c861800XrO = null;
        }
        this(0, z2, 0 == true ? 1 : 0, num, c861800XrO2, c861800XrO, z, 293);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C190Z(Integer num, String str, CharSequence charSequence, boolean z, int i) {
        boolean z2;
        charSequence = (i & 4) != 0 ? null : charSequence;
        if ((i & 16) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this(num, str, charSequence, z, z2);
    }

    public C190Z(boolean z, int i, boolean z2, boolean z3, Integer num, Integer num2) {
        C861820XrQ c861820XrQ;
        C861820XrQ c861820XrQ2 = new C861820XrQ(i);
        if (num2 != null) {
            c861820XrQ = new C861820XrQ(num2.intValue());
        } else {
            c861820XrQ = null;
        }
        this(0, z2, z3, num, c861820XrQ2, c861820XrQ, z, 289);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C190Z(boolean z, int i, boolean z2, Integer num, Integer num2, int i2) {
        boolean z3 = z2;
        this(z, i, (i2 & 16) != 0 ? true : z3, false, num, (i2 & 4) != 0 ? null : num2);
    }

    public static C190Z LJFF(C190Z c190z, int i, boolean z, boolean z2, AbstractC861810XrP abstractC861810XrP, boolean z3, int i2) {
        Integer num;
        AbstractC861810XrP abstractC861810XrP2;
        int i3;
        int i4 = i;
        boolean z4 = z3;
        AbstractC861810XrP abstractC861810XrP3 = abstractC861810XrP;
        boolean z5 = z2;
        boolean z6 = z;
        if ((i2 & 1) != 0) {
            i4 = c190z.LIZ;
        }
        if ((i2 & 2) != 0) {
            z6 = c190z.LIZIZ;
        }
        if ((i2 & 4) != 0) {
            z5 = c190z.LIZJ;
        }
        Boolean bool = null;
        if ((i2 & 8) != 0) {
            num = c190z.LIZLLL;
        } else {
            num = null;
        }
        if ((i2 & 16) != 0) {
            abstractC861810XrP2 = c190z.LJ;
        } else {
            abstractC861810XrP2 = null;
        }
        if ((i2 & 32) != 0) {
            i3 = c190z.LJFF;
        } else {
            i3 = 0;
        }
        if ((i2 & 64) != 0) {
            abstractC861810XrP3 = c190z.LJI;
        }
        if ((i2 & 128) != 0) {
            z4 = c190z.LJII;
        }
        if ((i2 & 256) != 0) {
            bool = c190z.LJIIIIZZ;
        }
        c190z.getClass();
        return new C190Z(i4, z6, z5, num, abstractC861810XrP2, i3, abstractC861810XrP3, z4, bool);
    }

    public /* synthetic */ C190Z(int i, boolean z, boolean z2, Integer num, AbstractC861810XrP abstractC861810XrP, AbstractC861810XrP abstractC861810XrP2, boolean z3, int i2) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? true : z, (i2 & 4) != 0 ? false : z2, num, abstractC861810XrP, (i2 & 32) != 0 ? Integer.MAX_VALUE : 0, (i2 & 64) != 0 ? null : abstractC861810XrP2, z3, null);
    }

    public C190Z(int i, boolean z, boolean z2, Integer num, AbstractC861810XrP abstractC861810XrP, int i2, AbstractC861810XrP abstractC861810XrP2, boolean z3, Boolean bool) {
        this.LIZ = i;
        this.LIZIZ = z;
        this.LIZJ = z2;
        this.LIZLLL = num;
        this.LJ = abstractC861810XrP;
        this.LJFF = i2;
        this.LJI = abstractC861810XrP2;
        this.LJII = z3;
        this.LJIIIIZZ = bool;
    }
}
