package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qdw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1557900qdw extends AbstractC1556890qcJ {
    public final String LIZ;
    public final Object LIZIZ;
    public final EnumC2215401BnG LIZJ;
    public final EnumC2215431BnJ LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1557900qdw)) {
            return false;
        }
        C1557900qdw c1557900qdw = (C1557900qdw) obj;
        return Intrinsics.LJFF(this.LIZ, c1557900qdw.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1557900qdw.LIZIZ) && this.LIZJ == c1557900qdw.LIZJ && this.LIZLLL == c1557900qdw.LIZLLL;
    }

    public final int hashCode() {
        return (((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LeafFilterNode(key=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", value=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", compare=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", type=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1557900qdw(String str, Object obj, EnumC2215401BnG enumC2215401BnG, EnumC2215431BnJ enumC2215431BnJ) {
        this.LIZ = str;
        this.LIZIZ = obj;
        this.LIZJ = enumC2215401BnG;
        this.LIZLLL = enumC2215431BnJ;
    }
}
