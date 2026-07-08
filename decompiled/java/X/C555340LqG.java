package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0LqG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C555340LqG {
    public final Function0<Unit> LIZ;
    public final Function0<Unit> LIZIZ;
    public final Function0<Unit> LIZJ;
    public final Function0<Unit> LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C555340LqG)) {
            return false;
        }
        C555340LqG c555340LqG = (C555340LqG) obj;
        return Intrinsics.LJFF(this.LIZ, c555340LqG.LIZ) && Intrinsics.LJFF(this.LIZIZ, c555340LqG.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c555340LqG.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c555340LqG.LIZLLL);
    }

    public final int hashCode() {
        return (((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TitleBarUiAction(onBackClick=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", onDialogGoBackClick=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", onDialogStopGeneration=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", onDialogDismiss=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C555340LqG(AwS552S0100000_8 awS552S0100000_8, AwS552S0100000_8 awS552S0100000_82, AwS552S0100000_8 awS552S0100000_83, AwS552S0100000_8 awS552S0100000_84) {
        this.LIZ = awS552S0100000_8;
        this.LIZIZ = awS552S0100000_82;
        this.LIZJ = awS552S0100000_83;
        this.LIZLLL = awS552S0100000_84;
    }
}
