package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Qgw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C676960Qgw implements InterfaceC0148002o {
    public final List<EnumC669620QOi> LL;
    public final C291001Au<Integer> LLILLJJLI;

    public C676960Qgw() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C676960Qgw)) {
            return false;
        }
        C676960Qgw c676960Qgw = (C676960Qgw) obj;
        return Intrinsics.LJFF(this.LL, c676960Qgw.LL) && Intrinsics.LJFF(this.LLILLJJLI, c676960Qgw.LLILLJJLI);
    }

    public final int hashCode() {
        List<EnumC669620QOi> list = this.LL;
        return ((list == null ? 0 : list.hashCode()) * 31) + this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchContainerState(tabList=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", currentTab=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C676960Qgw(int i) {
        this(new C291001Au(0), null);
    }

    public C676960Qgw(C291001Au c291001Au, List list) {
        this.LL = list;
        this.LLILLJJLI = c291001Au;
    }
}
