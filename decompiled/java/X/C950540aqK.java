package X;

import com.bytedance.android.livesdk.chatroom.model.interact.VirtualWaitingUser;
import com.bytedance.android.livesdk.livesetting.linkmic.RandomLinkMicOptimiseQuickInviteCountdownTimeSetting;

/* JADX INFO: renamed from: X.0aqK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C950540aqK {
    public static final long LIZ(VirtualWaitingUser virtualWaitingUser) {
        return (((long) RandomLinkMicOptimiseQuickInviteCountdownTimeSetting.INSTANCE.getValue()) + virtualWaitingUser.sendTimestamp) - C158B.LIZJ();
    }
}
