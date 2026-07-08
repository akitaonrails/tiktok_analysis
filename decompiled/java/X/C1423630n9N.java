package X;

import java.util.List;

/* JADX INFO: renamed from: X.0n9N, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1423630n9N {
    public final EnumC1423670n9R LIZ;
    public final List<C1419590n2r> LIZIZ;
    public final C1422890n8B LIZJ;
    public final int LIZLLL;
    public final C1422880n8A LJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FetchTemplatesResult(status=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", templateList=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", extraData=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", nextCursor=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", errorData=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1423630n9N(EnumC1423670n9R enumC1423670n9R, List<C1419590n2r> list, C1422890n8B c1422890n8B, int i, C1422880n8A c1422880n8A) {
        this.LIZ = enumC1423670n9R;
        this.LIZIZ = list;
        this.LIZJ = c1422890n8B;
        this.LIZLLL = i;
        this.LJ = c1422880n8A;
    }
}
