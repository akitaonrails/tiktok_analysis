package X;

import android.content.Context;
import android.view.SurfaceView;
import com.bytedance.android.live.liveinteract.InteractServiceDel;
import com.bytedance.android.livesdk.chatroom.model.interact.CohostABInfo;
import com.bytedance.android.livesdk.chatroom.model.interact.GamePlayContent;
import com.bytedance.android.livesdk.chatroom.model.interact.VirtualWaitingUser;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BusinessContent;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ApplyGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ApplyMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.BizContentWrapper;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CancelApplyGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CancelApplyMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CancelInviteGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CancelInviteMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CreateChannelMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CustomLinkMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.DestroyChannelMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.DestroyChannelResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.DirectJoinMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.GroupChangeMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.InteractAudioVolumeInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.InviteGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.InviteMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.JoinGroupDirectIMModel;
import com.bytedance.android.livesdk.comp.api.linkcore.model.JoinRoomDirectMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.KickOutMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.Layout;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LayoutDSLConfig;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LeaveGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LeaveMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkLayerRTCMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkMicState;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ListChangeMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LiveStreamMixer;
import com.bytedance.android.livesdk.comp.api.linkcore.model.MicPositionContentInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.MicPositionInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.MixInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.OnLineMicInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.PermitApplyGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.PermitApplyMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.RTCClientData;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ReplyInviteGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ReplyInviteMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.RtcStartResultMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.RtcUserInfo;
import com.bytedance.android.livesdk.livesetting.broadcast.M2LEnablePreGetConfig;
import com.bytedance.android.livesdk.livesetting.broadcast.M2LPreGetConfigUseCache;
import com.bytedance.android.livesdk.livesetting.broadcast.TTLHSplitModuleRtcAppID;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestSdkRtcInitErrorLinkOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LinkMicRTCErrorOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LinkMicSdkCoHostUpdateLayoutTimeOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveCoHostLayoutIdConfigSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LiveAbLabelSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestV3LayoutTechSetting;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import tikcast.linkmic.common.CohostUserInfo;
import tikcast.linkmic.common.GuestUserInfo;
import tikcast.linkmic.common.PosIdentity;
import webcast.data.multi_guest_social_data.Avatar;
import webcast.im.CohostContent;
import webcast.im.ListChangeBizContent;
import webcast.im.P2PGroupChangeContent;

