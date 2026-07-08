package X;

import android.util.SparseLongArray;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdk.rank.api.RankTypeV2;
import com.bytedance.android.livesdk.rank.list.model.RankListV2Response;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0xDg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1810700xDg {
    public static final SparseLongArray LIZ = new SparseLongArray();
    public static final SparseLongArray LIZIZ = new SparseLongArray();
    public static final SparseLongArray LIZJ = new SparseLongArray();
    public static final SparseLongArray LIZLLL = new SparseLongArray();
    public static final Set<Integer> LJ = new LinkedHashSet();
    public static int LJFF;
    public static long LJI;
    public static long LJII;
    public static int LJIIIIZZ;
    public static boolean LJIIIZ;

    public static int LIZ() {
        Object objValueOf;
        String str = CardStruct.IStatusCode.DEFAULT;
        int i = LJIIIIZZ;
        try {
            Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
            if (room == null || room.getOwnerUserId() != UserService.getInstance().user().getCurrentUserId()) {
                objValueOf = Integer.valueOf(LJIIIIZZ);
            } else {
                String strLIZ = InterfaceC1094280eaA.xd.LIZ();
                if (strLIZ == null) {
                    strLIZ = CardStruct.IStatusCode.DEFAULT;
                }
                i = CastIntegerProtector.parseInt(strLIZ);
                objValueOf = Unit.LIZ;
            }
            C189200o6.m2constructorimpl(objValueOf);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        long jCurrentTimeMillis = System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        String strLIZ2 = InterfaceC1094280eaA.f143yd.LIZ();
        if (strLIZ2 != null) {
            str = strLIZ2;
        }
        return String.valueOf(jCurrentTimeMillis).compareTo(str) > 0 ? i + 1 : i;
    }

    public static boolean LIZJ() {
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room == null || room.getOwnerUserId() != UserService.getInstance().user().getCurrentUserId()) {
            return LJIIIZ;
        }
        Boolean boolLIZ = InterfaceC1094280eaA.wd.LIZ();
        if (boolLIZ != null) {
            return boolLIZ.booleanValue();
        }
        return false;
    }

    public static int LIZLLL(DataChannel dataChannel) {
        Room room;
        RoomAuthStatus roomAuthStatus;
        if (dataChannel != null && C500260Jjc.LJIIZILJ(dataChannel) && (room = (Room) dataChannel.gg0(RoomChannel.class)) != null && (roomAuthStatus = room.mRoomAuthStatus) != null) {
            return roomAuthStatus.gamerankingswitch;
        }
        return -1;
    }

    public static int LJ(DataChannel dataChannel) {
        RoomAuthStatus roomAuthStatus;
        if (dataChannel != null && C500260Jjc.LJIIZILJ(dataChannel)) {
            Room room = (Room) dataChannel.gg0(RoomChannel.class);
            if (room != null && (roomAuthStatus = room.mRoomAuthStatus) != null) {
                return roomAuthStatus.getGiftRankSwitchStatus();
            }
            return -1;
        }
        Long l = (Long) DataChannelGlobal.LLILZ.gg0(C951600as2.class);
        if (l != null) {
            return (int) l.longValue();
        }
        return -1;
    }

    public static long LIZIZ(int i, boolean z) {
        if (!z) {
            SparseLongArray sparseLongArray = LIZ;
            if (sparseLongArray.indexOfKey(i) >= 0) {
                return sparseLongArray.get(i);
            }
            return -1L;
        }
        SparseLongArray sparseLongArray2 = LIZIZ;
        if (sparseLongArray2.indexOfKey(i) >= 0) {
            return sparseLongArray2.get(i);
        }
        return -1L;
    }

    public static void LJI(DataChannel dataChannel, RankListV2Response.Data data) {
        Room room;
        boolean z;
        RankListV2Response.RankView rankView;
        RankListV2Response.RankView rankView2;
        RankListV2Response.RankInfo rankInfo;
        RankListV2Response.Gap gap;
        if (dataChannel == null || (room = (Room) dataChannel.gg0(RoomChannel.class)) == null) {
            room = new Room();
            room.mRoomAuthStatus = new RoomAuthStatus();
        }
        if (data != null && (rankView2 = data.rankView) != null && (rankInfo = rankView2.ownerRank) != null && (gap = rankInfo.gap) != null && gap.banInfo == 1) {
            z = true;
        } else {
            z = false;
        }
        int i = -1;
        if (z) {
            RankTypeV2 rankTypeV2 = RankTypeV2.LIZ;
            RankListV2Response.RankView rankView3 = data.rankView;
            if (rankView3 != null) {
                i = rankView3.rankType;
            }
            int i2 = C235000vU.LIZ(i, 0).group_type;
            if (i2 == EnumC1811400xEo.GIFT_RANK.getType()) {
                room.mRoomAuthStatus.setGiftRankSwitchStatus(2);
            } else if (i2 == EnumC1811400xEo.GAME_RANK.getType()) {
                room.mRoomAuthStatus.gamerankingswitch = 2;
            } else if (i2 == EnumC1811400xEo.E_COMMERCE.getType()) {
                room.mRoomAuthStatus.ecRankSwitchStatus = 2;
            } else if (i2 == EnumC1811400xEo.FRIEND_RANKING.getType()) {
                room.mRoomAuthStatus.friendrankswitch = 2;
            }
        } else {
            RankTypeV2 rankTypeV22 = RankTypeV2.LIZ;
            if (data != null && (rankView = data.rankView) != null) {
                i = rankView.rankType;
            }
            int i3 = C235000vU.LIZ(i, 0).group_type;
            if (i3 == EnumC1811400xEo.GIFT_RANK.getType()) {
                room.mRoomAuthStatus.setGiftRankSwitchStatus(1);
            } else if (i3 == EnumC1811400xEo.GAME_RANK.getType()) {
                room.mRoomAuthStatus.gamerankingswitch = 1;
            } else if (i3 == EnumC1811400xEo.E_COMMERCE.getType()) {
                room.mRoomAuthStatus.ecRankSwitchStatus = 1;
            } else if (i3 == EnumC1811400xEo.FRIEND_RANKING.getType()) {
                room.mRoomAuthStatus.friendrankswitch = 1;
            }
        }
        if (dataChannel != null) {
            dataChannel.zW(RoomChannel.class, room);
        }
    }

    public static void LJFF(int i, long j, boolean z) {
        if (i >= 0) {
            if (!z) {
                LIZ.put(i, j);
            } else {
                LIZIZ.put(i, j);
            }
        }
    }
}
