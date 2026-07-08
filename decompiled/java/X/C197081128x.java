package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS218S0000000_29;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.128x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C197081128x {
    public final Function0<Unit> LIZ;
    public final Function0<Unit> LIZIZ;
    public final Function0<Unit> LIZJ;
    public final Function0<Unit> LIZLLL;
    public final Function0<Unit> LJ;

    public C197081128x() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C197081128x)) {
            return false;
        }
        C197081128x c197081128x = (C197081128x) obj;
        return Intrinsics.LJFF(this.LIZ, c197081128x.LIZ) && Intrinsics.LJFF(this.LIZIZ, c197081128x.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c197081128x.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c197081128x.LIZLLL) && Intrinsics.LJFF(this.LJ, c197081128x.LJ);
    }

    public final int hashCode() {
        return (((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EditLyricStickerEffectAction(onPanelClosed=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", onShowAnimStart=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", onShowAnimEnd=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", onHideAnimStart=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", onHideAnimEnd=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C197081128x(AwS573S0100000_29 awS573S0100000_29) {
        AFwS218S0000000_29 aFwS218S0000000_29 = AFwS218S0000000_29.get$arr$(261);
        AFwS218S0000000_29 aFwS218S0000000_292 = AFwS218S0000000_29.get$arr$(262);
        AFwS218S0000000_29 aFwS218S0000000_293 = AFwS218S0000000_29.get$arr$(263);
        AFwS218S0000000_29 aFwS218S0000000_294 = AFwS218S0000000_29.get$arr$(264);
        this.LIZ = awS573S0100000_29;
        this.LIZIZ = aFwS218S0000000_29;
        this.LIZJ = aFwS218S0000000_292;
        this.LIZLLL = aFwS218S0000000_293;
        this.LJ = aFwS218S0000000_294;
    }
}
