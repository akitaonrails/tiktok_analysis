package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0bv3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C991910bv3 {
    public final C991900bv2 LIZ;
    public final Function1<C991900bv2, Unit> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C991910bv3)) {
            return false;
        }
        C991910bv3 c991910bv3 = (C991910bv3) obj;
        return Intrinsics.LJFF(this.LIZ, c991910bv3.LIZ) && Intrinsics.LJFF(this.LIZIZ, c991910bv3.LIZIZ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        Function1<C991900bv2, Unit> function1 = this.LIZIZ;
        return iHashCode + (function1 == null ? 0 : function1.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SessionEnd(result=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", callback=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C991910bv3(C991900bv2 c991900bv2, Function1<? super C991900bv2, Unit> function1) {
        this.LIZ = c991900bv2;
        this.LIZIZ = function1;
    }
}
