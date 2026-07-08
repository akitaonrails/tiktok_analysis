package X;

import java.util.List;

/* JADX INFO: renamed from: X.1Aq9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2191711Aq9 {
    public final int LIZ;
    public final C2191951AqX LIZIZ;
    public final int LIZJ;
    public final C2191721AqA LIZLLL;
    public final C2191731AqB LJ;
    public final C1308600k9q LJFF;
    public final List<String> LJI;
    public final String LJII;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GroupConfig-");
        sbLIZ.append(this.LIZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C2191711Aq9(int i, C2191951AqX c2191951AqX, int i2, C2191721AqA c2191721AqA, C2191731AqB c2191731AqB, C1308600k9q c1308600k9q, List<String> list, String str) {
        this.LIZ = i;
        this.LIZIZ = c2191951AqX;
        this.LIZJ = i2;
        this.LIZLLL = c2191721AqA;
        this.LJ = c2191731AqB;
        this.LJFF = c1308600k9q;
        this.LJI = list;
        this.LJII = str;
        if (i2 <= 0) {
            c2191721AqA.LIZLLL = Integer.MAX_VALUE;
        } else {
            if (c2191721AqA.LIZLLL > 0) {
                return;
            }
            int i3 = 60 / i2;
            c2191721AqA.LIZLLL = i3 < 10 ? 10 : i3;
        }
    }
}
