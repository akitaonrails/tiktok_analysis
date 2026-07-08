package X;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0jHi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1275040jHi {
    public int LIZ;
    public int LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public float LJ;
    public int LJFF;
    public int LJI;
    public int LJII;
    public int LJIIIIZZ;
    public int LJIIIZ;
    public long LJIIJ;
    public int LJIIJJI;
    public boolean LJIIL;
    public long LJIILIIL;
    public boolean LJIILJJIL;
    public int LJIILL;
    public final List<C1275730jIp> LJIILLIIL = new ArrayList();
    public final List<Integer> LJIIZILJ = new ArrayList();
    public final /* synthetic */ C1274910jHV LJIJ;

    /* JADX INFO: renamed from: LIZ, reason: merged with bridge method [inline-methods] */
    public final C1275040jHi clone() {
        List<Integer> list;
        C1275040jHi c1275040jHi = new C1275040jHi(this.LJIJ);
        c1275040jHi.LIZ = this.LIZ;
        c1275040jHi.LIZIZ = this.LIZIZ;
        c1275040jHi.LIZJ = this.LIZJ;
        c1275040jHi.LIZLLL = this.LIZLLL;
        c1275040jHi.LJ = this.LJ;
        c1275040jHi.LJFF = this.LJFF;
        c1275040jHi.LJI = this.LJI;
        c1275040jHi.LJII = this.LJII;
        c1275040jHi.LJIIIIZZ = this.LJIIIIZZ;
        c1275040jHi.LJIIIZ = this.LJIIIZ;
        c1275040jHi.LJIIJ = this.LJIIJ;
        c1275040jHi.LJIIJJI = this.LJIIJJI;
        c1275040jHi.LJIIL = this.LJIIL;
        c1275040jHi.LJIILJJIL = this.LJIILJJIL;
        c1275040jHi.LJIILL = this.LJIILL;
        List<C1275730jIp> list2 = this.LJIILLIIL;
        if (list2 != null && c1275040jHi.LJIILLIIL != null) {
            for (C1275730jIp c1275730jIp : (ArrayList) list2) {
                ((ArrayList) c1275040jHi.LJIILLIIL).add(new C1275730jIp(c1275730jIp.LIZ, c1275730jIp.LIZIZ));
            }
        }
        List<Integer> list3 = this.LJIIZILJ;
        if (list3 != null && (list = c1275040jHi.LJIIZILJ) != null) {
            ((ArrayList) list).addAll(list3);
        }
        return c1275040jHi;
    }

    public C1275040jHi(C1274910jHV c1274910jHV) {
        this.LJIJ = c1274910jHV;
    }
}
