package X;

import Y.AObjectS121S0000000_20;
import com.bytedance.android.starship.StarshipCxxContainerImpl;
import com.bytedance.android.starship.service.StarshipSdkService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0k7D, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
@C09DV(c = "com.bytedance.android.starship.service.StarshipSdkService$toRegisterSignal$1", f = "StarshipSdkService.kt", l = {128}, m = "invokeSuspend")
public final class C1306970k7D extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ StarshipSdkService LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1306970k7D(StarshipSdkService starshipSdkService, InterfaceC1364105Vn<? super C1306970k7D> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = starshipSdkService;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1306970k7D(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StarshipSdkService@2648.toRegisterSignal$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                this.LL = 1;
                if (AnonymousClass0958.LIZIZ(1000L, this) == objLJFF) {
                    C1C7U.LIZIZ("StarshipSdkService@2648.toRegisterSignal$1");
                    return objLJFF;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (!this.LLILLJJLI.LIZIZ.compareAndSet(false, true)) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("StarshipSdkService@2648.toRegisterSignal$1");
            return unit;
        }
        this.LLILLJJLI.getClass();
        C1307940k8m.LIZ().LJ(new AObjectS121S0000000_20(1));
        this.LLILLJJLI.getClass();
        C589400N9u c589400N9u = new C589400N9u();
        StarshipCxxContainerImpl.Companion.getClass();
        StarshipCxxContainerImpl.registerDataProvider("performance", c589400N9u);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("StarshipSdkService@2648.toRegisterSignal$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
