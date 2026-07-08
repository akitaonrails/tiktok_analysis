package X;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0U0C, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0U0C extends C0U0N {
    public final View LIZ;
    public final C0U22 LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0U0C)) {
            return false;
        }
        C0U0C c0u0c = (C0U0C) obj;
        return Intrinsics.LJFF(this.LIZ, c0u0c.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0u0c.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StartAddAnimation(iconView=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", songInfo=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0U0C(View view, C0U22 c0u22) {
        this.LIZ = view;
        this.LIZIZ = c0u22;
    }
}
