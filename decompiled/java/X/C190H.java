package X;

import android.graphics.drawable.Drawable;
import com.ss.android.ugc.aweme.friends.model.MutualStruct;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.190H, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C190H implements InterfaceC214754192q {
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final MutualStruct LIZLLL;
    public final int LJ;
    public final C375830EoP<Unit> LJFF;
    public final C861820XrQ LJI;

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
        if (!(obj instanceof C190H)) {
            return false;
        }
        C190H c190h = (C190H) obj;
        return this.LIZ == c190h.LIZ && this.LIZIZ == c190h.LIZIZ && this.LIZJ == c190h.LIZJ && Intrinsics.LJFF(this.LIZLLL, c190h.LIZLLL) && this.LJ == c190h.LJ && Intrinsics.LJFF(this.LJFF, c190h.LJFF);
    }

    @Override // X.InterfaceC214754192q
    public final CharSequence getLabel() {
        return null;
    }

    @Override // X.InterfaceC214754192q
    public final int getVisibility() {
        return 0;
    }

    public final int hashCode() {
        int i = ((((this.LIZ * 31) + this.LIZIZ) * 31) + this.LIZJ) * 31;
        MutualStruct mutualStruct = this.LIZLLL;
        int iHashCode = (((i + (mutualStruct == null ? 0 : mutualStruct.hashCode())) * 31) + this.LJ) * 31;
        C375830EoP<Unit> c375830EoP = this.LJFF;
        return iHashCode + (c375830EoP != null ? c375830EoP.hashCode() : 0);
    }

    @Override // X.InterfaceC214754192q
    public final boolean isEnabled() {
        return true;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TagPeoplePublishOptionState(titleRes=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", iconRes=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", taggedViewVisible=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", taggedViewData=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", tagHighlightViewVisible=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", tagHighlightViewAnimationEvent=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC214754192q
    public final Integer LIZ() {
        return Integer.valueOf(this.LIZIZ);
    }

    @Override // X.InterfaceC214754192q
    public final AbstractC861810XrP LIZLLL() {
        return this.LJI;
    }

    public static C190H LJII(C190H c190h, int i, MutualStruct mutualStruct, C375830EoP c375830EoP, int i2) {
        int i3;
        int i4;
        C375830EoP c375830EoP2 = c375830EoP;
        MutualStruct mutualStruct2 = mutualStruct;
        int i5 = i;
        int i6 = 0;
        if ((i2 & 1) != 0) {
            i3 = c190h.LIZ;
        } else {
            i3 = 0;
        }
        if ((i2 & 2) != 0) {
            i4 = c190h.LIZIZ;
        } else {
            i4 = 0;
        }
        if ((i2 & 4) != 0) {
            i5 = c190h.LIZJ;
        }
        if ((i2 & 8) != 0) {
            mutualStruct2 = c190h.LIZLLL;
        }
        if ((i2 & 16) != 0) {
            i6 = c190h.LJ;
        }
        if ((i2 & 32) != 0) {
            c375830EoP2 = c190h.LJFF;
        }
        c190h.getClass();
        return new C190H(i3, i4, i5, mutualStruct2, i6, c375830EoP2);
    }

    public C190H(int i, int i2, int i3, MutualStruct mutualStruct, int i4, C375830EoP<Unit> c375830EoP) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = i3;
        this.LIZLLL = mutualStruct;
        this.LJ = i4;
        this.LJFF = c375830EoP;
        this.LJI = new C861820XrQ(i);
    }
}
