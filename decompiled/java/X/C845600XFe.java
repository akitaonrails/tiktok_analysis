package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0XFe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C845600XFe {
    public final long LIZ;
    public final C0XFZ LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C845600XFe)) {
            return false;
        }
        C845600XFe c845600XFe = (C845600XFe) obj;
        return this.LIZ == c845600XFe.LIZ && Intrinsics.LJFF(this.LIZIZ, c845600XFe.LIZIZ);
    }

    public final int hashCode() {
        return (C786410Ut5.Y2(this.LIZ) * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TokenOperationMetrics(latency=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", result=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C845600XFe(long j, C0XFZ c0xfz) {
        this.LIZ = j;
        this.LIZIZ = c0xfz;
    }
}
