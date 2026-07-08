package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.setting.serverpush.IPushSettingService;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushSettings;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06C1, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.unifiedauth.manager.PushUserGuidePopupManager$fetchUserSettings$2", f = "PushUserGuidePopupManager.kt", l = {}, m = "invokeSuspend")
public final class C06C1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super PushSettings>, Object> {
    public C06C1(InterfaceC1364105Vn<? super C06C1> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C06C1(interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super PushSettings> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        PushSettings pushSettingsLJII;
        C1C7U.LIZ("PushUserGuidePopupManager@2b75.fetchUserSettings$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C211000rc.LIZ("PushUserGuidePopupManager");
        try {
            pushSettingsLJII = ((IPushSettingService) ServiceManager.get().getService(IPushSettingService.class)).LJII();
            C211000rc.LIZ("PushUserGuidePopupManager");
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            C211000rc.LIZIZ("PushUserGuidePopupManager", "fetchUserSettings() network error");
            pushSettingsLJII = null;
        }
        C1C7U.LIZIZ("PushUserGuidePopupManager@2b75.fetchUserSettings$2");
        return pushSettingsLJII;
    }
}
