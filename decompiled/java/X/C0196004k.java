package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.004k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0196004k {
    public final boolean LIZ;
    public final List<String> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0196004k)) {
            return false;
        }
        C0196004k c0196004k = (C0196004k) obj;
        return this.LIZ == c0196004k.LIZ && Intrinsics.LJFF(this.LIZIZ, c0196004k.LIZIZ);
    }

    public final int hashCode() {
        return (C786410Ut5.Z2(this.LIZ) * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ProbeTTSIntegrationConfig(enabled=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", urlEnableList=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0196004k() {
        this(false, C13BV.INSTANCE);
    }

    public C0196004k(boolean z, List<String> list) {
        this.LIZ = z;
        this.LIZIZ = list;
    }
}
