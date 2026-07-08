package X;

import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.012Q, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C012Q {
    public final Object LIZ;
    public final HashMap<String, Object> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C012Q)) {
            return false;
        }
        C012Q c012q = (C012Q) obj;
        return Intrinsics.LJFF(this.LIZ, c012q.LIZ) && Intrinsics.LJFF(this.LIZIZ, c012q.LIZIZ);
    }

    public final int hashCode() {
        Object obj = this.LIZ;
        return ((obj == null ? 0 : obj.hashCode()) * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SeaContentContextBean(value=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", observers=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C012Q(Object obj, HashMap<String, Object> map) {
        this.LIZ = obj;
        this.LIZIZ = map;
    }
}
