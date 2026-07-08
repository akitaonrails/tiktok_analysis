package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Dc8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C342740Dc8 implements InterfaceC342760DcA {
    public final C342750Dc9 LIZ;
    public final C342750Dc9 LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final Function0<Unit> LJFF;
    public final String LJI;
    public final Function0<Unit> LJII;
    public final Function0<Unit> LJIIIIZZ;
    public final Function0<Unit> LJIIIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C342740Dc8)) {
            return false;
        }
        C342740Dc8 c342740Dc8 = (C342740Dc8) obj;
        return Intrinsics.LJFF(this.LIZ, c342740Dc8.LIZ) && Intrinsics.LJFF(this.LIZIZ, c342740Dc8.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c342740Dc8.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c342740Dc8.LIZLLL) && Intrinsics.LJFF(this.LJ, c342740Dc8.LJ) && Intrinsics.LJFF(this.LJFF, c342740Dc8.LJFF) && Intrinsics.LJFF(this.LJI, c342740Dc8.LJI) && Intrinsics.LJFF(this.LJII, c342740Dc8.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c342740Dc8.LJIIIIZZ) && Intrinsics.LJFF(this.LJIIIZ, c342740Dc8.LJIIIZ);
    }

    public final int hashCode() {
        C342750Dc9 c342750Dc9 = this.LIZ;
        int iHashCode = (c342750Dc9 == null ? 0 : c342750Dc9.hashCode()) * 31;
        C342750Dc9 c342750Dc92 = this.LIZIZ;
        return ((((((((((((((((iHashCode + (c342750Dc92 != null ? c342750Dc92.hashCode() : 0)) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31) + this.LJFF.hashCode()) * 31) + this.LJI.hashCode()) * 31) + this.LJII.hashCode()) * 31) + this.LJIIIIZZ.hashCode()) * 31) + this.LJIIIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIMECompatibleTaskDialog(mainTaskImage=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", sideTaskImage=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", title=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", content=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", mainButtonTitle=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", mainButtonAction=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", deleteTitle=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", deleteAction=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", dialogCloseActionTrigger=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(", showAction=");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC342760DcA
    public final Function0<Unit> LIZ() {
        return this.LJII;
    }

    @Override // X.InterfaceC342760DcA
    public final String LIZIZ() {
        return this.LJ;
    }

    @Override // X.InterfaceC342760DcA
    public final Function0<Unit> LIZJ() {
        return this.LJIIIIZZ;
    }

    @Override // X.InterfaceC342760DcA
    public final String LIZLLL() {
        return this.LJI;
    }

    @Override // X.InterfaceC342760DcA
    public final Function0<Unit> LJ() {
        return this.LJFF;
    }

    @Override // X.InterfaceC342760DcA
    public final Function0<Unit> LJFF() {
        return this.LJIIIZ;
    }

    @Override // X.InterfaceC342760DcA
    public final C342750Dc9 LJI() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC342760DcA
    public final C342750Dc9 LJII() {
        return this.LIZ;
    }

    @Override // X.InterfaceC342760DcA
    public final String getContent() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC342760DcA
    public final String getTitle() {
        return this.LIZJ;
    }

    public C342740Dc8(C342750Dc9 c342750Dc9, C342750Dc9 c342750Dc92, String str, String str2, String str3, Function0<Unit> function0, String str4, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04) {
        this.LIZ = c342750Dc9;
        this.LIZIZ = c342750Dc92;
        this.LIZJ = str;
        this.LIZLLL = str2;
        this.LJ = str3;
        this.LJFF = function0;
        this.LJI = str4;
        this.LJII = function02;
        this.LJIIIIZZ = function03;
        this.LJIIIZ = function04;
    }
}
