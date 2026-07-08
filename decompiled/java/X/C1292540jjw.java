package X;

import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: X.0jjw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1292540jjw {
    public final List<InterfaceC1292590jk1> LIZ;
    public final C1291600jiQ LIZIZ;
    public final String LIZJ;
    public final long LIZLLL;
    public final EnumC1292680jkA LJ;
    public final long LJFF;
    public final String LJI;
    public final List<C1292710jkD> LJII;
    public final C1292750jkH LJIIIIZZ;
    public final int LJIIIZ;
    public final int LJIIJ;
    public final int LJIIJJI;
    public final float LJIIL;
    public final float LJIILIIL;
    public final int LJIILJJIL;
    public final int LJIILL;
    public final C1292950jkb LJIILLIIL;
    public final C1292890jkV LJIIZILJ;
    public final C1292960jkc LJIJ;
    public final List<C1293200jl0<Float>> LJIJI;
    public final EnumC1292530jjv LJIJJ;

    public final String toString() {
        return LIZ("");
    }

    public final String LIZ(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(this.LIZJ);
        sb.append("\n");
        C1292540jjw c1292540jjwLJ = this.LIZIZ.LJI.LJ(this.LJFF);
        if (c1292540jjwLJ != null) {
            sb.append("\t\tParents: ");
            sb.append(c1292540jjwLJ.LIZJ);
            C1292540jjw c1292540jjwLJ2 = this.LIZIZ.LJI.LJ(c1292540jjwLJ.LJFF);
            while (c1292540jjwLJ2 != null) {
                sb.append("->");
                sb.append(c1292540jjwLJ2.LIZJ);
                c1292540jjwLJ2 = this.LIZIZ.LJI.LJ(c1292540jjwLJ2.LJFF);
            }
            sb.append(str);
            sb.append("\n");
        }
        if (!this.LJII.isEmpty()) {
            sb.append(str);
            sb.append("\tMasks: ");
            sb.append(this.LJII.size());
            sb.append("\n");
        }
        if (this.LJIIIZ != 0 && this.LJIIJ != 0) {
            sb.append(str);
            sb.append("\tBackground: ");
            sb.append(C786410Ut5.k4(Locale.US, "%dx%d %X\n", new Object[]{Integer.valueOf(this.LJIIIZ), Integer.valueOf(this.LJIIJ), Integer.valueOf(this.LJIIJJI)}));
        }
        if (!this.LIZ.isEmpty()) {
            sb.append(str);
            sb.append("\tShapes:\n");
            for (InterfaceC1292590jk1 interfaceC1292590jk1 : this.LIZ) {
                sb.append(str);
                sb.append("\t\t");
                sb.append(interfaceC1292590jk1);
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    public C1292540jjw(List<InterfaceC1292590jk1> list, C1291600jiQ c1291600jiQ, String str, long j, EnumC1292680jkA enumC1292680jkA, long j2, String str2, List<C1292710jkD> list2, C1292750jkH c1292750jkH, int i, int i2, int i3, float f, float f2, int i4, int i5, C1292950jkb c1292950jkb, C1292890jkV c1292890jkV, List<C1293200jl0<Float>> list3, EnumC1292530jjv enumC1292530jjv, C1292960jkc c1292960jkc) {
        this.LIZ = list;
        this.LIZIZ = c1291600jiQ;
        this.LIZJ = str;
        this.LIZLLL = j;
        this.LJ = enumC1292680jkA;
        this.LJFF = j2;
        this.LJI = str2;
        this.LJII = list2;
        this.LJIIIIZZ = c1292750jkH;
        this.LJIIIZ = i;
        this.LJIIJ = i2;
        this.LJIIJJI = i3;
        this.LJIIL = f;
        this.LJIILIIL = f2;
        this.LJIILJJIL = i4;
        this.LJIILL = i5;
        this.LJIILLIIL = c1292950jkb;
        this.LJIIZILJ = c1292890jkV;
        this.LJIJI = list3;
        this.LJIJJ = enumC1292530jjv;
        this.LJIJ = c1292960jkc;
    }
}
