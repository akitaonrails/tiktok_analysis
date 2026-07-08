package X;

import com.ss.android.ugc.aweme.im.streaming.api.BlockUIData;
import com.ss.android.ugc.aweme.im.streaming.api.StreamingResponseData;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0YVc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C875220YVc {
    public final List<BlockUIData> LIZ;
    public final StreamingResponseData LIZIZ;
    public final String LIZJ;
    public final boolean LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C875220YVc)) {
            return false;
        }
        C875220YVc c875220YVc = (C875220YVc) obj;
        return Intrinsics.LJFF(this.LIZ, c875220YVc.LIZ) && Intrinsics.LJFF(this.LIZIZ, c875220YVc.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c875220YVc.LIZJ) && this.LIZLLL == c875220YVc.LIZLLL;
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31;
        String str = this.LIZJ;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + C786410Ut5.Z2(this.LIZLLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StreamResumeData(blocks=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", streamingData=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", businessScene=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", isCancelledByUser=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C875220YVc(List<BlockUIData> list, StreamingResponseData streamingResponseData, String str, boolean z) {
        this.LIZ = list;
        this.LIZIZ = streamingResponseData;
        this.LIZJ = str;
        this.LIZLLL = z;
    }
}
