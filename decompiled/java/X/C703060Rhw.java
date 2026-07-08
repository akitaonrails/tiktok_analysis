package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Rhw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C703060Rhw implements InterfaceC702960Rhm {
    public final long LIZ;
    public final C703410RiV LIZIZ;
    public final long LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C703060Rhw)) {
            return false;
        }
        C703060Rhw c703060Rhw = (C703060Rhw) obj;
        return this.LIZ == c703060Rhw.LIZ && Intrinsics.LJFF(this.LIZIZ, c703060Rhw.LIZIZ) && this.LIZJ == c703060Rhw.LIZJ;
    }

    public final int hashCode() {
        return (((C786410Ut5.Y2(this.LIZ) * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Y2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ApplyOperation(executeId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", operation=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", updatedAtMs=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C703060Rhw(long j, C703410RiV c703410RiV, long j2) {
        this.LIZ = j;
        this.LIZIZ = c703410RiV;
        this.LIZJ = j2;
    }
}
