package X;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.13fB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20065513fB extends AbstractC20055313dX implements InterfaceC20056213dg, InterfaceC20051413cu, InterfaceC1682300tsa {
    public Function0<Unit> LLJJIII;
    public boolean LLJJIJI;
    public final InterfaceC20079413hQ LLJJIJIIJIL;

    @Override // X.InterfaceC20056213dg
    public final /* synthetic */ void LJJIIZ() {
    }

    @Override // X.InterfaceC20056213dg
    public final /* synthetic */ boolean LJL() {
        return false;
    }

    @Override // X.InterfaceC20056213dg
    public final long LJJLIIIJ() {
        return C1694890uCt.LIZ.LIZ(C20052513d5.LJFF(this).LLJJJJLIIL);
    }

    @Override // X.InterfaceC20056213dg
    public final void LLIIIILZ() {
        this.LLJJIJIIJIL.LLIIIILZ();
    }

    @Override // X.InterfaceC20056213dg
    public final void LJJJJZ() {
        LLIIIILZ();
    }

    @Override // X.AbstractC20055413dY
    public final void LLILZLL() {
        LLIIIILZ();
    }

    public C20065513fB(Function0<Unit> function0) {
        this.LLJJIII = function0;
        PointerInputEventHandler pointerInputEventHandler = new PointerInputEventHandler() { // from class: X.13fC
            @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
            public final Object invoke(InterfaceC1369205Xm interfaceC1369205Xm, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
                Object objLIZIZ = C1363905Vl.LIZIZ(interfaceC1369205Xm, new C20065313f9(this.LL, null), interfaceC1364105Vn);
                if (objLIZIZ == C099R.LJFF()) {
                    return objLIZIZ;
                }
                return Unit.LIZ;
            }
        };
        C20067313fT c20067313fT = C1679720toQ.LIZ;
        C20065413fA c20065413fA = new C20065413fA(null, null, null, pointerInputEventHandler);
        LLJJ(c20065413fA);
        this.LLJJIJIIJIL = c20065413fA;
    }

    @Override // X.InterfaceC20051413cu
    public final void LLIIIZ(EnumC20061113eT enumC20061113eT) {
        this.LLJJIJI = enumC20061113eT.isFocused();
    }

    @Override // X.InterfaceC20056213dg
    public final void LJJJZ(C20067313fT c20067313fT, EnumC20065813fE enumC20065813fE, long j) {
        this.LLJJIJIIJIL.LJJJZ(c20067313fT, enumC20065813fE, j);
    }
}
