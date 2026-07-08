package X;

import com.ss.android.ugc.aweme.aigc.AIGCStyle;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0NPS, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NPS implements InterfaceC0148002o {
    public final C291001Au<List<AIGCStyle>> LL;
    public final C291001Au<Set<AIGCStyle>> LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0NPS)) {
            return false;
        }
        C0NPS c0nps = (C0NPS) obj;
        return Intrinsics.LJFF(this.LL, c0nps.LL) && Intrinsics.LJFF(this.LLILLJJLI, c0nps.LLILLJJLI);
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SelectorState(dataSource=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", selectedData=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0NPS(C291001Au<? extends List<AIGCStyle>> c291001Au, C291001Au<? extends Set<AIGCStyle>> c291001Au2) {
        this.LL = c291001Au;
        this.LLILLJJLI = c291001Au2;
    }
}
