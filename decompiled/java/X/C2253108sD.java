package X;

import com.ss.android.ugc.aweme.music.understanding.ContentUnderstandingResult;
import com.ss.android.ugc.aweme.music.understanding.NodeTag;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.08sD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2253108sD {
    public final long LIZ;
    public final C11PR<ContentUnderstandingResult> LIZIZ;
    public final AtomicReference<NodeTag> LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2253108sD)) {
            return false;
        }
        C2253108sD c2253108sD = (C2253108sD) obj;
        return this.LIZ == c2253108sD.LIZ && Intrinsics.LJFF(this.LIZIZ, c2253108sD.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c2253108sD.LIZJ);
    }

    public final int hashCode() {
        return (((C786410Ut5.Y2(this.LIZ) * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ResultStream(runId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", subject=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", lastFailedNodeTag=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C2253108sD(long j, C11PR<ContentUnderstandingResult> c11pr, AtomicReference<NodeTag> atomicReference) {
        this.LIZ = j;
        this.LIZIZ = c11pr;
        this.LIZJ = atomicReference;
    }
}
