package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Cz8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C331520Cz8 extends AbstractC331470Cz3 {
    public final List<C0D4T> LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C331520Cz8)) {
            return false;
        }
        C331520Cz8 c331520Cz8 = (C331520Cz8) obj;
        return Intrinsics.LJFF(this.LIZ, c331520Cz8.LIZ) && this.LIZIZ == c331520Cz8.LIZIZ && this.LIZJ == c331520Cz8.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + C786410Ut5.Z2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Success(reviews=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", hasMore=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", isLoadingMore=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C331520Cz8(List<C0D4T> list, boolean z, boolean z2) {
        this.LIZ = list;
        this.LIZIZ = z;
        this.LIZJ = z2;
    }
}
