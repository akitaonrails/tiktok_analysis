package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0vmk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1755560vmk implements InterfaceC0148002o {
    public final C1755400vmU LL;

    public C1755560vmk() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1755560vmk) && Intrinsics.LJFF(this.LL, ((C1755560vmk) obj).LL);
    }

    public final int hashCode() {
        C1755400vmU c1755400vmU = this.LL;
        if (c1755400vmU == null) {
            return 0;
        }
        return c1755400vmU.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PdpLynxState(item=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1755560vmk(C1755400vmU c1755400vmU) {
        this.LL = c1755400vmU;
    }
}
