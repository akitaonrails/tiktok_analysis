package X;

import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fts, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1144940fts {
    public final UUID LIZ;
    public long LIZIZ;

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + C786410Ut5.Y2(this.LIZIZ);
    }

    public /* synthetic */ C1144940fts() {
        this(C1145010ftz.LIZ(), -1000L);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MatchItemTimer(matchItemId=");
        sbLIZ.append((Object) this.LIZ.toString());
        sbLIZ.append(", timeLeft=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1144940fts)) {
            return false;
        }
        C1144940fts c1144940fts = (C1144940fts) obj;
        if (Intrinsics.LJFF(this.LIZ, c1144940fts.LIZ) && this.LIZIZ == c1144940fts.LIZIZ) {
            return true;
        }
        return false;
    }

    public C1144940fts(UUID uuid, long j) {
        this.LIZ = uuid;
        this.LIZIZ = j;
    }
}
