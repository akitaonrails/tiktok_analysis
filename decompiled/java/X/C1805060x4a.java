package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0x4a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.bytedance.android.live.walletclean.framework.repository.listeners.WalletEventDataSource$onReceiveJsEvent$1", f = "WalletEventDataSource.kt", l = {60}, m = "invokeSuspend")
public final class C1805060x4a extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1805070x4b LLILLJJLI;
    public final /* synthetic */ C262100zr LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1805060x4a(C1805070x4b c1805070x4b, C262100zr c262100zr, InterfaceC1364105Vn<? super C1805060x4a> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1805070x4b;
        this.LLILLL = c262100zr;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1805060x4a(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("WalletEventDataSource@7f89.onReceiveJsEvent$1");
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
            InterfaceC121000d6 interfaceC121000d6LIZ = this.LLILLJJLI.LL.LIZ(this.LLILLL);
            if (interfaceC121000d6LIZ != null) {
                C2252331DDr c2252331DDr = this.LLILLJJLI.LLILLL;
                this.LL = 1;
                if (c2252331DDr.emit(interfaceC121000d6LIZ, this) == objLJFF) {
                    C1C7U.LIZIZ("WalletEventDataSource@7f89.onReceiveJsEvent$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("WalletEventDataSource@7f89.onReceiveJsEvent$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
