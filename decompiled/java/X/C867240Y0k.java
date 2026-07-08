package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Y0k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C867240Y0k {
    public static final /* synthetic */ int LJ = 0;
    public final C869710Y9x LIZ;
    public final List<C0Y8T> LIZIZ;
    public final boolean LIZJ;
    public final long LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C867240Y0k)) {
            return false;
        }
        C867240Y0k c867240Y0k = (C867240Y0k) obj;
        return Intrinsics.LJFF(this.LIZ, c867240Y0k.LIZ) && Intrinsics.LJFF(this.LIZIZ, c867240Y0k.LIZIZ) && this.LIZJ == c867240Y0k.LIZJ && this.LIZLLL == c867240Y0k.LIZLLL;
    }

    public final int hashCode() {
        return (((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31) + C786410Ut5.Y2(this.LIZLLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ConversationQueryResult(query=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", conversations=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", hasMore=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", nextCursor=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C867240Y0k(C869710Y9x c869710Y9x, List<C0Y8T> list, boolean z, long j) {
        this.LIZ = c869710Y9x;
        this.LIZIZ = list;
        this.LIZJ = z;
        this.LIZLLL = j;
    }
}
