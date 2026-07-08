package X;

import Y.ARunnableS20S1300000_26;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.pipo.cashier.IPIPOCashierService;
import com.ss.android.ugc.aweme.pipo.cashier.cashier.CashierKey;
import com.ss.android.ugc.aweme.pipo.cashier.cashier.ab.PipoTTLSHandleHostDestroyedSettings;
import com.ss.android.ugc.aweme.pipo.cashier.common.pay.api.GeneralQueryResultData;
import kotlin.Unit;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0uXG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1707520uXG implements InterfaceC1707160uWg {
    public final /* synthetic */ C1707840uXm LIZ;
    public final /* synthetic */ String LIZIZ = "onStartQueryPayResult";

    @Override // X.InterfaceC1707160uWg
    public final void LIZ() {
        C1708720uZC c1708720uZCLIZ = C1708710uZB.LIZ("Cashier");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(" pending");
        c1708720uZCLIZ.LIZ(4, C2188811AlT.LIZIZ(sbLIZ));
        EnumC1707350uWz enumC1707350uWz = EnumC1707350uWz.PAY_RESULT_QUERY_PENDING;
        LIZJ(enumC1707350uWz.getErrorCode(), enumC1707350uWz.getErrorMessage(), null);
    }

    public C1707520uXG(C1707840uXm c1707840uXm) {
        this.LIZ = c1707840uXm;
    }

    public static void LIZLLL(CashierKey cashierKey) {
        PipoTTLSHandleHostDestroyedSettings.Config config;
        IPIPOCashierService iPIPOCashierService = (IPIPOCashierService) PluggableExtentionKt.pluggableSpi$default(IPIPOCashierService.class, false, false, false, 14, null);
        C1709430uaL c1709430uaLLJIIZILJ = null;
        if (iPIPOCashierService != null) {
            c1709430uaLLJIIZILJ = iPIPOCashierService.LJIIZILJ(cashierKey.payRequestId, cashierKey.notificationId);
        }
        if ((c1709430uaLLJIIZILJ instanceof C1709430uaL) && c1709430uaLLJIIZILJ != null && c1709430uaLLJIIZILJ.LLJJIJI && (config = (PipoTTLSHandleHostDestroyedSettings.Config) SettingsManager.LIZLLL().LJIIIIZZ("pipo_ttls_handle_biz_destroyed_settings", PipoTTLSHandleHostDestroyedSettings.Config.class, PipoTTLSHandleHostDestroyedSettings.LIZ)) != null && Intrinsics.LJFF(config.enabled, Boolean.TRUE) && PipoTTLSHandleHostDestroyedSettings.LIZ() > 0) {
            C1708710uZB.LIZ("Cashier").LIZ(4, "handle biz destroyed");
            C786410Ut5.LJLIIL(PipoTTLSHandleHostDestroyedSettings.LIZ(), new BPEAHandler(Looper.getMainLooper()), new Runnable() { // from class: X.0uXF
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("CashierPayHelper@4352.startQueryPayResult$queryCallback$1$mayHandleBizDestroyed$1$1");
                    try {
                        new C1548870qPN().LJ("pipo_handle_unexpected_biz_destroy", "{}");
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("CashierPayHelper@4352.startQueryPayResult$queryCallback$1$mayHandleBizDestroyed$1$1");
                }
            });
        }
    }

    @Override // X.InterfaceC1707160uWg
    public final void LIZIZ(GeneralQueryResultData generalQueryResultData) {
        LJ(generalQueryResultData);
    }

    public final void LJ(GeneralQueryResultData generalQueryResultData) {
        Object c098200Yq;
        C1708030uY5 c1708030uY5 = C1708030uY5.LIZ;
        String str = this.LIZ.LIZIZ.payRequestId;
        if (str == null) {
            str = "";
        }
        c1708030uY5.LIZ(new C1708070uY9(str)).LIZIZ("query_result", null, null, 1);
        C1708720uZC c1708720uZCLIZ = C1708710uZB.LIZ("Cashier");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(" onSuccess");
        c1708720uZCLIZ.LIZ(4, C2188811AlT.LIZIZ(sbLIZ));
        C1707840uXm c1707840uXm = this.LIZ;
        ARunnableS20S1300000_26 aRunnableS20S1300000_26 = new ARunnableS20S1300000_26(c1707840uXm, generalQueryResultData, this.LIZIZ, this, 2);
        C1712020ueW c1712020ueW = c1707840uXm.LJIIIZ;
        if (c1712020ueW != null) {
            AwS570S0100000_26 awS570S0100000_26 = new AwS570S0100000_26(aRunnableS20S1300000_26, 1409);
            C1708720uZC c1708720uZCLIZ2 = C1708710uZB.LIZ("Cashier");
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("switchToSuccAndDismiss");
            sbLIZ2.append(" invoke");
            c1708720uZCLIZ2.LIZ(4, C2188811AlT.LIZIZ(sbLIZ2));
            try {
                c1712020ueW.LIZ().LJJLIIIJLLLLLLLZ(awS570S0100000_26);
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl != null) {
                C1708720uZC c1708720uZCLIZ3 = C1708710uZB.LIZ("Cashier");
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("switchToSuccAndDismiss");
                sbLIZ3.append(" failure");
                c1708720uZCLIZ3.LIZ(4, C2188811AlT.LIZIZ(sbLIZ3));
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("switchToSuccAndDismiss");
                sbLIZ4.append(" exception: ");
                sbLIZ4.append(thM5exceptionOrNullimpl);
                C1AF0.LIZJ(C2188811AlT.LIZIZ(sbLIZ4));
                return;
            }
            return;
        }
        aRunnableS20S1300000_26.run();
    }

    @Override // X.InterfaceC1707160uWg
    public final void onFail(String str, String str2) {
        C1708720uZC c1708720uZCLIZ = C1708710uZB.LIZ("Cashier");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(" onFail, ");
        sbLIZ.append(str);
        c1708720uZCLIZ.LIZ(4, C2188811AlT.LIZIZ(sbLIZ));
        LIZJ(EnumC1707350uWz.PAY_RESULT_SERVER_ERROR_API_ERROR.getErrorCode(), str, str2);
    }

    public final void LIZJ(int i, String str, String str2) {
        C1708030uY5 c1708030uY5 = C1708030uY5.LIZ;
        String str3 = this.LIZ.LIZIZ.payRequestId;
        if (str3 == null) {
            str3 = "";
        }
        c1708030uY5.LIZ(new C1708070uY9(str3)).LIZIZ("query_result", null, null, 0);
        InterfaceC1707330uWx interfaceC1707330uWx = this.LIZ.LJIIJ;
        if (interfaceC1707330uWx != null) {
            interfaceC1707330uWx.LIZ();
        }
        LIZLLL(this.LIZ.LIZIZ);
        C1707910uXt.LJFF(this.LIZ.LIZIZ, i, str, str2, 8);
        C1707910uXt.LJIIIIZZ.remove(this.LIZ.LIZIZ);
        C1714410uiN c1714410uiN = C1714410uiN.LIZ;
        String string = this.LIZ.LIZIZ.toString();
        c1714410uiN.getClass();
        C1714410uiN.LIZ(string);
    }
}
