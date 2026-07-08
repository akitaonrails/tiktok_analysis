package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.002q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0150002q implements InterfaceC0148002o {
    public final String LL;
    public final String LLILLJJLI;

    public C0150002q() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0150002q)) {
            return false;
        }
        C0150002q c0150002q = (C0150002q) obj;
        return Intrinsics.LJFF(this.LL, c0150002q.LL) && Intrinsics.LJFF(this.LLILLJJLI, c0150002q.LLILLJJLI);
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ECSearchDebugToolState(title=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", value=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0150002q(int i) {
        this.LL = "";
        this.LLILLJJLI = "";
    }
}
