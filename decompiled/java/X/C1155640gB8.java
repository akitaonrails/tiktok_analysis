package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gB8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1155640gB8 implements InterfaceC0148002o {
    public final int LL;
    public final boolean LLILLJJLI;
    public final List<C0H8A> LLILLL;

    public C1155640gB8() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1155640gB8)) {
            return false;
        }
        C1155640gB8 c1155640gB8 = (C1155640gB8) obj;
        return this.LL == c1155640gB8.LL && this.LLILLJJLI == c1155640gB8.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c1155640gB8.LLILLL);
    }

    public final int hashCode() {
        return (((this.LL * 31) + C786410Ut5.Z2(this.LLILLJJLI)) * 31) + this.LLILLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchDetailKeyframePanelState(highlightPosition=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", disableAutoScroll=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", keyframeCellState=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1155640gB8(int i) {
        this(-1, false, C13BV.INSTANCE);
    }

    public C1155640gB8(int i, boolean z, List<C0H8A> list) {
        this.LL = i;
        this.LLILLJJLI = z;
        this.LLILLL = list;
    }

    public static C1155640gB8 LIZ(C1155640gB8 c1155640gB8, int i, List list) {
        boolean z = c1155640gB8.LLILLJJLI;
        c1155640gB8.getClass();
        return new C1155640gB8(i, z, list);
    }
}
