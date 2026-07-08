package X;

import android.view.SurfaceView;
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
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkMicState;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ListChangeMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.MicPositionContentInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.P2PGroupChangeMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.PermitApplyGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.PermitApplyMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ReplyInviteGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ReplyInviteMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.RtcStartResultMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.livesdkapi.session.EnterRoomLinkSession;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import webcast.data.multi_guest_social_data.Avatar;

/* JADX INFO: renamed from: X.0bE0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C965220bE0 implements InterfaceC964770bDH {
    public static final Pair<String, Integer> LLIZ = new Pair<>("", 0);
    public final InterfaceC965240bE2 LL;
    public int LLILLJJLI;
    public C11JF LLILLL;
    public long LLILZ;
    public Pair<String, Integer> LLILZIL;
    public C945320ahu LLILZLL;

    public C965220bE0() {
        this(null);
    }

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
    public final void LJJLL(int i, int i2) {
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

    public final void LIZIZ() {
        C11JF c11jf;
        C20441214yg.LIZIZ("layout_identify", "clearIdentifyCountDown");
        C11JF c11jf2 = this.LLILLL;
        if (c11jf2 != null && !c11jf2.isDisposed() && (c11jf = this.LLILLL) != null) {
            c11jf.dispose();
        }
        this.LLILLL = null;
    }

    public final boolean LIZJ() {
        boolean zIsIdleOrInitOrWaiting;
        InterfaceC965240bE2 interfaceC965240bE2 = this.LL;
        if (interfaceC965240bE2 == null) {
            return false;
        }
        if (interfaceC965240bE2.LJIILIIL()) {
            EnumC969200bKQ enumC969200bKQ = this.LL.LJJIIJ().LIZ;
            zIsIdleOrInitOrWaiting = enumC969200bKQ == EnumC969200bKQ.Idle || enumC969200bKQ == EnumC969200bKQ.Wait;
        } else {
            zIsIdleOrInitOrWaiting = LinkMicState.Companion.isIdleOrInitOrWaiting(this.LL.LLJLLIL());
        }
        return !this.LL.LJJIIZI() && zIsIdleOrInitOrWaiting;
    }

    public C965220bE0(InterfaceC965240bE2 interfaceC965240bE2) {
        this.LL = interfaceC965240bE2;
        this.LLILZIL = LLIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(java.util.List<? extends java.lang.Object> r11) {
        /*
            Method dump skipped, instruction units count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C965220bE0.LIZLLL(java.util.List):void");
    }

    @Override // X.InterfaceC964770bDH
    public final void LJJLJLI(C966020bFI c966020bFI, ListChangeMessage listChangeMessage) {
        LIZLLL(listChangeMessage.listContent);
    }

    @Override // X.InterfaceC964770bDH
    public final void LLIIII(InterfaceC954180awC interfaceC954180awC, GroupChangeMessage groupChangeMessage) {
        InterfaceC965240bE2 interfaceC965240bE2 = this.LL;
        if (interfaceC965240bE2 != null && interfaceC965240bE2.LJJII()) {
            LIZLLL(interfaceC954180awC.LLJJ().LJJJJJL());
        }
    }

    public final void LJ(int i, String str, boolean z) {
        String strBuildPullUrl;
        EnterRoomConfig enterRoomConfig;
        int i2;
        String str2;
        EnterRoomConfig.LogData logData;
        EnterRoomLinkSession enterRoomLinkSessionLIZ;
        EnterRoomConfig.RoomsData roomsData;
        Room roomLIZ;
        if (!LIZJ()) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("reportIdentifyResult success:");
        sbLIZ.append(z);
        sbLIZ.append(" delay:");
        sbLIZ.append(i);
        sbLIZ.append(" failReason:");
        sbLIZ.append(str);
        C20441214yg.LIZIZ("layout_identify", C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC965240bE2 interfaceC965240bE2 = this.LL;
        if (interfaceC965240bE2 != null) {
            C965270bE5 c965270bE5LJJIIZ = interfaceC965240bE2.LJJIIZ();
            InterfaceC965240bE2 interfaceC965240bE22 = this.LL;
            String str3 = null;
            if (interfaceC965240bE22 != null && (roomLIZ = interfaceC965240bE22.LIZ()) != null) {
                strBuildPullUrl = roomLIZ.buildPullUrl();
            } else {
                strBuildPullUrl = null;
            }
            String str4 = "";
            if (strBuildPullUrl == null) {
                strBuildPullUrl = "";
            }
            C0INV c0inv = C0IL2.LIZ;
            if (c0inv != null && (enterRoomLinkSessionLIZ = c0inv.LIZ()) != null) {
                enterRoomConfig = enterRoomLinkSessionLIZ.mEnterRoomConfig;
                if (enterRoomConfig != null && (roomsData = enterRoomConfig.mRoomsData) != null) {
                    str3 = roomsData.actionType;
                }
            } else {
                enterRoomConfig = null;
            }
            if (C2093608Ic.LJ(str3)) {
                if (enterRoomConfig != null && (logData = enterRoomConfig.mLogData) != null && logData.loadDuration > 0) {
                    str3 = "draw";
                } else {
                    str3 = "click";
                }
            } else if (str3 == null) {
                str3 = "";
            }
            String first = this.LLILZIL.getFirst();
            Room roomLIZ2 = this.LL.LIZ();
            if (roomLIZ2 != null) {
                i2 = roomLIZ2.liveRoomMode;
            } else {
                i2 = 0;
            }
            C945320ahu c945320ahu = this.LLILZLL;
            if (c945320ahu != null && (str2 = c945320ahu.LIZIZ) != null) {
                str4 = str2;
            }
            c965270bE5LJJIIZ.LIZIZ(interfaceC965240bE22, z, i, strBuildPullUrl, str3, first, str, i2, str4);
            Pair<String, Integer> pair = LLIZ;
            this.LLILZIL = pair;
            if (this.LLILLL != null) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("update currentProcess's value:");
                sbLIZ2.append(pair);
                C20441214yg.LIZIZ("layout_identify", C2188811AlT.LIZIZ(sbLIZ2));
            }
        }
    }
}
