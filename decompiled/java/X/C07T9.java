package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.jvm.internal.AFwS231S0000000_3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07T9, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07T9 {
    public final Function1<Integer, Unit> LIZ;
    public final Function0<Unit> LIZIZ;

    public C07T9() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C07T9)) {
            return false;
        }
        C07T9 c07t9 = (C07T9) obj;
        return Intrinsics.LJFF(this.LIZ, c07t9.LIZ) && Intrinsics.LJFF(this.LIZIZ, c07t9.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GenerationLoadingUiAction(onProgressUpdate=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", onAnimationComplete=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C07T9(Object obj) {
        AFwS231S0000000_3 aFwS231S0000000_3 = AFwS231S0000000_3.get$arr$(220);
        AFwS189S0000000_3 aFwS189S0000000_3 = AFwS189S0000000_3.get$arr$(1424);
        this.LIZ = aFwS231S0000000_3;
        this.LIZIZ = aFwS189S0000000_3;
    }
}
