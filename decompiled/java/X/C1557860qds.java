package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qds, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1557860qds implements InterfaceC0148002o {
    public final C1566980qsa LL;
    public final boolean LLILLJJLI;

    public C1557860qds() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1557860qds)) {
            return false;
        }
        C1557860qds c1557860qds = (C1557860qds) obj;
        return Intrinsics.LJFF(this.LL, c1557860qds.LL) && this.LLILLJJLI == c1557860qds.LLILLJJLI;
    }

    public final int hashCode() {
        C1566980qsa c1566980qsa = this.LL;
        return ((c1566980qsa == null ? 0 : c1566980qsa.hashCode()) * 31) + C786410Ut5.Z2(this.LLILLJJLI);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PinSetViewState(pinRegexCheckResult=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", isPinMasked=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1557860qds(int i) {
        this(null, true);
    }

    public C1557860qds(C1566980qsa c1566980qsa, boolean z) {
        this.LL = c1566980qsa;
        this.LLILLJJLI = z;
    }

    public static C1557860qds LIZ(C1557860qds c1557860qds, C1566980qsa c1566980qsa, boolean z, int i) {
        if ((i & 1) != 0) {
            c1566980qsa = c1557860qds.LL;
        }
        if ((i & 2) != 0) {
            z = c1557860qds.LLILLJJLI;
        }
        c1557860qds.getClass();
        return new C1557860qds(c1566980qsa, z);
    }
}
