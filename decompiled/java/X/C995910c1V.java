package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0c1V, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C995910c1V implements InterfaceC0148002o {
    public final C291001Au<InterfaceC1817490xOd> LL;
    public final List<C435160H4o> LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C995910c1V)) {
            return false;
        }
        C995910c1V c995910c1V = (C995910c1V) obj;
        return Intrinsics.LJFF(this.LL, c995910c1V.LL) && Intrinsics.LJFF(this.LLILLJJLI, c995910c1V.LLILLJJLI);
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DecorationNavigationState(navigationEvent=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", navBarItems=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C995910c1V(C291001Au<? extends InterfaceC1817490xOd> c291001Au, List<C435160H4o> list) {
        this.LL = c291001Au;
        this.LLILLJJLI = list;
    }
}
