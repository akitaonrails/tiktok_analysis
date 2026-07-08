package X;

import com.ss.android.ugc.aweme.aigc.asynctask.SummarySegment;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.08hO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2186008hO {
    public final String LIZ;
    public final List<SummarySegment> LIZIZ;
    public final long LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2186008hO)) {
            return false;
        }
        C2186008hO c2186008hO = (C2186008hO) obj;
        return Intrinsics.LJFF(this.LIZ, c2186008hO.LIZ) && Intrinsics.LJFF(this.LIZIZ, c2186008hO.LIZIZ) && this.LIZJ == c2186008hO.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Y2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SummaryComposeResult(outputPath=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", segments=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", totalDurationMs=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C2186008hO(String str, List<SummarySegment> list, long j) {
        this.LIZ = str;
        this.LIZIZ = list;
        this.LIZJ = j;
    }
}
