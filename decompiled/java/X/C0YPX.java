package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0YPX, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YPX implements InterfaceC873750YPl {
    public final List<C869590Y9l> LIZ;
    public final List<C0YQ0> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0YPX)) {
            return false;
        }
        C0YPX c0ypx = (C0YPX) obj;
        return Intrinsics.LJFF(this.LIZ, c0ypx.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0ypx.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BatchFinished(succeeded=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", failed=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0YPX(List<? extends C869590Y9l> list, List<C0YQ0> list2) {
        this.LIZ = list;
        this.LIZIZ = list2;
    }
}
