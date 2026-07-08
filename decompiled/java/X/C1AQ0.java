package X;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.PowerManager;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveAppInfoOrientationSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.common.applog.AppLog;

/* JADX INFO: renamed from: X.1AQ0, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1AQ0 extends C1AQ2 {
    @Override // X.AbstractC1549150qPp
    public final boolean shouldUseOriginalData(InterfaceC634840OvC interfaceC634840OvC) {
        EnumC1063300dmC enumC1063300dmC;
        C1543410qGZ c1543410qGZLIZJ;
        C1543190qGD c1543190qGD;
        if (interfaceC634840OvC != null && (c1543410qGZLIZJ = interfaceC634840OvC.LIZJ()) != null && (c1543190qGD = c1543410qGZLIZJ.LIZ.LIZ) != null) {
            enumC1063300dmC = c1543190qGD.LJIILJJIL;
        } else {
            enumC1063300dmC = null;
        }
        if (enumC1063300dmC == EnumC1063300dmC.WEB) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        String versionCode;
        Activity activityLIZLLL;
        String str;
        Boolean boolValueOf;
        Context context;
        Boolean bool;
        PowerManager powerManager;
        Resources resources;
        Configuration configuration;
        Context context2;
        PackageManager packageManager;
        PackageInfo packageInfoY3;
        Object objH2 = null;
        C1AQ1 c1aq1 = (C1AQ1) C1909107dp.LIZJ(C1AQ1.class, null);
        IHostAppContext iHostAppContext = (IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class);
        c1aq1.setAppName(iHostAppContext.appName());
        c1aq1.setAid(String.valueOf(iHostAppContext.appId()));
        try {
            InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
            if (interfaceC634840OvC != null && (context2 = interfaceC634840OvC.getContext()) != null && (packageManager = context2.getPackageManager()) != null && (packageInfoY3 = C786410Ut5.Y3(packageManager, context2.getPackageName(), 0)) != null) {
                versionCode = packageInfoY3.versionName;
            } else {
                versionCode = null;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            versionCode = iHostAppContext.getVersionCode();
        }
        c1aq1.setAppVersion(versionCode);
        c1aq1.setVersionCode(iHostAppContext.getVersionCode());
        c1aq1.setNetType(C786410Ut5.b3(iHostAppContext.context()));
        InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
        if (interfaceC634840OvC2 != null) {
            activityLIZLLL = interfaceC634840OvC2.LIZLLL();
        } else {
            activityLIZLLL = null;
        }
        if (activityLIZLLL != null && (!LiveAppInfoOrientationSetting.INSTANCE.getValue() ? activityLIZLLL.getRequestedOrientation() != 1 : (resources = activityLIZLLL.getResources()) != null && (configuration = resources.getConfiguration()) != null && configuration.orientation == 0)) {
            str = "horizontal";
        } else {
            str = "vertical";
        }
        c1aq1.setOrientation(str);
        c1aq1.setDeviceId(AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId());
        c1aq1.setUserId(String.valueOf(UserService.getInstance().user().getCurrentUserId()));
        c1aq1.setScreenWidth(Float.valueOf(C497740JfY.LJJI(C497740JfY.LJIIZILJ())));
        c1aq1.setScreenHeight(Float.valueOf(C497740JfY.LJJI(C497740JfY.LJIILLIIL())));
        IHostAppContext iHostAppContext2 = (IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class);
        if (iHostAppContext2 != null) {
            boolValueOf = Boolean.valueOf(iHostAppContext2.isAppBackground());
        } else {
            boolValueOf = Boolean.FALSE;
        }
        c1aq1.setAppBackground(boolValueOf);
        InterfaceC634840OvC interfaceC634840OvC3 = this.IBridgeSdkContext;
        if (interfaceC634840OvC3 != null) {
            context = interfaceC634840OvC3.getContext();
        } else {
            context = null;
        }
        if (context != null) {
            objH2 = C786410Ut5.H2(context, "power");
        }
        if ((objH2 instanceof PowerManager) && (powerManager = (PowerManager) objH2) != null && powerManager.isPowerSaveMode()) {
            bool = Boolean.TRUE;
        } else {
            bool = Boolean.FALSE;
        }
        c1aq1.setLowPowerMode(bool);
        c1aq1.setCode(1);
        completionBlock.onSuccess(c1aq1, "");
    }
}
