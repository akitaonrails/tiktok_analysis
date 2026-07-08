package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Tzh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C765030Tzh extends AbstractC764660Tz6 {
    public final long LIZ;
    public final List<C0U22> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C765030Tzh)) {
            return false;
        }
        C765030Tzh c765030Tzh = (C765030Tzh) obj;
        return this.LIZ == c765030Tzh.LIZ && Intrinsics.LJFF(this.LIZIZ, c765030Tzh.LIZIZ);
    }

    public final int hashCode() {
        return (C786410Ut5.Y2(this.LIZ) * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UpdateSongList(tabId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", songList=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C765030Tzh(long j, List<C0U22> list) {
        this.LIZ = j;
        this.LIZIZ = list;
    }
}
