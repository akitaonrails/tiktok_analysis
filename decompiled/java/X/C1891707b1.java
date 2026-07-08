package X;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07b1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1891707b1 extends AbstractC1891907b3 {
    public final int LIZ;
    public final View LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1891707b1)) {
            return false;
        }
        C1891707b1 c1891707b1 = (C1891707b1) obj;
        return this.LIZ == c1891707b1.LIZ && Intrinsics.LJFF(this.LIZIZ, c1891707b1.LIZIZ);
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

    public C1891707b1(int i, View view) {
        this.LIZ = i;
        this.LIZIZ = view;
    }
}
