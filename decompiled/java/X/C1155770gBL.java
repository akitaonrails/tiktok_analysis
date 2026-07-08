package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gBL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1155770gBL implements InterfaceC2753014t, InterfaceC111300bX {
    public final Function0<Unit> LL;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(703));

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1155770gBL) && Intrinsics.LJFF(this.LL, ((C1155770gBL) obj).LL);
    }

    public final int hashCode() {
        Function0<Unit> function0 = this.LL;
        if (function0 == null) {
            return 0;
        }
        return function0.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DramaGuestLandingHierarchyData(onLoginSuccess=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1155770gBL(AwS568S0100000_24 awS568S0100000_24) {
        this.LL = awS568S0100000_24;
    }
}
