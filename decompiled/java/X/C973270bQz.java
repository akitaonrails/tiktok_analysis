package X;

import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.match.LeagueScoreInfo;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0bQz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C973270bQz {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ() {
        Boolean boolValueOf;
        LeagueScoreInfo leagueScoreInfo;
        RoomAuthStatus roomAuthStatus;
        boolean zK31 = C915980Zwa.LJFF().k31();
        boolean z = C463650IGd.LIZ;
        if (C950220apo.LJI()) {
            Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
            boolValueOf = Boolean.valueOf((room == null || (roomAuthStatus = room.mRoomAuthStatus) == null || roomAuthStatus.getGiftRankSwitchStatus() != 1) ? false : true);
        } else {
            C954460awe c954460aweLLILL = C915980Zwa.LJII().LLILL(C950220apo.LJ());
            boolValueOf = (c954460aweLLILL == null || (leagueScoreInfo = c954460aweLLILL.LJJIIJ) == null) ? null : Boolean.valueOf(!leagueScoreInfo.classOptOut);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isLeagueMatch = ");
        sbLIZ.append(zK31);
        sbLIZ.append("; rankLabelSettingEnable = ");
        sbLIZ.append(z);
        sbLIZ.append("; currentUserIsAnchor() = ");
        sbLIZ.append(C950220apo.LJI());
        sbLIZ.append("; rankOptIn = ");
        sbLIZ.append(boolValueOf);
        sbLIZ.append("; ");
        sbLIZ.append(C915980Zwa.LJFF().xB0());
        C20441214yg.LJ("LeagueBadgeUtil", C2188811AlT.LIZIZ(sbLIZ));
        if (zK31) {
            return true;
        }
        return z && Intrinsics.LJFF(boolValueOf, Boolean.TRUE);
    }
}
