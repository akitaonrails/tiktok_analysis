package X;

import java.util.List;

/* JADX INFO: renamed from: X.0NHu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C591480NHu {
    public final boolean LIZ;
    public final C0NHH LIZIZ;
    public final String LIZJ;
    public final List<C0NHH> LIZLLL;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CacheLoadResult(success=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", value=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", msg=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", values=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C591480NHu(boolean z, C0NHH c0nhh, String str, List<C0NHH> list) {
        this.LIZ = z;
        this.LIZIZ = c0nhh;
        this.LIZJ = str;
        this.LIZLLL = list;
    }

    public /* synthetic */ C591480NHu(boolean z, C0NHH c0nhh, String str, int i) {
        this(z, c0nhh, (i & 4) != 0 ? null : str, (List<C0NHH>) null);
    }
}
