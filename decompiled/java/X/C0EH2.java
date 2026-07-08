package X;

import android.view.View;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EH2, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EH2 {
    public final Function2<C361980EHc, Integer, Unit> LIZ;
    public final Function1<List<C361980EHc>, Unit> LIZIZ;
    public final Function2<C361980EHc, Integer, Unit> LIZJ;
    public final InterfaceC1631620sYq<C361980EHc, Integer, View, Unit> LIZLLL;
    public final InterfaceC1631620sYq<C361980EHc, Integer, View, Unit> LJ;
    public final Function0<Unit> LJFF;
    public final Function0<Unit> LJI;
    public final Function0<Unit> LJII;
    public final Function0<Unit> LJIIIIZZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0EH2)) {
            return false;
        }
        C0EH2 c0eh2 = (C0EH2) obj;
        return Intrinsics.LJFF(this.LIZ, c0eh2.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0eh2.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0eh2.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c0eh2.LIZLLL) && Intrinsics.LJFF(this.LJ, c0eh2.LJ) && Intrinsics.LJFF(this.LJFF, c0eh2.LJFF) && Intrinsics.LJFF(this.LJI, c0eh2.LJI) && Intrinsics.LJFF(this.LJII, c0eh2.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c0eh2.LJIIIIZZ);
    }

    public final int hashCode() {
        return (((((((((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31) + this.LJFF.hashCode()) * 31) + this.LJI.hashCode()) * 31) + this.LJII.hashCode()) * 31) + this.LJIIIIZZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BottomBarActions(onMobItemShow=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", onMobListShow=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", onMobItemClick=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", onItemClick=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", onSmallIconClick=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", onBackIconClick=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", onBackToRoot=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", onSetAnimGuideState=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", onFirstDrawFinish=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0EH2(C0EH0 c0eh0, C0EH3 c0eh3, C0EH1 c0eh1, C361940EGy c361940EGy, C361950EGz c361950EGz, C0EH4 c0eh4, C0EH5 c0eh5, C0EH6 c0eh6, C0EH7 c0eh7) {
        this.LIZ = c0eh0;
        this.LIZIZ = c0eh3;
        this.LIZJ = c0eh1;
        this.LIZLLL = c361940EGy;
        this.LJ = c361950EGz;
        this.LJFF = c0eh4;
        this.LJI = c0eh5;
        this.LJII = c0eh6;
        this.LJIIIIZZ = c0eh7;
    }
}
