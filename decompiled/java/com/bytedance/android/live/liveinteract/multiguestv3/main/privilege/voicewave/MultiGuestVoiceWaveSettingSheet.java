package com.bytedance.android.live.liveinteract.multiguestv3.main.privilege.voicewave;

import X.AbstractC712240Rwk;
import X.AbstractC973380bRA;
import X.C01GW;
import X.C01NB;
import X.C01Z4;
import X.C053100Hh;
import X.C0IJT;
import X.C1087110eOb;
import X.C11NJ;
import X.C11PQ;
import X.C11S5;
import X.C12ES;
import X.C1324610kZf;
import X.C1324720kZq;
import X.C13BV;
import X.C16F5;
import X.C16FZ;
import X.C1701940uOG;
import X.C1819620xS4;
import X.C19487311Lz;
import X.C197039127h;
import X.C20632315oP;
import X.C20736316Cj;
import X.C2187701Ajg;
import X.C439101nJ;
import X.C452501pT;
import X.C474500IjA;
import X.C475510Ikn;
import X.C480460Ism;
import X.C497740JfY;
import X.C516201zk;
import X.C786410Ut5;
import X.C915980Zwa;
import X.C922460a72;
import X.C926450aDT;
import X.C927400aF0;
import X.C930540aK4;
import X.C973330bR5;
import X.C973410bRD;
import X.InterfaceC440740HQa;
import X.InterfaceC954180awC;
import X.InterfaceC964770bDH;
import X.ViewTreeObserverOnGlobalLayoutListenerC987060bnE;
import Y.AAListenerS317S0100000_6;
import Y.ACListenerS150S0100000_15;
import Y.AfS184S0100000_15;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Bundle;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.live.liveinteract.linkroom.toolbarbehavior.ToolbarMultiGuestManageBehavior;
import com.bytedance.android.live.liveinteract.multiguestv3.main.privilege.voicewave.MultiGuestVoiceWaveSettingSheet;
import com.bytedance.android.live.liveinteract.multilive.social.model.RightDisableReq;
import com.bytedance.android.live.liveinteract.multilive.social.model.SoundWaveEffectListReq;
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
import com.bytedance.android.livesdk.dataChannel.MultiGuestShowLayoutSettingDialogEvent;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestVoiceWaveScaleFactorSetting;
import com.bytedance.android.livesdk.model.message.linker.listchangemessage.LinkListUser;
import com.bytedance.bddatefmt.BDDateFormat;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS585S0100000_6;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;
import webcast.data.multi_guest_social_data.Avatar;
import webcast.data.multi_guest_social_data.SoundWareEffect;

/* JADX INFO: loaded from: classes16.dex */
public final class MultiGuestVoiceWaveSettingSheet extends LiveSheetFragment {
    public static final float LLLILZJ = MultiGuestVoiceWaveScaleFactorSetting.INSTANCE.getValue();
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4ZyImJDElLjo2OzE6emE+KSHELIOSwiZz8hITMlJSo0LWs6JiYwLTItPyp9BTAgPSYUPSA/PRk8ISYpHi4lLRYpPTs6JiIfISo2PA==";
    public C20632315oP LLJLLL;
    public C16F5 LLJZ;
    public C16F5 LLJZIJLIL;
    public C197039127h LLL;
    public C1324720kZq LLLF;
    public C1087110eOb LLLFF;
    public C16FZ LLLFFI;
    public LiveIconView LLLFZ;
    public SoundWareEffect LLLIIII;
    public final SoundWareEffect LLLIIIL;
    public Long LLLIIL;
    public final C01GW LLLIILIL;
    public final C922460a72 LLLIL;
    public final AwS585S0100000_6 LLLILZ;
    public final List<SoundWareEffect> LLLI = new ArrayList();
    public final C11PQ<AbstractC973380bRA> LLLII = C11PQ.LJLLLLLL(C973410bRD.LIZ);
    public final C11NJ LLLIIIIL = new C11NJ();

