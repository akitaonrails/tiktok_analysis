package X;

import android.animation.TimeInterpolator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0SRp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C721430SRp {
    public final long LIZ;
    public final TimeInterpolator LIZIZ;
    public final int LIZJ;

    public C721430SRp() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C721430SRp)) {
            return false;
        }
        C721430SRp c721430SRp = (C721430SRp) obj;
        return this.LIZ == c721430SRp.LIZ && Intrinsics.LJFF(this.LIZIZ, c721430SRp.LIZIZ) && this.LIZJ == c721430SRp.LIZJ;
    }

    public final int hashCode() {
        return (((C786410Ut5.Y2(this.LIZ) * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Config(duration=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", interpolator=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", endTolerancePx=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C721430SRp(int i) {
        C12DM c12dm = new C12DM();
        this.LIZ = 120L;
        this.LIZIZ = c12dm;
        this.LIZJ = 1;
    }
}
