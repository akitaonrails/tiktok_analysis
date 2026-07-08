package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0a3k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C920420a3k {
    public final long LIZ;
    public final long LIZIZ;
    public final String LIZJ;
    public final int LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C920420a3k)) {
            return false;
        }
        C920420a3k c920420a3k = (C920420a3k) obj;
        return this.LIZ == c920420a3k.LIZ && this.LIZIZ == c920420a3k.LIZIZ && Intrinsics.LJFF(this.LIZJ, c920420a3k.LIZJ) && this.LIZLLL == c920420a3k.LIZLLL;
    }

    public final int hashCode() {
        return (((((C786410Ut5.Y2(this.LIZ) * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("KickOutParam(roomId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", userId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", linkMicId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", kickOutReason=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C920420a3k(int i, long j, long j2, String str) {
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = str;
        this.LIZLLL = i;
    }
}
