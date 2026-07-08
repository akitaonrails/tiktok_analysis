package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00yK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C252600yK extends AbstractC253300yR {
    public final String LIZ = "async_conditions_pending";
    public final Function1<Function1<? super Boolean, Unit>, Unit> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C252600yK)) {
            return false;
        }
        C252600yK c252600yK = (C252600yK) obj;
        return Intrinsics.LJFF(this.LIZ, c252600yK.LIZ) && Intrinsics.LJFF(this.LIZIZ, c252600yK.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AsyncPending(reason=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", asyncCheck=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C252600yK(C5183020f c5183020f) {
        this.LIZIZ = c5183020f;
    }
}
