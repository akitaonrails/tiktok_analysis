package X;

import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.jvm.internal.AwS569S0100000_25;

/* JADX INFO: renamed from: X.0t3O, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1650560t3O {
    public final C1DRG LIZ;
    public final boolean LIZIZ;
    public final C01GW LIZJ = C452501pT.LIZIZ(new AwS569S0100000_25(this, 463));
    public final C01GW LIZLLL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 465));
    public final C01GW LJ = C452501pT.LIZIZ(new AwS569S0100000_25(this, 461));
    public final C01GW LJFF = C452501pT.LIZIZ(new AwS569S0100000_25(this, 457));
    public final C01GW LJI = C452501pT.LIZIZ(new AwS569S0100000_25(this, 453));
    public final C01GW LJII = C452501pT.LIZIZ(new AwS569S0100000_25(this, 455));
    public final C01GW LJIIIIZZ = C452501pT.LIZIZ(new AwS569S0100000_25(this, 462));
    public final C01GW LJIIIZ = C452501pT.LIZIZ(new AwS569S0100000_25(this, 458));
    public final C01GW LJIIJ = C452501pT.LIZIZ(new AwS569S0100000_25(this, 456));
    public final C01GW LJIIJJI = C452501pT.LIZIZ(new AwS569S0100000_25(this, 467));
    public final C01GW LJIIL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 460));
    public final C01GW LJIILIIL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 454));
    public final C01GW LJIILJJIL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 452));
    public final C01GW LJIILL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 464));
    public final C01GW LJIILLIIL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 466));
    public final C01GW LJIIZILJ = C452501pT.LIZIZ(new AwS569S0100000_25(this, 459));
    public final HashMap<Integer, String> LJIJ = new HashMap<>();
    public final HashMap<Integer, String> LJIJI = new HashMap<>();

    public final C19EG LIZIZ() {
        return (C19EG) this.LJIILJJIL.getValue();
    }

    public final C1650980t44 LIZJ() {
        return (C1650980t44) this.LJI.getValue();
    }

    public final InterfaceC1650230t2r LIZLLL() {
        return (InterfaceC1650230t2r) this.LJIILIIL.getValue();
    }

    public final C1650980t44 LJFF() {
        return (C1650980t44) this.LJII.getValue();
    }

    public final C1650980t44 LJI() {
        return (C1650980t44) this.LJIIJ.getValue();
    }

    public final C1650980t44 LJII() {
        return (C1650980t44) this.LJFF.getValue();
    }

    public final C1650980t44 LJIIIIZZ() {
        return (C1650980t44) this.LJIIIZ.getValue();
    }

    public final C1650980t44 LJIIIZ() {
        return (C1650980t44) this.LJ.getValue();
    }

    public final C1650980t44 LJIIJ() {
        return (C1650980t44) this.LJIIIIZZ.getValue();
    }

    public final C1650980t44 LJIIJJI() {
        return (C1650980t44) this.LIZJ.getValue();
    }

    public final ShortVideoContext LJIILIIL() {
        return (ShortVideoContext) this.LJIILL.getValue();
    }

    public final C1650980t44 LJIILJJIL() {
        return (C1650980t44) this.LIZLLL.getValue();
    }

    public final C1650980t44 LJIILL() {
        return (C1650980t44) this.LJIIJJI.getValue();
    }

    public final InterfaceC1651080t4E LJIILLIIL() {
        C385670FAf<InterfaceC1651080t4E> c385670FAfI42;
        InterfaceC1651080t4E interfaceC1651080t4E = (InterfaceC1651080t4E) this.LIZ.LJIIL(null, InterfaceC1651080t4E.class);
        if (interfaceC1651080t4E != null) {
            return interfaceC1651080t4E;
        }
        C1647410syJ c1647410syJ = (C1647410syJ) this.LIZ.LJIIL(null, C1647410syJ.class);
        if (c1647410syJ == null || (c385670FAfI42 = c1647410syJ.I42()) == null) {
            return null;
        }
        return c385670FAfI42.LIZJ();
    }

    public final String LIZ(int i) {
        HashMap<Integer, String> map = this.LJIJ;
        Integer numValueOf = Integer.valueOf(i);
        String strLJI = map.get(numValueOf);
        if (strLJI == null) {
            strLJI = C20642515q3.LJI(i);
            map.put(numValueOf, strLJI);
        }
        return strLJI;
    }

    public final String LJ(int i) {
        HashMap<Integer, String> map = this.LJIJI;
        Integer numValueOf = Integer.valueOf(i);
        String strLIZ = map.get(numValueOf);
        if (strLIZ == null) {
            if (i > 0) {
                strLIZ = C1356620lPI.LIZ(LIZ(2131823333), C2097908Jt.LIZJ(new Pair("number", String.valueOf(i))));
            } else {
                strLIZ = null;
            }
            map.put(numValueOf, strLIZ);
        }
        return strLIZ;
    }

    public final String LJIIL(boolean z) {
        if (z) {
            return LIZ(2131823195);
        }
        return LIZ(2131823196);
    }

    public C1650560t3O(C1DRG c1drg, boolean z) {
        this.LIZ = c1drg;
        this.LIZIZ = z;
    }
}
