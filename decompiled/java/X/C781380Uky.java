package X;

import android.content.Context;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.multilive.model.MultiGuestPermissionInfo;
import com.bytedance.android.live.liveinteract.multilive.model.RoomHostMultiGuestPermissionInfo;
import com.bytedance.android.livesdk.dataChannel.LopUnlockEvent;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.message.proto.StarCommentConfig;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdk.model.linksetting.MultiLiveUserApplySettings;
import com.bytedance.android.livesdk.model.linksetting.MultiLiveUserSettings;
import com.bytedance.android.livesdkapi.depend.model.live.AnchorLevelPermission;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import qo2.w;
import webcast.data.RealtimeLiveCenterLopInfo;

/* JADX INFO: renamed from: X.0Uky, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C781380Uky {
    public static int LJ;
    public static final C781380Uky LIZ = new C781380Uky();
    public static List<RealtimeLiveCenterLopInfo.FeatureGuidance> LIZIZ = new ArrayList();
    public static final List<RealtimeLiveCenterLopInfo.FeatureGuidance> LIZJ = new ArrayList();
    public static final List<String> LIZLLL = C1697810uHb.LJIILJJIL("poll", "draw_and_guess", "effects", "live_background", "voice_effect", "promote");
    public static int LJFF = 1;
    public static boolean LJI = true;
    public static boolean LJII = true;

    public static void LJ() {
        if (LIZIZ.size() == 0) {
            return;
        }
        ArrayList arrayList = (ArrayList) LIZJ;
        arrayList.clear();
        List<RealtimeLiveCenterLopInfo.FeatureGuidance> list = LIZIZ;
        Object objLJJJLZIJ = C13LP.LJJJLZIJ(LJ % list.size(), list);
        List<RealtimeLiveCenterLopInfo.FeatureGuidance> list2 = LIZIZ;
        Object objLJJJLZIJ2 = C13LP.LJJJLZIJ(LJFF % list2.size(), list2);
        if (objLJJJLZIJ != null && !arrayList.contains(objLJJJLZIJ)) {
            arrayList.add(objLJJJLZIJ);
        }
        if (objLJJJLZIJ2 != null && !arrayList.contains(objLJJJLZIJ2)) {
            arrayList.add(objLJJJLZIJ2);
        }
        LJ += 2;
        LJFF += 2;
    }

    public static void LIZJ(DataChannel dataChannel) {
        AnchorLevelPermission anchorLevelPermission;
        Room room;
        MultiLiveUserSettings multiLiveUserSettings;
        MultiLiveUserApplySettings multiLiveUserApplySettings;
        RoomHostMultiGuestPermissionInfo roomHostMultiGuestPermissionInfo;
        if (LJI) {
            ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).hO0(dataChannel);
            if (dataChannel != null && (room = (Room) dataChannel.gg0(RoomChannel.class)) != null && (multiLiveUserSettings = room.multiLiveUserSettings) != null && (multiLiveUserApplySettings = multiLiveUserSettings.multiLiveUserApplySettings) != null && (roomHostMultiGuestPermissionInfo = multiLiveUserApplySettings.roomHostMultiGuestPermissionInfo) != null) {
                roomHostMultiGuestPermissionInfo.roomPackSuccessFlag = true;
                MultiGuestPermissionInfo multiGuestPermissionInfo = roomHostMultiGuestPermissionInfo.permissionInfo;
                if (multiGuestPermissionInfo != null) {
                    multiGuestPermissionInfo.flag = true;
                    multiGuestPermissionInfo.errCode = 0L;
                }
            }
            ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).qm2(dataChannel);
        }
        LJI = false;
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        Room room2 = (Room) dataChannelGlobal.gg0(C930940aKi.class);
        if (room2 != null) {
            RoomAuthStatus roomAuthStatus = room2.mRoomAuthStatus;
            if (roomAuthStatus != null && (anchorLevelPermission = roomAuthStatus.anchorLevelPermission) != null) {
                anchorLevelPermission.liveBackground = 1;
                anchorLevelPermission.promote = 1;
                anchorLevelPermission.treasureBox = 1;
                anchorLevelPermission.portal = 1;
                anchorLevelPermission.goodyBag = 1;
                anchorLevelPermission.pictionary = 1;
                anchorLevelPermission.voiceEffect = 1;
                anchorLevelPermission.poll = 1;
                anchorLevelPermission.pin = 1;
            }
            StarCommentConfig starCommentConfig = room2.starCommentConfig;
            if (starCommentConfig != null) {
                starCommentConfig.displayLock = false;
                starCommentConfig.starCommentQualification = true;
            }
        }
        dataChannelGlobal.JQ2(C930940aKi.class, room2);
        dataChannelGlobal.GQ2(LopUnlockEvent.class);
    }

    public static void LJFF(RealtimeLiveCenterLopInfo realtimeLiveCenterLopInfo) {
        if (!(!LIZIZ.isEmpty()) && realtimeLiveCenterLopInfo != null && !realtimeLiveCenterLopInfo.featureGuidanceList.isEmpty()) {
            LIZIZ = realtimeLiveCenterLopInfo.featureGuidanceList;
        }
    }

    public static void LIZ(DataChannel dataChannel, RealtimeLiveCenterLopInfo realtimeLiveCenterLopInfo) {
        if (realtimeLiveCenterLopInfo != null && realtimeLiveCenterLopInfo.status == 3) {
            LIZ.getClass();
            LIZJ(dataChannel);
        }
    }

    public static void LIZLLL(Context context, String str, String str2) {
        if ((Intrinsics.LJFF(str, "promote") || Intrinsics.LJFF(str2, "promote")) && LJII) {
            LJII = false;
            try {
                w.LIZ.getClass();
                if (w.LJIJJ() != 0 && context != null) {
                    ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).preloadPromoteModule(String.valueOf(w.LJIJJ()), context);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public static void LIZIZ(String str, String str2, String str3, String str4) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_realtime_lop_guidelist");
        w.LIZ.getClass();
        c474500IjALIZ.LJJII(String.valueOf(w.LJ()), "anchor_id");
        c474500IjALIZ.LJJII(str, "action_type");
        c474500IjALIZ.LJJII(str2, "show_1");
        c474500IjALIZ.LJJII(str3, "show_2");
        c474500IjALIZ.LJJII(str4, "click_type");
        c474500IjALIZ.LIZ();
    }
}
