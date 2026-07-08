package X;

import Y.AObjectS373S0100000_30;

/* JADX INFO: renamed from: X.13HS, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13HS<A, B, C> implements C13HG<C443120HZe<? extends A, ? extends B, ? extends C>> {
    public final C13HG<A> LIZ;
    public final C13HG<B> LIZIZ;
    public final C13HG<C> LIZJ;
    public final C19983813Gy LIZLLL = C19981813Ge.LIZ("kotlin.Triple", new InterfaceC19983313Gt[0], new AObjectS373S0100000_30(this, 2));

    @Override // X.C13HG, X.InterfaceC19984413He, X.InterfaceC19984213Hc
    public final InterfaceC19983313Gt getDescriptor() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC19984213Hc
    public final Object deserialize(C13HB c13hb) {
        InterfaceC19986313Hx interfaceC19986313HxLIZIZ = c13hb.LIZIZ(this.LIZLLL);
        interfaceC19986313HxLIZIZ.LJJII();
        Object objLJI = C19984013Ha.LIZ;
        Object objLJI2 = objLJI;
        Object objLJI3 = objLJI;
        while (true) {
            int iLJIJJ = interfaceC19986313HxLIZIZ.LJIJJ(this.LIZLLL);
            if (iLJIJJ != -1) {
                if (iLJIJJ != 0) {
                    if (iLJIJJ != 1) {
                        if (iLJIJJ == 2) {
                            objLJI3 = interfaceC19986313HxLIZIZ.LJI(this.LIZLLL, 2, this.LIZJ, null);
                        } else {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("Unexpected index ");
                            sbLIZ.append(iLJIJJ);
                            throw new C19981113Fx(C2188811AlT.LIZIZ(sbLIZ));
                        }
                    } else {
                        objLJI2 = interfaceC19986313HxLIZIZ.LJI(this.LIZLLL, 1, this.LIZIZ, null);
                    }
                } else {
                    objLJI = interfaceC19986313HxLIZIZ.LJI(this.LIZLLL, 0, this.LIZ, null);
                }
            } else {
                interfaceC19986313HxLIZIZ.LJIIJJI(this.LIZLLL);
                Object obj = C19984013Ha.LIZ;
                if (objLJI != obj) {
                    if (objLJI2 != obj) {
                        if (objLJI3 != obj) {
                            return new C443120HZe(objLJI, objLJI2, objLJI3);
                        }
                        throw new C19981113Fx("Element 'third' is missing");
                    }
                    throw new C19981113Fx("Element 'second' is missing");
                }
                throw new C19981113Fx("Element 'first' is missing");
            }
        }
    }

    @Override // X.InterfaceC19984413He
    public final void serialize(C13HD c13hd, Object obj) {
        C443120HZe c443120HZe = (C443120HZe) obj;
        InterfaceC19986513Hz interfaceC19986513HzLIZIZ = c13hd.LIZIZ(this.LIZLLL);
        interfaceC19986513HzLIZIZ.LJJIIJ(this.LIZLLL, 0, this.LIZ, c443120HZe.getFirst());
        interfaceC19986513HzLIZIZ.LJJIIJ(this.LIZLLL, 1, this.LIZIZ, c443120HZe.getSecond());
        interfaceC19986513HzLIZIZ.LJJIIJ(this.LIZLLL, 2, this.LIZJ, c443120HZe.getThird());
        interfaceC19986513HzLIZIZ.LIZLLL();
    }

    public C13HS(C13HG<A> c13hg, C13HG<B> c13hg2, C13HG<C> c13hg3) {
        this.LIZ = c13hg;
        this.LIZIZ = c13hg2;
        this.LIZJ = c13hg3;
    }
}
