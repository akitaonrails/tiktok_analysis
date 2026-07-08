package X;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0YnF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C884710YnF {
    public final String LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;
    public final boolean LJI;
    public final Set<C13IQ<? extends InterfaceC882100Yj2>> LJII;
    public final Set<C13IQ<? extends InterfaceC882190YjB>> LJIIIIZZ;

    public C884710YnF() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C884710YnF)) {
            return false;
        }
        C884710YnF c884710YnF = (C884710YnF) obj;
        return Intrinsics.LJFF(this.LIZ, c884710YnF.LIZ) && this.LIZIZ == c884710YnF.LIZIZ && this.LIZJ == c884710YnF.LIZJ && this.LIZLLL == c884710YnF.LIZLLL && this.LJ == c884710YnF.LJ && this.LJFF == c884710YnF.LJFF && this.LJI == c884710YnF.LJI && Intrinsics.LJFF(this.LJII, c884710YnF.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c884710YnF.LJIIIIZZ);
    }

    public final int hashCode() {
        return (((((((((((((((this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31) + C786410Ut5.Z2(this.LJ)) * 31) + C786410Ut5.Z2(this.LJFF)) * 31) + C786410Ut5.Z2(this.LJI)) * 31) + this.LJII.hashCode()) * 31) + this.LJIIIIZZ.hashCode();
    }

    public C884710YnF(String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, Set set, Set set2, int i) {
        z = (i & 2) != 0 ? false : z;
        z2 = (i & 4) != 0 ? false : z2;
        z3 = (i & 8) != 0 ? false : z3;
        z4 = (i & 16) != 0 ? false : z4;
        z5 = (i & 32) != 0 ? false : z5;
        z6 = (i & 64) != 0 ? false : z6;
        set = (i & 128) != 0 ? C08CX.INSTANCE : set;
        set2 = (i & 256) != 0 ? C08CX.INSTANCE : set2;
        this.LIZ = str;
        this.LIZIZ = z;
        this.LIZJ = z2;
        this.LIZLLL = z3;
        this.LJ = z4;
        this.LJFF = z5;
        this.LJI = z6;
        this.LJII = set;
        this.LJIIIIZZ = set2;
    }
}
