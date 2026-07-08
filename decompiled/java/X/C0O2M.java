package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0O2M, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0O2M implements InterfaceC0148002o {
    public final AbstractC1623806Xk<List<C1146800fws>> LL;

    public C0O2M() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0O2M) && Intrinsics.LJFF(this.LL, ((C0O2M) obj).LL);
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TaskProgressState(taskList=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C0O2M(int i) {
        this(C491101vh.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0O2M(AbstractC1623806Xk<? extends List<C1146800fws>> abstractC1623806Xk) {
        this.LL = abstractC1623806Xk;
    }
}
