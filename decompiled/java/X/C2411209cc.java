package X;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.common.net.NetWorkStateReceiver;
import com.ss.android.ugc.aweme.feed.earphone.IEarphonePlayerControlService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.09cc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2411209cc implements InterfaceC817550W5h {
    public final List<BroadcastReceiver> LIZ = new ArrayList();
    public C722870SXd LIZIZ = null;

    /* JADX WARN: Type inference failed for: r6v0, types: [X.0SXd, android.content.BroadcastReceiver] */
    @Override // X.InterfaceC817550W5h
    public final synchronized void LIZ(Context context) {
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("ear_phone_unplug_experiment", true)) {
            ?? r6 = new BroadcastReceiver() { // from class: X.0SXd
                public static void LIZ(Intent intent) {
                    String action;
                    Activity activityLJFF = C2214201BlK.LJFF();
                    if (intent != null) {
                        action = intent.getAction();
                    } else {
                        action = null;
                    }
                    if (Intrinsics.LJFF(action, "android.media.AUDIO_BECOMING_NOISY") && (activityLJFF instanceof C19EG)) {
                        C680080Qly.LIZIZ((C19EG) activityLJFF).LLIZLLLIL.postValue("on_ear_phone_unplug");
                        C2344809Gs.LJFF("EarPhoneUnplugReceiver", "Received BECOMING_NOISY Broadcast");
                        C722880SXe.LIZ().LJIIIZ("audio become noisy");
                        ((IEarphonePlayerControlService) ServiceManager.get().getService(IEarphonePlayerControlService.class)).LIZLLL(true);
                    }
                }

                @Override // android.content.BroadcastReceiver
                public final void onReceive(Context context2, Intent intent) {
                    if (!C2214201BlK.LJIIJJI && intent != null) {
                        if (!((ArrayList) C788530UwV.LIZ).contains(intent.getAction()) && C788530UwV.LIZ("onBroadcastReceiverReceive")) {
                            C2188191AkT.LIZIZ();
                        }
                    }
                    if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                        LIZ(intent);
                    } else {
                        C2408409cA.LIZ();
                        LIZ(intent);
                    }
                }
            };
            this.LIZIZ = r6;
            IntentFilter intentFilter = new IntentFilter();
            for (String str : new String[]{"android.media.AUDIO_BECOMING_NOISY"}) {
                intentFilter.addAction(str);
            }
            C786410Ut5.LJIJJ(context, r6, intentFilter);
        }
        if (context != null && Build.VERSION.SDK_INT >= 26) {
            NetWorkStateReceiver netWorkStateReceiver = new NetWorkStateReceiver();
            ((ArrayList) this.LIZ).add(netWorkStateReceiver);
            IntentFilter intentFilter2 = new IntentFilter();
            for (String str2 : new String[]{"android.net.conn.CONNECTIVITY_CHANGE"}) {
                intentFilter2.addAction(str2);
            }
            C786410Ut5.LJIJJ(context, netWorkStateReceiver, intentFilter2);
        }
    }

    @Override // X.InterfaceC817550W5h
    public final synchronized void LIZIZ(Context context) {
        if (this.LIZIZ != null) {
            SettingsManager.LIZLLL().getClass();
            if (SettingsManager.LIZ("ear_phone_unplug_experiment", true)) {
                C786410Ut5.LJJIFFI(context, this.LIZIZ);
            }
        }
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        for (BroadcastReceiver broadcastReceiver : (ArrayList) this.LIZ) {
            if (broadcastReceiver != null) {
                C786410Ut5.LJJIFFI(context, broadcastReceiver);
            }
        }
        ((ArrayList) this.LIZ).clear();
    }
}
