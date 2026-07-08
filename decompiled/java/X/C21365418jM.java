package X;

import Y.ARunnableS43S0101000_32;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.18jM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21365418jM extends C21365218jK {
    public final Function2<String, String, Unit> LJIIJ;
    public final InterfaceC21358118iB LJIIJJI;

    @Override // X.C21365218jK
    public final void LIZ() {
        InterfaceC21358118iB interfaceC21358118iB = this.LJIIJJI;
        if (interfaceC21358118iB != null) {
            C21366118jT c21366118jT = this.LIZLLL;
            interfaceC21358118iB.LJIIJJI();
        }
    }

    @Override // X.C21365218jK
    public final void LIZJ(C21359318iN c21359318iN) {
        this.LIZ = c21359318iN;
        c21359318iN.setEffectTextChangeListener(new InterfaceC21359018iK() { // from class: X.18jR
            @Override // X.InterfaceC21359018iK
            public final void LIZ(String str) {
            }

            @Override // X.InterfaceC21359018iK
            public final void LIZIZ(String str) {
                C21365418jM c21365418jM = this.LIZ;
                if (c21365418jM.LJI) {
                    Function2<String, String, Unit> function2 = c21365418jM.LJIIJ;
                    c21365418jM.LIZLLL.getClass();
                    function2.invoke(null, str);
                }
            }
        });
    }

    @Override // X.C21365218jK
    public final void LIZLLL(int i, String str) {
        this.LJFF.runOnUiThread(new ARunnableS43S0101000_32(i, this, 9));
    }

    public C21365418jM(C19EG c19eg, InterfaceC21366018jS interfaceC21366018jS, Function2 function2) {
        super(c19eg, interfaceC21366018jS);
        this.LJIIJ = function2;
        this.LJIIJJI = null;
    }
}
