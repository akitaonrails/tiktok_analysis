package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.setting.serverpush.IPushSettingService;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushSettings;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06By, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.saas.host.impl.settings.IMSettingBridgeService$batchUpdateSettingItem$1", f = "IMSettingBridgeService.kt", l = {}, m = "invokeSuspend")
public final class C1568006By extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Function0<Unit> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1568006By(Function0<Unit> function0, InterfaceC1364105Vn<? super C1568006By> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1568006By(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        PushSettings pushSettingsLJII;
        C1C7U.LIZ("IMSettingBridgeService@2ad7.batchUpdateSettingItem$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            IPushSettingService iPushSettingService = (IPushSettingService) PluggableExtentionKt.pluggableSpi$default(IPushSettingService.class, false, false, false, 14, null);
            if (iPushSettingService != null && (pushSettingsLJII = iPushSettingService.LJII()) != null) {
                Function0<Unit> function0 = this.LL;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("settings response = ");
                sbLIZ.append(pushSettingsLJII);
                C2188811AlT.LIZIZ(sbLIZ);
                C19328310jZ.LIZIZ.LIZIZ(pushSettingsLJII);
                if (function0 != null) {
                    function0.invoke();
                }
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("IMSettingBridgeService@2ad7.batchUpdateSettingItem$1");
            return unit;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("exception ");
            sbLIZ2.append(e);
            C2188811AlT.LIZIZ(sbLIZ2);
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("IMSettingBridgeService@2ad7.batchUpdateSettingItem$1");
            return unit2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
