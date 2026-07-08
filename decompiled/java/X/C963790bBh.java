package X;

import Y.AfS41S1200000_15;
import com.bytedance.android.live.liveinteract.competition.api.CompetitionApi;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionCommon;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionInfoParams;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.bytedance.scene.Scene;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0bBh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C963790bBh {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(LiveWidget liveWidget, EnumC919170a1j enumC919170a1j, String str, Function1 function1, Function1 function12) {
        Room room;
        long id;
        DataChannel dataChannel = liveWidget.dataChannel;
        if (dataChannel != null) {
            room = (Room) dataChannel.gg0(RoomChannel.class);
        } else {
            room = null;
        }
        CompetitionCommon competitionCommon = new CompetitionCommon();
        competitionCommon.type = enumC919170a1j.getType();
        competitionCommon.channelId = C915980Zwa.LJII().getChannelId();
        C970920bNC c970920bNC = new C970920bNC();
        c970920bNC.LJIIL(str, Scene.SCENE_SERVICE, true);
        c970920bNC.LJIJJLI("battle_info_request");
        C970920bNC c970920bNC2 = new C970920bNC();
        C480460Ism.LIZ().getClass();
        CompetitionApi competitionApi = (CompetitionApi) C480460Ism.LIZLLL(CompetitionApi.class);
        CompetitionInfoParams competitionInfoParams = new CompetitionInfoParams();
        competitionInfoParams.bizCommon = competitionCommon;
        if (room != null) {
            id = room.getId();
        } else {
            id = 0;
        }
        competitionInfoParams.roomId = id;
        competitionInfoParams.needMvp = false;
        ((C0J1N) competitionApi.competitionInfo(competitionInfoParams).LJIILIIL(new C0UO0()).LIZJ(C11RD.LJ(liveWidget))).LIZ(new AfS41S1200000_15(c970920bNC2, function1, str, 1), new AfS41S1200000_15(c970920bNC2, function12, str, 2));
    }
}
