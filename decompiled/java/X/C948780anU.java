package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.comp.api.linkcore.model.RtcUserInfo;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.CohostWithGuestSDKSessionExtSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.CohostWithGuestUserTypeCheckSetting;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0anU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C948780anU {
    public static final boolean LJIIIZ() {
        if (CohostWithGuestSDKSessionExtSetting.INSTANCE.forceEnabled()) {
            return true;
        }
        return C948770anT.LJ();
    }

    public static final List<LinkUser> LIZ(List<LinkUser> list) {
        ArrayList arrayList = new ArrayList();
        for (LinkUser linkUser : list) {
            LinkUser linkUser2 = linkUser;
            LJIILIIL(linkUser2);
            if (linkUser2 != null && linkUser2.linkUserType == 1) {
                arrayList.add(linkUser);
            }
        }
        return arrayList;
    }

    public static final List<LinkUser> LIZIZ(List<LinkUser> list) {
        Integer numValueOf;
        ArrayList arrayList = new ArrayList();
        for (LinkUser linkUser : list) {
            LinkUser linkUser2 = linkUser;
            LJIILIIL(linkUser2);
            if (LJIIIZ() && (linkUser2 == null || linkUser2.linkUserType != 2)) {
                CohostWithGuestUserTypeCheckSetting.Configs value = CohostWithGuestUserTypeCheckSetting.INSTANCE.getValue();
                Integer numValueOf2 = null;
                if (linkUser2 != null) {
                    numValueOf = Integer.valueOf(linkUser2.linkUserType);
                } else {
                    numValueOf = null;
                }
                if (C13LP.LJJJJ(numValueOf, value.additionalHostTypes)) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("isHost() == true, user_type == ");
                    if (linkUser2 != null) {
                        numValueOf2 = Integer.valueOf(linkUser2.linkUserType);
                    }
                    sbLIZ.append(numValueOf2);
                    C20441214yg.LIZIZ("CoHostSessionExt", C2188811AlT.LIZIZ(sbLIZ));
                    if (!value.shouldCheckAnchorAB || (true ^ C948770anT.LIZ())) {
                    }
                }
            }
            arrayList.add(linkUser);
        }
        return arrayList;
    }

    public static final List<LinkUser> LIZJ(InterfaceC954180awC interfaceC954180awC) {
        if (!LJIIIZ()) {
            return interfaceC954180awC.LLJJ().LJJJJJL();
        }
        return LIZIZ(interfaceC954180awC.LLJJ().LJJJJJL());
    }

    public static final List<LinkUser> LIZLLL(InterfaceC954180awC interfaceC954180awC) {
        RtcUserInfo rtcUserInfoG0;
        if (!LJIIIZ()) {
            return interfaceC954180awC.LLJJ().LJJJJL();
        }
        ArrayList arrayList = new ArrayList(LIZIZ(interfaceC954180awC.LJIL()));
        if ((!interfaceC954180awC.LJJIJLIJ().isEmpty()) && (rtcUserInfoG0 = interfaceC954180awC.G0()) != null) {
            arrayList.add(new LinkUser(Long.valueOf(rtcUserInfoG0.roomId), Long.valueOf(rtcUserInfoG0.userId), Long.valueOf(rtcUserInfoG0.channelId), rtcUserInfoG0.linkMicId, null, null, false, true, false, false, null, null, null, null, null, null, null, 0L, null, 0, 0, null, null));
        }
        return arrayList;
    }

    public static final List<LinkUser> LJ(InterfaceC954180awC interfaceC954180awC) {
        if (!LJIIIZ()) {
            return interfaceC954180awC.LLJJ().Kh();
        }
        return LIZIZ(interfaceC954180awC.LJII());
    }

    public static final List<LinkUser> LJFF(InterfaceC954180awC interfaceC954180awC) {
        List<LinkUser> listLIZ = LIZ(interfaceC954180awC.LIZLLL());
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getSdkLinkedGuestList, linkedGuest.size = ");
        sbLIZ.append(((ArrayList) listLIZ).size());
        C20441214yg.LIZIZ("CoHostSessionExt", C2188811AlT.LIZIZ(sbLIZ));
        return listLIZ;
    }

    public static final List<LinkUser> LJI(InterfaceC954180awC interfaceC954180awC) {
        if (!LJIIIZ()) {
            return interfaceC954180awC.LIZLLL();
        }
        List<LinkUser> listLIZLLL = interfaceC954180awC.LIZLLL();
        List<LinkUser> listLIZIZ = LIZIZ(listLIZLLL);
        StringBuilder sb = new StringBuilder("getSdkLinkedHostList, linkedHosts.size = ");
        sb.append(((ArrayList) listLIZIZ).size());
        sb.append(", linkedList.size = ");
        sb.append(listLIZLLL.size());
        sb.append(", linkedHosts=");
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLIZIZ, 10));
        Iterator<LinkUser> it2 = listLIZIZ.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().linkMicId);
        }
        sb.append(arrayList);
        C20441214yg.LIZIZ("CoHostSessionExt", sb.toString());
        return listLIZIZ;
    }

    public static final List<LinkUser> LJII(InterfaceC954180awC interfaceC954180awC) {
        if (!LJIIIZ()) {
            return interfaceC954180awC.LLJJ().LJJJJLL();
        }
        return interfaceC954180awC.LJJIJIIJI();
    }

    public static final boolean LJIIL(InterfaceC954180awC interfaceC954180awC) {
        if (interfaceC954180awC == null) {
            return false;
        }
        if (interfaceC954180awC.LJJLIIIJLJLI() != 2 && interfaceC954180awC.LJJLIIIJLJLI() != 3) {
            return false;
        }
        return true;
    }

    public static final void LJIILIIL(LinkUser linkUser) {
        int i;
        if (linkUser != null && (i = linkUser.linkUserType) != 2 && i != 1) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("user type wrong, user_type = ");
            sbLIZ.append(linkUser.linkUserType);
            sbLIZ.append(", linkMicId = ");
            sbLIZ.append(linkUser.linkMicId);
            C20441214yg.LIZIZ("MG_CH_ERROR", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public static final boolean LJIIIIZZ(InterfaceC954180awC interfaceC954180awC, String str) {
        if (interfaceC954180awC != null && str != null) {
            List<LinkUser> listLJJIJLIJ = interfaceC954180awC.LJJIJLIJ();
            if (!(listLJJIJLIJ instanceof Collection) || !listLJJIJLIJ.isEmpty()) {
                Iterator<LinkUser> it2 = listLJJIJLIJ.iterator();
                while (it2.hasNext()) {
                    if (Intrinsics.LJFF(it2.next().linkMicId, str)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final boolean LJIIJ(InterfaceC954180awC interfaceC954180awC, String str) {
        List<LinkUser> listLIZLLL;
        if (interfaceC954180awC == null || (listLIZLLL = interfaceC954180awC.LIZLLL()) == null) {
            return false;
        }
        List<LinkUser> listLIZ = LIZ(listLIZLLL);
        if (listLIZ.isEmpty()) {
            return false;
        }
        Iterator<LinkUser> it2 = listLIZ.iterator();
        while (it2.hasNext()) {
            if (Intrinsics.LJFF(it2.next().linkMicId, str)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean LJIIJJI(InterfaceC954180awC interfaceC954180awC, String str) {
        List<LinkUser> listLIZLLL;
        if (interfaceC954180awC == null || (listLIZLLL = interfaceC954180awC.LIZLLL()) == null) {
            return false;
        }
        List<LinkUser> listLIZIZ = LIZIZ(listLIZLLL);
        if (listLIZIZ.isEmpty()) {
            return false;
        }
        Iterator<LinkUser> it2 = listLIZIZ.iterator();
        while (it2.hasNext()) {
            if (Intrinsics.LJFF(it2.next().linkMicId, str)) {
                return true;
            }
        }
        return false;
    }
}
