package X;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0ttS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public abstract class AbstractC1682840ttS implements InterfaceC1697560uHC, InterfaceC1685780tyC<InterfaceC1672820tdI> {
    public final C05P0 LIZIZ = C20028913Yh.LJI(new C1682540tsy(0, 0, 0, 0));

    @Override // X.InterfaceC1685750ty9
    public final /* synthetic */ InterfaceC1685750ty9 LIZ(InterfaceC1685750ty9 interfaceC1685750ty9) {
        return C1685810tyF.LIZ(this, interfaceC1685750ty9);
    }

    @Override // X.InterfaceC1685750ty9
    public final /* synthetic */ boolean LJIILLIIL(Function1 function1) {
        return C1672400tcc.LIZ(this, function1);
    }

    @Override // X.InterfaceC1685780tyC
    public final InterfaceC1672820tdI LJIIIIZZ() {
        return (InterfaceC1672820tdI) ((C13FE) this.LIZIZ).getValue();
    }

    @Override // X.InterfaceC1685780tyC
    public final C1691310u77<InterfaceC1672820tdI> getKey() {
        return C1682870ttV.LIZ;
    }

    @Override // X.InterfaceC1697560uHC
    public final void LJIILIIL(InterfaceC1682880ttW interfaceC1682880ttW) {
        ((C13FE) this.LIZIZ).setValue(new C1672840tdK(((C1671900tbo) this).LIZJ, (InterfaceC1672820tdI) interfaceC1682880ttW.LJLJJLL(C1682870ttV.LIZ)));
    }

    @Override // X.InterfaceC1685750ty9
    public final Object LJIILJJIL(Object obj, Function2 function2) {
        return function2.invoke(obj, this);
    }
}
