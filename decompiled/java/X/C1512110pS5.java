package X;

import java.util.Map;

/* JADX INFO: renamed from: X.0pS5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1512110pS5 {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final long LIZJ;
    public final boolean LIZLLL;
    public final Map<String, Object> LJ;

    public C1512110pS5() {
        this(0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PredictorResult(success=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", shouldPrerender=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", prerenderDelay=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", shouldPreloadPreview=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", extOutMap=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1512110pS5(int i) {
        this(false, null, 0L, false, true);
    }

    public C1512110pS5(boolean z, Map map, long j, boolean z2, boolean z3) {
        this.LIZ = z;
        this.LIZIZ = z2;
        this.LIZJ = j;
        this.LIZLLL = z3;
        this.LJ = map;
    }
}
