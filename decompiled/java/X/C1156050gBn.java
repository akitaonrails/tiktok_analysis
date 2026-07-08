package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gBn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1156050gBn {
    public final String LIZ;
    public final Function1<String, Unit> LIZIZ;
    public final Function0<Unit> LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1156050gBn)) {
            return false;
        }
        C1156050gBn c1156050gBn = (C1156050gBn) obj;
        return Intrinsics.LJFF(this.LIZ, c1156050gBn.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1156050gBn.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1156050gBn.LIZJ);
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RangePolishContext(rangeText=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", onPolished=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", onFail=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1156050gBn(String str, Function0 function0, Function1 function1) {
        this.LIZ = str;
        this.LIZIZ = function1;
        this.LIZJ = function0;
    }
}
