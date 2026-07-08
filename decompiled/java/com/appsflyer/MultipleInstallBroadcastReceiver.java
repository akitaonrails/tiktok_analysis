package com.appsflyer;

import X.C2188191AkT;
import X.C2214201BlK;
import X.C2408409cA;
import X.C788530UwV;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageItemInfo;
import android.content.pm.ResolveInfo;
import com.appsflyer.internal.AFb1vSDK;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes31.dex */
public class MultipleInstallBroadcastReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        com_appsflyer_MultipleInstallBroadcastReceiver_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_onBroadcastReceiverReceive(this, context, intent);
    }

    public static String INVOKEVIRTUAL_com_appsflyer_MultipleInstallBroadcastReceiver_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public void com_appsflyer_MultipleInstallBroadcastReceiver__onReceive$___twin___(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        try {
            String strINVOKEVIRTUAL_com_appsflyer_MultipleInstallBroadcastReceiver_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra = INVOKEVIRTUAL_com_appsflyer_MultipleInstallBroadcastReceiver_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(intent, "referrer");
            if (strINVOKEVIRTUAL_com_appsflyer_MultipleInstallBroadcastReceiver_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra != null && AFb1vSDK.AFKeystoreWrapper(context).getString("referrer", null) != null) {
                AFb1vSDK.AFKeystoreWrapper().valueOf(context, strINVOKEVIRTUAL_com_appsflyer_MultipleInstallBroadcastReceiver_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra);
                return;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        AFb1vSDK.AFKeystoreWrapper().AFKeystoreWrapper(context, intent);
        for (ResolveInfo resolveInfo : context.getPackageManager().queryBroadcastReceivers(new Intent("com.android.vending.INSTALL_REFERRER"), 0)) {
            String action = intent.getAction();
            if (((PackageItemInfo) resolveInfo.activityInfo).packageName.equals(context.getPackageName()) && "com.android.vending.INSTALL_REFERRER".equals(action) && !getClass().getName().equals(((PackageItemInfo) resolveInfo.activityInfo).name)) {
                try {
                    ((BroadcastReceiver) Class.forName(((PackageItemInfo) resolveInfo.activityInfo).name).newInstance()).onReceive(context, intent);
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                }
            }
        }
    }

    public static void com_appsflyer_MultipleInstallBroadcastReceiver_com_bytedance_otis_optimise_lancet_NetworkInfoManager_onReceive(MultipleInstallBroadcastReceiver multipleInstallBroadcastReceiver, Context context, Intent intent) {
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            multipleInstallBroadcastReceiver.com_appsflyer_MultipleInstallBroadcastReceiver__onReceive$___twin___(context, intent);
        } else {
            C2408409cA.LIZ();
            multipleInstallBroadcastReceiver.com_appsflyer_MultipleInstallBroadcastReceiver__onReceive$___twin___(context, intent);
        }
    }

    public static void com_appsflyer_MultipleInstallBroadcastReceiver_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_onBroadcastReceiverReceive(MultipleInstallBroadcastReceiver multipleInstallBroadcastReceiver, Context context, Intent intent) {
        if (!C2214201BlK.LJIIJJI && intent != null) {
            if (!((ArrayList) C788530UwV.LIZ).contains(intent.getAction()) && C788530UwV.LIZ("onBroadcastReceiverReceive")) {
                C2188191AkT.LIZIZ();
            }
        }
        com_appsflyer_MultipleInstallBroadcastReceiver_com_bytedance_otis_optimise_lancet_NetworkInfoManager_onReceive(multipleInstallBroadcastReceiver, context, intent);
    }
}
