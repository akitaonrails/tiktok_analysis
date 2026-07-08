package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0E2v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C358270E2v {
    public final Function0<Unit> LIZ;
    public final Function1<Integer, Unit> LIZIZ;
    public final Function1<Integer, Unit> LIZJ;
    public final Function0<Unit> LIZLLL;
    public final Function0<Unit> LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C358270E2v)) {
            return false;
        }
        C358270E2v c358270E2v = (C358270E2v) obj;
        return Intrinsics.LJFF(this.LIZ, c358270E2v.LIZ) && Intrinsics.LJFF(this.LIZIZ, c358270E2v.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c358270E2v.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c358270E2v.LIZLLL) && Intrinsics.LJFF(this.LJ, c358270E2v.LJ);
    }

    public final int hashCode() {
        return (((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FilterPanelSceneActions(onStartSeek=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", onSeekBarProgressChange=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", onStopSeek=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", deleteFilter=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", onCancelClick=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C358270E2v(AwS549S0100000_5 awS549S0100000_5, C358280E2w c358280E2w, AwS549S0100000_5 awS549S0100000_52, C358250E2t c358250E2t, C358260E2u c358260E2u) {
        this.LIZ = awS549S0100000_5;
        this.LIZIZ = c358250E2t;
        this.LIZJ = c358260E2u;
        this.LIZLLL = c358280E2w;
        this.LJ = awS549S0100000_52;
    }
}
