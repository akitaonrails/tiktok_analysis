package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03J2, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03J2 implements InterfaceC0148002o {
    public final List<InterfaceC1891350zJl> LL;
    public final C291001Au<C03J1> LLILLJJLI;

    public C03J2() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C03J2)) {
            return false;
        }
        C03J2 c03j2 = (C03J2) obj;
        return Intrinsics.LJFF(this.LL, c03j2.LL) && Intrinsics.LJFF(this.LLILLJJLI, c03j2.LLILLJJLI);
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AggregateLogisticPanelState(adapterList=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", userSaveResult=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C03J2(int i) {
        this(new C291001Au(new C03J1(0)), C13BV.INSTANCE);
    }

    public C03J2(C291001Au c291001Au, List list) {
        this.LL = list;
        this.LLILLJJLI = c291001Au;
    }
}
