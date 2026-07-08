package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0buS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C991540buS extends AbstractC991550buT {
    public final Throwable LIZ;
    public final int LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C991540buS)) {
            return false;
        }
        C991540buS c991540buS = (C991540buS) obj;
        return Intrinsics.LJFF(this.LIZ, c991540buS.LIZ) && this.LIZIZ == c991540buS.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Error(exception=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", errorCode=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C991540buS(Throwable th, int i) {
        this.LIZ = th;
        this.LIZIZ = i;
    }
}
