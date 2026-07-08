package androidx.core.telecom.internal;

import X.C1302230jzZ;
import X.C2188191AkT;
import X.C2188811AlT;
import X.C2214201BlK;
import X.C2408409cA;
import X.C786410Ut5;
import X.C788530UwV;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class MuteStateReceiver extends BroadcastReceiver {
    public final Function1<? super Boolean, Unit> LIZ;

    public MuteStateReceiver() {
    }

    public MuteStateReceiver(C1302230jzZ c1302230jzZ) {
        this();
        this.LIZ = c1302230jzZ;
    }

    public final void LIZ(Context context, Intent intent) {
        String action;
        Object objH2 = null;
        if (intent != null) {
            action = intent.getAction();
        } else {
            action = null;
        }
        if (Intrinsics.LJFF("android.media.action.MICROPHONE_MUTE_CHANGED", action)) {
            if (context != null) {
                objH2 = C786410Ut5.H2(context, "audio");
            }
            AudioManager audioManager = (AudioManager) objH2;
            Function1<? super Boolean, Unit> function1 = this.LIZ;
            if (function1 != null) {
                function1.invoke(Boolean.valueOf(audioManager.isMicrophoneMute()));
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (!C2214201BlK.LJIIJJI && intent != null) {
            if (!((ArrayList) C788530UwV.LIZ).contains(intent.getAction()) && C788530UwV.LIZ("onBroadcastReceiverReceive")) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onBroadcastReceiverReceive: ");
                sbLIZ.append(intent.getAction());
                C2188811AlT.LIZIZ(sbLIZ);
                C2188191AkT.LIZIZ();
            }
        }
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            LIZ(context, intent);
        } else {
            C2408409cA.LIZ();
            LIZ(context, intent);
        }
    }
}
