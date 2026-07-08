package X;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: X.1DoK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2267021DoK {
    public final C2267091DoR LIZ;
    public final C2267091DoR LIZJ;
    public InterfaceC2267341Doq LJ;
    public final C2267311Don LJFF;
    public final ArrayList<C2267331Dop> LJI;
    public boolean LIZIZ = true;
    public final ArrayList<AbstractC2267131DoV> LIZLLL = new ArrayList<>();

    public C2267021DoK(C2267091DoR c2267091DoR) {
        new ArrayList();
        this.LJ = null;
        this.LJFF = new C2267311Don();
        this.LJI = new ArrayList<>();
        this.LIZ = c2267091DoR;
        this.LIZJ = c2267091DoR;
    }

    public final void LIZIZ(AbstractC2267131DoV abstractC2267131DoV, int i, ArrayList<C2267331Dop> arrayList) {
        for (InterfaceC2267401Dow interfaceC2267401Dow : (ArrayList) abstractC2267131DoV.LJII.LJIIJ) {
            if (interfaceC2267401Dow instanceof C2267191Dob) {
                LIZ((C2267191Dob) interfaceC2267401Dow, i, 0, arrayList, null);
            } else if (interfaceC2267401Dow instanceof AbstractC2267131DoV) {
                LIZ(((AbstractC2267131DoV) interfaceC2267401Dow).LJII, i, 0, arrayList, null);
            }
        }
        for (InterfaceC2267401Dow interfaceC2267401Dow2 : (ArrayList) abstractC2267131DoV.LJIIIIZZ.LJIIJ) {
            if (interfaceC2267401Dow2 instanceof C2267191Dob) {
                LIZ((C2267191Dob) interfaceC2267401Dow2, i, 1, arrayList, null);
            } else if (interfaceC2267401Dow2 instanceof AbstractC2267131DoV) {
                LIZ(((AbstractC2267131DoV) interfaceC2267401Dow2).LJIIIIZZ, i, 1, arrayList, null);
            }
        }
        if (i == 1) {
            for (InterfaceC2267401Dow interfaceC2267401Dow3 : (ArrayList) ((C2267111DoT) abstractC2267131DoV).LJIIJ.LJIIJ) {
                if (interfaceC2267401Dow3 instanceof C2267191Dob) {
                    LIZ((C2267191Dob) interfaceC2267401Dow3, 1, 2, arrayList, null);
                }
            }
        }
    }

    public final void LIZ(C2267191Dob c2267191Dob, int i, int i2, ArrayList arrayList, C2267331Dop c2267331Dop) {
        int i3;
        C2267331Dop c2267331Dop2 = c2267331Dop;
        AbstractC2267131DoV abstractC2267131DoV = c2267191Dob.LIZLLL;
        if (abstractC2267131DoV.LIZJ == null) {
            C2267021DoK c2267021DoK = this;
            C2267091DoR c2267091DoR = c2267021DoK.LIZ;
            if (abstractC2267131DoV != c2267091DoR.LIZLLL && abstractC2267131DoV != c2267091DoR.LJ) {
                ArrayList arrayList2 = arrayList;
                if (c2267331Dop2 == null) {
                    c2267331Dop2 = new C2267331Dop(abstractC2267131DoV);
                    arrayList2.add(c2267331Dop2);
                }
                abstractC2267131DoV.LIZJ = c2267331Dop2;
                c2267331Dop2.LIZ.add(abstractC2267131DoV);
                Iterator it2 = ((ArrayList) abstractC2267131DoV.LJII.LJIIJ).iterator();
                while (true) {
                    i3 = i;
                    if (!it2.hasNext()) {
                        break;
                    }
                    InterfaceC2267401Dow interfaceC2267401Dow = (InterfaceC2267401Dow) it2.next();
                    if (interfaceC2267401Dow instanceof C2267191Dob) {
                        c2267021DoK.LIZ((C2267191Dob) interfaceC2267401Dow, i3, 0, arrayList2, c2267331Dop2);
                    }
                }
                for (InterfaceC2267401Dow interfaceC2267401Dow2 : (ArrayList) abstractC2267131DoV.LJIIIIZZ.LJIIJ) {
                    if (interfaceC2267401Dow2 instanceof C2267191Dob) {
                        c2267021DoK.LIZ((C2267191Dob) interfaceC2267401Dow2, i3, 1, arrayList2, c2267331Dop2);
                    }
                }
                if (i3 == 1 && (abstractC2267131DoV instanceof C2267111DoT)) {
                    for (InterfaceC2267401Dow interfaceC2267401Dow3 : (ArrayList) ((C2267111DoT) abstractC2267131DoV).LJIIJ.LJIIJ) {
                        if (interfaceC2267401Dow3 instanceof C2267191Dob) {
                            c2267021DoK.LIZ((C2267191Dob) interfaceC2267401Dow3, 1, 2, arrayList2, c2267331Dop2);
                        }
                    }
                }
                Iterator it3 = ((ArrayList) abstractC2267131DoV.LJII.LJIIJJI).iterator();
                while (it3.hasNext()) {
                    c2267021DoK.LIZ((C2267191Dob) it3.next(), i3, 0, arrayList2, c2267331Dop2);
                }
                Iterator it4 = ((ArrayList) abstractC2267131DoV.LJIIIIZZ.LJIIJJI).iterator();
                while (it4.hasNext()) {
                    c2267021DoK = c2267021DoK;
                    i3 = i3;
                    arrayList2 = arrayList2;
                    c2267331Dop2 = c2267331Dop2;
                    c2267021DoK.LIZ((C2267191Dob) it4.next(), i3, 1, arrayList2, c2267331Dop2);
                }
                if (i3 == 1 && (abstractC2267131DoV instanceof C2267111DoT)) {
                    Iterator it5 = ((ArrayList) ((C2267111DoT) abstractC2267131DoV).LJIIJ.LJIIJJI).iterator();
                    while (it5.hasNext()) {
                        c2267021DoK.LIZ((C2267191Dob) it5.next(), 1, 2, arrayList2, c2267331Dop2);
                    }
                }
            }
        }
    }

    public final void LIZJ(C2267081DoQ c2267081DoQ, EnumC2266981DoG enumC2266981DoG, int i, EnumC2266981DoG enumC2266981DoG2, int i2) {
        boolean z;
        C2267311Don c2267311Don = this.LJFF;
        c2267311Don.LIZ = enumC2266981DoG;
        c2267311Don.LIZIZ = enumC2266981DoG2;
        c2267311Don.LIZJ = i;
        c2267311Don.LIZLLL = i2;
        this.LJ.LIZIZ(c2267081DoQ, c2267311Don);
        c2267081DoQ.LJJIIZI(this.LJFF.LJ);
        c2267081DoQ.LJJIIJ(this.LJFF.LJFF);
        C2267311Don c2267311Don2 = this.LJFF;
        c2267081DoQ.LJJIIZI = c2267311Don2.LJII;
        int i3 = c2267311Don2.LJI;
        c2267081DoQ.LJJJJZ = i3;
        if (i3 > 0) {
            z = true;
        } else {
            z = false;
        }
        c2267081DoQ.LJJIIZI = z;
    }
}
