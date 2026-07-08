package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0brU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C989700brU extends AbstractC989720brW {
    public final Throwable LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C989700brU) && Intrinsics.LJFF(this.LIZIZ, ((C989700brU) obj).LIZIZ);
    }

    public final int hashCode() {
        return this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Exception(throwable=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C989700brU(Throwable th) {
        this.LIZIZ = th;
    }
}
