package X;

import com.google.gson.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Cry, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C327080Cry implements InterfaceC0148002o {
    public final AbstractC1623806Xk<n> LL;

    public C327080Cry() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C327080Cry) && Intrinsics.LJFF(this.LL, ((C327080Cry) obj).LL);
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DynamicSearchFragmentStoreState(result=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C327080Cry(int i) {
        this(C491101vh.LIZ);
    }

    public C327080Cry(AbstractC1623806Xk<n> abstractC1623806Xk) {
        this.LL = abstractC1623806Xk;
    }
}
