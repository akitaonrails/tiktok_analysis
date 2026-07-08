package X;

import Y.ARunnableS42S0110000_23;
import android.content.Context;
import android.os.SystemClock;
import com.bytedance.keva.Keva;
import com.bytedance.lynx.hybrid.webkit.ttwebview.TTWebViewHelper;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.settings.TTWebViewEnableStatusSettings;
import com.ss.android.ugc.aweme.spark.ISparkHostApi;
import jv6.a;

/* JADX INFO: renamed from: X.0qKy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1546140qKy implements InterfaceC1541440qDO {
    public static boolean LIZIZ;
    public static final C1546140qKy LIZ = new C1546140qKy();
    public static final C01GW LIZJ = C452501pT.LIZIZ(new C1546160qL0());

    @Override // X.InterfaceC1541440qDO
    public final void LIZIZ() {
        ISparkHostApi iSparkHostApi = (ISparkHostApi) PluggableExtentionKt.pluggableSpi$default(ISparkHostApi.class, false, false, false, 14, null);
        if (iSparkHostApi != null) {
            iSparkHostApi.LLFII();
        }
    }

    @Override // X.InterfaceC1541440qDO
    public final boolean LIZLLL() {
        ISparkHostApi iSparkHostApi = (ISparkHostApi) PluggableExtentionKt.pluggableSpi$default(ISparkHostApi.class, false, false, false, 14, null);
        if (iSparkHostApi != null) {
            return iSparkHostApi.checkPluginInstalled("com.ss.android.ugc.aweme.df_ttwebview");
        }
        return false;
    }

    @Override // X.InterfaceC1541440qDO
    public final void LIZJ(Context context) {
        ISparkHostApi iSparkHostApi = (ISparkHostApi) PluggableExtentionKt.pluggableSpi$default(ISparkHostApi.class, false, false, false, 14, null);
        if (iSparkHostApi != null) {
            iSparkHostApi.LJIL();
        }
        a.install(context);
    }

    @Override // X.InterfaceC1541440qDO
    public final void LIZ(boolean z, final InterfaceC1546170qL1 interfaceC1546170qL1) {
        ISparkHostApi iSparkHostApi = (ISparkHostApi) PluggableExtentionKt.pluggableSpi$default(ISparkHostApi.class, false, false, false, 14, null);
        if (iSparkHostApi == null) {
            interfaceC1546170qL1.LIZ(1100000);
            return;
        }
        if (iSparkHostApi.isFirstInstallAndFirstLaunch()) {
            interfaceC1546170qL1.LIZ(1100000);
            return;
        }
        C01GW c01gw = LIZJ;
        int i = ((Keva) c01gw.getValue()).getInt("tried_times", 0);
        TTWebViewEnableStatusSettings.LIZ.getClass();
        if (i >= TTWebViewEnableStatusSettings.LIZ().allowedMaxDownloadTimes) {
            interfaceC1546170qL1.LIZ(1000000);
            return;
        }
        Long l = TTWebViewEnableStatusSettings.LIZ().delayIfFeedPage;
        if (l != null) {
            long jLongValue = l.longValue();
            if (iSparkHostApi.LJJLIIIJ()) {
                LIZIZ = false;
                C086F c086f = C086F.LIZ;
                ARunnableS42S0110000_23 aRunnableS42S0110000_23 = new ARunnableS42S0110000_23(interfaceC1546170qL1, z, 12);
                c086f.getClass();
                C086F.LIZJ(jLongValue, aRunnableS42S0110000_23);
                return;
            }
            if (!LIZIZ) {
                LIZIZ = true;
                C086F c086f2 = C086F.LIZ;
                ARunnableS42S0110000_23 aRunnableS42S0110000_232 = new ARunnableS42S0110000_23(interfaceC1546170qL1, z, 13);
                long j = TTWebViewEnableStatusSettings.LIZ().durNotPlaying;
                c086f2.getClass();
                C086F.LIZJ(j, aRunnableS42S0110000_232);
                return;
            }
        }
        ((Keva) c01gw.getValue()).storeInt("tried_times", i + 1);
        TTWebViewHelper.doCommonReport$default(TTWebViewHelper.INSTANCE, "TTWebView_ready_install", false, SystemClock.elapsedRealtime(), "ready to install", null, false, null, 64, null);
        final ISparkHostApi iSparkHostApi2 = (ISparkHostApi) PluggableExtentionKt.pluggableSpi$default(ISparkHostApi.class, false, false, false, 14, null);
        if (iSparkHostApi2 == null) {
            return;
        }
        if (TTWebViewEnableStatusSettings.LIZ().optimizeDownload) {
            iSparkHostApi2.LJJJLL();
        } else {
            iSparkHostApi2.LJJIIZI(new C2203511BLx("com.ss.android.ugc.aweme.df_ttwebview", false, TTWebViewEnableStatusSettings.LIZ().allowConfirmWindow, !z, false, true, false, false, false, true), new C1BME() { // from class: X.0qKz
                @Override // X.C1BME
                public final void onSuccess() {
                    interfaceC1546170qL1.LIZIZ();
                    iSparkHostApi2.LJLLILLLL(true);
                }

                @Override // X.C1BME
                public final void onFailed(int i2) {
                    interfaceC1546170qL1.LIZ(i2);
                    iSparkHostApi2.LJLLILLLL(false);
                }
            });
        }
    }
}
