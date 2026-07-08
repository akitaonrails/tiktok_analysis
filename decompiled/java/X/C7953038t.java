package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.038t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C7953038t {
    public final C03LS LIZ;
    public final Map<String, Object> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7953038t)) {
            return false;
        }
        C7953038t c7953038t = (C7953038t) obj;
        return this.LIZ == c7953038t.LIZ && Intrinsics.LJFF(this.LIZIZ, c7953038t.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PlaceOrderCheckResult(reason=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", extraParams=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C7953038t(C03LS c03ls) {
        this(c03ls, C2097608Jq.LJ());
    }

    public C7953038t(C03LS c03ls, Map<String, ? extends Object> map) {
        this.LIZ = c03ls;
        this.LIZIZ = map;
    }
}