/* JADX INFO: renamed from: X.0bDG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C964760bDG implements InterfaceC1279800jPO, InterfaceC965990bFF, InterfaceC968950bK1, InterfaceC967450bHb {
    public final int LIZ;
    public final Room LIZIZ;
    public final boolean LIZJ;
    public final InterfaceC954180awC LIZLLL;
    public final LiveStreamMixer LJ;
    public final Function0<InterfaceC964790bDJ> LJFF;
    public final String LJI;
    public final CopyOnWriteArraySet<InterfaceC964770bDH> LJII;
    public final CopyOnWriteArrayList<String> LJIIIIZZ;
    public int LJIIIZ;
    public final HashMap<String, HashSet<String>> LJIIJ;

    @Override // X.InterfaceC1279800jPO
    public final void LJIIIZ() {
    }

    @Override // X.InterfaceC967500bHg
    public final void LJIIL() {
    }

    @Override // X.InterfaceC1279800jPO
    public final void LJIILIIL() {
    }

    @Override // X.InterfaceC967450bHb
    public final void LJJL() {
    }

    @Override // X.InterfaceC1279800jPO
    public final void LJLJLLL() {
    }

    @Override // X.InterfaceC1279800jPO
    public final void LLI() {
    }

    @Override // X.InterfaceC965990bFF
    public final void LJJIJIL() {
        InterfaceC964840bDO interfaceC964840bDOLJLIIL = this.LJFF.invoke().LJLIIL();
        if (interfaceC964840bDOLJLIIL != null) {
            interfaceC964840bDOLJLIIL.LJJIJIL();
        }
    }

    @Override // X.InterfaceC1279800jPO
    public final void LJJJ() {
        Iterator<InterfaceC964770bDH> it2 = this.LJII.iterator();
        while (it2.hasNext()) {
            it2.next().LJJJ();
        }
    }

    @Override // X.InterfaceC1279800jPO
    public final void LJJJJ() {
        Iterator<InterfaceC964770bDH> it2 = this.LJII.iterator();
        while (it2.hasNext()) {
            it2.next().LJJJJ();
        }
    }

    @Override // X.InterfaceC1279800jPO
    public final void LJJLIIIJ() {
        Iterator<InterfaceC964770bDH> it2 = this.LJII.iterator();
        while (it2.hasNext()) {
            it2.next().LJJLIIIJ();
        }
    }

    @Override // X.InterfaceC1279800jPO
    public final void LJJLIIIJLJLI() {
        C1AZW c1azw = C1AZW.LIZ;
        String str = this.LJI;
        c1azw.getClass();
        C1AZW.LIZ(str, "onStartJoinRtcChannel start", null, null);
        Iterator<InterfaceC964770bDH> it2 = this.LJII.iterator();
        while (it2.hasNext()) {
            it2.next().LJJLIIIJLJLI();
        }
    }

    @Override // X.InterfaceC1279800jPO
    public final void LJJLIL() {
        int i = this.LIZ;
        if ((i == 4 || i == 0) && this.LIZJ && MultiGuestSdkRtcInitErrorLinkOptSetting.INSTANCE.isOpt()) {
            if (!LinkMicRTCErrorOptSetting.INSTANCE.isEnable()) {
                this.LIZLLL.LLJJJ(new C963720bBa(10011L, EnumC965730bEp.INNER), new InterfaceC920680a4A<DestroyChannelResult>() { // from class: X.0bDK
                    @Override // X.InterfaceC920680a4A
                    public final void onSuccess(DestroyChannelResult destroyChannelResult) {
                        Iterator<InterfaceC964770bDH> it2 = this.LIZ.LJII.iterator();
                        while (it2.hasNext()) {
                            it2.next().LJJLIL();
                        }
                    }

                    @Override // X.InterfaceC920680a4A
                    public final void LIZ(LinkCoreError linkCoreError, Throwable th) {
                        Iterator<InterfaceC964770bDH> it2 = this.LIZ.LJII.iterator();
                        while (it2.hasNext()) {
                            it2.next().LJJLIL();
                        }
                    }
                });
                return;
            }
            Iterator<InterfaceC964770bDH> it2 = this.LJII.iterator();
            while (it2.hasNext()) {
                it2.next().LJJLIL();
            }
        }
    }

    @Override // X.InterfaceC1279800jPO
    public final RTCClientData LJJLJ() {
        LiveStreamMixer liveStreamMixerLJLLJ;
        C1AXM c1axm;
        C1AZW c1azw = C1AZW.LIZ;
        String str = this.LJI;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onRtcEngineTurnOn start session=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(" liveConfig= ");
        sbLIZ.append(this.LIZLLL.LJJJJJ());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1azw.getClass();
        C1AZW.LIZ(str, strLIZIZ, null, null);
        for (InterfaceC964770bDH interfaceC964770bDH : this.LJII) {
            InterfaceC954180awC interfaceC954180awC = this.LIZLLL;
            interfaceC964770bDH.LJLJI(interfaceC954180awC, interfaceC954180awC.LJJJJJ());
        }
        C949400aoU c949400aoULJJJJJ = this.LIZLLL.LJJJJJ();
        if (c949400aoULJJJJJ != null) {
            RTCClientData.Builder builder = new RTCClientData.Builder();
            InterfaceC965060bDk interfaceC965060bDk = c949400aoULJJJJJ.LIZJ;
            builder.setClient(interfaceC965060bDk != null ? interfaceC965060bDk.create() : null);
            builder.setShouldMixStream(c949400aoULJJJJJ.LIZ);
            MixInfo.Builder builder2 = new MixInfo.Builder();
            MixInfo mixInfo = c949400aoULJJJJJ.LIZIZ;
            builder2.setStreamUrl(mixInfo != null ? mixInfo.streamUrl : null);
            if (this.LJFF.invoke() instanceof C1AXM) {
                InterfaceC964790bDJ interfaceC964790bDJInvoke = this.LJFF.invoke();
                liveStreamMixerLJLLJ = (!(interfaceC964790bDJInvoke instanceof C1AXM) || (c1axm = (C1AXM) interfaceC964790bDJInvoke) == null) ? null : c1axm.LJLLJ();
            } else {
                liveStreamMixerLJLLJ = this.LJ;
            }
            builder2.setStreamMixer(liveStreamMixerLJLLJ);
            builder.setMixerInfo(builder2.build());
            builder.setPushAdvance(c949400aoULJJJJJ.LIZLLL);
            builder.setInitInBackground(c949400aoULJJJJJ.LJ);
            builder.setBackground(c949400aoULJJJJJ.LJFF);
            builder.setGenerateRTCParamByRole(c949400aoULJJJJJ.LJI);
            builder.setBusinessSideEnableIndependentMixStreamParams(c949400aoULJJJJJ.LJII);
            builder.setSharedBgUrl(c949400aoULJJJJJ.LJIIJ);
            builder.setPushUrls(c949400aoULJJJJJ.LJIIJJI);
            builder.setRenderResProvider(c949400aoULJJJJJ.LJIIL);
            RTCClientData rTCClientDataBuild = builder.build();
            if (rTCClientDataBuild != null) {
                String str2 = this.LJI;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("onRtcEngineTurnOn, data=");
                sbLIZ2.append(rTCClientDataBuild);
                C1AZW.LJIIJ(12, str2, C2188811AlT.LIZIZ(sbLIZ2), null, null);
                return rTCClientDataBuild;
            }
        }
        return null;
    }

    @Override // X.InterfaceC965990bFF
    public final List LJLJL() {
        CopyOnWriteArraySet<InterfaceC964770bDH> copyOnWriteArraySet = this.LJII;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(copyOnWriteArraySet, 10));
        Iterator<InterfaceC964770bDH> it2 = copyOnWriteArraySet.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().LJLJJLL(this.LIZLLL));
        }
        return arrayList;
    }

    @Override // X.InterfaceC1279800jPO
    public final void LJLLI() {
        ArrayList arrayList = new ArrayList(this.LJII);
        this.LIZLLL.LJLJI("dispose_on_rust_linker_Error", EnumC965730bEp.UNKNOWN);
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((InterfaceC964770bDH) it2.next()).LLIILZL();
        }
        arrayList.clear();
    }

    @Override // X.InterfaceC965990bFF
    public final void LJLLLLLL() {
        InterfaceC964840bDO interfaceC964840bDOLJLIIL = this.LJFF.invoke().LJLIIL();
        if (interfaceC964840bDOLJLIIL != null) {
            interfaceC964840bDOLJLIIL.LJIIJJI();
        }
    }

    @Override // X.InterfaceC1279800jPO
    public final void LLFII() {
        C1AZW c1azw = C1AZW.LIZ;
        String str = this.LJI;
        c1azw.getClass();
        C1AZW.LIZ(str, "onStartPushStream start", null, null);
        Iterator<InterfaceC964770bDH> it2 = this.LJII.iterator();
        while (it2.hasNext()) {
            it2.next().LLLILZJ(this.LIZLLL);
        }
    }

    @Override // X.InterfaceC965990bFF
    public final boolean LLIIIL() {
        Function0<Boolean> function0;
        C949400aoU c949400aoULJJJJJ = this.LIZLLL.LJJJJJ();
        return C500260Jjc.LJJJI((c949400aoULJJJJJ == null || (function0 = c949400aoULJJJJJ.LJIIIIZZ) == null) ? null : function0.invoke()) && !this.LIZLLL.LLJJIJIIJIL();
    }

    @Override // X.InterfaceC965990bFF
    public final void LLILII() {
        InterfaceC964930bDX interfaceC964930bDX;
        InterfaceC964790bDJ interfaceC964790bDJInvoke = this.LJFF.invoke();
        if (!(interfaceC964790bDJInvoke instanceof InterfaceC964930bDX) || (interfaceC964930bDX = (InterfaceC964930bDX) interfaceC964790bDJInvoke) == null) {
            return;
        }
        interfaceC964930bDX.LJZ();
    }

    @Override // X.InterfaceC968950bK1
    public final void LIZLLL(Map<String, String> map) {
        Iterator<InterfaceC964770bDH> it2 = this.LJII.iterator();
        while (it2.hasNext()) {
            it2.next().LJJ(map);
        }
    }

    @Override // X.InterfaceC968950bK1
    public final void LJ(LinkLayerRTCMessage linkLayerRTCMessage) {
        Iterator<InterfaceC964770bDH> it2 = this.LJII.iterator();
        while (it2.hasNext()) {
            it2.next().LLLIL(linkLayerRTCMessage);
        }
    }

    @Override // X.InterfaceC965990bFF
    public final void LJFF(C954780axA c954780axA) {
        Iterator<InterfaceC964770bDH> it2 = this.LJII.iterator();
        while (it2.hasNext()) {
            it2.next().LJFF(c954780axA);
        }
    }

    @Override // X.InterfaceC968950bK1
    public final void LJIIIIZZ(Map<String, MicPositionContentInfo> map) {
        Iterator<InterfaceC964770bDH> it2 = this.LJII.iterator();
        while (it2.hasNext()) {
            it2.next().LJJJLZIJ(map);
        }
    }

    @Override // X.InterfaceC1279800jPO
    public final void LJJIIJZLJL(String str) {
        C1AZW c1azw = C1AZW.LIZ;
        String str2 = this.LJI;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onFirstRemoteAudio start linkMicId=");
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1azw.getClass();
        C1AZW.LIZ(str2, strLIZIZ, null, null);
        LJJIJIIJI(EnumC964810bDL.FIRST_REMOTE_AUDIO_FRAME, str, null, null);
    }

    public final LayoutDSLConfig LJJIIZ(LayoutDSLConfig layoutDSLConfig) {
        String strInvoke;
        String str;
        Integer numValueOf;
        String str2;
        String realDrawLayoutId;
        Function0<String> function0;
        if (!Intrinsics.LJFF(C354201Zc.LIZ(this.LIZIZ.getStreamType()), "live_voice")) {
            int i = this.LJFF.invoke().LJJJLZIJ().LIZ;
            InterfaceC964790bDJ interfaceC964790bDJInvoke = this.LJFF.invoke();
            C945380ai0 c945380ai0LLILZLL = this.LIZLLL.LLILZLL();
            if (c945380ai0LLILZLL == null || (function0 = c945380ai0LLILZLL.LIZIZ) == null || (strInvoke = function0.invoke()) == null) {
                strInvoke = "";
            }
            Layout layoutLJJLIIIJJIZ = interfaceC964790bDJInvoke.LJJLIIIJJIZ(strInvoke);
            if (layoutLJJLIIIJJIZ != null) {
                str = layoutLJJLIIIJJIZ.layoutId;
            } else {
                str = null;
            }
            C918060Zzw.LIZ.getClass();
            if (C918060Zzw.LIZ(true) && (realDrawLayoutId = this.LJFF.invoke().LJJJJZ().getRealDrawLayoutId()) != null) {
                str = realDrawLayoutId;
            }
            if (str != null) {
                String str3 = this.LJI;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("getLayoutDSLConfigWhenHandleModeratorMessage use anchorLocal, version=");
                sbLIZ.append(i);
                sbLIZ.append(", layoutId=");
                sbLIZ.append(str);
                C1AZW.LJIIJ(12, str3, C2188811AlT.LIZIZ(sbLIZ), null, null);
                return new LayoutDSLConfig(i, str);
            }
            String str4 = this.LJI;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("getLayoutDSLConfigWhenHandleModeratorMessage use message, version=");
            if (layoutDSLConfig != null) {
                numValueOf = Integer.valueOf(layoutDSLConfig.sceneVersion);
            } else {
                numValueOf = null;
            }
            sbLIZ2.append(numValueOf);
            sbLIZ2.append(", layoutId=");
            if (layoutDSLConfig != null) {
                str2 = layoutDSLConfig.layoutId;
            } else {
                str2 = null;
            }
            sbLIZ2.append(str2);
            C1AZW.LJIIJ(12, str4, C2188811AlT.LIZIZ(sbLIZ2), null, null);
            return layoutDSLConfig;
        }
        return layoutDSLConfig;
    }

    @Override // X.InterfaceC967450bHb
    public final void LJJJJZI(List<LinkUser> list) {
        Iterator<InterfaceC964770bDH> it2 = this.LJII.iterator();
        while (it2.hasNext()) {
            it2.next().LLIL(list);
        }
    }

    @Override // X.InterfaceC965990bFF
    public final void LJJJLIIL(JoinGroupDirectIMModel joinGroupDirectIMModel) {
        Iterator<InterfaceC964770bDH> it2 = this.LJII.iterator();
        while (it2.hasNext()) {
            it2.next().LJJJLIIL(joinGroupDirectIMModel);
        }
    }

    @Override // X.InterfaceC967450bHb
    public final void LJJJLL(List<LinkUser> list) {
        C1AZW c1azw = C1AZW.LIZ;
        String str = this.LJI;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onLiveUsersChanged start currentLiveUsers=");
        sbLIZ.append(list);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1azw.getClass();
        C1AZW.LIZ(str, strLIZIZ, null, null);
        int i = this.LIZ;
        if (i == 0) {
            for (InterfaceC964770bDH interfaceC964770bDH : this.LJII) {
                InterfaceC954180awC interfaceC954180awC = this.LIZLLL;
                interfaceC964770bDH.LLLFFI(interfaceC954180awC, 8, interfaceC954180awC.LLJJ(), null, null);
            }
            return;
        }
        if (i == 2) {
            for (InterfaceC964770bDH interfaceC964770bDH2 : this.LJII) {
                InterfaceC954180awC interfaceC954180awC2 = this.LIZLLL;
                interfaceC964770bDH2.LLJLLIL(interfaceC954180awC2, 8, interfaceC954180awC2.LLJJ(), null, null);
            }
        }
    }

    @Override // X.InterfaceC967450bHb
    public final void LJJJLZIJ(LinkUser linkUser) {
        C1AZW c1azw = C1AZW.LIZ;
        String str = this.LJI;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onReadyUserJoined start linkUser=");
        sbLIZ.append(linkUser);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1azw.getClass();
        C1AZW.LIZ(str, strLIZIZ, null, null);
        InterfaceC964840bDO interfaceC964840bDOLJLIIL = this.LJFF.invoke().LJLIIL();
        if (interfaceC964840bDOLJLIIL != null) {
            interfaceC964840bDOLJLIIL.LIZIZ();
        }
        this.LJFF.invoke().LLIIIZ(EnumC918810a19.StateJoined, linkUser);
    }

    @Override // X.InterfaceC1279800jPO
    public final void LJJLIIIJJIZ(String str) {
        C1AZW c1azw = C1AZW.LIZ;
        String str2 = this.LJI;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onTurnOffEngine start source=");
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1azw.getClass();
        C1AZW.LIZ(str2, strLIZIZ, null, null);
        RtcUserInfo rtcUserInfoG0 = this.LIZLLL.G0();
        if (rtcUserInfoG0 == null) {
            return;
        }
        this.LJFF.invoke().LJJJ(null, false, str);
        this.LJFF.invoke().LJJIJL().LJFF(-1L, rtcUserInfoG0.linkMicId, Long.valueOf(rtcUserInfoG0.userId));
        Iterator<InterfaceC964770bDH> it2 = this.LJII.iterator();
        while (it2.hasNext()) {
            it2.next().LJJLIIIJJIZ(str);
        }
        CopyOnWriteArrayList<String> copyOnWriteArrayList = this.LJIIIIZZ;
        copyOnWriteArrayList.clear();
        copyOnWriteArrayList.add(rtcUserInfoG0.linkMicId);
    }

    @Override // X.InterfaceC965990bFF
    public final void LJJZ(Map<String, OnLineMicInfo> map) {
        int i;
        String str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, OnLineMicInfo> entry : map.entrySet()) {
            String key = entry.getKey();
            MicPositionInfo micPositionInfo = entry.getValue().micPositionData;
            int i2 = 0;
            if (micPositionInfo != null) {
                i = micPositionInfo.position;
                i2 = micPositionInfo.contentType;
                str = micPositionInfo.contentLinkMicId;
            } else {
                i = 0;
                str = null;
            }
            linkedHashMap.put(key, new MicPositionContentInfo(i, i2, str));
        }
        Iterator<InterfaceC964770bDH> it2 = this.LJII.iterator();
        while (it2.hasNext()) {
            it2.next().LJJJLZIJ(linkedHashMap);
        }
    }

    @Override // X.InterfaceC965990bFF
    public final void LJJZZIII(long j) {
        Iterator<InterfaceC964770bDH> it2 = this.LJII.iterator();
        while (it2.hasNext()) {
            it2.next().LLLIIII(j, this.LIZLLL);
        }
    }

    @Override // X.InterfaceC965990bFF
    public final void LJL(ApplyGroupMessage applyGroupMessage) {
        Iterator<InterfaceC964770bDH> it2 = this.LJII.iterator();
        while (it2.hasNext()) {
            it2.next().LLLLLLZZ(this.LIZLLL, applyGroupMessage);
        }
    }

    @Override // X.InterfaceC965990bFF
    public final void LJLI(ReplyInviteGroupMessage replyInviteGroupMessage) {
        C1AZW c1azw = C1AZW.LIZ;
        String str = this.LJI;
        c1azw.getClass();
        C1AZW.LIZ(str, "onReplyInviteGroupMessageReceived", null, null);
        if (replyInviteGroupMessage.agreeStatus == 1 && !LinkMicSdkCoHostUpdateLayoutTimeOptSetting.INSTANCE.isOpt()) {
            this.LJFF.invoke().LJJJJIZL(LiveCoHostLayoutIdConfigSetting.INSTANCE.getNormalExpand(true), false, false, true, false, new C916150Zwr());
        }
        Iterator<InterfaceC964770bDH> it2 = this.LJII.iterator();
        while (it2.hasNext()) {
            it2.next().LJLI(this.LIZLLL, replyInviteGroupMessage);
        }
    }

    @Override // X.InterfaceC965990bFF
    public final void LJLIIIL(CancelInviteGroupMessage cancelInviteGroupMessage) {
        Iterator<InterfaceC964770bDH> it2 = this.LJII.iterator();
        while (it2.hasNext()) {
            it2.next().LLILLIZIL(this.LIZLLL, cancelInviteGroupMessage);
        }
    }

    @Override // X.InterfaceC965990bFF
    public final void LJLILLLLZI(String str) {
        Iterator<InterfaceC964770bDH> it2 = this.LJII.iterator();
        while (it2.hasNext()) {
            it2.next().LLLLLZ(str);
        }
    }

    @Override // X.InterfaceC1279800jPO
    public final void LJLJI(RtcStartResultMessage rtcStartResultMessage) {
        String str = this.LJI;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onRtcStartResult start rtcStartResultMessage=");
        sbLIZ.append(rtcStartResultMessage);
        sbLIZ.append(" baseRtcCallback = ");
        sbLIZ.append(this.LJFF.invoke().LJJIJL().hashCode());
        C1AZW.LJIIJ(12, str, C2188811AlT.LIZIZ(sbLIZ), null, null);
        if (rtcStartResultMessage.startSuccess) {
            this.LJFF.invoke().LJJIJL().LIZJ();
        }
        Iterator<InterfaceC964770bDH> it2 = this.LJII.iterator();
        while (it2.hasNext()) {
            it2.next().LJLJL(this.LIZLLL, rtcStartResultMessage);
        }
    }

    @Override // X.InterfaceC965990bFF
    public final void LJLJJLL(long j) {
        this.LJFF.invoke().LJII(j);
        C965900bF6.LIZ(new C964780bDI(this));
    }

    @Override // X.InterfaceC965990bFF
    public final void LJLLL(InviteGroupMessage inviteGroupMessage) {
        Iterator<InterfaceC964770bDH> it2 = this.LJII.iterator();
        while (it2.hasNext()) {
            it2.next().LJLIIIL(this.LIZLLL, inviteGroupMessage);
        }
    }

    @Override // X.InterfaceC965990bFF
    public final void LJZL(GroupChangeMessage groupChangeMessage) {
        Iterator<InterfaceC964770bDH> it2 = this.LJII.iterator();
        while (it2.hasNext()) {
            it2.next().LLIIII(this.LIZLLL, groupChangeMessage);
        }
    }

    @Override // X.InterfaceC965990bFF
    public final void LLFFF(LeaveGroupMessage leaveGroupMessage) {
        Iterator<InterfaceC964770bDH> it2 = this.LJII.iterator();
        while (it2.hasNext()) {
            it2.next().LLFZ(this.LIZLLL, leaveGroupMessage);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    @Override // X.InterfaceC965990bFF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLFZ(com.bytedance.android.livesdk.comp.api.linkcore.model.P2PGroupChangeMessage r13) {
        /*
            r12 = this;
            java.lang.String r7 = "p2pGroupIM"
            java.lang.String r0 = "p2pGroupIM"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r7, r0)
            r4 = r12
            if (r0 == 0) goto L3e
            X.1AZW r3 = X.C1AZW.LIZ
            java.lang.String r2 = r4.LJI
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "P2P group change message callback for business. msg: "
            r1.append(r0)
            r1.append(r13)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            r0 = 0
            r3.getClass()
            X.C1AZW.LIZ(r2, r1, r0, r0)
            java.util.concurrent.CopyOnWriteArraySet<X.0bDH> r0 = r4.LJII
            java.util.Iterator r2 = r0.iterator()
        L2c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L3e
            java.lang.Object r1 = r2.next()
            X.0bDH r1 = (X.InterfaceC964770bDH) r1
            X.0awC r0 = r4.LIZLLL
            r1.LJL(r0, r13)
            goto L2c
        L3e:
            com.bytedance.android.livesdk.chatroom.model.multiguestv3.BusinessContent r0 = r13.businessContent
            r8 = 0
            if (r0 == 0) goto L6a
            webcast.im.CohostContent r0 = r0.cohostContent
            if (r0 == 0) goto L6a
            webcast.im.ListChangeBizContent r0 = r0.listChangeBizContent
            if (r0 == 0) goto L51
            java.util.List<com.bytedance.android.livesdk.chatroom.model.interact.VirtualWaitingUser> r8 = r0.waitingUsers
            java.util.Map<java.lang.Long, com.bytedance.android.livesdk.chatroom.model.interact.CohostABInfo> r9 = r0.abInfos
            if (r9 != 0) goto L56
        L51:
            java.util.LinkedHashMap r9 = new java.util.LinkedHashMap
            r9.<init>()
        L56:
            if (r0 == 0) goto L69
            com.bytedance.android.livesdk.chatroom.model.interact.GamePlayContent r10 = r0.gameplayContent
            java.util.Map<java.lang.Long, tikcast.linkmic.common.GuestUserInfo> r11 = r0.guestUserInfos
            if (r0 == 0) goto L69
            java.util.Map<java.lang.Long, tikcast.linkmic.common.CohostUserInfo> r5 = r0.userInfos
            if (r5 == 0) goto L69
            com.bytedance.android.livesdk.model.message.linkcore.LinkLayerMessage r0 = r13.linkLayerMessage
            webcast.im.P2PGroupChangeContent r6 = r0.p2pGroupChangeContent
            r4.LJLIL(r5, r6, r7, r8, r9, r10, r11)
        L69:
            return
        L6a:
            r0 = r8
            goto L51
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C964760bDG.LLFZ(com.bytedance.android.livesdk.comp.api.linkcore.model.P2PGroupChangeMessage):void");
    }

    @Override // X.InterfaceC965990bFF
    public final void LLII(int i) {
        Iterator<InterfaceC964770bDH> it2 = this.LJII.iterator();
        while (it2.hasNext()) {
            it2.next().LLIIIZ(this.LIZLLL, i);
        }
    }

    @Override // X.InterfaceC965990bFF
    public final void LLIIII(List<Pair<String, Integer>> list) {
        InterfaceC964930bDX interfaceC964930bDX;
        C1304630k3R.LIZLLL(6, "call on mic position changed...", this.LJI);
        InterfaceC964790bDJ interfaceC964790bDJInvoke = this.LJFF.invoke();
        if ((interfaceC964790bDJInvoke instanceof InterfaceC964930bDX) && (interfaceC964930bDX = (InterfaceC964930bDX) interfaceC964790bDJInvoke) != null) {
            interfaceC964930bDX.LLI(list);
        }
    }

    @Override // X.InterfaceC1279800jPO
    public final void LLIIIILZ(LinkCoreError linkCoreError) {
        String str = this.LJI;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onRtcError start error=");
        sbLIZ.append(linkCoreError);
        C1AZW.LJIIJ(12, str, C2188811AlT.LIZIZ(sbLIZ), null, null);
        Iterator<InterfaceC964770bDH> it2 = this.LJII.iterator();
        while (it2.hasNext()) {
            it2.next().LL(this.LIZLLL, linkCoreError);
        }
    }

    @Override // X.InterfaceC965990bFF
    public final void LLIIIJ(PermitApplyGroupMessage permitApplyGroupMessage) {
        if (permitApplyGroupMessage.agreeStatus == 1 && !LinkMicSdkCoHostUpdateLayoutTimeOptSetting.INSTANCE.isOpt()) {
            this.LJFF.invoke().LJJJJIZL(LiveCoHostLayoutIdConfigSetting.INSTANCE.getNormalExpand(true), false, false, true, false, new C916150Zwr());
        }
        Iterator<InterfaceC964770bDH> it2 = this.LJII.iterator();
        while (it2.hasNext()) {
            it2.next().LJLL(this.LIZLLL, permitApplyGroupMessage);
        }
    }

    @Override // X.InterfaceC965990bFF
    public final void LLIIIZ(CancelApplyGroupMessage cancelApplyGroupMessage) {
        Iterator<InterfaceC964770bDH> it2 = this.LJII.iterator();
        while (it2.hasNext()) {
            it2.next().LLLIILIL(this.LIZLLL, cancelApplyGroupMessage);
        }
    }

    @Override // X.InterfaceC1279800jPO
    public final void onUserJoined(String str) {
        C1AZW c1azw = C1AZW.LIZ;
        String str2 = this.LJI;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onUserJoined start linkMicId=");
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1azw.getClass();
        C1AZW.LIZ(str2, strLIZIZ, null, null);
        this.LJFF.invoke().LJJIJL().onUserJoined(str);
        for (InterfaceC964770bDH interfaceC964770bDH : this.LJII) {
            InterfaceC954180awC interfaceC954180awC = this.LIZLLL;
            LinkUser.Builder builder = new LinkUser.Builder();
            builder.setLinkMicId(str);
            interfaceC964770bDH.LLLII(interfaceC954180awC, builder.build(), null);
        }
        if (InteractServiceDel.LLILLJJLI.ae()) {
            int i = this.LIZ;
            if (i == 4 || i == 0) {
                LJJIJIIJI(EnumC964810bDL.USER_JOINED, str, null, null);
            }
        }
    }

    @Override // X.InterfaceC965990bFF
    public final void LIZ(long j, C1AZU c1azu) {
        Iterator<InterfaceC964770bDH> it2 = this.LJII.iterator();
        while (it2.hasNext()) {
            it2.next().LIZ(j, c1azu);
        }
    }

    @Override // X.InterfaceC1279800jPO
    public final void LIZIZ(String str, SurfaceView surfaceView) {
        this.LJFF.invoke().LJJIJL().LIZIZ(str, surfaceView);
    }

    @Override // X.InterfaceC968950bK1
    public final void LIZJ(String str, boolean z) {
        Iterator<InterfaceC964770bDH> it2 = this.LJII.iterator();
        while (it2.hasNext()) {
            it2.next().LJIJJLI(str, z);
        }
    }

    @Override // X.InterfaceC968950bK1
    public final void LJI(List<LinkUser> list, List<LinkUser> list2) {
        Iterator<InterfaceC964770bDH> it2 = this.LJII.iterator();
        while (it2.hasNext()) {
            it2.next().LJJIIJ(list, list2);
        }
    }

    @Override // X.InterfaceC1279800jPO
    public final void LJIIJJI(String str, SurfaceView surfaceView) {
        String strLJIIL;
        C1AZW c1azw = C1AZW.LIZ;
        String str2 = this.LJI;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onFirstRemoteVideoFrameRender start linkMicId=");
        sbLIZ.append(str);
        sbLIZ.append(" surfaceView=");
        if (surfaceView != null) {
            strLJIIL = C500260Jjc.LJIIL(surfaceView);
        } else {
            strLJIIL = null;
        }
        sbLIZ.append(strLJIIL);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1azw.getClass();
        C1AZW.LIZ(str2, strLIZIZ, null, null);
        LJJIJIIJI(EnumC964810bDL.FIRST_REMOTE_VIDEO_FRAME, str, surfaceView, null);
        Iterator<InterfaceC964770bDH> it2 = this.LJII.iterator();
        while (it2.hasNext()) {
            it2.next().LJIIJJI(str, surfaceView);
        }
    }

    @Override // X.InterfaceC967500bHg
    public final void LJIILJJIL(int i, C967130bH5 c967130bH5) {
        C1AZW c1azw = C1AZW.LIZ;
        String str = this.LJI;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("callOnUserListChanged Flags=");
        sbLIZ.append(i);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1azw.getClass();
        C1AZW.LIZ(str, strLIZIZ, null, null);
        if (C921770a5v.LIZ(i)) {
            this.LJFF.invoke().LJIIL();
        }
        for (InterfaceC964770bDH interfaceC964770bDH : this.LJII) {
            if (this.LIZLLL.LJIILIIL()) {
                interfaceC964770bDH.LLLFFI(this.LIZLLL, i, c967130bH5, null, null);
                interfaceC964770bDH.LLL(this.LIZLLL, i, c967130bH5, null, null);
            } else {
                interfaceC964770bDH.LLJLLIL(this.LIZLLL, i, c967130bH5, null, null);
            }
        }
    }

    @Override // X.InterfaceC968950bK1
    public final void LJIILL(List<LinkUser> list, List<LinkUser> list2) {
        Iterator<InterfaceC964770bDH> it2 = this.LJII.iterator();
        while (it2.hasNext()) {
            it2.next().LJJJJZ(list, list2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
    
        X.C500260Jjc.LJJLIIIJILLIZJL(new X.C964920bDW(r6, r4));
     */
    @Override // X.InterfaceC967500bHg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILLIIL(java.util.List<com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser> r7, java.util.List<com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser> r8) {
        /*
            r6 = this;
            int r1 = r6.LIZ
            r0 = 2
            if (r1 == r0) goto L7
            if (r1 != 0) goto L3d
        L7:
            java.util.Iterator r5 = r8.iterator()
        Lb:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L3d
            java.lang.Object r4 = r5.next()
            com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser r4 = (com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser) r4
            java.util.Iterator r3 = r7.iterator()
        L1b:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L34
            java.lang.Object r2 = r3.next()
            r0 = r2
            com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser r0 = (com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser) r0
            java.lang.Long r1 = r0.userId
            java.lang.Long r0 = r4.userId
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L1b
            if (r2 != 0) goto Lb
        L34:
            X.0bDW r0 = new X.0bDW
            r0.<init>(r6, r4)
            X.C500260Jjc.LJJLIIIJILLIZJL(r0)
            goto Lb
        L3d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C964760bDG.LJIILLIIL(java.util.List, java.util.List):void");
    }

    @Override // X.InterfaceC1279800jPO
    public final void LJIIZILJ(String str, SurfaceView surfaceView) {
        C1AZW c1azw = C1AZW.LIZ;
        String str2 = this.LJI;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onFirstRemoteVideoFrameRealRender start linkMicId=");
        sbLIZ.append(str);
        sbLIZ.append(" surfaceView=");
        sbLIZ.append(surfaceView);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1azw.getClass();
        C1AZW.LIZ(str2, strLIZIZ, null, null);
        Iterator<InterfaceC964770bDH> it2 = this.LJII.iterator();
        while (it2.hasNext()) {
            it2.next().LJIIZILJ(str, surfaceView);
        }
        if (!this.LJIIIIZZ.contains(str)) {
            this.LJIIIIZZ.add(str);
        }
    }

    @Override // X.InterfaceC1279800jPO
    public final void LJIJ(String str, String str2) {
        C1AZW c1azw = C1AZW.LIZ;
        String str3 = this.LJI;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onUserMsgReceived start linkMicId=");
        sbLIZ.append(str);
        sbLIZ.append(" message=");
        sbLIZ.append(str2);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1azw.getClass();
        C1AZW.LIZ(str3, strLIZIZ, null, null);
        Iterator<InterfaceC964770bDH> it2 = this.LJII.iterator();
        while (it2.hasNext()) {
            it2.next().LLLIIL(this.LIZLLL, str, str2);
        }
    }

    @Override // X.InterfaceC1279800jPO
    public final void LJIJI(String str, String str2) {
        Object objLJII;
        C1AZW c1azw = C1AZW.LIZ;
        String str3 = this.LJI;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onRoomMsgReceived start linkMicId=");
        sbLIZ.append(str);
        sbLIZ.append(" message=");
        sbLIZ.append(str2);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1azw.getClass();
        C1AZW.LIZ(str3, strLIZIZ, null, null);
        try {
            objLJII = C19748512Ol.LIZIZ.LJII(str2, LinkLayerRTCMessage.class);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            try {
                new RunnableC964990bDd("DataConverterUtil", e).run();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1CC2.LIZ("LinkMicSdkLogger Error", th);
            }
            objLJII = null;
        }
        LinkLayerRTCMessage linkLayerRTCMessage = (LinkLayerRTCMessage) objLJII;
        if (linkLayerRTCMessage != null && Intrinsics.LJFF(linkLayerRTCMessage.method, "linkMicSDKLayoutChange") && !MultiGuestV3LayoutTechSetting.INSTANCE.isEnable()) {
            this.LJFF.invoke().LJJIJL().LIZLLL(str, linkLayerRTCMessage);
        }
        Iterator<InterfaceC964770bDH> it2 = this.LJII.iterator();
        while (it2.hasNext()) {
            it2.next().LLIZLLLIL(this.LIZLLL, str, str2);
        }
    }

    @Override // X.InterfaceC965990bFF
    public final void LJIJJLI(String str, boolean z) {
        Iterator<InterfaceC964770bDH> it2 = this.LJII.iterator();
        while (it2.hasNext()) {
            it2.next().LJIJJLI(str, z);
        }
    }

    @Override // X.InterfaceC1279800jPO
    public final void LJJ(String str, SurfaceView surfaceView) {
        this.LJFF.invoke().LJJIJL().LIZ(EnumC964810bDL.RENDER_MODE_SWITCH, str, surfaceView, null);
    }

    @Override // X.InterfaceC965990bFF
    public final void LJJI(long j, C1AZU c1azu) {
        Iterator<InterfaceC964770bDH> it2 = this.LJII.iterator();
        while (it2.hasNext()) {
            it2.next().LJJI(j, c1azu);
        }
    }

    @Override // X.InterfaceC1279800jPO
    public final void LJJIII(String str, InterfaceC1268870j7l interfaceC1268870j7l) {
        C1AZW c1azw = C1AZW.LIZ;
        String str2 = this.LJI;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onFirstRemoteVideoFrameRender start linkMicId=");
        sbLIZ.append(str);
        sbLIZ.append(" layer=");
        sbLIZ.append(interfaceC1268870j7l);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1azw.getClass();
        C1AZW.LIZ(str2, strLIZIZ, null, null);
        LJJIJIIJI(EnumC964810bDL.FIRST_REMOTE_VIDEO_FRAME, str, null, interfaceC1268870j7l);
    }

    @Override // X.InterfaceC967450bHb
    public final void LJJIIJ(List<LinkUser> list, List<LinkUser> list2) {
        C1AZW c1azw = C1AZW.LIZ;
        String str = this.LJI;
        c1azw.getClass();
        C1AZW.LIZ(str, "onLocalLinkedListWillChange", null, null);
        ArrayList arrayList = new ArrayList();
        Iterator<LinkUser> it2 = list2.iterator();
        while (it2.hasNext()) {
            String str2 = it2.next().linkMicId;
            if (str2 != null) {
                arrayList.add(str2);
            }
        }
        this.LJFF.invoke().LLIIJLIL(arrayList);
        LJI(list, list2);
    }

    @Override // X.InterfaceC1279800jPO
    public final void LJJIIZI(String str, String str2) {
        for (InterfaceC964770bDH interfaceC964770bDH : this.LJII) {
            try {
                interfaceC964770bDH.LJJIIZI(str, str2);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(interfaceC964770bDH);
                sbLIZ.append(" -->failed，");
                sbLIZ.append(th.getMessage());
                C1304630k3R.LJ(C2188811AlT.LIZIZ(sbLIZ), this.LJI);
            }
        }
    }

    public final void LJJIJ(C966020bFI c966020bFI, C914780Zue c914780Zue) {
        boolean z;
        boolean z2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("handleNewStateChange start linker[");
        sbLIZ.append(c966020bFI.hashCode());
        sbLIZ.append("] linkStateModel=");
        sbLIZ.append(c914780Zue);
        C1304630k3R.LIZLLL(6, C2188811AlT.LIZIZ(sbLIZ), this.LJI);
        RtcUserInfo rtcUserInfoLJFF = c966020bFI.LJFF();
        InterfaceC964790bDJ interfaceC964790bDJInvoke = this.LJFF.invoke();
        boolean z3 = false;
        if (!C954950axR.LIZJ(c914780Zue.LIZ) && !C954950axR.LIZIZ(c914780Zue.LIZIZ)) {
            z = false;
        } else {
            z = true;
        }
        if (c914780Zue.LIZ == EnumC969200bKQ.Idle) {
            z2 = true;
        } else {
            z2 = false;
        }
        C0C2H c0c2h = (C0C2H) C0C2J.LIZ.getValue();
        RunnableC775480UbS runnableC775480UbS = new RunnableC775480UbS(interfaceC964790bDJInvoke, rtcUserInfoLJFF, z, z2);
        BPEAHandler bPEAHandler = c0c2h.LIZ;
        if (bPEAHandler != null) {
            C786410Ut5.LJJZZIII(bPEAHandler, new RunnableC20554083k(runnableC775480UbS));
        }
        InterfaceC964790bDJ interfaceC964790bDJInvoke2 = this.LJFF.invoke();
        if (C954950axR.LIZJ(c914780Zue.LIZ) || C954950axR.LIZIZ(c914780Zue.LIZIZ)) {
            z3 = true;
        }
        interfaceC964790bDJInvoke2.LJJLIIIJ(z3);
    }

    @Override // X.InterfaceC965990bFF
    public final void LJJIJIIJIL(String str, boolean z) {
        Iterator<InterfaceC964770bDH> it2 = this.LJII.iterator();
        while (it2.hasNext()) {
            it2.next().LJJIJIIJIL(str, z);
        }
    }

    @Override // X.InterfaceC965990bFF
    public final void LJJIL(String str, boolean z) {
        Iterator<InterfaceC964770bDH> it2 = this.LJII.iterator();
        while (it2.hasNext()) {
            it2.next().LJJIL(str, z);
        }
    }

    @Override // X.InterfaceC1279800jPO
    public final void LJJIZ(String str, long j) {
        C1AZW c1azw = C1AZW.LIZ;
        String str2 = this.LJI;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onUserLeft start linkMicId=");
        sbLIZ.append(str);
        sbLIZ.append(" leaveReason=");
        sbLIZ.append(j);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1azw.getClass();
        C1AZW.LIZ(str2, strLIZIZ, null, null);
        this.LJFF.invoke().LJJIJL().LJFF(j, str, null);
        Iterator<InterfaceC964770bDH> it2 = this.LJII.iterator();
        while (it2.hasNext()) {
            it2.next().LJJIZ(str, j);
        }
    }

    @Override // X.InterfaceC965990bFF
    public final void LJJJJJL(int i, C965030bDh c965030bDh) {
        Iterator<InterfaceC964770bDH> it2 = this.LJII.iterator();
        while (it2.hasNext()) {
            it2.next().LJJJJJL(i, c965030bDh);
        }
    }

    @Override // X.InterfaceC967450bHb
    public final void LJJJJZ(List<LinkUser> list, List<LinkUser> list2) {
        C1AZW c1azw = C1AZW.LIZ;
        String str = this.LJI;
        c1azw.getClass();
        C1AZW.LIZ(str, "onLocalLinkedListDidChange", null, null);
        this.LJFF.invoke().LLIIJLIL(null);
        LJIILL(list, list2);
    }

    @Override // X.InterfaceC965990bFF
    public final void LJJJZ(int i, String str) {
        Iterator<InterfaceC964770bDH> it2 = this.LJII.iterator();
        while (it2.hasNext()) {
            it2.next().LJJJZ(i, str);
        }
    }

    @Override // X.InterfaceC965990bFF
    public final void LJJLIIIJILLIZJL(Avatar avatar, String str) {
        Iterator<InterfaceC964770bDH> it2 = this.LJII.iterator();
        while (it2.hasNext()) {
            it2.next().LJJLIIIJILLIZJL(avatar, str);
        }
    }

    @Override // X.InterfaceC965990bFF
    public final void LJJLJLI(C966020bFI c966020bFI, ListChangeMessage listChangeMessage) {
        Iterator<InterfaceC964770bDH> it2 = this.LJII.iterator();
        while (it2.hasNext()) {
            it2.next().LJJLJLI(c966020bFI, listChangeMessage);
        }
    }

    @Override // X.InterfaceC965990bFF
    public final void LJJLL(int i, int i2) {
        Iterator<InterfaceC964770bDH> it2 = this.LJII.iterator();
        while (it2.hasNext()) {
            it2.next().LJJLL(i, i2);
        }
    }

    @Override // X.InterfaceC965990bFF
    public final void LJJZZI(C966020bFI c966020bFI, C954780axA c954780axA) {
        LJJIJ(c966020bFI, c954780axA.LIZ);
        Iterator<InterfaceC964770bDH> it2 = this.LJII.iterator();
        while (it2.hasNext()) {
            it2.next().LJJJLL(c954780axA);
        }
    }

    @Override // X.InterfaceC965990bFF
    public final void LJLIIL(C966020bFI c966020bFI, CancelApplyMessage cancelApplyMessage) {
        C1AZW c1azw = C1AZW.LIZ;
        String str = this.LJI;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onCancelApplyMessageReceived start linker=");
        sbLIZ.append(c966020bFI);
        sbLIZ.append(" cancelApplyMessage=");
        sbLIZ.append(cancelApplyMessage);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1azw.getClass();
        C1AZW.LIZ(str, strLIZIZ, null, null);
        Iterator<InterfaceC964770bDH> it2 = this.LJII.iterator();
        while (it2.hasNext()) {
            it2.next().LLJIJIL(this.LIZLLL, cancelApplyMessage);
        }
    }

    @Override // X.InterfaceC965990bFF
    public final void LJLJJI(C966020bFI c966020bFI, InviteMessage inviteMessage) {
        C1AZW c1azw = C1AZW.LIZ;
        String str = this.LJI;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onInviteMessageReceived start linker=");
        sbLIZ.append(c966020bFI);
        sbLIZ.append(" inviteMessage=");
        sbLIZ.append(inviteMessage);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        Context context = null;
        c1azw.getClass();
        C1AZW.LIZ(str, strLIZIZ, null, null);
        Iterator<InterfaceC964770bDH> it2 = this.LJII.iterator();
        while (it2.hasNext()) {
            it2.next().LLJJL(this.LIZLLL, inviteMessage);
        }
        InterfaceC964790bDJ interfaceC964790bDJInvoke = this.LJFF.invoke();
        LinkUser linkUser = inviteMessage.inviter;
        c966020bFI.getClass();
        interfaceC964790bDJInvoke.LJLLILLLL(linkUser, null, null, true);
        InterfaceC964840bDO interfaceC964840bDOLJLIIL = this.LJFF.invoke().LJLIIL();
        if (interfaceC964840bDOLJLIIL != null) {
            interfaceC964840bDOLJLIIL.LIZJ(inviteMessage);
        }
        boolean zEnabled = M2LEnablePreGetConfig.INSTANCE.enabled();
        if (zEnabled) {
            String serverDeviceId = ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).getServerDeviceId();
            String rtcAppID = TTLHSplitModuleRtcAppID.INSTANCE.getRtcAppID();
            String strLIZ = C780130Uix.LIZ();
            IHostAppContext iHostAppContext = (IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class);
            if (iHostAppContext != null) {
                context = iHostAppContext.context();
            }
            C1276090jJP.LJ(zEnabled, new C1276150jJV(context, rtcAppID, serverDeviceId, strLIZ, M2LPreGetConfigUseCache.INSTANCE.getValue(), ""));
        }
    }

    @Override // X.InterfaceC1279800jPO
    public final void LJLJJL(boolean z, LinkCoreError linkCoreError) {
        String str = this.LJI;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onRtcEndResult start success=");
        sbLIZ.append(z);
        sbLIZ.append(" error=");
        sbLIZ.append(linkCoreError);
        C1AZW.LJIIJ(12, str, C2188811AlT.LIZIZ(sbLIZ), null, null);
        Iterator<InterfaceC964770bDH> it2 = this.LJII.iterator();
        while (it2.hasNext()) {
            it2.next().LJLJJI(this.LIZLLL, z, linkCoreError);
        }
    }

    @Override // X.InterfaceC965990bFF
    public final void LJLJLJ(C966020bFI c966020bFI, PermitApplyMessage permitApplyMessage) {
        InterfaceC964840bDO interfaceC964840bDOLJLIIL;
        C1AZW c1azw = C1AZW.LIZ;
        String str = this.LJI;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onAnchorReceivePermitApplyMessage start linker=");
        sbLIZ.append(c966020bFI);
        sbLIZ.append(" permitApplyMessage=");
        sbLIZ.append(permitApplyMessage);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        Long l = null;
        c1azw.getClass();
        C1AZW.LIZ(str, strLIZIZ, null, null);
        LayoutDSLConfig layoutDSLConfigLJJIIZ = LJJIIZ(permitApplyMessage.layoutDSLConfig);
        c966020bFI.getClass();
        if (layoutDSLConfigLJJIIZ != null && permitApplyMessage.permitStatus == 1 && (interfaceC964840bDOLJLIIL = this.LJFF.invoke().LJLIIL()) != null) {
            interfaceC964840bDOLJLIIL.LJIIL(layoutDSLConfigLJJIIZ);
        }
        if (permitApplyMessage.permitStatus == 1) {
            C967770bI7 c967770bI7 = c966020bFI.LJJIFFI;
            LinkUser.Builder builder = new LinkUser.Builder();
            LinkUser linkUser = permitApplyMessage.applier;
            String str2 = null;
            if (linkUser != null) {
                l = linkUser.userId;
            }
            builder.setUserId(l);
            LinkUser linkUser2 = permitApplyMessage.applier;
            if (linkUser2 != null) {
                str2 = linkUser2.linkMicId;
            }
            builder.setLinkMicId(str2);
            c967770bI7.LJIIIIZZ(builder.build());
        }
        Iterator<InterfaceC964770bDH> it2 = this.LJII.iterator();
        while (it2.hasNext()) {
            it2.next().LLLLLLJ(this.LIZLLL, permitApplyMessage);
        }
    }

    @Override // X.InterfaceC1279800jPO
    public final void LJLL(String str, boolean z) {
        C1AZW c1azw = C1AZW.LIZ;
        String str2 = this.LJI;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onRemoteVideoMute start linkMicId=");
        sbLIZ.append(str);
        sbLIZ.append(" mute=");
        sbLIZ.append(z);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1azw.getClass();
        C1AZW.LIZ(str2, strLIZIZ, null, null);
        Iterator<InterfaceC964770bDH> it2 = this.LJII.iterator();
        while (it2.hasNext()) {
            it2.next().LLJI(str, true, z);
        }
    }

    @Override // X.InterfaceC965990bFF
    public final void LJLLILLLL(C966020bFI c966020bFI, LeaveMessage leaveMessage) {
        C1AZW c1azw = C1AZW.LIZ;
        String str = this.LJI;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onLeaveMessageReceived start linker=");
        sbLIZ.append(c966020bFI);
        sbLIZ.append(" leaveMessage=");
        sbLIZ.append(leaveMessage);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1azw.getClass();
        C1AZW.LIZ(str, strLIZIZ, null, null);
        Iterator<InterfaceC964770bDH> it2 = this.LJII.iterator();
        while (it2.hasNext()) {
            it2.next().LLLLLLIL(this.LIZLLL, leaveMessage);
        }
    }

    @Override // X.InterfaceC965990bFF
    public final void LJLLJ(C966020bFI c966020bFI, JoinRoomDirectMessage joinRoomDirectMessage) {
        C1AZW c1azw = C1AZW.LIZ;
        String str = this.LJI;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onJoinRoomDirectMessageReceived start linker=");
        sbLIZ.append(c966020bFI);
        sbLIZ.append(" joinRoomDirectMsg=");
        sbLIZ.append(joinRoomDirectMessage);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1azw.getClass();
        C1AZW.LIZ(str, strLIZIZ, null, null);
        Iterator<InterfaceC964770bDH> it2 = this.LJII.iterator();
        while (it2.hasNext()) {
            it2.next().LJZI(this.LIZLLL, joinRoomDirectMessage);
        }
    }

    @Override // X.InterfaceC965990bFF
    public final void LJLLLL(C966020bFI c966020bFI, InviteMessage inviteMessage) {
        C1AZW c1azw = C1AZW.LIZ;
        String str = this.LJI;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onAnchorReceiveModeratorInviteMessage start linker=");
        sbLIZ.append(c966020bFI);
        sbLIZ.append(" inviteMessage=");
        sbLIZ.append(inviteMessage);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1azw.getClass();
        C1AZW.LIZ(str, strLIZIZ, null, null);
        InviteMessage inviteMessage2 = new InviteMessage(inviteMessage.inviter, inviteMessage.inviteeFixedMicInfo, LJJIIZ(inviteMessage.layoutDSLConfig), inviteMessage.customMessage, inviteMessage.inviteSource, inviteMessage.inviteeUserInfo, inviteMessage.shareRevenueSetting);
        Iterator<InterfaceC964770bDH> it2 = this.LJII.iterator();
        while (it2.hasNext()) {
            it2.next().LLILLJJLI(this.LIZLLL, inviteMessage2);
        }
        InterfaceC964840bDO interfaceC964840bDOLJLIIL = this.LJFF.invoke().LJLIIL();
        if (interfaceC964840bDOLJLIIL != null) {
            interfaceC964840bDOLJLIIL.LJII(inviteMessage2);
        }
    }

    @Override // X.InterfaceC965990bFF
    public final void LJLZ(C966020bFI c966020bFI, PermitApplyMessage permitApplyMessage) {
        C1AZW c1azw = C1AZW.LIZ;
        String str = this.LJI;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onReplyApplyMessageReceived start linker=");
        sbLIZ.append(c966020bFI);
        sbLIZ.append(" permitApplyMessage=");
        sbLIZ.append(permitApplyMessage);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1azw.getClass();
        C1AZW.LIZ(str, strLIZIZ, null, null);
        Iterator<InterfaceC964770bDH> it2 = this.LJII.iterator();
        while (it2.hasNext()) {
            it2.next().LLLL(this.LIZLLL, permitApplyMessage);
        }
        this.LJFF.invoke().LJLLILLLL(permitApplyMessage.approver, null, null, false);
        if (permitApplyMessage.permitStatus == 1) {
            c966020bFI.getClass();
            InterfaceC964840bDO interfaceC964840bDOLJLIIL = this.LJFF.invoke().LJLIIL();
            if (interfaceC964840bDOLJLIIL != null) {
                interfaceC964840bDOLJLIIL.LJ(permitApplyMessage);
            }
        }
    }

    @Override // X.InterfaceC1279800jPO
    public final void LJZ(String str, boolean z) {
        C1AZW c1azw = C1AZW.LIZ;
        String str2 = this.LJI;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onRemoteAudioMute start linkMicId=");
        sbLIZ.append(str);
        sbLIZ.append(" mute=");
        sbLIZ.append(z);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1azw.getClass();
        C1AZW.LIZ(str2, strLIZIZ, null, null);
        Iterator<InterfaceC964770bDH> it2 = this.LJII.iterator();
        while (it2.hasNext()) {
            it2.next().LLJI(str, false, z);
        }
    }

    @Override // X.InterfaceC965990bFF
    public final void LJZI(C966020bFI c966020bFI, C965210bDz c965210bDz) {
        LJJIJ(c966020bFI, c965210bDz.LIZ);
        Iterator<InterfaceC964770bDH> it2 = this.LJII.iterator();
        while (it2.hasNext()) {
            it2.next().LJJZZI(c965210bDz);
        }
    }

    @Override // X.InterfaceC965990bFF
    public final void LL(String str, List<PosIdentity> list) {
        InterfaceC964930bDX interfaceC964930bDX;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("notifyLinkMicLayoutContextUpdated ");
        sbLIZ.append(str);
        sbLIZ.append(' ');
        sbLIZ.append(list);
        C1304630k3R.LIZLLL(6, C2188811AlT.LIZIZ(sbLIZ), this.LJI);
        InterfaceC964790bDJ interfaceC964790bDJInvoke = this.LJFF.invoke();
        if ((interfaceC964790bDJInvoke instanceof InterfaceC964930bDX) && (interfaceC964930bDX = (InterfaceC964930bDX) interfaceC964790bDJInvoke) != null) {
            interfaceC964930bDX.LJJLIIIJLJLI(str, list);
        }
    }

    @Override // X.InterfaceC965990bFF
    @InterfaceC1294060jmO
    public final void LLD(C966020bFI c966020bFI, int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onLinkMicStateChanged start linker[");
        sbLIZ.append(c966020bFI.hashCode());
        sbLIZ.append("] state=");
        sbLIZ.append(i);
        C1304630k3R.LIZLLL(6, C2188811AlT.LIZIZ(sbLIZ), this.LJI);
        RtcUserInfo rtcUserInfoLJFF = c966020bFI.LJFF();
        if (this.LIZ == 4 && LinkMicState.Companion.isInitialized(i) && this.LIZIZ.getOwnerUserId() == rtcUserInfoLJFF.userId) {
            InterfaceC964790bDJ interfaceC964790bDJInvoke = this.LJFF.invoke();
            LinkUser.Builder builder = new LinkUser.Builder();
            builder.setRoomId(Long.valueOf(rtcUserInfoLJFF.roomId));
            builder.setUserId(Long.valueOf(rtcUserInfoLJFF.userId));
            builder.setLinkMicId(rtcUserInfoLJFF.linkMicId);
            builder.setChannelId(Long.valueOf(rtcUserInfoLJFF.channelId));
            interfaceC964790bDJInvoke.LJLLILLLL(builder.build(), null, null, true);
        }
        if (this.LIZ == 2 && this.LIZIZ.getOwnerUserId() == rtcUserInfoLJFF.userId) {
            boolean zIsJoiningOrJoinedOrLinked = LinkMicState.Companion.isJoiningOrJoinedOrLinked(i);
            InterfaceC964790bDJ interfaceC964790bDJInvoke2 = this.LJFF.invoke();
            LinkUser.Builder builder2 = new LinkUser.Builder();
            builder2.setRoomId(Long.valueOf(rtcUserInfoLJFF.roomId));
            builder2.setUserId(Long.valueOf(rtcUserInfoLJFF.userId));
            builder2.setLinkMicId(rtcUserInfoLJFF.linkMicId);
            builder2.setChannelId(Long.valueOf(rtcUserInfoLJFF.channelId));
            interfaceC964790bDJInvoke2.LJJJJZI(builder2.build(), zIsJoiningOrJoinedOrLinked);
        }
        InterfaceC964790bDJ interfaceC964790bDJInvoke3 = this.LJFF.invoke();
        LinkMicState.Companion companion = LinkMicState.Companion;
        boolean zIsJoiningOrJoinedOrLinked2 = companion.isJoiningOrJoinedOrLinked(i);
        boolean zIsIdleOrFinished = companion.isIdleOrFinished(i);
        C0C2H c0c2h = (C0C2H) C0C2J.LIZ.getValue();
        RunnableC775480UbS runnableC775480UbS = new RunnableC775480UbS(interfaceC964790bDJInvoke3, rtcUserInfoLJFF, zIsJoiningOrJoinedOrLinked2, zIsIdleOrFinished);
        BPEAHandler bPEAHandler = c0c2h.LIZ;
        if (bPEAHandler != null) {
            C786410Ut5.LJJZZIII(bPEAHandler, new RunnableC20554083k(runnableC775480UbS));
        }
        this.LJFF.invoke().LJJLIIIJ(companion.isJoiningOrJoinedOrLinkedOrFinish(i));
        Iterator<InterfaceC964770bDH> it2 = this.LJII.iterator();
        while (it2.hasNext()) {
            it2.next().LJLJLLL(i, this.LIZLLL);
        }
    }

    @Override // X.InterfaceC965990bFF
    public final void LLFF(C966020bFI c966020bFI, C954780axA c954780axA) {
        String str = this.LJI;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SessionEventDispatcher, onCrossArchLinkStateChanged, state:");
        sbLIZ.append(c954780axA.LIZJ);
        sbLIZ.append("=>");
        sbLIZ.append(c954780axA.LIZIZ);
        sbLIZ.append(" , rtc state:");
        sbLIZ.append(c954780axA.LIZ.LIZIZ);
        sbLIZ.append(", triggerEvent:");
        sbLIZ.append(c954780axA.LIZLLL);
        C20441214yg.LIZIZ(str, C2188811AlT.LIZIZ(sbLIZ));
        LJJIJ(c966020bFI, c954780axA.LIZ);
        Iterator<InterfaceC964770bDH> it2 = this.LJII.iterator();
        while (it2.hasNext()) {
            it2.next().LJJJJZI(c954780axA);
        }
    }

    @Override // X.InterfaceC965990bFF
    public final void LLIFFJFJJ(C966020bFI c966020bFI, ReplyInviteMessage replyInviteMessage) {
        C1AZW c1azw = C1AZW.LIZ;
        String str = this.LJI;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onModeratorReceiveReplyInviteMessage start linker=");
        sbLIZ.append(c966020bFI);
        sbLIZ.append(" replyInviteMessage=");
        sbLIZ.append(replyInviteMessage);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1azw.getClass();
        C1AZW.LIZ(str, strLIZIZ, null, null);
        Iterator<InterfaceC964770bDH> it2 = this.LJII.iterator();
        while (it2.hasNext()) {
            it2.next().LJLLLLLL(this.LIZLLL, replyInviteMessage);
        }
    }

    @Override // X.InterfaceC965990bFF
    public final void LLIIJI(C966020bFI c966020bFI, CreateChannelMessage createChannelMessage) {
        C1AZW c1azw = C1AZW.LIZ;
        String str = this.LJI;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onCreateChannelMessageReceived start linker=");
        sbLIZ.append(c966020bFI);
        sbLIZ.append(" createMessage=");
        sbLIZ.append(createChannelMessage);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1azw.getClass();
        C1AZW.LIZ(str, strLIZIZ, null, null);
        Iterator<InterfaceC964770bDH> it2 = this.LJII.iterator();
        while (it2.hasNext()) {
            it2.next().LLJJJJ(this.LIZLLL, createChannelMessage);
        }
    }

    @Override // X.InterfaceC965990bFF
    public final void LLIIL(C966020bFI c966020bFI, KickOutMessage kickOutMessage) {
        C1AZW c1azw = C1AZW.LIZ;
        String str = this.LJI;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onKickOutMessageReceived linker=");
        sbLIZ.append(c966020bFI);
        sbLIZ.append(" kickOutMessage=");
        sbLIZ.append(kickOutMessage);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1azw.getClass();
        C1AZW.LIZ(str, strLIZIZ, null, null);
        Iterator<InterfaceC964770bDH> it2 = this.LJII.iterator();
        while (it2.hasNext()) {
            it2.next().LLJJIJIIJIL(this.LIZLLL, kickOutMessage);
        }
    }

    @Override // X.InterfaceC965990bFF
    public final void LLIILII(C966020bFI c966020bFI, CancelInviteMessage cancelInviteMessage) {
        C1AZW c1azw = C1AZW.LIZ;
        String str = this.LJI;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onCancelInviteMessageReceived start linker=");
        sbLIZ.append(c966020bFI);
        sbLIZ.append(" cancelInviteMessage=");
        sbLIZ.append(cancelInviteMessage);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1azw.getClass();
        C1AZW.LIZ(str, strLIZIZ, null, null);
        Iterator<InterfaceC964770bDH> it2 = this.LJII.iterator();
        while (it2.hasNext()) {
            it2.next().LLLLLIL(this.LIZLLL, cancelInviteMessage);
        }
    }

    @Override // X.InterfaceC965990bFF
    public final void LLIILZL(C966020bFI c966020bFI, DirectJoinMessage directJoinMessage) {
        C1AZW c1azw = C1AZW.LIZ;
        String str = this.LJI;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onJoinDirectMessageReceived start linker=");
        sbLIZ.append(c966020bFI);
        sbLIZ.append(" message=");
        sbLIZ.append(directJoinMessage);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1azw.getClass();
        C1AZW.LIZ(str, strLIZIZ, null, null);
        Iterator<InterfaceC964770bDH> it2 = this.LJII.iterator();
        while (it2.hasNext()) {
            it2.next().LLIIL(this.LIZLLL, directJoinMessage);
        }
        if (this.LIZJ) {
            InterfaceC964840bDO interfaceC964840bDOLJLIIL = this.LJFF.invoke().LJLIIL();
            if (interfaceC964840bDOLJLIIL != null) {
                interfaceC964840bDOLJLIIL.LJI();
            }
            this.LJFF.invoke().LLIIIZ(EnumC918810a19.StateJoined, directJoinMessage.joiner);
        }
    }

    @Override // X.InterfaceC965990bFF
    public final void LLIIZ(C966020bFI c966020bFI, ReplyInviteMessage replyInviteMessage) {
        C1AZW c1azw = C1AZW.LIZ;
        String str = this.LJI;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onReplyInviteMessageReceived start linker=");
        sbLIZ.append(c966020bFI);
        sbLIZ.append(" replyInviteMessage=");
        sbLIZ.append(replyInviteMessage);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1azw.getClass();
        C1AZW.LIZ(str, strLIZIZ, null, null);
        Iterator<InterfaceC964770bDH> it2 = this.LJII.iterator();
        while (it2.hasNext()) {
            it2.next().LLLLLLL(this.LIZLLL, replyInviteMessage);
        }
        if (replyInviteMessage.replyStatus == 1) {
            InterfaceC964840bDO interfaceC964840bDOLJLIIL = this.LJFF.invoke().LJLIIL();
            if (interfaceC964840bDOLJLIIL != null) {
                interfaceC964840bDOLJLIIL.LJI();
            }
            this.LJFF.invoke().LLIIIZ(EnumC918810a19.StateJoined, replyInviteMessage.invitee);
        }
    }

    @Override // X.InterfaceC965990bFF
    public final void LLIL(C966020bFI c966020bFI, ApplyMessage applyMessage) {
        C1AZW c1azw = C1AZW.LIZ;
        String str = this.LJI;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onApplyMessageReceived start linker=");
        sbLIZ.append(c966020bFI);
        sbLIZ.append(" applyMessage=");
        sbLIZ.append(applyMessage);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1azw.getClass();
        C1AZW.LIZ(str, strLIZIZ, null, null);
        Iterator<InterfaceC964770bDH> it2 = this.LJII.iterator();
        while (it2.hasNext()) {
            it2.next().LLIIIJ(this.LIZLLL, applyMessage);
        }
    }

    @Override // X.InterfaceC965990bFF
    public final void LJII(long j, C1AZU c1azu, C969700bLE c969700bLE) {
        Iterator<InterfaceC964770bDH> it2 = this.LJII.iterator();
        while (it2.hasNext()) {
            it2.next().LJII(j, c1azu, c969700bLE);
        }
    }

    @Override // X.InterfaceC965990bFF
    public final void LJIIJ(String str, C1AZU c1azu, C2231141CUe c2231141CUe) {
        Iterator<InterfaceC964770bDH> it2 = this.LJII.iterator();
        while (it2.hasNext()) {
            it2.next().LJIIJ(str, c1azu, c2231141CUe);
        }
    }

    @Override // X.InterfaceC1279800jPO
    public final void LJIJJ(String[] strArr, boolean[] zArr, int[] iArr) {
        boolean z;
        int i;
        ArrayList arrayList = new ArrayList(strArr.length);
        int length = strArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            String str = strArr[i2];
            int i4 = i3 + 1;
            if (i3 >= 0 && i3 < zArr.length) {
                z = zArr[i3];
            } else {
                z = false;
            }
            if (i3 >= 0 && i3 < iArr.length) {
                i = iArr[i3];
            } else {
                i = 0;
            }
            arrayList.add(new InteractAudioVolumeInfo(str, z, i));
            i2++;
            i3 = i4;
        }
        Iterator<InterfaceC964770bDH> it2 = this.LJII.iterator();
        while (it2.hasNext()) {
            it2.next().LLLLLLLLL(arrayList);
        }
    }

    @Override // X.InterfaceC1279800jPO
    public final void LJJIFFI(int i, int i2, int i3) {
        Iterator<InterfaceC964770bDH> it2 = this.LJII.iterator();
        while (it2.hasNext()) {
            it2.next().LJJIFFI(i, i2, i3);
        }
    }

    @Override // X.InterfaceC1279800jPO
    public final void LJJII(int i, int i2, String str) {
        String str2;
        if (this.LIZJ) {
            return;
        }
        RtcUserInfo rtcUserInfoG0 = this.LIZLLL.G0();
        if (rtcUserInfoG0 != null) {
            str2 = rtcUserInfoG0.linkMicId;
        } else {
            str2 = null;
        }
        if (Intrinsics.LJFF(str, str2) && i != this.LJIIIZ) {
            C1AZW c1azw = C1AZW.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.LJI);
            sbLIZ.append("_onNetworkQualityUpdate linkMicId = ");
            sbLIZ.append(str);
            sbLIZ.append(" txQuality = ");
            sbLIZ.append(i);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c1azw.getClass();
            C1AZW.LIZ("NetworkStateTips", strLIZIZ, null, null);
            Iterator<InterfaceC964770bDH> it2 = this.LJII.iterator();
            while (it2.hasNext()) {
                it2.next().LLJZ(this.LIZLLL, i, i2);
            }
            this.LJIIIZ = i;
        }
    }

    @Override // X.InterfaceC1279800jPO
    public final void LJJJJJ(String str, float f, float f2) {
        C1AZW c1azw = C1AZW.LIZ;
        String str2 = this.LJI;
        c1azw.getClass();
        C1AZW.LIZ(str2, "onRemoteVideoStats", null, null);
        Iterator<InterfaceC964770bDH> it2 = this.LJII.iterator();
        while (it2.hasNext()) {
            it2.next().LJJJJJ(str, f, f2);
        }
    }

    @Override // X.InterfaceC965990bFF
    public final void LLF(long j, String str, LinkUser linkUser) {
        C1304630k3R.LIZLLL(6, "call on User Will joinChannel", this.LJI);
        InterfaceC964840bDO interfaceC964840bDOLJLIIL = this.LJFF.invoke().LJLIIL();
        if (interfaceC964840bDOLJLIIL != null) {
            interfaceC964840bDOLJLIIL.LJIIIIZZ(j);
        }
        if (linkUser != null) {
            this.LJFF.invoke().LJJIJIL(EnumC918810a19.StateJoined, linkUser);
        }
    }

    @Override // X.InterfaceC1279800jPO
    public final void LJIL(int i, int i2, SurfaceView surfaceView, String str) {
        LiveMode streamType;
        if (LiveAbLabelSetting.INSTANCE.getBooleanValue("link_mic_force_push_video_frame")) {
            int i3 = this.LIZ;
            if ((i3 == 4 || i3 == 0) && (streamType = this.LIZIZ.getStreamType()) != null && C354201Zc.LJFF(streamType)) {
                C1AZW c1azw = C1AZW.LIZ;
                String str2 = this.LJI;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onFirstRemoteVideoFrame start linkMicId=");
                sbLIZ.append(str);
                sbLIZ.append(", surfaceView:");
                sbLIZ.append(surfaceView);
                sbLIZ.append(", width:");
                sbLIZ.append(i);
                sbLIZ.append(", height:");
                sbLIZ.append(i2);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                c1azw.getClass();
                C1AZW.LIZ(str2, strLIZIZ, null, null);
                Iterator<InterfaceC964770bDH> it2 = this.LJII.iterator();
                while (it2.hasNext()) {
                    it2.next().LJLLLL(this.LIZLLL, str);
                }
            }
        }
    }

    public final void LJJIJIIJI(EnumC964810bDL enumC964810bDL, String str, SurfaceView surfaceView, InterfaceC1268870j7l interfaceC1268870j7l) {
        String str2;
        this.LJFF.invoke().LJJIJL().LIZ(enumC964810bDL, str, surfaceView, interfaceC1268870j7l);
        RtcUserInfo rtcUserInfoG0 = this.LIZLLL.G0();
        if (rtcUserInfoG0 != null && (str2 = rtcUserInfoG0.linkMicId) != null) {
            if (!this.LJIIJ.containsKey(str2)) {
                this.LJIIJ.put(str2, new HashSet<>());
            }
            HashSet<String> hashSet = this.LJIIJ.get(str2);
            if (hashSet != null && !hashSet.contains(str)) {
                hashSet.add(str);
                Iterator<InterfaceC964770bDH> it2 = this.LJII.iterator();
                while (it2.hasNext()) {
                    it2.next().LLIIIILZ(this.LIZLLL, str);
                }
            }
        }
    }

    @Override // X.InterfaceC965990bFF
    public final void LLIIJLIL(C966020bFI c966020bFI, DestroyChannelMessage destroyChannelMessage, Integer num, Integer num2) {
        C1AZW c1azw = C1AZW.LIZ;
        String str = this.LJI;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onDestroyChannelMessageReceived start linker=");
        sbLIZ.append(c966020bFI);
        sbLIZ.append(" destroyMessage=");
        sbLIZ.append(destroyChannelMessage);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1azw.getClass();
        C1AZW.LIZ(str, strLIZIZ, null, null);
        if (this.LIZLLL.scene() != 0) {
            this.LJFF.invoke().LJIJ("onDestroyChannelMessageReceived");
        }
        Iterator<InterfaceC964770bDH> it2 = this.LJII.iterator();
        while (it2.hasNext()) {
            it2.next().LJLILLLLZI(this.LIZLLL, destroyChannelMessage, num, num2);
        }
    }

    public C964760bDG(int i, Room room, boolean z, InterfaceC954180awC interfaceC954180awC, C2181391AYv c2181391AYv, C965040bDi c965040bDi) {
        this.LIZ = i;
        this.LIZIZ = room;
        this.LIZJ = z;
        this.LIZLLL = interfaceC954180awC;
        this.LJ = c2181391AYv;
        this.LJFF = c965040bDi;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C1283930jW3.LJI(i));
        sbLIZ.append("_SessionEvent[Biz]");
        this.LJI = C2188811AlT.LIZIZ(sbLIZ);
        this.LJII = new CopyOnWriteArraySet<>();
        CopyOnWriteArrayList<String> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        RtcUserInfo rtcUserInfoG0 = interfaceC954180awC.G0();
        if (rtcUserInfoG0 != null) {
            copyOnWriteArrayList.add(rtcUserInfoG0.linkMicId);
        }
        this.LJIIIIZZ = copyOnWriteArrayList;
        this.LJIIIZ = -1;
        this.LJIIJ = new HashMap<>();
    }

    @Override // X.InterfaceC965990bFF
    public final void LJLIL(Map<Long, CohostUserInfo> map, P2PGroupChangeContent p2PGroupChangeContent, String str, List<VirtualWaitingUser> list, Map<Long, CohostABInfo> map2, GamePlayContent gamePlayContent, Map<Long, GuestUserInfo> map3) {
        List<VirtualWaitingUser> arrayList;
        Map<Long, GuestUserInfo> linkedHashMap;
        for (InterfaceC964770bDH interfaceC964770bDH : this.LJII) {
            int i = this.LIZ;
            BusinessContent businessContent = new BusinessContent(0L, null, null);
            CohostContent cohostContent = new CohostContent();
            ListChangeBizContent listChangeBizContent = new ListChangeBizContent();
            listChangeBizContent.userInfos = map;
            if (list == null) {
                arrayList = new ArrayList<>();
            } else {
                arrayList = list;
            }
            listChangeBizContent.waitingUsers = arrayList;
            listChangeBizContent.abInfos = map2;
            listChangeBizContent.gameplayContent = gamePlayContent;
            if (map3 == null) {
                linkedHashMap = new LinkedHashMap<>();
            } else {
                linkedHashMap = map3;
            }
            listChangeBizContent.guestUserInfos = linkedHashMap;
            cohostContent.listChangeBizContent = listChangeBizContent;
            businessContent.cohostContent = cohostContent;
            CustomLinkMessage customLinkMessage = new CustomLinkMessage(i, new BizContentWrapper(businessContent, p2PGroupChangeContent), null);
            if (this.LIZLLL.LJIILIIL()) {
                InterfaceC954180awC interfaceC954180awC = this.LIZLLL;
                interfaceC964770bDH.LLLFFI(interfaceC954180awC, 31, interfaceC954180awC.LLJJ(), str, customLinkMessage);
            } else {
                InterfaceC954180awC interfaceC954180awC2 = this.LIZLLL;
                interfaceC964770bDH.LLJLLIL(interfaceC954180awC2, 31, interfaceC954180awC2.LLJJ(), str, customLinkMessage);
            }
        }
    }
}
