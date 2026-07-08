package X;

import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS594S0100000_15;

/* JADX INFO: renamed from: X.0bBz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C963970bBz implements InterfaceC915240ZvO {
    public final InterfaceC957650b1n LIZ;
    public final InterfaceC964060bC8 LIZIZ;
    public final InterfaceC964010bC3 LIZJ;
    public InterfaceC964100bCC LIZLLL;
    public C963990bC1 LJ;

    @Override // X.InterfaceC915240ZvO
    public final void LIZ(int i) {
        C963990bC1 c963990bC1;
        if (i <= 0 || !this.LIZ.LIZ()) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MG joined during team pair. Try to call battle/reject. MG num=");
        sbLIZ.append(i);
        C20441214yg.LIZIZ("MultiGuestGuestNumChangeListenerImpl", C2188811AlT.LIZIZ(sbLIZ));
        C963990bC1 c963990bC1Build = this.LIZIZ.build();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("req=");
        sbLIZ2.append(c963990bC1Build);
        C20441214yg.LJIIIZ("MultiGuestGuestNumChangeListenerImpl", C2188811AlT.LIZIZ(sbLIZ2));
        if (c963990bC1Build.LIZ <= 0 || c963990bC1Build.LIZIZ <= 0 || ((c963990bC1 = this.LJ) != null && c963990bC1.LIZIZ == c963990bC1Build.LIZIZ)) {
            C20441214yg.LJ("MultiGuestGuestNumChangeListenerImpl", "request is not valid.");
            return;
        }
        this.LJ = c963990bC1Build;
        InterfaceC964100bCC interfaceC964100bCC = this.LIZLLL;
        if (interfaceC964100bCC != null) {
            interfaceC964100bCC.LIZ();
        }
        this.LIZJ.LIZ(c963990bC1Build, new AwS559S0100000_15(this, 965), new AwS594S0100000_15(this, 886));
    }

    public C963970bBz(C956510azx c956510azx, C963980bC0 c963980bC0, C964000bC2 c964000bC2) {
        this.LIZ = c956510azx;
        this.LIZIZ = c963980bC0;
        this.LIZJ = c964000bC2;
    }
}
