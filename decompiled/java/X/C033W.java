package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.033W, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C033W {
    public final boolean LIZ;
    public final Map<Class<?>, Object> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C033W)) {
            return false;
        }
        C033W c033w = (C033W) obj;
        return this.LIZ == c033w.LIZ && Intrinsics.LJFF(this.LIZIZ, c033w.LIZIZ);
    }

    public final int hashCode() {
        return (C786410Ut5.Z2(this.LIZ) * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PdpListTransformContext(firstScreenModuleFilterEnabled=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", transformDataProviders=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C033W() {
        this(false, C2097608Jq.LJ());
    }

    public C033W(boolean z, Map<Class<?>, ? extends Object> map) {
        this.LIZ = z;
        this.LIZIZ = map;
    }
}
