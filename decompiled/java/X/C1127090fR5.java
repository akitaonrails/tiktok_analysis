package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fR5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1127090fR5 extends AbstractC1127100fR6 {
    public final String LIZ;
    public final Exception LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1127090fR5)) {
            return false;
        }
        C1127090fR5 c1127090fR5 = (C1127090fR5) obj;
        return Intrinsics.LJFF(this.LIZ, c1127090fR5.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1127090fR5.LIZIZ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Exception exc = this.LIZIZ;
        return iHashCode + (exc != null ? exc.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ImageLoadFailed(imageUrl=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", exception=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1127090fR5(String str, Exception exc) {
        this.LIZ = str;
        this.LIZIZ = exc;
    }
}
