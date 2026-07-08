package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07Ti, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1868007Ti extends AbstractC1868107Tj {
    public final Throwable LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1868007Ti) && Intrinsics.LJFF(this.LIZ, ((C1868007Ti) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShowErrorPage(throwable=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1868007Ti(Throwable th) {
        this.LIZ = th;
    }
}
