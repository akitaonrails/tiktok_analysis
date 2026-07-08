package X;

import java.util.List;

/* JADX INFO: renamed from: X.00gq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C144200gq {
    public final boolean LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final int LJ;
    public final List<C144300gr> LJFF;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AMEGreenScreenTutorialConfig(enable=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", container=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", url=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", containerParameters=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", version=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", prefetchDataList=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C144200gq(boolean z, String str, String str2, String str3, int i, List<C144300gr> list) {
        this.LIZ = z;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.LJ = i;
        this.LJFF = list;
    }
}
