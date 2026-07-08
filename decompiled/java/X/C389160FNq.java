package X;

import com.ss.ugc.android.editor.base.resource.ResourceItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS619S0100000_5;
import kotlin.jvm.internal.AwS654S0100000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0FNq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C389160FNq {
    public final InterfaceC1631620sYq<Integer, ResourceItem, Boolean, Unit> LIZ;
    public final Function2<Integer, String, Unit> LIZIZ;
    public final Function0<Unit> LIZJ;
    public final Function0<Unit> LIZLLL;
    public final Function0<Unit> LJ;
    public final Function0<Unit> LJFF;
    public final Function0<Unit> LJI;
    public final Function0<String> LJII;
    public final Function0<Unit> LJIIIIZZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C389160FNq)) {
            return false;
        }
        C389160FNq c389160FNq = (C389160FNq) obj;
        return Intrinsics.LJFF(this.LIZ, c389160FNq.LIZ) && Intrinsics.LJFF(this.LIZIZ, c389160FNq.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c389160FNq.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c389160FNq.LIZLLL) && Intrinsics.LJFF(this.LJ, c389160FNq.LJ) && Intrinsics.LJFF(this.LJFF, c389160FNq.LJFF) && Intrinsics.LJFF(this.LJI, c389160FNq.LJI) && Intrinsics.LJFF(this.LJII, c389160FNq.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c389160FNq.LJIIIIZZ);
    }

    public final int hashCode() {
        return (((((((((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31) + this.LJFF.hashCode()) * 31) + this.LJI.hashCode()) * 31) + this.LJII.hashCode()) * 31) + this.LJIIIIZZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LyricStickerEffectAction(onEffectSelected=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", onEffectShown=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", onConfirmClicked=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", onPanelClosed=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", onBackPressed=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", onTrimClicked=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", getEffectList=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", getAppliedResourceId=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", onAutoApplyFirstItemConsumed=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C389160FNq(AwS654S0100000_5 awS654S0100000_5, AwS619S0100000_5 awS619S0100000_5, AwS549S0100000_5 awS549S0100000_5, AwS549S0100000_5 awS549S0100000_52, AwS549S0100000_5 awS549S0100000_53, AwS549S0100000_5 awS549S0100000_54, AwS549S0100000_5 awS549S0100000_55, AwS549S0100000_5 awS549S0100000_56, AwS549S0100000_5 awS549S0100000_57) {
        this.LIZ = awS654S0100000_5;
        this.LIZIZ = awS619S0100000_5;
        this.LIZJ = awS549S0100000_5;
        this.LIZLLL = awS549S0100000_52;
        this.LJ = awS549S0100000_53;
        this.LJFF = awS549S0100000_54;
        this.LJI = awS549S0100000_55;
        this.LJII = awS549S0100000_56;
        this.LJIIIIZZ = awS549S0100000_57;
    }
}
