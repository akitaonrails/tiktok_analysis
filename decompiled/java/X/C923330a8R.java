package X;

import android.view.SurfaceView;
import com.bytedance.android.live.liveinteract.api.IsViewerLimitedStatusChannel;
import com.bytedance.android.live.liveinteract.api.RequestSettingSuccessEvent;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ApplyGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ApplyMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CancelApplyGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CancelApplyMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CancelInviteGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CancelInviteMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CreateChannelMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CustomLinkMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.DestroyChannelMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.DirectJoinMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.GroupChangeMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.InteractAudioVolumeInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.InviteGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.InviteMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.JoinGroupDirectIMModel;
import com.bytedance.android.livesdk.comp.api.linkcore.model.JoinRoomDirectMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.KickOutMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LeaveGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LeaveMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkLayerRTCMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ListChangeMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.MicPositionContentInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.P2PGroupChangeMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.PermitApplyGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.PermitApplyMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ReplyInviteGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ReplyInviteMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.RtcStartResultMessage;
import com.bytedance.android.livesdk.dataChannel.AdminPermissionUpdateChannel;
import com.bytedance.android.livesdk.dataChannel.LoadUserAttrSuccess;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkMixModeModeratorOptSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS250S0000000_15;
import tikcast.linkmic.common.LinkerMediaChangeOperator;
import webcast.data.multi_guest_social_data.Avatar;