    /* JADX WARN: Removed duplicated region for block: B:11:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x001c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zS() {
        /*
            r5 = this;
            webcast.data.multi_guest_social_data.SoundWareEffect r0 = r5.LLLIIII
            if (r0 == 0) goto L19
            java.lang.String r4 = r0.obtainSchema
            if (r4 == 0) goto L1a
            boolean r0 = kotlin.text.a0.LJJJIL(r4)
            if (r0 != 0) goto L1a
            r0 = 0
        Lf:
            java.lang.String r3 = "MultiGuestVoiceWaveSettingSheet"
            if (r0 == 0) goto L1c
            java.lang.String r0 = "openSoundEffectActivityPage : No Schema"
            X.C20441214yg.LJ(r3, r0)
            return
        L19:
            r4 = 0
        L1a:
            r0 = 1
            goto Lf
        L1c:
            android.content.Context r2 = r5.getContext()     // Catch: java.lang.Exception -> L2f
            if (r2 == 0) goto L4a
            java.lang.Class<com.bytedance.android.live.browser.IHybridContainerService> r0 = com.bytedance.android.live.browser.IHybridContainerService.class
            X.006A r1 = X.C1161920gLG.LIZJ(r0)     // Catch: java.lang.Exception -> L2f
            com.bytedance.android.live.browser.IHybridContainerService r1 = (com.bytedance.android.live.browser.IHybridContainerService) r1     // Catch: java.lang.Exception -> L2f
            r0 = 0
            r1.YC1(r2, r4, r0)     // Catch: java.lang.Exception -> L2f
            return
        L2f:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "openSoundEffectActivityPage : "
            r1.append(r0)
            java.lang.String r0 = r2.getMessage()
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C20441214yg.LJ(r3, r0)
        L4a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguestv3.main.privilege.voicewave.MultiGuestVoiceWaveSettingSheet.zS():void");
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [X.0a72] */
    public MultiGuestVoiceWaveSettingSheet() {
        SoundWareEffect soundWareEffect = new SoundWareEffect();
        soundWareEffect.rightId = 0L;
        soundWareEffect.userRightId = 0L;
        soundWareEffect.staticImageName = "";
        soundWareEffect.dynamicImageName = C053100Hh.LIZ("sound_wave_default_dynamic");
        soundWareEffect.btnTitle = C497740JfY.LJIJI(2131854229);
        soundWareEffect.btnStatus = 3;
        soundWareEffect.status = 1;
        soundWareEffect.rightBtnDisable = true;
        this.LLLIIIL = soundWareEffect;
        this.LLLIILIL = C452501pT.LIZIZ(new AwS559S0100000_15(this, 349));
        this.LLLIL = new InterfaceC964770bDH() { // from class: X.0a72
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
            public final void LJJIZ(String str, long j) {
                String str2;
                LinkListUser linkListUserLIZJ = C01Z9.LIZJ(C950220apo.LJFF());
                if (linkListUserLIZJ != null) {
                    str2 = linkListUserLIZJ.linkMicId;
                } else {
                    str2 = null;
                }
                if (Intrinsics.LJFF(str, str2)) {
                    this.LL.close(1);
                }
            }

            @Override // X.InterfaceC964770bDH
            public final void LLJJIJIIJIL(InterfaceC954180awC interfaceC954180awC, KickOutMessage kickOutMessage) {
                Long l = kickOutMessage.owner.userId;
                long jLJFF = C950220apo.LJFF();
                if (l != null && l.longValue() == jLJFF) {
                    this.LL.close(1);
                }
            }

            @Override // X.InterfaceC964770bDH
            public final void LLLLLLIL(InterfaceC954180awC interfaceC954180awC, LeaveMessage leaveMessage) {
                Long l = leaveMessage.leftUser.userId;
                long jLJFF = C950220apo.LJFF();
                if (l != null && l.longValue() == jLJFF) {
                    this.LL.close(1);
                }
            }

            @Override // X.InterfaceC964770bDH
            public final void LJLILLLLZI(InterfaceC954180awC interfaceC954180awC, DestroyChannelMessage destroyChannelMessage, Integer num, Integer num2) {
                this.LL.close(1);
            }
        };
        this.LLLILZ = new AwS585S0100000_6(this, 31);
    }

