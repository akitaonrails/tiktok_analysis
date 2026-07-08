package X;

import X.C13IF;
import java.util.Iterator;

/* JADX INFO: renamed from: X.13Hn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractC19985313Hn<Element, Array, Builder extends C13IF<Array>> extends AbstractC19985213Hm<Element, Array, Builder> {
    public final C19980213Fo LIZIZ;

    public abstract Array LJIIIZ();

    public abstract void LJIIJ(InterfaceC19986513Hz interfaceC19986513Hz, Array array, int i);

    @Override // X.AbstractC19985413Ho
    public final Object LIZ() {
        return LJI(LJIIIZ());
    }

    @Override // X.AbstractC19985213Hm, X.C13HG, X.InterfaceC19984413He, X.InterfaceC19984213Hc
    public final InterfaceC19983313Gt getDescriptor() {
        return this.LIZIZ;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.13Fo] */
    public AbstractC19985313Hn(C13HG<Element> c13hg) {
        super(c13hg);
        this.LIZIZ = new AbstractC19979313Ff(c13hg.getDescriptor()) { // from class: X.13Fo
            public final String LIZJ;

            @Override // X.InterfaceC19983313Gt
            public final String LJI() {
                return this.LIZJ;
            }

            {
                super(interfaceC19983313Gt);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(interfaceC19983313Gt.LJI());
                sbLIZ.append("Array");
                this.LIZJ = C2188811AlT.LIZIZ(sbLIZ);
            }
        };
    }

    @Override // X.AbstractC19985413Ho
    public final int LIZIZ(Object obj) {
        return ((C13IF) obj).LIZLLL();
    }

    @Override // X.AbstractC19985413Ho
    public final Iterator<Element> LIZJ(Array array) {
        "This method lead to boxing and must not be used, use writeContents instead".toString();
        throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead");
    }

    @Override // X.AbstractC19985413Ho
    public final Object LJII(Object obj) {
        return ((C13IF) obj).LIZ();
    }

    @Override // X.AbstractC19985413Ho, X.InterfaceC19984213Hc
    public final Array deserialize(C13HB c13hb) {
        return (Array) LJ(c13hb);
    }

    @Override // X.AbstractC19985213Hm, X.InterfaceC19984413He
    public final void serialize(C13HD c13hd, Array array) {
        int iLIZLLL = LIZLLL(array);
        InterfaceC19986513Hz interfaceC19986513HzLJIJI = c13hd.LJIJI(this.LIZIZ);
        LJIIJ(interfaceC19986513HzLJIJI, array, iLIZLLL);
        interfaceC19986513HzLJIJI.LIZLLL();
    }

    @Override // X.AbstractC19985213Hm
    public final void LJIIIIZZ(int i, Object obj, Object obj2) {
        "This method lead to boxing and must not be used, use Builder.append instead".toString();
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead");
    }
}
