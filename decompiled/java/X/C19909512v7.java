package X;

import java.nio.charset.Charset;

/* JADX INFO: renamed from: X.12v7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19909512v7 implements InterfaceC19908312uv {
    public final AbstractC19910412vG LIZ;

    public C19909512v7(AbstractC19910412vG abstractC19910412vG) {
        Charset charset = C19856312mX.LIZ;
        this.LIZ = abstractC19910412vG;
        abstractC19910412vG.LIZ = this;
    }

    public final void LIZIZ(int i, Object obj) {
        if (obj instanceof AbstractC19855612mQ) {
            this.LIZ.LJIILL(i, (AbstractC19855612mQ) obj);
        } else {
            this.LIZ.LJIILJJIL(i, (InterfaceC19911612vS) obj);
        }
    }

    public final void LIZ(int i, InterfaceC19908112ut interfaceC19908112ut, Object obj) {
        AbstractC19910412vG abstractC19910412vG = this.LIZ;
        AbstractC19900712th abstractC19900712th = (AbstractC19900712th) obj;
        abstractC19910412vG.LJIJ(i, 2);
        abstractC19910412vG.LJIJJ(abstractC19900712th.LIZJ(interfaceC19908112ut));
        interfaceC19908112ut.LJI(abstractC19900712th, this);
    }
}
