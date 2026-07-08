package X;

import kotlin.jvm.internal.Intrinsics;
import webcast.api.pgc_sub.PGCSpaceActivityListResponse;

/* JADX INFO: renamed from: X.0K27, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0K27 implements InterfaceC0148002o {
    public final C291001Au<PGCSpaceActivityListResponse.ResponseData> LL;
    public final C291001Au<Throwable> LLILLJJLI;

    public C0K27() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0K27)) {
            return false;
        }
        C0K27 c0k27 = (C0K27) obj;
        return Intrinsics.LJFF(this.LL, c0k27.LL) && Intrinsics.LJFF(this.LLILLJJLI, c0k27.LLILLJJLI);
    }

    public final int hashCode() {
        C291001Au<PGCSpaceActivityListResponse.ResponseData> c291001Au = this.LL;
        int iHashCode = (c291001Au == null ? 0 : c291001Au.hashCode()) * 31;
        C291001Au<Throwable> c291001Au2 = this.LLILLJJLI;
        return iHashCode + (c291001Au2 != null ? c291001Au2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SubSpaceActivityListVMState(activityListDataFetchSuccess=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", activityListDataFetchFailed=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0K27(C291001Au<PGCSpaceActivityListResponse.ResponseData> c291001Au, C291001Au<? extends Throwable> c291001Au2) {
        this.LL = c291001Au;
        this.LLILLJJLI = c291001Au2;
    }
}
