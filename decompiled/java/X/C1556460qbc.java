package X;

import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qbc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1556460qbc {
    public final WeakReference<C21202017y6> LIZ;
    public final String LIZIZ;
    public boolean LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1556460qbc)) {
            return false;
        }
        C1556460qbc c1556460qbc = (C1556460qbc) obj;
        return Intrinsics.LJFF(this.LIZ, c1556460qbc.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1556460qbc.LIZIZ) && this.LIZJ == c1556460qbc.LIZJ;
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        String str = this.LIZIZ;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + C786410Ut5.Z2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ListenerEntry(ref=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", subScene=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", preloadReady=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1556460qbc(String str, WeakReference weakReference, boolean z) {
        this.LIZ = weakReference;
        this.LIZIZ = str;
        this.LIZJ = z;
    }
}
