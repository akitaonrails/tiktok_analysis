package X;

import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0I6i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C461100I6i implements InterfaceC0148002o {
    public final C291001Au<C461170I6p> LL;
    public final Pair<Long, C291001Au<Boolean>> LLILLJJLI;

    public C461100I6i() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C461100I6i)) {
            return false;
        }
        C461100I6i c461100I6i = (C461100I6i) obj;
        return Intrinsics.LJFF(this.LL, c461100I6i.LL) && Intrinsics.LJFF(this.LLILLJJLI, c461100I6i.LLILLJJLI);
    }

    public final int hashCode() {
        C291001Au<C461170I6p> c291001Au = this.LL;
        int iHashCode = (c291001Au == null ? 0 : c291001Au.hashCode()) * 31;
        Pair<Long, C291001Au<Boolean>> pair = this.LLILLJJLI;
        return iHashCode + (pair != null ? pair.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ScrollToVMState(scrollToMsgIdx=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", msgBounceEvent=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C461100I6i(C291001Au<C461170I6p> c291001Au, Pair<Long, ? extends C291001Au<Boolean>> pair) {
        this.LL = c291001Au;
        this.LLILLJJLI = pair;
    }
}
