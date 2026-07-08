package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0x4c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.bytedance.android.live.walletclean.framework.repository.listeners.WalletEventDataSource$registerExchangeUpdates$2", f = "WalletEventDataSource.kt", l = {87}, m = "invokeSuspend")
public final class C1805080x4c extends C09AX implements Function2<Boolean, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1805070x4b LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1805080x4c(C1805070x4b c1805070x4b, InterfaceC1364105Vn<? super C1805080x4c> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1805070x4b;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1805080x4c(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("WalletEventDataSource@7f89.registerExchangeUpdates$2");
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
            C2252331DDr c2252331DDr = this.LLILLJJLI.LLILZIL;
            C788570UwZ c788570UwZ = new C788570UwZ(C1150850g3P.LIZJ().LIZIZ);
            this.LL = 1;
            if (c2252331DDr.emit(c788570UwZ, this) == objLJFF) {
                C1C7U.LIZIZ("WalletEventDataSource@7f89.registerExchangeUpdates$2");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("WalletEventDataSource@7f89.registerExchangeUpdates$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Boolean bool, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(bool, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
