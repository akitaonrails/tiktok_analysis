package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0W0S, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0W0S {
    public final long LIZ;
    public final C0VR1 LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0W0S)) {
            return false;
        }
        C0W0S c0w0s = (C0W0S) obj;
        return this.LIZ == c0w0s.LIZ && this.LIZIZ == c0w0s.LIZIZ && Intrinsics.LJFF(this.LIZJ, c0w0s.LIZJ);
    }

    public final int hashCode() {
        return (((C786410Ut5.Y2(this.LIZ) * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DiffChunk(id=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", type=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", text=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0W0S(long j, C0VR1 c0vr1, String str) {
        this.LIZ = j;
        this.LIZIZ = c0vr1;
        this.LIZJ = str;
    }
}
