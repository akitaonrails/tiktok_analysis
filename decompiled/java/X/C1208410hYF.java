package X;

import java.util.List;

/* JADX INFO: renamed from: X.0hYF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1208410hYF {
    public final EnumC1208400hYE LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final List<Long> LIZLLL;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FreqParam(target=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", resultType=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", maxCount=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", minIntervalSec=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1208410hYF(EnumC1208400hYE enumC1208400hYE, int i, int i2, List<Long> list) {
        this.LIZ = enumC1208400hYE;
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = list;
    }
}
