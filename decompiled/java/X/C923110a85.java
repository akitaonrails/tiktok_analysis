package X;

import android.view.SurfaceView;
import android.view.ViewGroup;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.layout.component.render.MultiGuestLayoutRenderV2;
import com.bytedance.android.live.liveinteract.platform.statemanager.iablility.ILinkStateAbility;
import com.bytedance.android.live.liveinteract.voicechat.main.common.BackgroundSetEvent;
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
import com.bytedance.android.livesdk.dataChannel.MultiLiveLayoutTriggerEvent;
import com.bytedance.android.livesdk.dataChannel.VoiceChatLayoutFinishEvent;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicSupportNewLayoutInFeedSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkmicVoiceChatLayoutSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.VoiceChatGuestNetworkSyncFixSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AwS559S0100000_15;
import webcast.data.multi_guest_social_data.Avatar;

/* JADX INFO: renamed from: X.0a85, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C923110a85 extends AbstractC939360aYI {
    public final ViewGroup LLILZ;
    public final ViewGroup LLILZIL;
    public final DataChannel LLILZLL;
    public final InterfaceC923120a86 LLIZ;
    public volatile boolean LLIZLLLIL;
    public AwS559S0100000_15 LLJ;
    public InterfaceC940060aZQ LLJI;
    public final C923100a84 LLJIJIL = new InterfaceC964770bDH() { // from class: X.0a84
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
        public final void LLLLLLZZ(InterfaceC954180awC interfaceC954180awC, ApplyGroupMessage applyGroupMessage) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LLLLLZ(String str) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LLLLLLLLL(List<InteractAudioVolumeInfo> list) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<InteractAudioVolumeInfo> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().linkMicId);
            }
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<InteractAudioVolumeInfo> it3 = list.iterator();
            while (it3.hasNext()) {
                arrayList2.add(Boolean.valueOf(it3.next().isTalk()));
            }
            ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<InteractAudioVolumeInfo> it4 = list.iterator();
            while (it4.hasNext()) {
                arrayList3.add(Integer.valueOf(it4.next().volume));
            }
            if (!arrayList.isEmpty() && !arrayList2.isEmpty() && !arrayList3.isEmpty()) {
                int i = 0;
                if (LinkmicVoiceChatLayoutSetting.INSTANCE.getValue().useVoiceWaveLayer) {
                    int size = arrayList.size();
                    while (i < size) {
                        Object obj = ListProtector.get(arrayList, i);
                        MultiGuestDataHolder multiGuestDataHolderLIZJ = C916490ZxP.LIZJ();
                        if (multiGuestDataHolderLIZJ != null) {
                            ((ConcurrentHashMap) multiGuestDataHolderLIZJ.LJJIIJZLJL).put(obj, Integer.valueOf(((Number) ListProtector.get(arrayList3, i)).intValue()));
                        }
                        i++;
                    }
                    AwS559S0100000_15 awS559S0100000_15 = this.LL.LLJ;
                    if (awS559S0100000_15 != null) {
                        awS559S0100000_15.invoke();
                        return;
                    }
                    return;
                }
                int size2 = arrayList.size();
                while (i < size2) {
                    String str = (String) ListProtector.get(arrayList, i);
                    InterfaceC922070a6P interfaceC922070a6P = (InterfaceC922070a6P) C933980aPc.LJII(this.LL.LLILZLL, InterfaceC922070a6P.class);
                    if (interfaceC922070a6P != null) {
                        interfaceC922070a6P.LJJIJIIJI(((Number) ListProtector.get(arrayList3, i)).intValue(), str);
                    }
                    i++;
                }
            }
        }

        @Override // X.InterfaceC964770bDH
        public final void LLJZ(InterfaceC954180awC interfaceC954180awC, int i, int i2) {
            ILinkStateAbility iLinkStateAbilityLIZJ = C926770aDz.LIZJ(this.LL.LLILZ);
            if (iLinkStateAbilityLIZJ != null) {
                if (VoiceChatGuestNetworkSyncFixSetting.INSTANCE.enable()) {
                    iLinkStateAbilityLIZJ.NV0(i);
                } else {
                    if (System.currentTimeMillis() % ((long) 10) <= 4) {
                        return;
                    }
                    iLinkStateAbilityLIZJ.NV0(i);
                }
            }
        }
    };

    @Override // X.AbstractC939360aYI, X.InterfaceC942030acb
    public final void onDetach() {
        super.onDetach();
        if (LinkMicSupportNewLayoutInFeedSetting.INSTANCE.getValue()) {
            this.LLJI = null;
        }
        C915980Zwa.LJIIIIZZ().a9(this.LLJIJIL);
    }

    @Override // X.AbstractC939360aYI, X.InterfaceC942030acb
    public final void LJIJ(InterfaceC940060aZQ interfaceC940060aZQ) {
        super.LJIJ(interfaceC940060aZQ);
        if (LinkMicSupportNewLayoutInFeedSetting.INSTANCE.getValue()) {
            this.LLJI = interfaceC940060aZQ;
        }
        C915980Zwa.LJIIIIZZ().Fe(this.LLJIJIL);
    }

    @Override // X.AbstractC939360aYI, X.InterfaceC942030acb
    public final void LJIL(C942080acg c942080acg) {
        InterfaceC922070a6P interfaceC922070a6P;
        List<LinkUser> listLIZLLL;
        Object objLJJJLL;
        if (!this.LLIZLLLIL) {
            this.LLIZLLLIL = true;
            this.LLILZLL.FQ2(BackgroundSetEvent.class);
            List list = (List) this.LLILZLL.gg0(MultiGuestLayoutRenderV2.RoleChannel.class);
            if (list != null) {
                objLJJJLL = C13LP.LJJJLL(list);
            } else {
                objLJJJLL = null;
            }
            if (objLJJJLL != EnumC934000aPe.ANCHOR) {
                this.LLILZLL.FQ2(VoiceChatLayoutFinishEvent.class);
                this.LLILZLL.FQ2(MultiLiveLayoutTriggerEvent.class);
            }
        }
        this.LLIZ.LIZIZ();
        C933980aPc.LIZ(C937830aVp.LIZIZ(EnumC939900aZA.VOICE_HOST, this.LLJI), this.LLJI);
        this.LLIZ.LIZIZ();
        List<AbstractC939840aZ4> listLIZIZ = C937830aVp.LIZIZ(EnumC939900aZA.VOICE_GUEST, this.LLJI);
        C933980aPc.LIZ(listLIZIZ, this.LLJI);
        DataChannel dataChannel = this.LLILZLL;
        if (System.currentTimeMillis() % ((long) 10) > 8) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
            if (interfaceC954180awCLLJLL != null && (listLIZLLL = interfaceC954180awCLLJLL.LIZLLL()) != null) {
                Iterator<LinkUser> it2 = listLIZLLL.iterator();
                while (it2.hasNext()) {
                    String str = it2.next().linkMicId;
                    if (C500260Jjc.LJJIIZI(str)) {
                        linkedHashSet.add(str);
                    }
                }
            }
            Iterator it3 = ((ArrayList) listLIZIZ).iterator();
            while (it3.hasNext()) {
                String linkMicId = ((AbstractC939840aZ4) it3.next()).getWindow().getLinkMicId();
                if (linkMicId != null) {
                    linkedHashSet.add(linkMicId);
                }
            }
            if ((!linkedHashSet.isEmpty()) && dataChannel != null && (interfaceC922070a6P = (InterfaceC922070a6P) C933980aPc.LJII(dataChannel, InterfaceC922070a6P.class)) != null) {
                interfaceC922070a6P.LJJJ(linkedHashSet);
            }
        }
    }

    @Override // X.AbstractC939360aYI, X.InterfaceC942030acb
    public final void LJII(String str, boolean z) {
        int i;
        InterfaceC922070a6P interfaceC922070a6P = (InterfaceC922070a6P) C933980aPc.LJII(this.LLILZLL, InterfaceC922070a6P.class);
        if (interfaceC922070a6P != null) {
            if (z) {
                i = 2;
            } else {
                i = 1;
            }
            interfaceC922070a6P.LJJII(i, str);
        }
    }

    @Override // X.AbstractC939360aYI, X.InterfaceC942030acb
    public final void LJIJJ(String str, EnumC942070acf enumC942070acf) {
        InterfaceC922070a6P interfaceC922070a6P = (InterfaceC922070a6P) C933980aPc.LJII(this.LLILZLL, InterfaceC922070a6P.class);
        if (interfaceC922070a6P != null) {
            interfaceC922070a6P.LJIILL(enumC942070acf.ordinal(), str);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0a84] */
    public C923110a85(ViewGroup viewGroup, ViewGroup viewGroup2, InterfaceC923120a86 interfaceC923120a86, DataChannel dataChannel) {
        this.LLILZ = viewGroup;
        this.LLILZIL = viewGroup2;
        this.LLILZLL = dataChannel;
        this.LLIZ = interfaceC923120a86;
    }
}
