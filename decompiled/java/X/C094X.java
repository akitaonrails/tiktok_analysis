package X;

import kotlin.Unit;

/* JADX INFO: renamed from: X.094X, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C094X<T> implements InterfaceC346701Wf<T> {
    public final AnonymousClass0955<T> LL;

    /* JADX WARN: Multi-variable type inference failed */
    public C094X(AnonymousClass0955<? super T> anonymousClass0955) {
        this.LL = anonymousClass0955;
    }

    @Override // X.InterfaceC346701Wf
    public final Object emit(T t, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        Object objLJIJI = this.LL.LJIJI(t, interfaceC1364105Vn);
        if (objLJIJI == C099R.LJFF()) {
            return objLJIJI;
        }
        return Unit.LIZ;
    }
}
