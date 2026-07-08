package X;

import com.bytedance.android.live.liveinteract.api.LinkConnectionTypeChangedEvent;
import com.bytedance.android.live.liveinteract.api.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.live.liveinteract.match.business.event.BattleReMatchStateChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleStateChannel;
import com.bytedance.android.livesdk.model.message.TeamUsersInfo;
import com.bytedance.android.livesdk.model.message.battle.BattleSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.match.GiftModeMeta;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0bSu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C974460bSu {
    public final String LIZ;
    public long LIZJ;
    public BattleSetting LIZLLL;
    public List<Long> LJ;
    public GiftModeMeta LJFF;
    public List<? extends TeamUsersInfo> LJI;
    public long LJII;
    public long LJIIIZ;
    public final Function1<C974460bSu, Unit> LIZIZ = null;
    public final Map<Long, Long> LJIIIIZZ = new HashMap();

    public final long LIZ() {
        BattleSetting battleSetting = this.LIZLLL;
        return battleSetting != null ? battleSetting.battleId : this.LIZJ;
    }

    public final EnumC964170bCJ LIZIZ() {
        EnumC964170bCJ enumC964170bCJ;
        EnumC964170bCJ enumC964170bCJ2;
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        LinkCrossRoomDataHolder linkCrossRoomDataHolderLIZIZ = C464550IJp.LIZIZ();
        if (Intrinsics.LJFF("data_battle_state", this.LIZ)) {
            DataChannel dataChannel = linkCrossRoomDataHolderLIZIZ.LIZIZ;
            return (dataChannel == null || (enumC964170bCJ2 = (EnumC964170bCJ) dataChannel.gg0(BattleStateChannel.class)) == null) ? EnumC964170bCJ.NONE : enumC964170bCJ2;
        }
        DataChannel dataChannel2 = linkCrossRoomDataHolderLIZIZ.LIZIZ;
        return (dataChannel2 == null || (enumC964170bCJ = (EnumC964170bCJ) dataChannel2.gg0(BattleReMatchStateChannel.class)) == null) ? EnumC964170bCJ.NONE : enumC964170bCJ;
    }

    public final boolean LIZJ() {
        EnumC964170bCJ enumC964170bCJLIZIZ = LIZIZ();
        return enumC964170bCJLIZIZ.compareTo(EnumC964170bCJ.MATCH_START) >= 0 && enumC964170bCJLIZIZ.compareTo(EnumC964170bCJ.MATCH_END) < 0;
    }

    public C974460bSu(String str) {
        this.LIZ = str;
    }

    public final void LJFF(BattleSetting battleSetting) {
        long j;
        GiftModeMeta giftModeMeta;
        this.LIZLLL = battleSetting;
        if (battleSetting != null) {
            j = battleSetting.battleId;
        } else {
            j = 0;
        }
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        C464550IJp.LIZIZ().LJJJ = j;
        this.LIZJ = j;
        if (this.LIZLLL == null) {
            C464550IJp.LIZIZ();
        }
        if (battleSetting != null) {
            giftModeMeta = battleSetting.giftModeMeta;
        } else {
            giftModeMeta = null;
        }
        this.LJFF = giftModeMeta;
    }

    public final void LIZLLL(String str, boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("key = ");
        sbLIZ.append(this.LIZ);
        sbLIZ.append("  source = ");
        sbLIZ.append(str);
        C20441214yg.LJIIIZ("BattleDataModelReset", C2188811AlT.LIZIZ(sbLIZ));
        LJ(str, z);
        LJI(EnumC964170bCJ.NONE, true);
    }

    public final void LJ(String str, boolean z) {
        long currentUserId;
        boolean z2;
        Function1<C974460bSu, Unit> function1 = this.LIZIZ;
        if (function1 != null) {
            function1.invoke(this);
        }
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null) {
            long ownerUserId = room.getOwnerUserId();
            InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
            if (interfaceC500940JkiUser != null) {
                currentUserId = interfaceC500940JkiUser.getCurrentUserId();
            } else {
                currentUserId = 0;
            }
            if (ownerUserId == currentUserId) {
                z2 = true;
            } else {
                z2 = false;
            }
            C974480bSw.LIZ.LJJI(str, z2, z);
        }
        this.LIZJ = 0L;
        this.LJII = 0L;
        this.LJIIIZ = 0L;
        this.LIZLLL = null;
        this.LJI = null;
        this.LJFF = null;
    }

    public final boolean LJI(EnumC964170bCJ enumC964170bCJ, boolean z) {
        DataChannel dataChannel;
        EnumC964170bCJ enumC964170bCJLIZIZ = LIZIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateState, old State = ");
        sbLIZ.append(enumC964170bCJLIZIZ);
        sbLIZ.append("; targetState = ");
        sbLIZ.append(enumC964170bCJ);
        C20441214yg.LJIIIZ("MatchFeedBattleDataHolder", C2188811AlT.LIZIZ(sbLIZ));
        boolean z2 = false;
        if (!z && enumC964170bCJ.compareTo(enumC964170bCJLIZIZ) <= 0) {
            return false;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("updateState, success targetState = ");
        sbLIZ2.append(enumC964170bCJ);
        C20441214yg.LJIIIZ("MatchFeedBattleDataHolder", C2188811AlT.LIZIZ(sbLIZ2));
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        LinkCrossRoomDataHolder linkCrossRoomDataHolderLIZIZ = C464550IJp.LIZIZ();
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("updateState, success stateKey = ");
        sbLIZ3.append(this.LIZ);
        C20441214yg.LJIIIZ("MatchFeedBattleDataHolder", C2188811AlT.LIZIZ(sbLIZ3));
        if (Intrinsics.LJFF("data_battle_state", this.LIZ)) {
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("updateState, success stateKey = ");
            if (linkCrossRoomDataHolderLIZIZ.LIZIZ == null) {
                z2 = true;
            }
            sbLIZ4.append(z2);
            C20441214yg.LJIIIZ("MatchFeedBattleDataHolder", C2188811AlT.LIZIZ(sbLIZ4));
            DataChannel dataChannel2 = linkCrossRoomDataHolderLIZIZ.LIZIZ;
            if (dataChannel2 != null) {
                dataChannel2.zW(BattleStateChannel.class, enumC964170bCJ);
            }
        } else {
            DataChannel dataChannel3 = linkCrossRoomDataHolderLIZIZ.LIZIZ;
            if (dataChannel3 != null) {
                dataChannel3.zW(BattleReMatchStateChannel.class, enumC964170bCJ);
            }
        }
        if (C500260Jjc.LJIJI(linkCrossRoomDataHolderLIZIZ.LIZIZ) && (dataChannel = linkCrossRoomDataHolderLIZIZ.LIZIZ) != null) {
            dataChannel.FQ2(LinkConnectionTypeChangedEvent.class);
        }
        return true;
    }
}
