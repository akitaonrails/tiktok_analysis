package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0pTx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1513270pTx {
    public static final /* synthetic */ int LIZLLL = 0;
    public final int LIZ;
    public C1513280pTy LIZIZ = C1513280pTy.LIZLLL;
    public final List<C1513280pTy> LIZJ = new ArrayList();

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIPredictResult{status=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", predic=");
        sbLIZ.append(this.LIZIZ.LIZ);
        sbLIZ.append(", confid=");
        sbLIZ.append(this.LIZIZ.LIZJ);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1513270pTx(int i) {
        this.LIZ = i;
    }

    public final void LIZ(C1513280pTy c1513280pTy) {
        if (Intrinsics.LJFF(this.LIZIZ, C1513280pTy.LIZLLL) || c1513280pTy.LIZJ > this.LIZIZ.LIZJ) {
            this.LIZIZ = c1513280pTy;
        }
        ((ArrayList) this.LIZJ).add(c1513280pTy);
    }
}
