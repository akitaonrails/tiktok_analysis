package X;

import java.util.ArrayList;

/* JADX INFO: renamed from: X.19OX, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public class C19OX extends C19OL {
    public int LJIIL;

    public C19OX(C19OF c19of) {
        super(c19of);
        if (c19of instanceof C19OD) {
            this.LJ = C19OW.HORIZONTAL_DIMENSION;
        } else {
            this.LJ = C19OW.VERTICAL_DIMENSION;
        }
    }

    @Override // X.C19OL
    public final void LIZLLL(int i) {
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
