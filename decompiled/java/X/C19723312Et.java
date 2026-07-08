package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS218S0000000_29;
import kotlin.jvm.internal.AFwS231S0000000_3;
import kotlin.jvm.internal.AFwS273S0000000_29;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.12Et, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19723312Et {
    public final Function0<Unit> LIZ;
    public final Function0<Unit> LIZIZ;
    public final Function0<Unit> LIZJ;
    public final Function0<Unit> LIZLLL;
    public final Function1<InterfaceC19722312Ej, Unit> LJ;
    public final Function1<Float, Unit> LJFF;
    public final Function0<Unit> LJI;
    public final Function1<Float, Unit> LJII;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19723312Et)) {
            return false;
        }
        C19723312Et c19723312Et = (C19723312Et) obj;
        return Intrinsics.LJFF(this.LIZ, c19723312Et.LIZ) && Intrinsics.LJFF(this.LIZIZ, c19723312Et.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c19723312Et.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c19723312Et.LIZLLL) && Intrinsics.LJFF(this.LJ, c19723312Et.LJ) && Intrinsics.LJFF(this.LJFF, c19723312Et.LJFF) && Intrinsics.LJFF(this.LJI, c19723312Et.LJI) && Intrinsics.LJFF(this.LJII, c19723312Et.LJII);
    }

    public final int hashCode() {
        return (((((((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31) + this.LJFF.hashCode()) * 31) + this.LJI.hashCode()) * 31) + this.LJII.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ExtractFramesActions(onScreenShown=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", onRetryClick=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", onConfirmClick=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", onBackClick=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", onSurfaceAvailable=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", onScroll=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", onTouchDown=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", onTouchUp=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C19723312Et() {
        this(AFwS218S0000000_29.get$arr$(330), AFwS218S0000000_29.get$arr$(331), AFwS218S0000000_29.get$arr$(332), AFwS218S0000000_29.get$arr$(333), AFwS218S0000000_29.get$arr$(334), AFwS273S0000000_29.get$arr$(338), AFwS231S0000000_3.get$arr$(142), AFwS231S0000000_3.get$arr$(143));
    }

    public C19723312Et(Function0 function0, Function0 function02, Function0 function03, Function0 function04, Function0 function05, Function1 function1, Function1 function12, Function1 function13) {
        this.LIZ = function0;
        this.LIZIZ = function02;
        this.LIZJ = function03;
        this.LIZLLL = function04;
        this.LJ = function1;
        this.LJFF = function12;
        this.LJI = function05;
        this.LJII = function13;
    }
}
