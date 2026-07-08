package X;

import com.byted.cast.common.source.ServiceInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0TDt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C743310TDt extends AbstractC743230TDl {
    public final ServiceInfo LIZ;
    public final int LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C743310TDt)) {
            return false;
        }
        C743310TDt c743310TDt = (C743310TDt) obj;
        return Intrinsics.LJFF(this.LIZ, c743310TDt.LIZ) && this.LIZIZ == c743310TDt.LIZIZ;
    }

    public final int hashCode() {
        ServiceInfo serviceInfo = this.LIZ;
        return ((serviceInfo == null ? 0 : serviceInfo.hashCode()) * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Connected(serviceInfo=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", extra=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C743310TDt(ServiceInfo serviceInfo, int i) {
        this.LIZ = serviceInfo;
        this.LIZIZ = i;
    }
}
