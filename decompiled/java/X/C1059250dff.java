package X;

import android.content.Context;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.spark.ISparkHostApi;
import com.ss.android.ugc.aweme.spark.SparkHostApiImpl;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0dff, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1059250dff {
    public static final /* synthetic */ int LIZ = 0;

    public static C1547550qNF LIZ() {
        C1547550qNF c1547550qNF = new C1547550qNF();
        c1547550qNF.LIZIZ = new InterfaceC1543050qFz() { // from class: X.0dfK
            @Override // X.InterfaceC1543050qFz
            public final InterfaceC1543270qGL LIZ() {
                return null;
            }

            @Override // X.InterfaceC1543050qFz
            public final InterfaceC1538820q9A LIZIZ(C1537480q70 c1537480q70) {
                SparkHostApiImpl sparkHostApiImplLLJL;
                boolean z = true;
                if (C0C64.LJIILLIIL().LJIIIZ(31744, "is_open_spark_third_party_webview_jsb_lazyload", true, false)) {
                    c1537480q70.jsbOptimize = true;
                    C1058970dfD c1058970dfD = new C1058970dfD(new InterfaceC1059000dfG() { // from class: X.0dHc
                        public static final ArrayList<String> LIZIZ = C1697810uHb.LJ("sendLog", "adInfo", "sendLogWithAdInfo", "updatePCMData", "getATTStatus", "sendAnalyticsEvent", "updateFLLocalConv", "showAutofillPopup", "iabLoadProgressUpdate", "iabEditTextClick", "adAutofill", "loginPaymentMonitorTrigger", "x.reportAppLog", "x.hideLoading", "ttopAutofill", "ttopShowAutofillPopup", "jumpOpenAuthPage", "getWebViewHistoryInfo", "isViewable", "getVolume", "playableInteractionTriggered", "playable_style", "playableConvertButtonClick", "reportPnsAction", "sendAlog", "adWebNotifyPageAnomaly", "sendEcpMessage");

                        @Override // X.InterfaceC1059000dfG
                        public final boolean LIZ(String str) {
                            return ((ArrayList) C13LP.LJLJI(LIZIZ, (Object[]) C306950C1l.LIZIZ.getValue())).contains(str);
                        }

                        @Override // X.InterfaceC1059000dfG
                        public final boolean LIZIZ(C650250Pex c650250Pex) {
                            return ((ArrayList) C13LP.LJLJI(LIZIZ, (Object[]) C306950C1l.LIZIZ.getValue())).contains(c650250Pex.LIZ);
                        }
                    }, true);
                    c1537480q70.LJJ(C1543000qFu.class, c1058970dfD);
                    C1542930qFn c1542930qFn = new C1542930qFn() { // from class: X.0dfL
                        @Override // X.C1542930qFn, X.InterfaceC1538970q9P
                        public final void LJII(Context context) {
                            C1059860dge c1059860dge;
                            super.LJII(context);
                            InterfaceC1541990qEH interfaceC1541990qEHLJIJJLI = LJIJJLI();
                            if (interfaceC1541990qEHLJIJJLI != null && (c1059860dge = (C1059860dge) interfaceC1541990qEHLJIJJLI.getHybridContext().LJFF(C1059860dge.class)) != null) {
                                c1059860dge.LIZLLL(Context.class, context);
                            }
                        }
                    };
                    c1542930qFn.LIZLLL = c1058970dfD;
                    C1058920df8.LIZ.getClass();
                    ((ArrayList) c1542930qFn.LJIIIZ).addAll(AbstractC1058820dey.LIZIZ());
                    ((ArrayList) c1542930qFn.LJIIIIZZ).addAll(AbstractC1058820dey.LIZJ());
                    return c1542930qFn;
                }
                ISparkHostApi iSparkHostApi = (ISparkHostApi) PluggableExtentionKt.pluggableSpi$default(ISparkHostApi.class, false, false, false, 14, null);
                if (iSparkHostApi == null || (sparkHostApiImplLLJL = iSparkHostApi.LLJL()) == null || !sparkHostApiImplLLJL.LLLLIIIILLL() || !iSparkHostApi.LJJLIIIJLJLI(c1537480q70)) {
                    z = false;
                }
                C1058970dfD c1058970dfD2 = new C1058970dfD(new InterfaceC1059000dfG() { // from class: X.0dHc
                    public static final ArrayList<String> LIZIZ = C1697810uHb.LJ("sendLog", "adInfo", "sendLogWithAdInfo", "updatePCMData", "getATTStatus", "sendAnalyticsEvent", "updateFLLocalConv", "showAutofillPopup", "iabLoadProgressUpdate", "iabEditTextClick", "adAutofill", "loginPaymentMonitorTrigger", "x.reportAppLog", "x.hideLoading", "ttopAutofill", "ttopShowAutofillPopup", "jumpOpenAuthPage", "getWebViewHistoryInfo", "isViewable", "getVolume", "playableInteractionTriggered", "playable_style", "playableConvertButtonClick", "reportPnsAction", "sendAlog", "adWebNotifyPageAnomaly", "sendEcpMessage");

                    @Override // X.InterfaceC1059000dfG
                    public final boolean LIZ(String str) {
                        return ((ArrayList) C13LP.LJLJI(LIZIZ, (Object[]) C306950C1l.LIZIZ.getValue())).contains(str);
                    }

                    @Override // X.InterfaceC1059000dfG
                    public final boolean LIZIZ(C650250Pex c650250Pex) {
                        return ((ArrayList) C13LP.LJLJI(LIZIZ, (Object[]) C306950C1l.LIZIZ.getValue())).contains(c650250Pex.LIZ);
                    }
                }, z);
                c1537480q70.LJJ(C1543000qFu.class, c1058970dfD2);
                return C1058920df8.LIZ.LIZ(c1058970dfD2);
            }
        };
        c1547550qNF.LJ = C1059240dfe.LIZ;
        return c1547550qNF;
    }
}
