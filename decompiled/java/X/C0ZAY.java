package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZAY, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZAY implements InterfaceC0148002o {
    public final C895240ZAc LL;

    public C0ZAY() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0ZAY) && Intrinsics.LJFF(this.LL, ((C0ZAY) obj).LL);
    }

    public final int hashCode() {
        C895240ZAc c895240ZAc = this.LL;
        if (c895240ZAc == null) {
            return 0;
        }
        return c895240ZAc.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ArchiveEntranceState(item=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0ZAY(C895240ZAc c895240ZAc) {
        this.LL = c895240ZAc;
    }
}
