package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.096C, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C096C extends C096D {
    public final int LIZIZ;
    public final String LIZJ;
    public final Map<String, String> LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C096C)) {
            return false;
        }
        C096C c096c = (C096C) obj;
        return this.LIZIZ == c096c.LIZIZ && Intrinsics.LJFF(this.LIZJ, c096c.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c096c.LIZLLL);
    }

    public final int hashCode() {
        return (((this.LIZIZ * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Failure(code=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", msg=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", extraParams=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C096D
    public final Map<String, String> LIZ() {
        return this.LIZLLL;
    }

    public C096C(int i, String str, Map<String, String> map) {
        super(map);
        this.LIZIZ = i;
        this.LIZJ = str;
        this.LIZLLL = map;
    }
}
