package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.setting.serverpush.IPushSettingService;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushSettings;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.06C4, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.activity.BaMessageSettingActivity$onResume$1", f = "BaMessageSettingActivity.kt", l = {}, m = "invokeSuspend")
public final class C06C4 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super PushSettings>, Object> {
    public C06C4(InterfaceC1364105Vn<? super C06C4> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C06C4(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BaMessageSettingActivity@5e22.onResume$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            PushSettings pushSettingsLJII = ((IPushSettingService) ServiceManager.get().getService(IPushSettingService.class)).LJII();
            C1C7U.LIZIZ("BaMessageSettingActivity@5e22.onResume$1");
            return pushSettingsLJII;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1C7U.LIZIZ("BaMessageSettingActivity@5e22.onResume$1");
            return null;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super PushSettings> interfaceC1364105Vn) {
        return new C06C4(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
