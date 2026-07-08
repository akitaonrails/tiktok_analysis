package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0x2l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1803930x2l extends AbstractC1803920x2k {
    public final InterfaceC1806470x6r LIZ;
    public final long LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1803930x2l)) {
            return false;
        }
        C1803930x2l c1803930x2l = (C1803930x2l) obj;
        return Intrinsics.LJFF(this.LIZ, c1803930x2l.LIZ) && this.LIZIZ == c1803930x2l.LIZIZ;
    }

    public final int hashCode() {
        InterfaceC1806470x6r interfaceC1806470x6r = this.LIZ;
        return ((interfaceC1806470x6r == null ? 0 : interfaceC1806470x6r.hashCode()) * 31) + C786410Ut5.Y2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShowDialog(message=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", delay=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1803930x2l(C1803940x2m c1803940x2m, long j) {
        this.LIZ = c1803940x2m;
        this.LIZIZ = j;
    }
}
