package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07XK, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07XK implements C07XT {
    public final Throwable LIZ;

    public C07XK() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C07XK) && Intrinsics.LJFF(this.LIZ, ((C07XK) obj).LIZ);
    }

    public final int hashCode() {
        Throwable th = this.LIZ;
        if (th == null) {
            return 0;
        }
        return th.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Failed(cause=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C07XK(Throwable th) {
        this.LIZ = th;
    }
}
