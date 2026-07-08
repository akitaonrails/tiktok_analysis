package X;

import kotlin.jvm.internal.Intrinsics;
import webcast.api.sub.GetSubOnlyLiveInfoResponse;

/* JADX INFO: renamed from: X.0JYI, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JYI implements InterfaceC0148002o {
    public final GetSubOnlyLiveInfoResponse LL;
    public final C493830JYf LLILLJJLI;

    public C0JYI() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0JYI)) {
            return false;
        }
        C0JYI c0jyi = (C0JYI) obj;
        return Intrinsics.LJFF(this.LL, c0jyi.LL) && Intrinsics.LJFF(this.LLILLJJLI, c0jyi.LLILLJJLI);
    }

    public final int hashCode() {
        GetSubOnlyLiveInfoResponse getSubOnlyLiveInfoResponse = this.LL;
        int iHashCode = (getSubOnlyLiveInfoResponse == null ? 0 : getSubOnlyLiveInfoResponse.hashCode()) * 31;
        C493830JYf c493830JYf = this.LLILLJJLI;
        return iHashCode + (c493830JYf != null ? c493830JYf.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SubOnlyLiveSettingState(vipData=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", vipChoice=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0JYI(GetSubOnlyLiveInfoResponse getSubOnlyLiveInfoResponse, C493830JYf c493830JYf) {
        this.LL = getSubOnlyLiveInfoResponse;
        this.LLILLJJLI = c493830JYf;
    }
}
