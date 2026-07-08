package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0g7Y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1153420g7Y {
    public final boolean LIZ;
    public final C1153410g7X LIZIZ;
    public final C1153410g7X LIZJ;
    public final C1153410g7X LIZLLL;

    public C1153420g7Y() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1153420g7Y)) {
            return false;
        }
        C1153420g7Y c1153420g7Y = (C1153420g7Y) obj;
        return this.LIZ == c1153420g7Y.LIZ && Intrinsics.LJFF(this.LIZIZ, c1153420g7Y.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1153420g7Y.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1153420g7Y.LIZLLL);
    }

    public final int hashCode() {
        return (((((C786410Ut5.Z2(this.LIZ) * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CertSignalsConfig(enabled=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", wifi=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", cell=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", sensor=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1153420g7Y(int i) {
        this(true, new C1153410g7X(0), new C1153410g7X(0), new C1153410g7X(0));
    }

    public final boolean LIZ(EnumC1153450g7b enumC1153450g7b, String str, List<String> list) {
        C1153410g7X c1153410g7X;
        if (this.LIZ) {
            int i = C1153430g7Z.LIZ[enumC1153450g7b.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        c1153410g7X = this.LIZLLL;
                    } else {
                        throw new C1954807lC();
                    }
                } else {
                    c1153410g7X = this.LIZJ;
                }
            } else {
                c1153410g7X = this.LIZIZ;
            }
            if (str == null) {
                c1153410g7X.getClass();
            } else if (!c1153410g7X.LIZIZ.contains(str)) {
                if (!(!c1153410g7X.LIZ.isEmpty())) {
                    return true;
                }
                return c1153410g7X.LIZ.contains(str);
            }
            return false;
        }
        if (list == null) {
            return true;
        }
        return list.contains(enumC1153450g7b.getKey());
    }

    public C1153420g7Y(boolean z, C1153410g7X c1153410g7X, C1153410g7X c1153410g7X2, C1153410g7X c1153410g7X3) {
        this.LIZ = z;
        this.LIZIZ = c1153410g7X;
        this.LIZJ = c1153410g7X2;
        this.LIZLLL = c1153410g7X3;
    }
}
