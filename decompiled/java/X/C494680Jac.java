package X;

import android.util.Log;
import com.bytedance.android.live.base.model.user.SubscribeInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.dataChannel.PreviewSubOnlyLiveSwitchChannel;
import com.bytedance.android.livesdk.dataChannel.PreviewSubOnlyLiveVipMonth;
import com.bytedance.android.livesdk.dataChannel.PreviewSubOnlyLiveVipTier;
import com.bytedance.android.livesdk.dataChannel.PreviewSubOnlyMusicSwitchChannel;
import com.bytedance.android.livesdk.dataChannel.PreviewSubOnlyTrialLiveSwitchChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.livesetting.wallet.CanRechargeSetting;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdk.model.UserAttr;
import com.bytedance.android.livesdk.subscribe.model.GetSubInfoResponse;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.SMBInfo;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Jac, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C494680Jac {
    public static boolean LIZ;

    public static boolean LIZIZ() {
        Boolean bool = (Boolean) DataChannelGlobal.LLILZ.gg0(PreviewSubOnlyMusicSwitchChannel.class);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static boolean LIZJ() {
        Boolean bool = (Boolean) DataChannelGlobal.LLILZ.gg0(PreviewSubOnlyLiveSwitchChannel.class);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static boolean LJFF() {
        Boolean bool = (Boolean) DataChannelGlobal.LLILZ.gg0(PreviewSubOnlyTrialLiveSwitchChannel.class);
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public static final boolean LJIILIIL() {
        return LJIILJJIL((Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class));
    }

    public static long LIZLLL() {
        Long l;
        if (!LIZJ() || (l = (Long) DataChannelGlobal.LLILZ.gg0(PreviewSubOnlyLiveVipMonth.class)) == null) {
            return 0L;
        }
        return l.longValue();
    }

    public static long LJ() {
        Long l;
        if (!LIZJ() || (l = (Long) DataChannelGlobal.LLILZ.gg0(PreviewSubOnlyLiveVipTier.class)) == null) {
            return 0L;
        }
        return l.longValue();
    }

    public static boolean LJJI() {
        Boolean bool;
        String strValueOf = String.valueOf(UserService.getInstance().user().getCurrentUserId());
        Map<String, Boolean> mapLIZIZ = C0KPJ.f120ge.LIZIZ();
        if (mapLIZIZ == null || (bool = mapLIZIZ.get(strValueOf)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public static final boolean LIZ(Room room) {
        if (room == null || room.disablePreviewSubOnly != 1) {
            return false;
        }
        return true;
    }

    public static final boolean LJI(DataChannel dataChannel) {
        Room room;
        boolean z;
        boolean zLJFF;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        UserAttr userAttr;
        Map<Integer, Integer> map;
        Integer num;
        User owner;
        SubscribeInfo subscribeInfo;
        User owner2;
        if (dataChannel != null) {
            room = (Room) dataChannel.gg0(RoomChannel.class);
        } else {
            room = null;
        }
        if (room != null && room.liveSubOnly == 1) {
            z = true;
        } else {
            z = false;
        }
        if (dataChannel != null) {
            zLJFF = Intrinsics.LJFF(dataChannel.gg0(UserIsAnchorChannel.class), Boolean.TRUE);
        } else {
            zLJFF = false;
        }
        if (room != null && (owner2 = room.getOwner()) != null && owner2.isSubscribed()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (room != null && (room.liveSubOnlyMonth > 0 || (room != null && room.liveSubOnlyTier > 0))) {
            if (room != null && (owner = room.getOwner()) != null && (subscribeInfo = owner.getSubscribeInfo()) != null) {
                z3 = subscribeInfo.isSolEligible;
            } else {
                z3 = false;
            }
        } else {
            z3 = true;
        }
        if (dataChannel != null && C01C5.LIZ(dataChannel)) {
            z4 = true;
        } else {
            z4 = false;
        }
        User userLIZIZ = C0KXJ.LIZIZ();
        if (userLIZIZ != null && (userAttr = userLIZIZ.getUserAttr()) != null && (map = userAttr.adminPermissions) != null && (num = map.get(11)) != null && num.intValue() == 1) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z && !zLJFF) {
            if (!z2 || !z3) {
                if (!z4 || !z5) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public static final boolean LJII(C0II9 c0ii9) {
        if (c0ii9 != C0II9.NON_SUBSCRIBER_TRIAL_LIVE && c0ii9 != C0II9.NON_SUBSCRIBER_FORBIDDEN_LIVE) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean LJIIIIZZ(com.bytedance.ies.sdk.datachannel.DataChannel r5) {
        /*
            r4 = 0
            if (r5 == 0) goto L20
            java.lang.Class<com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel> r0 = com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel.class
            java.lang.Object r0 = r5.gg0(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto L20
            boolean r1 = r0.booleanValue()
        L11:
            java.lang.Class<com.bytedance.android.livesdk.dataChannel.RoomChannel> r0 = com.bytedance.android.livesdk.dataChannel.RoomChannel.class
            java.lang.Object r3 = r5.gg0(r0)
            com.bytedance.android.livesdkapi.depend.model.live.Room r3 = (com.bytedance.android.livesdkapi.depend.model.live.Room) r3
        L19:
            boolean r0 = X.C1114740f7A.LIZ(r1)
            if (r0 != 0) goto L25
            return r4
        L20:
            r1 = 0
            if (r5 != 0) goto L11
            r3 = 0
            goto L19
        L25:
            java.lang.Class<com.bytedance.android.livesdk.comp.api.subscription.ISubscribeService> r0 = com.bytedance.android.livesdk.comp.api.subscription.ISubscribeService.class
            X.006A r0 = X.C1161920gLG.LIZJ(r0)
            com.bytedance.android.livesdk.comp.api.subscription.ISubscribeService r0 = (com.bytedance.android.livesdk.comp.api.subscription.ISubscribeService) r0
            if (r0 == 0) goto L54
            X.0KPt r0 = r0.ei()
            if (r0 == 0) goto L54
            boolean r2 = X.C517110KPt.LJI(r5)
        L39:
            if (r1 != 0) goto L53
            r1 = 1
            if (r3 == 0) goto L53
            com.bytedance.android.live.base.model.user.User r0 = r3.getOwner()
            if (r0 == 0) goto L53
            com.bytedance.android.live.base.model.user.SubscribeInfo r0 = r0.getSubscribeInfo()
            if (r0 == 0) goto L53
            boolean r0 = r0.isAnchorQualified()
            if (r0 != r1) goto L53
            if (r2 == 0) goto L53
            r4 = 1
        L53:
            return r4
        L54:
            r2 = 0
            goto L39
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C494680Jac.LJIIIIZZ(com.bytedance.ies.sdk.datachannel.DataChannel):boolean");
    }

    public static final boolean LJIIIZ(Room room) {
        SMBInfo sMBInfo;
        SMBInfo sMBInfo2;
        if (room != null && (sMBInfo = room.smbInfo) != null && sMBInfo.optInStatus == 1 && room != null && (sMBInfo2 = room.smbInfo) != null && sMBInfo2.activeSkuCount > 0) {
            return true;
        }
        return false;
    }

    public static final boolean LJIIJ(DataChannel dataChannel) {
        Room room;
        boolean zBooleanValue;
        if (dataChannel != null) {
            room = (Room) dataChannel.gg0(RoomChannel.class);
            Boolean bool = (Boolean) dataChannel.gg0(UserIsAnchorChannel.class);
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            }
            return LJIIJJI(zBooleanValue, room);
        }
        room = null;
        zBooleanValue = false;
        return LJIIJJI(zBooleanValue, room);
    }

    public static final boolean LJIIL(Room room) {
        User owner;
        if (room != null && (owner = room.getOwner()) != null) {
            return owner.isAnchorHasSubQualification();
        }
        return false;
    }

    public static final boolean LJIILJJIL(Room room) {
        if (room == null || room.liveSubOnly != 1) {
            return false;
        }
        return true;
    }

    public static final boolean LJIILL(DataChannel dataChannel) {
        Room room;
        if (dataChannel != null) {
            room = (Room) dataChannel.gg0(RoomChannel.class);
        } else {
            room = null;
        }
        return LJIILJJIL(room);
    }

    public static final boolean LJIILLIIL(DataChannel dataChannel) {
        boolean z;
        boolean z2;
        boolean zLJFF;
        boolean z3;
        User owner;
        User owner2;
        SubscribeInfo subscribeInfo;
        if (dataChannel != null) {
            Room room = (Room) dataChannel.gg0(RoomChannel.class);
            if (room != null && room.liveSubOnly == 1) {
                z = true;
            } else {
                z = false;
            }
            if (room != null && (room.liveSubOnlyMonth > 0 || (room != null && room.liveSubOnlyTier > 0))) {
                if (room != null && (owner2 = room.getOwner()) != null && (subscribeInfo = owner2.getSubscribeInfo()) != null) {
                    z2 = subscribeInfo.isSolEligible;
                } else {
                    z2 = false;
                }
            } else {
                z2 = true;
            }
            if (dataChannel != null) {
                zLJFF = Intrinsics.LJFF(dataChannel.gg0(UserIsAnchorChannel.class), Boolean.TRUE);
            } else {
                zLJFF = false;
            }
            if (room != null && (owner = room.getOwner()) != null && owner.isSubscribed()) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z && !zLJFF && z3 && z2) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final Map<String, String> LJIIZILJ(GetSubInfoResponse getSubInfoResponse) {
        String str;
        String str2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        if (getSubInfoResponse != null) {
            if (getSubInfoResponse.qualification) {
                str2 = "1";
            } else {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            linkedHashMap2.put("is_opt_in", str2);
        }
        linkedHashMap.putAll(linkedHashMap2);
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        if (getSubInfoResponse != null) {
            if (getSubInfoResponse.enable) {
                str = "yes";
            } else {
                str = "no";
            }
            linkedHashMap3.put("subscribe_privilege", str);
        }
        linkedHashMap.putAll(linkedHashMap3);
        return linkedHashMap;
    }

    public static void LJIJ(boolean z) {
        DataChannelGlobal.LLILZ.HQ2(PreviewSubOnlyMusicSwitchChannel.class, Boolean.valueOf(z));
    }

    public static void LJIJI(boolean z) {
        String strValueOf = String.valueOf(UserService.getInstance().user().getCurrentUserId());
        C20337914i1<Map<String, Boolean>> c20337914i1 = C0KPJ.f120ge;
        Map<String, Boolean> mapLIZIZ = c20337914i1.LIZIZ();
        mapLIZIZ.put(strValueOf, Boolean.valueOf(z));
        c20337914i1.LJFF(mapLIZIZ);
    }

    public static void LJIJJ(boolean z) {
        DataChannelGlobal.LLILZ.HQ2(PreviewSubOnlyLiveSwitchChannel.class, Boolean.valueOf(z));
    }

    public static void LJIL(boolean z) {
        DataChannelGlobal.LLILZ.HQ2(PreviewSubOnlyTrialLiveSwitchChannel.class, Boolean.valueOf(z));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setSubOnlyTrialLiveSwitch:");
        sbLIZ.append(z);
        C20441214yg.LIZIZ("SubscribeTool", Log.getStackTraceString(new Throwable(C2188811AlT.LIZIZ(sbLIZ))));
    }

    public static final boolean LJIIJJI(boolean z, Room room) {
        RoomAuthStatus roomAuthStatus;
        if (!C1114740f7A.LIZ(z) || room == null || (roomAuthStatus = room.getRoomAuthStatus()) == null || !roomAuthStatus.chatSubOnly) {
            return false;
        }
        return true;
    }

    public static void LJIJJLI(long j, long j2) {
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        dataChannelGlobal.HQ2(PreviewSubOnlyLiveVipMonth.class, Long.valueOf(j));
        dataChannelGlobal.HQ2(PreviewSubOnlyLiveVipTier.class, Long.valueOf(j2));
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean LJJ(boolean r3, com.bytedance.android.livesdkapi.depend.model.live.Room r4) {
        /*
            r2 = 0
            if (r4 == 0) goto L37
            if (r3 != 0) goto L37
            boolean r0 = LJIILJJIL(r4)
            if (r0 == 0) goto L1c
            X.0K9Q r0 = com.bytedance.android.livesdk.comp.api.subscription.status.ISubscriptionStatusService.LJIIIZ
            r0.getClass()
            com.bytedance.android.livesdk.comp.api.subscription.status.ISubscriptionStatusService r0 = X.C0K9Q.LIZ()
            X.0JyZ r0 = r0.m70(r4)
            boolean r0 = r0.LIZ
            if (r0 == 0) goto L36
        L1c:
            com.bytedance.android.livesdk.model.LiveEventInfo r0 = r4.liveEventInfo
            if (r0 == 0) goto L37
            java.lang.Boolean r1 = r0.isPaidEvent
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L37
            com.bytedance.android.livesdk.model.LiveEventInfo r0 = r4.liveEventInfo
            java.lang.Boolean r1 = r0.subscribed
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L37
        L36:
            r2 = 1
        L37:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C494680Jac.LJJ(boolean, com.bytedance.android.livesdkapi.depend.model.live.Room):boolean");
    }

    public static final Map<String, String> LJJIFFI(boolean z, boolean z2, boolean z3) {
        String str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (z2 || z3) {
            return linkedHashMap;
        }
        if (z && CanRechargeSetting.INSTANCE.getValue() && C1114740f7A.LIZ(z2)) {
            str = "no";
        } else {
            str = "yes";
        }
        linkedHashMap.put("subscribe_limit", str);
        return linkedHashMap;
    }
}
