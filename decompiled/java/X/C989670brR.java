package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0brR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C989670brR extends AbstractC989680brS {
    public final Throwable LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C989670brR) && Intrinsics.LJFF(this.LIZIZ, ((C989670brR) obj).LIZIZ);
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

    public C989670brR(Throwable th) {
        this.LIZIZ = th;
    }
}
