package X;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04i2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1170804i2 {
    public final View LIZ;
    public final int LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1170804i2)) {
            return false;
        }
        C1170804i2 c1170804i2 = (C1170804i2) obj;
        return Intrinsics.LJFF(this.LIZ, c1170804i2.LIZ) && this.LIZIZ == c1170804i2.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoResolvedAnchor(rowItemView=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", targetYInRow=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1170804i2(int i, View view) {
        this.LIZ = view;
        this.LIZIZ = i;
    }
}
