package X;

import kotlin.Unit;

/* JADX INFO: renamed from: X.08pn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2238108pn extends AbstractC2236208pU {
    public final InterfaceC2238208po LL;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DisposeOnCancel[");
        sbLIZ.append(this.LL);
        sbLIZ.append(']');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C2238108pn(InterfaceC2238208po interfaceC2238208po) {
        this.LL = interfaceC2238208po;
    }

    @Override // X.AbstractC2236108pT
    public final void LJFF(Throwable th) {
        this.LL.dispose();
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
        LJFF(th);
        return Unit.LIZ;
    }
}
