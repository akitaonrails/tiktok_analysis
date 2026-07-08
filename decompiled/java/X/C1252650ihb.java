package X;

import kotlin.Unit;

/* JADX INFO: renamed from: X.0ihb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1252650ihb implements InterfaceC346201Wa<C1252340ih6> {
    public final /* synthetic */ InterfaceC346201Wa LL;
    public final /* synthetic */ C1252640iha LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ C1252380ihA LLILZ;

    @Override // X.InterfaceC346201Wa
    public final Object collect(InterfaceC346701Wf<? super C1252340ih6> interfaceC346701Wf, InterfaceC1364105Vn interfaceC1364105Vn) {
        Object objCollect = this.LL.collect(new C1252670ihd(interfaceC346701Wf, this.LLILLJJLI, this.LLILLL, this.LLILZ), interfaceC1364105Vn);
        if (objCollect == C099R.LJFF()) {
            return objCollect;
        }
        return Unit.LIZ;
    }

    public C1252650ihb(InterfaceC346201Wa interfaceC346201Wa, C1252640iha c1252640iha, long j, C1252380ihA c1252380ihA) {
        this.LL = interfaceC346201Wa;
        this.LLILLJJLI = c1252640iha;
        this.LLILLL = j;
        this.LLILZ = c1252380ihA;
    }
}
