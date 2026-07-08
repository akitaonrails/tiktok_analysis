package X;

import com.ss.android.ugc.aweme.subscription.pgc.data.model.PgcCheckSubOrderResultStruct;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0KNR, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KNR {
    public final boolean LIZ;
    public final PgcCheckSubOrderResultStruct LIZIZ;
    public final Throwable LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0KNR)) {
            return false;
        }
        C0KNR c0knr = (C0KNR) obj;
        return this.LIZ == c0knr.LIZ && Intrinsics.LJFF(this.LIZIZ, c0knr.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0knr.LIZJ);
    }

    public final int hashCode() {
        int iZ2 = C786410Ut5.Z2(this.LIZ) * 31;
        PgcCheckSubOrderResultStruct pgcCheckSubOrderResultStruct = this.LIZIZ;
        int iHashCode = (iZ2 + (pgcCheckSubOrderResultStruct == null ? 0 : pgcCheckSubOrderResultStruct.hashCode())) * 31;
        Throwable th = this.LIZJ;
        return iHashCode + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PollingCheckOrderResult(isSuccess=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", result=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", throwable=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0KNR(boolean z, PgcCheckSubOrderResultStruct pgcCheckSubOrderResultStruct, Throwable th) {
        this.LIZ = z;
        this.LIZIZ = pgcCheckSubOrderResultStruct;
        this.LIZJ = th;
    }
}
