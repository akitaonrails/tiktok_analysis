package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ViV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C805330ViV implements InterfaceC204700qb {
    public final String LIZ;
    public final C09AE LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C805330ViV)) {
            return false;
        }
        C805330ViV c805330ViV = (C805330ViV) obj;
        return Intrinsics.LJFF(this.LIZ, c805330ViV.LIZ) && Intrinsics.LJFF(this.LIZIZ, c805330ViV.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TimeOutReplayCardJob(taskId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", delayJob=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C805330ViV(String str, AnonymousClass0956 anonymousClass0956) {
        this.LIZ = str;
        this.LIZIZ = anonymousClass0956;
    }
}
