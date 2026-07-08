package com.bytedance.android.live.liveinteract.multihost.event;

import X.C01GW;
import X.C2093608Ic;
import X.C452501pT;
import X.C915980Zwa;
import X.C955400ayA;
import X.C963850bBn;
import X.EnumC452301pR;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.ILiveHostCrossRoomEventHelper;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Map;
import kotlin.jvm.internal.AFwS203S0000000_15;
import qo2.w;

/* JADX INFO: loaded from: classes16.dex */
public class LiveHostCrossRoomEventHelper implements ILiveHostCrossRoomEventHelper {
    public static final C01GW<LiveHostCrossRoomEventHelper> LLILLL = C452501pT.LIZ(EnumC452301pR.SYNCHRONIZED, AFwS203S0000000_15.get$arr$(148));
    public String LL = "";
    public String LLILLJJLI = "";

    @Override // com.bytedance.android.livesdkapi.host.ILiveHostCrossRoomEventHelper
    public final long getIsMatchOpponent() {
        return C955400ayA.LJIJJ(null, "getIsMatchOpponent");
    }

    @Override // com.bytedance.android.livesdkapi.host.ILiveHostCrossRoomEventHelper
    public final long getIsTransfer() {
        return C955400ayA.LJIJ(null, "getIsTransfer");
    }

    @Override // com.bytedance.android.livesdkapi.host.ILiveHostCrossRoomEventHelper
    public final void clearId() {
        C963850bBn.LIZ().LL = "";
        C963850bBn.LIZ().LLILLJJLI = "";
    }

    @Override // com.bytedance.android.livesdkapi.host.ILiveHostCrossRoomEventHelper
    public final String getFromRequestId() {
        return C963850bBn.LIZ().LLILLJJLI;
    }

    @Override // com.bytedance.android.livesdkapi.host.ILiveHostCrossRoomEventHelper
    public final String getFromRoomId() {
        return C963850bBn.LIZ().LL;
    }

    @Override // com.bytedance.android.livesdkapi.host.ILiveHostCrossRoomEventHelper
    public final Map<String, String> getMatchLogParams() {
        return C915980Zwa.LIZLLL().getMatchLogParams();
    }

    @Override // com.bytedance.android.livesdkapi.host.ILiveHostCrossRoomEventHelper
    public final /* bridge */ /* synthetic */ void onInit() {
    }

    @Override // com.bytedance.android.livesdkapi.host.ILiveHostCrossRoomEventHelper
    public final void setCoHostCommonParams(Map<String, String> map) {
        String str;
        String str2;
        if (C915980Zwa.LIZLLL().w9() || C915980Zwa.LIZLLL().vp0()) {
            map.put("channel_id", String.valueOf(C915980Zwa.LJII().getChannelId()));
            if (C915980Zwa.LIZ().kg2()) {
                str = "catch_bean";
            } else if (C915980Zwa.LIZ().v91()) {
                str = "take_stage";
            } else if (C915980Zwa.LIZLLL().vp0()) {
                str = "manual_pk";
            } else {
                str = "anchor";
            }
            map.put("connection_type", str);
            map.put("core_connection_type", C915980Zwa.LIZLLL().oE2());
            if (C915980Zwa.LIZLLL().vp0()) {
                map.put("sub_match_type", C915980Zwa.LIZLLL().Ti2());
                map.put("pk_id", String.valueOf(C915980Zwa.LIZLLL().getBattleId()));
            }
            w.LIZ.getClass();
            map.put("enter_from_merge", w.LJIIIZ());
            if (C915980Zwa.LIZ().Al1()) {
                C915980Zwa.LIZ().dH(map);
            }
            if (C915980Zwa.LIZLLL().L6()) {
                str2 = "1";
            } else {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            map.put("is_enlarge_mode", str2);
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.ILiveHostCrossRoomEventHelper
    public final void setFromRoomIdAndFromRequestId(String str, String str2) {
        if (C2093608Ic.LJ(C963850bBn.LIZ().LLILLJJLI) && C2093608Ic.LJ(C963850bBn.LIZ().LL)) {
            C963850bBn.LIZ().LL = str;
            C963850bBn.LIZ().LLILLJJLI = str2;
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.ILiveHostCrossRoomEventHelper
    public final void addPkTransfer(Map<String, String> map, Room room, String str) {
        C955400ayA.LJJIIJZLJL(map, room, str);
    }
}
