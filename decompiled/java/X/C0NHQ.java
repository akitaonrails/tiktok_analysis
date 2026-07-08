package X;

import kotlin.jvm.internal.AwS553S0100000_9;

/* JADX INFO: renamed from: X.0NHQ, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NHQ extends C0NHE {
    public int LIZ;
    public final C0NHR LIZIZ = new InterfaceC591550NIb() { // from class: X.0NHR
        @Override // X.InterfaceC591550NIb
        public final void LIZ(InterfaceC582850MtX interfaceC582850MtX) {
            if ((interfaceC582850MtX instanceof C591310NHd) && ((C591310NHd) interfaceC582850MtX).LIZIZ == 2) {
                this.LIZ.LIZ++;
                C0NH6.LJIILLIIL.LIZIZ(new AwS553S0100000_9(interfaceC582850MtX, 1762));
                int iIntValue = ((Number) C283920BAw.LIZ.getValue()).intValue();
                C0NHQ c0nhq = this.LIZ;
                if (c0nhq.LIZ % iIntValue == 0) {
                    c0nhq.LIZLLL();
                }
            }
        }
    };

    @Override // X.C0NHE
    public final void LIZ() {
        C584960Mww.LIZ.LIZ(this.LIZIZ);
    }

    @Override // X.C0NHE
    public final void LIZJ() {
        C2183841AdS c2183841AdS = C584960Mww.LIZ;
        c2183841AdS.LIZ.remove(this.LIZIZ);
        this.LIZ = 0;
    }

    @Override // X.C0NHE
    public final C0NHJ LIZIZ() {
        return C0NHJ.AFTER_LOAD_MORE;
    }
}
