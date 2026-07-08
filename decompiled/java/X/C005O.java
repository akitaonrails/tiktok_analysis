package X;

import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.005O, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C005O {
    public final boolean LIZ;
    public final List<Integer> LIZIZ;

    public C005O() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C005O)) {
            return false;
        }
        C005O c005o = (C005O) obj;
        return this.LIZ == c005o.LIZ && Intrinsics.LJFF(this.LIZIZ, c005o.LIZIZ);
    }

    public final int hashCode() {
        return (C786410Ut5.Z2(this.LIZ) * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DeleteCardOnErrorConfig(deleteOnRuntimeError=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", errorCodeWhitelist=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C005O(Object obj) {
        List<Integer> listSingletonList = Collections.singletonList(301);
        this.LIZ = false;
        this.LIZIZ = listSingletonList;
    }
}
