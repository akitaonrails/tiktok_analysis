package X;

import kotlin.jvm.internal.Intrinsics;
import webcast.api.sub.SpaceActivityListResponse;

/* JADX INFO: renamed from: X.0Jw3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C507970Jw3 implements InterfaceC0148002o {
    public final C291001Au<SpaceActivityListResponse.ResponseData> LL;
    public final C291001Au<Throwable> LLILLJJLI;

    public C507970Jw3() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C507970Jw3)) {
            return false;
        }
        C507970Jw3 c507970Jw3 = (C507970Jw3) obj;
        return Intrinsics.LJFF(this.LL, c507970Jw3.LL) && Intrinsics.LJFF(this.LLILLJJLI, c507970Jw3.LLILLJJLI);
    }

    public final int hashCode() {
        C291001Au<SpaceActivityListResponse.ResponseData> c291001Au = this.LL;
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
    public C507970Jw3(C291001Au<SpaceActivityListResponse.ResponseData> c291001Au, C291001Au<? extends Throwable> c291001Au2) {
        this.LL = c291001Au;
        this.LLILLJJLI = c291001Au2;
    }
}
