package X;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07bA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1892607bA extends AbstractC1892207b6 {
    public final View LIZ;
    public final String LIZIZ = "";

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1892607bA)) {
            return false;
        }
        C1892607bA c1892607bA = (C1892607bA) obj;
        return Intrinsics.LJFF(this.LIZ, c1892607bA.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1892607bA.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StartAdSession(view=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", contentUrl=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1892607bA(View view) {
        this.LIZ = view;
    }
}
