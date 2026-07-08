package X;

import java.util.HashMap;

/* JADX INFO: renamed from: X.1BSl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2205211BSl extends C1BSW<C2205271BSr, C1BSY> implements InterfaceC2205311BSv, InterfaceC2205331BSx, C1BT6, C1BT5, InterfaceC2205321BSw {
    public C2205211BSl(C1BSM c1bsm) {
        super(c1bsm);
    }

    @Override // X.InterfaceC2205321BSw
    public final void LIZ(C2205271BSr c2205271BSr) {
        InterfaceC2205321BSw interfaceC2205321BSw;
        C1BSY c1bsy = (C1BSY) ((HashMap) this.LIZIZ).get(c2205271BSr);
        if (c1bsy != null && (interfaceC2205321BSw = c1bsy.LIZLLL) != null) {
            interfaceC2205321BSw.LIZ(c2205271BSr);
        }
    }

    @Override // X.InterfaceC2205311BSv
    public final void LIZIZ(C2205271BSr c2205271BSr) {
        InterfaceC2205311BSv interfaceC2205311BSv;
        C1BSY c1bsy = (C1BSY) ((HashMap) this.LIZIZ).get(c2205271BSr);
        if (c1bsy != null && (interfaceC2205311BSv = c1bsy.LIZJ) != null) {
            interfaceC2205311BSv.LIZIZ(c2205271BSr);
        }
    }

    @Override // X.InterfaceC2205331BSx
    public final boolean LIZLLL(C2205271BSr c2205271BSr) {
        InterfaceC2205331BSx interfaceC2205331BSx;
        C1BSY c1bsy = (C1BSY) ((HashMap) this.LIZIZ).get(c2205271BSr);
        if (c1bsy != null && (interfaceC2205331BSx = c1bsy.LJ) != null) {
            return interfaceC2205331BSx.LIZLLL(c2205271BSr);
        }
        return false;
    }
}
