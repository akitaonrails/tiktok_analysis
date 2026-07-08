package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Y0l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C867250Y0l {
    public static final /* synthetic */ int LJ = 0;
    public final C869710Y9x LIZ;
    public final List<C1279304zX> LIZIZ;
    public final boolean LIZJ;
    public final long LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C867250Y0l)) {
            return false;
        }
        C867250Y0l c867250Y0l = (C867250Y0l) obj;
        return Intrinsics.LJFF(this.LIZ, c867250Y0l.LIZ) && Intrinsics.LJFF(this.LIZIZ, c867250Y0l.LIZIZ) && this.LIZJ == c867250Y0l.LIZJ && this.LIZLLL == c867250Y0l.LIZLLL;
    }

    public final int hashCode() {
        return (((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31) + C786410Ut5.Y2(this.LIZLLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ConversationIdQueryResult(query=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", conversationIds=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", hasMore=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", nextCursor=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C867250Y0l(C869710Y9x c869710Y9x, List<C1279304zX> list, boolean z, long j) {
        this.LIZ = c869710Y9x;
        this.LIZIZ = list;
        this.LIZJ = z;
        this.LIZLLL = j;
    }
}
