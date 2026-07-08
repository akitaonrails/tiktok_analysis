package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07ZQ, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07ZQ extends C07ZS {
    public final Map<String, Object> LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C07ZQ) && Intrinsics.LJFF(this.LIZ, ((C07ZQ) obj).LIZ);
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

    public C07ZQ(Map<String, ? extends Object> map) {
        this.LIZ = map;
    }
}
