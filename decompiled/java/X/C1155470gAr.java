package X;

import com.ss.android.ugc.aweme.model.PaidContentVideoListResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gAr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1155470gAr implements InterfaceC0148002o {
    public final PaidContentVideoListResponse LL;

    public C1155470gAr() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1155470gAr) && Intrinsics.LJFF(this.LL, ((C1155470gAr) obj).LL);
    }

    public final int hashCode() {
        PaidContentVideoListResponse paidContentVideoListResponse = this.LL;
        if (paidContentVideoListResponse == null) {
            return 0;
        }
        return paidContentVideoListResponse.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SeriesVideoPreloadState(videoListResponse=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1155470gAr(int i) {
        this.LL = null;
    }
}
