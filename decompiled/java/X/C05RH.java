package X;

import kotlin.Unit;

/* JADX INFO: renamed from: X.05RH, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C05RH implements InterfaceC346201Wa<Object> {
    public final /* synthetic */ InterfaceC346201Wa LL;

    public C05RH(InterfaceC346201Wa interfaceC346201Wa) {
        this.LL = interfaceC346201Wa;
    }

    @Override // X.InterfaceC346201Wa
    public final Object collect(InterfaceC346701Wf<? super Object> interfaceC346701Wf, InterfaceC1364105Vn interfaceC1364105Vn) {
        Object objCollect = this.LL.collect(new C05RI(interfaceC346701Wf), interfaceC1364105Vn);
        if (objCollect == C099R.LJFF()) {
            return objCollect;
        }
        return Unit.LIZ;
    }
}
