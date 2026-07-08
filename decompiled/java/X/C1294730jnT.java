package X;

import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: X.0jnT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1294730jnT {
    public final List<InterfaceC1294510jn7> LIZ;
    public final C1294720jnS LIZIZ;
    public final String LIZJ;
    public final long LIZLLL;
    public final EnumC1294940jno LJ;
    public final long LJFF;
    public final String LJI;
    public final List<C1295690jp1> LJII;
    public final C1295320joQ LJIIIIZZ;
    public final int LJIIIZ;
    public final int LJIIJ;
    public final int LJIIJJI;
    public final float LJIIL;
    public final float LJIILIIL;
    public final float LJIILJJIL;
    public final float LJIILL;
    public final C1295600jos LJIILLIIL;
    public final C1295770jp9 LJIIZILJ;
    public final C1295020jnw LJIJ;
    public final List<C1294810jnb<Float>> LJIJI;
    public final EnumC1295410joZ LJIJJ;
    public final boolean LJIJJLI;
    public final C1295860jpI LJIL;
    public final C1295720jp4 LJJ;

    public final String toString() {
        return LIZ("");
    }

    public final String LIZ(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(this.LIZJ);
        sb.append("\n");
        C1294730jnT c1294730jnTLJ = this.LIZIZ.LJII.LJ(this.LJFF);
        if (c1294730jnTLJ != null) {
            sb.append("\t\tParents: ");
            sb.append(c1294730jnTLJ.LIZJ);
            C1294730jnT c1294730jnTLJ2 = this.LIZIZ.LJII.LJ(c1294730jnTLJ.LJFF);
            while (c1294730jnTLJ2 != null) {
                sb.append("->");
                sb.append(c1294730jnTLJ2.LIZJ);
                c1294730jnTLJ2 = this.LIZIZ.LJII.LJ(c1294730jnTLJ2.LJFF);
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
            for (InterfaceC1294510jn7 interfaceC1294510jn7 : this.LIZ) {
                sb.append(str);
                sb.append("\t\t");
                sb.append(interfaceC1294510jn7);
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    public C1294730jnT(List<InterfaceC1294510jn7> list, C1294720jnS c1294720jnS, String str, long j, EnumC1294940jno enumC1294940jno, long j2, String str2, List<C1295690jp1> list2, C1295320joQ c1295320joQ, int i, int i2, int i3, float f, float f2, float f3, float f4, C1295600jos c1295600jos, C1295770jp9 c1295770jp9, List<C1294810jnb<Float>> list3, EnumC1295410joZ enumC1295410joZ, C1295020jnw c1295020jnw, boolean z, C1295860jpI c1295860jpI, C1295720jp4 c1295720jp4) {
        this.LIZ = list;
        this.LIZIZ = c1294720jnS;
        this.LIZJ = str;
        this.LIZLLL = j;
        this.LJ = enumC1294940jno;
        this.LJFF = j2;
        this.LJI = str2;
        this.LJII = list2;
        this.LJIIIIZZ = c1295320joQ;
        this.LJIIIZ = i;
        this.LJIIJ = i2;
        this.LJIIJJI = i3;
        this.LJIIL = f;
        this.LJIILIIL = f2;
        this.LJIILJJIL = f3;
        this.LJIILL = f4;
        this.LJIILLIIL = c1295600jos;
        this.LJIIZILJ = c1295770jp9;
        this.LJIJI = list3;
        this.LJIJJ = enumC1295410joZ;
        this.LJIJ = c1295020jnw;
        this.LJIJJLI = z;
        this.LJIL = c1295860jpI;
        this.LJJ = c1295720jp4;
    }
}
