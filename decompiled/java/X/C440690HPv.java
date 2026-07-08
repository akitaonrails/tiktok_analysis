package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0HPv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C440690HPv implements InterfaceC440700HPw {
    public final Throwable LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C440690HPv) && Intrinsics.LJFF(this.LIZ, ((C440690HPv) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Error(throwable=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C440690HPv(Throwable th) {
        this.LIZ = th;
    }
}
