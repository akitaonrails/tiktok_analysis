package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.AFwS231S0000000_3;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Lik, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C550680Lik {
    public final Function1<Integer, Unit> LIZ;
    public final Function0<Unit> LIZIZ;
    public final Function0<Unit> LIZJ;
    public final Function0<Unit> LIZLLL;
    public final Function0<Unit> LJ;

    public C550680Lik() {
        this(null, null, null, null, 31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C550680Lik)) {
            return false;
        }
        C550680Lik c550680Lik = (C550680Lik) obj;
        return Intrinsics.LJFF(this.LIZ, c550680Lik.LIZ) && Intrinsics.LJFF(this.LIZIZ, c550680Lik.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c550680Lik.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c550680Lik.LIZLLL) && Intrinsics.LJFF(this.LJ, c550680Lik.LJ);
    }

    public final int hashCode() {
        return (((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIPortraitGenerationLoadingUiAction(onProgressUpdate=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", regenerate=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", hideSaveDraft=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", showSaveDraft=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", toPromptPage=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C550680Lik(AwS552S0100000_8 awS552S0100000_8, AwS552S0100000_8 awS552S0100000_82, AwS552S0100000_8 awS552S0100000_83, AwS552S0100000_8 awS552S0100000_84, int i) {
        AFwS231S0000000_3 aFwS231S0000000_3;
        if ((i & 1) != 0) {
            aFwS231S0000000_3 = AFwS231S0000000_3.get$arr$(309);
        } else {
            aFwS231S0000000_3 = null;
        }
        Function0<Unit> function0 = (i & 2) != 0 ? AFwS194S0000000_8.get$arr$(648) : awS552S0100000_8;
        Function0<Unit> function02 = (i & 4) != 0 ? AFwS194S0000000_8.get$arr$(649) : awS552S0100000_82;
        Function0<Unit> function03 = (i & 8) != 0 ? AFwS194S0000000_8.get$arr$(650) : awS552S0100000_83;
        Function0<Unit> function04 = (i & 16) != 0 ? AFwS194S0000000_8.get$arr$(651) : awS552S0100000_84;
        this.LIZ = aFwS231S0000000_3;
        this.LIZIZ = function0;
        this.LIZJ = function02;
        this.LIZLLL = function03;
        this.LJ = function04;
    }
}
