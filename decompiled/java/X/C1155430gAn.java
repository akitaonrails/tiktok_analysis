package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gAn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1155430gAn implements InterfaceC0148002o {
    public final boolean LL;
    public final List<C1576550r81> LLILLJJLI;

    public C1155430gAn() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1155430gAn)) {
            return false;
        }
        C1155430gAn c1155430gAn = (C1155430gAn) obj;
        return this.LL == c1155430gAn.LL && Intrinsics.LJFF(this.LLILLJJLI, c1155430gAn.LLILLJJLI);
    }

    public final int hashCode() {
        return (C786410Ut5.Z2(this.LL) * 31) + this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CollabFeedCreatorPostListState(isSuccess=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", itemList=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1155430gAn(int i) {
        this(false, C13BV.INSTANCE);
    }

    public C1155430gAn(boolean z, List<C1576550r81> list) {
        this.LL = z;
        this.LLILLJJLI = list;
    }
}
