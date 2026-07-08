package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0cGM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1005120cGM extends AbstractC1003980cEW {
    public final String LIZ;
    public final Function1<C0RAB, Unit> LIZIZ;
    public final Function1<C0RAO, Unit> LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1005120cGM)) {
            return false;
        }
        C1005120cGM c1005120cGM = (C1005120cGM) obj;
        return Intrinsics.LJFF(this.LIZ, c1005120cGM.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1005120cGM.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1005120cGM.LIZJ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        Function1<C0RAB, Unit> function1 = this.LIZIZ;
        int iHashCode2 = (iHashCode + (function1 == null ? 0 : function1.hashCode())) * 31;
        Function1<C0RAO, Unit> function12 = this.LIZJ;
        return iHashCode2 + (function12 != null ? function12.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MultiContentVideoRegisterListener(key=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", progress=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", state=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1005120cGM(String str, Function1<? super C0RAB, Unit> function1, Function1<? super C0RAO, Unit> function12) {
        this.LIZ = str;
        this.LIZIZ = function1;
        this.LIZJ = function12;
    }
}
