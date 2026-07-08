package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07de, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1908007de extends AbstractC1907907dd {
    public final String LIZ;
    public final Map<String, String> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1908007de)) {
            return false;
        }
        C1908007de c1908007de = (C1908007de) obj;
        return Intrinsics.LJFF(this.LIZ, c1908007de.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1908007de.LIZIZ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        Map<String, String> map = this.LIZIZ;
        return iHashCode + (map == null ? 0 : map.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MapEvent(name=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", parameters=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1907907dd
    public final String LIZ() {
        return this.LIZ;
    }

    @Override // X.AbstractC1907907dd
    public final Map<String, Object> LIZIZ() {
        return this.LIZIZ;
    }

    public C1908007de(String str, Map<String, String> map) {
        this.LIZ = str;
        this.LIZIZ = map;
    }
}
