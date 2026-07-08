package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0LN3, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LN3 implements C0LN4 {
    public final Throwable LIZ;
    public final int LIZIZ;

    public C0LN3() {
        this(null, 3, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0LN3)) {
            return false;
        }
        C0LN3 c0ln3 = (C0LN3) obj;
        return Intrinsics.LJFF(this.LIZ, c0ln3.LIZ) && this.LIZIZ == c0ln3.LIZIZ;
    }

    public final int hashCode() {
        Throwable th = this.LIZ;
        return ((th == null ? 0 : th.hashCode()) * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Error(throwable=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", errorCode=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0LN3(Throwable th, int i) {
        this.LIZ = th;
        this.LIZIZ = i;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C0LN3(Throwable th, int i, int i2) {
        int i3;
        th = (i & 1) != 0 ? null : th;
        if ((i & 2) != 0) {
            i3 = -1;
        } else {
            i3 = 0;
        }
        this(th, i3);
    }
}
