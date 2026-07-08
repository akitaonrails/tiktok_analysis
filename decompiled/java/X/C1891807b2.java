package X;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07b2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1891807b2 extends AbstractC1892207b6 {
    public final int LIZ;
    public final View LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1891807b2)) {
            return false;
        }
        C1891807b2 c1891807b2 = (C1891807b2) obj;
        return this.LIZ == c1891807b2.LIZ && Intrinsics.LJFF(this.LIZIZ, c1891807b2.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OnPlayComplete(loop=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", adView=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1891807b2(int i, View view) {
        this.LIZ = i;
        this.LIZIZ = view;
    }
}
