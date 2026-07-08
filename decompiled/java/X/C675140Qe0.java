package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Qe0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C675140Qe0<T> {
    public final C05XL<C1515820pY4<T>> LIZ;
    public final C674880Qda LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C675140Qe0)) {
            return false;
        }
        C675140Qe0 c675140Qe0 = (C675140Qe0) obj;
        return Intrinsics.LJFF(this.LIZ, c675140Qe0.LIZ) && Intrinsics.LJFF(this.LIZIZ, c675140Qe0.LIZIZ);
    }

    public final int hashCode() {
        C05XL<C1515820pY4<T>> c05xl = this.LIZ;
        return ((c05xl == null ? 0 : c05xl.hashCode()) * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ChunkDeferredWithMonitor(deferred=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", monitorInfo=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C675140Qe0(C05XL<C1515820pY4<T>> c05xl, C674880Qda c674880Qda) {
        this.LIZ = c05xl;
        this.LIZIZ = c674880Qda;
    }
}
