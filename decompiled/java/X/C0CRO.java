package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CRO, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.preload.smart.v3.SmartPreloadV3Helper$checkIsWifiStateAsync$1$3$1", f = "SmartPreloadV3Helper.kt", l = {}, m = "invokeSuspend")
public final class C0CRO extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C0CRP LL;
    public final /* synthetic */ Throwable LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0CRO(C0CRP c0crp, Throwable th, InterfaceC1364105Vn<? super C0CRO> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0crp;
        this.LLILLJJLI = th;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0CRO(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SmartPreloadV3Helper@94ef.checkIsWifiStateAsync$1$3$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LIZ();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SmartPreloadV3Helper@94ef.checkIsWifiStateAsync$1$3$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
