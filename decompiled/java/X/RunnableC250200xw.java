package X;

import com.bytedance.android.live.gift.GiftLimitNotificationEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.00xw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC250200xw implements Runnable {
    public static final RunnableC250200xw LL = new RunnableC250200xw();

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("GiftLimitNotificationManager@c802.sendingExitRunnable$1");
        try {
            C20441214yg.LIZIZ("gift_prompt_notification_leo", "send exit");
            C250000xu.LIZ.getClass();
            C250000xu.LIZJ = true;
            DataChannel dataChannel = C250000xu.LJJIJIL;
            if (dataChannel != null) {
                dataChannel.LC0(GiftLimitNotificationEvent.class, Boolean.valueOf(C250000xu.LIZJ()));
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("GiftLimitNotificationManager@c802.sendingExitRunnable$1");
    }
}
