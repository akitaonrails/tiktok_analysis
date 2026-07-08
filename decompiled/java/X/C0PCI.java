package X;

import kotlin.jvm.internal.AFwS293S0000000_10;

/* JADX INFO: renamed from: X.0PCI, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PCI implements C0PWT {
    public final long LL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0PCI) && this.LL == ((C0PCI) obj).LL;
    }

    public final int hashCode() {
        return C786410Ut5.Y2(this.LL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UpdateSearchItemBindTimeAction(bindTime=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    static {
        C0Q3E.LJFF().wO2().LIZIZ(C13LE.LIZ(C0PCI.class), AFwS293S0000000_10.get$arr$(77));
    }

    @Override // X.C0PWT
    public final boolean isLog() {
        return C0P9U.LIZ();
    }

    public C0PCI(long j) {
        this.LL = j;
    }
}
