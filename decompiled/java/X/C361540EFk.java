package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EFk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C361540EFk {
    public final Function0<Unit> LIZ;
    public final Function1<Integer, Unit> LIZIZ;
    public final Function1<Integer, Unit> LIZJ;
    public final Function1<Integer, Unit> LIZLLL;
    public final Function1<Integer, Unit> LJ;
    public final Function1<String, Unit> LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C361540EFk)) {
            return false;
        }
        C361540EFk c361540EFk = (C361540EFk) obj;
        return Intrinsics.LJFF(this.LIZ, c361540EFk.LIZ) && Intrinsics.LJFF(this.LIZIZ, c361540EFk.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c361540EFk.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c361540EFk.LIZLLL) && Intrinsics.LJFF(this.LJ, c361540EFk.LJ) && Intrinsics.LJFF(this.LJFF, c361540EFk.LJFF);
    }

    public final int hashCode() {
        return (((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31) + this.LJFF.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AudioFadePanelActions(onPanelClose=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", onFadeInSliderChanging=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", onFadeOutSliderChanging=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", onFadeInSliderChanged=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", onFadeOutSliderChanged=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", onMobFadePanelClick=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C361540EFk(C361630EFt c361630EFt, C361550EFl c361550EFl, C361560EFm c361560EFm, C361570EFn c361570EFn, C361580EFo c361580EFo, C361670EFx c361670EFx) {
        this.LIZ = c361630EFt;
        this.LIZIZ = c361550EFl;
        this.LIZJ = c361560EFm;
        this.LIZLLL = c361570EFn;
        this.LJ = c361580EFo;
        this.LJFF = c361670EFx;
    }
}