    public final void uS() {
        DataChannel dataChannelLJ;
        if (C930540aK4.LIZJ()) {
            DataChannel dataChannelLJ2 = C475510Ikn.LJ(this);
            if (dataChannelLJ2 != null) {
                dataChannelLJ2.LC0(MultiGuestShowLayoutSettingDialogEvent.class, new C927400aF0(false, false, 3));
                return;
            }
            return;
        }
        if (!C930540aK4.LJFF() || ((Boolean) this.LLLIILIL.getValue()).booleanValue() || (dataChannelLJ = C475510Ikn.LJ(this)) == null) {
            return;
        }
        dataChannelLJ.LC0(ToolbarMultiGuestManageBehavior.ShowMultiGuestMenuEvent.class, new C926450aDT(false));
    }

    public final void BS(long j) {
        List<SoundWareEffect> list = this.LLLI;
        if (list != null) {
            ArrayList<SoundWareEffect> arrayList = new ArrayList();
            for (SoundWareEffect soundWareEffect : list) {
                SoundWareEffect soundWareEffect2 = soundWareEffect;
                if (soundWareEffect2.userRightId != j && soundWareEffect2.status == 1) {
                    arrayList.add(soundWareEffect);
                }
            }
            for (SoundWareEffect soundWareEffect3 : arrayList) {
            }
        }
        List<SoundWareEffect> list2 = this.LLLI;
        ArrayList<SoundWareEffect> arrayList2 = new ArrayList();
        for (Object obj : (ArrayList) list2) {
            SoundWareEffect soundWareEffect4 = (SoundWareEffect) obj;
            if (soundWareEffect4.userRightId != j && soundWareEffect4.btnStatus == 3) {
                arrayList2.add(obj);
            }
        }
        for (SoundWareEffect soundWareEffect5 : arrayList2) {
            soundWareEffect5.btnTitle = C497740JfY.LJIJI(2131854230);
            soundWareEffect5.btnStatus = 1;
            soundWareEffect5.rightBtnDisable = false;
        }
    }

