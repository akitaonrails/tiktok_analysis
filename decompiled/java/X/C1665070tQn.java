package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0tQn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1665070tQn implements InterfaceC1665180tQy {
    public final C1665110tQr LIZ;
    public final Function1<Float, Unit> LIZIZ;
    public final Function0<Unit> LIZJ;
    public final Function0<Unit> LIZLLL;
    public final Function0<Unit> LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1665070tQn)) {
            return false;
        }
        C1665070tQn c1665070tQn = (C1665070tQn) obj;
        return Intrinsics.LJFF(this.LIZ, c1665070tQn.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1665070tQn.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1665070tQn.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1665070tQn.LIZLLL) && Intrinsics.LJFF(this.LJ, c1665070tQn.LJ);
    }

    public final int hashCode() {
        return (((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SlowMotion(uiState=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", soundTrackTap=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", soundOnClick=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", doneOnClick=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", closeOnClick=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static C1665070tQn LIZ(C1665070tQn c1665070tQn, C1665110tQr c1665110tQr) {
        Function1<Float, Unit> function1 = c1665070tQn.LIZIZ;
        Function0<Unit> function0 = c1665070tQn.LIZJ;
        Function0<Unit> function02 = c1665070tQn.LIZLLL;
        Function0<Unit> function03 = c1665070tQn.LJ;
        c1665070tQn.getClass();
        return new C1665070tQn(c1665110tQr, function1, function0, function02, function03);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1665070tQn(C1665110tQr c1665110tQr, Function1<? super Float, Unit> function1, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03) {
        this.LIZ = c1665110tQr;
        this.LIZIZ = function1;
        this.LIZJ = function0;
        this.LIZLLL = function02;
        this.LJ = function03;
    }
}
