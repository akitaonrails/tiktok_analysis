package X;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0R7N, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0R7N implements InterfaceC111300bX {
    public final Function0<Long> LL;

    public C0R7N() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0R7N) && Intrinsics.LJFF(this.LL, ((C0R7N) obj).LL);
    }

    public final int hashCode() {
        Function0<Long> function0 = this.LL;
        if (function0 == null) {
            return 0;
        }
        return function0.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SimpleDiggHierarchyData(infoProvider=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0R7N(Function0<Long> function0) {
        this.LL = function0;
    }
}
