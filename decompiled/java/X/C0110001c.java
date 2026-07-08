package X;

import com.bytedance.android.live.liveinteract.platform.statemanager.iablility.UserState;
import com.bytedance.android.livesdk.model.message.linkcore.MicPositionData;
import com.bytedance.android.livesdk.model.message.linkcore.Player;
import tikcast.linkmic.common.AvatarState;
import tikcast.linkmic.common.LinkUserState;

/* JADX INFO: renamed from: X.001c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0110001c {
    public static UserState LIZ(LinkUserState linkUserState) {
        long j;
        Player player = linkUserState.user;
        String str = linkUserState.linkmicId;
        MicPositionData micPositionData = linkUserState.pos;
        long j2 = linkUserState.linkedTimeNano;
        int i = linkUserState.onlineUserState;
        int i2 = linkUserState.audioMuted;
        int i3 = linkUserState.videoMuted;
        int i4 = linkUserState.rtcConnection;
        int i5 = linkUserState.networkState;
        AvatarState avatarState = linkUserState.avatar;
        if (avatarState != null) {
            j = avatarState.avatarId;
        } else {
            j = 0;
        }
        return new UserState(player, str, micPositionData, j2, i, i2, i3, i4, i5, 0, j);
    }
}
