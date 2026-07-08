package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.004Q, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C004Q {
    public final List<C996803v4> LIZ;
    public final int LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C004Q)) {
            return false;
        }
        C004Q c004q = (C004Q) obj;
        return Intrinsics.LJFF(this.LIZ, c004q.LIZ) && this.LIZIZ == c004q.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BuildSupportTryOnPropItemInfoResult(baseList=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", originHasImageItemCount=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C004Q(List<C996803v4> list, int i) {
        this.LIZ = list;
        this.LIZIZ = i;
    }
}
