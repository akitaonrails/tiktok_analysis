package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01VG, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.live.walletclean.framework.repository.listeners.WalletEventDataSource$registerBalanceUpdates$2", f = "WalletEventDataSource.kt", l = {76}, m = "invokeSuspend")
public final class C01VG extends C09AX implements Function2<Long, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1805070x4b LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01VG(C1805070x4b c1805070x4b, InterfaceC1364105Vn<? super C01VG> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c1805070x4b;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C01VG c01vg = new C01VG(this.LLILLL, interfaceC1364105Vn);
        c01vg.LLILLJJLI = obj;
        return c01vg;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("WalletEventDataSource@7f89.registerBalanceUpdates$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            Long l = (Long) this.LLILLJJLI;
            C2252331DDr c2252331DDr = this.LLILLL.LLILZ;
            C00F7 c00f7 = new C00F7(l);
            this.LL = 1;
            if (c2252331DDr.emit(c00f7, this) == objLJFF) {
                C1C7U.LIZIZ("WalletEventDataSource@7f89.registerBalanceUpdates$2");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("WalletEventDataSource@7f89.registerBalanceUpdates$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Long l, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(l, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
