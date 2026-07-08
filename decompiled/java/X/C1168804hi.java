package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04hi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1168804hi {
    public final String LIZ;
    public final List<Integer> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1168804hi)) {
            return false;
        }
        C1168804hi c1168804hi = (C1168804hi) obj;
        return Intrinsics.LJFF(this.LIZ, c1168804hi.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1168804hi.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PreloadBatch(name=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", layoutIds=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1168804hi(String str, List<Integer> list) {
        this.LIZ = str;
        this.LIZIZ = list;
    }
}
