package com.bytedance.android.live.liveinteract.platform.statemanager.iablility;

import X.C09CT;
import X.C786410Ut5;
import X.InterfaceC0148002o;
import com.bytedance.android.livesdk.model.message.linkcore.MicPositionData;
import com.bytedance.android.livesdk.model.message.linkcore.Player;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class UserState implements InterfaceC0148002o {
    public static final /* synthetic */ int LLILLL = 0;
    public final MicPositionData LL;
    public final int LLILLJJLI;

    @C09CT("audio_mute")
    public final int audioMuted;

    @C09CT("avatar_id")
    public final long avatarId;

    @C09CT("link_mic_id")
    public final String linkMicId;

    @C09CT("link_time")
    public final long linkedTimeNano;

    @C09CT("network")
    public final int networkState;

    @C09CT("online")
    public final int onlineUserState;

    @C09CT("rtc_conn")
    public final int rtcConnection;

    @C09CT("user")
    public final Player user;

    @C09CT("video_mute")
    public final int videoMuted;

    public UserState() {
        this(null, "", null, 0L, 0, 0, 0, 0, 0, 0, 0L);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserState)) {
            return false;
        }
        UserState userState = (UserState) obj;
        return Intrinsics.LJFF(this.user, userState.user) && Intrinsics.LJFF(this.linkMicId, userState.linkMicId) && Intrinsics.LJFF(this.LL, userState.LL) && this.linkedTimeNano == userState.linkedTimeNano && this.onlineUserState == userState.onlineUserState && this.audioMuted == userState.audioMuted && this.videoMuted == userState.videoMuted && this.rtcConnection == userState.rtcConnection && this.networkState == userState.networkState && this.LLILLJJLI == userState.LLILLJJLI && this.avatarId == userState.avatarId;
    }

    public final int hashCode() {
        Player player = this.user;
        int iHashCode = (((player == null ? 0 : player.hashCode()) * 31) + this.linkMicId.hashCode()) * 31;
        MicPositionData micPositionData = this.LL;
        return ((((((((((((((((iHashCode + (micPositionData != null ? micPositionData.hashCode() : 0)) * 31) + C786410Ut5.Y2(this.linkedTimeNano)) * 31) + this.onlineUserState) * 31) + this.audioMuted) * 31) + this.videoMuted) * 31) + this.rtcConnection) * 31) + this.networkState) * 31) + this.LLILLJJLI) * 31) + C786410Ut5.Y2(this.avatarId);
    }

    public final String toString() {
        return "UserState(user=" + this.user + ", linkMicId=" + this.linkMicId + ", pos=" + this.LL + ", linkedTimeNano=" + this.linkedTimeNano + ", onlineUserState=" + this.onlineUserState + ", audioMuted=" + this.audioMuted + ", videoMuted=" + this.videoMuted + ", rtcConnection=" + this.rtcConnection + ", networkState=" + this.networkState + ", audioSource=" + this.LLILLJJLI + ", avatarId=" + this.avatarId + ')';
    }

    public static UserState LIZ(UserState userState, int i, int i2, int i3, int i4, int i5, int i6, long j, int i7) {
        Player player;
        String str;
        long j2;
        long j3 = j;
        int i8 = i6;
        int i9 = i5;
        int i10 = i4;
        int i11 = i3;
        int i12 = i2;
        int i13 = i;
        MicPositionData micPositionData = null;
        if ((i7 & 1) != 0) {
            player = userState.user;
        } else {
            player = null;
        }
        if ((i7 & 2) != 0) {
            str = userState.linkMicId;
        } else {
            str = null;
        }
        if ((i7 & 4) != 0) {
            micPositionData = userState.LL;
        }
        if ((i7 & 8) != 0) {
            j2 = userState.linkedTimeNano;
        } else {
            j2 = 0;
        }
        if ((i7 & 16) != 0) {
            i13 = userState.onlineUserState;
        }
        if ((i7 & 32) != 0) {
            i12 = userState.audioMuted;
        }
        if ((i7 & 64) != 0) {
            i11 = userState.videoMuted;
        }
        if ((i7 & 128) != 0) {
            i10 = userState.rtcConnection;
        }
        if ((i7 & 256) != 0) {
            i9 = userState.networkState;
        }
        if ((i7 & 512) != 0) {
            i8 = userState.LLILLJJLI;
        }
        if ((i7 & 1024) != 0) {
            j3 = userState.avatarId;
        }
        userState.getClass();
        return new UserState(player, str, micPositionData, j2, i13, i12, i11, i10, i9, i8, j3);
    }

    public UserState(Player player, String str, MicPositionData micPositionData, long j, int i, int i2, int i3, int i4, int i5, int i6, long j2) {
        this.user = player;
        this.linkMicId = str;
        this.LL = micPositionData;
        this.linkedTimeNano = j;
        this.onlineUserState = i;
        this.audioMuted = i2;
        this.videoMuted = i3;
        this.rtcConnection = i4;
        this.networkState = i5;
        this.LLILLJJLI = i6;
        this.avatarId = j2;
    }
}
