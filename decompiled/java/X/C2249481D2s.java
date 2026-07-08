package X;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1D2s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2249481D2s {
    public final View LIZ;
    public final C1868920yja LIZIZ;
    public final C1868920yja LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2249481D2s)) {
            return false;
        }
        C2249481D2s c2249481D2s = (C2249481D2s) obj;
        return Intrinsics.LJFF(this.LIZ, c2249481D2s.LIZ) && Intrinsics.LJFF(this.LIZIZ, c2249481D2s.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c2249481D2s.LIZJ);
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ItemBackgroundTransition(view=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", from=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", to=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C2249481D2s(View view, C1868920yja c1868920yja, C1868920yja c1868920yja2) {
        this.LIZ = view;
        this.LIZIZ = c1868920yja;
        this.LIZJ = c1868920yja2;
    }
}
