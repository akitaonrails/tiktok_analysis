package X;

import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0VSW, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VSW {
    public final UUID LIZ;
    public final long LIZIZ;

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + C786410Ut5.Y2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BattleItemExtraTimeCardSentParams(matchItemId=");
        sbLIZ.append((Object) this.LIZ.toString());
        sbLIZ.append(", extraTime=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0VSW)) {
            return false;
        }
        C0VSW c0vsw = (C0VSW) obj;
        if (Intrinsics.LJFF(this.LIZ, c0vsw.LIZ) && this.LIZIZ == c0vsw.LIZIZ) {
            return true;
        }
        return false;
    }

    public C0VSW(UUID uuid, long j) {
        this.LIZ = uuid;
        this.LIZIZ = j;
    }
}
