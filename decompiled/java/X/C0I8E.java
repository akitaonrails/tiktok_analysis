package X;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0I8E, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0I8E implements C0I8U {
    public final Function1<C0I66, C0I66> LIZ;

    public C0I8E() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0I8E) && Intrinsics.LJFF(this.LIZ, ((C0I8E) obj).LIZ);
    }

    public final int hashCode() {
        Function1<C0I66, C0I66> function1 = this.LIZ;
        if (function1 == null) {
            return 0;
        }
        return function1.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Fresco(config=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0I8E(Function1<? super C0I66, ? extends C0I66> function1) {
        this.LIZ = function1;
    }
}
