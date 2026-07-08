package X;

import android.graphics.drawable.Drawable;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZiS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C907220ZiS implements InterfaceC214754192q {
    public final boolean LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final CharSequence LIZLLL;
    public final C375830EoP<Unit> LJ;
    public final C861820XrQ LJFF;

    @Override // X.InterfaceC214754192q
    public final int LIZIZ() {
        return Integer.MAX_VALUE;
    }

    @Override // X.InterfaceC214754192q
    public final AbstractC861810XrP LIZJ() {
        return null;
    }

    @Override // X.InterfaceC214754192q
    public final boolean LJ() {
        return false;
    }

    @Override // X.InterfaceC214754192q
    public final Drawable LJFF() {
        return null;
    }

    @Override // X.InterfaceC214754192q
    public final Boolean LJI() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C907220ZiS)) {
            return false;
        }
        C907220ZiS c907220ZiS = (C907220ZiS) obj;
        return this.LIZ == c907220ZiS.LIZ && this.LIZIZ == c907220ZiS.LIZIZ && this.LIZJ == c907220ZiS.LIZJ && Intrinsics.LJFF(this.LIZLLL, c907220ZiS.LIZLLL) && Intrinsics.LJFF(this.LJ, c907220ZiS.LJ);
    }

    @Override // X.InterfaceC214754192q
    public final int getVisibility() {
        return 0;
    }

    public final int hashCode() {
        int iZ2 = ((((C786410Ut5.Z2(this.LIZ) * 31) + this.LIZIZ) * 31) + this.LIZJ) * 31;
        CharSequence charSequence = this.LIZLLL;
        int iHashCode = (iZ2 + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        C375830EoP<Unit> c375830EoP = this.LJ;
        return iHashCode + (c375830EoP != null ? c375830EoP.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PUGCTemplatePublishOptionState(isEnabled=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", titleRes=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", iconRes=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", label=");
        sbLIZ.append((Object) this.LIZLLL);
        sbLIZ.append(", highlightViewAnimationEvent=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC214754192q
    public final Integer LIZ() {
        return Integer.valueOf(this.LIZJ);
    }

    @Override // X.InterfaceC214754192q
    public final AbstractC861810XrP LIZLLL() {
        return this.LJFF;
    }

    @Override // X.InterfaceC214754192q
    public final CharSequence getLabel() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC214754192q
    public final boolean isEnabled() {
        return this.LIZ;
    }

    public C907220ZiS(boolean z, int i, int i2, CharSequence charSequence, C375830EoP<Unit> c375830EoP) {
        this.LIZ = z;
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = charSequence;
        this.LJ = c375830EoP;
        this.LJFF = new C861820XrQ(i);
    }

    public static C907220ZiS LJII(C907220ZiS c907220ZiS, boolean z, CharSequence charSequence, C375830EoP c375830EoP, int i) {
        int i2;
        int i3;
        C375830EoP c375830EoP2 = c375830EoP;
        CharSequence charSequence2 = charSequence;
        boolean z2 = z;
        if ((i & 1) != 0) {
            z2 = c907220ZiS.LIZ;
        }
        if ((i & 2) != 0) {
            i2 = c907220ZiS.LIZIZ;
        } else {
            i2 = 0;
        }
        if ((i & 4) != 0) {
            i3 = c907220ZiS.LIZJ;
        } else {
            i3 = 0;
        }
        if ((i & 8) != 0) {
            charSequence2 = c907220ZiS.LIZLLL;
        }
        if ((i & 16) != 0) {
            c375830EoP2 = c907220ZiS.LJ;
        }
        c907220ZiS.getClass();
        return new C907220ZiS(z2, i2, i3, charSequence2, c375830EoP2);
    }
}
