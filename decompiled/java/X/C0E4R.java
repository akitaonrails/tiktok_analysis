package X;

import com.ss.android.ugc.aweme.audiorecord.Point;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0E4R, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0E4R {
    public final Point LIZ;
    public int LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0E4R)) {
            return false;
        }
        C0E4R c0e4r = (C0E4R) obj;
        return Intrinsics.LJFF(this.LIZ, c0e4r.LIZ) && this.LIZIZ == c0e4r.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OrderPoint(point=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", order=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0E4R(int i, Point point) {
        this.LIZ = point;
        this.LIZIZ = i;
    }
}
