package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0NIS, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NIS implements InterfaceC0148002o {
    public final C0N1X LL;

    public C0NIS() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0NIS) && Intrinsics.LJFF(this.LL, ((C0NIS) obj).LL);
    }

    public final int hashCode() {
        C0N1X c0n1x = this.LL;
        if (c0n1x == null) {
            return 0;
        }
        return c0n1x.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GuideSelfAwemeEventState(guideSelfAwemeShareEvent=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0NIS(C0N1X c0n1x) {
        this.LL = c0n1x;
    }
}
