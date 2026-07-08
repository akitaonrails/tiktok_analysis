package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Y6X, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Y6X {
    public static final /* synthetic */ int LJIIIZ = 0;
    public final C869290Y8h LIZ;
    public final List<C0Y8T> LIZIZ;
    public final boolean LIZJ;
    public final long LIZLLL;
    public final int LJ;
    public final boolean LJFF = false;
    public final boolean LJI;
    public final int LJII;
    public final String LJIIIIZZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0Y6X)) {
            return false;
        }
        C0Y6X c0y6x = (C0Y6X) obj;
        return Intrinsics.LJFF(this.LIZ, c0y6x.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0y6x.LIZIZ) && this.LIZJ == c0y6x.LIZJ && this.LIZLLL == c0y6x.LIZLLL && this.LJ == c0y6x.LJ && this.LJFF == c0y6x.LJFF && this.LJI == c0y6x.LJI && this.LJII == c0y6x.LJII && Intrinsics.LJFF(this.LJIIIIZZ, c0y6x.LJIIIIZZ);
    }

    public final int hashCode() {
        return (((((((((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31) + C786410Ut5.Y2(this.LIZLLL)) * 31) + this.LJ) * 31) + C786410Ut5.Z2(this.LJFF)) * 31) + C786410Ut5.Z2(this.LJI)) * 31) + this.LJII) * 31) + this.LJIIIIZZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LegacyConversationQueryResult(originQuery=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", conversationList=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", hasMore=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", nextCursor=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", totalCount=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", isFastMode=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", isQuerySuccess=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", errorCode=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", errorMsg=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0Y6X(C869290Y8h c869290Y8h, List list, boolean z, long j, int i, boolean z2, int i2, String str) {
        this.LIZ = c869290Y8h;
        this.LIZIZ = list;
        this.LIZJ = z;
        this.LIZLLL = j;
        this.LJ = i;
        this.LJI = z2;
        this.LJII = i2;
        this.LJIIIIZZ = str;
    }
}
