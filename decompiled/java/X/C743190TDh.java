package X;

import com.byted.cast.common.source.ServiceInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0TDh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C743190TDh extends AbstractC743230TDl {
    public final ServiceInfo LIZ;
    public final int LIZIZ;
    public final int LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C743190TDh)) {
            return false;
        }
        C743190TDh c743190TDh = (C743190TDh) obj;
        return Intrinsics.LJFF(this.LIZ, c743190TDh.LIZ) && this.LIZIZ == c743190TDh.LIZIZ && this.LIZJ == c743190TDh.LIZJ;
    }

    public final int hashCode() {
        ServiceInfo serviceInfo = this.LIZ;
        return ((((serviceInfo == null ? 0 : serviceInfo.hashCode()) * 31) + this.LIZIZ) * 31) + this.LIZJ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Disconnect(serviceInfo=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", what=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", extra=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C743190TDh(ServiceInfo serviceInfo, int i, int i2) {
        this.LIZ = serviceInfo;
        this.LIZIZ = i;
        this.LIZJ = i2;
    }
}
