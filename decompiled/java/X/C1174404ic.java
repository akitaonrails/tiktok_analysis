package X;

import com.ss.android.ugc.aweme.tools.sticker.core.BezierControlPoint;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04ic, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1174404ic extends AbstractC1174304ib {
    public final BezierControlPoint LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1174404ic) && Intrinsics.LJFF(this.LIZ, ((C1174404ic) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Bezier(controlPoint=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1174404ic(BezierControlPoint bezierControlPoint) {
        this.LIZ = bezierControlPoint;
    }
}
