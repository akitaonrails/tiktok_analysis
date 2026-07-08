package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Uxk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C789300Uxk implements InterfaceC204700qb {
    public final long LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C789300Uxk)) {
            return false;
        }
        C789300Uxk c789300Uxk = (C789300Uxk) obj;
        return this.LIZ == c789300Uxk.LIZ && Intrinsics.LJFF(this.LIZIZ, c789300Uxk.LIZIZ);
    }

    public final int hashCode() {
        return (C786410Ut5.Y2(this.LIZ) * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UpdateDownloadedCount(downloadedCount=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", gameId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C789300Uxk() {
        this(0L, "");
    }

    public C789300Uxk(long j, String str) {
        this.LIZ = j;
        this.LIZIZ = str;
    }
}
