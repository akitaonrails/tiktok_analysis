package X;

import java.util.Iterator;

/* JADX INFO: renamed from: X.13Hm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractC19985213Hm<Element, Collection, Builder> extends AbstractC19985413Ho<Element, Collection, Builder> {
    public final C13HG<Element> LIZ;

    public abstract void LJIIIIZZ(int i, Object obj, Object obj2);

    @Override // X.C13HG, X.InterfaceC19984413He, X.InterfaceC19984213Hc
    public abstract InterfaceC19983313Gt getDescriptor();

    public AbstractC19985213Hm(C13HG c13hg) {
        this.LIZ = c13hg;
    }

    @Override // X.InterfaceC19984413He
    public void serialize(C13HD c13hd, Collection collection) {
        int iLIZLLL = LIZLLL(collection);
        InterfaceC19986513Hz interfaceC19986513HzLJIJI = c13hd.LJIJI(getDescriptor());
        Iterator<Element> itLIZJ = LIZJ(collection);
        for (int i = 0; i < iLIZLLL; i++) {
            interfaceC19986513HzLJIJI.LJJIIJ(getDescriptor(), i, this.LIZ, itLIZJ.next());
        }
        interfaceC19986513HzLJIJI.LIZLLL();
    }

    @Override // X.AbstractC19985413Ho
    public void LJFF(InterfaceC19986313Hx interfaceC19986313Hx, int i, Builder builder, boolean z) {
        LJIIIIZZ(i, builder, interfaceC19986313Hx.LJI(getDescriptor(), i, this.LIZ, null));
    }
}
