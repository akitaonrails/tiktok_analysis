package X;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS104S0400000_6;
import kotlin.jvm.internal.AwS372S0200000_6;
import kotlin.jvm.internal.AwS585S0100000_6;
import kotlin.jvm.internal.AwS620S0100000_6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0H1p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C434390H1p implements InterfaceC1175904ir {
    public final Function1<View, Unit> LIZ;
    public final Function1<View, Boolean> LIZIZ;
    public final Function1<View, Unit> LIZJ;
    public final Function2<View, Float, Unit> LIZLLL;
    public final Function1<View, Unit> LJ;
    public final Function1<View, Unit> LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C434390H1p)) {
            return false;
        }
        C434390H1p c434390H1p = (C434390H1p) obj;
        return Intrinsics.LJFF(this.LIZ, c434390H1p.LIZ) && Intrinsics.LJFF(this.LIZIZ, c434390H1p.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c434390H1p.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c434390H1p.LIZLLL) && Intrinsics.LJFF(this.LJ, c434390H1p.LJ) && Intrinsics.LJFF(this.LJFF, c434390H1p.LJFF);
    }

    public final int hashCode() {
        return (((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31) + this.LJFF.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RecordBtnAction(onClick=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", onLongClick=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", onDeleteRecord=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", onBtnHorizontalSwipe=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", onLockRecording=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", sendRecordingImmediately=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C434390H1p(AwS104S0400000_6 awS104S0400000_6, AwS104S0400000_6 awS104S0400000_62, AwS585S0100000_6 awS585S0100000_6, AwS620S0100000_6 awS620S0100000_6, AwS372S0200000_6 awS372S0200000_6, AwS585S0100000_6 awS585S0100000_62) {
        this.LIZ = awS104S0400000_6;
        this.LIZIZ = awS104S0400000_62;
        this.LIZJ = awS585S0100000_6;
        this.LIZLLL = awS620S0100000_6;
        this.LJ = awS372S0200000_6;
        this.LJFF = awS585S0100000_62;
    }
}
