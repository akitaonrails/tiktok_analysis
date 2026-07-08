package X;

import android.content.Context;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.event.UserProfileEvent;
import com.bytedance.android.livesdk.profile.ui.LiveProfileSheet;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.0Jcc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C495920Jcc extends C495980Jci {
    public final DataChannel LJIIJJI;

    public C495920Jcc(DataChannel dataChannel, Context context, LiveProfileSheet liveProfileSheet, C495950Jcf c495950Jcf, LiveProfileSheet liveProfileSheet2, boolean z, Room room, User user, long j, UserProfileEvent userProfileEvent, C495940Jce c495940Jce) {
        super(context, liveProfileSheet, c495950Jcf, liveProfileSheet2, z, room, user, j, userProfileEvent, c495940Jce);
        this.LJIIJJI = dataChannel;
    }
}
