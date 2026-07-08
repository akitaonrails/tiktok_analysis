package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0D0S, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0D0S extends C0D0T {
    public final List<AbstractC331870Czh> LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0D0S) && Intrinsics.LJFF(this.LIZ, ((C0D0S) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Success(slots=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0D0S(List<? extends AbstractC331870Czh> list) {
        this.LIZ = list;
    }
}
