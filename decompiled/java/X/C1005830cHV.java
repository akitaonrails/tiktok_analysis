package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0cHV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1005830cHV implements InterfaceC0148002o {
    public final Long LL;

    public C1005830cHV() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1005830cHV) && Intrinsics.LJFF(this.LL, ((C1005830cHV) obj).LL);
    }

    public final int hashCode() {
        Long l = this.LL;
        if (l == null) {
            return 0;
        }
        return l.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("HighlightPlayControlState(playingFragmentId=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1005830cHV(Long l) {
        this.LL = l;
    }
}
