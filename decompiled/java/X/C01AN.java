package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.01AN, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01AN {
    public final int LIZ;
    public final int LIZIZ;
    public final List<AbstractC1126600fQI<? extends AnonymousClass0054>> LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C01AN)) {
            return false;
        }
        C01AN c01an = (C01AN) obj;
        return this.LIZ == c01an.LIZ && this.LIZIZ == c01an.LIZIZ && Intrinsics.LJFF(this.LIZJ, c01an.LIZJ);
    }

    public final int hashCode() {
        return (((this.LIZ * 31) + this.LIZIZ) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SectionInsertResult(insertPosition=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", entranceColumn=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", sectionList=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C01AN(int i, int i2, List<AbstractC1126600fQI<? extends AnonymousClass0054>> list) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = list;
    }
}
