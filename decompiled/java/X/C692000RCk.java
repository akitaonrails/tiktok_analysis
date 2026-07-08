package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0RCk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C692000RCk implements C0R5L {
    public final long LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final boolean LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C692000RCk)) {
            return false;
        }
        C692000RCk c692000RCk = (C692000RCk) obj;
        return this.LIZ == c692000RCk.LIZ && Intrinsics.LJFF(this.LIZIZ, c692000RCk.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c692000RCk.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c692000RCk.LIZLLL) && this.LJ == c692000RCk.LJ;
    }

    public final int hashCode() {
        return (((((((C786410Ut5.Y2(this.LIZ) * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + C786410Ut5.Z2(this.LJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FrameStart(startTimeMillis=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", videoId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", scene=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", genre=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", isOnCreate=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C692000RCk(long j, String str, boolean z, String str2, String str3) {
        this.LIZ = j;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.LJ = z;
    }
}
