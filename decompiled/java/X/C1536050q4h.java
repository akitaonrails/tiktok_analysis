package X;

import java.io.File;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0q4h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1536050q4h extends AbstractC1536120q4o {
    public final String LIZLLL;
    public final C1529350ptt LJ;
    public final String LJFF;
    public final String LJI;
    public final String LJII;
    public final C0VSJ LJIIIIZZ;

    @Override // X.AbstractC1536120q4o
    public final String LIZIZ() {
        return this.LJII;
    }

    @Override // X.AbstractC1536120q4o
    public final C0VSJ LIZJ() {
        return this.LJIIIIZZ;
    }

    @Override // X.AbstractC1536120q4o
    public final C1529350ptt LIZLLL() {
        return this.LJ;
    }

    @Override // X.AbstractC1536120q4o
    public final String LJ() {
        return this.LJI;
    }

    @Override // X.AbstractC1536120q4o
    public final String LJFF() {
        return this.LIZLLL;
    }

    public C1536050q4h(C1529350ptt c1529350ptt, String str, String str2, String str3) {
        this.LIZLLL = str;
        this.LJ = c1529350ptt;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C13LN.LJZL(4, c1529350ptt.LIZ));
        sbLIZ.append('#');
        sbLIZ.append(c1529350ptt.LIZIZ);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        this.LJFF = strLIZIZ;
        String strLJJI = u.LJJI(c1529350ptt.LIZJ, '/', '#', false);
        this.LJI = str3 == null ? "" : str3;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(strLIZIZ);
        String str4 = File.separator;
        sbLIZ2.append(str4);
        sbLIZ2.append(str2);
        sbLIZ2.append(str4);
        sbLIZ2.append(strLJJI);
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
        this.LJII = strLIZIZ2;
        this.LJIIIIZZ = new C0VSJ(AbstractC1536120q4o.LIZIZ.LIZIZ(), strLIZIZ2);
    }
}
