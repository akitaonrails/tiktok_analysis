package X;

import com.bytedance.aigc.proto.Business;
import com.bytedance.aigc.proto.Scene;
import com.bytedance.aigc.proto.Tenant;

/* JADX INFO: renamed from: X.0Ld8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C547200Ld8 {
    public final Tenant LIZ;
    public final Business LIZIZ;
    public final Scene LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C547200Ld8)) {
            return false;
        }
        C547200Ld8 c547200Ld8 = (C547200Ld8) obj;
        return this.LIZ == c547200Ld8.LIZ && this.LIZIZ == c547200Ld8.LIZIZ && this.LIZJ == c547200Ld8.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIKitTraceKey(tenant=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", business=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", scene=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C547200Ld8(Tenant tenant, Business business, Scene scene) {
        this.LIZ = tenant;
        this.LIZIZ = business;
        this.LIZJ = scene;
    }
}
