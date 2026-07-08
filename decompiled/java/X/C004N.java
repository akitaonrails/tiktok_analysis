package X;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.004N, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C004N implements C004O {
    public final View LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C004N) && Intrinsics.LJFF(this.LIZ, ((C004N) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CustomViewContent(customView=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C004N(View view) {
        this.LIZ = view;
    }
}
