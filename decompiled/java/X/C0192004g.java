package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.004g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0192004g {
    public final String LIZ;
    public final String LIZIZ;
    public final List<C0120001m> LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0192004g)) {
            return false;
        }
        C0192004g c0192004g = (C0192004g) obj;
        return Intrinsics.LJFF(this.LIZ, c0192004g.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0192004g.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0192004g.LIZJ);
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ToolSpecification(name=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", description=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", parameters=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0192004g(String str, String str2, List<C0120001m> list) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = list;
    }
}
