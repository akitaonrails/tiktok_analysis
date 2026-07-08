package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rBU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1578700rBU implements InterfaceC2753014t, InterfaceC111300bX {
    public final Function0<Unit> LL;
    public final Function0<Unit> LLILLJJLI;
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(528));

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1578700rBU)) {
            return false;
        }
        C1578700rBU c1578700rBU = (C1578700rBU) obj;
        return Intrinsics.LJFF(this.LL, c1578700rBU.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1578700rBU.LLILLJJLI);
    }

    public final int hashCode() {
        Function0<Unit> function0 = this.LL;
        int iHashCode = (function0 == null ? 0 : function0.hashCode()) * 31;
        Function0<Unit> function02 = this.LLILLJJLI;
        return iHashCode + (function02 != null ? function02.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DramaU18BlockHierarchyData(onGoToForYouClick=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", onFeedbackClick=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1578700rBU(AwS568S0100000_24 awS568S0100000_24, AFwS213S0000000_24 aFwS213S0000000_24) {
        this.LL = awS568S0100000_24;
        this.LLILLJJLI = aFwS213S0000000_24;
    }
}
