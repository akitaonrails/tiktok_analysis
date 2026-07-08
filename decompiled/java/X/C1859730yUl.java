package X;

import com.ss.android.ugc.aweme.tako.model.TakoEventTracker;
import com.ss.android.ugc.aweme.tako.model.TakoSearchCarryInItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yUl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1859730yUl {
    public final TakoSearchCarryInItem LIZ;
    public final TakoEventTracker LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1859730yUl)) {
            return false;
        }
        C1859730yUl c1859730yUl = (C1859730yUl) obj;
        return Intrinsics.LJFF(this.LIZ, c1859730yUl.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1859730yUl.LIZIZ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        TakoEventTracker takoEventTracker = this.LIZIZ;
        return iHashCode + (takoEventTracker == null ? 0 : takoEventTracker.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ResolvedCarryInput(carryInItem=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", eventTracker=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1859730yUl(TakoSearchCarryInItem takoSearchCarryInItem, TakoEventTracker takoEventTracker) {
        this.LIZ = takoSearchCarryInItem;
        this.LIZIZ = takoEventTracker;
    }
}
