package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ChN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C320510ChN {
    public final C321490Cix LIZ;

    public C320510ChN() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C320510ChN) && Intrinsics.LJFF(this.LIZ, ((C320510ChN) obj).LIZ);
    }

    public final int hashCode() {
        C321490Cix c321490Cix = this.LIZ;
        if (c321490Cix == null) {
            return 0;
        }
        return c321490Cix.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StableHeightDelegate(bindMessage=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C320510ChN(C321490Cix c321490Cix) {
        this.LIZ = c321490Cix;
    }
}
