package X;

import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fvv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1146210fvv implements InterfaceC0148002o {
    public final Pair<List<EnumC1146170fvr>, Integer> LL;
    public final Pair<EnumC1146170fvr, Integer> LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1146210fvv)) {
            return false;
        }
        C1146210fvv c1146210fvv = (C1146210fvv) obj;
        return Intrinsics.LJFF(this.LL, c1146210fvv.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1146210fvv.LLILLJJLI);
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GiftAnchorPanelCenterState(init=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", selectedPage=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1146210fvv(Pair<? extends List<? extends EnumC1146170fvr>, Integer> pair, Pair<? extends EnumC1146170fvr, Integer> pair2) {
        this.LL = pair;
        this.LLILLJJLI = pair2;
    }
}
