package X;

import Y.ARunnableS115S0100000_15;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.platform.common.datachannel.LinkMicIconMutex;
import com.bytedance.android.live.liveinteract.platform.common.datachannel.LinkMicSceneChangeChannel;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.comp.api.linkcore.model.RtcUserInfo;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkGuestCountLogicOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkMultiGuestEnableMixModeSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.CohostWithGuestPhase2EventTrackingOpt;
import com.bytedance.android.livesdk.model.message.linker.listchangemessage.LinkListUser;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZzX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C917810ZzX {
    public static final C917810ZzX LIZ = new C917810ZzX();
    public static int LIZIZ = 4;
    public static int LIZJ;

    public static final Map<String, String> LIZLLL() {
        String strValueOf;
        List<LinkUser> listLIZLLL;
        HashMap map = new HashMap();
        map.put("channel_id", String.valueOf(C915980Zwa.LJI().LJIIJ().getChannelId()));
        int size = 0;
        InterfaceC973730bRj interfaceC973730bRjYf2 = C915980Zwa.LJFF().yf2(false);
        C954460awe c954460awe = null;
        String strValueOf2 = String.valueOf(interfaceC973730bRjYf2 != null ? Long.valueOf(interfaceC973730bRjYf2.LJJJJJL()) : null);
        strValueOf2.toString();
        map.put("pk_id", strValueOf2);
        if (LJIIIIZZ()) {
            map.put("connection_type", C915980Zwa.LJFF().co0() ? "manual_pk" : "anchor");
        } else if (CohostWithGuestPhase2EventTrackingOpt.INSTANCE.isEnabled()) {
            if (C948780anU.LJIIL(C915980Zwa.LJII().LJIIIZ())) {
                map.put("connection_type", C915980Zwa.LJFF().co0() ? "manual_pk" : "anchor");
            } else {
                map.put("connection_type", "audience");
            }
        }
        Iterator<C954460awe> it2 = C915980Zwa.LJII().LLILZLL(true).iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            C954460awe next = it2.next();
            if (!next.LJI()) {
                c954460awe = next;
                break;
            }
        }
        C954460awe c954460awe2 = c954460awe;
        if (c954460awe2 != null) {
            map.put("cohost_anchor_id", String.valueOf(c954460awe2.LJ));
        }
        map.put("current_connection_cnts", String.valueOf(C915980Zwa.LJII().LLILZLL(true).size()));
        map.put("linker_mode", String.valueOf(C915980Zwa.LIZLLL().Uh()));
        map.put("both_guest_cnt", String.valueOf(C915980Zwa.LJII().LJJIIJZLJL().size()));
        map.put("max_both_guest_cnt", String.valueOf(C914820Zui.LIZJ));
        if (LJIILIIL()) {
            strValueOf = String.valueOf(C921180a4y.LJIIL(C915980Zwa.LJIIIIZZ()));
        } else {
            LIZ.getClass();
            int iLJFF = LJFF();
            InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
            if (interfaceC954180awCLLJLL != null && (listLIZLLL = interfaceC954180awCLLJLL.LIZLLL()) != null) {
                size = listLIZLLL.size();
            }
            strValueOf = String.valueOf(Math.max(iLJFF, size - 1));
        }
        map.put("guest_cnt", strValueOf);
        map.put("max_guest_cnt", String.valueOf(C921920a6A.LJFF));
        return map;
    }

    public static int LJ() {
        C931800aM6.LIZ.getClass();
        if (!C931800aM6.LIZIZ()) {
            return LIZJ;
        }
        InterfaceC954180awC interfaceC954180awCLJIIIZ = C915980Zwa.LJII().LJIIIZ();
        if (interfaceC954180awCLJIIIZ != null) {
            return interfaceC954180awCLJIIIZ.LJJLIIIJLJLI();
        }
        return 0;
    }

    public static final boolean LJII() {
        LIZ.getClass();
        int iLJ = LJ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("inCoHostOrMixMode, linkerMode=");
        sbLIZ.append(iLJ);
        C20441214yg.LIZIZ("LinkMicCommonService", C2188811AlT.LIZIZ(sbLIZ));
        return iLJ == 3 || iLJ == 2;
    }

    public static final boolean LJIIIIZZ() {
        C931800aM6.LIZ.getClass();
        if (!C931800aM6.LIZIZ()) {
            return LIZIZ == 2 && LiveSdkMultiGuestEnableMixModeSetting.isEnable();
        }
        LIZ.getClass();
        int iLJ = LJ();
        return iLJ == 3 || iLJ == 2;
    }

    public static final boolean LJIIIZ() {
        C931800aM6.LIZ.getClass();
        if (!C931800aM6.LIZIZ()) {
            return LIZIZ == 4;
        }
        LIZ.getClass();
        return LJ() == 1;
    }

    public static final boolean LJIIJ() {
        return C943590af7.LIZ == 1 && LiveSdkMultiGuestEnableMixModeSetting.isEnable();
    }

    public static final boolean LJIIL() {
        C931800aM6.LIZ.getClass();
        if (!C931800aM6.LIZIZ()) {
            return LIZIZ == 4;
        }
        LIZ.getClass();
        int iLJ = LJ();
        return iLJ == 1 || iLJ == 0;
    }

    public static final boolean LJIILIIL() {
        if (!LiveSdkGuestCountLogicOptSetting.INSTANCE.isEnable()) {
            return false;
        }
        InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
        return (interfaceC954180awCLLJLL != null && interfaceC954180awCLLJLL.scene() == 2) || LJIIIIZZ();
    }

    public static boolean LIZIZ() {
        InterfaceC954180awC interfaceC954180awCLJIIIZ;
        InterfaceC954180awC interfaceC954180awCLJIIIZ2;
        List<LinkUser> listLJII;
        List<LinkUser> listLIZLLL;
        List<LinkUser> listLJ;
        boolean zLLLFZ = C915980Zwa.LJII().LLLFZ(C950220apo.LJFF());
        InterfaceC954180awC interfaceC954180awCLJIIIZ3 = C915980Zwa.LJII().LJIIIZ();
        return (zLLLFZ || ((interfaceC954180awCLJIIIZ3 != null && (listLJ = C948780anU.LJ(interfaceC954180awCLJIIIZ3)) != null && (listLJ.isEmpty() ^ true)) || (((interfaceC954180awCLJIIIZ = C915980Zwa.LJII().LJIIIZ()) != null && (listLIZLLL = C948780anU.LIZLLL(interfaceC954180awCLJIIIZ)) != null && (listLIZLLL.isEmpty() ^ true)) || ((interfaceC954180awCLJIIIZ2 = C915980Zwa.LJII().LJIIIZ()) != null && (listLJII = C948780anU.LJII(interfaceC954180awCLJIIIZ2)) != null && (listLJII.isEmpty() ^ true)))) || ((C915980Zwa.LJIIIZ().LJII() > 0L ? 1 : (C915980Zwa.LJIIIZ().LJII() == 0L ? 0 : -1)) > 0)) ? false : true;
    }

    public static int LJFF() {
        AbstractC928510aGn abstractC928510aGnLIZ;
        List listLJJIII;
        AbstractC928510aGn abstractC928510aGnLIZ2;
        List listLJJIII2;
        AbstractC928510aGn abstractC928510aGnLIZ3;
        if (C930540aK4.LIZJ()) {
            InterfaceC302401Fe interfaceC302401Fe = (InterfaceC302401Fe) C948450amx.LIZIZ.LJIIJJI("MULTI_GUEST_V3_ANCHOR_USER_MANAGER");
            if (interfaceC302401Fe == null || (abstractC928510aGnLIZ3 = interfaceC302401Fe.LIZ()) == null) {
                return 0;
            }
            return C921170a4x.LIZJ(abstractC928510aGnLIZ3);
        }
        C923330a8R c923330a8R = C923330a8R.LIZ;
        if (!C923330a8R.LJI()) {
            InterfaceC917640ZzG interfaceC917640ZzG = (InterfaceC917640ZzG) C948450amx.LIZIZ.LJIIJJI("MULTI_GUEST_V3_GUEST_USER_MANAGER");
            if (interfaceC917640ZzG == null || (abstractC928510aGnLIZ = interfaceC917640ZzG.LIZ()) == null || (listLJJIII = abstractC928510aGnLIZ.LJJIII()) == null) {
                return 0;
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj : listLJJIII) {
                LinkListUser linkListUser = (LinkListUser) obj;
                long j = linkListUser.LIZIZ;
                Long lLJIIJ = C930540aK4.LJIIJ();
                if (lLJIIJ != null && j == lLJIIJ.longValue()) {
                    User user = linkListUser.user;
                    if (!Intrinsics.LJFF(user != null ? Long.valueOf(user.getId()) : null, C930540aK4.LJIILLIIL())) {
                        arrayList.add(obj);
                    }
                }
            }
            return arrayList.size();
        }
        InterfaceC917530Zz5 interfaceC917530Zz5 = (InterfaceC917530Zz5) C948450amx.LIZIZ.LJIIJJI("MULTI_GUEST_V3_MODERATOR_USER_MANAGER");
        if (interfaceC917530Zz5 == null || (abstractC928510aGnLIZ2 = interfaceC917530Zz5.LIZ()) == null || (listLJJIII2 = abstractC928510aGnLIZ2.LJJIII()) == null) {
            return 0;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : listLJJIII2) {
            LinkPlayerInfo linkPlayerInfo = (LinkPlayerInfo) obj2;
            long j2 = linkPlayerInfo.LJII;
            Long lLJIIJ2 = C930540aK4.LJIIJ();
            if (lLJIIJ2 != null && j2 == lLJIIJ2.longValue()) {
                long id = linkPlayerInfo.mUser.getId();
                Long lLJIILLIIL = C930540aK4.LJIILLIIL();
                if (lLJIILLIIL == null || id != lLJIILLIIL.longValue()) {
                    arrayList2.add(obj2);
                }
            }
        }
        return arrayList2.size();
    }

    public static String LJI() {
        RtcUserInfo rtcUserInfoG0;
        try {
            InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
            if (interfaceC954180awCLLJLL != null && (rtcUserInfoG0 = interfaceC954180awCLLJLL.G0()) != null) {
                String str = rtcUserInfoG0.linkMicId;
                if (str != null) {
                    return str;
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return "";
    }

    public static final boolean LJIIJJI() {
        return !C924790aAn.LIZLLL().LJI() && C943590af7.LIZ == 3 && LiveSdkMultiGuestEnableMixModeSetting.isEnable();
    }

    public static final void LIZ(C474500IjA c474500IjA) {
        c474500IjA.LJJIIZI(LIZLLL());
    }

    public static void LIZJ(DataChannel dataChannel) {
        LJIILL(dataChannel, 2);
        if (LiveSdkMultiGuestEnableMixModeSetting.isEnable() && !C924790aAn.LIZLLL().LJI()) {
            if (C930540aK4.LIZJ()) {
                C930480aJy.LIZ.getClass();
                C930480aJy.LJJIIJ("legolas", "anchor convertMultiGuestToReserve", null);
                if (dataChannel != null) {
                    dataChannel.LC0(LinkMicIconMutex.class, new ARunnableS115S0100000_15(dataChannel, 191));
                    return;
                }
                return;
            }
            if (dataChannel != null) {
                dataChannel.LC0(LinkMicIconMutex.class, new ARunnableS115S0100000_15(dataChannel, 192));
            }
            C930480aJy.LIZ.getClass();
            C930480aJy.LJJIIJ("legolas", "audience convertMultiGuestToReserve", null);
        }
    }

    public static final void LJIILL(DataChannel dataChannel, int i) {
        LIZ.getClass();
        if (i != LIZIZ) {
            LIZIZ = i;
        }
        if (dataChannel != null) {
            dataChannel.zW(LinkMicSceneChangeChannel.class, Integer.valueOf(i));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIILJJIL(com.bytedance.ies.sdk.datachannel.DataChannel r4, android.widget.TextView r5, X.C443120HZe r6) {
        /*
            Method dump skipped, instruction units count: 205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C917810ZzX.LJIILJJIL(com.bytedance.ies.sdk.datachannel.DataChannel, android.widget.TextView, X.0HZe):void");
    }
}
