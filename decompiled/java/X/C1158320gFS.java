package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gFS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1158320gFS {
    public final List<InterfaceC1891350zJl> LIZ;
    public final String LIZIZ;
    public final boolean LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1158320gFS)) {
            return false;
        }
        C1158320gFS c1158320gFS = (C1158320gFS) obj;
        return Intrinsics.LJFF(this.LIZ, c1158320gFS.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1158320gFS.LIZIZ) && this.LIZJ == c1158320gFS.LIZJ;
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        String str = this.LIZIZ;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + C786410Ut5.Z2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SkylightLoadDataOutcome(items=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", nextPageCursor=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", hasMore=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1158320gFS(List<? extends InterfaceC1891350zJl> list, String str, boolean z) {
        this.LIZ = list;
        this.LIZIZ = str;
        this.LIZJ = z;
    }
}
