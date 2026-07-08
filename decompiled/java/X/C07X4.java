package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07X4, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07X4 {
    public final Function0<Unit> LIZ;
    public final Function0<Unit> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C07X4)) {
            return false;
        }
        C07X4 c07x4 = (C07X4) obj;
        return Intrinsics.LJFF(this.LIZ, c07x4.LIZ) && Intrinsics.LJFF(this.LIZIZ, c07x4.LIZIZ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        Function0<Unit> function0 = this.LIZIZ;
        return iHashCode + (function0 == null ? 0 : function0.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Observer(onSuccess=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", onFailed=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C07X4(Function0<Unit> function0, Function0<Unit> function02) {
        this.LIZ = function0;
        this.LIZIZ = function02;
    }
}
