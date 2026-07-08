package X;

import com.bytedance.android.live.liveinteract.api.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.live.liveinteract.multimatch.event.MatchStatusRestEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.0bS0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C973900bS0 {
    public static final C974460bSu LIZ = new C974460bSu("data_battle_state");
    public static final C974460bSu LIZIZ = new C974460bSu("data_battle_rematch_state");
    public static EnumC919170a1j LIZJ;

    static {
        new C098J();
        LIZJ = EnumC919170a1j.UNKNOWN;
    }

    public static void LIZ(String str) {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        DataChannel dataChannel = C464550IJp.LIZIZ().LIZIZ;
        if (dataChannel != null) {
            dataChannel.LC0(MatchStatusRestEvent.class, 0);
        }
        LIZ.LIZLLL(str, false);
        LIZIZ.LIZLLL(str, true);
    }
}
