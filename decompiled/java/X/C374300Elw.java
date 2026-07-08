package X;

import android.graphics.PointF;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;
import kotlin.jvm.internal.AwS619S0100000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Elw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C374300Elw {
    public final Function1<Boolean, Unit> LIZ;
    public final Function0<Unit> LIZIZ;
    public final Function2<Long, PointF, Unit> LIZJ;
    public final Function0<Unit> LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C374300Elw)) {
            return false;
        }
        C374300Elw c374300Elw = (C374300Elw) obj;
        return Intrinsics.LJFF(this.LIZ, c374300Elw.LIZ) && Intrinsics.LJFF(this.LIZIZ, c374300Elw.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c374300Elw.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c374300Elw.LIZLLL);
    }

    public final int hashCode() {
        return (((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CutoutPreviewActions(onContrastClicked=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", onCancelTaskClicked=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", onPickerColorChanged=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", onPickerColorReleased=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C374300Elw(AwS549S0100000_5 awS549S0100000_5, AwS549S0100000_5 awS549S0100000_52, AwS584S0100000_5 awS584S0100000_5, AwS619S0100000_5 awS619S0100000_5) {
        this.LIZ = awS584S0100000_5;
        this.LIZIZ = awS549S0100000_5;
        this.LIZJ = awS619S0100000_5;
        this.LIZLLL = awS549S0100000_52;
    }
}
