package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.145y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C202100145y {
    public long LIZ;
    public long LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C202100145y)) {
            return false;
        }
        C202100145y c202100145y = (C202100145y) obj;
        return this.LIZ == c202100145y.LIZ && this.LIZIZ == c202100145y.LIZIZ && Intrinsics.LJFF(this.LIZJ, c202100145y.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ColdBootTaskItem(startTime=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", cost=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", threadName=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C202100145y() {
        this(0L, 0L, "null");
    }

    public C202100145y(long j, long j2, String str) {
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = str;
    }
}
