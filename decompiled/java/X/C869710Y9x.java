package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Y9x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C869710Y9x {
    public static final /* synthetic */ int LJI = 0;
    public final List<C869690Y9v> LIZ;
    public final C0YAL LIZIZ;
    public final int LIZJ;
    public final long LIZLLL;
    public final boolean LJ;
    public final String LJFF;

    static {
        new C869770YAd();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C869710Y9x)) {
            return false;
        }
        C869710Y9x c869710Y9x = (C869710Y9x) obj;
        return Intrinsics.LJFF(this.LIZ, c869710Y9x.LIZ) && this.LIZIZ == c869710Y9x.LIZIZ && this.LIZJ == c869710Y9x.LIZJ && this.LIZLLL == c869710Y9x.LIZLLL && this.LJ == c869710Y9x.LJ && Intrinsics.LJFF(this.LJFF, c869710Y9x.LJFF);
    }

    public final int hashCode() {
        return (((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ) * 31) + C786410Ut5.Y2(this.LIZLLL)) * 31) + C786410Ut5.Z2(this.LJ)) * 31) + this.LJFF.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ConversationQuery(filters=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", orderBy=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", limit=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", cursor=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", includeStranger=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", seqId=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C869710Y9x(List<C869690Y9v> list, C0YAL c0yal, int i, long j, boolean z, String str) {
        this.LIZ = list;
        this.LIZIZ = c0yal;
        this.LIZJ = i;
        this.LIZLLL = j;
        this.LJ = z;
        this.LJFF = str;
        if (!list.isEmpty()) {
            return;
        }
        "At least one filter is required".toString();
        throw new IllegalArgumentException("At least one filter is required");
    }
}
