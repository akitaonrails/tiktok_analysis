package X;

import java.util.ArrayList;

/* JADX INFO: renamed from: X.1Dok, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public class C2267281Dok extends C2267191Dob {
    public int LJIIL;

    public C2267281Dok(AbstractC2267131DoV abstractC2267131DoV) {
        super(abstractC2267131DoV);
        if (abstractC2267131DoV instanceof C2267101DoS) {
            this.LJ = EnumC21532519Op.HORIZONTAL_DIMENSION;
        } else {
            this.LJ = EnumC21532519Op.VERTICAL_DIMENSION;
        }
    }

    @Override // X.C2267191Dob
    public final void LIZLLL(int i) {
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
