package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.096B, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C096B extends C096D {
    public final AbstractC23165095v LIZIZ;
    public final float LIZJ;
    public final int LIZLLL;
    public final String LJ;
    public final Map<String, String> LJFF;

    public C096B() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C096B)) {
            return false;
        }
        C096B c096b = (C096B) obj;
        return Intrinsics.LJFF(this.LIZIZ, c096b.LIZIZ) && Float.compare(this.LIZJ, c096b.LIZJ) == 0 && this.LIZLLL == c096b.LIZLLL && Intrinsics.LJFF(this.LJ, c096b.LJ) && Intrinsics.LJFF(this.LJFF, c096b.LJFF);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Info(type=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", progress=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", code=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", msg=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", extraParams=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        int iHashCode = ((((this.LIZIZ.hashCode() * 31) + Float.floatToIntBits(this.LIZJ)) * 31) + this.LIZLLL) * 31;
        String str = this.LJ;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.LJFF.hashCode();
    }

    @Override // X.C096D
    public final Map<String, String> LIZ() {
        return this.LJFF;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C096B(AbstractC23165095v abstractC23165095v, float f, String str, Map map, int i) {
        super(map);
        str = (i & 8) != 0 ? null : str;
        this.LIZIZ = abstractC23165095v;
        this.LIZJ = f;
        this.LIZLLL = 0;
        this.LJ = str;
        this.LJFF = map;
    }
}
