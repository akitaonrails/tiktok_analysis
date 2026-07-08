package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00AC, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00AC {
    public final int LIZ;
    public final float LIZIZ;
    public final List<String> LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C00AC)) {
            return false;
        }
        C00AC c00ac = (C00AC) obj;
        return this.LIZ == c00ac.LIZ && Float.compare(this.LIZIZ, c00ac.LIZIZ) == 0 && Intrinsics.LJFF(this.LIZJ, c00ac.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CarouselV2ScrollProgress(position=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", progress=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", cardIdList=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return (((this.LIZ * 31) + Float.floatToIntBits(this.LIZIZ)) * 31) + this.LIZJ.hashCode();
    }

    public C00AC(float f, int i, List list) {
        this.LIZ = i;
        this.LIZIZ = f;
        this.LIZJ = list;
    }
}
