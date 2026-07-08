package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.19OL, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public class C19OL implements InterfaceC21531119Ob {
    public C19OF LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;
    public final C19OF LIZLLL;
    public int LJFF;
    public int LJI;
    public C19OX LJIIIIZZ;
    public boolean LJIIIZ;
    public C19OW LJ = C19OW.UNKNOWN;
    public int LJII = 1;
    public final List<InterfaceC21531119Ob> LJIIJ = new ArrayList();
    public final List<C19OL> LJIIJJI = new ArrayList();

    public final void LIZJ() {
        ((ArrayList) this.LJIIJJI).clear();
        ((ArrayList) this.LJIIJ).clear();
        this.LJIIIZ = false;
        this.LJI = 0;
        this.LIZJ = false;
        this.LIZIZ = false;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZLLL.LIZIZ.mDebugName);
        sbLIZ.append(":");
        sbLIZ.append(this.LJ);
        sbLIZ.append(e3.h);
        sbLIZ.append(this.LJIIIZ ? Integer.valueOf(this.LJI) : "unresolved");
        sbLIZ.append(") <t=");
        sbLIZ.append(((ArrayList) this.LJIIJJI).size());
        sbLIZ.append(":d=");
        sbLIZ.append(((ArrayList) this.LJIIJ).size());
        sbLIZ.append(">");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C19OL(C19OF c19of) {
        this.LIZLLL = c19of;
    }

    @Override // X.InterfaceC21531119Ob
    public final void LIZ(InterfaceC21531119Ob interfaceC21531119Ob) {
        Iterator it2 = ((ArrayList) this.LJIIJJI).iterator();
        while (it2.hasNext()) {
            if (!((C19OL) it2.next()).LJIIIZ) {
                return;
            }
        }
        this.LIZJ = true;
        C19OF c19of = this.LIZ;
        if (c19of != null) {
            c19of.LIZ(this);
        }
        if (this.LIZIZ) {
            this.LIZLLL.LIZ(this);
            return;
        }
        C19OL c19ol = null;
        int i = 0;
        for (C19OL c19ol2 : (ArrayList) this.LJIIJJI) {
            if (!(c19ol2 instanceof C19OX)) {
                i++;
                c19ol = c19ol2;
            }
        }
        if (c19ol != null && i == 1 && c19ol.LJIIIZ) {
            C19OX c19ox = this.LJIIIIZZ;
            if (c19ox != null) {
                if (c19ox.LJIIIZ) {
                    this.LJFF = this.LJII * c19ox.LJI;
                } else {
                    return;
                }
            }
            LIZLLL(c19ol.LJI + this.LJFF);
        }
        C19OF c19of2 = this.LIZ;
        if (c19of2 != null) {
            c19of2.LIZ(this);
        }
    }

    public final void LIZIZ(InterfaceC21531119Ob interfaceC21531119Ob) {
        ((ArrayList) this.LJIIJ).add(interfaceC21531119Ob);
        if (this.LJIIIZ) {
            interfaceC21531119Ob.LIZ(interfaceC21531119Ob);
        }
    }

    public void LIZLLL(int i) {
        if (this.LJIIIZ) {
            return;
        }
        this.LJIIIZ = true;
        this.LJI = i;
        for (InterfaceC21531119Ob interfaceC21531119Ob : (ArrayList) this.LJIIJ) {
            interfaceC21531119Ob.LIZ(interfaceC21531119Ob);
        }
    }
}
