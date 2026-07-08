package X;

import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0tui, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1683620tui extends AbstractC1683020ttk implements InterfaceC20035313aJ {
    public final boolean LLILLJJLI;
    public final float LLILLL;
    public final C05P1<C1685910tyP> LLILZ;
    public final C05P1<C0NW6> LLILZIL;
    public final C13EY<C0NW2, C1683630tuj> LLILZLL;

    public C1683620tui() {
        throw null;
    }

    @Override // X.InterfaceC20035313aJ
    public final void LJFF() {
    }

    @Override // X.InterfaceC20035313aJ
    public final void LIZLLL() {
        this.LLILZLL.clear();
    }

    @Override // X.InterfaceC20035313aJ
    public final void LJ() {
        this.LLILZLL.clear();
    }

    @Override // X.InterfaceC1680330tpP
    public final void LIZ(InterfaceC1669010tX9 interfaceC1669010tX9) {
        float fFloatValue;
        Float fValueOf;
        long j = this.LLILZ.getValue().LIZ;
        interfaceC1669010tX9.LLIIJLIL();
        LIZJ(this.LLILLL, j, interfaceC1669010tX9);
        Object it2 = this.LLILZLL.LLILLJJLI.iterator();
        while (((AbstractC19976613Ee) it2).hasNext()) {
            C1683630tuj c1683630tuj = (C1683630tuj) ((Map.Entry) ((C19976713Ef) it2).next()).getValue();
            float f = this.LLILZIL.getValue().LIZLLL;
            if (f != 0.0f) {
                long jLIZJ = C1685910tyP.LIZJ(f, j);
                if (c1683630tuj.LIZLLL == null) {
                    long jLIZIZ = interfaceC1669010tX9.LIZIZ();
                    c1683630tuj.LIZLLL = Float.valueOf(Math.max(C1680770tq7.LIZLLL(jLIZIZ), C1680770tq7.LIZIZ(jLIZIZ)) * 0.3f);
                }
                if (c1683630tuj.LJ == null) {
                    if (Float.isNaN(c1683630tuj.LIZIZ)) {
                        fValueOf = Float.valueOf(C1683580tue.LIZ(interfaceC1669010tX9, c1683630tuj.LIZJ, interfaceC1669010tX9.LIZIZ()));
                    } else {
                        fValueOf = Float.valueOf(interfaceC1669010tX9.LJJJJLL(c1683630tuj.LIZIZ));
                    }
                    c1683630tuj.LJ = fValueOf;
                }
                if (c1683630tuj.LIZ == null) {
                    c1683630tuj.LIZ = new C1378605aS(interfaceC1669010tX9.LJIJI());
                }
                if (c1683630tuj.LJFF == null) {
                    c1683630tuj.LJFF = new C1378605aS(C1383705bH.LIZ(C1680770tq7.LIZLLL(interfaceC1669010tX9.LIZIZ()) / 2.0f, C1680770tq7.LIZIZ(interfaceC1669010tX9.LIZIZ()) / 2.0f));
                }
                if (((Boolean) ((C13FE) c1683630tuj.LJIIJJI).getValue()).booleanValue() && !((Boolean) ((C13FE) c1683630tuj.LJIIJ).getValue()).booleanValue()) {
                    fFloatValue = 1.0f;
                } else {
                    fFloatValue = c1683630tuj.LJI.LIZLLL().floatValue();
                }
                float fLIZIZ = C1677720tlC.LIZIZ(c1683630tuj.LIZLLL.floatValue(), c1683630tuj.LJ.floatValue(), c1683630tuj.LJII.LIZLLL().floatValue());
                long jLIZ = C1383705bH.LIZ(C1677720tlC.LIZIZ(Float.intBitsToFloat((int) (c1683630tuj.LIZ.LIZ >> 32)), Float.intBitsToFloat((int) (c1683630tuj.LJFF.LIZ >> 32)), c1683630tuj.LJIIIIZZ.LIZLLL().floatValue()), C1677720tlC.LIZIZ(C1378605aS.LJ(c1683630tuj.LIZ.LIZ), C1378605aS.LJ(c1683630tuj.LJFF.LIZ), c1683630tuj.LJIIIIZZ.LIZLLL().floatValue()));
                long jLIZJ2 = C1685910tyP.LIZJ(C1685910tyP.LJFF(jLIZJ) * fFloatValue, jLIZJ);
                if (c1683630tuj.LIZJ) {
                    float fLIZLLL = C1680770tq7.LIZLLL(interfaceC1669010tX9.LIZIZ());
                    float fLIZIZ2 = C1680770tq7.LIZIZ(interfaceC1669010tX9.LIZIZ());
                    C1695230uDR c1695230uDRLJLJI = interfaceC1669010tX9.LJLJI();
                    long jLIZIZ2 = c1695230uDRLJLJI.LIZIZ();
                    c1695230uDRLJLJI.LIZ().save();
                    c1695230uDRLJLJI.LIZ.LIZJ(0.0f, 0.0f, fLIZLLL, fLIZIZ2, 1);
                    C1675860tiC.LIZLLL(interfaceC1669010tX9, jLIZJ2, fLIZIZ, jLIZ, 0.0f, null, 120);
                    c1695230uDRLJLJI.LIZ().LJIIJ();
                    c1695230uDRLJLJI.LIZJ(jLIZIZ2);
                } else {
                    C1675860tiC.LIZLLL(interfaceC1669010tX9, jLIZJ2, fLIZIZ, jLIZ, 0.0f, null, 120);
                }
            }
        }
    }

    @Override // X.AbstractC1683020ttk
    public final void LJI(C0NW2 c0nw2) {
        C1683630tuj c1683630tuj = this.LLILZLL.get(c0nw2);
        if (c1683630tuj != null) {
            ((C13FE) c1683630tuj.LJIIJJI).setValue(Boolean.TRUE);
            c1683630tuj.LJIIIZ.LJJLIIIJILLIZJL(Unit.LIZ);
        }
    }

    @Override // X.AbstractC1683020ttk
    public final void LIZIZ(C0NW2 c0nw2, InterfaceC497601wk interfaceC497601wk) {
        C1378605aS c1378605aS;
        Iterator it2 = this.LLILZLL.LLILLJJLI.iterator();
        while (it2.hasNext()) {
            C1683630tuj c1683630tuj = (C1683630tuj) ((Map.Entry) it2.next()).getValue();
            ((C13FE) c1683630tuj.LJIIJJI).setValue(Boolean.TRUE);
            c1683630tuj.LJIIIZ.LJJLIIIJILLIZJL(Unit.LIZ);
        }
        if (this.LLILLJJLI) {
            c1378605aS = new C1378605aS(c0nw2.LIZ);
        } else {
            c1378605aS = null;
        }
        C1683630tuj c1683630tuj2 = new C1683630tuj(c1378605aS, this.LLILLL, this.LLILLJJLI);
        this.LLILZLL.put(c0nw2, c1683630tuj2);
        C23250099c.LIZLLL(interfaceC497601wk, null, null, new C1683680tuo(c1683630tuj2, this, c0nw2, null), 3);
    }

    public C1683620tui(boolean z, float f, C05P0 c05p0, C05P0 c05p02) {
        super(c05p02, z);
        this.LLILLJJLI = z;
        this.LLILLL = f;
        this.LLILZ = c05p0;
        this.LLILZIL = c05p02;
        this.LLILZLL = new C13EY<>();
    }
}
