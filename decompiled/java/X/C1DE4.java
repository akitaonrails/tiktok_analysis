package X;

import X.C1DE3;
import kotlin.Unit;

/* JADX INFO: renamed from: X.1DE4, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DE4 extends AbstractC2236208pU {
    public final C1DE3<T>.a[] LL;

    public final void LJI() {
        for (C1DE3<T>.a aVar : this.LL) {
            InterfaceC2238208po interfaceC2238208po = aVar.LLILZLL;
            if (interfaceC2238208po == null) {
                interfaceC2238208po = null;
            }
            interfaceC2238208po.dispose();
        }
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DisposeHandlersOnCancel[");
        sbLIZ.append(this.LL);
        sbLIZ.append(']');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1DE4(C1DE3.a[] aVarArr) {
        this.LL = aVarArr;
    }

    @Override // X.AbstractC2236108pT
    public final void LJFF(Throwable th) {
        LJI();
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Throwable th) {
        LJI();
        return Unit.LIZ;
    }
}
