package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0tvD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1683930tvD {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final Function0<Unit> LIZJ;
    public final Function0<Unit> LIZLLL;
    public final Function0<Unit> LJ;

    public C1683930tvD() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1683930tvD)) {
            return false;
        }
        C1683930tvD c1683930tvD = (C1683930tvD) obj;
        return this.LIZ == c1683930tvD.LIZ && this.LIZIZ == c1683930tvD.LIZIZ && Intrinsics.LJFF(this.LIZJ, c1683930tvD.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1683930tvD.LIZLLL) && Intrinsics.LJFF(this.LJ, c1683930tvD.LJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ConfirmDialogProperties(show=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isTTEHEffect=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", onKeepClick=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", onDeleteClick=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", onDismissRequest=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1683930tvD(int i) {
        this(false, false, AFwS214S0000000_25.get$arr$(468), AFwS214S0000000_25.get$arr$(469), AFwS214S0000000_25.get$arr$(470));
    }

    public static C1683930tvD LIZ(C1683930tvD c1683930tvD, boolean z) {
        boolean z2 = c1683930tvD.LIZIZ;
        Function0<Unit> function0 = c1683930tvD.LIZJ;
        Function0<Unit> function02 = c1683930tvD.LIZLLL;
        Function0<Unit> function03 = c1683930tvD.LJ;
        c1683930tvD.getClass();
        return new C1683930tvD(z, z2, function0, function02, function03);
    }

    public C1683930tvD(boolean z, boolean z2, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03) {
        this.LIZ = z;
        this.LIZIZ = z2;
        this.LIZJ = function0;
        this.LIZLLL = function02;
        this.LJ = function03;
    }
}
