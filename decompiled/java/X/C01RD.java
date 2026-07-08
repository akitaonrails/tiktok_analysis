package X;

import com.ss.android.ugc.aweme.account.login.prevlogin.PrevLoginPlatformService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01RD, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.account.login.prevlogin.PrevLoginPlatformService$notifyPrevPlatformReady$1$1", f = "PrevLoginPlatformService.kt", l = {}, m = "invokeSuspend")
public final class C01RD extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ PrevLoginPlatformService LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01RD(PrevLoginPlatformService prevLoginPlatformService, InterfaceC1364105Vn<? super C01RD> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = prevLoginPlatformService;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C01RD(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PrevLoginPlatformService@79f0.notifyPrevPlatformReady$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LIZLLL.setValue(true);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PrevLoginPlatformService@79f0.notifyPrevPlatformReady$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
