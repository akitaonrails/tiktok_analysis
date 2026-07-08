package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04h1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1164504h1 {
    public final Function0<Unit> LIZ;

    public C1164504h1() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1164504h1) && Intrinsics.LJFF(this.LIZ, ((C1164504h1) obj).LIZ);
    }

    public final int hashCode() {
        Function0<Unit> function0 = this.LIZ;
        if (function0 == null) {
            return 0;
        }
        return function0.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TopNoticeDismissPayload(onComplete=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1164504h1(Function0<Unit> function0) {
        this.LIZ = function0;
    }
}
