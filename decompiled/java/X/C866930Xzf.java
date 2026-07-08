package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Xzf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C866930Xzf {
    public final C869710Y9x LIZ;
    public final long LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C866930Xzf)) {
            return false;
        }
        C866930Xzf c866930Xzf = (C866930Xzf) obj;
        return Intrinsics.LJFF(this.LIZ, c866930Xzf.LIZ) && this.LIZIZ == c866930Xzf.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + C786410Ut5.Y2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ConversationCountResult(query=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", count=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C866930Xzf(C869710Y9x c869710Y9x, long j) {
        this.LIZ = c869710Y9x;
        this.LIZIZ = j;
    }
}
