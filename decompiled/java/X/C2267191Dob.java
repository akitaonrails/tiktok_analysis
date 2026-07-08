package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.1Dob, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public class C2267191Dob implements InterfaceC2267401Dow {
    public AbstractC2267131DoV LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;
    public final AbstractC2267131DoV LIZLLL;
    public int LJFF;
    public int LJI;
    public C2267281Dok LJIIIIZZ;
    public boolean LJIIIZ;
    public EnumC21532519Op LJ = EnumC21532519Op.UNKNOWN;
    public int LJII = 1;
    public final List<InterfaceC2267401Dow> LJIIJ = new ArrayList();
    public final List<C2267191Dob> LJIIJJI = new ArrayList();

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
        sbLIZ.append(this.LIZLLL.LIZIZ.LJJLI);
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

    public C2267191Dob(AbstractC2267131DoV abstractC2267131DoV) {
        this.LIZLLL = abstractC2267131DoV;
    }

    @Override // X.InterfaceC2267401Dow
    public final void LIZ(InterfaceC2267401Dow interfaceC2267401Dow) {
        Iterator it2 = ((ArrayList) this.LJIIJJI).iterator();
        while (it2.hasNext()) {
            if (!((C2267191Dob) it2.next()).LJIIIZ) {
                return;
            }
        }
        this.LIZJ = true;
        AbstractC2267131DoV abstractC2267131DoV = this.LIZ;
        if (abstractC2267131DoV != null) {
            abstractC2267131DoV.LIZ(this);
        }
        if (this.LIZIZ) {
            this.LIZLLL.LIZ(this);
            return;
        }
        C2267191Dob c2267191Dob = null;
        int i = 0;
        for (C2267191Dob c2267191Dob2 : (ArrayList) this.LJIIJJI) {
            if (!(c2267191Dob2 instanceof C2267281Dok)) {
                i++;
                c2267191Dob = c2267191Dob2;
            }
        }
        if (c2267191Dob != null && i == 1 && c2267191Dob.LJIIIZ) {
            C2267281Dok c2267281Dok = this.LJIIIIZZ;
            if (c2267281Dok != null) {
                if (c2267281Dok.LJIIIZ) {
                    this.LJFF = this.LJII * c2267281Dok.LJI;
                } else {
                    return;
                }
            }
            LIZLLL(c2267191Dob.LJI + this.LJFF);
        }
        AbstractC2267131DoV abstractC2267131DoV2 = this.LIZ;
        if (abstractC2267131DoV2 != null) {
            abstractC2267131DoV2.LIZ(this);
        }
    }

    public final void LIZIZ(InterfaceC2267401Dow interfaceC2267401Dow) {
        ((ArrayList) this.LJIIJ).add(interfaceC2267401Dow);
        if (this.LJIIIZ) {
            interfaceC2267401Dow.LIZ(interfaceC2267401Dow);
        }
    }

    public void LIZLLL(int i) {
        if (this.LJIIIZ) {
            return;
        }
        this.LJIIIZ = true;
        this.LJI = i;
        for (InterfaceC2267401Dow interfaceC2267401Dow : (ArrayList) this.LJIIJ) {
            interfaceC2267401Dow.LIZ(interfaceC2267401Dow);
        }
    }
}
