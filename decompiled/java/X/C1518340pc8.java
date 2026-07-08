package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0pc8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
@C09DV(c = "com.ss.android.ugc.tiktok.pns.network.core.engine.PNSNetworkEngine$deliverToCallback$$inlined$invokeCallback$1", f = "PNSNetworkEngine.kt", l = {}, m = "invokeSuspend")
public final class C1518340pc8 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Object LL;
    public final /* synthetic */ InterfaceC1518350pc9 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1518340pc8(InterfaceC1364105Vn interfaceC1364105Vn, Object obj, InterfaceC1518350pc9 interfaceC1518350pc9) {
        super(2, interfaceC1364105Vn);
        this.LL = obj;
        this.LLILLJJLI = interfaceC1518350pc9;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1518340pc8(interfaceC1364105Vn, this.LL, this.LLILLJJLI);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PNSNetworkEngine@3e07.deliverToCallback$$inlined$invokeCallback$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Object obj2 = this.LL;
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(obj2);
        if (thM5exceptionOrNullimpl == null) {
            this.LLILLJJLI.LIZ((C1518330pc7) obj2);
        } else {
            this.LLILLJJLI.onError(thM5exceptionOrNullimpl);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PNSNetworkEngine@3e07.deliverToCallback$$inlined$invokeCallback$1");
        return unit;
    }
}
