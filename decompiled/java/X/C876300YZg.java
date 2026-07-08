package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0YZg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.ies.im.core.sdk.MainSafeSDKManager$initSDK$2$1", f = "MainSafeSDKManager.kt", l = {}, m = "invokeSuspend")
public final class C876300YZg extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C883090Ykd LL;
    public final /* synthetic */ C606810Nr5 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C876300YZg(C883090Ykd c883090Ykd, C606810Nr5 c606810Nr5, InterfaceC1364105Vn<? super C876300YZg> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c883090Ykd;
        this.LLILLJJLI = c606810Nr5;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C876300YZg(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MainSafeSDKManager@313d.initSDK$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LJIIIIZZ().LJIILJJIL().LIZLLL(this.LLILLJJLI.LIZIZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MainSafeSDKManager@313d.initSDK$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
