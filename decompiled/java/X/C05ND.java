package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.05ND, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C05ND implements InterfaceC0148002o {
    public final boolean LL;
    public final List<String> LLILLJJLI;

    public C05ND() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C05ND)) {
            return false;
        }
        C05ND c05nd = (C05ND) obj;
        return this.LL == c05nd.LL && Intrinsics.LJFF(this.LLILLJJLI, c05nd.LLILLJJLI);
    }

    public final int hashCode() {
        return (C786410Ut5.Z2(this.LL) * 31) + this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StoryHighlightsProfileVMState(isRequestingCache=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", pendingCacheCollectionIds=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C05ND(int i) {
        this(false, C13BV.INSTANCE);
    }

    public C05ND(boolean z, List<String> list) {
        this.LL = z;
        this.LLILLJJLI = list;
    }

    public static C05ND LIZ(C05ND c05nd, boolean z, List list, int i) {
        if ((i & 1) != 0) {
            z = c05nd.LL;
        }
        if ((i & 2) != 0) {
            list = c05nd.LLILLJJLI;
        }
        c05nd.getClass();
        return new C05ND(z, list);
    }
}
