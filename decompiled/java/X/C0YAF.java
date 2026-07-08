package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0YAF, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YAF {
    public final String LIZ;
    public final AbstractC1262404wo LIZIZ;
    public final C0YA9 LIZJ;
    public final int LIZLLL;

    public C0YAF() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0YAF)) {
            return false;
        }
        C0YAF c0yaf = (C0YAF) obj;
        return Intrinsics.LJFF(this.LIZ, c0yaf.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0yaf.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0yaf.LIZJ) && this.LIZLLL == c0yaf.LIZLLL;
    }

    public final int hashCode() {
        return (((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("KvPropertyFilter(key=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", value=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", numValue=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", hasKey=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0YAF(int i) {
        C1262504wp c1262504wp = C1262504wp.LIZIZ;
        C0YA9 c0ya9 = new C0YA9(0);
        this.LIZ = "\u0000__UNSET_KEY__\u0000";
        this.LIZIZ = c1262504wp;
        this.LIZJ = c0ya9;
        this.LIZLLL = -1;
    }
}
