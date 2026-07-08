package X;

import Y.ARunnableS115S0100000_15;
import android.content.Context;
import android.view.SurfaceView;
import com.bytedance.android.live.liveinteract.cohost.remote.api.CoHostApi;
import com.bytedance.android.live.liveinteract.multihost.biz.link.MultiCoHostWidget;
import com.bytedance.android.livesdk.common.StreamFeatureManager;
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
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.CohostServerOptVersionSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveCoHostSubtitleConfig;
import com.bytedance.android.livesdk.model.message.CohostTranslatePopUpMessage;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.lyrax.transcoder.LyraxTranscoderFeature;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMListenerType;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import webcast.data.multi_guest_social_data.Avatar;

/* JADX INFO: renamed from: X.0b1T, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C957450b1T extends AbstractC957470b1V implements InterfaceC964770bDH, InterfaceC957540b1c {
    public final C957460b1U LLIZLLLIL = new OnIMMessageListener() { // from class: X.0b1U
        @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
        public final String messageListenerBizTag() {
            return "cohost-anchor-subtitle";
        }

        @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
        public final IMListenerType messageListenerType() {
            return IMListenerType.SYNC;
        }

        @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
        public final void onMessage(IMessage iMessage) {
            String str;
            final String str2;
            String str3;
            if (iMessage instanceof CohostTranslatePopUpMessage) {
                C957450b1T c957450b1T = this.LL;
                CohostTranslatePopUpMessage cohostTranslatePopUpMessage = (CohostTranslatePopUpMessage) iMessage;
                c957450b1T.getClass();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onTranslatePopUpMessage title=");
                Text text = cohostTranslatePopUpMessage.title;
                if (text != null) {
                    str = text.defaultPattern;
                } else {
                    str = null;
                }
                sbLIZ.append(str);
                C20441214yg.LIZIZ("CoHostAnchorSubtitle", C2188811AlT.LIZIZ(sbLIZ));
                C957530b1b.LL.getClass();
                LiveCoHostSubtitleConfig liveCoHostSubtitleConfig = LiveCoHostSubtitleConfig.INSTANCE;
                if (liveCoHostSubtitleConfig.isEnabled() && C957530b1b.LLILLL.hasRight == 1) {
                    if (liveCoHostSubtitleConfig.getValue().firstGuideUrl.length() == 0) {
                        C20441214yg.LIZIZ("CoHostAnchorSubtitle", "shouldShowGuidePanel: firstGuideUrl is empty");
                        return;
                    }
                    Boolean boolLIZIZ = InterfaceC960800b6s.LLLLLL.LIZIZ();
                    Boolean bool = Boolean.TRUE;
                    if (Intrinsics.LJFF(boolLIZIZ, bool)) {
                        C20441214yg.LIZIZ("CoHostAnchorSubtitle", "shouldShowGuidePanel: guide already shown");
                        return;
                    }
                    if (Intrinsics.LJFF(InterfaceC960800b6s.LLLLLLIL.LIZIZ(), bool)) {
                        C20441214yg.LIZIZ("CoHostAnchorSubtitle", "shouldShowGuidePanel: user has already updated subtitle setting");
                        return;
                    }
                    Context context = c957450b1T.LLILLL;
                    if (context == null) {
                        C20441214yg.LJIIL("CoHostAnchorSubtitle", "onTranslatePopUpMessage: context is null, skipping guide panel");
                        return;
                    }
                    Text text2 = cohostTranslatePopUpMessage.title;
                    final String str4 = "";
                    if (text2 == null || (str2 = text2.defaultPattern) == null) {
                        str2 = "";
                    }
                    Text text3 = cohostTranslatePopUpMessage.content;
                    if (text3 != null && (str3 = text3.defaultPattern) != null) {
                        str4 = str3;
                    }
                    InterfaceC960800b6s.LLLLLL.LJFF(Boolean.TRUE);
                    C970940bNE.LIZJ(context, new AbstractC970950bNF(str2, str4) { // from class: X.0b1W
                        public final String LLIZ;

                        @Override // X.AbstractC970950bNF
                        public final List<String> LJLLLL() {
                            return C13BV.INSTANCE;
                        }

                        @Override // X.AbstractC970950bNF
                        public final String LJLLLLLL() {
                            return this.LLIZ;
                        }

                        {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append(LiveCoHostSubtitleConfig.INSTANCE.getValue().firstGuideUrl);
                            sbLIZ2.append("&channel_id=");
                            sbLIZ2.append(C915980Zwa.LIZLLL().getChannelId());
                            this.LLIZ = C2188811AlT.LIZIZ(sbLIZ2);
                            this.LLILLJJLI.put("title", str2);
                            this.LLILLJJLI.put("content", str4);
                        }
                    });
                    C20441214yg.LIZIZ("CoHostAnchorSubtitle", "onTranslatePopUpMessage: guide panel opened");
                    return;
                }
                C20441214yg.LIZIZ("CoHostAnchorSubtitle", "shouldShowGuidePanel: user has no subtitle right");
            }
        }
    };
    public final boolean LLJ = true;
    public final Set<String> LLJI = new LinkedHashSet();
    public final Set<String> LLJIJIL = new LinkedHashSet();
    public final Set<String> LLJILJIL = new LinkedHashSet();

    @Override // X.InterfaceC964770bDH
    public final void LIZ(long j, C1AZU c1azu) {
    }

    @Override // X.InterfaceC964770bDH
    public final void LJFF(C954780axA c954780axA) {
    }

    @Override // X.InterfaceC964770bDH
    public final void LJII(long j, C1AZU c1azu, C969700bLE c969700bLE) {
    }

    @Override // X.AbstractC957470b1V
    public final void LJIIIZ() throws JSONException {
        LJIILJJIL(true);
        C957530b1b.LL.getClass();
        C957530b1b.LLILLJJLI = null;
        InterfaceC954180awC interfaceC954180awCLJIIIZ = C915980Zwa.LJII().LJIIIZ();
        if (interfaceC954180awCLJIIIZ != null) {
            interfaceC954180awCLJIIIZ.LLIFFJFJJ(this);
        }
        IMessageManager iMessageManager = this.LLILZ;
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener((OnIMMessageListener) this.LLIZLLLIL);
        }
        this.LLJILJIL.clear();
        super.LJIIIZ();
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

    @Override // X.AbstractC957470b1V
    public final void LJIIIIZZ() {
        C957530b1b c957530b1b = C957530b1b.LL;
        C957530b1b.LIZ(false);
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room == null || room.getOwner() == null) {
            return;
        }
        long id = room.getId();
        String secUid = room.getOwner().getSecUid();
        HashMap map = new HashMap();
        map.put("cohost-arch-version", String.valueOf(CohostServerOptVersionSetting.INSTANCE.getValue()));
        HashMap map2 = new HashMap();
        map2.put("subtitle_enable", "2");
        C480460Ism.LIZ().getClass();
        C11NZ<R> c11nzLJIILIIL = ((CoHostApi) C480460Ism.LIZLLL(CoHostApi.class)).updateAnchorSetting(id, secUid, 10001, map2, map).LJIILIIL(new C0UO0());
        if (c11nzLJIILIIL != 0) {
            c11nzLJIILIIL.LJJLL(new C09JN() { // from class: X.00K7
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("CoHostAnchorSubtitleComponent@547b.disableSubtitle$1");
                    C20441214yg.LIZIZ("CoHostAnchorSubtitle", "disableSubtitle: success");
                    C1C7U.LIZIZ("CoHostAnchorSubtitleComponent@547b.disableSubtitle$1");
                }
            }, new C09JN() { // from class: X.00K6
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("CoHostAnchorSubtitleComponent@547b.disableSubtitle$2");
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("disableSubtitle: failed: ");
                    sbLIZ.append(obj);
                    C20441214yg.LJIIL("CoHostAnchorSubtitle", C2188811AlT.LIZIZ(sbLIZ));
                    C1C7U.LIZIZ("CoHostAnchorSubtitleComponent@547b.disableSubtitle$2");
                }
            }).isDisposed();
        }
    }

    @Override // X.InterfaceC957540b1c
    public final void LIZJ() {
        LJIILL(this);
    }

    @Override // X.AbstractC957470b1V
    public final boolean LJI() {
        return this.LLJ;
    }

    public static void LJIILL(C957450b1T c957450b1T) {
        c957450b1T.getClass();
        C957530b1b.LL.getClass();
        boolean z = false;
        if (LiveCoHostSubtitleConfig.INSTANCE.isEnabled() && C957530b1b.LLILLL.hasRight == 1 && C957530b1b.LLILLL.enable == 1) {
            z = true;
        }
        c957450b1T.LJIILJJIL(!z);
    }

    @Override // X.InterfaceC957540b1c
    public final void LIZIZ(boolean z) {
        if (z) {
            LJIILIIL();
        } else {
            LJ();
        }
        LJIILL(this);
    }

    @Override // X.AbstractC957470b1V
    public final void LJIIL(MultiCoHostWidget multiCoHostWidget) {
        super.LJIIL(multiCoHostWidget);
        C957530b1b c957530b1b = C957530b1b.LL;
        c957530b1b.getClass();
        C957530b1b.LLILLJJLI = new WeakReference<>(this);
        IMessageManager iMessageManager = this.LLILZ;
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(C001A.COHOST_SUBTITLE_BAN_MESSAGE.getIntType(), (OnIMMessageListener) this.LLIZLLLIL);
            iMessageManager.addMessageListener(C001A.COHOST_TRANSLATE_POP_UP_MESSAGE.getIntType(), (OnIMMessageListener) this.LLIZLLLIL);
        }
        InterfaceC954180awC interfaceC954180awCLJIIIZ = C915980Zwa.LJII().LJIIIZ();
        if (interfaceC954180awCLJIIIZ != null) {
            interfaceC954180awCLJIIIZ.LJJZZIII(this);
        }
        c957530b1b.getClass();
        if (LiveCoHostSubtitleConfig.INSTANCE.isEnabled() && C957530b1b.LLILLL.hasRight == 1 && C957530b1b.LLILLL.enable == 1) {
            LJIILIIL();
            LJIILL(this);
        }
        if (C957530b1b.LLILLL.enable == 0) {
            C20441214yg.LIZIZ("CoHostAnchorSubtitle", "onSubtitleBanMessage: refreshing settings");
            C917870Zzd.LIZ(new ARunnableS115S0100000_15(this, 97));
        }
    }

    public final void LJIILJJIL(boolean z) throws JSONException {
        long id;
        JSONObject jSONObject;
        String strJ3;
        List<? extends LyraxTranscoderFeature> listLIZ;
        Object c098200Yq;
        String str;
        AbstractC962030b8r c955610ayV;
        this.LLJI.clear();
        this.LLJIJIL.clear();
        if (z) {
            jSONObject = null;
        } else {
            List<C954460awe> listLLILZLL = C915980Zwa.LJII().LLILZLL(true);
            Set<String> set = this.LLJI;
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLLILZLL, 10));
            Iterator<C954460awe> it2 = listLLILZLL.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().LJIIJJI);
            }
            set.addAll(arrayList);
            List<C954460awe> listLLILZLL2 = C915980Zwa.LJII().LLILZLL(true);
            ArrayList arrayList2 = new ArrayList();
            Iterator<C954460awe> it3 = listLLILZLL2.iterator();
            while (it3.hasNext()) {
                C19719612Di.LJJI(C915980Zwa.LJII().LJJJJI(it3.next().LJFF), arrayList2);
            }
            Set<String> set2 = this.LLJIJIL;
            ArrayList arrayList3 = new ArrayList();
            Iterator it4 = arrayList2.iterator();
            while (it4.hasNext()) {
                String str2 = ((C936770aU7) it4.next()).LIZLLL;
                if (str2 != null) {
                    arrayList3.add(str2);
                }
            }
            set2.addAll(arrayList3);
            C957530b1b.LL.getClass();
            String str3 = C957530b1b.LLILLL.targetLanguage;
            Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
            if (room != null) {
                id = room.getId();
            } else {
                id = 0;
            }
            long jLJFF = C950220apo.LJFF();
            boolean z2 = LiveCoHostSubtitleConfig.INSTANCE.getValue().showRoomOwnerSubtitle;
            ArrayList arrayList4 = new ArrayList();
            for (C954460awe c954460awe : listLLILZLL) {
                C954460awe c954460awe2 = c954460awe;
                if (z2 || !c954460awe2.LJI()) {
                    if (!this.LLJILJIL.contains(c954460awe2.LJIIJJI)) {
                        arrayList4.add(c954460awe);
                    }
                }
            }
            ArrayList arrayList5 = new ArrayList(C15438062q.LJIJJ(arrayList4, 10));
            Iterator it5 = arrayList4.iterator();
            while (it5.hasNext()) {
                arrayList5.add(((C954460awe) it5.next()).LJIIJJI);
            }
            ArrayList arrayList6 = new ArrayList();
            for (Object obj : arrayList2) {
                if (!C13LP.LJJJJ(((C936770aU7) obj).LIZLLL, this.LLJILJIL)) {
                    arrayList6.add(obj);
                }
            }
            ArrayList arrayList7 = new ArrayList();
            Iterator it6 = arrayList6.iterator();
            while (it6.hasNext()) {
                String str4 = ((C936770aU7) it6.next()).LIZLLL;
                if (str4 != null) {
                    arrayList7.add(str4);
                }
            }
            ArrayList arrayList8 = new ArrayList();
            for (C954460awe c954460awe3 : listLLILZLL) {
                if (c954460awe3.LJFF == id) {
                    arrayList8.add(c954460awe3);
                }
            }
            ArrayList arrayList9 = new ArrayList(C15438062q.LJIJJ(arrayList8, 10));
            Iterator it7 = arrayList8.iterator();
            while (it7.hasNext()) {
                arrayList9.add(((C954460awe) it7.next()).LJIIJJI);
            }
            ArrayList arrayList10 = new ArrayList();
            for (Object obj2 : arrayList2) {
                Long l = ((C936770aU7) obj2).LIZIZ;
                if (l != null && l.longValue() == id) {
                    arrayList10.add(obj2);
                }
            }
            ArrayList arrayList11 = new ArrayList();
            Iterator it8 = arrayList10.iterator();
            while (it8.hasNext()) {
                String str5 = ((C936770aU7) it8.next()).LIZLLL;
                if (str5 != null) {
                    arrayList11.add(str5);
                }
            }
            JSONArray jSONArray = new JSONArray();
            Iterator it9 = arrayList5.iterator();
            while (it9.hasNext()) {
                jSONArray.put(LJIILLIIL(id, (String) it9.next()));
            }
            Iterator it10 = arrayList7.iterator();
            while (it10.hasNext()) {
                jSONArray.put(LJIILLIIL(id, (String) it10.next()));
            }
            JSONArray jSONArray2 = new JSONArray();
            Iterator it11 = arrayList9.iterator();
            while (it11.hasNext()) {
                jSONArray2.put(LJIILLIIL(id, (String) it11.next()));
            }
            Iterator it12 = arrayList11.iterator();
            while (it12.hasNext()) {
                jSONArray2.put(LJIILLIIL(id, (String) it12.next()));
            }
            jSONObject = new JSONObject();
            jSONObject.put("targetLang", str3);
            jSONObject.put("current_room_id", String.valueOf(id));
            jSONObject.put("current_user_id", String.valueOf(jLJFF));
            jSONObject.put("targets", jSONArray);
            jSONObject.put("recipients", jSONArray2);
        }
        if (jSONObject != null) {
            strJ3 = C786410Ut5.J3(jSONObject);
        } else {
            strJ3 = null;
        }
        LyraxTranscoderFeature lyraxTranscoderFeature = new LyraxTranscoderFeature("subtitle", "subtitleForPkTranslation", strJ3);
        if (jSONObject == null) {
            StreamFeatureManager streamFeatureManager = StreamFeatureManager.LL;
            List listSingletonList = Collections.singletonList(lyraxTranscoderFeature);
            streamFeatureManager.getClass();
            if (listSingletonList != null) {
                HashSet hashSet = new HashSet();
                Iterator it13 = listSingletonList.iterator();
                while (it13.hasNext()) {
                    hashSet.add(((LyraxTranscoderFeature) it13.next()).getFeatureName());
                }
                List<LyraxTranscoderFeature> list = StreamFeatureManager.LLILLJJLI;
                ArrayList arrayList12 = (ArrayList) list;
                int size = arrayList12.size();
                C19719612Di.LJJIIJ(list, new AwS591S0100000_12(hashSet, (HashSet<String>) 1141), true);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("removeAndGet beforeSize=");
                sbLIZ.append(size);
                sbLIZ.append(", afterSize=");
                sbLIZ.append(arrayList12.size());
                C20441214yg.LIZIZ("StreamFeatureManager", C2188811AlT.LIZIZ(sbLIZ));
                listLIZ = C13LP.LLIIII(list);
            } else {
                listLIZ = C13LP.LLIIII(StreamFeatureManager.LLILLJJLI);
            }
        } else {
            StreamFeatureManager streamFeatureManager2 = StreamFeatureManager.LL;
            List listSingletonList2 = Collections.singletonList(lyraxTranscoderFeature);
            streamFeatureManager2.getClass();
            listLIZ = StreamFeatureManager.LIZ(listSingletonList2);
        }
        try {
            InterfaceC954180awC interfaceC954180awCLJIIIZ = C915980Zwa.LJII().LJIIIZ();
            if (interfaceC954180awCLJIIIZ != null) {
                interfaceC954180awCLJIIIZ.LJIIIIZZ(listLIZ);
            }
            C15P8 c15p8 = this.LLIZ;
            c15p8.getClass();
            boolean zIsEmpty = listLIZ.isEmpty();
            if (zIsEmpty) {
                str = "stop";
            } else if (c15p8.LIZIZ) {
                str = "start";
            } else {
                str = "update";
            }
            c15p8.LIZIZ = zIsEmpty;
            if (c15p8.LIZLLL.nextInt() % c15p8.LIZJ == 0) {
                if (c15p8.LIZ) {
                    c955610ayV = new C955440ayE();
                } else {
                    c955610ayV = new C955610ayV();
                }
                c955610ayV.LJIIL(str, "call_type", true);
                c955610ayV.LJIJJLI("call_cohost_subtitle_task");
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("applyMediaXFeature: option= ");
            sbLIZ2.append(jSONObject);
            C20441214yg.LIZIZ("CoHostAnchorSubtitle", C2188811AlT.LIZIZ(sbLIZ2));
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("applyMediaXFeature: failed: ");
            sbLIZ3.append(thM5exceptionOrNullimpl);
            C20441214yg.LJIIL("CoHostAnchorSubtitle", C2188811AlT.LIZIZ(sbLIZ3));
        }
    }

    public static final JSONObject LJIILLIIL(long j, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("room_id", String.valueOf(j));
        jSONObject.put("stream_index", 0);
        jSONObject.put("linkmic_id", str);
        return jSONObject;
    }

    @Override // X.InterfaceC964770bDH
    public final void LJIJJLI(String str, boolean z) {
        if (z) {
            this.LLJILJIL.add(str);
            this.LLILZLL.LIZLLL.remove(str);
        } else {
            this.LLJILJIL.remove(str);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onAudioMute linkMicId=");
        sbLIZ.append(str);
        sbLIZ.append(" mute=");
        sbLIZ.append(z);
        sbLIZ.append(" mutedCount=");
        sbLIZ.append(this.LLJILJIL.size());
        C20441214yg.LIZIZ("CoHostAnchorSubtitle", C2188811AlT.LIZIZ(sbLIZ));
        C957530b1b.LL.getClass();
        if (LiveCoHostSubtitleConfig.INSTANCE.isEnabled() && C957530b1b.LLILLL.hasRight == 1 && C957530b1b.LLILLL.enable == 1) {
            LJIILL(this);
        }
    }

    @Override // X.InterfaceC964770bDH
    public final void LLLIIL(InterfaceC954180awC interfaceC954180awC, String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onUserMsgReceived linkMicId=");
        sbLIZ.append(str);
        sbLIZ.append(" content=");
        sbLIZ.append(str2);
        C20441214yg.LIZIZ("CoHostAnchorSubtitle", C2188811AlT.LIZIZ(sbLIZ));
        C957530b1b.LL.getClass();
        if (LiveCoHostSubtitleConfig.INSTANCE.isEnabled() && C957530b1b.LLILLL.hasRight == 1 && C957530b1b.LLILLL.enable == 1) {
            this.LLILZLL.LIZIZ(str2);
        }
    }
}
