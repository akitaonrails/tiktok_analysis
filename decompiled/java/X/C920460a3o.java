package X;

import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.livesdk.model.message.linker.listchangemessage.LinkListUser;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0a3o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C920460a3o {
    public static boolean LIZ;
    public static String LIZIZ = "";
    public static long LIZJ;
    public static long LIZLLL;
    public static long LJ;
    public static long LJFF;
    public static long LJI;
    public static long LJII;

    public static boolean LIZJ() {
        MultiGuestDataHolder multiGuestDataHolder = (MultiGuestDataHolder) C948450amx.LIZIZ.LJIIJJI("MULTI_GUEST_DATA_HOLDER");
        return C500260Jjc.LJJIJIIJIL(multiGuestDataHolder != null ? Boolean.valueOf(multiGuestDataHolder.LJIIJ) : null);
    }

    public static void LIZ() {
        C1143300frE c1143300frELJIIJJI = C1143300frE.LJIIJJI();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("endBackgroundTimeCalculation, backgroundMicStartTimeMills=");
        sbLIZ.append(LJI);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1143300frELJIIJJI.getClass();
        AbstractC1143290frD.LJI("MultiGuestCameraOnDurationLogHelper", strLIZIZ);
        if (LJI > 0) {
            LJII = (LJII + System.currentTimeMillis()) - LJI;
            C1143300frE c1143300frELJIIJJI2 = C1143300frE.LJIIJJI();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("endBackgroundTimeCalculation, backgroundDuration=");
            sbLIZ2.append(LJII);
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
            c1143300frELJIIJJI2.getClass();
            AbstractC1143290frD.LJI("MultiGuestCameraOnDurationLogHelper", strLIZIZ2);
            LJI = 0L;
        }
    }

    public static void LIZIZ() {
        C1143300frE c1143300frELJIIJJI = C1143300frE.LJIIJJI();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("endBackgroundTimeCalculation, backgroundStartTimeMills=");
        sbLIZ.append(LIZLLL);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1143300frELJIIJJI.getClass();
        AbstractC1143290frD.LJI("MultiGuestCameraOnDurationLogHelper", strLIZIZ);
        if (LIZLLL > 0) {
            LJ = (LJ + System.currentTimeMillis()) - LIZLLL;
            C1143300frE c1143300frELJIIJJI2 = C1143300frE.LJIIJJI();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("endBackgroundTimeCalculation, backgroundDuration=");
            sbLIZ2.append(LJ);
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
            c1143300frELJIIJJI2.getClass();
            AbstractC1143290frD.LJI("MultiGuestCameraOnDurationLogHelper", strLIZIZ2);
            LIZLLL = 0L;
        }
    }

    public static void LIZLLL() {
        String str;
        AbstractC928510aGn abstractC928510aGnLIZ;
        LinkListUser linkListUser;
        User owner;
        FollowInfo followInfo;
        LIZIZ();
        long jCurrentTimeMillis = (System.currentTimeMillis() - LIZJ) - LJ;
        C1143300frE c1143300frELJIIJJI = C1143300frE.LJIIJJI();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("logCameraOnDuration, startCameraTimeMills=");
        sbLIZ.append(LIZJ);
        sbLIZ.append(", backgroundDuration=");
        sbLIZ.append(LJ);
        sbLIZ.append(", useCameraDuration=");
        sbLIZ.append(jCurrentTimeMillis);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1143300frELJIIJJI.getClass();
        AbstractC1143290frD.LJI("MultiGuestCameraOnDurationLogHelper", strLIZIZ);
        String str2 = LIZIZ;
        HashMap map = new HashMap();
        C01Z4.LIZ(null, map);
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        map.put("follow_status", String.valueOf((room == null || (owner = room.getOwner()) == null || (followInfo = owner.getFollowInfo()) == null) ? 0L : followInfo.getFollowStatus()));
        map.put("guest_invite_type", str2);
        map.put("duration", String.valueOf(jCurrentTimeMillis));
        InterfaceC917640ZzG interfaceC917640ZzG = (InterfaceC917640ZzG) C948450amx.LIZIZ.LJIIJJI("MULTI_GUEST_V3_GUEST_USER_MANAGER");
        if (interfaceC917640ZzG == null || (abstractC928510aGnLIZ = interfaceC917640ZzG.LIZ()) == null || (linkListUser = (LinkListUser) abstractC928510aGnLIZ.LJIILIIL(UserService.getInstance().user().getCurrentUserId())) == null || (str = linkListUser.linkMicId) == null) {
            str = "";
        }
        map.put("link_id", str);
        C0KX4.LIZ("livesdk_guest_onstage_camera_on_duration", map, null, true);
        LIZJ = 0L;
        LJ = 0L;
    }

    public static void LJ() {
        String str;
        AbstractC928510aGn abstractC928510aGnLIZ;
        LinkListUser linkListUser;
        User owner;
        FollowInfo followInfo;
        LIZ();
        long jCurrentTimeMillis = (System.currentTimeMillis() - LJFF) - LJII;
        C1143300frE c1143300frELJIIJJI = C1143300frE.LJIIJJI();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("logMicOnDuration, startMicTimeMills=");
        sbLIZ.append(LJFF);
        sbLIZ.append(", backgroundMicDuration=");
        sbLIZ.append(LJII);
        sbLIZ.append(", useMicDuration=");
        sbLIZ.append(jCurrentTimeMillis);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1143300frELJIIJJI.getClass();
        AbstractC1143290frD.LJI("MultiGuestCameraOnDurationLogHelper", strLIZIZ);
        String str2 = LIZIZ;
        HashMap map = new HashMap();
        C01Z4.LIZ(null, map);
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        map.put("follow_status", String.valueOf((room == null || (owner = room.getOwner()) == null || (followInfo = owner.getFollowInfo()) == null) ? 0L : followInfo.getFollowStatus()));
        map.put("guest_invite_type", str2);
        map.put("duration", String.valueOf(jCurrentTimeMillis));
        InterfaceC917640ZzG interfaceC917640ZzG = (InterfaceC917640ZzG) C948450amx.LIZIZ.LJIIJJI("MULTI_GUEST_V3_GUEST_USER_MANAGER");
        if (interfaceC917640ZzG == null || (abstractC928510aGnLIZ = interfaceC917640ZzG.LIZ()) == null || (linkListUser = (LinkListUser) abstractC928510aGnLIZ.LJIILIIL(UserService.getInstance().user().getCurrentUserId())) == null || (str = linkListUser.linkMicId) == null) {
            str = "";
        }
        map.put("link_id", str);
        C0KX4.LIZ("livesdk_guest_onstage_mic_on_duration", map, null, true);
        LJFF = 0L;
        LJII = 0L;
    }

    public static void LJI() {
        C1143300frE c1143300frELJIIJJI = C1143300frE.LJIIJJI();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onEnterBackGround, backgroundStartTimeMills=");
        sbLIZ.append(LIZLLL);
        sbLIZ.append(", isAudienceOnline=");
        sbLIZ.append(LIZ);
        sbLIZ.append(", isVideoMute=");
        sbLIZ.append(LIZJ());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1143300frELJIIJJI.getClass();
        AbstractC1143290frD.LJI("MultiGuestCameraOnDurationLogHelper", strLIZIZ);
        if (LIZLLL == 0 && LIZ && !LIZJ()) {
            LIZLLL = System.currentTimeMillis();
            C1143300frE c1143300frELJIIJJI2 = C1143300frE.LJIIJJI();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("backgroundStartTimeMills, backgroundStartTimeMills=");
            sbLIZ2.append(LIZLLL);
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
            c1143300frELJIIJJI2.getClass();
            AbstractC1143290frD.LJI("MultiGuestCameraOnDurationLogHelper", strLIZIZ2);
        }
        if (LJI == 0 && LIZ) {
            MultiGuestDataHolder multiGuestDataHolder = (MultiGuestDataHolder) C948450amx.LIZIZ.LJIIJJI("MULTI_GUEST_DATA_HOLDER");
            if (C500260Jjc.LJJIJIIJIL(multiGuestDataHolder != null ? Boolean.valueOf(multiGuestDataHolder.LJIIIZ) : null)) {
                return;
            }
            LJI = System.currentTimeMillis();
            C1143300frE c1143300frELJIIJJI3 = C1143300frE.LJIIJJI();
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("backgroundStartTimeMills, backgroundStartTimeMills=");
            sbLIZ3.append(LJI);
            String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ3);
            c1143300frELJIIJJI3.getClass();
            AbstractC1143290frD.LJI("MultiGuestCameraOnDurationLogHelper", strLIZIZ3);
        }
    }

    public static void LJII() {
        C1143300frE c1143300frELJIIJJI = C1143300frE.LJIIJJI();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onEnterForeGround, backgroundStartTimeMills=");
        sbLIZ.append(LIZLLL);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1143300frELJIIJJI.getClass();
        AbstractC1143290frD.LJI("MultiGuestCameraOnDurationLogHelper", strLIZIZ);
        if (LIZLLL > 0) {
            LIZIZ();
        }
        if (LJI > 0) {
            LIZ();
        }
    }

    public static void LJFF(String str) {
        Boolean boolValueOf;
        MultiGuestDataHolder multiGuestDataHolder = (MultiGuestDataHolder) C948450amx.LIZIZ.LJIIJJI("MULTI_GUEST_DATA_HOLDER");
        if (multiGuestDataHolder != null) {
            boolValueOf = Boolean.valueOf(multiGuestDataHolder.LJIIIZ);
        } else {
            boolValueOf = null;
        }
        boolean zLJJIJIIJIL = C500260Jjc.LJJIJIIJIL(boolValueOf);
        C1143300frE c1143300frELJIIJJI = C1143300frE.LJIIJJI();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onVideoEnableChange, source=");
        sbLIZ.append(str);
        sbLIZ.append(", isAudioMute=");
        sbLIZ.append(zLJJIJIIJIL);
        sbLIZ.append(", isAudienceOnline=");
        sbLIZ.append(LIZ);
        sbLIZ.append(", startMicTimeMills=");
        sbLIZ.append(LJFF);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1143300frELJIIJJI.getClass();
        AbstractC1143290frD.LJI("MultiGuestCameraOnDurationLogHelper", strLIZIZ);
        if (!zLJJIJIIJIL) {
            if (LIZ && LJFF == 0) {
                LJFF = System.currentTimeMillis();
                C1143300frE c1143300frELJIIJJI2 = C1143300frE.LJIIJJI();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("logCameraOnStart, startMicTimeMills=");
                sbLIZ2.append(LJFF);
                String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                c1143300frELJIIJJI2.getClass();
                AbstractC1143290frD.LJI("MultiGuestCameraOnDurationLogHelper", strLIZIZ2);
                return;
            }
            return;
        }
        if (LJFF <= 0) {
            return;
        }
        LJ();
    }

    public static void LJIIIIZZ(String str) {
        long followStatus;
        User owner;
        FollowInfo followInfo;
        boolean zLIZJ = LIZJ();
        C1143300frE c1143300frELJIIJJI = C1143300frE.LJIIJJI();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onVideoEnableChange, source=");
        sbLIZ.append(str);
        sbLIZ.append(", isVideoMute=");
        sbLIZ.append(zLIZJ);
        sbLIZ.append(", isAudienceOnline=");
        sbLIZ.append(LIZ);
        sbLIZ.append(", startCameraTimeMills=");
        sbLIZ.append(LIZJ);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1143300frELJIIJJI.getClass();
        AbstractC1143290frD.LJI("MultiGuestCameraOnDurationLogHelper", strLIZIZ);
        if (!zLIZJ) {
            if (LIZ && LIZJ == 0) {
                HashMap map = new HashMap();
                C01Z4.LIZ(null, map);
                Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
                if (room != null && (owner = room.getOwner()) != null && (followInfo = owner.getFollowInfo()) != null) {
                    followStatus = followInfo.getFollowStatus();
                } else {
                    followStatus = 0;
                }
                map.put("follow_status", String.valueOf(followStatus));
                map.put("guest_invite_type", C917520Zz4.LJI());
                C0KX4.LIZ("livesdk_guest_onstage_camera_on_start", map, null, true);
                LIZJ = System.currentTimeMillis();
                C1143300frE c1143300frELJIIJJI2 = C1143300frE.LJIIJJI();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("logCameraOnStart, startCameraTimeMills=");
                sbLIZ2.append(LIZJ);
                String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                c1143300frELJIIJJI2.getClass();
                AbstractC1143290frD.LJI("MultiGuestCameraOnDurationLogHelper", strLIZIZ2);
                return;
            }
            return;
        }
        if (LIZJ <= 0) {
            return;
        }
        LIZLLL();
    }

    public static void LJIIIZ(boolean z) {
        String strLIZIZ;
        InterfaceC921620a5g interfaceC921620a5g;
        LIZ = z;
        if (!z) {
            C1143300frE c1143300frELJIIJJI = C1143300frE.LJIIJJI();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("tryLogCameraOnDurationWhenGuestLeaveOrVideoMute, startCameraTimeMills=");
            sbLIZ.append(LIZJ);
            sbLIZ.append(", startMicTimeMills=");
            sbLIZ.append(LJFF);
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ);
            c1143300frELJIIJJI.getClass();
            AbstractC1143290frD.LJI("MultiGuestCameraOnDurationLogHelper", strLIZIZ2);
            if (LIZJ > 0) {
                LIZLLL();
            }
            if (LJFF > 0) {
                LJ();
                return;
            }
            return;
        }
        Object objLJIIIZ = C948450amx.LIZIZ.LJIIIZ("MULTI_GUEST_V3_GUEST_USER_MANAGER");
        if (!(objLJIIIZ instanceof InterfaceC917640ZzG) || (interfaceC921620a5g = (InterfaceC921620a5g) objLJIIIZ) == null || (strLIZIZ = interfaceC921620a5g.LIZIZ(UserService.getInstance().user().LJIJJLI().getId())) == null) {
            strLIZIZ = "null";
        }
        LIZIZ = strLIZIZ;
    }
}
