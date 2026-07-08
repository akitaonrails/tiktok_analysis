package X;

import com.bytedance.android.live.iap.service.IapService;
import com.bytedance.android.livesdk.livesetting.revenuestrategy.LiveCurrencyCodeTimeoutSettings;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.09Kb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.bytedance.android.livesdk.impl.revenue.strategy.util.TaskApiUtilsKt$getCurrencyCode$deferred$1", f = "TaskApiUtils.kt", l = {}, m = "invokeSuspend")
public final class C2353509Kb extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super String>, Object> {
    public C2353509Kb(InterfaceC1364105Vn<? super C2353509Kb> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2353509Kb(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        C006A c006aLIZJ;
        C1C7U.LIZ("TaskApiUtilsKt@ac6a.getCurrencyCode$deferred$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C01GW c01gw = C1796440wqg.LIZ;
        String currencyCode = C1796440wqg.LIZIZ;
        if (currencyCode != null && currencyCode.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            currencyCode = null;
            try {
                c006aLIZJ = C1161920gLG.LIZJ(IapService.class);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c006aLIZJ = null;
            }
            IapService iapService = (IapService) c006aLIZJ;
            if (iapService != null) {
                currencyCode = iapService.getCurrencyCode();
            }
            if (currencyCode == null) {
                currencyCode = "";
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("timeout: currency_code=");
        sbLIZ.append(currencyCode);
        sbLIZ.append(", timeout_value=");
        sbLIZ.append(LiveCurrencyCodeTimeoutSettings.INSTANCE.timeoutMs());
        C20441214yg.LIZIZ("requestTaskInfoInternal", C2188811AlT.LIZIZ(sbLIZ));
        C1C7U.LIZIZ("TaskApiUtilsKt@ac6a.getCurrencyCode$deferred$1");
        return currencyCode;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super String> interfaceC1364105Vn) {
        return new C2353509Kb(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
