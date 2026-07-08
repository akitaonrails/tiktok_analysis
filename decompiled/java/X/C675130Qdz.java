package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Qdz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C675130Qdz<T> {
    public final C15O7<C1515820pY4<T>> LIZ;
    public final C674880Qda LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C675130Qdz)) {
            return false;
        }
        C675130Qdz c675130Qdz = (C675130Qdz) obj;
        return Intrinsics.LJFF(this.LIZ, c675130Qdz.LIZ) && Intrinsics.LJFF(this.LIZIZ, c675130Qdz.LIZIZ);
    }

    public final int hashCode() {
        C15O7<C1515820pY4<T>> c15o7 = this.LIZ;
        return ((c15o7 == null ? 0 : c15o7.hashCode()) * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ChunkTaskWithMonitor(task=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", monitorInfo=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C675130Qdz(C15O7<C1515820pY4<T>> c15o7, C674880Qda c674880Qda) {
        this.LIZ = c15o7;
        this.LIZIZ = c674880Qda;
    }
}
