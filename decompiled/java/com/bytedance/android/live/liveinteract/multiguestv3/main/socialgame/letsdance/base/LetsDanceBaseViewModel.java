package com.bytedance.android.live.liveinteract.multiguestv3.main.socialgame.letsdance.base;

import X.C01GW;
import X.C0U45;
import X.C1161920gLG;
import X.C20441214yg;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C389001fE;
import X.C452501pT;
import X.C766720U5u;
import X.C786410Ut5;
import X.C915980Zwa;
import X.C921180a4y;
import X.C924790aAn;
import X.C930540aK4;
import X.C946930akV;
import X.C946950akX;
import X.C947010akd;
import X.C947150akr;
import X.C947590alZ;
import X.C948450amx;
import X.C949120ao2;
import X.C949130ao3;
import X.C949180ao8;
import X.EnumC942260acy;
import X.EnumC947020ake;
import X.EnumC947440alK;
import X.EnumC952680atm;
import X.InterfaceC1271370jBn;
import X.InterfaceC769000UEo;
import X.InterfaceC940910aan;
import X.InterfaceC946970akZ;
import X.InterfaceC947140akq;
import X.InterfaceC947260al2;
import X.InterfaceC949260aoG;
import X.InterfaceC954180awC;
import X.InterfaceC964770bDH;
import android.media.MediaMetadataRetriever;
import android.view.SurfaceView;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.socialgame.letsdance.base.LetsDanceBaseViewModel;
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
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestSocialGameLetsDanceSetting;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.tiktok.kmp.live.socialgamebusinessapi.event.MultiLetsDanceEffectInitSuccessChannel;
import com.tiktok.kmp.live.socialgamebusinessapi.event.MultiLetsDanceEffectScoreChannel;
import com.tiktok.kmp.live.socialgamebusinessapi.event.MultiLetsDanceGameFinishEvent;
import com.tiktok.kmp.live.socialgamebusinessapi.event.MultiLetsDanceGameProgressChannel;
import com.tiktok.kmp.live.socialgamebusinessapi.event.MultiLetsDanceMediaIsPlayingChannel;
import java.io.File;
import java.nio.Buffer;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.AwS664S0100000_15;
import org.json.JSONException;
import org.json.JSONObject;
import webcast.data.multi_guest_social_data.Avatar;

/* JADX INFO: loaded from: classes16.dex */
public abstract class LetsDanceBaseViewModel extends ViewModel {
    public static final /* synthetic */ int LLJJIJIIJIL = 0;
    public DataChannel LL;
    public InterfaceC940910aan LLILZ;
    public InterfaceC940910aan LLILZIL;
    public boolean LLILZLL;
    public Long LLIZ;
    public Long LLIZLLLIL;
    public Long LLJ;
    public Long LLJI;
    public boolean LLJIJIL;
    public boolean LLJJIII;
    public boolean LLJJIJI;

