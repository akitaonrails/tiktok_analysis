package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qac, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1555840qac implements InterfaceC2753014t {
    public final C1822010xVv LL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1555840qac) && Intrinsics.LJFF(this.LL, ((C1555840qac) obj).LL);
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PcsServiceSkuSource(param=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1555840qac(C1822010xVv c1822010xVv) {
        this.LL = c1822010xVv;
    }
}
