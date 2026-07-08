package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.096E, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C096E extends C096D {
    public final String LIZIZ;
    public final Map<String, String> LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C096E)) {
            return false;
        }
        C096E c096e = (C096E) obj;
        return Intrinsics.LJFF(this.LIZIZ, c096e.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c096e.LIZJ);
    }

    public final int hashCode() {
        return (this.LIZIZ.hashCode() * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Success(json=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", extraParams=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C096D
    public final Map<String, String> LIZ() {
        return this.LIZJ;
    }

    public C096E(String str, Map<String, String> map) {
        super(map);
        this.LIZIZ = str;
        this.LIZJ = map;
    }
}
