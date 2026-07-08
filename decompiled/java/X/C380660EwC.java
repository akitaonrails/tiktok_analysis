package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EwC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C380660EwC {
    public final C357590E0f LIZ;
    public final List<C380190EvR> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C380660EwC)) {
            return false;
        }
        C380660EwC c380660EwC = (C380660EwC) obj;
        return Intrinsics.LJFF(this.LIZ, c380660EwC.LIZ) && Intrinsics.LJFF(this.LIZIZ, c380660EwC.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CategoryPage(category=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", items=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C380660EwC(C357590E0f c357590E0f, List<C380190EvR> list) {
        this.LIZ = c357590E0f;
        this.LIZIZ = list;
    }
}
