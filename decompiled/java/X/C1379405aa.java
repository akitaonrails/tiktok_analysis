package X;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.Unit;

/* JADX INFO: renamed from: X.05aa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1379405aa implements PointerInputEventHandler {
    public final /* synthetic */ InterfaceC1380005ag LL;
    public final /* synthetic */ C05ZY LLILLJJLI;

    public C1379405aa(InterfaceC1380005ag interfaceC1380005ag, C05ZY c05zy) {
        this.LL = interfaceC1380005ag;
        this.LLILLJJLI = c05zy;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(InterfaceC1369205Xm interfaceC1369205Xm, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        Object objLIZIZ = C1363905Vl.LIZIZ(interfaceC1369205Xm, new C1379305aZ(this.LL, new C1379505ab(interfaceC1369205Xm.getViewConfiguration()), this.LLILLJJLI, null), interfaceC1364105Vn);
        if (objLIZIZ == C099R.LJFF()) {
            return objLIZIZ;
        }
        return Unit.LIZ;
    }
}
