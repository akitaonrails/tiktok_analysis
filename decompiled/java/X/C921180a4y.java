package X;

import android.graphics.Rect;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.multiguestv3.service.IMultiGuestV3InternalServiceV2;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.Layout;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.comp.api.linkcore.model.RtcUserInfo;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkFilterCurrentRoomGuestOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LinkMicRtcRatioShareBackgroundTopRatio;
import com.bytedance.android.livesdk.model.message.LinkMessage;
import com.bytedance.android.livesdk.model.message.linker.listchangemessage.LinkListUser;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import tikcast.linkmic.common.PosIdentity;

/* JADX INFO: renamed from: X.0a4y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C921180a4y {
    public static final InterfaceC917640ZzG LIZ() {
        Object objLJIIIZ = C948450amx.LIZIZ.LJIIIZ("MULTI_GUEST_V3_GUEST_USER_MANAGER");
        if (objLJIIIZ instanceof InterfaceC917640ZzG) {
            return (InterfaceC917640ZzG) objLJIIIZ;
        }
        return null;
    }

    public static final InterfaceC921200a50<LinkListUser, LinkMessage> LIZIZ() {
        InterfaceC917640ZzG interfaceC917640ZzG = (InterfaceC917640ZzG) C948450amx.LIZIZ.LJIIJJI("MULTI_GUEST_V3_GUEST_USER_MANAGER");
        if (interfaceC917640ZzG != null) {
            return interfaceC917640ZzG.LIZ();
        }
        return null;
    }

    public static final InterfaceC921620a5g LIZJ() {
        if (C930540aK4.LIZJ()) {
            Object objLJIIIZ = C948450amx.LIZIZ.LJIIIZ("MULTI_GUEST_V3_ANCHOR_USER_MANAGER");
            if (objLJIIIZ instanceof InterfaceC302401Fe) {
                return (InterfaceC921620a5g) objLJIIIZ;
            }
            return null;
        }
        C923330a8R c923330a8R = C923330a8R.LIZ;
        if (!C923330a8R.LJI()) {
            return LIZ();
        }
        Object objLJIIIZ2 = C948450amx.LIZIZ.LJIIIZ("MULTI_GUEST_V3_MODERATOR_USER_MANAGER");
        if (objLJIIIZ2 instanceof InterfaceC917530Zz5) {
            return (InterfaceC921620a5g) objLJIIIZ2;
        }
        return null;
    }

    public static final int LIZLLL() {
        List<LinkListUser> listLJI;
        InterfaceC921200a50<LinkListUser, LinkMessage> interfaceC921200a50LIZIZ = LIZIZ();
        if (interfaceC921200a50LIZIZ == null || (listLJI = interfaceC921200a50LIZIZ.LJI()) == null) {
            return 0;
        }
        ArrayList arrayList = new ArrayList();
        for (LinkListUser linkListUser : listLJI) {
            User user = linkListUser.user;
            if (user == null || user.getId() != C950220apo.LJFF()) {
                arrayList.add(linkListUser);
            }
        }
        return arrayList.size();
    }

    public static final Rect LJFF() {
        InterfaceC937820aVo interfaceC937820aVoLJJJJZ;
        Rect containerAllRange;
        int iWidth;
        int iHeight;
        int i;
        int value;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        InterfaceC940060aZQ interfaceC940060aZQ;
        FrameLayout frameLayoutLL;
        InterfaceC937820aVo interfaceC937820aVoLJJJJZ2;
        Rect playerRange;
        InterfaceC940060aZQ interfaceC940060aZQ2;
        if (C1ACJ.LIZIZ()) {
            if (C931790aM5.LIZIZ()) {
                InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
                InterfaceC937900aVw interfaceC937900aVwLLIIJLIL = interfaceC954180awCLLJLL != null ? interfaceC954180awCLLJLL.LLIIJLIL() : null;
                ViewGroup.LayoutParams layoutParams = (!(interfaceC937900aVwLLIIJLIL instanceof InterfaceC940060aZQ) || (interfaceC940060aZQ = (InterfaceC940060aZQ) interfaceC937900aVwLLIIJLIL) == null || (frameLayoutLL = interfaceC940060aZQ.LL()) == null) ? null : frameLayoutLL.getLayoutParams();
                if (!(layoutParams instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) == null) {
                    return null;
                }
                int i2 = marginLayoutParams.leftMargin;
                int i3 = marginLayoutParams.topMargin;
                containerAllRange = new Rect(i2, i3, marginLayoutParams.width + i2, marginLayoutParams.height + i3);
            } else {
                InterfaceC937900aVw interfaceC937900aVwLJIIIIZZ = LJIIIIZZ(C915980Zwa.LJIIIIZZ());
                if (interfaceC937900aVwLJIIIIZZ == null || (interfaceC937820aVoLJJJJZ = interfaceC937900aVwLJIIIIZZ.LJJJJZ()) == null || (containerAllRange = interfaceC937820aVoLJJJJZ.getContainerAllRange()) == null) {
                    return null;
                }
            }
            iWidth = containerAllRange.width();
            iHeight = (int) ((iWidth * 12.0f) / 5.0f);
            i = containerAllRange.left;
            value = (int) (((double) containerAllRange.top) - (((double) iHeight) * ((LinkMicRtcRatioShareBackgroundTopRatio.getValue() * ((double) 8.0f)) / ((double) 12.0f))));
        } else {
            if (C931790aM5.LIZIZ()) {
                InterfaceC954180awC interfaceC954180awCLLJLL2 = C915980Zwa.LJIIIIZZ().LLJLL();
                InterfaceC937900aVw interfaceC937900aVwLLIIJLIL2 = interfaceC954180awCLLJLL2 != null ? interfaceC954180awCLLJLL2.LLIIJLIL() : null;
                if (!(interfaceC937900aVwLLIIJLIL2 instanceof InterfaceC940060aZQ) || (interfaceC940060aZQ2 = (InterfaceC940060aZQ) interfaceC937900aVwLLIIJLIL2) == null || (playerRange = interfaceC940060aZQ2.LJJIIJZLJL()) == null) {
                    return null;
                }
            } else {
                InterfaceC937900aVw interfaceC937900aVwLJIIIIZZ2 = LJIIIIZZ(C915980Zwa.LJIIIIZZ());
                if (interfaceC937900aVwLJIIIIZZ2 == null || (interfaceC937820aVoLJJJJZ2 = interfaceC937900aVwLJIIIIZZ2.LJJJJZ()) == null || (playerRange = interfaceC937820aVoLJJJJZ2.getPlayerRange()) == null) {
                    return null;
                }
            }
            iHeight = (playerRange.height() * 3) / 2;
            iWidth = playerRange.width();
            i = playerRange.left;
            value = playerRange.top;
        }
        return new Rect(i, value, iWidth + i, iHeight + value);
    }

    public static final boolean LJII() {
        return !C930540aK4.LIZJ() && LJIIJJI(C915980Zwa.LJIIIIZZ()) >= 3;
    }

    public static final int LJ(IMultiGuestV3InternalServiceV2 iMultiGuestV3InternalServiceV2) {
        InterfaceC937900aVw interfaceC937900aVwLLIIJLIL;
        Layout layoutLJJLIIIJLLLLLLLZ;
        int i;
        InterfaceC937900aVw interfaceC937900aVwLLIIJLIL2;
        InterfaceC937820aVo interfaceC937820aVoLJJJJZ;
        List<InterfaceC937840aVq> allLayoutWindows;
        int i2 = 0;
        if (C931790aM5.LIZIZ()) {
            List<C957020b0m> listLJIIIZ = C940770aaZ.LIZ().getDataSource().LJIIIZ();
            if (!(listLJIIIZ instanceof Collection) || !listLJIIIZ.isEmpty()) {
                Iterator<C957020b0m> it2 = listLJIIIZ.iterator();
                i2 = 0;
                while (it2.hasNext()) {
                    PosIdentity posIdentity = it2.next().getPosIdentity();
                    if (posIdentity != null && posIdentity.type == 0 && (i2 = i2 + 1) < 0) {
                        C1697810uHb.LJIJ();
                        throw null;
                    }
                }
            }
            return i2;
        }
        InterfaceC954180awC interfaceC954180awCLLJLL = iMultiGuestV3InternalServiceV2.LLJLL();
        if (interfaceC954180awCLLJLL == null || (interfaceC937900aVwLLIIJLIL = interfaceC954180awCLLJLL.LLIIJLIL()) == null || (layoutLJJLIIIJLLLLLLLZ = interfaceC937900aVwLLIIJLIL.LJJLIIIJLLLLLLLZ()) == null || (i = layoutLJJLIIIJLLLLLLLZ.micCount) <= 0) {
            return -1;
        }
        InterfaceC954180awC interfaceC954180awCLLJLL2 = iMultiGuestV3InternalServiceV2.LLJLL();
        if (interfaceC954180awCLLJLL2 != null && (interfaceC937900aVwLLIIJLIL2 = interfaceC954180awCLLJLL2.LLIIJLIL()) != null && (interfaceC937820aVoLJJJJZ = interfaceC937900aVwLLIIJLIL2.LJJJJZ()) != null && (allLayoutWindows = interfaceC937820aVoLJJJJZ.getAllLayoutWindows()) != null && !allLayoutWindows.isEmpty()) {
            Iterator<InterfaceC937840aVq> it3 = allLayoutWindows.iterator();
            while (it3.hasNext()) {
                if ((!it3.next().LJIILIIL()) && (i2 = i2 + 1) < 0) {
                    C1697810uHb.LJIJ();
                    throw null;
                }
            }
        }
        return i - i2;
    }

    public static final int LJI(IMultiGuestV3InternalServiceV2 iMultiGuestV3InternalServiceV2) {
        InterfaceC937900aVw interfaceC937900aVwLLIIJLIL;
        Layout layoutLJJLIIIJLLLLLLLZ;
        InterfaceC937900aVw interfaceC937900aVwLLIIJLIL2;
        InterfaceC937820aVo interfaceC937820aVoLJJJJZ;
        List<InterfaceC937840aVq> allLayoutWindows;
        int i = 0;
        if (C931790aM5.LIZIZ()) {
            List<C957020b0m> listLJIIIZ = C940770aaZ.LIZ().getDataSource().LJIIIZ();
            if (!(listLJIIIZ instanceof Collection) || !listLJIIIZ.isEmpty()) {
                Iterator<C957020b0m> it2 = listLJIIIZ.iterator();
                i = 0;
                while (it2.hasNext()) {
                    PosIdentity posIdentity = it2.next().getPosIdentity();
                    if (posIdentity != null && posIdentity.type == 0 && (i = i + 1) < 0) {
                        C1697810uHb.LJIJ();
                        throw null;
                    }
                }
            }
            return i;
        }
        InterfaceC954180awC interfaceC954180awCLLJLL = iMultiGuestV3InternalServiceV2.LLJLL();
        if (interfaceC954180awCLLJLL == null || (interfaceC937900aVwLLIIJLIL = interfaceC954180awCLLJLL.LLIIJLIL()) == null || (layoutLJJLIIIJLLLLLLLZ = interfaceC937900aVwLLIIJLIL.LJJLIIIJLLLLLLLZ()) == null || layoutLJJLIIIJLLLLLLLZ.micCount <= 0) {
            return -1;
        }
        InterfaceC954180awC interfaceC954180awCLLJLL2 = iMultiGuestV3InternalServiceV2.LLJLL();
        if (interfaceC954180awCLLJLL2 != null && (interfaceC937900aVwLLIIJLIL2 = interfaceC954180awCLLJLL2.LLIIJLIL()) != null && (interfaceC937820aVoLJJJJZ = interfaceC937900aVwLLIIJLIL2.LJJJJZ()) != null && (allLayoutWindows = interfaceC937820aVoLJJJJZ.getAllLayoutWindows()) != null && !allLayoutWindows.isEmpty()) {
            Iterator<InterfaceC937840aVq> it3 = allLayoutWindows.iterator();
            while (it3.hasNext()) {
                if (it3.next().LJIILIIL() && (i = i + 1) < 0) {
                    C1697810uHb.LJIJ();
                    throw null;
                }
            }
        }
        return i;
    }

    public static final InterfaceC937900aVw LJIIIIZZ(IMultiGuestV3InternalServiceV2 iMultiGuestV3InternalServiceV2) {
        InterfaceC937900aVw interfaceC937900aVwLLIIJLIL = null;
        try {
            InterfaceC954180awC interfaceC954180awCLLJLL = iMultiGuestV3InternalServiceV2.LLJLL();
            if (interfaceC954180awCLLJLL != null) {
                interfaceC937900aVwLLIIJLIL = interfaceC954180awCLLJLL.LLIIJLIL();
                return interfaceC937900aVwLLIIJLIL;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return interfaceC937900aVwLLIIJLIL;
    }

    public static final String LJIIIZ(IMultiGuestV3InternalServiceV2 iMultiGuestV3InternalServiceV2) {
        InterfaceC937900aVw interfaceC937900aVwLLIIJLIL;
        Layout layoutLJFF;
        String str;
        try {
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        if (C931790aM5.LIZIZ()) {
            return C940770aaZ.LIZ().getDataSource().LJIL();
        }
        InterfaceC954180awC interfaceC954180awCLLJLL = iMultiGuestV3InternalServiceV2.LLJLL();
        if (interfaceC954180awCLLJLL == null || (interfaceC937900aVwLLIIJLIL = interfaceC954180awCLLJLL.LLIIJLIL()) == null || (layoutLJFF = interfaceC937900aVwLLIIJLIL.LJFF()) == null || (str = layoutLJFF.layoutId) == null) {
            return "";
        }
        return str;
    }

    public static final String LJIIJ(IMultiGuestV3InternalServiceV2 iMultiGuestV3InternalServiceV2) {
        RtcUserInfo rtcUserInfoG0;
        try {
            InterfaceC954180awC interfaceC954180awCLLJLL = iMultiGuestV3InternalServiceV2.LLJLL();
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

    public static final int LJIIJJI(IMultiGuestV3InternalServiceV2 iMultiGuestV3InternalServiceV2) {
        C914780Zue c914780ZueLJJIIJ;
        try {
            C931800aM6.LIZ.getClass();
            if (C931800aM6.LIZIZ()) {
                InterfaceC954180awC interfaceC954180awCLLJLL = iMultiGuestV3InternalServiceV2.LLJLL();
                if (interfaceC954180awCLLJLL != null && (c914780ZueLJJIIJ = interfaceC954180awCLLJLL.LJJIIJ()) != null) {
                    return C954870axJ.LIZIZ(c914780ZueLJJIIJ, false);
                }
            } else {
                InterfaceC954180awC interfaceC954180awCLLJLL2 = iMultiGuestV3InternalServiceV2.LLJLL();
                if (interfaceC954180awCLLJLL2 != null) {
                    return interfaceC954180awCLLJLL2.LLJLLIL();
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return 0;
    }

    public static final int LJIIL(IMultiGuestV3InternalServiceV2 iMultiGuestV3InternalServiceV2) {
        List<LinkUser> listLIZLLL;
        int size;
        long jLongValue;
        List<LinkUser> listLIZLLL2;
        Long l;
        if (C917810ZzX.LJIILIIL()) {
            Long lLJIIJ = C930540aK4.LJIIJ();
            if (lLJIIJ != null) {
                jLongValue = lLJIIJ.longValue();
            } else {
                jLongValue = 0;
            }
            InterfaceC954180awC interfaceC954180awCLLJLL = iMultiGuestV3InternalServiceV2.LLJLL();
            if (interfaceC954180awCLLJLL == null || (listLIZLLL2 = interfaceC954180awCLLJLL.LIZLLL()) == null) {
                return 0;
            }
            ArrayList arrayList = new ArrayList();
            for (LinkUser linkUser : listLIZLLL2) {
                LinkUser linkUser2 = linkUser;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("session linkedList: room id: ");
                sbLIZ.append(linkUser2.roomId);
                sbLIZ.append("  user id: ");
                sbLIZ.append(linkUser2.userId);
                sbLIZ.append(", user Type: ");
                sbLIZ.append(linkUser2.linkUserType);
                C20441214yg.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                if (linkUser2.linkUserType == 1 && (!LiveSdkFilterCurrentRoomGuestOptSetting.isEnable() || (jLongValue != 0 && (l = linkUser2.roomId) != null && jLongValue == l.longValue()))) {
                    arrayList.add(linkUser);
                }
            }
            return arrayList.size();
        }
        InterfaceC954180awC interfaceC954180awCLLJLL2 = iMultiGuestV3InternalServiceV2.LLJLL();
        if (interfaceC954180awCLLJLL2 == null || (listLIZLLL = interfaceC954180awCLLJLL2.LIZLLL()) == null || (size = listLIZLLL.size()) == 0) {
            return 0;
        }
        return size - 1;
    }

    public static final List<Long> LJIILJJIL(IMultiGuestV3InternalServiceV2 iMultiGuestV3InternalServiceV2) {
        Long lValueOf;
        List<LinkUser> listLIZLLL;
        List<LinkUser> listLIZLLL2;
        Long lLJIIJ = C930540aK4.LJIIJ();
        Room roomLJIIIZ = C930540aK4.LJIIIZ();
        if (roomLJIIIZ != null) {
            lValueOf = Long.valueOf(roomLJIIIZ.getOwnerUserId());
        } else {
            lValueOf = null;
        }
        if (C917810ZzX.LJIILIIL()) {
            InterfaceC954180awC interfaceC954180awCLLJLL = iMultiGuestV3InternalServiceV2.LLJLL();
            if (interfaceC954180awCLLJLL != null && (listLIZLLL2 = interfaceC954180awCLLJLL.LIZLLL()) != null) {
                ArrayList arrayList = new ArrayList();
                for (LinkUser linkUser : listLIZLLL2) {
                    LinkUser linkUser2 = linkUser;
                    if (linkUser2.linkUserType == 1 && Intrinsics.LJFF(linkUser2.roomId, lLJIIJ)) {
                        arrayList.add(linkUser);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    Long l = ((LinkUser) it2.next()).userId;
                    if (l != null) {
                        arrayList2.add(l);
                    }
                }
                return arrayList2;
            }
            return C13BV.INSTANCE;
        }
        InterfaceC954180awC interfaceC954180awCLLJLL2 = iMultiGuestV3InternalServiceV2.LLJLL();
        if (interfaceC954180awCLLJLL2 == null || (listLIZLLL = interfaceC954180awCLLJLL2.LIZLLL()) == null) {
            listLIZLLL = C13BV.INSTANCE;
        }
        if (listLIZLLL.isEmpty()) {
            return C13BV.INSTANCE;
        }
        ArrayList arrayList3 = new ArrayList();
        for (LinkUser linkUser3 : listLIZLLL) {
            LinkUser linkUser4 = linkUser3;
            if (Intrinsics.LJFF(linkUser4.roomId, lLJIIJ) && !Intrinsics.LJFF(linkUser4.userId, lValueOf)) {
                arrayList3.add(linkUser3);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            Long l2 = ((LinkUser) it3.next()).userId;
            if (l2 != null) {
                arrayList4.add(l2);
            }
        }
        return arrayList4;
    }

    public static final long LJIILL(IMultiGuestV3InternalServiceV2 iMultiGuestV3InternalServiceV2) {
        String strU3;
        Long lLJIILIIL;
        InterfaceC954180awC interfaceC954180awCLLJLL = iMultiGuestV3InternalServiceV2.LLJLL();
        if (interfaceC954180awCLLJLL != null && (strU3 = interfaceC954180awCLLJLL.U3()) != null && (lLJIILIIL = C2095008Iq.LJIILIIL(strU3)) != null) {
            return lLJIILIIL.longValue();
        }
        return 0L;
    }

    public static final String LJIILLIIL(IMultiGuestV3InternalServiceV2 iMultiGuestV3InternalServiceV2) {
        String strU3;
        InterfaceC954180awC interfaceC954180awCLLJLL = iMultiGuestV3InternalServiceV2.LLJLL();
        if (interfaceC954180awCLLJLL == null || (strU3 = interfaceC954180awCLLJLL.U3()) == null) {
            return "";
        }
        return strU3;
    }

    public static final int LJIIZILJ(IMultiGuestV3InternalServiceV2 iMultiGuestV3InternalServiceV2) {
        InterfaceC937900aVw interfaceC937900aVwLLIIJLIL;
        InterfaceC937820aVo interfaceC937820aVoLJJJJZ;
        List<InterfaceC937840aVq> allLayoutWindows;
        int size = 0;
        try {
            InterfaceC954180awC interfaceC954180awCLLJLL = iMultiGuestV3InternalServiceV2.LLJLL();
            if (interfaceC954180awCLLJLL != null && (interfaceC937900aVwLLIIJLIL = interfaceC954180awCLLJLL.LLIIJLIL()) != null && (interfaceC937820aVoLJJJJZ = interfaceC937900aVwLLIIJLIL.LJJJJZ()) != null && (allLayoutWindows = interfaceC937820aVoLJJJJZ.getAllLayoutWindows()) != null) {
                size = allLayoutWindows.size();
            }
            size--;
            return size;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return size;
        }
    }

    public static final boolean LJIJ(long j) {
        InterfaceC917640ZzG interfaceC917640ZzG;
        AbstractC928510aGn abstractC928510aGnLIZ;
        List listLJIL;
        InterfaceC917530Zz5 interfaceC917530Zz5;
        AbstractC928510aGn abstractC928510aGnLIZ2;
        List listLJIL2;
        InterfaceC302401Fe interfaceC302401Fe;
        AbstractC928510aGn abstractC928510aGnLIZ3;
        List listLJIL3;
        if (C930540aK4.LIZJ()) {
            Object objLJIIIZ = C948450amx.LIZIZ.LJIIIZ("MULTI_GUEST_V3_ANCHOR_USER_MANAGER");
            if ((objLJIIIZ instanceof InterfaceC302401Fe) && (interfaceC302401Fe = (InterfaceC302401Fe) objLJIIIZ) != null && (abstractC928510aGnLIZ3 = interfaceC302401Fe.LIZ()) != null && (listLJIL3 = abstractC928510aGnLIZ3.LJIL()) != null) {
                for (Object obj : listLJIL3) {
                    User user = ((LinkPlayerInfo) obj).mUser;
                    if (user != null && user.getId() == j) {
                        if (obj != null) {
                            return true;
                        }
                        return false;
                    }
                }
                return false;
            }
            return false;
        }
        C923330a8R c923330a8R = C923330a8R.LIZ;
        if (C923330a8R.LJI()) {
            Object objLJIIIZ2 = C948450amx.LIZIZ.LJIIIZ("MULTI_GUEST_V3_MODERATOR_USER_MANAGER");
            if ((objLJIIIZ2 instanceof InterfaceC917530Zz5) && (interfaceC917530Zz5 = (InterfaceC917530Zz5) objLJIIIZ2) != null && (abstractC928510aGnLIZ2 = interfaceC917530Zz5.LIZ()) != null && (listLJIL2 = abstractC928510aGnLIZ2.LJIL()) != null) {
                for (Object obj2 : listLJIL2) {
                    User user2 = ((LinkPlayerInfo) obj2).mUser;
                    if (user2 != null && user2.getId() == j) {
                        if (obj2 != null) {
                            return true;
                        }
                        return false;
                    }
                }
                return false;
            }
            return false;
        }
        Object objLJIIIZ3 = C948450amx.LIZIZ.LJIIIZ("MULTI_GUEST_V3_GUEST_USER_MANAGER");
        if ((objLJIIIZ3 instanceof InterfaceC917640ZzG) && (interfaceC917640ZzG = (InterfaceC917640ZzG) objLJIIIZ3) != null && (abstractC928510aGnLIZ = interfaceC917640ZzG.LIZ()) != null && (listLJIL = abstractC928510aGnLIZ.LJIL()) != null) {
            for (Object obj3 : listLJIL) {
                User user3 = ((LinkListUser) obj3).user;
                if (user3 != null && user3.getId() == j) {
                    if (obj3 != null) {
                        return true;
                    }
                    return false;
                }
            }
            return false;
        }
        return false;
    }

    public static final int LJIILIIL(IMultiGuestV3InternalServiceV2 iMultiGuestV3InternalServiceV2, long j) {
        int size;
        List<LinkUser> listLIZLLL;
        List<LinkUser> listLIZLLL2;
        List<LinkUser> listLIZLLL3;
        LinkUser linkUser = null;
        if (C917810ZzX.LJIILIIL()) {
            int iLJIIL = LJIIL(iMultiGuestV3InternalServiceV2);
            InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
            if (interfaceC954180awCLLJLL != null && (listLIZLLL3 = interfaceC954180awCLLJLL.LIZLLL()) != null) {
                Iterator<LinkUser> it2 = listLIZLLL3.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    LinkUser next = it2.next();
                    Long l = next.userId;
                    if (l != null && l.longValue() == j) {
                        if (next != null) {
                            return iLJIIL;
                        }
                    }
                }
            }
            return iLJIIL + 1;
        }
        InterfaceC954180awC interfaceC954180awCLLJLL2 = C915980Zwa.LJIIIIZZ().LLJLL();
        if (interfaceC954180awCLLJLL2 != null && (listLIZLLL2 = interfaceC954180awCLLJLL2.LIZLLL()) != null) {
            Iterator<LinkUser> it3 = listLIZLLL2.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                LinkUser next2 = it3.next();
                Long l2 = next2.userId;
                if (l2 != null && l2.longValue() == j) {
                    linkUser = next2;
                    break;
                }
            }
        }
        InterfaceC954180awC interfaceC954180awCLLJLL3 = C915980Zwa.LJIIIIZZ().LLJLL();
        if (interfaceC954180awCLLJLL3 != null && (listLIZLLL = interfaceC954180awCLLJLL3.LIZLLL()) != null) {
            size = listLIZLLL.size();
        } else {
            size = 1;
        }
        if (linkUser == null) {
            size++;
        }
        if (size == 0 || size == 1) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("linkedCnt invalid, value ");
            sbLIZ.append(size);
            C20441214yg.LJ("optLinkedGuestCountWithUid", C2188811AlT.LIZIZ(sbLIZ));
        }
        return size - 1;
    }
}
