package X;

import android.os.SystemClock;

/* JADX INFO: renamed from: X.07XZ, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07XZ implements InterfaceC20186313yf {
    public final long LIZ;

    public C07XZ() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C07XZ) && this.LIZ == ((C07XZ) obj).LIZ;
    }

    public final int hashCode() {
        return C786410Ut5.Y2(this.LIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Failed(at=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C07XZ(int i) {
        this.LIZ = SystemClock.elapsedRealtime();
    }
}
