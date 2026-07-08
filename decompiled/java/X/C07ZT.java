package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07ZT, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07ZT extends C07ZV {
    public final Map<String, Object> LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C07ZT) && Intrinsics.LJFF(this.LIZ, ((C07ZT) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Success(response=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C07ZT(Map<String, ? extends Object> map) {
        this.LIZ = map;
    }
}
