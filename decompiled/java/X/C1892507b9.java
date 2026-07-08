package X;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07b9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1892507b9 extends AbstractC1891907b3 {
    public final View LIZ;
    public final String LIZIZ = "";

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1892507b9)) {
            return false;
        }
        C1892507b9 c1892507b9 = (C1892507b9) obj;
        return Intrinsics.LJFF(this.LIZ, c1892507b9.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1892507b9.LIZIZ);
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

    public C1892507b9(View view) {
        this.LIZ = view;
    }
}
