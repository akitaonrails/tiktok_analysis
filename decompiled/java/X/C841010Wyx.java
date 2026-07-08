package X;

import com.bytedance.helios.network.api.service.INetworkApiService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Wyx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C841010Wyx {
    public final InterfaceC823460WSa LIZ;
    public final C840660WyO LIZIZ;
    public final INetworkApiService LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C841010Wyx)) {
            return false;
        }
        C841010Wyx c841010Wyx = (C841010Wyx) obj;
        return Intrinsics.LJFF(this.LIZ, c841010Wyx.LIZ) && Intrinsics.LJFF(this.LIZIZ, c841010Wyx.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c841010Wyx.LIZJ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        C840660WyO c840660WyO = this.LIZIZ;
        int iHashCode2 = (iHashCode + (c840660WyO == null ? 0 : c840660WyO.hashCode())) * 31;
        INetworkApiService iNetworkApiService = this.LIZJ;
        return iHashCode2 + (iNetworkApiService != null ? iNetworkApiService.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ExecutionTargetRef(event=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", apiEvent=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", accessor=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C841010Wyx(InterfaceC823460WSa interfaceC823460WSa, C840660WyO c840660WyO, INetworkApiService iNetworkApiService) {
        this.LIZ = interfaceC823460WSa;
        this.LIZIZ = c840660WyO;
        this.LIZJ = iNetworkApiService;
    }
}
