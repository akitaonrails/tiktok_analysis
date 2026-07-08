package X;

import com.bytedance.android.livesdk.livesetting.feed.GameLiveBottomBarSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveGameBottomBarEntrance;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0IKP, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IKP {
    public static final String[] LIZ = LiveGameBottomBarEntrance.INSTANCE.getValue();
    public static final Set<String> LIZIZ = C093Y.LJ("related_live_refresh", "related_live_loadmore");

    public static final boolean LIZ(EnterRoomConfig enterRoomConfig) {
        if (!GameLiveBottomBarSetting.INSTANCE.isEnable() || enterRoomConfig == null || enterRoomConfig.mRoomsData.isMixLive) {
            return false;
        }
        String[] strArr = LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(enterRoomConfig.mRoomsData.enterFromMerge);
        sbLIZ.append('_');
        sbLIZ.append(enterRoomConfig.mRoomsData.enterMethod);
        return C13LQ.LJIILLIIL(C2188811AlT.LIZIZ(sbLIZ), strArr);
    }

    public static final boolean LIZIZ(String str) {
        Object obj;
        if (!GameLiveBottomBarSetting.INSTANCE.isEnable() || str == null) {
            return false;
        }
        Map map = (Map) DataChannelGlobal.LLILZ.gg0(C930650aKF.class);
        if (map != null) {
            obj = map.get("is_mix_live");
        } else {
            obj = null;
        }
        if (Intrinsics.LJFF(obj, "true")) {
            return false;
        }
        return C13LQ.LJIILLIIL(str, LIZ);
    }

    public static final boolean LIZLLL(EnterRoomConfig enterRoomConfig) {
        Boolean boolValueOf;
        boolean z;
        if (enterRoomConfig == null) {
            return false;
        }
        long[] jArr = enterRoomConfig.mRoomsData.roomIds;
        if (jArr != null) {
            if (jArr.length == 0) {
                z = true;
            } else {
                z = false;
            }
            boolValueOf = Boolean.valueOf(!z);
        } else {
            boolValueOf = null;
        }
        if (C500260Jjc.LJJIJIIJIL(boolValueOf) || !Intrinsics.LJFF("guessing_rank", enterRoomConfig.mRoomsData.enterMethod) || !Intrinsics.LJFF("live_detail", enterRoomConfig.mRoomsData.enterFromMerge)) {
            return false;
        }
        return true;
    }

    public static final boolean LIZJ(String str, String str2) {
        if (!Intrinsics.LJFF("live_anchor", str) || !Intrinsics.LJFF("link_live_head", str2)) {
            if (Intrinsics.LJFF("linked_room_load_more", str) && Intrinsics.LJFF("live_anchor", str2)) {
                return true;
            }
            return false;
        }
        return true;
    }
}
