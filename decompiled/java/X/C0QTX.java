package X;

import com.google.common.util.concurrent.ListenableFuture;
import com.ss.android.ugc.aweme.ecommerce.search.sug.repo.EcSearchSugResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0QTX, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QTX {
    public final long LIZ;
    public final long LIZIZ;
    public final C670840QTa LIZJ;
    public final long LIZLLL;
    public final C670780QSu LJ;
    public ListenableFuture<EcSearchSugResponse> LJFF;
    public volatile boolean LJI;

    public C0QTX() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0QTX)) {
            return false;
        }
        C0QTX c0qtx = (C0QTX) obj;
        return this.LIZ == c0qtx.LIZ && this.LIZIZ == c0qtx.LIZIZ && Intrinsics.LJFF(this.LIZJ, c0qtx.LIZJ) && this.LIZLLL == c0qtx.LIZLLL && Intrinsics.LJFF(this.LJ, c0qtx.LJ) && Intrinsics.LJFF(this.LJFF, c0qtx.LJFF) && this.LJI == c0qtx.LJI;
    }

    public final int hashCode() {
        int iY2 = ((((((((C786410Ut5.Y2(this.LIZ) * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + this.LIZJ.hashCode()) * 31) + C786410Ut5.Y2(this.LIZLLL)) * 31) + this.LJ.hashCode()) * 31;
        ListenableFuture<EcSearchSugResponse> listenableFuture = this.LJFF;
        return ((iY2 + (listenableFuture == null ? 0 : listenableFuture.hashCode())) * 31) + C786410Ut5.Z2(this.LJI);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RequestTaskWrapper(requestId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", requestOrder=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", param=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", startRequestTimeMillis=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", optimizedPerfContext=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", task=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", isCanceled=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0QTX(long j, long j2, C670840QTa c670840QTa, long j3, C670780QSu c670780QSu) {
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = c670840QTa;
        this.LIZLLL = j3;
        this.LJ = c670780QSu;
        this.LJFF = null;
        this.LJI = false;
    }
}
