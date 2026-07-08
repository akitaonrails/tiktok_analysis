package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gAw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1155520gAw implements InterfaceC0148002o {
    public final int LL;
    public final List<C0H8B> LLILLJJLI;

    public C1155520gAw() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1155520gAw)) {
            return false;
        }
        C1155520gAw c1155520gAw = (C1155520gAw) obj;
        return this.LL == c1155520gAw.LL && Intrinsics.LJFF(this.LLILLJJLI, c1155520gAw.LLILLJJLI);
    }

    public final int hashCode() {
        return (this.LL * 31) + this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoDetailKeyframePanelState(clickedPosition=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", keyframeCellState=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1155520gAw(int i) {
        this(-1, C13BV.INSTANCE);
    }

    public C1155520gAw(int i, List<C0H8B> list) {
        this.LL = i;
        this.LLILLJJLI = list;
    }
}