/* JADX INFO: renamed from: X.0a8R, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C923330a8R {
    public static DataChannel LIZIZ;
    public static volatile boolean LJ;
    public static volatile boolean LJFF;
    public static final C923330a8R LIZ = new C923330a8R();
    public static final CopyOnWriteArrayList<InterfaceC923350a8T> LIZJ = new CopyOnWriteArrayList<>();
    public static final CopyOnWriteArrayList<InterfaceC923360a8U> LIZLLL = new CopyOnWriteArrayList<>();
    public static C921880a66 LJI = new InterfaceC964770bDH() { // from class: X.0a66
        @Override // X.InterfaceC964770bDH
        public final void LIZ(long j, C1AZU c1azu) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJFF(C954780axA c954780axA) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJII(long j, C1AZU c1azu, C969700bLE c969700bLE) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJIIJ(String str, C1AZU c1azu, C2231141CUe c2231141CUe) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJIIJJI(String str, SurfaceView surfaceView) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJIIZILJ(String str, SurfaceView surfaceView) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJIJJLI(String str, boolean z) {
        }

        @Override // X.InterfaceC964770bDH
        @InterfaceC1294060jmO
        public final void LJJ(Map<String, String> map) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJJI(long j, C1AZU c1azu) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJJIFFI(int i, int i2, int i3) {
        }

        @Override // X.InterfaceC964770bDH
        @InterfaceC1294060jmO
        public final void LJJIIJ(List<LinkUser> list, List<LinkUser> list2) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJJIIZI(String str, String str2) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJJIJIIJIL(String str, boolean z) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJJIL(String str, boolean z) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJJIZ(String str, long j) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJJJ() {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJJJJ() {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJJJJJ(String str, float f, float f2) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJJJJJL(int i, C965030bDh c965030bDh) {
        }

        @Override // X.InterfaceC964770bDH
        @InterfaceC1294060jmO
        public final void LJJJJZ(List<LinkUser> list, List<LinkUser> list2) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJJJJZI(C954780axA c954780axA) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJJJLIIL(JoinGroupDirectIMModel joinGroupDirectIMModel) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJJJLL(C954780axA c954780axA) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJJJLZIJ(Map<String, MicPositionContentInfo> map) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJJJZ(int i, String str) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJJLIIIJ() {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJJLIIIJILLIZJL(Avatar avatar, String str) {
        }

        @Override // X.InterfaceC964770bDH
        @InterfaceC1294060jmO
        public final void LJJLIIIJJIZ(String str) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJJLIIIJLJLI() {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJJLIL() {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJJLJLI(C966020bFI c966020bFI, ListChangeMessage listChangeMessage) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJJZZI(C965210bDz c965210bDz) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJL(InterfaceC954180awC interfaceC954180awC, P2PGroupChangeMessage p2PGroupChangeMessage) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJLI(InterfaceC954180awC interfaceC954180awC, ReplyInviteGroupMessage replyInviteGroupMessage) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJLIIIL(InterfaceC954180awC interfaceC954180awC, InviteGroupMessage inviteGroupMessage) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJLILLLLZI(InterfaceC954180awC interfaceC954180awC, DestroyChannelMessage destroyChannelMessage, Integer num, Integer num2) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJLJI(InterfaceC954180awC interfaceC954180awC, C949400aoU c949400aoU) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJLJJI(InterfaceC954180awC interfaceC954180awC, boolean z, LinkCoreError linkCoreError) {
        }

        @Override // X.InterfaceC964770bDH
        public final InterfaceC965500bES LJLJJLL(InterfaceC954180awC interfaceC954180awC) {
            return null;
        }

        @Override // X.InterfaceC964770bDH
        public final void LJLJL(InterfaceC954180awC interfaceC954180awC, RtcStartResultMessage rtcStartResultMessage) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJLJLLL(int i, InterfaceC954180awC interfaceC954180awC) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJLL(InterfaceC954180awC interfaceC954180awC, PermitApplyGroupMessage permitApplyGroupMessage) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJLLILLLL(InterfaceC954180awC interfaceC954180awC) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJLLL(InterfaceC954180awC interfaceC954180awC) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJLLLL(InterfaceC954180awC interfaceC954180awC, String str) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJLLLLLL(InterfaceC954180awC interfaceC954180awC, ReplyInviteMessage replyInviteMessage) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJZI(InterfaceC954180awC interfaceC954180awC, JoinRoomDirectMessage joinRoomDirectMessage) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LL(InterfaceC954180awC interfaceC954180awC, LinkCoreError linkCoreError) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LLFZ(InterfaceC954180awC interfaceC954180awC, LeaveGroupMessage leaveGroupMessage) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LLIIII(InterfaceC954180awC interfaceC954180awC, GroupChangeMessage groupChangeMessage) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LLIIIILZ(InterfaceC954180awC interfaceC954180awC, String str) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LLIIIJ(InterfaceC954180awC interfaceC954180awC, ApplyMessage applyMessage) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LLIIIZ(InterfaceC954180awC interfaceC954180awC, int i) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LLIIL(InterfaceC954180awC interfaceC954180awC, DirectJoinMessage directJoinMessage) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LLIILZL() {
        }

        @Override // X.InterfaceC964770bDH
        public final void LLIL(List<LinkUser> list) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LLILLIZIL(InterfaceC954180awC interfaceC954180awC, CancelInviteGroupMessage cancelInviteGroupMessage) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LLILLJJLI(InterfaceC954180awC interfaceC954180awC, InviteMessage inviteMessage) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LLIZLLLIL(InterfaceC954180awC interfaceC954180awC, String str, String str2) {
        }

        @Override // X.InterfaceC964770bDH
        @InterfaceC1294060jmO
        public final void LLJI(String str, boolean z, boolean z2) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LLJIJIL(InterfaceC954180awC interfaceC954180awC, CancelApplyMessage cancelApplyMessage) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LLJJIJIIJIL(InterfaceC954180awC interfaceC954180awC, KickOutMessage kickOutMessage) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LLJJJJ(InterfaceC954180awC interfaceC954180awC, CreateChannelMessage createChannelMessage) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LLJJL(InterfaceC954180awC interfaceC954180awC, InviteMessage inviteMessage) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LLJLLIL(InterfaceC954180awC interfaceC954180awC, int i, InterfaceC958070b2T interfaceC958070b2T, String str, CustomLinkMessage customLinkMessage) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LLJZ(InterfaceC954180awC interfaceC954180awC, int i, int i2) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LLL(InterfaceC954180awC interfaceC954180awC, int i, C967130bH5 c967130bH5, String str, CustomLinkMessage customLinkMessage) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LLLFFI(InterfaceC954180awC interfaceC954180awC, int i, InterfaceC958070b2T interfaceC958070b2T, String str, CustomLinkMessage customLinkMessage) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LLLII(InterfaceC954180awC interfaceC954180awC, LinkUser linkUser, CustomLinkMessage customLinkMessage) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LLLIIII(long j, InterfaceC954180awC interfaceC954180awC) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LLLIIL(InterfaceC954180awC interfaceC954180awC, String str, String str2) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LLLIILIL(InterfaceC954180awC interfaceC954180awC, CancelApplyGroupMessage cancelApplyGroupMessage) {
        }

        @Override // X.InterfaceC964770bDH
        @InterfaceC1294060jmO
        public final void LLLIL(LinkLayerRTCMessage linkLayerRTCMessage) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LLLILZJ(InterfaceC954180awC interfaceC954180awC) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LLLL(InterfaceC954180awC interfaceC954180awC, PermitApplyMessage permitApplyMessage) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LLLLLIL(InterfaceC954180awC interfaceC954180awC, CancelInviteMessage cancelInviteMessage) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LLLLLLIL(InterfaceC954180awC interfaceC954180awC, LeaveMessage leaveMessage) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LLLLLLJ(InterfaceC954180awC interfaceC954180awC, PermitApplyMessage permitApplyMessage) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LLLLLLL(InterfaceC954180awC interfaceC954180awC, ReplyInviteMessage replyInviteMessage) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LLLLLLLLL(List<InteractAudioVolumeInfo> list) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LLLLLLZZ(InterfaceC954180awC interfaceC954180awC, ApplyGroupMessage applyGroupMessage) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LLLLLZ(String str) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJJLL(int i, int i2) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onLinkerModeChanged, oldLinkerMode=");
            sbLIZ.append(i);
            sbLIZ.append(" newLinkerMode=");
            sbLIZ.append(i2);
            C20441214yg.LIZIZ("MultiGuestAsGuestModeratorHelper", C2188811AlT.LIZIZ(sbLIZ));
            if (i2 != 0 && i2 != 1) {
                return;
            }
            C1143300frE.LJIIJJI().getClass();
            AbstractC1143290frD.LJI("MultiGuestAsGuestModeratorHelper", "receive LinkerModeChangeChannel");
            C923330a8R c923330a8R = C923330a8R.LIZ;
            C923330a8R.LIZIZ();
        }
    };

    /* JADX WARN: Removed duplicated region for block: B:45:0x00e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int LJ() {
        /*
            Method dump skipped, instruction units count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C923330a8R.LJ():int");
    }

    public static void LIZIZ() {
        boolean zLJFF = LJFF();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("checkAbilityUpdateAndCallback, hasModeratorAbility=");
        sbLIZ.append(zLJFF);
        sbLIZ.append(" lastCheckHasModeratorAbility=");
        sbLIZ.append(LJ);
        sbLIZ.append(" lastCheckHasModeratorAbilityV3=");
        sbLIZ.append(LJFF);
        sbLIZ.append(" abilityChangeListenerList.size=");
        CopyOnWriteArrayList<InterfaceC923350a8T> copyOnWriteArrayList = LIZJ;
        sbLIZ.append(copyOnWriteArrayList.size());
        sbLIZ.append(" abilityV3ChangeListenerList.size=");
        sbLIZ.append(LIZLLL.size());
        C20441214yg.LIZIZ("MultiGuestAsGuestModeratorHelper", C2188811AlT.LIZIZ(sbLIZ));
        if (LJ != zLJFF) {
            LJ = zLJFF;
            for (InterfaceC923350a8T interfaceC923350a8T : copyOnWriteArrayList) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("checkAbilityUpdateAndCallback, hasModeratorAbility=");
                sbLIZ2.append(zLJFF);
                C20441214yg.LIZIZ("MultiGuestAsGuestModeratorHelper", C2188811AlT.LIZIZ(sbLIZ2));
                interfaceC923350a8T.LIZ(zLJFF);
            }
        }
        boolean zLJI = LJI();
        if (LJFF != zLJI) {
            LJFF = zLJI;
            for (InterfaceC923360a8U interfaceC923360a8U : LIZLLL) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("checkAbilityUpdateAndCallbackV3, hasModeratorAbility=");
                sbLIZ3.append(zLJFF);
                C20441214yg.LIZIZ("MultiGuestAsGuestModeratorHelper", C2188811AlT.LIZIZ(sbLIZ3));
                interfaceC923360a8U.LIZ(zLJI);
            }
        }
    }

    public static String LIZLLL() {
        return LJFF() ? "1" : CardStruct.IStatusCode.DEFAULT;
    }

    public static boolean LJFF() {
        return LJ() != 0;
    }

    public static boolean LJI() {
        return C930540aK4.LJJIIZI() && (LJ() >> 16) != 0;
    }

    public static boolean LJII() {
        return C930540aK4.LJJIIZI() && (LJ() >> 16) == 2;
    }

    public static boolean LJIIIIZZ() {
        int iLJ = LJ() >> 16;
        if (C930540aK4.LJJIIZI()) {
            return iLJ == 1 || iLJ == 2;
        }
        return false;
    }

    public static boolean LJIIIZ() {
        return (LJ() & 65535) == 2;
    }

    public final void LIZJ() {
        C1143300frE.LJIIJJI().getClass();
        AbstractC1143290frD.LJI("MultiGuestAsGuestModeratorHelper", "clear");
        LIZJ.clear();
        DataChannel dataChannel = LIZIZ;
        if (dataChannel != null) {
            dataChannel.zQ2(this);
        }
        LIZIZ = null;
        LJ = false;
        LJFF = false;
        C921880a66 c921880a66 = LJI;
        if (c921880a66 != null) {
            C915980Zwa.LJIIIIZZ().a9(c921880a66);
        }
        LJI = null;
    }

    public static void LIZ(InterfaceC923350a8T interfaceC923350a8T) {
        if (interfaceC923350a8T != null) {
            LIZJ.add(interfaceC923350a8T);
        }
    }

    public static void LJIIL(Function0 function0) {
        C915980Zwa.LJIIIIZZ();
        if (!C921180a4y.LJII()) {
            function0.invoke();
        }
    }

    public static void LJIILIIL(String str) {
        C20441214yg.LIZIZ("moderator_guest", str);
    }

    public static void LJIILJJIL(InterfaceC923350a8T interfaceC923350a8T) {
        if (interfaceC923350a8T != null) {
            LIZJ.remove(interfaceC923350a8T);
        }
    }

    public final void LJIIJ(DataChannel dataChannel) {
        C921880a66 c921880a66;
        C1143300frE.LJIIJJI().getClass();
        AbstractC1143290frD.LJI("MultiGuestAsGuestModeratorHelper", "init");
        LIZIZ = dataChannel;
        LJ = LJFF();
        LJFF = LJI();
        if (dataChannel != null) {
            dataChannel.CQ2(AdminPermissionUpdateChannel.class, this, AFwS250S0000000_15.get$arr$(207));
            dataChannel.CQ2(RequestSettingSuccessEvent.class, this, AFwS250S0000000_15.get$arr$(208));
            dataChannel.CQ2(LoadUserAttrSuccess.class, this, AFwS250S0000000_15.get$arr$(209));
            dataChannel.CQ2(IsViewerLimitedStatusChannel.class, this, AFwS250S0000000_15.get$arr$(210));
        }
        if (LiveSdkMixModeModeratorOptSetting.isEnable() && (c921880a66 = LJI) != null) {
            C915980Zwa.LJIIIIZZ().Fe(c921880a66);
        }
    }

    public static void LJIIJJI(LinkerMediaChangeOperator linkerMediaChangeOperator, Function1 function1) {
        if (linkerMediaChangeOperator != null && linkerMediaChangeOperator.operatorType == 1) {
            function1.invoke(linkerMediaChangeOperator.displayId);
        }
    }
}
