package X;

import android.graphics.Bitmap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;
import kotlin.jvm.internal.AwS619S0100000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0E1J, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0E1J {
    public final Function1<Integer, Unit> LIZ;
    public final Function2<String, Long, Bitmap> LIZIZ;
    public final Function2<C352950Dsb, Integer, Unit> LIZJ;
    public final Function0<Unit> LIZLLL;
    public final Function1<Integer, Unit> LJ;
    public final Function2<Integer, Integer, Unit> LJFF;
    public final Function0<Unit> LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0E1J)) {
            return false;
        }
        C0E1J c0e1j = (C0E1J) obj;
        return Intrinsics.LJFF(this.LIZ, c0e1j.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0e1j.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0e1j.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c0e1j.LIZLLL) && Intrinsics.LJFF(this.LJ, c0e1j.LJ) && Intrinsics.LJFF(this.LJFF, c0e1j.LJFF) && Intrinsics.LJFF(this.LJI, c0e1j.LJI);
    }

    public final int hashCode() {
        return (((((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31) + this.LJFF.hashCode()) * 31) + this.LJI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FreeLayerPanelSceneAction(onFirstLayoutFinish=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", getFrameCacheBitmap=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", onClickItem=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", onScrollPanelList=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", onDragPanelStart=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", onSwapItem=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", onSaveClick=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0E1J(C0E1L c0e1l, AwS619S0100000_5 awS619S0100000_5, AwS619S0100000_5 awS619S0100000_52, AwS549S0100000_5 awS549S0100000_5, AwS584S0100000_5 awS584S0100000_5, C0E1K c0e1k, C0E1N c0e1n) {
        this.LIZ = c0e1l;
        this.LIZIZ = awS619S0100000_5;
        this.LIZJ = awS619S0100000_52;
        this.LIZLLL = awS549S0100000_5;
        this.LJ = awS584S0100000_5;
        this.LJFF = c0e1k;
        this.LJI = c0e1n;
    }
}
