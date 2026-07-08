package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS219S0000000_30;

/* JADX INFO: renamed from: X.1Db0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2258761Db0 implements InterfaceC2258771Db1 {
    public final InterfaceC2258811Db5 LIZ;
    public final AbstractC2192061Aqi LIZIZ;
    public final C19980713Ft LIZJ;
    public final C13BS LIZLLL;
    public final InterfaceC2258771Db1 LJ;

    @Override // X.InterfaceC2258771Db1
    public final void LIZ() {
        this.LJ.LIZ();
    }

    @Override // X.InterfaceC2258771Db1
    public final C19980813Fu LIZIZ(C0N23 c0n23) {
        return this.LJ.LIZIZ(c0n23);
    }

    @Override // X.InterfaceC2258771Db1
    public final List<C19980813Fu> LIZJ(C354710DvR c354710DvR, C0N23 c0n23) {
        return this.LJ.LIZJ(c354710DvR, c0n23);
    }

    @Override // X.InterfaceC2258771Db1
    public final C19980813Fu LIZLLL(C0N23 c0n23) {
        return this.LJ.LIZLLL(c0n23);
    }

    @Override // X.InterfaceC2258771Db1
    public final C19980813Fu LJ(C0N23 c0n23) {
        return this.LJ.LJ(c0n23);
    }

    @Override // X.InterfaceC2258771Db1
    public final C19980813Fu LJFF(C0N23 c0n23) {
        return this.LJ.LJFF(c0n23);
    }

    @Override // X.InterfaceC2258771Db1
    public final C19980813Fu LJI(C0N23 c0n23) {
        return this.LJ.LJI(c0n23);
    }

    @Override // X.InterfaceC2258771Db1
    public final void LJII() {
        this.LJ.LJII();
    }

    public C2258761Db0(AbstractC21592019eo abstractC21592019eo, AbstractC2192061Aqi abstractC2192061Aqi, final C19980713Ft c19980713Ft, final C13BS c13bs) {
        InterfaceC2258771Db1 interfaceC2258771Db1 = new InterfaceC2258771Db1(c13bs, c19980713Ft) { // from class: X.13BU
            public final C13BS LIZ;
            public final C19980713Ft LIZIZ;

            @Override // X.InterfaceC2258771Db1
            public final void LIZ() {
                this.LIZ.LIZLLL("play");
                C589080N8o.LJ(this, null, AFwS219S0000000_30.get$arr$(1));
            }

            @Override // X.InterfaceC2258771Db1
            public final void LJII() {
                this.LIZ.LIZLLL("show");
                C13BS c13bs2 = this.LIZ;
                ((ArrayList) c13bs2.LIZLLL).clear();
                ((ArrayList) c13bs2.LJ).clear();
                C589080N8o.LJ(this, null, AFwS219S0000000_30.get$arr$(0));
            }

            @Override // X.InterfaceC2258771Db1
            public final C19980813Fu LIZIZ(C0N23 c0n23) {
                C13BQ c13bq = this.LIZ.LIZ.get("show");
                if (c13bq != null) {
                    C13BR c13brLIZ = C13BP.LIZ(this.LIZ, c13bq.LIZJ);
                    C13BS c13bs2 = this.LIZ;
                    c13bs2.LIZJ = c13bq.LIZJ | c13bs2.LIZJ;
                    c13bs2.LIZJ(c13bq.LIZ, c13brLIZ.LIZ, false);
                    C19980813Fu c19980813Fu = new C19980813Fu(c0n23, c13bq.LIZ, this.LIZIZ.LJ());
                    C13BS c13bs3 = this.LIZ;
                    C2258891DbD.LIZJ(c19980813Fu, c13bs3.LIZIZ, c13bs3.LIZIZ(), c13brLIZ.LIZ, false, c13brLIZ.LIZJ, false, null, null, null, 488);
                    return c19980813Fu;
                }
                return null;
            }

            @Override // X.InterfaceC2258771Db1
            public final C19980813Fu LIZLLL(C0N23 c0n23) {
                C13BQ c13bq = this.LIZ.LIZ.get("play");
                if (c13bq != null) {
                    C13BR c13brLIZ = C13BP.LIZ(this.LIZ, c13bq.LIZJ);
                    boolean z = c13brLIZ.LIZ;
                    boolean z2 = c13brLIZ.LIZIZ;
                    boolean z3 = c13brLIZ.LIZJ;
                    boolean z4 = c13brLIZ.LIZLLL;
                    C13BS c13bs2 = this.LIZ;
                    c13bs2.LIZJ = c13bq.LIZJ | c13bs2.LIZJ;
                    c13bs2.LIZJ(c13bq.LIZ, z, z4);
                    C19980813Fu c19980813Fu = new C19980813Fu(c0n23, c13bq.LIZ, this.LIZIZ.LJ());
                    C13BS c13bs3 = this.LIZ;
                    String str = c13bs3.LIZIZ;
                    String strLIZIZ = c13bs3.LIZIZ();
                    C13BS c13bs4 = this.LIZ;
                    C2258891DbD.LIZJ(c19980813Fu, str, strLIZIZ, z, z2, z3, z4, c13bs4.LIZLLL, c13bs4.LJ, null, 256);
                    return c19980813Fu;
                }
                return null;
            }

            @Override // X.InterfaceC2258771Db1
            public final C19980813Fu LJ(C0N23 c0n23) {
                C13BS c13bs2 = this.LIZ;
                C13BQ c13bq = c13bs2.LIZ.get("play");
                if (c13bq != null && (c13bs2.LIZJ & c13bq.LIZJ) != 0) {
                    C19980813Fu c19980813Fu = new C19980813Fu(c0n23, "break", this.LIZIZ.LJ());
                    C13BS c13bs3 = this.LIZ;
                    String str = c13bs3.LIZIZ;
                    String strLIZIZ = c13bs3.LIZIZ();
                    boolean z = !((ArrayList) this.LIZ.LJ).isEmpty();
                    C13BS c13bs4 = this.LIZ;
                    C2258891DbD.LIZJ(c19980813Fu, str, strLIZIZ, false, false, false, z, c13bs4.LIZLLL, c13bs4.LJ, C13BP.LIZIZ(c13bs4), 28);
                    return c19980813Fu;
                }
                return null;
            }

            @Override // X.InterfaceC2258771Db1
            public final C19980813Fu LJFF(C0N23 c0n23) {
                return LIZLLL(c0n23);
            }

            @Override // X.InterfaceC2258771Db1
            public final C19980813Fu LJI(C0N23 c0n23) {
                C13BQ c13bq = this.LIZ.LIZ.get("over");
                if (c13bq != null) {
                    C13BR c13brLIZ = C13BP.LIZ(this.LIZ, c13bq.LIZJ);
                    boolean z = c13brLIZ.LIZ;
                    boolean z2 = c13brLIZ.LIZIZ;
                    boolean z3 = c13brLIZ.LIZLLL;
                    C13BS c13bs2 = this.LIZ;
                    c13bs2.LIZJ = c13bq.LIZJ | c13bs2.LIZJ;
                    c13bs2.LIZJ(c13bq.LIZ, z, z3);
                    C19980813Fu c19980813Fu = new C19980813Fu(c0n23, c13bq.LIZ, this.LIZIZ.LJ());
                    C13BS c13bs3 = this.LIZ;
                    String str = c13bs3.LIZIZ;
                    String strLIZIZ = c13bs3.LIZIZ();
                    C13BS c13bs4 = this.LIZ;
                    C2258891DbD.LIZJ(c19980813Fu, str, strLIZIZ, z, z2, false, z3, c13bs4.LIZLLL, c13bs4.LJ, C13BP.LIZIZ(c13bs4), 16);
                    return c19980813Fu;
                }
                return null;
            }

            {
                this.LIZ = c13bs;
                this.LIZIZ = c19980713Ft;
            }

            @Override // X.InterfaceC2258771Db1
            public final List<C19980813Fu> LIZJ(C354710DvR c354710DvR, C0N23 c0n23) {
                int i;
                if (c354710DvR.isEmpty()) {
                    return C13BV.INSTANCE;
                }
                Map<String, C13BQ> map = this.LIZ.LIZ;
                ArrayList arrayList = new ArrayList(map.size());
                Iterator<Map.Entry<String, C13BQ>> it2 = map.entrySet().iterator();
                while (it2.hasNext()) {
                    arrayList.add(it2.next().getValue());
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : arrayList) {
                    if (C13BW.LIZ.contains(((C13BQ) obj).LIZ)) {
                        arrayList2.add(obj);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator it3 = arrayList2.iterator();
                while (true) {
                    i = 0;
                    if (!it3.hasNext()) {
                        break;
                    }
                    Object next = it3.next();
                    long j = ((C13BQ) next).LIZIZ;
                    if (j > c354710DvR.LL && j <= c354710DvR.LLILLJJLI) {
                        arrayList3.add(next);
                    }
                }
                ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(arrayList3, 10));
                for (Object obj2 : arrayList3) {
                    int i2 = i + 1;
                    if (i >= 0) {
                        C13BQ c13bq = (C13BQ) obj2;
                        C13BR c13brLIZ = C13BP.LIZ(this.LIZ, c13bq.LIZJ);
                        boolean z = c13brLIZ.LIZ;
                        boolean z2 = c13brLIZ.LIZIZ;
                        boolean z3 = c13brLIZ.LIZJ;
                        boolean z4 = c13brLIZ.LIZLLL;
                        C13BS c13bs2 = this.LIZ;
                        c13bs2.LIZJ = c13bq.LIZJ | c13bs2.LIZJ;
                        c13bs2.LIZJ(c13bq.LIZ, z, z4);
                        C19980813Fu c19980813Fu = new C19980813Fu(c0n23, c13bq.LIZ, this.LIZIZ.LJ());
                        C13BS c13bs3 = this.LIZ;
                        String str = c13bs3.LIZIZ;
                        String strLIZIZ = c13bs3.LIZIZ();
                        C13BS c13bs4 = this.LIZ;
                        C2258891DbD.LIZJ(c19980813Fu, str, strLIZIZ, z, z2, z3, z4, c13bs4.LIZLLL, c13bs4.LJ, null, 256);
                        arrayList4.add(c19980813Fu);
                        i = i2;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
                return arrayList4;
            }
        };
        this.LIZ = abstractC21592019eo;
        this.LIZIZ = abstractC2192061Aqi;
        this.LIZJ = c19980713Ft;
        this.LIZLLL = c13bs;
        this.LJ = interfaceC2258771Db1;
    }
}
