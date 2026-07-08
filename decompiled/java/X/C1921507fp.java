package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07fp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1921507fp {
    public final String LIZ;
    public final List<String> LIZIZ;
    public final int LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1921507fp)) {
            return false;
        }
        C1921507fp c1921507fp = (C1921507fp) obj;
        return Intrinsics.LJFF(this.LIZ, c1921507fp.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1921507fp.LIZIZ) && this.LIZJ == c1921507fp.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DeferredMigration(id=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", sqlStatements=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", priority=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1921507fp(String str, List<String> list, int i) {
        this.LIZ = str;
        this.LIZIZ = list;
        this.LIZJ = i;
    }
}
