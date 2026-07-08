package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gCA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1156280gCA extends AbstractC1736670vIH {
    public final Integer LIZ;
    public final Throwable LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1156280gCA)) {
            return false;
        }
        C1156280gCA c1156280gCA = (C1156280gCA) obj;
        return Intrinsics.LJFF(this.LIZ, c1156280gCA.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1156280gCA.LIZIZ);
    }

    public final int hashCode() {
        Integer num = this.LIZ;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Throwable th = this.LIZIZ;
        return iHashCode + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FailUploadEffect(errorCode=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", e=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1156280gCA(Integer num, Throwable th) {
        this.LIZ = num;
        this.LIZIZ = th;
    }
}
