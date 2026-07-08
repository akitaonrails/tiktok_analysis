package X;

import android.graphics.RectF;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Hii, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C448740Hii {
    public final long LIZ;
    public final RectF LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C448740Hii)) {
            return false;
        }
        C448740Hii c448740Hii = (C448740Hii) obj;
        return this.LIZ == c448740Hii.LIZ && Intrinsics.LJFF(this.LIZIZ, c448740Hii.LIZIZ);
    }

    public final int hashCode() {
        return (C786410Ut5.Y2(this.LIZ) * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VirtualBoardF(id=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", rect=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C448740Hii(long j, RectF rectF) {
        this.LIZ = j;
        this.LIZIZ = rectF;
    }
}
