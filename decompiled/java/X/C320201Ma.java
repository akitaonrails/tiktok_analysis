package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.01Ma, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.minis.payment.qcpx.MinisCouponViewModel$fetchData$3$1", f = "MinisCouponViewModel.kt", l = {}, m = "invokeSuspend")
public final class C320201Ma extends C09AX implements Function2<Throwable, InterfaceC1364105Vn<? super Boolean>, Object> {
    public C320201Ma(InterfaceC1364105Vn<? super C320201Ma> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C320201Ma(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MinisCouponViewModel@376a.fetchData$3$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1C7U.LIZIZ("MinisCouponViewModel@376a.fetchData$3$1");
        return true;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Throwable th, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return new C320201Ma(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
