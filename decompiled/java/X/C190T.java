package X;

import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.190T, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C190T implements InterfaceC214754192q {
    public final int LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final Integer LIZLLL;
    public final AbstractC861810XrP LJ;
    public final int LJFF;
    public final AbstractC861810XrP LJI;
    public final CharSequence LJII;
    public final Boolean LJIIIIZZ;
    public final Drawable LJIIIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C190T)) {
            return false;
        }
        C190T c190t = (C190T) obj;
        return this.LIZ == c190t.LIZ && this.LIZIZ == c190t.LIZIZ && this.LIZJ == c190t.LIZJ && Intrinsics.LJFF(this.LIZLLL, c190t.LIZLLL) && Intrinsics.LJFF(this.LJ, c190t.LJ) && this.LJFF == c190t.LJFF && Intrinsics.LJFF(this.LJI, c190t.LJI) && Intrinsics.LJFF(this.LJII, c190t.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c190t.LJIIIIZZ) && Intrinsics.LJFF(this.LJIIIZ, c190t.LJIIIZ);
    }

    public final int hashCode() {
        int iZ2 = ((((this.LIZ * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31;
        Integer num = this.LIZLLL;
        int iHashCode = (((((iZ2 + (num == null ? 0 : num.hashCode())) * 31) + this.LJ.hashCode()) * 31) + this.LJFF) * 31;
        AbstractC861810XrP abstractC861810XrP = this.LJI;
        int iHashCode2 = (iHashCode + (abstractC861810XrP == null ? 0 : abstractC861810XrP.hashCode())) * 31;
        CharSequence charSequence = this.LJII;
        int iHashCode3 = (iHashCode2 + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        Boolean bool = this.LJIIIIZZ;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Drawable drawable = this.LJIIIZ;
        return iHashCode4 + (drawable != null ? drawable.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DisclosureCellPublishOptionStates(visibility=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isEnabled=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", showAlertBadge=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", iconRes=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", titleString=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", titleMaxLines=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", subtitleString=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", label=");
        sbLIZ.append((Object) this.LJII);
        sbLIZ.append(", withSeparator=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(", background=");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC214754192q
    public final Integer LIZ() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC214754192q
    public final int LIZIZ() {
        return this.LJFF;
    }

    @Override // X.InterfaceC214754192q
    public final AbstractC861810XrP LIZJ() {
        return this.LJI;
    }

    @Override // X.InterfaceC214754192q
    public final AbstractC861810XrP LIZLLL() {
        return this.LJ;
    }

    @Override // X.InterfaceC214754192q
    public final boolean LJ() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC214754192q
    public final Drawable LJFF() {
        return this.LJIIIZ;
    }

    @Override // X.InterfaceC214754192q
    public final Boolean LJI() {
        return this.LJIIIIZZ;
    }

    @Override // X.InterfaceC214754192q
    public final CharSequence getLabel() {
        return this.LJII;
    }

    @Override // X.InterfaceC214754192q
    public final int getVisibility() {
        return this.LIZ;
    }

    @Override // X.InterfaceC214754192q
    public final boolean isEnabled() {
        return this.LIZIZ;
    }

    public C190T(int i, Integer num, AbstractC861810XrP abstractC861810XrP, Integer num2, CharSequence charSequence, int i2, int i3) {
        int i4 = i2;
        CharSequence charSequence2 = charSequence;
        AbstractC861810XrP c861820XrQ = null;
        num = (i3 & 2) != 0 ? null : num;
        abstractC861810XrP = (i3 & 4) != 0 ? null : abstractC861810XrP;
        charSequence2 = (i3 & 16) != 0 ? null : charSequence2;
        i4 = (i3 & 32) != 0 ? 0 : i4;
        Drawable drawable = null;
        C861820XrQ c861820XrQ2 = new C861820XrQ(i);
        if (abstractC861810XrP == null) {
            if (num != null) {
                c861820XrQ = new C861820XrQ(num.intValue());
            }
        } else {
            c861820XrQ = abstractC861810XrP;
        }
        this(i4, false, num2, c861820XrQ2, c861820XrQ, charSequence2, drawable, 294);
    }

    public /* synthetic */ C190T(int i, boolean z, Integer num, C861820XrQ c861820XrQ, AbstractC861810XrP abstractC861810XrP, CharSequence charSequence, Drawable drawable, int i2) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? true : z, false, (i2 & 8) != 0 ? null : num, c861820XrQ, (i2 & 32) != 0 ? Integer.MAX_VALUE : 0, (i2 & 64) != 0 ? null : abstractC861810XrP, (i2 & 128) != 0 ? null : charSequence, null, (i2 & 512) == 0 ? drawable : null);
    }

    public static C190T LJII(C190T c190t, int i, boolean z, boolean z2, AbstractC861810XrP abstractC861810XrP, CharSequence charSequence, Drawable drawable, int i2) {
        Integer num;
        AbstractC861810XrP abstractC861810XrP2;
        int i3;
        int i4 = i;
        CharSequence charSequence2 = charSequence;
        AbstractC861810XrP abstractC861810XrP3 = abstractC861810XrP;
        Drawable drawable2 = drawable;
        boolean z3 = z2;
        boolean z4 = z;
        if ((i2 & 1) != 0) {
            i4 = c190t.LIZ;
        }
        if ((i2 & 2) != 0) {
            z4 = c190t.LIZIZ;
        }
        if ((i2 & 4) != 0) {
            z3 = c190t.LIZJ;
        }
        Boolean bool = null;
        if ((i2 & 8) != 0) {
            num = c190t.LIZLLL;
        } else {
            num = null;
        }
        if ((i2 & 16) != 0) {
            abstractC861810XrP2 = c190t.LJ;
        } else {
            abstractC861810XrP2 = null;
        }
        if ((i2 & 32) != 0) {
            i3 = c190t.LJFF;
        } else {
            i3 = 0;
        }
        if ((i2 & 64) != 0) {
            abstractC861810XrP3 = c190t.LJI;
        }
        if ((i2 & 128) != 0) {
            charSequence2 = c190t.LJII;
        }
        if ((i2 & 256) != 0) {
            bool = c190t.LJIIIIZZ;
        }
        if ((i2 & 512) != 0) {
            drawable2 = c190t.LJIIIZ;
        }
        c190t.getClass();
        return new C190T(i4, z4, z3, num, abstractC861810XrP2, i3, abstractC861810XrP3, charSequence2, bool, drawable2);
    }

    public C190T(int i, boolean z, boolean z2, Integer num, AbstractC861810XrP abstractC861810XrP, int i2, AbstractC861810XrP abstractC861810XrP2, CharSequence charSequence, Boolean bool, Drawable drawable) {
        this.LIZ = i;
        this.LIZIZ = z;
        this.LIZJ = z2;
        this.LIZLLL = num;
        this.LJ = abstractC861810XrP;
        this.LJFF = i2;
        this.LJI = abstractC861810XrP2;
        this.LJII = charSequence;
        this.LJIIIIZZ = bool;
        this.LJIIIZ = drawable;
    }
}
