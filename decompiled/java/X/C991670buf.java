package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0buf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C991670buf extends AbstractC991610buZ {
    public final int LIZ = 1;
    public final Map<String, Object> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C991670buf)) {
            return false;
        }
        C991670buf c991670buf = (C991670buf) obj;
        return this.LIZ == c991670buf.LIZ && Intrinsics.LJFF(this.LIZIZ, c991670buf.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Tap(touchNumber=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", tapParams=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C991670buf(Map map) {
        this.LIZIZ = map;
    }
}