    @InterfaceC947260al2(name = "MULTI_GUEST_DATA_HOLDER")
    public MultiGuestDataHolder dataHolder;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(110));
    public String LLILLL = "";
    public final C947150akr LLJILJIL = new InterfaceC1271370jBn() { // from class: X.0akr
        @Override // X.InterfaceC1271370jBn
        public final /* synthetic */ void LIZIZ(Buffer buffer, int i, int i2, int i3, long j) {
        }

        @Override // X.InterfaceC1271370jBn
        public final /* synthetic */ void LJJZ() {
        }

        @Override // X.InterfaceC1271370jBn
        public final /* synthetic */ void onVideoSizeChanged(int i, int i2) {
        }

        @Override // X.InterfaceC1271370jBn
        public final void onCompletion() {
            C20441214yg.LIZIZ("LetsDanceBaseViewModel", "onPlayProgressChange onCompletion");
            DataChannel dataChannel = this.LIZ.LL;
            if (dataChannel != null) {
                dataChannel.FQ2(MultiLetsDanceGameFinishEvent.class);
            }
            DataChannel dataChannel2 = this.LIZ.LL;
            if (dataChannel2 != null) {
                dataChannel2.zW(MultiLetsDanceMediaIsPlayingChannel.class, Boolean.FALSE);
            }
        }

        @Override // X.InterfaceC1271370jBn
        public final void onPrepared() {
            C20441214yg.LIZIZ("LetsDanceBaseViewModel", "onPrepared");
        }

        @Override // X.InterfaceC1271370jBn
        public final void LIZ(long j, long j2) {
            int iLJ = 0;
            if (j2 > 0) {
                iLJ = C13LZ.LJ((int) ((j * ((long) 100)) / j2), 0, 100);
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onPlayProgressChange progress = ");
            sbLIZ.append(iLJ);
            sbLIZ.append(", duration = ");
            sbLIZ.append(j2);
            C20441214yg.LIZIZ("LetsDanceBaseViewModel", C2188811AlT.LIZIZ(sbLIZ));
            DataChannel dataChannel = this.LIZ.LL;
            if (dataChannel != null) {
                dataChannel.zW(MultiLetsDanceGameProgressChannel.class, Integer.valueOf(iLJ));
            }
        }
    };
    public final MutableLiveData<Boolean> LLJILJILJ = new MutableLiveData<>();
    public final MutableLiveData<Pair<EnumC947440alK, EnumC947440alK>> LLJILLL = new MutableLiveData<>();
    public final C946930akV LLJJ = new InterfaceC964770bDH() { // from class: X.0akV
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

        /* JADX WARN: Multi-variable type inference failed */
        @Override // X.InterfaceC964770bDH
        public final void LJJLIIIJLJLI() {
            Integer num;
            C20441214yg.LIZIZ("LetsDanceBaseViewModel", "onStartJoinRtcChannel");
            Pair<EnumC947440alK, EnumC947440alK> value = this.LL.LLJILLL.getValue();
            EnumC947440alK second = value != null ? value.getSecond() : null;
            if ((second == EnumC947440alK.PREPARING || second == EnumC947440alK.PLAYING) && (num = (Integer) C924790aAn.LIZLLL().LIZIZ) != null && 2 == num.intValue()) {
                C20441214yg.LIZIZ("LetsDanceBaseViewModel", "onStartJoinRtcChannel setSingleViewMode true");
                C01GW<C949390aoT> c01gw = C949390aoT.LIZJ;
                if (C923970a9T.LIZ().LIZLLL() != null) {
                    this.LL.MQ2(true);
                }
            }
        }
    };
    public final C947010akd LLJJI = new InterfaceC949260aoG() { // from class: X.0akd
        @Override // X.InterfaceC949260aoG
        public final void LIZ(EnumC947020ake enumC947020ake) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("resourceDownloadListener onSuccess: ");
            sbLIZ.append(enumC947020ake);
            sbLIZ.append(", mainSpotStreamId= ");
            sbLIZ.append(this.LIZ.yQ2());
            C20441214yg.LIZIZ("LetsDanceBaseViewModel", C2188811AlT.LIZIZ(sbLIZ));
            if (this.LIZ.EQ2()) {
                this.LIZ.HQ2();
            }
        }

        @Override // X.InterfaceC949260aoG
        public final void LIZIZ(EnumC947020ake enumC947020ake) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("resourceDownloadListener onStart: ");
            sbLIZ.append(enumC947020ake);
            C20441214yg.LIZIZ("LetsDanceBaseViewModel", C2188811AlT.LIZIZ(sbLIZ));
        }

        @Override // X.InterfaceC949260aoG
        public final void LIZJ(EnumC947020ake enumC947020ake, Long l) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("resourceDownloadListener onFail: ");
            sbLIZ.append(enumC947020ake);
            C20441214yg.LJ("LetsDanceBaseViewModel", C2188811AlT.LIZIZ(sbLIZ));
        }
    };

    public abstract List<EnumC947020ake> BQ2();

    public abstract void QQ2();

    public String getTag() {
        return "LetsDanceBaseViewModel";
    }

    public abstract InterfaceC769000UEo wQ2();

    public final void vQ2() {
        if (this.LLILZLL) {
            return;
        }
        C946950akX.LJIIIIZZ("create_video_player", C2097608Jq.LJ());
        this.LLILZLL = true;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(getTag());
        sbLIZ.append(" createMediaPlayer mainSpotStreamId:");
        sbLIZ.append(yQ2());
        C20441214yg.LIZIZ("LetsDanceBaseViewModel", C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC947140akq interfaceC947140akqAQ2 = AQ2();
        if (interfaceC947140akqAQ2 != null) {
            interfaceC947140akqAQ2.LJFF(yQ2(), this.LLJILJIL);
        }
    }

    public final InterfaceC946970akZ xQ2() {
        return (InterfaceC946970akZ) this.LLILLJJLI.getValue();
    }

    public final String zQ2() {
        Long l = this.LLIZ;
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.LLIZ = null;
        if (l == null || jCurrentTimeMillis < l.longValue()) {
            return null;
        }
        return C786410Ut5.j4("%.1f", Arrays.copyOf(new Object[]{Float.valueOf((jCurrentTimeMillis - l.longValue()) / 1000.0f)}, 1));
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0akr] */
    /* JADX WARN: Type inference failed for: r0v7, types: [X.0akV] */
    /* JADX WARN: Type inference failed for: r0v8, types: [X.0akd] */
    public LetsDanceBaseViewModel() throws IllegalAccessException {
        C948450amx.LIZIZ.LIZLLL(this);
    }

    public static InterfaceC947140akq AQ2() {
        InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
        if (interfaceC954180awCLLJLL != null) {
            return interfaceC954180awCLLJLL.LJJLIIIJLLLLLLLZ();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String CQ2() {
        C947590alZ c947590alZLJIILLIIL;
        if (C930540aK4.LIZJ()) {
            return "anchor";
        }
        Integer num = (Integer) C924790aAn.LIZLLL().LIZIZ;
        if (num == null || 2 != num.intValue()) {
            return "audience";
        }
        InterfaceC946970akZ interfaceC946970akZXQ2 = xQ2();
        return ((interfaceC946970akZXQ2 == null || (c947590alZLJIILLIIL = interfaceC946970akZXQ2.LJIILLIIL(C921180a4y.LJIIJ(C915980Zwa.LJIIIIZZ()))) == null) ? null : c947590alZLJIILLIIL.LIZJ) == EnumC942260acy.READY ? "guest_join" : "guest_not_join";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean DQ2() {
        Integer num;
        return (C930540aK4.LIZJ() || (num = (Integer) C924790aAn.LIZLLL().LIZIZ) == null || 2 != num.intValue()) ? false : true;
    }

    public final boolean EQ2() {
        for (EnumC947020ake enumC947020ake : BQ2()) {
            InterfaceC946970akZ interfaceC946970akZXQ2 = xQ2();
            if (interfaceC946970akZXQ2 == null || !interfaceC946970akZXQ2.LJFF(enumC947020ake)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("isResourceReady ");
                sbLIZ.append(enumC947020ake);
                sbLIZ.append(": false");
                C20441214yg.LJIIL("LetsDanceBaseViewModel", C2188811AlT.LIZIZ(sbLIZ));
                return false;
            }
        }
        return true;
    }

    public final void HQ2() {
        DataChannel dataChannel;
        Boolean bool;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onResourceReady, currentSelfIsAnchor=");
        sbLIZ.append(C930540aK4.LIZJ());
        sbLIZ.append(", isGuest=");
        sbLIZ.append(DQ2());
        C20441214yg.LIZIZ("LetsDanceBaseViewModel", C2188811AlT.LIZIZ(sbLIZ));
        if (C930540aK4.LIZJ() || DQ2()) {
            MQ2(true);
            boolean zBooleanValue = (!MultiGuestSocialGameLetsDanceSetting.config().effectSdkInitJudge || (dataChannel = this.LL) == null || (bool = (Boolean) dataChannel.gg0(MultiLetsDanceEffectInitSuccessChannel.class)) == null) ? true : bool.booleanValue();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("onResourceReady isEffectReady = ");
            sbLIZ2.append(zBooleanValue);
            C20441214yg.LIZIZ("LetsDanceBaseViewModel", C2188811AlT.LIZIZ(sbLIZ2));
            if (zBooleanValue) {
                LQ2();
                return;
            }
            if (this.LLJIJIL) {
                return;
            }
            C20441214yg.LIZIZ("LetsDanceBaseViewModel", "onResourceReady addEffectInitObserver");
            this.LLJIJIL = true;
            DataChannel dataChannel2 = this.LL;
            if (dataChannel2 != null) {
                dataChannel2.BQ2(null, MultiLetsDanceEffectInitSuccessChannel.class, new AwS594S0100000_15(this, 426));
            }
        }
    }

    public final void IQ2() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(getTag());
        sbLIZ.append(" releaseMediaPlayer mainSpotStreamId:");
        sbLIZ.append(yQ2());
        C20441214yg.LIZIZ("LetsDanceBaseViewModel", C2188811AlT.LIZIZ(sbLIZ));
        this.LLILZLL = false;
        InterfaceC947140akq interfaceC947140akqAQ2 = AQ2();
        if (interfaceC947140akqAQ2 != null) {
            interfaceC947140akqAQ2.LIZIZ(yQ2());
        }
    }

    public final void JQ2() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(getTag());
        sbLIZ.append(" removeScoreEffect");
        C20441214yg.LIZIZ("LetsDanceBaseViewModel", C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC769000UEo interfaceC769000UEoWQ2 = wQ2();
        if (interfaceC769000UEoWQ2 != null) {
            interfaceC769000UEoWQ2.lr("live_dance");
        }
    }

    public final void LQ2() {
        C949120ao2 c949120ao2LJIILIIL;
        String strLIZJ;
        OQ2();
        vQ2();
        InterfaceC946970akZ interfaceC946970akZXQ2 = xQ2();
        if (interfaceC946970akZXQ2 != null && (strLIZJ = interfaceC946970akZXQ2.LIZJ(EnumC947020ake.GAME_MATERIAL)) != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(strLIZJ);
            String str = File.separator;
            sbLIZ.append(str);
            sbLIZ.append("dance_video.mp4");
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("setGameResource danceVideoFilePath = ");
            sbLIZ2.append(strLIZIZ);
            C20441214yg.LIZIZ("LetsDanceBaseViewModel", C2188811AlT.LIZIZ(sbLIZ2));
            InterfaceC947140akq interfaceC947140akqAQ2 = AQ2();
            if (interfaceC947140akqAQ2 != null) {
                interfaceC947140akqAQ2.LJ(yQ2(), strLIZIZ);
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(strLIZJ);
            sbLIZ3.append(str);
            sbLIZ3.append("skeleton.json");
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ3);
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("setGameResource skeletonFilePath = ");
            sbLIZ4.append(strLIZIZ2);
            C20441214yg.LIZIZ("LetsDanceBaseViewModel", C2188811AlT.LIZIZ(sbLIZ4));
            InterfaceC769000UEo interfaceC769000UEoWQ2 = wQ2();
            if (interfaceC769000UEoWQ2 != null) {
                interfaceC769000UEoWQ2.setRenderCacheString("bone_file_path", strLIZIZ2);
            }
        }
        InterfaceC946970akZ interfaceC946970akZXQ22 = xQ2();
        if (interfaceC946970akZXQ22 == null || (c949120ao2LJIILIIL = interfaceC946970akZXQ22.LJIILIIL(EnumC947020ake.SCORE_EFFECT)) == null) {
            return;
        }
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append("onResourceReady scoreEffect = ");
        sbLIZ5.append(c949120ao2LJIILIIL);
        C20441214yg.LIZIZ("LetsDanceBaseViewModel", C2188811AlT.LIZIZ(sbLIZ5));
        final String str2 = c949120ao2LJIILIIL.LIZ;
        String str3 = c949120ao2LJIILIIL.LIZIZ;
        ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getLiveEffectDataProvider();
        C766720U5u.LJII(str2, str3, new C0U45() { // from class: X.0akY
            @Override // X.C0U45
            public final void LIZIZ(LiveEffect liveEffect, int i, long j) {
            }

            @Override // X.C0U45
            public final void LIZJ(LiveEffect liveEffect) {
            }

            @Override // X.C0U45
            public final void LJ(LiveEffect liveEffect, ExceptionResult exceptionResult) {
            }

            @Override // X.C0U45
            public final void LIZ(LiveEffect liveEffect) {
                EnumC947440alK second;
                int iLIZ;
                long j;
                String strLIZJ2;
                C947590alZ c947590alZLJIILLIIL;
                C947420alI c947420alILJII;
                Long l;
                if (liveEffect != null) {
                    LetsDanceBaseViewModel letsDanceBaseViewModel = this.LIZ;
                    String str4 = str2;
                    C20441214yg.LIZIZ("LetsDanceBaseViewModel", "setScoreEffect onSuccess");
                    InterfaceC769000UEo interfaceC769000UEoWQ22 = letsDanceBaseViewModel.wQ2();
                    if (interfaceC769000UEoWQ22 != null) {
                        interfaceC769000UEoWQ22.kr(liveEffect, str4);
                    }
                    if (!letsDanceBaseViewModel.LLJJIII) {
                        letsDanceBaseViewModel.LLJJIII = true;
                        C946950akX.LJIIIIZZ("apply_score_effect", C2097608Jq.LJ());
                    }
                    Pair<EnumC947440alK, EnumC947440alK> value = letsDanceBaseViewModel.LLJILLL.getValue();
                    EnumC942260acy enumC942260acy = null;
                    if (value != null) {
                        second = value.getSecond();
                    } else {
                        second = null;
                    }
                    if (second == EnumC947440alK.PLAYING) {
                        C20441214yg.LIZIZ("LetsDanceBaseViewModel", "start Playing");
                        InterfaceC946970akZ interfaceC946970akZXQ23 = letsDanceBaseViewModel.xQ2();
                        if (interfaceC946970akZXQ23 != null && (c947420alILJII = interfaceC946970akZXQ23.LJII()) != null && (l = c947420alILJII.LIZLLL) != null) {
                            iLIZ = (int) (C158B.LIZ() - l.longValue());
                            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                            sbLIZ6.append(letsDanceBaseViewModel.getTag());
                            sbLIZ6.append(" calculateOffsetTime offsetTimeMs:");
                            sbLIZ6.append(iLIZ);
                            C20441214yg.LIZIZ("LetsDanceBaseViewModel", C2188811AlT.LIZIZ(sbLIZ6));
                        } else {
                            iLIZ = 0;
                        }
                        letsDanceBaseViewModel.NQ2(iLIZ);
                        InterfaceC946970akZ interfaceC946970akZXQ24 = letsDanceBaseViewModel.xQ2();
                        if (interfaceC946970akZXQ24 != null && (c947590alZLJIILLIIL = interfaceC946970akZXQ24.LJIILLIIL(C921180a4y.LJIIJ(C915980Zwa.LJIIIIZZ()))) != null) {
                            enumC942260acy = c947590alZLJIILLIIL.LIZJ;
                        }
                        if (enumC942260acy == EnumC942260acy.READY) {
                            float f = iLIZ;
                            InterfaceC946970akZ interfaceC946970akZXQ25 = letsDanceBaseViewModel.xQ2();
                            if (interfaceC946970akZXQ25 != null && (strLIZJ2 = interfaceC946970akZXQ25.LIZJ(EnumC947020ake.GAME_MATERIAL)) != null) {
                                StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                                sbLIZ7.append(strLIZJ2);
                                sbLIZ7.append(File.separator);
                                sbLIZ7.append("dance_video.mp4");
                                String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ7);
                                MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                                try {
                                    mediaMetadataRetriever.setDataSource(strLIZIZ3);
                                    String strLIZJ3 = C20144413ru.LIZJ(mediaMetadataRetriever);
                                    if (strLIZJ3 != null) {
                                        j = CastLongProtector.parseLong(strLIZJ3);
                                    } else {
                                        j = 0;
                                    }
                                    StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                                    sbLIZ8.append("getDanceVideoDuration, duration=");
                                    sbLIZ8.append(j);
                                    sbLIZ8.append(", filePath=");
                                    sbLIZ8.append(strLIZIZ3);
                                    C20441214yg.LIZIZ("LetsDanceBaseViewModel", C2188811AlT.LIZIZ(sbLIZ8));
                                } catch (Exception e) {
                                    TryCatchGuardChecker.doCheck(e);
                                    StringBuilder sbLIZ9 = C2188811AlT.LIZ();
                                    sbLIZ9.append("getDanceVideoDuration, filePath=");
                                    sbLIZ9.append(strLIZIZ3);
                                    sbLIZ9.append(", e=");
                                    sbLIZ9.append(e);
                                    C20441214yg.LJ("LetsDanceBaseViewModel", C2188811AlT.LIZIZ(sbLIZ9));
                                    j = 120000;
                                }
                            } else {
                                j = 120000;
                            }
                            float f2 = f / j;
                            StringBuilder sbLIZ10 = C2188811AlT.LIZ();
                            sbLIZ10.append("sendEffectMsg, start play, progress=");
                            sbLIZ10.append(f2);
                            C20441214yg.LIZIZ("LetsDanceBaseViewModel", C2188811AlT.LIZIZ(sbLIZ10));
                            letsDanceBaseViewModel.KQ2(0, String.valueOf(f2));
                            letsDanceBaseViewModel.LLIZ = Long.valueOf(System.currentTimeMillis());
                            C945730aiZ c945730aiZ = C945730aiZ.LIZ;
                            DataChannel dataChannel = letsDanceBaseViewModel.LL;
                            c945730aiZ.getClass();
                            C945730aiZ.LIZJ(dataChannel);
                        }
                    }
                }
            }
        });
    }

    public final void OQ2() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(getTag());
        sbLIZ.append(" stopMediaPlayer mainSpotStreamId:");
        sbLIZ.append(yQ2());
        C20441214yg.LIZIZ("LetsDanceBaseViewModel", C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC947140akq interfaceC947140akqAQ2 = AQ2();
        if (interfaceC947140akqAQ2 != null) {
            interfaceC947140akqAQ2.LIZLLL(yQ2());
        }
    }

    public final void PQ2() throws JSONException {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(getTag());
        sbLIZ.append(" stopRemoteEffect");
        C20441214yg.LIZIZ("LetsDanceBaseViewModel", C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC947140akq interfaceC947140akqAQ2 = AQ2();
        if (interfaceC947140akqAQ2 != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sceneType", "JUST_DANCE");
            jSONObject.put("danceVideoID", "none");
            interfaceC947140akqAQ2.LJI(jSONObject);
        }
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        InterfaceC940910aan interfaceC940910aan = this.LLILZ;
        if (interfaceC940910aan != null) {
            interfaceC940910aan.unsubscribe();
        }
        InterfaceC940910aan interfaceC940910aan2 = this.LLILZIL;
        if (interfaceC940910aan2 != null) {
            interfaceC940910aan2.unsubscribe();
        }
        C915980Zwa.LJIIIIZZ().a9(this.LLJJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String yQ2() {
        /*
            r5 = this;
            com.bytedance.android.live.liveinteract.multiguestv3.service.IMultiGuestV3InternalServiceV2 r0 = X.C915980Zwa.LJIIIIZZ()
            X.0awC r0 = r0.LLJLL()
            r4 = 0
            if (r0 == 0) goto L4e
            X.0aVw r1 = r0.LLIIJLIL()
        Lf:
            boolean r0 = r1 instanceof X.InterfaceC940060aZQ
            if (r0 == 0) goto L4b
            X.0aZQ r1 = (X.InterfaceC940060aZQ) r1
            if (r1 == 0) goto L4b
            java.util.List r0 = r1.LJLLJ()
            if (r0 == 0) goto L4b
            java.util.Iterator r3 = r0.iterator()
        L21:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L3c
            java.lang.Object r2 = r3.next()
            r0 = r2
            X.0b0n r0 = (X.C957030b0n) r0
            tikcast.linkmic.common.MultiGuestSpotExtra r0 = r0.LIZJ
            if (r0 == 0) goto L21
            tikcast.linkmic.common.SocialGameUserSpotExtra r0 = r0.socialGameUser
            if (r0 == 0) goto L21
            boolean r1 = r0.isMainContent
            r0 = 1
            if (r1 != r0) goto L21
            r4 = r2
        L3c:
            X.0b0n r4 = (X.C957030b0n) r4
            if (r4 == 0) goto L4b
            tikcast.linkmic.common.PosIdentity r0 = r4.LIZIZ
            if (r0 == 0) goto L4b
            java.lang.String r0 = r0.value
            if (r0 == 0) goto L4b
        L48:
            r5.LLILLL = r0
            return r0
        L4b:
            java.lang.String r0 = r5.LLILLL
            goto L48
        L4e:
            r1 = r4
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguestv3.main.socialgame.letsdance.base.LetsDanceBaseViewModel.yQ2():java.lang.String");
    }

    public void GQ2(DataChannel dataChannel) {
        C949130ao3 c949130ao3LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(getTag());
        sbLIZ.append(" onInit hashCode=");
        sbLIZ.append(hashCode());
        C20441214yg.LIZIZ("LetsDanceBaseViewModel", C2188811AlT.LIZIZ(sbLIZ));
        this.LL = dataChannel;
        InterfaceC946970akZ interfaceC946970akZXQ2 = xQ2();
        C949180ao8 c949180ao8LJIIL = null;
        if (interfaceC946970akZXQ2 != null) {
            c949130ao3LIZ = interfaceC946970akZXQ2.LIZ(new AwS664S0100000_15(this, 14));
        } else {
            c949130ao3LIZ = null;
        }
        this.LLILZ = c949130ao3LIZ;
        InterfaceC946970akZ interfaceC946970akZXQ22 = xQ2();
        if (interfaceC946970akZXQ22 != null) {
            c949180ao8LJIIL = interfaceC946970akZXQ22.LJIIL(this.LLJJI);
        }
        this.LLILZIL = c949180ao8LJIIL;
        C915980Zwa.LJIIIIZZ().Fe(this.LLJJ);
    }

    public final void MQ2(boolean z) {
        EnumC952680atm enumC952680atm;
        String str;
        InterfaceC947140akq interfaceC947140akqLJJLIIIJLLLLLLLZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(getTag());
        sbLIZ.append(" setSingleViewMode isSingleViewMode:");
        sbLIZ.append(z);
        C20441214yg.LIZIZ("LetsDanceBaseViewModel", C2188811AlT.LIZIZ(sbLIZ));
        if (z) {
            enumC952680atm = EnumC952680atm.SINGLE_VIEWMODE_V2;
        } else {
            enumC952680atm = EnumC952680atm.DEFAULT;
        }
        if (z) {
            str = "start_single_view";
        } else {
            str = "end_single_view";
        }
        C946950akX.LJIIIIZZ(str, C2097608Jq.LJ());
        InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
        if (interfaceC954180awCLLJLL != null) {
            interfaceC954180awCLLJLL.LJJLIIIJJI(enumC952680atm, "lets_dance");
        }
        InterfaceC954180awC interfaceC954180awCLLJLL2 = C915980Zwa.LJIIIIZZ().LLJLL();
        if (interfaceC954180awCLLJLL2 != null && (interfaceC947140akqLJJLIIIJLLLLLLLZ = interfaceC954180awCLLJLL2.LJJLIIIJLLLLLLLZ()) != null) {
            interfaceC947140akqLJJLIIIJLLLLLLLZ.LJIJJ(null, z);
        }
    }

    public final void NQ2(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(getTag());
        sbLIZ.append(" startMediaPlayer offsetTimeMs:");
        sbLIZ.append(i);
        sbLIZ.append(", renderManager");
        sbLIZ.append(AQ2());
        C20441214yg.LIZIZ("LetsDanceBaseViewModel", C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC947140akq interfaceC947140akqAQ2 = AQ2();
        if (interfaceC947140akqAQ2 != null) {
            interfaceC947140akqAQ2.LIZJ(i, yQ2());
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("offset_time_ms", String.valueOf(i));
        C946950akX.LJIIIIZZ("video_start_playing", linkedHashMap);
    }

    public void FQ2(EnumC947440alK enumC947440alK, EnumC947440alK enumC947440alK2) {
        EnumC947440alK enumC947440alK3 = EnumC947440alK.PREPARING;
        if (enumC947440alK2 == enumC947440alK3) {
            DataChannel dataChannel = this.LL;
            if (dataChannel != null) {
                dataChannel.zW(MultiLetsDanceGameProgressChannel.class, 0);
            }
            DataChannel dataChannel2 = this.LL;
            if (dataChannel2 != null) {
                dataChannel2.zW(MultiLetsDanceEffectScoreChannel.class, 0);
            }
            this.LLJJIJI = false;
            this.LLJJIII = false;
        }
        if (enumC947440alK2 != EnumC947440alK.NONE && enumC947440alK2 != enumC947440alK3) {
            return;
        }
        C20441214yg.LIZIZ("LetsDanceBaseViewModel", "onGamePhaseChanged close rank page");
        C389001fE.LIZ("close_just_dance_game_panel", null, System.currentTimeMillis(), false);
    }

    public final void KQ2(int i, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(getTag());
        sbLIZ.append(" sendEffectMsg msgId:");
        sbLIZ.append(589840);
        sbLIZ.append(", arg1:");
        sbLIZ.append(0);
        sbLIZ.append(", arg2:");
        sbLIZ.append(i);
        sbLIZ.append(", msg:");
        sbLIZ.append(str);
        sbLIZ.append(", composerManager:");
        sbLIZ.append(wQ2());
        C20441214yg.LJIIL("LetsDanceBaseViewModel", C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC769000UEo interfaceC769000UEoWQ2 = wQ2();
        if (interfaceC769000UEoWQ2 != null) {
            interfaceC769000UEoWQ2.sendEffectMsg(589840, 0, i, str);
        }
        if (i == 0 && !this.LLJJIJI) {
            this.LLJJIJI = true;
            C946950akX.LJIIIIZZ("start_scoring", new LinkedHashMap());
        }
    }
}
