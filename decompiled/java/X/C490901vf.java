package X;

import com.google.gson.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.01vf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C490901vf implements InterfaceC0148002o {
    public final AbstractC1623806Xk<n> LL;

    public C490901vf() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C490901vf) && Intrinsics.LJFF(this.LL, ((C490901vf) obj).LL);
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DynamicSearchFragmentState(listState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C490901vf(Object obj) {
        this.LL = C491101vh.LIZ;
    }
}
