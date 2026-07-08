package X;

import android.text.TextUtils;
import android.util.LruCache;
import com.bytedance.android.livesdk.model.AdLiveEnterRoomConfig;
import com.bytedance.android.livesdkapi.business.IAdLiveHelperService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0IXW, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IXW implements InterfaceC468050IXb {
    public static final C0IXW LIZ = new C0IXW();
    public static final LruCache<Long, C0IXY> LIZIZ = new LruCache<>(5);

    public static final C0IXY LIZJ(String str) {
        C0IR5 c0ir5 = (C0IR5) DataChannelGlobal.LLILZ.gg0(C1148310fzJ.class);
        Room room = null;
        if (c0ir5 != null) {
            room = c0ir5.LIZIZ;
        }
        C0IXY c0ixy = new C0IXY();
        if (room != null) {
            c0ixy.LJII = room.getOwnerUserId();
            c0ixy.LJI = room.getId();
            C0IXY c0ixy2 = LIZIZ.get(Long.valueOf(room.getId()));
            if (c0ixy2 != null) {
                String str2 = c0ixy2.LIZ;
                c0ixy.LIZ = str2;
                if (str2.equals("1")) {
                    c0ixy.LIZIZ = c0ixy2.LIZIZ;
                    c0ixy.LIZJ = c0ixy2.LIZJ;
                    c0ixy.LIZLLL = c0ixy2.LIZLLL;
                    c0ixy.LJIIIIZZ = c0ixy2.LJIIIIZZ;
                    c0ixy.LJIIIZ = c0ixy2.LJIIIZ;
                }
            }
        }
        c0ixy.LJ = C466640IRq.LIZJ().LIZ();
        c0ixy.LJFF = C466640IRq.LIZJ().LIZIZ();
        C01GW<C468070IXd> c01gw = C468070IXd.LJIIIIZZ;
        LJIIIZ(c0ixy, C468070IXd.LIZ(C0IFC.LIZ(), Long.valueOf(C0IL2.LIZ.LIZ().mEnterRoomConfig.mRoomsData.roomId), false, 2));
        c0ixy.LJIIJ = str;
        return c0ixy;
    }

    public static final boolean LIZLLL(DataChannel dataChannel) {
        Boolean bool;
        if (dataChannel == null || (bool = (Boolean) dataChannel.gg0(C755580TkS.class)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public static final boolean LJ(EnterRoomConfig enterRoomConfig) {
        if (enterRoomConfig == null) {
            return false;
        }
        EnterRoomConfig.RoomsData roomsData = enterRoomConfig.mRoomsData;
        if (roomsData.enterFromAd) {
            return true;
        }
        AdLiveEnterRoomConfig adLiveEnterRoomConfig = roomsData.adLiveEnterRoomConfig;
        if (adLiveEnterRoomConfig == null || !Intrinsics.LJFF(adLiveEnterRoomConfig.isPseudoAd, "1")) {
            return false;
        }
        return true;
    }

    public static final boolean LJFF(DataChannel dataChannel) {
        if (dataChannel == null) {
            return false;
        }
        if (Intrinsics.LJFF(dataChannel.gg0(C755580TkS.class), Boolean.TRUE)) {
            return true;
        }
        AdLiveEnterRoomConfig adLiveEnterRoomConfigLJII = LJII(dataChannel);
        if (adLiveEnterRoomConfigLJII == null || !Intrinsics.LJFF(adLiveEnterRoomConfigLJII.isPseudoAd, "1")) {
            return false;
        }
        return true;
    }

    public static final HashMap<String, String> LJI(C0IXY c0ixy) {
        C0IHL c0ihl = new C0IHL();
        c0ihl.LIZ("is_ad", c0ixy.LIZ);
        c0ihl.LIZ("creative_id", c0ixy.LIZIZ);
        c0ihl.LIZ("log_extra", c0ixy.LIZJ);
        c0ihl.LIZ("feed_id", c0ixy.LIZLLL);
        c0ihl.LIZ("enter_from_merge", c0ixy.LJ);
        c0ihl.LIZ("enter_method", c0ixy.LJFF);
        c0ihl.LIZ("room_id", String.valueOf(c0ixy.LJI));
        c0ihl.LIZ("anchor_id", String.valueOf(c0ixy.LJII));
        c0ihl.LIZ("ad_id", c0ixy.LJIIIIZZ);
        c0ihl.LIZ("adv_id", c0ixy.LJIIIZ);
        c0ihl.LIZ("label", c0ixy.LJIIJ);
        c0ihl.LIZ("tag", "live_ad");
        return c0ihl.LIZ;
    }

    public static final AdLiveEnterRoomConfig LJII(DataChannel dataChannel) {
        if (dataChannel == null) {
            return null;
        }
        return (AdLiveEnterRoomConfig) dataChannel.gg0(C1083160eIE.class);
    }

    public static final C0IXY LJIIIIZZ(EnterRoomConfig enterRoomConfig) {
        long j;
        String str;
        C0IXY c0ixy = new C0IXY();
        if (!TextUtils.isEmpty(enterRoomConfig.mRoomsData.userId)) {
            try {
                String str2 = enterRoomConfig.mRoomsData.userId;
                if (str2 != null) {
                    j = CastLongProtector.parseLong(str2);
                } else {
                    j = 0;
                }
                c0ixy.LJII = j;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C20441214yg.LJI("live_ad", e);
            }
        }
        EnterRoomConfig.RoomsData roomsData = enterRoomConfig.mRoomsData;
        AdLiveEnterRoomConfig adLiveEnterRoomConfig = roomsData.adLiveEnterRoomConfig;
        c0ixy.LJI = roomsData.roomId;
        c0ixy.LJ = roomsData.enterFromMerge;
        c0ixy.LJFF = roomsData.enterMethod;
        C01GW<C468070IXd> c01gw = C468070IXd.LJIIIIZZ;
        LJIIIZ(c0ixy, C468070IXd.LIZ(C0IFC.LIZ(), Long.valueOf(enterRoomConfig.mRoomsData.roomId), false, 2));
        if (adLiveEnterRoomConfig != null) {
            c0ixy.LIZLLL = adLiveEnterRoomConfig.aid;
            c0ixy.LJIIIIZZ = adLiveEnterRoomConfig.adId;
            c0ixy.LJIIIZ = adLiveEnterRoomConfig.advId;
            c0ixy.LIZIZ = adLiveEnterRoomConfig.creativeId;
            c0ixy.LIZJ = adLiveEnterRoomConfig.logExtra;
        }
        if (enterRoomConfig.mRoomsData.enterFromAd) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c0ixy.LIZ = str;
        return c0ixy;
    }

    public static final void LJIIJ(EnterRoomConfig enterRoomConfig) {
        C0IXL c0ixl;
        if (LJ(enterRoomConfig) && enterRoomConfig.mRoomsData.adLiveEnterRoomConfig != null) {
            DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
            C0IXL c0ixl2 = (C0IXL) dataChannelGlobal.gg0(C1148430fzV.class);
            if ((c0ixl2 == null || c0ixl2.LJJJ == null) && (c0ixl = (C0IXL) dataChannelGlobal.gg0(C1148430fzV.class)) != null) {
                c0ixl.LJJJ = enterRoomConfig.mRoomsData.adLiveEnterRoomConfig;
            }
        }
    }

    public static void LJIIIZ(C0IXY c0ixy, String str) {
        if (!TextUtils.isEmpty(str)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("commerce_flow_banner-");
            sbLIZ.append(str);
            c0ixy.LJFF = C2188811AlT.LIZIZ(sbLIZ);
        }
    }

    public static final C0IXY LIZIZ(Room room, DataChannel dataChannel, String str) {
        boolean z;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        C0IXY c0ixy = new C0IXY();
        AdLiveEnterRoomConfig adLiveEnterRoomConfigLJII = LJII(dataChannel);
        if (LIZLLL(dataChannel) && adLiveEnterRoomConfigLJII != null) {
            z = true;
            str2 = "1";
        } else {
            z = false;
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c0ixy.LIZ = str2;
        if (z) {
            String str7 = null;
            if (adLiveEnterRoomConfigLJII != null) {
                str3 = adLiveEnterRoomConfigLJII.creativeId;
            } else {
                str3 = null;
            }
            c0ixy.LIZIZ = str3;
            if (adLiveEnterRoomConfigLJII != null) {
                str4 = adLiveEnterRoomConfigLJII.logExtra;
            } else {
                str4 = null;
            }
            c0ixy.LIZJ = str4;
            if (adLiveEnterRoomConfigLJII != null) {
                str5 = adLiveEnterRoomConfigLJII.aid;
            } else {
                str5 = null;
            }
            c0ixy.LIZLLL = str5;
            if (adLiveEnterRoomConfigLJII != null) {
                str6 = adLiveEnterRoomConfigLJII.adId;
            } else {
                str6 = null;
            }
            c0ixy.LJIIIIZZ = str6;
            if (adLiveEnterRoomConfigLJII != null) {
                str7 = adLiveEnterRoomConfigLJII.advId;
            }
            c0ixy.LJIIIZ = str7;
        }
        if (room != null || (room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class)) != null) {
            c0ixy.LJII = room.getOwnerUserId();
            c0ixy.LJI = room.getId();
        }
        c0ixy.LJ = C466640IRq.LIZJ().LIZ();
        c0ixy.LJFF = C466640IRq.LIZJ().LIZIZ();
        C01GW<C468070IXd> c01gw = C468070IXd.LJIIIIZZ;
        LJIIIZ(c0ixy, C468070IXd.LIZ(C0IFC.LIZ(), Long.valueOf(C0IL2.LIZ.LIZ().mEnterRoomConfig.mRoomsData.roomId), false, 2));
        if (str != null) {
            c0ixy.LJIIJ = str;
        }
        return c0ixy;
    }

    public static final void LIZ(String str, String str2, Map<String, ? extends Object> map, Map<String, ? extends Object> map2) {
        ((IAdLiveHelperService) C1161920gLG.LIZJ(IAdLiveHelperService.class)).Bn1(str, str2, map, map2);
    }
}
