package X;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gBV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1155870gBV {
    public final View LIZ;
    public final int LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1155870gBV)) {
            return false;
        }
        C1155870gBV c1155870gBV = (C1155870gBV) obj;
        return Intrinsics.LJFF(this.LIZ, c1155870gBV.LIZ) && this.LIZIZ == c1155870gBV.LIZIZ;
    }

    public final int hashCode() {
        View view = this.LIZ;
        return ((view == null ? 0 : view.hashCode()) * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Entry(view=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", contextHashcode=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1155870gBV(int i, View view) {
        this.LIZ = view;
        this.LIZIZ = i;
    }
}
