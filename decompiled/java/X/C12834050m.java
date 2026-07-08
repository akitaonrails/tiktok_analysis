package X;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.050m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C12834050m extends AbstractC12832050k {
    public final String LIZ = "signal";
    public final Function2<C12835050n, Object, Boolean> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12834050m)) {
            return false;
        }
        C12834050m c12834050m = (C12834050m) obj;
        return Intrinsics.LJFF(this.LIZ, c12834050m.LIZ) && Intrinsics.LJFF(this.LIZIZ, c12834050m.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("WithPayload(name=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", updater=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC12832050k
    public final String LIZ() {
        return this.LIZ;
    }

    public C12834050m(Function2 function2) {
        this.LIZIZ = function2;
    }
}
