package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07an, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1890307an extends AbstractC1890407ao {
    public final int LIZ;
    public final int LIZIZ;
    public final Integer LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1890307an)) {
            return false;
        }
        C1890307an c1890307an = (C1890307an) obj;
        return this.LIZ == c1890307an.LIZ && this.LIZIZ == c1890307an.LIZIZ && Intrinsics.LJFF(this.LIZJ, c1890307an.LIZJ);
    }

    public final int hashCode() {
        int i = ((this.LIZ * 31) + this.LIZIZ) * 31;
        Integer num = this.LIZJ;
        return i + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DotsBar(rating=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", dotCount=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", dotsColor=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1890307an(int i, int i2, Integer num) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = num;
    }
}
