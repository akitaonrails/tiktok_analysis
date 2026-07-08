package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.setting.serverpush.IPushSettingService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06Bz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.legoImpl.task.AccountRegisterTask$run$1$1", f = "AccountRegisterTask.kt", l = {}, m = "invokeSuspend")
public final class C1568106Bz extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ int LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1568106Bz(int i, InterfaceC1364105Vn<? super C1568106Bz> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1568106Bz(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AccountRegisterTask@9332.run$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            C19328310jZ.LIZIZ.LIZIZ(((IPushSettingService) ServiceManager.get().getService(IPushSettingService.class)).LJII());
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[onLoginOrSwitch] type = ");
            sbLIZ.append(this.LL);
            sbLIZ.append(", update push settings successfully!");
            C2188811AlT.LIZIZ(sbLIZ);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AccountRegisterTask@9332.run$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
