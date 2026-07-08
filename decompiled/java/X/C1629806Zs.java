package X;

import kotlin.Unit;

/* JADX INFO: renamed from: X.06Zs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1629806Zs implements InterfaceC346201Wa<Object> {
    public final /* synthetic */ InterfaceC346201Wa LL;
    public final /* synthetic */ int LLILLJJLI = 1;

    public C1629806Zs(InterfaceC346201Wa interfaceC346201Wa) {
        this.LL = interfaceC346201Wa;
    }

    @Override // X.InterfaceC346201Wa
    public final Object collect(InterfaceC346701Wf<? super Object> interfaceC346701Wf, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        Object objCollect = this.LL.collect(new C1629906Zt(new C118300cf(), this.LLILLJJLI, interfaceC346701Wf), interfaceC1364105Vn);
        if (objCollect == C099R.LJFF()) {
            return objCollect;
        }
        return Unit.LIZ;
    }
}