    public final void ES(SoundWareEffect soundWareEffect) {
        C197039127h c197039127h;
        float f;
        C197039127h c197039127h2 = this.LLL;
        if (c197039127h2 != null) {
            c197039127h2.setText(soundWareEffect.btnTitle);
        }
        C197039127h c197039127h3 = this.LLL;
        if (c197039127h3 != null) {
            if (soundWareEffect.rightId == 0 && soundWareEffect.rightBtnDisable) {
                f = 0.5f;
            } else {
                f = 1.0f;
            }
            C786410Ut5.w5(c197039127h3, f);
        }
        if (soundWareEffect.rightId != 0 && (c197039127h = this.LLL) != null) {
            c197039127h.setEnabled(!soundWareEffect.rightBtnDisable);
        }
        C197039127h c197039127h4 = this.LLL;
        if (c197039127h4 != null) {
            c197039127h4.LJJJJL(null);
        }
        int i = soundWareEffect.btnStatus;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            C197039127h c197039127h5 = this.LLL;
                            if (c197039127h5 != null) {
                                C12ES.LJIILL(0, c197039127h5);
                            }
                            C197039127h c197039127h6 = this.LLL;
                            if (c197039127h6 != null) {
                                c197039127h6.setButtonVariant(0);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    C197039127h c197039127h7 = this.LLL;
                    if (c197039127h7 != null) {
                        C12ES.LJIILL(0, c197039127h7);
                    }
                    C197039127h c197039127h8 = this.LLL;
                    if (c197039127h8 == null) {
                        return;
                    }
                    c197039127h8.LJJJJL(this.LLLILZ);
                    return;
                }
                C197039127h c197039127h9 = this.LLL;
                if (c197039127h9 != null) {
                    C12ES.LJIILL(0, c197039127h9);
                }
                C197039127h c197039127h10 = this.LLL;
                if (c197039127h10 == null) {
                    return;
                }
                c197039127h10.setButtonVariant(0);
                return;
            }
            C197039127h c197039127h11 = this.LLL;
            if (c197039127h11 != null) {
                C12ES.LJIILL(0, c197039127h11);
            }
            C197039127h c197039127h12 = this.LLL;
            if (c197039127h12 == null) {
                return;
            }
            c197039127h12.setButtonVariant(0);
            return;
        }
        C197039127h c197039127h13 = this.LLL;
        if (c197039127h13 == null) {
            return;
        }
        C12ES.LJIILL(4, c197039127h13);
    }

    public final void FS(SoundWareEffect soundWareEffect) {
        Iterator it2 = ((ArrayList) this.LLLI).iterator();
        int i = 0;
        while (it2.hasNext()) {
            if (((SoundWareEffect) it2.next()).userRightId == soundWareEffect.userRightId) {
                if (i != -1) {
                    ListProtector.set(this.LLLI, i, soundWareEffect);
                    return;
                }
                return;
            }
            i++;
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, X.InterfaceC20484815Dq
    public final int QM(Context context) {
        return C20736316Cj.LIZIZ(R.attr.c_h, context);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions iS(Context context) {
        SheetOptions sheetOptions = new SheetOptions();
        sheetOptions.LIZ(0, null);
        sheetOptions.cornerRadius = (int) C497740JfY.LIZIZ(12.0f);
        sheetOptions.canceledOnTouchOutside = true;
        return sheetOptions;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String strU3;
        super.onCreate(bundle);
        AwS594S0100000_15 awS594S0100000_15 = new AwS594S0100000_15(this, 418);
        AwS594S0100000_15 awS594S0100000_152 = new AwS594S0100000_15(this, 419);
        SoundWaveEffectListReq soundWaveEffectListReq = new SoundWaveEffectListReq();
        Long lLJIIJ = C930540aK4.LJIIJ();
        if (lLJIIJ != null) {
            soundWaveEffectListReq.roomId = lLJIIJ.longValue();
            InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
            if (interfaceC954180awCLLJLL != null && (strU3 = interfaceC954180awCLLJLL.U3()) != null) {
                soundWaveEffectListReq.channelId = CastLongProtector.parseLong(strU3);
                soundWaveEffectListReq.scene = 2;
                C480460Ism.LIZ().getClass();
                C19487311Lz.LIZJ(C01NB.LIZ(((IMultiGuestRightAPI) C480460Ism.LIZLLL(IMultiGuestRightAPI.class)).getSoundWaveEffectList(soundWaveEffectListReq).LJJIJIIJI(C11S5.LIZ()).LJJ(C1701940uOG.LIZIZ()).LJIILL(new C516201zk(awS594S0100000_15, 137)).LJIIL(new C516201zk(awS594S0100000_152, 138))), this.LLLIIIIL, null, null, 30);
            }
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, X.InterfaceC20484815Dq
    public final void x1(int i) {
        String str;
        this.LLLIIIIL.LJ();
        C915980Zwa.LJIIIIZZ().a9(this.LLLIL);
        Long l = this.LLLIIL;
        if (l != null) {
            long jCurrentTimeMillis = System.currentTimeMillis() - l.longValue();
            HashMap map = new HashMap();
            C01Z4.LIZ(null, map);
            if (C930540aK4.LIZJ()) {
                str = "anchor";
            } else {
                str = "guest";
            }
            map.put("user_type", str);
            map.put("page_type", "audio_ring_choose");
            map.put("page_preview_duration", String.valueOf(jCurrentTimeMillis));
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_multi_audio_ring_choose_page_preview");
            c474500IjALIZ.LJJIIZI(map);
            c474500IjALIZ.LIZ();
        }
        uS();
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00cf, code lost:
    
        r3 = 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void yS(java.util.List<webcast.data.multi_guest_social_data.SoundWareEffect> r11) {
        /*
            Method dump skipped, instruction units count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguestv3.main.privilege.voicewave.MultiGuestVoiceWaveSettingSheet.yS(java.util.List):void");
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        ViewTreeObserver viewTreeObserver;
        LiveIconView liveIconView;
        super.onViewCreated(view, bundle);
        this.LLJLLL = (C20632315oP) view.findViewById(R.id.viewPager);
        this.LLLF = (C1324720kZq) view.findViewById(R.id.user_avatar);
        this.LLJZ = (C16F5) view.findViewById(R.id.a6j);
        this.LLJZIJLIL = (C16F5) view.findViewById(R.id.a6h);
        this.LLL = (C197039127h) view.findViewById(R.id.poy);
        this.LLLFF = (C1087110eOb) view.findViewById(R.id.j63);
        this.LLLFFI = (C16FZ) view.findViewById(R.id.nnp);
        this.LLLFZ = (LiveIconView) view.findViewById(R.id.bn7);
        if (((Boolean) this.LLLIILIL.getValue()).booleanValue() && (liveIconView = this.LLLFZ) != null) {
            C439101nJ.LJI(liveIconView);
        }
        C20632315oP c20632315oP = this.LLJLLL;
        C1324720kZq c1324720kZq = this.LLLF;
        if (c1324720kZq != null && (viewTreeObserver = c1324720kZq.getViewTreeObserver()) != null) {
            ViewTreeObserverOnGlobalLayoutListenerC987060bnE viewTreeObserverOnGlobalLayoutListenerC987060bnE = new ViewTreeObserverOnGlobalLayoutListenerC987060bnE(this, c20632315oP, 0);
            viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC987060bnE);
            C2187701Ajg.LIZ(viewTreeObserver, viewTreeObserverOnGlobalLayoutListenerC987060bnE, ViewTreeObserver.OnGlobalLayoutListener.class);
        }
        C20632315oP c20632315oP2 = this.LLJLLL;
        if (c20632315oP2 != null) {
            c20632315oP2.setOffscreenPageLimit(2);
            List list = this.LLLI;
            if (list == null) {
                list = C13BV.INSTANCE;
            }
            c20632315oP2.setAdapter(new C973330bR5(list));
            final WeakReference weakReference = new WeakReference(this.LLLF);
            c20632315oP2.setPageTransformer(new InterfaceC440740HQa(weakReference) { // from class: X.0Gd4
                public final WeakReference<View> LIZ;

                {
                    this.LIZ = weakReference;
                }

                @Override // X.InterfaceC440740HQa
                public final void LIZ(View view2, float f) {
                    View view3;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("position: ");
                    sbLIZ.append(f);
                    C20441214yg.LIZIZ("CarouselPageTransformer", C2188811AlT.LIZIZ(sbLIZ));
                    float f2 = 1;
                    float fAbs = f2 - (Math.abs(f) * 0.5f);
                    if (fAbs < 0.5f) {
                        fAbs = 0.5f;
                    }
                    C786410Ut5.Ob(view2, fAbs);
                    C786410Ut5.pc(view2, fAbs);
                    float fAbs2 = f2 - (Math.abs(f) * 0.5f);
                    if (fAbs2 < 0.5f) {
                        fAbs2 = 0.5f;
                    }
                    C786410Ut5.T4(view2, fAbs2);
                    float width = view2.getWidth() * 0.62f * Math.abs(f);
                    view2.setPivotX(view2.getWidth() / 2.0f);
                    view2.setPivotY(view2.getHeight() / 2.0f);
                    if (f > 0.0f) {
                        width = -width;
                    } else if (f >= 0.0f) {
                        width = 0.0f;
                    }
                    C786410Ut5.Jc(view2, width);
                    if (f > -1.0f && f < 1.0f) {
                        if (Math.abs(f) == 0.0f) {
                            WeakReference<View> weakReference2 = this.LIZ;
                            if (weakReference2 != null && (view3 = weakReference2.get()) != null) {
                                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view3, (Property<View, Float>) View.ALPHA, view3.getAlpha(), 1.0f);
                                objectAnimatorOfFloat.setDuration(200L);
                                objectAnimatorOfFloat.addListener(new AAListenerS317S0100000_6(view3, 32));
                                objectAnimatorOfFloat.addListener(new AAListenerS317S0100000_6(view3, 33));
                                C786410Ut5.Pd(objectAnimatorOfFloat);
                                return;
                            }
                            return;
                        }
                        View view4 = this.LIZ.get();
                        if (view4 == null) {
                            return;
                        }
                        C786410Ut5.T4(view4, 0.5f);
                    }
                }
            });
        }
        C20632315oP c20632315oP3 = this.LLJLLL;
        if (c20632315oP3 != null) {
            c20632315oP3.LIZIZ(new AbstractC712240Rwk() { // from class: X.0bR6
                @Override // X.AbstractC712240Rwk
                public final void onPageSelected(int i) {
                    AbstractC21673619ry adapter;
                    long j;
                    C973330bR5 c973330bR5;
                    String strLJIJI;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onPageSelected: ");
                    sbLIZ.append(i);
                    C20441214yg.LIZIZ("MultiGuestVoiceWaveSettingSheet", C2188811AlT.LIZIZ(sbLIZ));
                    SoundWareEffect soundWareEffect = (SoundWareEffect) C13LP.LJJJLZIJ(i, this.LL.LLLI);
                    if (soundWareEffect != null) {
                        MultiGuestVoiceWaveSettingSheet multiGuestVoiceWaveSettingSheet = this.LL;
                        SoundWareEffect soundWareEffect2 = multiGuestVoiceWaveSettingSheet.LLLIIII;
                        if (soundWareEffect2 != null) {
                            C922820a7c.LIZLLL("audio_ring_switch", Long.valueOf(soundWareEffect.rightId), soundWareEffect2.rightId, "slide");
                        }
                        multiGuestVoiceWaveSettingSheet.LLLIIII = soundWareEffect;
                        C16F5 c16f5 = multiGuestVoiceWaveSettingSheet.LLJZ;
                        if (c16f5 != null) {
                            c16f5.setText(soundWareEffect.rightTitle);
                        }
                        C16F5 c16f52 = multiGuestVoiceWaveSettingSheet.LLJZIJLIL;
                        if (c16f52 != null) {
                            c16f52.setText(u.LJJIFFI(soundWareEffect.rightDesc, "{s_date}", new BDDateFormat("LL-Y").LIZIZ(((long) LSPassThroughRecordSizeConfig.DEFAULT) * soundWareEffect.expireTs, Locale.getDefault()), false));
                        }
                        C197039127h c197039127h = multiGuestVoiceWaveSettingSheet.LLL;
                        if (c197039127h != null) {
                            if (!a0.LJJJIL(soundWareEffect.btnTitle)) {
                                strLJIJI = soundWareEffect.btnTitle;
                            } else {
                                int i2 = soundWareEffect.btnStatus;
                                if (i2 != 1) {
                                    if (i2 != 2) {
                                        if (i2 != 3) {
                                            if (i2 != 4) {
                                                strLJIJI = "";
                                            } else {
                                                strLJIJI = C497740JfY.LJIJI(2131854228);
                                            }
                                        } else {
                                            strLJIJI = C497740JfY.LJIJI(2131854229);
                                        }
                                    } else {
                                        strLJIJI = C497740JfY.LJIJI(2131854231);
                                    }
                                } else {
                                    strLJIJI = C497740JfY.LJIJI(2131854230);
                                }
                            }
                            c197039127h.setText(strLJIJI);
                        }
                        multiGuestVoiceWaveSettingSheet.ES(soundWareEffect);
                        C20632315oP c20632315oP4 = multiGuestVoiceWaveSettingSheet.LLJLLL;
                        if (c20632315oP4 != null) {
                            adapter = c20632315oP4.getAdapter();
                        } else {
                            adapter = null;
                        }
                        if ((adapter instanceof C973330bR5) && (c973330bR5 = (C973330bR5) adapter) != null) {
                            c973330bR5.LLLFZ(i);
                        }
                        String strLIZ = C922820a7c.LIZ(Integer.valueOf(soundWareEffect.btnStatus));
                        SoundWareEffect soundWareEffect3 = multiGuestVoiceWaveSettingSheet.LLLIIII;
                        if (soundWareEffect3 != null) {
                            j = soundWareEffect3.rightId;
                        } else {
                            j = 0;
                        }
                        C922820a7c.LIZLLL(strLIZ, null, j, "show");
                    }
                }
            });
        }
        C1324720kZq c1324720kZq2 = this.LLLF;
        if (c1324720kZq2 != null) {
            C1324610kZf c1324610kZfLJIIIZ = C1819620xS4.LIZ().LJIIIZ(C930540aK4.LJIIJJI().getAvatarThumb());
            c1324610kZfLJIIIZ.LJIIIZ = R.drawable.el_;
            c1324610kZfLJIIIZ.LJIILIIL = Boolean.TRUE;
            c1324610kZfLJIIIZ.LJJI(c1324720kZq2);
        }
        this.LLLIIIIL.LIZ(this.LLLII.LJJIFFI().LJJIJIIJIL(new AfS184S0100000_15(this, 65)).LJJLJ());
        C197039127h c197039127h = this.LLL;
        if (c197039127h != null) {
            C786410Ut5.U8(c197039127h, new ACListenerS150S0100000_15(this, 187));
        }
        LiveIconView liveIconView2 = this.LLLFZ;
        if (liveIconView2 != null) {
            C786410Ut5.g8(liveIconView2, new ACListenerS150S0100000_15(this, 188));
        }
        C915980Zwa.LJIIIIZZ().Fe(this.LLLIL);
        this.LLLIIL = Long.valueOf(System.currentTimeMillis());
    }

    public static void wS(MultiGuestVoiceWaveSettingSheet multiGuestVoiceWaveSettingSheet, long j, Function1 function1) {
        String strU3;
        multiGuestVoiceWaveSettingSheet.getClass();
        RightDisableReq rightDisableReq = new RightDisableReq();
        Long lLJIIJ = C930540aK4.LJIIJ();
        if (lLJIIJ != null) {
            rightDisableReq.roomId = lLJIIJ.longValue();
            InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
            if (interfaceC954180awCLLJLL != null && (strU3 = interfaceC954180awCLLJLL.U3()) != null) {
                rightDisableReq.channelId = CastLongProtector.parseLong(strU3);
                rightDisableReq.userRightId = j;
                C480460Ism.LIZ().getClass();
                C19487311Lz.LIZJ(C01NB.LIZ(((IMultiGuestRightAPI) C480460Ism.LIZLLL(IMultiGuestRightAPI.class)).disableRight(rightDisableReq).LJJIJIIJI(C11S5.LIZ()).LJJ(C1701940uOG.LIZIZ()).LJIILL(new C516201zk(function1, 133)).LJIIL(new C516201zk((Object) null, 134))), multiGuestVoiceWaveSettingSheet.LLLIIIIL, null, null, 30);
            }
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.hdt, viewGroup, false);
    }
}
