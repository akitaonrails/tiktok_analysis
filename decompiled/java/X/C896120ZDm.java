package X;

import Y.ACListenerS117S0200000_14;
import android.content.Context;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.chatroom.api.model.EnterChatParams;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.lightinteract.api.platform.service.ILightInteractionPlatformService;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.nudge.IMNudgeAndStreakService;
import com.ss.android.ugc.aweme.profile.model.User;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS558S0100000_14;

/* JADX INFO: renamed from: X.0ZDm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C896120ZDm implements InterfaceC1907310zjV, InterfaceC896180ZDs {
    public C0IBP LIZ;
    public C896130ZDn LIZIZ;
    public Function0<Unit> LIZJ;
    public final WeakReference<InterfaceC896180ZDs> LIZLLL = new WeakReference<>(this);
    public final Set<C0IB7> LJ = C13LQ.LJLIIL(new C0IB7[]{C0IB7.LIKE, C0IB7.FAVOURITE, C0IB7.REPOST});
    public final C01GW LJFF = C452501pT.LIZIZ(new AwS558S0100000_14(this, 5));

    public static ILightInteractionPlatformService LJIIIZ() {
        return (ILightInteractionPlatformService) PluggableExtentionKt.pluggableSpiForReal(ILightInteractionPlatformService.class);
    }

    @Override // X.InterfaceC1907310zjV
    public final void LIZIZ() {
        C896130ZDn c896130ZDn = this.LIZIZ;
        if (c896130ZDn != null) {
            LJIIJ(this.LIZ, c896130ZDn, EnumC896240ZDy.SHOW);
        }
    }

    @Override // X.InterfaceC1907310zjV
    public final boolean LIZLLL() {
        return ((Number) C270060AiC.LIZ.getValue()).intValue() == 1;
    }

    public static void LJII(C896130ZDn c896130ZDn) {
        C2201941BFw c2201941BFw = IMUser.Companion;
        User user = c896130ZDn.LIZLLL;
        c2201941BFw.getClass();
        EnterChatParams enterChatParams = new EnterChatParams(c896130ZDn.LIZ, C2201941BFw.LIZJ(user));
        enterChatParams.setEnterFromForMob(EnumC1908380zlE.ACTIVITY_NOTIFICATION_PAGE.getValue());
        enterChatParams.setEnterMethodForMob(c896130ZDn.LJFF);
        enterChatParams.setForceRefresh(true);
        enterChatParams.setQuickChat(true);
        C1336205Ku.LIZ(false).getImChatService().LJIILLIIL(enterChatParams, null);
    }

    public static String LJIIIIZZ(C0IB7 c0ib7) {
        int i = C0IBO.LIZ[c0ib7.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    ILightInteractionPlatformService iLightInteractionPlatformServiceLJIIIZ = LJIIIZ();
                    if (iLightInteractionPlatformServiceLJIIIZ != null && iLightInteractionPlatformServiceLJIIIZ.LJJLIIIJJIZ()) {
                        return "say_hi_repost_v1";
                    }
                    return "v1_basic_nudge_src";
                }
                return null;
            }
            ILightInteractionPlatformService iLightInteractionPlatformServiceLJIIIZ2 = LJIIIZ();
            if (iLightInteractionPlatformServiceLJIIIZ2 != null && iLightInteractionPlatformServiceLJIIIZ2.LJJLIIIIJ()) {
                return "heart_favourite_v1";
            }
            return null;
        }
        ILightInteractionPlatformService iLightInteractionPlatformServiceLJIIIZ3 = LJIIIZ();
        if (iLightInteractionPlatformServiceLJIIIZ3 != null && iLightInteractionPlatformServiceLJIIIZ3.LJJLIIIIJ()) {
            return "heart_like_v1";
        }
        return null;
    }

    @Override // X.InterfaceC1907310zjV
    public final boolean LIZ(C896130ZDn c896130ZDn) {
        if (c896130ZDn.LJI) {
            return true;
        }
        if (C1336205Ku.LIZ(false).getLightInteractService().LIZIZ(c896130ZDn.LIZLLL.getUid()) && c896130ZDn.LIZLLL.getFollowStatus() == C0SY7.FOLLOW_MUTUAL.getValue() && !C1336205Ku.LIZJ().LIZJ()) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC1907310zjV
    public final C0IBP LIZJ(Context context) {
        C0IBP c0ibp = this.LIZ;
        if (c0ibp == null) {
            C0IBP c0ibp2 = new C0IBP(context);
            this.LIZ = c0ibp2;
            return c0ibp2;
        }
        return c0ibp;
    }

    @Override // X.InterfaceC896180ZDs
    public final void LJ(boolean z) {
        int i;
        if (z) {
            i = 2;
        } else {
            i = 1;
        }
        C0IBP c0ibp = this.LIZ;
        if (c0ibp != null) {
            c0ibp.LIZIZ(i, false);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0045, code lost:
    
        if (r0.commentToDmSetting == 1) goto L16;
     */
    @Override // X.InterfaceC1907310zjV
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJFF(X.C896130ZDn r13, X.C1907290zjT r14) {
        /*
            Method dump skipped, instruction units count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C896120ZDm.LJFF(X.0ZDn, X.0zjT):boolean");
    }

    public final void LJI(C896130ZDn c896130ZDn, C1907290zjT c1907290zjT) {
        String str;
        IMNudgeAndStreakService.LJFF.getClass();
        C01GW c01gw = IMNudgeAndStreakService.LJII;
        C896140ZDo c896140ZDo = (C896140ZDo) c01gw.getValue();
        C896130ZDn c896130ZDn2 = this.LIZIZ;
        if (c896130ZDn2 != null && (str = c896130ZDn2.LIZIZ) != null) {
            WeakReference<InterfaceC896180ZDs> weakReference = this.LIZLLL;
            List<WeakReference<InterfaceC896180ZDs>> list = c896140ZDo.LIZIZ.get(str);
            if (list != null) {
                list.remove(weakReference);
                if (list.isEmpty()) {
                    c896140ZDo.LIZIZ.remove(str);
                }
            }
        }
        String str2 = c896130ZDn.LIZIZ;
        WeakReference<InterfaceC896180ZDs> weakReference2 = this.LIZLLL;
        List<WeakReference<InterfaceC896180ZDs>> list2 = c896140ZDo.LIZIZ.get(str2);
        if (list2 != null) {
            list2.add(weakReference2);
        } else {
            c896140ZDo.LIZIZ.put(str2, C1697810uHb.LJIILJJIL(weakReference2));
        }
        this.LIZIZ = c896130ZDn;
        this.LIZJ = c1907290zjT;
        Context context = c896130ZDn.LIZ;
        C0IBP c0ibp = this.LIZ;
        if (c0ibp == null) {
            c0ibp = new C0IBP(context);
            this.LIZ = c0ibp;
        }
        c0ibp.LIZ(c896130ZDn.LJ.LIZLLL, new C896110ZDl(this));
        LJ(((C896140ZDo) c01gw.getValue()).LIZ.contains(c896130ZDn.LIZIZ));
    }

    public static void LJIIJ(C0IBP c0ibp, C896130ZDn c896130ZDn, EnumC896240ZDy enumC896240ZDy) {
        String strLJII;
        InterfaceC1357410lQZ interfaceC1357410lQZLJIIZILJ;
        InterfaceC892560Yzu interfaceC892560YzuLIZJ;
        if (c0ibp != null && c0ibp.getCurrStyle() == 1) {
            ILightInteractionPlatformService iLightInteractionPlatformServiceLJIIIZ = LJIIIZ();
            if (iLightInteractionPlatformServiceLJIIIZ != null) {
                String strLJIIIIZZ = LJIIIIZZ(c896130ZDn.LJ.LIZLLL);
                if (strLJIIIIZZ == null) {
                    strLJIIIIZZ = "";
                }
                strLJII = iLightInteractionPlatformServiceLJIIIZ.LJII(strLJIIIIZZ);
            } else {
                strLJII = null;
            }
            if (enumC896240ZDy == EnumC896240ZDy.CLICK) {
                ILightInteractionPlatformService iLightInteractionPlatformServiceLJIIIZ2 = LJIIIZ();
                if (iLightInteractionPlatformServiceLJIIIZ2 != null && (interfaceC892560YzuLIZJ = iLightInteractionPlatformServiceLJIIIZ2.LIZJ()) != null) {
                    String value = EnumC1908380zlE.INBOX.getValue();
                    String value2 = EnumC1908370zlD.ACTIVITY_PAGE.getValue();
                    if (strLJII == null || strLJII.length() == 0) {
                        strLJII = "nudge";
                    }
                    interfaceC892560YzuLIZJ.LJ(value, value2, null, null, null, strLJII);
                    return;
                }
                return;
            }
            ILightInteractionPlatformService iLightInteractionPlatformServiceLJIIIZ3 = LJIIIZ();
            if (iLightInteractionPlatformServiceLJIIIZ3 != null && (interfaceC1357410lQZLJIIZILJ = iLightInteractionPlatformServiceLJIIIZ3.LJIIZILJ("tag_activity_aggregated_page")) != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(c896130ZDn.LIZIZ);
                sbLIZ.append(strLJII);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                String value3 = EnumC1908380zlE.INBOX.getValue();
                String value4 = EnumC1908370zlD.ACTIVITY_PAGE.getValue();
                if (strLJII == null || strLJII.length() == 0) {
                    strLJII = "nudge";
                }
                interfaceC1357410lQZLJIIZILJ.LIZIZ(strLIZIZ, value3, value4, null, null, null, strLJII);
            }
        }
    }

    public final void LJIIJJI(C896130ZDn c896130ZDn, String str, C0ZDA c0zda) {
        C0IBP c0ibp;
        LJIIJ(this.LIZ, c896130ZDn, EnumC896240ZDy.CLICK);
        C0ZDM c0zdm = new C0ZDM(str, new ACListenerS117S0200000_14(this, c896130ZDn, 1));
        IMNudgeAndStreakService iMNudgeAndStreakService = IMNudgeAndStreakService.LJFF;
        if (iMNudgeAndStreakService.LJJJJ(c896130ZDn.LJ, c896130ZDn.LIZLLL.getUid(), c0zda, c0zdm, c896130ZDn.LIZIZ) && (c0ibp = this.LIZ) != null) {
            iMNudgeAndStreakService.LJJIJIIJI(c0ibp);
        }
    }
}
