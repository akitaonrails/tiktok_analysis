package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04yC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1271004yC {
    public final C1271104yD LIZ;
    public final List<C1200404mo> LIZIZ;

    public C1271004yC() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1271004yC)) {
            return false;
        }
        C1271004yC c1271004yC = (C1271004yC) obj;
        return Intrinsics.LJFF(this.LIZ, c1271004yC.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1271004yC.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Bucket(criteria=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", elements=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1271004yC(C1271104yD c1271104yD) {
        ArrayList arrayList = new ArrayList();
        this.LIZ = c1271104yD;
        this.LIZIZ = arrayList;
    }
}
