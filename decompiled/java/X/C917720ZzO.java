package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.multiguestv3.MultiGuestKaraokeStatusChannel;
import com.bytedance.android.live.liveinteract.multiguestv3.MultiGuestSettingForKaraokeChannel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.karaoke.widget.KaraokeAnchorWidget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.karaoke.widget.KaraokeGuestWidget;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestKaraokeLogOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestKaraokePhaseTwoSwitcherSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LiveAbLabelSetting;
import com.bytedance.android.livesdk.model.message.linkcore.LinkCommon;
import com.bytedance.android.livesdk.model.message.linker.listchangemessage.LinkListUser;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZzO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C917720ZzO {
    public static C917730ZzP LIZIZ;
    public static Long LIZJ;
    public static KaraokeGuestWidget LIZLLL;
    public static KaraokeAnchorWidget LJ;
    public static final C917720ZzO LIZ = new C917720ZzO();
    public static long LJFF = -1;

    public static boolean LIZJ() {
        if (!MultiGuestKaraokePhaseTwoSwitcherSetting.INSTANCE.isEnable() || C930540aK4.LJJIJ()) {
            return false;
        }
        if (!C930540aK4.LIZJ()) {
            Integer numLJ = C931820aM8.LJ("live_sdk_multi_guest_karaoke");
            if (numLJ == null || numLJ.intValue() < 1) {
                return false;
            }
        } else if (LiveAbLabelSetting.INSTANCE.getIntValue("live_sdk_multi_guest_karaoke") < 1) {
            return false;
        }
        return true;
    }

    public static LinkCommon LIZ(int i) {
        LinkCommon linkCommon = new LinkCommon(0, 0L, 0L, null, "", "", 0, "");
        linkCommon.scene = i;
        linkCommon.appId = ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).appId();
        linkCommon.live_id = ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).liveId();
        return linkCommon;
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x00e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static kotlin.Pair LIZIZ(int r13) {
        /*
            Method dump skipped, instruction units count: 455
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C917720ZzO.LIZIZ(int):kotlin.Pair");
    }

    public static void LJ(String str) {
        HashMap map = new HashMap();
        C01Z4.LIZ(null, map);
        map.put("popup_action_type", str);
        C0KX4.LIZ("livesdk_anchor_karaoke_request_accept_popup", map, null, true);
    }

    public static void LJFF(String str) {
        HashMap map = new HashMap();
        C01Z4.LIZ(null, map);
        map.put("popup_action_type", str);
        C0KX4.LIZ("livesdk_guest_connection_karaoke_request_first_popup", map, null, true);
    }

    public static boolean LIZLLL(C917720ZzO c917720ZzO, Long l) {
        List listLJJIII;
        List listLJIL;
        Long lValueOf;
        AbstractC928510aGn abstractC928510aGnLIZ;
        AbstractC928510aGn abstractC928510aGnLIZ2;
        c917720ZzO.getClass();
        Object obj = null;
        if (C930540aK4.LIZJ()) {
            InterfaceC302401Fe interfaceC302401Fe = (InterfaceC302401Fe) C948450amx.LIZIZ.LJIIJJI("MULTI_GUEST_V3_ANCHOR_USER_MANAGER");
            if (interfaceC302401Fe != null) {
                abstractC928510aGnLIZ2 = interfaceC302401Fe.LIZ();
            } else {
                abstractC928510aGnLIZ2 = null;
            }
            ArrayList arrayList = new ArrayList();
            if (abstractC928510aGnLIZ2 != null) {
                List listLJJIII2 = abstractC928510aGnLIZ2.LJJIII();
                List listLJIL2 = abstractC928510aGnLIZ2.LJIL();
                if (listLJJIII2 != null) {
                    arrayList.addAll(listLJJIII2);
                }
                if (listLJIL2 != null) {
                    arrayList.addAll(listLJIL2);
                }
            }
            for (Object obj2 : arrayList) {
                LinkPlayerInfo linkPlayerInfo = (LinkPlayerInfo) obj2;
                long id = linkPlayerInfo.mUser.getId();
                if ((l != null && id == l.longValue()) || Intrinsics.LJFF(linkPlayerInfo.mInteractIdStr, null)) {
                    obj = obj2;
                    break;
                }
            }
            LinkPlayerInfo linkPlayerInfo2 = (LinkPlayerInfo) obj;
            if (linkPlayerInfo2 != null && linkPlayerInfo2.linkUserType == 1) {
                return true;
            }
            return false;
        }
        InterfaceC917640ZzG interfaceC917640ZzG = (InterfaceC917640ZzG) C948450amx.LIZIZ.LJIIJJI("MULTI_GUEST_V3_GUEST_USER_MANAGER");
        if (interfaceC917640ZzG != null && (abstractC928510aGnLIZ = interfaceC917640ZzG.LIZ()) != null) {
            listLJJIII = abstractC928510aGnLIZ.LJJIII();
            listLJIL = abstractC928510aGnLIZ.LJIL();
        } else {
            listLJJIII = null;
            listLJIL = null;
        }
        ArrayList arrayList2 = new ArrayList();
        if (listLJJIII != null) {
            arrayList2.addAll(listLJJIII);
        }
        if (listLJIL != null) {
            arrayList2.addAll(listLJIL);
        }
        for (Object obj3 : arrayList2) {
            LinkListUser linkListUser = (LinkListUser) obj3;
            User user = linkListUser.user;
            if (user != null) {
                lValueOf = Long.valueOf(user.getId());
            } else {
                lValueOf = null;
            }
            if (Intrinsics.LJFF(lValueOf, l) || Intrinsics.LJFF(linkListUser.linkMicId, null)) {
                obj = obj3;
                break;
            }
        }
        LinkListUser linkListUser2 = (LinkListUser) obj;
        if (linkListUser2 != null && linkListUser2.linkUserType == 1) {
            return true;
        }
        return false;
    }

    public static void LJI(String str, String str2) {
        MultiGuestKaraokeLogOptSetting multiGuestKaraokeLogOptSetting = MultiGuestKaraokeLogOptSetting.INSTANCE;
        if (multiGuestKaraokeLogOptSetting.shouldCloseLog()) {
            return;
        }
        if (multiGuestKaraokeLogOptSetting.shouldUseALog()) {
            C20441214yg.LIZIZ(str, str2);
        } else {
            multiGuestKaraokeLogOptSetting.shouldUseAndroidLog();
        }
    }

    public static void LJIIIZ(DataChannel dataChannel, int i) {
        if (!LIZJ()) {
            C20441214yg.LIZIZ("MultiGuestKaraokeUtil", "current use is not in Karaoke phase two exp, so return");
            return;
        }
        Pair pairLIZIZ = LIZIZ(i);
        if (dataChannel != null) {
            dataChannel.zW(MultiGuestSettingForKaraokeChannel.class, pairLIZIZ.getFirst());
        }
        Integer num = (Integer) pairLIZIZ.getSecond();
        if (num != null) {
            int iIntValue = num.intValue();
            if (dataChannel != null) {
                dataChannel.zW(MultiGuestKaraokeStatusChannel.class, Integer.valueOf(iIntValue));
            }
        }
    }

    public static void LJII(String str, String str2, Throwable th) {
        if (th != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("MultiGuestKaraokeUtil_");
            sbLIZ.append(str);
            C20441214yg.LJFF(C2188811AlT.LIZIZ(sbLIZ), str2, th);
            if (((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isOffline() && !(th instanceof C501470JlZ)) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(str2);
                sbLIZ2.append(':');
                sbLIZ2.append(th.getMessage());
                C766270U4b.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ2));
                return;
            }
            return;
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("MultiGuestKaraokeUtil_");
        sbLIZ3.append(str);
        C20441214yg.LIZIZ(C2188811AlT.LIZIZ(sbLIZ3), str2);
    }
}
