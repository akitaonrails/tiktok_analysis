package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.AwS611S0100000_32;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.18S7, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18S7 {
    public final Function0<Unit> LIZ;
    public final Function0<Unit> LIZIZ;
    public final Function0<Unit> LIZJ;
    public final Function1<Float, Unit> LIZLLL;
    public final Function0<Unit> LJ;
    public final Function0<Unit> LJFF;
    public final Function0<Unit> LJI;
    public final Function0<Unit> LJII;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18S7)) {
            return false;
        }
        C18S7 c18s7 = (C18S7) obj;
        return Intrinsics.LJFF(this.LIZ, c18s7.LIZ) && Intrinsics.LJFF(this.LIZIZ, c18s7.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c18s7.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c18s7.LIZLLL) && Intrinsics.LJFF(this.LJ, c18s7.LJ) && Intrinsics.LJFF(this.LJFF, c18s7.LJFF) && Intrinsics.LJFF(this.LJI, c18s7.LJI) && Intrinsics.LJFF(this.LJII, c18s7.LJII);
    }

    public final int hashCode() {
        return (((((((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31) + this.LJFF.hashCode()) * 31) + this.LJI.hashCode()) * 31) + this.LJII.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VoiceBoxAction(onStopBtnClick=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", onSendBtnClick=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", onLongPressTouchDown=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", onLongPressTouchMove=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", onLongPressTouchUp=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", onLongPressTouchCancel=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", consumeShowToast=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", onCountdownTipExpose=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C18S7(AwS576S0100000_32 awS576S0100000_32, AwS576S0100000_32 awS576S0100000_322, AwS576S0100000_32 awS576S0100000_323, AwS611S0100000_32 awS611S0100000_32, AwS576S0100000_32 awS576S0100000_324, AwS576S0100000_32 awS576S0100000_325, AwS576S0100000_32 awS576S0100000_326, AwS576S0100000_32 awS576S0100000_327) {
        this.LIZ = awS576S0100000_32;
        this.LIZIZ = awS576S0100000_322;
        this.LIZJ = awS576S0100000_323;
        this.LIZLLL = awS611S0100000_32;
        this.LJ = awS576S0100000_324;
        this.LJFF = awS576S0100000_325;
        this.LJI = awS576S0100000_326;
        this.LJII = awS576S0100000_327;
    }
}
