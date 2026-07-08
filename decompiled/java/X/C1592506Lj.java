package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06Lj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1592506Lj implements InterfaceC0148002o {
    public final String LL;
    public final boolean LLILLJJLI;

    public C1592506Lj() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1592506Lj)) {
            return false;
        }
        C1592506Lj c1592506Lj = (C1592506Lj) obj;
        return Intrinsics.LJFF(this.LL, c1592506Lj.LL) && this.LLILLJJLI == c1592506Lj.LLILLJJLI;
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + C786410Ut5.Z2(this.LLILLJJLI);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InboxSearchResultVMState(nowTabName=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", needRefresh=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1592506Lj(int i) {
        this.LL = C1618770sE7.LIZJ(2131835997);
        this.LLILLJJLI = false;
    }
}
