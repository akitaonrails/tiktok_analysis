package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07ZX, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07ZX {
    public final String LIZ;
    public final Map<String, C0ZIY> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C07ZX)) {
            return false;
        }
        C07ZX c07zx = (C07ZX) obj;
        return Intrinsics.LJFF(this.LIZ, c07zx.LIZ) && Intrinsics.LJFF(this.LIZIZ, c07zx.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EncodedDesc(description=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", mentionMap=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C07ZX(String str, Map<String, C0ZIY> map) {
        this.LIZ = str;
        this.LIZIZ = map;
    }
}
