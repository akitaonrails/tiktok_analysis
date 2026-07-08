package X;

import android.content.Context;
import android.graphics.Rect;
import android.os.Looper;
import android.view.SurfaceView;
import android.view.View;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizApplyParams;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizCancelApplyParams;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizJoinChannelParams;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizJoinDirectParams;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizLeaveParams;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizReplyParams;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ApplyData;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ApplyGroupResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ApplyResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.AsyncAuxStreamCreateTask;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CancelApplyData;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CancelApplyJoinGroupResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CancelApplyResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CancelInviteData;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CancelInviteJoinGroupResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CancelInviteResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ChangeMaxPositionData;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ChangeMaxPositionResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CreateChannelData;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CreateChannelResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.DestroyChannelData;
import com.bytedance.android.livesdk.comp.api.linkcore.model.DestroyChannelResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.DirectJoinData;
import com.bytedance.android.livesdk.comp.api.linkcore.model.DirectJoinResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.DslLayout;
import com.bytedance.android.livesdk.comp.api.linkcore.model.InviteData;
import com.bytedance.android.livesdk.comp.api.linkcore.model.InviteGroupResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.InviteResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.JoinChannelData;
import com.bytedance.android.livesdk.comp.api.linkcore.model.KickOutAllData;
import com.bytedance.android.livesdk.comp.api.linkcore.model.KickOutAllResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.KickOutData;
import com.bytedance.android.livesdk.comp.api.linkcore.model.KickOutResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.Layout;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LayoutDSLConfig;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LeaveChannelData;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LeaveChannelResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LeaveGroupResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkMicState;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LiveRoomUser;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LiveStreamMixer;
import com.bytedance.android.livesdk.comp.api.linkcore.model.MicPositionContentInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.MicPositionInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.MixStreamWaterMarkTask;
import com.bytedance.android.livesdk.comp.api.linkcore.model.OnLineMicInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.PermitApplyData;
import com.bytedance.android.livesdk.comp.api.linkcore.model.PermitApplyGroupResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.RechargeResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ReplyInviteData;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ReplyInviteGroupResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ReplyResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.RtcUserInfo;
import com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicConfig;
import com.bytedance.android.livesdk.livesetting.broadcast.M2LEnablePreGetConfig;
import com.bytedance.android.livesdk.livesetting.broadcast.M2LPreGetConfigUseCache;
import com.bytedance.android.livesdk.livesetting.broadcast.TTLHSplitModuleRtcAppID;
import com.bytedance.android.livesdk.livesetting.linkmic.BecomeActiveAnrFixSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.KaraokeAudioSceneSwitchSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicAudioMuteCrashFix;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicAuxStreamHandleTiming;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicDestroyOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicFixGetCommonPosApi;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicRunOnRustWhenDispose;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicSeiEnabledBusinessIdSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LinkMicSdkCoHostUpdateLayoutTimeOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveCoHostLayoutIdConfigSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.BugFixVoiceChatSeiInvalidateSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LinkMicRustDowngradeSetting;
import com.bytedance.android.livesdk.model.message.linkcore.Player;
import com.bytedance.android.livesdk.sei.SeiAppData;
import com.bytedance.android.livesdk.sei.SeiRegion;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.bytertc.engine.RTCVideoInterface;
import com.ss.lyrax.transcoder.LyraxTranscoderFeature;
import com.ss.lyrax.video.TTLHVideoContentReportConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import tikcast.linkmic.common.PosIdentity;
import webcast.data.cohost_biz.BizJoinGroupParams;
import webcast.data.multilive_biz.BizChangeLayoutParams;
import webcast.data.multilive_biz.BizInviteParams;
import webcast.data.multilive_biz.BizResumeParams;

/* JADX INFO: renamed from: X.0bEC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C965340bEC implements InterfaceC954180awC, InterfaceC968520bJK, InterfaceC938940aXc {
    public final Context LIZ;
    public final int LIZIZ;
    public int LIZJ;
    public final Room LIZLLL;
    public final boolean LJ;
    public final C966020bFI LJFF;
    public final InterfaceC968120bIg LJI;
    public final InterfaceC937900aVw LJII;
    public final String LJIIIIZZ;
    public volatile C949400aoU LJIIIZ;
    public volatile C945380ai0 LJIIJ;
    public Function0<Boolean> LJIIJJI;
    public boolean LJIIL;
    public final C557050Lt1 LJIILIIL;
    public final C01GW LJIILJJIL;
    public final C1303170k15 LJIILL;
    public C968900bJw LJIILLIIL;
    public final C2181391AYv LJIIZILJ;
    public final C01GW LJIJ;
    public final C964760bDG LJIJI;
    public final C01GW LJIJJ;
    public final C01GW LJIJJLI;
    public final C01GW LJIL;
    public final C01GW LJJ;
    public final C01GW LJJI;
    public final HashMap<String, C967560bHm> LJJIFFI;
    public final C965350bED LJJII;

    @Override // X.InterfaceC954180awC
    public final void LJJJJZI(String str, boolean z) {
    }

    @Override // X.InterfaceC954180awC
    public final List<String> LJZ() {
        return null;
    }

    @Override // X.InterfaceC954180awC
    public final void LLILLL(TTLHVideoContentReportConfig tTLHVideoContentReportConfig) {
    }

    @Override // X.InterfaceC954180awC
    public final void LLILZIL(long j) {
    }

    @Override // X.InterfaceC954180awC
    public final void LLIZ(String str) {
    }

    @Override // X.InterfaceC954180awC
    public final void LLJJI() {
    }

    @Override // X.InterfaceC954180awC
    public final boolean A0() {
        return this.LJFF.LJIJI;
    }

    @Override // X.InterfaceC954180awC
    public final RtcUserInfo G0() {
        return this.LJFF.LJFF();
    }

    @Override // X.InterfaceC954180awC
    public final int LIZIZ() {
        C968900bJw c968900bJw = this.LJIILLIIL;
        if (c968900bJw != null) {
            return c968900bJw.LIZIZ();
        }
        return 0;
    }

    @Override // X.InterfaceC954180awC
    public final List<LinkUser> LIZLLL() {
        List<LinkUser> listLJIIIZ;
        if (this.LJFF.LJII()) {
            return LIZLLL();
        }
        C968900bJw c968900bJw = this.LJIILLIIL;
        return (c968900bJw == null || (listLJIIIZ = c968900bJw.LJIIIZ()) == null) ? C13BV.INSTANCE : listLJIIIZ;
    }

    @Override // X.InterfaceC954180awC
    public final List<LinkUser> LJII() {
        return LIZ(false);
    }

    @Override // X.InterfaceC954180awC
    public final boolean LJIILIIL() {
        return this.LJFF.LJIILIIL();
    }

    @Override // X.InterfaceC954180awC
    public final List<String> LJIILJJIL() {
        return this.LJIJI.LJIIIIZZ;
    }

    @Override // X.InterfaceC954180awC
    public final List<LinkUser> LJIL() {
        return LIZ(false);
    }

    @Override // X.InterfaceC954180awC
    public final boolean LJJII() {
        return this.LJFF.LJJII();
    }

    @Override // X.InterfaceC954180awC
    public final void LJJIII() {
        if (LLJLILLLLZIIL() instanceof C1AXM) {
            LLJLILLLLZIIL().LJJIII();
            return;
        }
        C2181391AYv c2181391AYv = this.LJIIZILJ;
        if (c2181391AYv == null || !LivesdkLinkmicSeiEnabledBusinessIdSetting.INSTANCE.isEnable("live_show_sei")) {
            return;
        }
        synchronized (c2181391AYv.LJIIJJI()) {
            try {
                synchronized (c2181391AYv.LJIIJ()) {
                    try {
                        c2181391AYv.LJIIJJI().remove("live_show_sei");
                        c2181391AYv.LJIIJ().remove("show_info");
                    } finally {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        c2181391AYv.LJIILIIL("removePermanentData");
    }

    @Override // X.InterfaceC954180awC
    public final C914780Zue LJJIIJ() {
        return this.LJFF.LJIIIZ;
    }

    @Override // X.InterfaceC954180awC
    public final EnumC467700IVs LJJIIJZLJL() {
        return this.LJFF.LJIILL == 1 ? EnumC467700IVs.MULTI_ARCH : EnumC467700IVs.CROSS_ROOM_ARCH;
    }

    @Override // X.InterfaceC954180awC
    public final List<LinkUser> LJJIJIIJI() {
        return LJJJJLL();
    }

    @Override // X.InterfaceC954180awC
    public final List<LinkUser> LJJIJLIJ() {
        return LIZ(false);
    }

    @Override // X.InterfaceC954180awC
    public final void LJJJ() {
        this.LJFF.LJ().LJJJ();
    }

    @Override // X.InterfaceC954180awC
    public final List<LinkUser> LJJJI() {
        return LIZ(false);
    }

    @Override // X.InterfaceC954180awC
    public final List<LinkUser> LJJJJ() {
        return LIZ(false);
    }

    @Override // X.InterfaceC954180awC
    public final EnumC952680atm LJJJLIIL() {
        EnumC952680atm enumC952680atm;
        C1276910jKj c1276910jKj = this.LJFF.LJJI.LIZIZ;
        return (c1276910jKj == null || (enumC952680atm = c1276910jKj.LLIZLLLIL) == null) ? EnumC952680atm.DEFAULT : enumC952680atm;
    }

    @Override // X.InterfaceC954180awC
    public final boolean LJJLI() {
        List<C968980bK4> listLIZ;
        C966020bFI c966020bFI = this.LJFF;
        if (!c966020bFI.LIZIZ || !c966020bFI.LJIJI) {
            return false;
        }
        C967370bHT c967370bHT = c966020bFI.LJJII;
        return ((c967370bHT == null || (listLIZ = c967370bHT.LJII.LIZ(false)) == null) ? 0 : listLIZ.size()) + c966020bFI.LJJIIZ < 2;
    }

    @Override // X.InterfaceC954180awC
    public final String LJJLIIIIJ() {
        return String.valueOf(this.LJFF.LJJIJ());
    }

    @Override // X.InterfaceC954180awC
    public final int LJJLIIIJLJLI() {
        return this.LJFF.LJIILL;
    }

    @Override // X.InterfaceC954180awC
    public final InterfaceC947140akq LJJLIIIJLLLLLLLZ() {
        return (InterfaceC947140akq) this.LJJ.getValue();
    }

    @Override // X.InterfaceC954180awC
    public final boolean LJJLIIJ() {
        this.LJFF.LJJI.getClass();
        return C968320bJ0.LIZ.get();
    }

    @Override // X.InterfaceC954180awC
    public final boolean LJLIIIL() {
        C966020bFI c966020bFI = this.LJFF;
        return c966020bFI.LJIILIIL() ? c966020bFI.LJIILL == 1 : c966020bFI.LIZJ == 4;
    }

    @Override // X.InterfaceC954180awC
    public final void LJLJJLL() {
        C1276910jKj c1276910jKj = this.LJFF.LJJI.LIZIZ;
        if (c1276910jKj != null) {
            c1276910jKj.muteLocalVideoStream(false);
        }
    }

    @Override // X.InterfaceC954180awC
    public final boolean LJLJLJ() {
        C1276910jKj c1276910jKj = this.LJFF.LJJI.LIZIZ;
        return C176600m4.LIZIZ(c1276910jKj != null ? Boolean.valueOf(c1276910jKj.LLILZLL) : null);
    }

    @Override // X.InterfaceC954180awC
    public final boolean LJLLILLLL() {
        if (LinkMicAuxStreamHandleTiming.INSTANCE.enable()) {
            C966020bFI c966020bFI = this.LJFF;
            if (c966020bFI.LIZ.netMode == 1) {
                C1276910jKj c1276910jKj = c966020bFI.LJJI.LIZIZ;
                return (c1276910jKj != null ? c1276910jKj.LLJJIJIIJIL : null) == EnumC1276080jJO.LinkMic;
            }
        }
        return LJLJLJ();
    }

    @Override // X.InterfaceC954180awC
    public final String LJZI() {
        this.LJFF.LJ().getClass();
        return "";
    }

    @Override // X.InterfaceC954180awC
    public final Set<Long> LLIIIZ() {
        return this.LJFF.LIZLLL();
    }

    @Override // X.InterfaceC954180awC
    public final Set<Long> LLIIJI() {
        return this.LJFF.LIZLLL();
    }

    @Override // X.InterfaceC954180awC
    @InterfaceC1294060jmO
    public final InterfaceC958070b2T LLJJ() {
        return this.LJFF.LJJIFFI;
    }

    @Override // X.InterfaceC954180awC
    public final boolean LLJJIJIIJIL() {
        Function0<Boolean> function0 = this.LJIIJJI;
        if (function0 != null) {
            return function0.invoke().booleanValue();
        }
        return false;
    }

    @Override // X.InterfaceC954180awC
    public final InterfaceC955150axl LLJJJIL() {
        return (InterfaceC955150axl) this.LJIL.getValue();
    }

    public final InterfaceC964790bDJ LLJLILLLLZIIL() {
        return (InterfaceC964790bDJ) this.LJIJJLI.getValue();
    }

    public final C968900bJw LLJLL() {
        return (C968900bJw) this.LJIJJ.getValue();
    }

    @Override // X.InterfaceC954180awC
    public final int LLJLLIL() {
        return this.LJFF.LJIIIIZZ;
    }

    public final boolean LLJLLL() {
        return this.LJFF.LJIIIIZZ();
    }

    @Override // X.InterfaceC954180awC
    public final String U3() {
        return String.valueOf(this.LJFF.LIZLLL);
    }

    @Override // X.InterfaceC954180awC
    public final boolean Z4() {
        C1276910jKj c1276910jKj = this.LJFF.LJJI.LIZIZ;
        if (c1276910jKj != null) {
            InterfaceC1276380jJs interfaceC1276380jJs = c1276910jKj.LLJJJJ;
            boolValueOf = Boolean.valueOf(C500260Jjc.LJJJI(interfaceC1276380jJs != null ? Boolean.valueOf(interfaceC1276380jJs.Z4()) : null));
        }
        return C176600m4.LIZIZ(boolValueOf);
    }

    @Override // X.InterfaceC954180awC
    public final boolean ae() {
        List<C968980bK4> listLIZ;
        C966020bFI c966020bFI = this.LJFF;
        if (!c966020bFI.LJIJI) {
            return false;
        }
        C967370bHT c967370bHT = c966020bFI.LJJII;
        return ((c967370bHT == null || (listLIZ = c967370bHT.LJII.LIZ(false)) == null) ? 0 : listLIZ.size()) + c966020bFI.LJJIIZ >= 2;
    }

    @Override // X.InterfaceC954180awC
    public final boolean isLinked() {
        return this.LJFF.LJII();
    }

    @Override // X.InterfaceC954180awC
    public final void pause() {
        C20441214yg.LIZIZ(this.LJIIIIZZ, "session call pause");
        C966020bFI c966020bFI = this.LJFF;
        C1AZW.LIZIZ(c966020bFI.LJJ, c966020bFI.LJ, "[appDidEnterBackground]", null, null);
        c966020bFI.LJ().LJLI();
        C1276910jKj c1276910jKj = this.LJFF.LJJI.LIZIZ;
        if (c1276910jKj != null) {
            C965350bED c965350bED = c1276910jKj.LLILZ.LJJ;
            String str = c1276910jKj.LLILZIL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[pause] client:");
            InterfaceC1276380jJs interfaceC1276380jJs = c1276910jKj.LLJJJJ;
            sbLIZ.append(interfaceC1276380jJs != null ? Integer.valueOf(interfaceC1276380jJs.hashCode()) : null);
            C1AZW.LIZIZ(c965350bED, str, C2188811AlT.LIZIZ(sbLIZ), null, null);
            if (((Boolean) c1276910jKj.LLJLLL.getValue()).booleanValue()) {
                c1276910jKj.LLJJI = true;
            }
            InterfaceC1276380jJs interfaceC1276380jJs2 = c1276910jKj.LLJJJJ;
            if (interfaceC1276380jJs2 != null) {
                interfaceC1276380jJs2.pause();
            }
        }
    }

    @Override // X.InterfaceC954180awC
    public final void resume() {
        C20441214yg.LIZIZ(this.LJIIIIZZ, "session call resume");
        C966020bFI c966020bFI = this.LJFF;
        C1AZW.LIZIZ(c966020bFI.LJJ, c966020bFI.LJ, "[appDidBecomeActive]", null, null);
        if (BecomeActiveAnrFixSetting.enable()) {
            C965900bF6.LIZ(new C967730bI3(c966020bFI));
        } else {
            c966020bFI.LJ().LJJJJJ();
        }
        C1276910jKj c1276910jKj = this.LJFF.LJJI.LIZIZ;
        if (c1276910jKj != null) {
            C965350bED c965350bED = c1276910jKj.LLILZ.LJJ;
            String str = c1276910jKj.LLILZIL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[resume] client:");
            InterfaceC1276380jJs interfaceC1276380jJs = c1276910jKj.LLJJJJ;
            sbLIZ.append(interfaceC1276380jJs != null ? Integer.valueOf(interfaceC1276380jJs.hashCode()) : null);
            C1AZW.LIZIZ(c965350bED, str, C2188811AlT.LIZIZ(sbLIZ), null, null);
            if (((Boolean) c1276910jKj.LLJLLL.getValue()).booleanValue()) {
                c1276910jKj.LLJJI = false;
            }
            InterfaceC1276380jJs interfaceC1276380jJs2 = c1276910jKj.LLJJJJ;
            if (interfaceC1276380jJs2 != null) {
                interfaceC1276380jJs2.resume();
            }
        }
    }

    @Override // X.InterfaceC954180awC
    public final List<PosIdentity> LJIIJJI() {
        return LLJLILLLLZIIL().LJIIJJI();
    }

    @Override // X.InterfaceC954180awC
    public final void LJJLJ() {
        C1AXM c1axm;
        if (!(LLJLILLLLZIIL() instanceof C1AXM)) {
            C2181391AYv c2181391AYv = this.LJIIZILJ;
            if (c2181391AYv != null) {
                c2181391AYv.LLJILJIL.LJI("business", false);
                return;
            }
            return;
        }
        InterfaceC964790bDJ interfaceC964790bDJLLJLILLLLZIIL = LLJLILLLLZIIL();
        if (!(interfaceC964790bDJLLJLILLLLZIIL instanceof C1AXM) || (c1axm = (C1AXM) interfaceC964790bDJLLJLILLLLZIIL) == null) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(c1axm.LLILLJJLI);
        sbLIZ.append("_manualUpdateAllWaterMark");
        C20441214yg.LIZIZ("water_mark_opt", C2188811AlT.LIZIZ(sbLIZ));
        c1axm.LJLLLL().LJI("business", false);
    }

    @Override // X.InterfaceC954180awC
    public final InterfaceC937900aVw LLIIJLIL() {
        return LLJLILLLLZIIL();
    }

    @Override // X.InterfaceC954180awC
    public final boolean LLILL() {
        C0TCJ c0tcjLLILLJJLI = LLILLJJLI();
        return c0tcjLLILLJJLI == C0TCJ.LiveLinkMicSession || c0tcjLLILLJJLI == C0TCJ.RustLinkMicSession;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("{\n        |\"instanceId\": ");
        sbLIZ.append(hashCode());
        sbLIZ.append(",\n        |\"channelId\": ");
        sbLIZ.append(U3());
        sbLIZ.append(",\n        |\"Scene\": ");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(",\n        |\"linkState\": ");
        sbLIZ.append(this.LJFF.LJIIIIZZ);
        sbLIZ.append("\n        }");
        return C09AZ.LIZLLL(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC954180awC
    public final C949400aoU LJJJJJ() {
        return this.LJIIIZ;
    }

    @Override // X.InterfaceC954180awC
    public final C0TCJ LLILLJJLI() {
        return C0TCJ.RustLinkMicSession;
    }

    @Override // X.InterfaceC954180awC
    public final C945380ai0 LLILZLL() {
        return this.LJIIJ;
    }

    @Override // X.InterfaceC968520bJK
    public final C2181391AYv LLJJIJI() {
        return this.LJIIZILJ;
    }

    @Override // X.InterfaceC954180awC
    public final int getSessionVersion() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC954180awC
    public final int scene() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC954180awC
    public final void LIZ(InterfaceC964720bDC interfaceC964720bDC) {
        C964730bDD c964730bDD = this.LJFF.LJJIII;
        if (c964730bDD != null && !c964730bDD.LL.contains(interfaceC964720bDC)) {
            c964730bDD.LL.add(interfaceC964720bDC);
        }
    }

    @Override // X.InterfaceC954180awC
    @InterfaceC1294060jmO
    public final void LIZJ(String str) {
        int i = this.LIZIZ;
        if (i == 2 || i == 0 || (i == 4 && BugFixVoiceChatSeiInvalidateSetting.INSTANCE.isEnable())) {
            this.LJFF.LJJI.LIZIZ(str);
        }
    }

    @Override // X.InterfaceC954180awC
    public final boolean LJ(String str) {
        Boolean boolValueOf;
        LinkUser next;
        if (this.LJFF.LJII()) {
            if (LinkMicAudioMuteCrashFix.INSTANCE.enable()) {
                Iterator<LinkUser> it2 = LIZLLL().iterator();
                while (true) {
                    boolValueOf = null;
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (Intrinsics.LJFF(next.linkMicId, str)) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                LinkUser linkUser = next;
                if (linkUser != null) {
                    boolValueOf = Boolean.valueOf(linkUser.audioOn());
                }
                if (!C500260Jjc.LJJJI(boolValueOf)) {
                    return true;
                }
                return false;
            }
            return this.LJFF.LJ().LJ(str);
        }
        C967560bHm c967560bHm = this.LJJIFFI.get(str);
        if (c967560bHm != null) {
            return c967560bHm.LIZIZ;
        }
        return false;
    }

    @Override // X.InterfaceC954180awC
    public final void LJFF(String str) {
        this.LJFF.LJ().LJFF(str);
    }

    @Override // X.InterfaceC954180awC
    public final boolean LJI(String str) {
        return this.LJFF.LJ().LJI(str);
    }

    @Override // X.InterfaceC954180awC
    public final void LJIIIIZZ(List<? extends LyraxTranscoderFeature> list) {
        Integer numValueOf;
        Integer numValueOf2;
        Integer numValueOf3;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("features = ");
        if (list != null) {
            numValueOf = Integer.valueOf(list.size());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        C20441214yg.LJIIIZ("setFeatures", C2188811AlT.LIZIZ(sbLIZ));
        C966050bFL c966050bFL = this.LJFF.LJJI;
        InterfaceC2181441AZa interfaceC2181441AZa = c966050bFL.LIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("[setFeatures] features=");
        if (list != null) {
            numValueOf2 = Integer.valueOf(list.size());
        } else {
            numValueOf2 = null;
        }
        sbLIZ2.append(numValueOf2);
        C1AZW.LJIIIZ(interfaceC2181441AZa, "RustRtcEngine", C2188811AlT.LIZIZ(sbLIZ2), null, null);
        C1276910jKj c1276910jKj = c966050bFL.LIZIZ;
        if (c1276910jKj != null) {
            C965350bED c965350bED = c1276910jKj.LLILZ.LJJ;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("features=");
            if (list != null) {
                numValueOf3 = Integer.valueOf(list.size());
            } else {
                numValueOf3 = null;
            }
            sbLIZ3.append(numValueOf3);
            C1AZW.LIZIZ(c965350bED, "[setFeatures]", C2188811AlT.LIZIZ(sbLIZ3), null, null);
            InterfaceC1276380jJs interfaceC1276380jJs = c1276910jKj.LLJJJJ;
            if (interfaceC1276380jJs != null) {
                interfaceC1276380jJs.LJIIIIZZ(list);
            }
        }
    }

    @Override // X.InterfaceC954180awC
    public final Rect LJIIJ(String str) {
        return LLJLILLLLZIIL().LJIIJ(str);
    }

    @Override // X.InterfaceC954180awC
    public final void LJIIL(int i) {
        InterfaceC1276380jJs interfaceC1276380jJs;
        if (!KaraokeAudioSceneSwitchSetting.INSTANCE.isEnable()) {
            return;
        }
        C1276910jKj c1276910jKj = this.LJFF.LJJI.LIZIZ;
        if (c1276910jKj != null && (interfaceC1276380jJs = c1276910jKj.LLJJJJ) != null) {
            interfaceC1276380jJs.LJIIL(i);
        }
        String str = this.LJIIIIZZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("mRtcClient?.setAudioScene = ");
        sbLIZ.append(i);
        C20441214yg.LIZIZ(str, C2188811AlT.LIZIZ(sbLIZ));
        Integer numValueOf = Integer.valueOf(i);
        if (numValueOf != null) {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_linkmic_audio_scene");
            c474500IjALIZ.LJJII(numValueOf, Scene.SCENE_SERVICE);
            c474500IjALIZ.LIZ();
        }
    }

    @Override // X.InterfaceC954180awC
    public final void LJIILL(String str) {
        if (LLJLILLLLZIIL() instanceof C1AXM) {
            LLJLILLLLZIIL().LJIILL(str);
            return;
        }
        C2181391AYv c2181391AYv = this.LJIIZILJ;
        if (c2181391AYv == null) {
            return;
        }
        synchronized (c2181391AYv.LJIIJJI()) {
            try {
                c2181391AYv.LJIIJJI().remove(str);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        c2181391AYv.LJIILIIL("removePermanentData");
    }

    @Override // X.InterfaceC954180awC
    public final void LJIILLIIL(String str) {
        C1276910jKj c1276910jKj = this.LJFF.LJJI.LIZIZ;
        if (c1276910jKj != null) {
            String str2 = c1276910jKj.LLILZIL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("destoryAuxStream streamId=");
            sbLIZ.append(str);
            C20441214yg.LJIIIZ(str2, C2188811AlT.LIZIZ(sbLIZ));
            C965350bED c965350bED = c1276910jKj.LLILZ.LJJ;
            String str3 = c1276910jKj.LLILZIL;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("destoryAuxStream streamId=");
            sbLIZ2.append(str);
            C1AZW.LIZIZ(c965350bED, str3, C2188811AlT.LIZIZ(sbLIZ2), null, null);
            InterfaceC1276380jJs interfaceC1276380jJs = c1276910jKj.LLJJJJ;
            if (interfaceC1276380jJs != null) {
                interfaceC1276380jJs.LJIILLIIL(str);
            }
        }
    }

    @Override // X.InterfaceC954180awC
    public final void LJIIZILJ(Map<String, MicPositionContentInfo> map) {
        this.LJFF.LJIJJLI(map);
    }

    @Override // X.InterfaceC954180awC
    public final void LJIJJLI(List<PosIdentity> list) {
        InterfaceC964930bDX interfaceC964930bDX;
        InterfaceC964790bDJ interfaceC964790bDJLLJLILLLLZIIL = LLJLILLLLZIIL();
        if ((interfaceC964790bDJLLJLILLLLZIIL instanceof InterfaceC964930bDX) && (interfaceC964930bDX = (InterfaceC964930bDX) interfaceC964790bDJLLJLILLLLZIIL) != null) {
            interfaceC964930bDX.LJIJJLI(list);
        }
    }

    @Override // X.InterfaceC954180awC
    public final void LJJIFFI(boolean z) {
        this.LJFF.LIZJ(z);
    }

    @Override // X.InterfaceC954180awC
    public final C1275750jIr LJJIJ(C01IN c01in) {
        C1276910jKj c1276910jKj = this.LJFF.LJJI.LIZIZ;
        if (c1276910jKj != null) {
            return c1276910jKj.LJJJLIIL(c01in);
        }
        return null;
    }

    @Override // X.InterfaceC954180awC
    public final Pair<Integer, Rect> LJJIJIIJIL(String str) {
        return LLJLILLLLZIIL().LJJIJIIJIL(str);
    }

    @Override // X.InterfaceC954180awC
    public final void LJJIZ(String str) {
        if (LLJLILLLLZIIL() instanceof C1AXM) {
            LLJLILLLLZIIL().LJJIZ(str);
            return;
        }
        C2181391AYv c2181391AYv = this.LJIIZILJ;
        if (c2181391AYv == null || !LivesdkLinkmicSeiEnabledBusinessIdSetting.INSTANCE.isEnable(str)) {
            return;
        }
        synchronized (c2181391AYv.LJIIJ()) {
            try {
                c2181391AYv.LJIIJ().remove(str);
                c2181391AYv.LJIILIIL("removePermanentRegionStreamData");
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.InterfaceC954180awC
    public final HashSet<String> LJJJJJL(String str) {
        return this.LJIJI.LJIIJ.get(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC954180awC
    public final void LJJJLL(final InterfaceC920680a4A<RechargeResult> interfaceC920680a4A) {
        C965930bF9 c965930bF9;
        int i = this.LIZIZ;
        if (i == 2 || i == 0) {
            C966020bFI c966020bFI = this.LJFF;
            if (interfaceC920680a4A != null) {
                c965930bF9 = new InterfaceC966890bGh<RechargeResult>() { // from class: X.0bF9
                    @Override // X.InterfaceC966890bGh
                    public final void LIZ(RechargeResult rechargeResult) {
                        InterfaceC920680a4A<RechargeResult> interfaceC920680a4A2 = interfaceC920680a4A;
                        if (interfaceC920680a4A2 != null) {
                            interfaceC920680a4A2.onSuccess(rechargeResult);
                        }
                    }

                    @Override // X.InterfaceC966890bGh
                    public final void LIZIZ(LinkCoreError linkCoreError, Throwable th) {
                        InterfaceC920680a4A<RechargeResult> interfaceC920680a4A2 = interfaceC920680a4A;
                        if (interfaceC920680a4A2 != null) {
                            interfaceC920680a4A2.LIZ(linkCoreError, th);
                        }
                    }
                };
            } else {
                c965930bF9 = 0;
            }
            C965350bED c965350bED = c966020bFI.LJJ;
            String str = c966020bFI.LJ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("recharge start source=");
            sbLIZ.append("recharge_positive");
            C1AZW.LIZIZ(c965350bED, str, C2188811AlT.LIZIZ(sbLIZ), null, null);
            final C965440bEM c965440bEM = new C965440bEM(c966020bFI, c965930bF9);
            C969040bKA c969040bKA = C969040bKA.LIZJ;
            if (!Intrinsics.LJFF(C786410Ut5.W2(c969040bKA.LIZIZ), Looper.myLooper())) {
                Runnable runnable = new Runnable() { // from class: X.07yt
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("DataConverterUtil@da11.postToBackGroundThread$1");
                        try {
                            c965440bEM.invoke();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("DataConverterUtil@da11.postToBackGroundThread$1");
                    }
                };
                if (!c969040bKA.LIZIZ.isAlive()) {
                    C1CC2.LIZ("thread not alive", new Throwable());
                }
                C786410Ut5.LJJZZIII(c969040bKA.LIZ, runnable);
                return;
            }
            c965440bEM.invoke();
        }
    }

    @Override // X.InterfaceC954180awC
    public final boolean LJJLIL(String str) {
        if (this.LJFF.LJII()) {
            InterfaceC966930bGl interfaceC966930bGl = this.LJFF.LJ().LJ;
            if (interfaceC966930bGl != null) {
                return interfaceC966930bGl.LJI(str);
            }
            return true;
        }
        C967560bHm c967560bHm = this.LJJIFFI.get(str);
        if (c967560bHm != null) {
            return c967560bHm.LIZ;
        }
        return true;
    }

    @Override // X.InterfaceC954180awC
    public final LinkUser LJJLJLI(String str) {
        return LJJIFFI(str);
    }

    @Override // X.InterfaceC954180awC
    public final void LJJZ(InterfaceC969870bLV interfaceC969870bLV) {
        C1AXM c1axm;
        LiveStreamMixer liveStreamMixerLJLLJ;
        if (LLJLILLLLZIIL() instanceof C1AXM) {
            InterfaceC964790bDJ interfaceC964790bDJLLJLILLLLZIIL = LLJLILLLLZIIL();
            if ((interfaceC964790bDJLLJLILLLLZIIL instanceof C1AXM) && (c1axm = (C1AXM) interfaceC964790bDJLLJLILLLLZIIL) != null && (liveStreamMixerLJLLJ = c1axm.LJLLJ()) != null) {
                liveStreamMixerLJLLJ.setPlayerInfoProvider(interfaceC969870bLV);
                return;
            }
            return;
        }
        C2181391AYv c2181391AYv = this.LJIIZILJ;
        if (c2181391AYv == null) {
            return;
        }
        c2181391AYv.setPlayerInfoProvider(interfaceC969870bLV);
    }

    @Override // X.InterfaceC954180awC
    public final void LJJZZIII(InterfaceC964770bDH interfaceC964770bDH) {
        C964760bDG c964760bDG = this.LJIJI;
        if (!c964760bDG.LJII.contains(interfaceC964770bDH)) {
            c964760bDG.LJII.add(interfaceC964770bDH);
        }
    }

    @Override // X.InterfaceC954180awC
    public final OnLineMicInfo LJL(String str) {
        Boolean boolValueOf;
        OnLineMicInfo onLineMicInfoLJJIJIIJI;
        int i;
        MicPositionInfo micPositionInfo;
        C968900bJw c968900bJw = this.LJIILLIIL;
        Boolean boolValueOf2 = null;
        numValueOf = null;
        Integer numValueOf = null;
        if (c968900bJw == null) {
            return null;
        }
        if (LinkMicFixGetCommonPosApi.INSTANCE.isEnable()) {
            boolean zIsLinked = isLinked();
            try {
                Layout layoutLJFF = LLJLILLLLZIIL().LJFF();
                if (layoutLJFF != null) {
                    boolValueOf = Boolean.valueOf(layoutLJFF.isFloatType());
                } else {
                    boolValueOf = null;
                }
                if (C500260Jjc.LJJJI(boolValueOf)) {
                    if (zIsLinked) {
                        onLineMicInfoLJJIJIIJI = c968900bJw.LJFF(str);
                        i = 1;
                    } else {
                        onLineMicInfoLJJIJIIJI = c968900bJw.LJJIJLIJ(str);
                        i = 2;
                    }
                } else if (zIsLinked) {
                    onLineMicInfoLJJIJIIJI = c968900bJw.LJIJI(str);
                    i = 3;
                } else {
                    onLineMicInfoLJJIJIIJI = c968900bJw.LJJIJIIJI(str);
                    i = 4;
                }
                String str2 = this.LJIIIIZZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("getCommonPositionByLinkMicId: linkMicId:");
                sbLIZ.append(str);
                sbLIZ.append(", isLinked: ");
                sbLIZ.append(zIsLinked);
                sbLIZ.append(", form: ");
                sbLIZ.append(i);
                sbLIZ.append(", result = ");
                if (onLineMicInfoLJJIJIIJI != null && (micPositionInfo = onLineMicInfoLJJIJIIJI.micPositionData) != null) {
                    numValueOf = Integer.valueOf(micPositionInfo.position);
                }
                sbLIZ.append(numValueOf);
                C20441214yg.LIZIZ(str2, C2188811AlT.LIZIZ(sbLIZ));
                return onLineMicInfoLJJIJIIJI;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                String str3 = this.LJIIIIZZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("getCommonPositionByLinkMicId: linkMicId:");
                sbLIZ2.append(str);
                sbLIZ2.append(", isLinked: ");
                sbLIZ2.append(zIsLinked);
                sbLIZ2.append(", form: ");
                sbLIZ2.append(0);
                sbLIZ2.append(", result = ");
                sbLIZ2.append((Object) null);
                C20441214yg.LIZIZ(str3, C2188811AlT.LIZIZ(sbLIZ2));
                throw th;
            }
        }
        Layout layoutLJFF2 = LLJLILLLLZIIL().LJFF();
        if (layoutLJFF2 != null) {
            boolValueOf2 = Boolean.valueOf(layoutLJFF2.isFloatType());
        }
        if (C500260Jjc.LJJJI(boolValueOf2)) {
            OnLineMicInfo onLineMicInfoLJFF = c968900bJw.LJFF(str);
            if (onLineMicInfoLJFF == null) {
                return c968900bJw.LJJIJLIJ(str);
            }
            return onLineMicInfoLJFF;
        }
        OnLineMicInfo onLineMicInfoLJIJI = c968900bJw.LJIJI(str);
        if (onLineMicInfoLJIJI != null) {
            return onLineMicInfoLJIJI;
        }
        return c968900bJw.LJJIJIIJI(str);
    }

    @Override // X.InterfaceC938940aXc
    public final void LJLI(InterfaceC968220bIq interfaceC968220bIq) {
        this.LJFF.LJLI(interfaceC968220bIq);
    }

    @Override // X.InterfaceC954180awC
    public final int LJLIIL(String str) {
        if (this.LJFF.LJII()) {
            return this.LJFF.LJ().LJZ(str);
        }
        C967560bHm c967560bHm = this.LJJIFFI.get(str);
        if (c967560bHm != null) {
            return c967560bHm.LIZJ;
        }
        return 0;
    }

    @Override // X.InterfaceC954180awC
    public final void LJLIL(Function0<Unit> function0) {
        C967370bHT c967370bHT;
        C968900bJw c968900bJw = this.LJIILLIIL;
        if (c968900bJw != null && (c967370bHT = c968900bJw.LIZ.LJJII) != null) {
            c967370bHT.LJFF.remove(function0);
        }
    }

    @Override // X.InterfaceC954180awC
    public final void LJLILLLLZI(C963530bBH c963530bBH) {
        C966020bFI c966020bFI = this.LJFF;
        c966020bFI.LJ().LLD(c963530bBH.LIZ);
    }

    @Override // X.InterfaceC954180awC
    public final void LJLJL(C945380ai0 c945380ai0) {
        this.LJIIJ = c945380ai0;
        C966020bFI c966020bFI = this.LJFF;
        c966020bFI.LJIILIIL = new C966710bGP(this);
        C969310bKb.LIZLLL.LIZ(new RunnableC966310bFl(new C966700bGO(c966020bFI)));
    }

    @Override // X.InterfaceC954180awC
    public final void LJLLI(boolean z) {
        C1AXM c1axm;
        if (LLJLILLLLZIIL() instanceof C1AXM) {
            InterfaceC964790bDJ interfaceC964790bDJLLJLILLLLZIIL = LLJLILLLLZIIL();
            if ((interfaceC964790bDJLLJLILLLLZIIL instanceof C1AXM) && (c1axm = (C1AXM) interfaceC964790bDJLLJLILLLLZIIL) != null) {
                C2181231AYf c2181231AYfLJLLLL = c1axm.LJLLLL();
                c2181231AYfLJLLLL.LIZJ.clear();
                if (z) {
                    c2181231AYfLJLLLL.LJI("clearCustomWaterMarks", false);
                    return;
                }
                return;
            }
            return;
        }
        C2181391AYv c2181391AYv = this.LJIIZILJ;
        if (c2181391AYv == null) {
            return;
        }
        C2181241AYg c2181241AYg = c2181391AYv.LLJILJIL;
        c2181241AYg.LIZJ.clear();
        if (!z) {
            return;
        }
        c2181241AYg.LJI("clearCustomWaterMarks", false);
    }

    @Override // X.InterfaceC938940aXc
    public final void LJLLLL(InterfaceC968220bIq interfaceC968220bIq) {
        this.LJFF.LJLLLL(interfaceC968220bIq);
    }

    @Override // X.InterfaceC954180awC
    public final void LJLZ(AwS559S0100000_15 awS559S0100000_15) {
        this.LJIIJJI = awS559S0100000_15;
    }

    @Override // X.InterfaceC954180awC
    public final LinkUser LLD(long j) {
        return LJJIJL(j);
    }

    @Override // X.InterfaceC954180awC
    public final void LLFFF(C963530bBH c963530bBH) {
        boolean zIsWaitingOrJoiningOrJoinedOrLinked;
        boolean z;
        Integer numValueOf;
        int i = this.LIZIZ;
        if (i == 2 || i == 0) {
            C964950bDZ c964950bDZ = (C964950bDZ) this.LJJI.getValue();
            if (c964950bDZ != null) {
                C19487111Lx c19487111Lx = c964950bDZ.LIZLLL;
                if (c19487111Lx != null) {
                    c19487111Lx.dispose();
                }
                c964950bDZ.LIZLLL = null;
                c964950bDZ.LJ = false;
                C1AZW.LJIIJ(12, "CoAudienceSeiSubscriber", "dispose", null, null);
            }
            if (LLJLILLLLZIIL() instanceof InterfaceC940060aZQ) {
                C973010bQZ c973010bQZ = C973010bQZ.LIZ;
                C917100ZyO c917100ZyOLJFF = C973010bQZ.LJFF("session reset");
                if (LJIILIIL()) {
                    ((InterfaceC940060aZQ) LLJLILLLLZIIL()).LJJIJ(EnumC965730bEp.CROSS, EnumC965630bEf.RESET, c917100ZyOLJFF);
                } else {
                    ((InterfaceC940060aZQ) LLJLILLLLZIIL()).LJLLLL(EnumC965630bEf.RESET, c917100ZyOLJFF);
                }
            } else {
                LLJLILLLLZIIL().V4(true);
            }
            C2181391AYv c2181391AYv = this.LJIIZILJ;
            if (c2181391AYv != null) {
                c2181391AYv.LLJI = 0L;
                synchronized (c2181391AYv.LJIIJJI()) {
                    try {
                        c2181391AYv.LJIIJJI().clear();
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
                synchronized (c2181391AYv.LJIIIZ()) {
                    try {
                        c2181391AYv.LJIIIZ().clear();
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        throw th2;
                    }
                }
                synchronized (c2181391AYv.LJIIJ()) {
                    try {
                        c2181391AYv.LJIIJ().clear();
                    } catch (Throwable th3) {
                        TryCatchGuardChecker.doCheck(th3);
                        throw th3;
                    }
                }
                synchronized (c2181391AYv.LLJJI.getValue()) {
                    try {
                        ((HashMap) c2181391AYv.LLJJI.getValue()).clear();
                    } catch (Throwable th4) {
                        TryCatchGuardChecker.doCheck(th4);
                        throw th4;
                    }
                }
            }
            if (!LJIILIIL() || !Intrinsics.LJFF(c963530bBH, C963530bBH.LJ)) {
                C966020bFI c966020bFI = this.LJFF;
                C965350bED c965350bED = c966020bFI.LJJ;
                String str = c966020bFI.LJ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("[reset], source=");
                sbLIZ.append(c963530bBH);
                C1AZW.LIZIZ(c965350bED, str, C2188811AlT.LIZIZ(sbLIZ), null, null);
                Iterator<InterfaceC420801kM> it2 = c966020bFI.LJJIIZI.iterator();
                while (it2.hasNext()) {
                    c966020bFI.LJJIJ.LIZJ(it2.next());
                }
                c966020bFI.LJJIIZI.clear();
                if (c966020bFI.LJIILIIL()) {
                    C914780Zue c914780Zue = c966020bFI.LJIIIZ;
                    EnumC969200bKQ enumC969200bKQ = c914780Zue.LIZ;
                    if (enumC969200bKQ != EnumC969200bKQ.Wait && !C954950axR.LIZJ(enumC969200bKQ) && !C954950axR.LIZIZ(c914780Zue.LIZIZ)) {
                        zIsWaitingOrJoiningOrJoinedOrLinked = false;
                    } else {
                        zIsWaitingOrJoiningOrJoinedOrLinked = true;
                    }
                } else {
                    zIsWaitingOrJoiningOrJoinedOrLinked = LinkMicState.Companion.isWaitingOrJoiningOrJoinedOrLinked(c966020bFI.LJIIIIZZ);
                }
                StringBuilder sb = new StringBuilder("RustLinker reset, isRoomOwner=");
                sb.append(c966020bFI.LIZIZ);
                sb.append(", lastStatus=");
                sb.append(c966020bFI.LJII);
                sb.append(", currentStatus=");
                sb.append(zIsWaitingOrJoiningOrJoinedOrLinked);
                sb.append(", linkStatus=");
                sb.append(c966020bFI.LJIIIZ.LIZ);
                sb.append(", rtcStatus=");
                sb.append(c966020bFI.LJIIIZ.LIZIZ);
                sb.append(", source=");
                sb.append(c963530bBH);
                sb.append(", isSame=");
                int i2 = c966020bFI.LJII;
                Object obj = c963530bBH.LIZIZ;
                if ((obj instanceof C968670bJZ) && obj != null && i2 == 0) {
                    z = true;
                } else {
                    z = false;
                }
                sb.append(z);
                C20441214yg.LIZIZ("RustLinker", sb.toString());
                int i3 = c966020bFI.LJII;
                Object obj2 = c963530bBH.LIZIZ;
                if (!(obj2 instanceof C968670bJZ) || obj2 == null || i3 != 0) {
                    if (!c966020bFI.LIZIZ && zIsWaitingOrJoiningOrJoinedOrLinked) {
                        C965900bF6.LIZ(new C965870bF3(c966020bFI, c963530bBH));
                    } else {
                        c966020bFI.LJ().LIZIZ(c963530bBH.LIZ);
                    }
                    if (!c966020bFI.LJIILIIL()) {
                        c966020bFI.LJIIIIZZ = 6;
                    }
                }
                C967770bI7 c967770bI7 = c966020bFI.LJJIFFI;
                c967770bI7.getClass();
                C13BV c13bv = C13BV.INSTANCE;
                c967770bI7.LJII(c13bv);
                c967770bI7.LJI(c13bv);
                C967220bHE c967220bHE = c967770bI7.LJI;
                c967220bHE.getClass();
                c967220bHE.LIZLLL(c13bv);
                C967220bHE c967220bHE2 = c967770bI7.LJII;
                c967220bHE2.getClass();
                c967220bHE2.LIZLLL(c13bv);
                C967220bHE c967220bHE3 = c967770bI7.LJIIIIZZ;
                c967220bHE3.getClass();
                c967220bHE3.LIZLLL(c13bv);
                ((ConcurrentHashMap) c967770bI7.LJIL).clear();
                c967770bI7.LJIILLIIL.LJ();
                c967770bI7.LJIJ = 1;
                if (c967770bI7.LIZIZ) {
                    C967220bHE c967220bHE4 = c967770bI7.LJIILJJIL;
                    c967220bHE4.getClass();
                    c967220bHE4.LIZLLL(c13bv);
                }
                C967370bHT c967370bHT = c966020bFI.LJJII;
                if (c967370bHT != null) {
                    C967320bHO c967320bHO = c967370bHT.LJI;
                    c967320bHO.getClass();
                    c967320bHO.LIZLLL(c13bv);
                    C967310bHN c967310bHN = c967370bHT.LJII;
                    c967310bHN.getClass();
                    c967310bHN.LIZLLL(c13bv);
                }
                C1276910jKj c1276910jKj = c966020bFI.LJJI.LIZIZ;
                if (c1276910jKj != null) {
                    C965350bED c965350bED2 = c1276910jKj.LLILZ.LJJ;
                    String str2 = c1276910jKj.LLILZIL;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("[reset]");
                    InterfaceC1276380jJs interfaceC1276380jJs = c1276910jKj.LLJJJJ;
                    if (interfaceC1276380jJs != null) {
                        numValueOf = Integer.valueOf(interfaceC1276380jJs.hashCode());
                    } else {
                        numValueOf = null;
                    }
                    sbLIZ2.append(numValueOf);
                    C1AZW.LIZIZ(c965350bED2, str2, C2188811AlT.LIZIZ(sbLIZ2), null, null);
                    c1276910jKj.LJJJJZI(true, false, "reset", null);
                    c1276910jKj.LLJJJJJIL = null;
                    ((LinkedHashMap) c1276910jKj.LLJJJJLIIL).clear();
                }
            }
        }
    }

    @Override // X.InterfaceC954180awC
    public final void LLFZ(boolean z) {
        C966020bFI c966020bFI = this.LJFF;
        String str = c966020bFI.LJIILJJIL;
        if (str != null) {
            c966020bFI.LJJIFFI.LJFF(str, z);
        }
        c966020bFI.LJ().LLFZ(z);
    }

    @Override // X.InterfaceC954180awC
    public final void LLI(AsyncAuxStreamCreateTask asyncAuxStreamCreateTask) {
        C1276910jKj c1276910jKj = this.LJFF.LJJI.LIZIZ;
        if (c1276910jKj != null) {
            if (c1276910jKj.LJIL()) {
                asyncAuxStreamCreateTask.callback.onCreated(c1276910jKj.LJJJLIIL(asyncAuxStreamCreateTask.config));
                return;
            }
            c1276910jKj.LLJLIL = asyncAuxStreamCreateTask;
            if (c1276910jKj.LLILZ.LJIILIIL()) {
                C966020bFI c966020bFI = c1276910jKj.LLILZ;
                c966020bFI.getClass();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("joinRtcRoom token:");
                sbLIZ.append("AuxStream");
                sbLIZ.append(" pushData:");
                sbLIZ.append(false);
                sbLIZ.append(" mixStream:");
                sbLIZ.append(false);
                C20441214yg.LIZIZ("RustLinker", C2188811AlT.LIZIZ(sbLIZ));
                c966020bFI.LJ().LJJLJLI();
                return;
            }
            c1276910jKj.LLILZ.LJ().LJJJLZIJ(true);
        }
    }

    @Override // X.InterfaceC954180awC
    public final void LLIFFJFJJ(InterfaceC964770bDH interfaceC964770bDH) {
        this.LJIJI.LJII.remove(interfaceC964770bDH);
    }

    @Override // X.InterfaceC954180awC
    public final OnLineMicInfo LLII(String str) {
        C968900bJw c968900bJw = this.LJIILLIIL;
        Boolean boolValueOf = null;
        if (c968900bJw == null) {
            return null;
        }
        Layout layoutLJFF = LLJLILLLLZIIL().LJFF();
        if (layoutLJFF != null) {
            boolValueOf = Boolean.valueOf(layoutLJFF.isFloatType());
        }
        if (C500260Jjc.LJJJI(boolValueOf)) {
            return c968900bJw.LJFF(str);
        }
        return c968900bJw.LJIJI(str);
    }

    @Override // X.InterfaceC954180awC
    public final void LLIIII(InterfaceC1303110k0z interfaceC1303110k0z) {
        this.LJIILL.LJJJ(this.LIZIZ, this.LIZJ, interfaceC1303110k0z, null);
    }

    @Override // X.InterfaceC954180awC
    public final void LLIIIILZ(String str) {
        C1AXM c1axm;
        if (LLJLILLLLZIIL() instanceof C1AXM) {
            InterfaceC964790bDJ interfaceC964790bDJLLJLILLLLZIIL = LLJLILLLLZIIL();
            if ((interfaceC964790bDJLLJLILLLLZIIL instanceof C1AXM) && (c1axm = (C1AXM) interfaceC964790bDJLLJLILLLLZIIL) != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(c1axm.LLILLJJLI);
                sbLIZ.append("_setMaskBgUrl url:");
                sbLIZ.append(str);
                C20441214yg.LIZIZ("water_mark_opt", C2188811AlT.LIZIZ(sbLIZ));
                c1axm.LJLLLL().LJFF(str);
                return;
            }
            return;
        }
        C2181391AYv c2181391AYv = this.LJIIZILJ;
        if (c2181391AYv == null) {
            return;
        }
        c2181391AYv.LLJILJIL.LJFF(str);
    }

    @Override // X.InterfaceC954180awC
    public final void LLIIIJ(long j) {
        C966020bFI c966020bFI = this.LJFF;
        C967770bI7 c967770bI7 = c966020bFI.LJJIFFI;
        ((ConcurrentHashMap) c967770bI7.LJIL).put(c966020bFI.LJJIJIIJI(), Long.valueOf(j));
    }

    @Override // X.InterfaceC954180awC
    public final void LLIILII(Function0<Unit> function0) {
        C967370bHT c967370bHT;
        C968900bJw c968900bJw = this.LJIILLIIL;
        if (c968900bJw != null && (c967370bHT = c968900bJw.LIZ.LJJII) != null) {
            c967370bHT.LJFF.add(function0);
        }
    }

    @Override // X.InterfaceC954180awC
    public final void LLIILZL(int i) {
        if (i < 0) {
            return;
        }
        C965350bED c965350bED = this.LJJII;
        String str = this.LJIIIIZZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateDslLayoutByVersion version:");
        sbLIZ.append(i);
        C1AZW.LIZIZ(c965350bED, str, C2188811AlT.LIZIZ(sbLIZ), null, null);
        this.LIZJ = i;
        this.LJIILL.LJJJ(this.LIZIZ, i, new InterfaceC1303110k0z() { // from class: X.0bGW
            @Override // X.InterfaceC1303110k0z
            public final void LIZ(DslLayout dslLayout) {
                this.LIZ.LLJLILLLLZIIL().LLIIIJ(dslLayout);
            }
        }, null);
    }

    @Override // X.InterfaceC954180awC
    public final void LLILII(InterfaceC964720bDC interfaceC964720bDC) {
        C964730bDD c964730bDD = this.LJFF.LJJIII;
        if (c964730bDD != null) {
            c964730bDD.LL.remove(interfaceC964720bDC);
        }
    }

    @Override // X.InterfaceC954180awC
    public final void LLJ(Cert cert) {
        C966020bFI c966020bFI = this.LJFF;
        C1AZW.LIZIZ(c966020bFI.LJJ, c966020bFI.LJ, "[startPushData]", null, null);
        c966020bFI.LJ().LIZ();
    }

    @Override // X.InterfaceC954180awC
    public final String LLJIJIL(int i) {
        Object next;
        Iterator it2 = ((LinkedHashMap) LLJLL().LIZ()).entrySet().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                MicPositionInfo micPositionInfo = ((OnLineMicInfo) ((Map.Entry) next).getValue()).micPositionData;
                if (micPositionInfo != null && micPositionInfo.position == i) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry == null) {
            return null;
        }
        return (String) entry.getKey();
    }

    @Override // X.InterfaceC954180awC
    public final void LLJJJJJIL(C925560aC2 c925560aC2) {
        C966020bFI c966020bFI = this.LJFF;
        JoinChannelData.Builder builder = new JoinChannelData.Builder();
        builder.setBizJoinChannelParams(c925560aC2.LIZ);
        JoinChannelData joinChannelDataBuild = builder.build();
        c966020bFI.getClass();
        BizJoinChannelParams bizJoinChannelParams = joinChannelDataBuild.bizJoinChannelParams;
        C965350bED c965350bED = c966020bFI.LJJ;
        String str = c966020bFI.LJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("joinChannel");
        sbLIZ.append(" start data=");
        sbLIZ.append(bizJoinChannelParams);
        C1AZW.LIZIZ(c965350bED, str, C2188811AlT.LIZIZ(sbLIZ), null, null);
        C965350bED c965350bED2 = c966020bFI.LJJ;
        String str2 = c966020bFI.LJ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("joinChannel start bizJoinChannelParams=");
        sbLIZ2.append(bizJoinChannelParams);
        sbLIZ2.append(" channelId=");
        sbLIZ2.append(c966020bFI.LIZLLL);
        sbLIZ2.append(" state=");
        sbLIZ2.append(c966020bFI.LJIIIIZZ);
        C1AZW.LIZIZ(c965350bED2, str2, C2188811AlT.LIZIZ(sbLIZ2), null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [X.0bGk] */
    /* JADX WARN: Type inference failed for: r4v1, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.ArrayList] */
    public final void LLJJLIIIJLLLLLLLZ(InterfaceC940430aa1 interfaceC940430aa1) {
        SeiAppData seiAppData;
        long jLJIIL;
        ?? arrayList;
        long jLJIIL2;
        if (interfaceC940430aa1 instanceof SeiAppData) {
            seiAppData = (SeiAppData) interfaceC940430aa1;
        } else {
            seiAppData = null;
        }
        boolean z = false;
        if (seiAppData != null) {
            C966020bFI c966020bFI = this.LJFF;
            c966020bFI.getClass();
            if (!Intrinsics.LJFF(seiAppData.groupChannelId, String.valueOf(c966020bFI.LJFF)) || seiAppData.linkerMode != c966020bFI.LJIILL) {
                String str = seiAppData.groupChannelId;
                if (str != null) {
                    jLJIIL = C966020bFI.LJIIL(str);
                } else {
                    jLJIIL = 0;
                }
                c966020bFI.LJFF = jLJIIL;
                c966020bFI.LJ().LJJLIIIJLLLLLLLZ(c966020bFI.LJFF, seiAppData.linkerMode, EnumC2233251Cax.Sei);
                z = true;
            }
            if (!Objects.equals(seiAppData.grids, c966020bFI.LJIILLIIL)) {
                c966020bFI.LJIILLIIL = seiAppData.grids;
                ?? LJ = c966020bFI.LJ();
                List<SeiRegion> list = c966020bFI.LJIILLIIL;
                if (list != null) {
                    arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                    for (SeiRegion seiRegion : list) {
                        C1CXJ c1cxj = C1CXJ.Undefined;
                        C1CX5 c1cx5 = C1CX5.Undefined;
                        C1CXK c1cxk = C1CXK.Undefined;
                        C1CXI c1cxi = C1CXI.Unknown;
                        C967180bHA c967180bHA = new C967180bHA(0L, 0L, 0L, "", 0L, 0L, false, true, false, false, c1cxj, 0L, 0L, 0L, 0L, c1cx5, c1cxk, "", 0L, "", c1cxi);
                        c967180bHA.LIZIZ = C966020bFI.LJIIL(seiRegion.cid);
                        String str2 = seiRegion.uidStr;
                        if (str2 == null) {
                            str2 = "";
                        }
                        c967180bHA.LIZLLL = str2;
                        c967180bHA.LJII = !seiRegion.muteAudioBool;
                        c967180bHA.LJIIIIZZ = !seiRegion.muteVideoBool;
                        int i = seiRegion.onlineUserState;
                        if (i != 1) {
                            if (i == 2) {
                                c1cxj = C1CXJ.Paused;
                            }
                        } else {
                            c1cxj = C1CXJ.Normal;
                        }
                        c967180bHA.LJIIJ = c1cxj;
                        String str3 = seiAppData.groupChannelId;
                        if (str3 != null) {
                            jLJIIL2 = C966020bFI.LJIIL(str3);
                        } else {
                            jLJIIL2 = 0;
                        }
                        c967180bHA.LJIJ = jLJIIL2;
                        int i2 = seiRegion.userType;
                        if (i2 != 1) {
                            if (i2 == 2) {
                                c1cxi = C1CXI.Host;
                            }
                        } else {
                            c1cxi = C1CXI.Guest;
                        }
                        c967180bHA.LJIJJ = c1cxi;
                        arrayList.add(c967180bHA);
                    }
                } else {
                    arrayList = C13BV.INSTANCE;
                }
                LJ.LJZL(arrayList);
                z = true;
            }
        }
        if (!((Boolean) this.LJIILJJIL.getValue()).booleanValue() && z && interfaceC940430aa1 != null) {
            C968900bJw c968900bJw = this.LJIILLIIL;
            if (c968900bJw != null) {
                c968900bJw.LJIL(interfaceC940430aa1);
            }
            C968900bJw c968900bJw2 = this.LJIILLIIL;
            if (c968900bJw2 != null) {
                c968900bJw2.LJIIZILJ(interfaceC940430aa1);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLJL(com.bytedance.android.livesdk.model.message.linkcore.LinkLayerMessage r15) {
        /*
            r14 = this;
            int r1 = r15.messageType
            r0 = 1
            r10 = 0
            if (r1 == r0) goto L82
            r0 = 10
            if (r1 != r0) goto L7b
            X.0bDJ r0 = r14.LLJLILLLLZIIL()
            r0.LJIJ(r10)
            X.0bFI r0 = r14.LJFF
            X.0bI7 r3 = r0.LJJIFFI
            com.bytedance.android.livesdk.model.message.linkcore.FinishChannelContent r0 = r15.finishContent
            if (r0 == 0) goto L7e
            com.bytedance.android.livesdk.model.message.linkcore.Player r2 = r0.owner
            com.bytedance.android.livesdk.model.message.linkcore.Player r0 = r0.owner
            if (r0 == 0) goto L7f
            long r0 = r0.uid
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            if (r0 == 0) goto L7f
            long r0 = r0.longValue()
        L2b:
            com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser r0 = r3.LJJIJL(r0)
            if (r0 == 0) goto L7c
            java.lang.String r0 = r0.linkMicId
        L33:
            com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser r5 = r14.LLJZ(r2, r0)
            int r7 = r3.LJJIL()
            java.util.List<com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser> r0 = r3.LJIJI
            int r6 = r0.size()
            java.lang.Class<com.bytedance.android.message.IMessageService> r0 = com.bytedance.android.message.IMessageService.class
            X.006A r0 = X.C1161920gLG.LIZJ(r0)
            com.bytedance.android.message.IMessageService r0 = (com.bytedance.android.message.IMessageService) r0
            r0.notifyOnMessage(r15)
            X.0bDG r4 = r14.LJIJI
            X.0bFI r3 = r14.LJFF
            com.bytedance.android.livesdk.comp.api.linkcore.model.DestroyChannelMessage r2 = new com.bytedance.android.livesdk.comp.api.linkcore.model.DestroyChannelMessage
            com.bytedance.android.livesdk.comp.api.linkcore.model.ExtraDataWrapper r8 = new com.bytedance.android.livesdk.comp.api.linkcore.model.ExtraDataWrapper
            r9 = 0
            com.bytedance.android.livesdk.model.message.linkcore.FinishChannelContent r0 = r15.finishContent
            if (r0 == 0) goto L5f
            long r0 = r0.finishReason
            java.lang.Long r10 = java.lang.Long.valueOf(r0)
        L5f:
            com.bytedance.android.livesdk.model.message.LinkMessage r13 = new com.bytedance.android.livesdk.model.message.LinkMessage
            r13.<init>()
            r11 = 0
            r8.<init>(r9, r10, r11, r13)
            com.bytedance.android.livesdk.comp.api.linkcore.model.CustomLinkMessage r0 = X.C954920axO.LJ(r15, r8)
            r2.<init>(r5, r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            r4.LLIIJLIL(r3, r2, r1, r0)
        L7b:
            return
        L7c:
            r0 = r10
            goto L33
        L7e:
            r2 = r10
        L7f:
            r0 = -1
            goto L2b
        L82:
            java.lang.Class<com.bytedance.android.message.IMessageService> r0 = com.bytedance.android.message.IMessageService.class
            X.006A r0 = X.C1161920gLG.LIZJ(r0)
            com.bytedance.android.message.IMessageService r0 = (com.bytedance.android.message.IMessageService) r0
            r0.notifyOnMessage(r15)
            com.bytedance.android.livesdk.model.message.linkcore.CreateChannelContent r0 = r15.createChannelContent
            if (r0 == 0) goto Lad
            com.bytedance.android.livesdk.model.message.linkcore.Player r1 = r0.owner
            java.lang.String r0 = r0.ownerLinkMicId
        L95:
            com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser r4 = r14.LLJZ(r1, r0)
            X.0bDG r3 = r14.LJIJI
            X.0bFI r2 = r14.LJFF
            r2.LJ()
            com.bytedance.android.livesdk.comp.api.linkcore.model.CreateChannelMessage r1 = new com.bytedance.android.livesdk.comp.api.linkcore.model.CreateChannelMessage
            com.bytedance.android.livesdk.comp.api.linkcore.model.CustomLinkMessage r0 = X.C954920axO.LJ(r15, r10)
            r1.<init>(r4, r0)
            r3.LLIIJI(r2, r1)
            return
        Lad:
            r1 = r10
            r0 = r10
            goto L95
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C965340bEC.LLJL(com.bytedance.android.livesdk.model.message.linkcore.LinkLayerMessage):void");
    }

    public final void LLJLIL(boolean z) {
        C966020bFI c966020bFI = this.LJFF;
        c966020bFI.getClass();
        if (LinkMicRunOnRustWhenDispose.INSTANCE.isEnable()) {
            C965900bF6.LIZ(new C967610bHr(c966020bFI, z));
        } else {
            c966020bFI.LJ().LJL("LinkMicManagerV2 dispose", z);
        }
    }

    @Override // X.InterfaceC954180awC
    public final void b0(boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RustLinkMicSession enableAIExplanationTask: enable ");
        sbLIZ.append(z);
        C20441214yg.LJ("AICommentary", C2188811AlT.LIZIZ(sbLIZ));
        C966050bFL c966050bFL = this.LJFF.LJJI;
        InterfaceC2181441AZa interfaceC2181441AZa = c966050bFL.LIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("RustTrcEngine [enableAIExplanationTask], enable=");
        sbLIZ2.append(z);
        C1AZW.LJIIIZ(interfaceC2181441AZa, "AICommentary", C2188811AlT.LIZIZ(sbLIZ2), null, null);
        C1276910jKj c1276910jKj = c966050bFL.LIZIZ;
        if (c1276910jKj != null) {
            C965350bED c965350bED = c1276910jKj.LLILZ.LJJ;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("RustLiveStreamer [enableAIExplanationTask], enable=");
            sbLIZ3.append(z);
            C1AZW.LIZIZ(c965350bED, "AICommentary", C2188811AlT.LIZIZ(sbLIZ3), null, null);
            InterfaceC1276380jJs interfaceC1276380jJs = c1276910jKj.LLJJJJ;
            if (interfaceC1276380jJs != null) {
                interfaceC1276380jJs.b0(z);
            }
        }
    }

    @Override // X.InterfaceC954180awC
    public final boolean b9(C949400aoU c949400aoU) {
        C965350bED c965350bED = this.LJJII;
        String str = this.LJIIIIZZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[updateLiveConfig] config=");
        sbLIZ.append(c949400aoU);
        C1AZW.LIZIZ(c965350bED, str, C2188811AlT.LIZIZ(sbLIZ), null, null);
        this.LJIIIZ = c949400aoU;
        return true;
    }

    @Override // X.InterfaceC954180awC
    public final void sendRoomMessage(String str) {
        InterfaceC1276380jJs interfaceC1276380jJs;
        C1276910jKj c1276910jKj = this.LJFF.LJJI.LIZIZ;
        if (c1276910jKj != null && (interfaceC1276380jJs = c1276910jKj.LLJJJJ) != null) {
            interfaceC1276380jJs.sendRoomMessage(str);
        }
    }

    @Override // X.InterfaceC954180awC
    public final int startAuxStream(String str) {
        C1276910jKj c1276910jKj = this.LJFF.LJJI.LIZIZ;
        if (c1276910jKj != null) {
            String str2 = c1276910jKj.LLILZIL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("startAuxStream streamId=");
            sbLIZ.append(str);
            C20441214yg.LJIIIZ(str2, C2188811AlT.LIZIZ(sbLIZ));
            InterfaceC1276380jJs interfaceC1276380jJs = c1276910jKj.LLJJJJ;
            if (interfaceC1276380jJs != null) {
                return interfaceC1276380jJs.startAuxStream(str);
            }
            return -1;
        }
        return -1;
    }

    @Override // X.InterfaceC954180awC
    public final void stopAuxStream(String str) {
        C1276910jKj c1276910jKj = this.LJFF.LJJI.LIZIZ;
        if (c1276910jKj != null) {
            c1276910jKj.stopAuxStream(str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LLJJL(X.C945320ahu r4, X.InterfaceC940430aa1 r5) {
        /*
            Method dump skipped, instruction units count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C965340bEC.LLJJL(X.0ahu, X.0aa1):java.lang.String");
    }

    @Override // X.InterfaceC954180awC
    public final void LJIIIZ(int i, String str) {
        this.LJFF.LJ().LJIIIZ(i, str);
    }

    @Override // X.InterfaceC954180awC
    public final void LJIJI(String str, Map<String, ? extends JSONObject> map) {
        if (LLJLILLLLZIIL() instanceof C1AXM) {
            LLJLILLLLZIIL().LJIJI(str, map);
            return;
        }
        C2181391AYv c2181391AYv = this.LJIIZILJ;
        if (c2181391AYv == null || !LivesdkLinkmicSeiEnabledBusinessIdSetting.INSTANCE.isEnable(str)) {
            return;
        }
        synchronized (c2181391AYv.LJIIJ()) {
            try {
                c2181391AYv.LJIIJ().put(str, map);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (c2181391AYv.LL.LJI.LJIIJJI() == 1) {
            return;
        }
        c2181391AYv.LJIILIIL("postPermanentMixRegionStreamData");
    }

    @Override // X.InterfaceC954180awC
    public final void LJIJJ(String str, C01IM c01im) {
        C1276910jKj c1276910jKj = this.LJFF.LJJI.LIZIZ;
        if (c1276910jKj != null) {
            C965350bED c965350bED = c1276910jKj.LLILZ.LJJ;
            String str2 = c1276910jKj.LLILZIL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("updateAuxStreamSourceConfig streamId=");
            sbLIZ.append(str);
            sbLIZ.append(" config=");
            sbLIZ.append(c01im.LIZ);
            C1AZW.LIZIZ(c965350bED, str2, C2188811AlT.LIZIZ(sbLIZ), null, null);
            InterfaceC1276380jJs interfaceC1276380jJs = c1276910jKj.LLJJJJ;
            if (interfaceC1276380jJs != null) {
                interfaceC1276380jJs.LJIJJ(str, c01im);
            }
        }
    }

    @Override // X.InterfaceC954180awC
    public final void LJJ(Map<String, Object> map, boolean z) {
        if (LLJLILLLLZIIL() instanceof C1AXM) {
            LLJLILLLLZIIL().LJJ(map, z);
            return;
        }
        C2181391AYv c2181391AYv = this.LJIIZILJ;
        if (c2181391AYv == null || !LivesdkLinkmicSeiEnabledBusinessIdSetting.INSTANCE.isEnable("ae")) {
            return;
        }
        synchronized (c2181391AYv.LJIIIZ()) {
            try {
                c2181391AYv.LJIIIZ().putAll(map);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (!z) {
            return;
        }
        c2181391AYv.LJIILIIL("postAnchorExperimentToMixStreamData");
    }

    @Override // X.InterfaceC954180awC
    public final void LJJI(String str, boolean z) {
        this.LJFF.LJ().LJJI(str, z);
    }

    @Override // X.InterfaceC954180awC
    public final void LJJIIZ(String str, boolean z) {
        C966020bFI c966020bFI = this.LJFF;
        if (c966020bFI.LIZIZ) {
            c966020bFI.LJ().LJJIIZ(str, z);
        }
    }

    @Override // X.InterfaceC954180awC
    public final void LJJIJIL(String str, SurfaceView surfaceView) {
        C2181461AZc c2181461AZc;
        C1276910jKj c1276910jKj = this.LJFF.LJJI.LIZIZ;
        if (c1276910jKj != null) {
            C965350bED c965350bED = c1276910jKj.LLILZ.LJJ;
            String str2 = c1276910jKj.LLILZIL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("setAuxStreamView streamId=");
            sbLIZ.append(str);
            sbLIZ.append(" surfaceView=");
            sbLIZ.append(surfaceView);
            C1AZW.LIZIZ(c965350bED, str2, C2188811AlT.LIZIZ(sbLIZ), null, null);
            InterfaceC1276380jJs interfaceC1276380jJs = c1276910jKj.LLJJJJ;
            if (interfaceC1276380jJs != null) {
                interfaceC1276380jJs.LJJIJIL(str, surfaceView);
            }
        }
        InterfaceC964790bDJ interfaceC964790bDJLLJLILLLLZIIL = LLJLILLLLZIIL();
        if ((interfaceC964790bDJLLJLILLLLZIIL instanceof C2181461AZc) && (c2181461AZc = (C2181461AZc) interfaceC964790bDJLLJLILLLLZIIL) != null) {
            if (!c2181461AZc.LLIILII()) {
                ((ArrayList) c2181461AZc.LLL).add(new RunnableC965960bFC(c2181461AZc, str, surfaceView));
            } else {
                c2181461AZc.LLJJLIIIJLLLLLLLZ(str, surfaceView);
            }
        }
    }

    @Override // X.InterfaceC954180awC
    public final void LJJIJL(long j, boolean z) {
        this.LJFF.LJ().LJJIJL(j, z);
    }

    @Override // X.InterfaceC954180awC
    public final void LJJIL(Map map, Map map2) {
        if (LLJLILLLLZIIL() instanceof C1AXM) {
            LLJLILLLLZIIL().LJJIL(map, map2);
            return;
        }
        C2181391AYv c2181391AYv = this.LJIIZILJ;
        if (c2181391AYv == null || !LivesdkLinkmicSeiEnabledBusinessIdSetting.INSTANCE.isEnable("live_show_sei")) {
            return;
        }
        synchronized (c2181391AYv.LJIIJJI()) {
            try {
                synchronized (c2181391AYv.LJIIJ()) {
                    try {
                        c2181391AYv.LJIIJJI().put("live_show_sei", map);
                        c2181391AYv.LJIIJ().put("show_info", map2);
                    } finally {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        c2181391AYv.LJIILIIL("postPermanentMixStreamData");
    }

    @Override // X.InterfaceC954180awC
    public final void LJJJIL(long j, boolean z) {
        if (LLJLILLLLZIIL() instanceof C1AXM) {
            LLJLILLLLZIIL().LJJJIL(j, z);
            return;
        }
        C2181391AYv c2181391AYv = this.LJIIZILJ;
        if (c2181391AYv == null) {
            return;
        }
        c2181391AYv.LLJI = j;
        if (!z) {
            return;
        }
        c2181391AYv.LJIILIIL("updateSeiBattleId");
    }

    @Override // X.InterfaceC954180awC
    public final void LJJJJIZL(C920430a3l c920430a3l, final InterfaceC920680a4A<CancelApplyResult> interfaceC920680a4A) {
        long j;
        C966020bFI c966020bFI = this.LJFF;
        CancelApplyData.Builder builder = new CancelApplyData.Builder();
        builder.setBizCancelApplyParams(c920430a3l.LIZLLL);
        CancelApplyData cancelApplyDataBuild = builder.build();
        InterfaceC966890bGh<CancelApplyResult> interfaceC966890bGh = new InterfaceC966890bGh<CancelApplyResult>() { // from class: X.0bE8
            @Override // X.InterfaceC966890bGh
            public final void LIZ(CancelApplyResult cancelApplyResult) {
                InterfaceC920680a4A<CancelApplyResult> interfaceC920680a4A2 = interfaceC920680a4A;
                if (interfaceC920680a4A2 != null) {
                    interfaceC920680a4A2.onSuccess(cancelApplyResult);
                }
            }

            @Override // X.InterfaceC966890bGh
            public final void LIZIZ(LinkCoreError linkCoreError, Throwable th) {
                InterfaceC920680a4A<CancelApplyResult> interfaceC920680a4A2 = interfaceC920680a4A;
                if (interfaceC920680a4A2 != null) {
                    interfaceC920680a4A2.LIZ(linkCoreError, th);
                }
            }
        };
        C965350bED c965350bED = c966020bFI.LJJ;
        String str = c966020bFI.LJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("cancelApply start channelId=");
        sbLIZ.append(c966020bFI.LIZLLL);
        sbLIZ.append(" state=");
        sbLIZ.append(c966020bFI.LJIIIIZZ);
        sbLIZ.append(" data=");
        sbLIZ.append(cancelApplyDataBuild);
        C1AZW.LIZIZ(c965350bED, str, C2188811AlT.LIZIZ(sbLIZ), null, null);
        C966920bGk c966920bGkLJ = c966020bFI.LJ();
        BizCancelApplyParams bizCancelApplyParams = cancelApplyDataBuild.bizCancelApplyParams;
        if (bizCancelApplyParams != null) {
            j = bizCancelApplyParams.anchorId;
        } else {
            j = 0;
        }
        C2227521CGg c2227521CGg = new C2227521CGg("", new C968610bJT(j));
        C966100bFQ c966100bFQ = new C966100bFQ(c966020bFI.LJ, "cancelApply", interfaceC966890bGh, new C966730bGR());
        c966020bFI.LJIIJ(c966100bFQ, null);
        c966920bGkLJ.LJLLL(c2227521CGg, new C966240bFe(c966100bFQ, null));
    }

    @Override // X.InterfaceC954180awC
    public final void LJJJJL(final C954610awt c954610awt, final InterfaceC920680a4A<PermitApplyGroupResult> interfaceC920680a4A) {
        boolean z;
        EnumC2235671Cer enumC2235671Cer;
        List<InterfaceC965500bES> listLJLJL;
        C966020bFI c966020bFI = this.LJFF;
        InterfaceC966890bGh<PermitApplyGroupResult> interfaceC966890bGh = new InterfaceC966890bGh<PermitApplyGroupResult>() { // from class: X.0bDQ
            @Override // X.InterfaceC966890bGh
            public final void LIZ(PermitApplyGroupResult permitApplyGroupResult) {
                if (c954610awt.LJ == 1 && !LinkMicSdkCoHostUpdateLayoutTimeOptSetting.INSTANCE.isOpt()) {
                    this.LLJLILLLLZIIL().LJJJJIZL(LiveCoHostLayoutIdConfigSetting.INSTANCE.getNormalExpand(true), false, false, true, false, new C916150Zwr());
                }
                InterfaceC920680a4A<PermitApplyGroupResult> interfaceC920680a4A2 = interfaceC920680a4A;
                if (interfaceC920680a4A2 != null) {
                    interfaceC920680a4A2.onSuccess(permitApplyGroupResult);
                }
            }

            @Override // X.InterfaceC966890bGh
            public final void LIZIZ(LinkCoreError linkCoreError, Throwable th) {
                InterfaceC920680a4A<PermitApplyGroupResult> interfaceC920680a4A2 = interfaceC920680a4A;
                if (interfaceC920680a4A2 != null) {
                    interfaceC920680a4A2.LIZ(linkCoreError, th);
                }
            }
        };
        C965350bED c965350bED = c966020bFI.LJJ;
        String str = c966020bFI.LJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("permit apply group");
        sbLIZ.append(" start data=");
        sbLIZ.append(c954610awt);
        C1AZW.LIZIZ(c965350bED, str, C2188811AlT.LIZIZ(sbLIZ), null, null);
        if (c954610awt.LJ == 1) {
            z = true;
        } else {
            z = false;
        }
        InterfaceC965990bFF interfaceC965990bFF = c966020bFI.LJIIZILJ;
        if (interfaceC965990bFF != null && (listLJLJL = interfaceC965990bFF.LJLJL()) != null) {
            for (InterfaceC965500bES interfaceC965500bES : listLJLJL) {
                if (z) {
                    if (interfaceC965500bES != null) {
                        interfaceC965500bES.LJIJJ(c954610awt);
                    }
                } else if (interfaceC965500bES != null) {
                    interfaceC965500bES.LJFF(c954610awt);
                }
            }
        }
        C966920bGk c966920bGkLJ = c966020bFI.LJ();
        C967180bHA c967180bHALJIIIZ = C966020bFI.LJIIIZ(c966020bFI, c954610awt.LIZ, c954610awt.LIZIZ, c954610awt.LIZJ, null, 56);
        if (c954610awt.LJ == 1) {
            enumC2235671Cer = EnumC2235671Cer.Agree;
        } else {
            enumC2235671Cer = EnumC2235671Cer.Reject;
        }
        C2235641Ceo c2235641Ceo = new C2235641Ceo(c967180bHALJIIIZ, enumC2235671Cer, c954610awt.LIZLLL, new C2235661Ceq(r5.replyStatus, r5.sourceType, c954610awt.LJFF.algoRequestId, new C968600bJS(), r5.matchedPreferenceTag), c954610awt.LJI, C13BV.INSTANCE);
        C966100bFQ c966100bFQ = new C966100bFQ(c966020bFI.LJ, "permit apply group", interfaceC966890bGh, new C965580bEa(c966020bFI, z, c954610awt));
        c966100bFQ.LLILZ = new C965530bEV(c966020bFI, z, c954610awt);
        c966020bFI.LJIIJ(c966100bFQ, null);
        c966920bGkLJ.LJJLIIIJ(c2235641Ceo, new C966240bFe(c966100bFQ, null));
    }

    @Override // X.InterfaceC954180awC
    public final void LJJJJLI(C949840apC c949840apC, final InterfaceC920680a4A<ApplyResult> interfaceC920680a4A) {
        long j;
        C966020bFI c966020bFI = this.LJFF;
        ApplyData.Builder builder = new ApplyData.Builder();
        builder.setChannelId(this.LJFF.LIZLLL);
        Context context = null;
        builder.setOnLineMicInfo(new OnLineMicInfo(1, new MicPositionInfo(c949840apC.LIZJ, c949840apC.LIZLLL, -1, 0L, 0, null)));
        builder.setBizApplyParams(c949840apC.LJFF);
        builder.setApplyIntent(c949840apC.LJII);
        builder.setReplyStatus(c949840apC.LJI);
        builder.setUseApplyDirectUpAbility(c949840apC.LJIIIIZZ);
        ApplyData applyDataBuild = builder.build();
        InterfaceC966890bGh<ApplyResult> interfaceC966890bGh = new InterfaceC966890bGh<ApplyResult>() { // from class: X.0bE7
            @Override // X.InterfaceC966890bGh
            public final void LIZ(ApplyResult applyResult) {
                InterfaceC920680a4A<ApplyResult> interfaceC920680a4A2 = interfaceC920680a4A;
                if (interfaceC920680a4A2 != null) {
                    interfaceC920680a4A2.onSuccess(applyResult);
                }
            }

            @Override // X.InterfaceC966890bGh
            public final void LIZIZ(LinkCoreError linkCoreError, Throwable th) {
                InterfaceC920680a4A<ApplyResult> interfaceC920680a4A2 = interfaceC920680a4A;
                if (interfaceC920680a4A2 != null) {
                    interfaceC920680a4A2.LIZ(linkCoreError, th);
                }
            }
        };
        C965350bED c965350bED = c966020bFI.LJJ;
        String str = c966020bFI.LJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("apply start, channelId=");
        sbLIZ.append(c966020bFI.LIZLLL);
        sbLIZ.append(" state=");
        sbLIZ.append(c966020bFI.LJIIIIZZ);
        sbLIZ.append(" data=");
        sbLIZ.append(applyDataBuild);
        C1AZW.LIZIZ(c965350bED, str, C2188811AlT.LIZIZ(sbLIZ), null, null);
        C966920bGk c966920bGkLJ = c966020bFI.LJ();
        C920820a4O c920820a4OLIZIZ = C954920axO.LIZIZ(applyDataBuild.onLineMicInfo);
        EnumC949920apK enumC949920apK = applyDataBuild.applyIntent;
        EnumC2235671Cer enumC2235671Cer = applyDataBuild.replyStatus;
        if (applyDataBuild.useApplyDirectUpAbility) {
            j = 2;
        } else {
            j = 1;
        }
        BizApplyParams bizApplyParams = applyDataBuild.bizApplyParams;
        if (bizApplyParams == null) {
            bizApplyParams = new BizApplyParams(0L, 0L, 0, false, 0, 0, 0L, "", 0L, 0, "", 0, 0, false);
        }
        long j2 = bizApplyParams.linkType;
        long j3 = bizApplyParams.anchorId;
        EnumC968720bJe enumC968720bJeLJI = C968680bJa.LJI(bizApplyParams.userReturnType);
        boolean z = bizApplyParams.follow;
        EnumC968740bJg enumC968740bJgLJFF = C968680bJa.LJFF(bizApplyParams.shareRevenueSetting);
        C2236771Cgd c2236771Cgd = EnumC2236751Cgb.Companion;
        int i = bizApplyParams.shareRevenueSettingRatio;
        c2236771Cgd.getClass();
        C969290bKZ c969290bKZ = new C969290bKZ("", c920820a4OLIZIZ, enumC949920apK, enumC2235671Cer, j, new C969300bKa(j2, j3, enumC968720bJeLJI, z, enumC968740bJgLJFF, C2236771Cgd.LIZ(i), bizApplyParams.requestParam, bizApplyParams.joinGameSessionId, bizApplyParams.mgEnterParamsProtoJson, bizApplyParams.enterAction, bizApplyParams.enterActionReason, bizApplyParams.lineupResumeLink, bizApplyParams.inviterRole, bizApplyParams.inviterUserId));
        C966100bFQ c966100bFQ = new C966100bFQ(c966020bFI.LJ, "apply", interfaceC966890bGh, new C965640bEg());
        c966020bFI.LJIIJ(c966100bFQ, null);
        c966920bGkLJ.LJLJI(c969290bKZ, new C966240bFe(c966100bFQ, null));
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

    @Override // X.InterfaceC954180awC
    public final void LJJJJLL(C920400a3i c920400a3i, final InterfaceC920680a4A<CancelInviteResult> interfaceC920680a4A) {
        C966020bFI c966020bFI = this.LJFF;
        LiveRoomUser.Builder builder = new LiveRoomUser.Builder();
        builder.setRoomId(c920400a3i.LIZ);
        builder.setUserId(c920400a3i.LIZIZ);
        builder.setLinkMicId(c920400a3i.LIZJ);
        CancelInviteData cancelInviteDataBuild = new CancelInviteData.Builder(builder.build(), c920400a3i.LJFF).build();
        InterfaceC966890bGh<CancelInviteResult> interfaceC966890bGh = new InterfaceC966890bGh<CancelInviteResult>() { // from class: X.0bEv
            @Override // X.InterfaceC966890bGh
            public final void LIZ(CancelInviteResult cancelInviteResult) {
                InterfaceC920680a4A<CancelInviteResult> interfaceC920680a4A2 = interfaceC920680a4A;
                if (interfaceC920680a4A2 != null) {
                    interfaceC920680a4A2.onSuccess(cancelInviteResult);
                }
            }

            @Override // X.InterfaceC966890bGh
            public final void LIZIZ(LinkCoreError linkCoreError, Throwable th) {
                InterfaceC920680a4A<CancelInviteResult> interfaceC920680a4A2 = interfaceC920680a4A;
                if (interfaceC920680a4A2 != null) {
                    interfaceC920680a4A2.LIZ(linkCoreError, th);
                }
            }
        };
        C965350bED c965350bED = c966020bFI.LJJ;
        String str = c966020bFI.LJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("cancelInvite channelId=");
        sbLIZ.append(c966020bFI.LIZLLL);
        sbLIZ.append(" state=");
        sbLIZ.append(c966020bFI.LJIIIIZZ);
        sbLIZ.append(" data=");
        sbLIZ.append(cancelInviteDataBuild);
        C1AZW.LIZIZ(c965350bED, str, C2188811AlT.LIZIZ(sbLIZ), null, null);
        C966920bGk c966920bGkLJ = c966020bFI.LJ();
        LiveRoomUser liveRoomUser = cancelInviteDataBuild.invitee;
        C2231451CVj c2231451CVj = new C2231451CVj(C966020bFI.LJIIIZ(c966020bFI, liveRoomUser.roomId, liveRoomUser.userId, c966020bFI.LIZLLL, null, 56), C2097608Jq.LJ());
        C966100bFQ c966100bFQ = new C966100bFQ(c966020bFI.LJ, "cancelInvite", interfaceC966890bGh, new C966740bGS());
        c966020bFI.LJIIJ(c966100bFQ, null);
        c966920bGkLJ.LJJJZ(c2231451CVj, new C966240bFe(c966100bFQ, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00da A[PHI: r0 r2
      0x00da: PHI (r0v27 long) = (r0v23 long), (r0v28 long) binds: [B:24:0x010d, B:18:0x00d8] A[DONT_GENERATE, DONT_INLINE]
      0x00da: PHI (r2v8 boolean) = (r2v5 boolean), (r2v9 boolean) binds: [B:24:0x010d, B:18:0x00d8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0111 A[PHI: r2
      0x0111: PHI (r2v10 java.lang.String) = (r2v2 java.lang.String), (r2v11 java.lang.String) binds: [B:13:0x0086, B:11:0x0082] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.InterfaceC954180awC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJJZ(X.C920410a3j r26, final X.InterfaceC920680a4A<com.bytedance.android.livesdk.comp.api.linkcore.model.PermitResult> r27) {
        /*
            Method dump skipped, instruction units count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C965340bEC.LJJJJZ(X.0a3j, X.0a4A):void");
    }

    @Override // X.InterfaceC954180awC
    public final void LJJJLZIJ(String str, Map<String, MicPositionContentInfo> map) {
        synchronized (this) {
            try {
                this.LJFF.LJIJJLI(map);
                LLJLILLLLZIIL().LJJJJIZL(str, false, false, true, false, new C916150Zwr());
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00e0 A[PHI: r0 r2
      0x00e0: PHI (r0v36 long) = (r0v32 long), (r0v37 long) binds: [B:22:0x0113, B:16:0x00de] A[DONT_GENERATE, DONT_INLINE]
      0x00e0: PHI (r2v7 boolean) = (r2v4 boolean), (r2v8 boolean) binds: [B:22:0x0113, B:16:0x00de] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.InterfaceC954180awC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJZ(X.C920410a3j r26, final X.C919480a2E r27) {
        /*
            Method dump skipped, instruction units count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C965340bEC.LJJJZ(X.0a3j, X.0a2E):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:190:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0158  */
    @Override // X.InterfaceC954180awC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJLIIIJ(X.C945320ahu r14, X.InterfaceC940430aa1 r15) {
        /*
            Method dump skipped, instruction units count: 795
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C965340bEC.LJJLIIIJ(X.0ahu, X.0aa1):void");
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [X.0bEy, X.0bGh] */
    @Override // X.InterfaceC954180awC
    public final void LJJLIIIJILLIZJL(C923520a8k c923520a8k, final InterfaceC920680a4A<LeaveChannelResult> interfaceC920680a4A) {
        C966020bFI c966020bFI = this.LJFF;
        LeaveChannelData.Builder builder = new LeaveChannelData.Builder();
        builder.setBizLeaveParams(c923520a8k.LIZJ);
        builder.setLeaveSource(c923520a8k.LIZ);
        builder.setLeaveReason(c923520a8k.LIZLLL);
        LeaveChannelData leaveChannelDataBuild = builder.build();
        ?? r8 = new InterfaceC966890bGh<LeaveChannelResult>() { // from class: X.0bEy
            @Override // X.InterfaceC966890bGh
            public final void LIZ(LeaveChannelResult leaveChannelResult) {
                InterfaceC920680a4A<LeaveChannelResult> interfaceC920680a4A2 = interfaceC920680a4A;
                if (interfaceC920680a4A2 != null) {
                    interfaceC920680a4A2.onSuccess(leaveChannelResult);
                }
            }

            @Override // X.InterfaceC966890bGh
            public final void LIZIZ(LinkCoreError linkCoreError, Throwable th) {
                InterfaceC920680a4A<LeaveChannelResult> interfaceC920680a4A2 = interfaceC920680a4A;
                if (interfaceC920680a4A2 != null) {
                    interfaceC920680a4A2.LIZ(linkCoreError, th);
                }
            }
        };
        C965350bED c965350bED = c966020bFI.LJJ;
        String str = c966020bFI.LJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("leaveChannel start Leave channel cur channelId ");
        sbLIZ.append(c966020bFI.LIZLLL);
        sbLIZ.append(", state ");
        sbLIZ.append(c966020bFI.LJIIIIZZ);
        sbLIZ.append(", data ");
        sbLIZ.append(leaveChannelDataBuild);
        C1AZW.LIZIZ(c965350bED, str, C2188811AlT.LIZIZ(sbLIZ), null, null);
        long j = 0;
        if (c966020bFI.LIZLLL <= 0) {
            C1AZW.LJI(c966020bFI.LJJ, c966020bFI.LJ, "leaveChannel mChannelId <= 0L", null, null);
            C500260Jjc.LJJLIIIJILLIZJL(new C966450bFz(r8));
            return;
        }
        C966920bGk c966920bGkLJ = c966020bFI.LJ();
        EnumC1282020jSy enumC1282020jSyLIZIZ = C1282000jSw.LIZIZ(leaveChannelDataBuild.leaveReason);
        BizLeaveParams bizLeaveParams = leaveChannelDataBuild.bizLeaveParams;
        if (bizLeaveParams != null) {
            j = bizLeaveParams.anchorId;
        }
        C1CKR c1ckr = new C1CKR("", enumC1282020jSyLIZIZ, new C968570bJP(j));
        C966100bFQ c966100bFQ = new C966100bFQ(c966020bFI.LJ, "leaveChannel", r8, new C966390bFt());
        c966020bFI.LJIIJ(c966100bFQ, new C966340bFo(c966020bFI));
        c966920bGkLJ.LJLLLL(c1ckr, new C966240bFe(c966100bFQ, null));
    }

    @Override // X.InterfaceC954180awC
    public final void LJJLIIIJJI(EnumC952680atm enumC952680atm, String str) {
        EnumC952680atm enumC952680atm2;
        C2182171Aal c2182171AalLJIJJ;
        View viewLJJLL;
        InterfaceC2181771Aa7 interfaceC2181771Aa7;
        C1276910jKj c1276910jKj = this.LJFF.LJJI.LIZIZ;
        if (c1276910jKj == null || (enumC952680atm2 = c1276910jKj.LLIZLLLIL) == null) {
            enumC952680atm2 = EnumC952680atm.DEFAULT;
        }
        String str2 = this.LJIIIIZZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("switchRenderViewMode: mode=");
        sbLIZ.append(enumC952680atm);
        sbLIZ.append(", currentMode=");
        sbLIZ.append(enumC952680atm2);
        sbLIZ.append(", source=");
        sbLIZ.append(str);
        C20441214yg.LIZIZ(str2, C2188811AlT.LIZIZ(sbLIZ));
        if (enumC952680atm2 == enumC952680atm) {
            return;
        }
        InterfaceC964790bDJ interfaceC964790bDJLLJLILLLLZIIL = LLJLILLLLZIIL();
        if ((interfaceC964790bDJLLJLILLLLZIIL instanceof InterfaceC2181771Aa7) && (interfaceC2181771Aa7 = (InterfaceC2181771Aa7) interfaceC964790bDJLLJLILLLLZIIL) != null) {
            c2182171AalLJIJJ = interfaceC2181771Aa7.LJIJJ();
        } else {
            c2182171AalLJIJJ = null;
        }
        C1276910jKj c1276910jKj2 = this.LJFF.LJJI.LIZIZ;
        if (c1276910jKj2 != null) {
            viewLJJLL = c1276910jKj2.LJJLL(enumC952680atm, c2182171AalLJIJJ);
        } else {
            viewLJJLL = null;
        }
        if (enumC952680atm != EnumC952680atm.SINGLE_VIEWMODE && enumC952680atm != EnumC952680atm.SINGLE_VIEWMODE_V2) {
            LLJLILLLLZIIL().LJJJ(null, false, str);
        } else {
            LLJLILLLLZIIL().LJJJ(viewLJJLL, true, str);
        }
    }

    @Override // X.InterfaceC954180awC
    public final void LJJLIIIJJIZ(long j, String str) {
        C966020bFI c966020bFI = this.LJFF;
        C967770bI7 c967770bI7 = c966020bFI.LJJIFFI;
        ((ConcurrentHashMap) c967770bI7.LJIL).put(str, Long.valueOf(j));
        InterfaceC965990bFF interfaceC965990bFF = c966020bFI.LJIIZILJ;
        if (interfaceC965990bFF != null) {
            C966020bFI.LIZIZ(interfaceC965990bFF, false, new C966910bGj(j, str));
        }
    }

    @Override // X.InterfaceC954180awC
    public final void LJJLL(C954670awz c954670awz, final C954530awl c954530awl) {
        List<InterfaceC965500bES> listLJLJL;
        C966020bFI c966020bFI = this.LJFF;
        InterfaceC966890bGh<CancelInviteJoinGroupResult> interfaceC966890bGh = new InterfaceC966890bGh<CancelInviteJoinGroupResult>() { // from class: X.0bDr
            @Override // X.InterfaceC966890bGh
            public final void LIZ(CancelInviteJoinGroupResult cancelInviteJoinGroupResult) {
                InterfaceC920680a4A<CancelInviteJoinGroupResult> interfaceC920680a4A = c954530awl;
                if (interfaceC920680a4A != null) {
                    interfaceC920680a4A.onSuccess(cancelInviteJoinGroupResult);
                }
            }

            @Override // X.InterfaceC966890bGh
            public final void LIZIZ(LinkCoreError linkCoreError, Throwable th) {
                InterfaceC920680a4A<CancelInviteJoinGroupResult> interfaceC920680a4A = c954530awl;
                if (interfaceC920680a4A != null) {
                    interfaceC920680a4A.LIZ(linkCoreError, th);
                }
            }
        };
        C965350bED c965350bED = c966020bFI.LJJ;
        String str = c966020bFI.LJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("cancel invite join group");
        sbLIZ.append(" start data=");
        sbLIZ.append(c954670awz);
        C1AZW.LJIIIZ(c965350bED, str, C2188811AlT.LIZIZ(sbLIZ), null, null);
        InterfaceC965990bFF interfaceC965990bFF = c966020bFI.LJIIZILJ;
        if (interfaceC965990bFF != null && (listLJLJL = interfaceC965990bFF.LJLJL()) != null) {
            for (InterfaceC965500bES interfaceC965500bES : listLJLJL) {
                if (interfaceC965500bES != null) {
                    interfaceC965500bES.LJJI(c954670awz);
                }
            }
        }
        C966920bGk c966920bGkLJ = c966020bFI.LJ();
        C969440bKo c969440bKo = new C969440bKo(C966020bFI.LJIIIZ(c966020bFI, c954670awz.LIZ, c954670awz.LIZIZ, c954670awz.LIZJ, null, 56), c954670awz.LIZLLL, c954670awz.LJ);
        C966100bFQ c966100bFQ = new C966100bFQ(c966020bFI.LJ, "cancel invite join group", interfaceC966890bGh, new C965590bEb(c966020bFI, c954670awz));
        c966100bFQ.LLILZ = new C965560bEY(c966020bFI, c954670awz);
        c966020bFI.LJIIJ(c966100bFQ, null);
        c966920bGkLJ.LJJLJ(c969440bKo, new C966240bFe(c966100bFQ, null));
    }

    @Override // X.InterfaceC954180awC
    public final void LJJZZI(String str, C01IL c01il) {
        C1276910jKj c1276910jKj = this.LJFF.LJJI.LIZIZ;
        if (c1276910jKj != null) {
            C965350bED c965350bED = c1276910jKj.LLILZ.LJJ;
            String str2 = c1276910jKj.LLILZIL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("updateAuxStreamEncoderConfig streamId=");
            sbLIZ.append(str);
            sbLIZ.append(" videoWidth=");
            sbLIZ.append(c01il.LIZ);
            sbLIZ.append(" videoHeight=");
            sbLIZ.append(c01il.LIZIZ);
            sbLIZ.append(" videoBiteRate=");
            sbLIZ.append(c01il.LIZLLL);
            sbLIZ.append(" videoFps=");
            sbLIZ.append(c01il.LIZJ);
            C1AZW.LIZIZ(c965350bED, str2, C2188811AlT.LIZIZ(sbLIZ), null, null);
            InterfaceC1276380jJs interfaceC1276380jJs = c1276910jKj.LLJJJJ;
            if (interfaceC1276380jJs != null) {
                interfaceC1276380jJs.LJJIL(str, c01il);
            }
        }
    }

    @Override // X.InterfaceC954180awC
    public final void LJLJI(String str, EnumC965730bEp enumC965730bEp) {
        boolean z;
        boolean z2;
        boolean z3;
        Integer numValueOf;
        C964950bDZ c964950bDZ = (C964950bDZ) this.LJJI.getValue();
        if (c964950bDZ != null) {
            C19487111Lx c19487111Lx = c964950bDZ.LIZLLL;
            if (c19487111Lx != null) {
                c19487111Lx.dispose();
            }
            c964950bDZ.LIZLLL = null;
            c964950bDZ.LJ = false;
            C1AZW.LJIIJ(12, "CoAudienceSeiSubscriber", "dispose", null, null);
        }
        long j = this.LJFF.LIZLLL;
        if (LinkMicDestroyOptSetting.INSTANCE.optimize() && !this.LJIILIIL.LIZ(false, true)) {
            z = true;
        } else {
            z = false;
        }
        C966020bFI c966020bFI = this.LJFF;
        if (!this.LJIIL && !z) {
            z2 = false;
        } else {
            z2 = true;
        }
        int i = c966020bFI.LJIIIIZZ;
        C914780Zue c914780Zue = c966020bFI.LJIIIZ;
        C965350bED c965350bED = c966020bFI.LJJ;
        String str2 = c966020bFI.LJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[destroy] cur channelId ");
        sbLIZ.append(c966020bFI.LIZLLL);
        sbLIZ.append(", linkState ");
        sbLIZ.append(c914780Zue.LIZ);
        sbLIZ.append(", rtcState ");
        sbLIZ.append(c914780Zue.LIZIZ);
        sbLIZ.append(", state ");
        sbLIZ.append(i);
        sbLIZ.append(", source: ");
        sbLIZ.append(str);
        sbLIZ.append(", archType: ");
        sbLIZ.append(enumC965730bEp.getLinkArchType());
        C1AZW.LIZIZ(c965350bED, str2, C2188811AlT.LIZIZ(sbLIZ), null, null);
        C965900bF6.LIZ(new C965780bEu(c966020bFI, c914780Zue, i, z2, str, enumC965730bEp));
        C967770bI7 c967770bI7 = c966020bFI.LJJIFFI;
        c967770bI7.getClass();
        C13BV c13bv = C13BV.INSTANCE;
        c967770bI7.LJII(c13bv);
        c967770bI7.LJI(c13bv);
        c967770bI7.LJIJJLI.clear();
        c967770bI7.LJIILLIIL.LJ();
        c967770bI7.LIZLLL = null;
        c967770bI7.LJFF = null;
        c966020bFI.LJJII = null;
        C966050bFL c966050bFL = c966020bFI.LJJI;
        C1276910jKj c1276910jKj = c966050bFL.LIZIZ;
        if (c1276910jKj != null) {
            C965350bED c965350bED2 = c1276910jKj.LLILZ.LJJ;
            String str3 = c1276910jKj.LLILZIL;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("[detach]");
            InterfaceC1276380jJs interfaceC1276380jJs = c1276910jKj.LLJJJJ;
            if (interfaceC1276380jJs != null) {
                numValueOf = Integer.valueOf(interfaceC1276380jJs.hashCode());
            } else {
                numValueOf = null;
            }
            sbLIZ2.append(numValueOf);
            sbLIZ2.append(" liveClient and rtcCallback");
            C1AZW.LIZIZ(c965350bED2, str3, C2188811AlT.LIZIZ(sbLIZ2), null, null);
            c1276910jKj.LJJJJZI(true, true, "detach", null);
            c1276910jKj.LLJJLIIIJLLLLLLLZ = null;
            c1276910jKj.LLJJJ = null;
        }
        c966050bFL.LIZIZ = null;
        c966020bFI.LJIIZILJ = null;
        c966020bFI.LJIIL = null;
        c966020bFI.LJIILIIL = null;
        C964730bDD c964730bDD = c966020bFI.LJJIII;
        if (c964730bDD != null) {
            c964730bDD.LL.clear();
        }
        c966020bFI.LJIJ.clear();
        c966020bFI.LJJIJ.LJ();
        LinkMicConfig linkMicConfig = c966020bFI.LJJIIJZLJL;
        if (linkMicConfig != null) {
            C965900bF6.LIZ(new C968400bJ8(linkMicConfig));
        }
        c966020bFI.LJJIIJZLJL = null;
        this.LJIIJJI = null;
        if (LinkMicRustDowngradeSetting.INSTANCE.downgrade() && Intrinsics.LJFF(str, "dispose_on_rust_linker_Error")) {
            z3 = true;
        } else {
            z3 = false;
            ((InterfaceC968390bJ7) this.LJIL.getValue()).release();
            LLJLILLLLZIIL().LJIJ(null);
        }
        this.LJIILLIIL = null;
        this.LJIIIZ = null;
        this.LJIIJ = null;
        this.LJIJI.LJII.clear();
        if (z && Intrinsics.LJFF(str, "dispose_on_linker_destroy")) {
            return;
        }
        C2181391AYv c2181391AYv = this.LJIIZILJ;
        if (c2181391AYv != null && C781520UlC.LJFF(this.LIZLLL)) {
            c2181391AYv.LL.LJI = new InterfaceC2181411AYx() { // from class: X.0bGn
                @Override // X.InterfaceC2181411AYx
                public final void LIZJ(String str4) {
                }

                @Override // X.InterfaceC2181411AYx
                public final void LJI() {
                }

                @Override // X.InterfaceC2181411AYx
                public final long LJIIJJI() {
                    return 0L;
                }

                @Override // X.InterfaceC2181411AYx
                public final void LJIILIIL() {
                }

                @Override // X.InterfaceC2181411AYx
                public final void LJIILJJIL(String str4, C1276750jKT c1276750jKT) {
                }

                @Override // X.InterfaceC2181411AYx
                public final void LJJ(Map<String, String> map) {
                }

                @Override // X.InterfaceC2181411AYx
                public final int LJJI() {
                    return 0;
                }

                @Override // X.InterfaceC2181411AYx
                public final LinkUser LJJIFFI(String str4) {
                    return null;
                }

                @Override // X.InterfaceC2181411AYx
                public final void LJJIII(String str4, List<? extends C1276580jKC> list) {
                }

                @Override // X.InterfaceC2181411AYx
                public final String LJJIIJ() {
                    return null;
                }

                @Override // X.InterfaceC2181411AYx
                public final int LJJIIJZLJL() {
                    return 0;
                }

                @Override // X.InterfaceC2181411AYx
                public final boolean LJJIIZ() {
                    return false;
                }

                @Override // X.InterfaceC2181411AYx
                public final boolean LJJIJ() {
                    return false;
                }

                @Override // X.InterfaceC2181411AYx
                public final C949400aoU LJJJJJL() {
                    return null;
                }

                @Override // X.InterfaceC2181411AYx
                public final JSONObject LJJJJL(C1275030jHh c1275030jHh, List list, Map map, String str4, InterfaceC969870bLV interfaceC969870bLV, Map map2, int i2) {
                    return null;
                }

                @Override // X.InterfaceC2181411AYx
                public final int LJJJJLI(String str4) {
                    return 0;
                }

                @Override // X.InterfaceC2181411AYx
                public final C1AZI LJJJJLL(List<C2183391Acj> list, C1AZR c1azr) {
                    return null;
                }

                @Override // X.InterfaceC2181411AYx
                public final int LJJJJZ(String str4) {
                    return 0;
                }

                @Override // X.InterfaceC2181411AYx
                public final String getChannelId() {
                    return "";
                }

                @Override // X.InterfaceC2181411AYx
                public final String getGroupChannelId() {
                    return "";
                }

                @Override // X.InterfaceC2181411AYx
                public final List<C1276580jKC> LJIILL() {
                    return new ArrayList();
                }

                @Override // X.InterfaceC2181411AYx
                public final Pair<Integer, Integer> LJJJJJ() {
                    return new Pair<>(0, 0);
                }

                @Override // X.InterfaceC2181411AYx
                public final Map<String, OnLineMicInfo> LIZ() {
                    return C2097608Jq.LJ();
                }

                @Override // X.InterfaceC2181411AYx
                public final List<LinkUser> LIZLLL() {
                    return C13BV.INSTANCE;
                }
            };
        }
        InterfaceC968120bIg interfaceC968120bIg = this.LJI;
        if (interfaceC968120bIg != null) {
            interfaceC968120bIg.LIZJ(new C965710bEn(j, this.LIZIZ, this.LIZLLL, null, true, z3, 8));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0157 A[PHI: r6
      0x0157: PHI (r6v5 java.lang.String) = (r6v2 java.lang.String), (r6v6 java.lang.String) binds: [B:13:0x00bb, B:11:0x00b7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r1v5, types: [T, com.bytedance.android.livesdk.comp.api.linkcore.model.LayoutDSLConfig] */
    @Override // X.InterfaceC954180awC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJLJJI(X.C949850apD r31, final X.InterfaceC920680a4A<com.bytedance.android.livesdk.comp.api.linkcore.model.InviteResult> r32) {
        /*
            Method dump skipped, instruction units count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C965340bEC.LJLJJI(X.0apD, X.0a4A):void");
    }

    @Override // X.InterfaceC954180awC
    public final void LJLJLLL(C949850apD c949850apD, final InterfaceC920680a4A<InviteResult> interfaceC920680a4A) {
        String strInvoke;
        Function0<String> function0;
        int i;
        List list;
        C966020bFI c966020bFI = this.LJFF;
        LiveRoomUser.Builder builder = new LiveRoomUser.Builder();
        builder.setRoomId(c949850apD.LIZ);
        builder.setUserId(c949850apD.LIZIZ);
        InviteData.Builder builder2 = new InviteData.Builder(builder.build());
        String str = "";
        if (Intrinsics.LJFF(C354201Zc.LIZ(this.LIZLLL.getStreamType()), "live_voice")) {
            Layout layoutLJFF = LLJLILLLLZIIL().LJFF();
            if (layoutLJFF != null) {
                builder2.setLayoutDSLConfig(new LayoutDSLConfig(layoutLJFF.version, layoutLJFF.layoutId));
            }
        } else {
            InterfaceC964790bDJ interfaceC964790bDJLLJLILLLLZIIL = LLJLILLLLZIIL();
            C945380ai0 c945380ai0 = this.LJIIJ;
            if (c945380ai0 == null || (function0 = c945380ai0.LIZIZ) == null || (strInvoke = function0.invoke()) == null) {
                strInvoke = "";
            }
            Layout layoutLJJLIIIJJIZ = interfaceC964790bDJLLJLILLLLZIIL.LJJLIIIJJIZ(strInvoke);
            if (layoutLJJLIIIJJIZ != null) {
                builder2.setLayoutDSLConfig(new LayoutDSLConfig(layoutLJJLIIIJJIZ.version, layoutLJJLIIIJJIZ.layoutId));
            }
        }
        builder2.setChannelId(this.LJFF.LIZLLL);
        builder2.setExpireTimeInSeconds(c949850apD.LJI);
        boolean z = true;
        builder2.setOnLineMicInfo(new OnLineMicInfo(1, new MicPositionInfo(c949850apD.LJ, c949850apD.LJFF, -1, 0L, 0, null)));
        builder2.setSource(c949850apD.LJII);
        builder2.setBizInviteParams(c949850apD.LIZJ);
        builder2.setInviteType(c949850apD.LJIIIZ);
        builder2.setInviteeList(c949850apD.LJIIJ);
        InviteData inviteDataBuild = builder2.build();
        InterfaceC966890bGh<InviteResult> interfaceC966890bGh = new InterfaceC966890bGh<InviteResult>() { // from class: X.0bEz
            @Override // X.InterfaceC966890bGh
            public final void LIZ(InviteResult inviteResult) {
                InterfaceC920680a4A<InviteResult> interfaceC920680a4A2 = interfaceC920680a4A;
                if (interfaceC920680a4A2 != null) {
                    interfaceC920680a4A2.onSuccess(inviteResult);
                }
            }

            @Override // X.InterfaceC966890bGh
            public final void LIZIZ(LinkCoreError linkCoreError, Throwable th) {
                InterfaceC920680a4A<InviteResult> interfaceC920680a4A2 = interfaceC920680a4A;
                if (interfaceC920680a4A2 != null) {
                    interfaceC920680a4A2.LIZ(linkCoreError, th);
                }
            }
        };
        C965350bED c965350bED = c966020bFI.LJJ;
        String str2 = c966020bFI.LJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("moderatorInvite start channelId=");
        sbLIZ.append(c966020bFI.LIZLLL);
        sbLIZ.append(" data=");
        sbLIZ.append(inviteDataBuild);
        C1AZW.LIZIZ(c965350bED, str2, C2188811AlT.LIZIZ(sbLIZ), null, null);
        LayoutDSLConfig layoutDSLConfig = inviteDataBuild.layoutDSLConfig;
        if (layoutDSLConfig != null) {
            String str3 = layoutDSLConfig.layoutId;
            if (str3 != null) {
                str = str3;
            }
            i = layoutDSLConfig.sceneVersion;
        } else {
            i = -1;
        }
        Pair pair = new Pair(str, Integer.valueOf(i));
        String str4 = (String) pair.getFirst();
        int iIntValue = ((Number) pair.getSecond()).intValue();
        C966920bGk c966920bGkLJ = c966020bFI.LJ();
        C920820a4O c920820a4OLIZIZ = C954920axO.LIZIZ(inviteDataBuild.onLineMicInfo);
        LiveRoomUser liveRoomUser = inviteDataBuild.invitee;
        C967180bHA c967180bHALJIIIZ = C966020bFI.LJIIIZ(c966020bFI, liveRoomUser.roomId, liveRoomUser.userId, c966020bFI.LIZLLL, null, 56);
        EnumC919140a1g enumC919140a1g = inviteDataBuild.inviteType;
        List<C918740a12> list2 = inviteDataBuild.inviteeList;
        Map mapLIZJ = C2097908Jt.LIZJ(new Pair("source", String.valueOf(inviteDataBuild.source)));
        long j = inviteDataBuild.maxPosition;
        long j2 = iIntValue;
        long j3 = inviteDataBuild.source;
        BizInviteParams bizInviteParams = inviteDataBuild.bizInviteParams;
        if (bizInviteParams == null || !bizInviteParams.noticeConfirmed) {
            z = false;
        }
        if (bizInviteParams == null || (list = bizInviteParams.outRoomInviteeList) == null) {
            list = C13BV.INSTANCE;
        }
        C920810a4N c920810a4N = new C920810a4N(c920820a4OLIZIZ, c967180bHALJIIIZ, enumC919140a1g, list2, mapLIZJ, j, j2, str4, j3, z, list);
        C966100bFQ c966100bFQ = new C966100bFQ(c966020bFI.LJ, "moderatorInvite", interfaceC966890bGh, new C965840bF0());
        c966020bFI.LJIIJ(c966100bFQ, null);
        c966920bGkLJ.LJIIJ(c920810a4N, new C966240bFe(c966100bFQ, null));
    }

    @Override // X.InterfaceC954180awC
    public final void LJLL(C954730ax5 c954730ax5, final C987180bnQ c987180bnQ) {
        List<InterfaceC965500bES> listLJLJL;
        C966020bFI c966020bFI = this.LJFF;
        InterfaceC966890bGh<LeaveGroupResult> interfaceC966890bGh = new InterfaceC966890bGh<LeaveGroupResult>() { // from class: X.0bDo
            @Override // X.InterfaceC966890bGh
            public final void LIZ(LeaveGroupResult leaveGroupResult) {
                InterfaceC920680a4A<LeaveGroupResult> interfaceC920680a4A = c987180bnQ;
                if (interfaceC920680a4A != null) {
                    interfaceC920680a4A.onSuccess(leaveGroupResult);
                }
            }

            @Override // X.InterfaceC966890bGh
            public final void LIZIZ(LinkCoreError linkCoreError, Throwable th) {
                InterfaceC920680a4A<LeaveGroupResult> interfaceC920680a4A = c987180bnQ;
                if (interfaceC920680a4A != null) {
                    interfaceC920680a4A.LIZ(linkCoreError, th);
                }
            }
        };
        C965350bED c965350bED = c966020bFI.LJJ;
        String str = c966020bFI.LJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("leave group");
        sbLIZ.append(" start data=");
        sbLIZ.append(c954730ax5);
        sbLIZ.append(" leaveGroupChannelId=");
        sbLIZ.append((Object) null);
        sbLIZ.append(" stayGroupChannelId=");
        sbLIZ.append(0L);
        C1AZW.LIZIZ(c965350bED, str, C2188811AlT.LIZIZ(sbLIZ), null, null);
        InterfaceC965990bFF interfaceC965990bFF = c966020bFI.LJIIZILJ;
        if (interfaceC965990bFF != null && (listLJLJL = interfaceC965990bFF.LJLJL()) != null) {
            for (InterfaceC965500bES interfaceC965500bES : listLJLJL) {
                if (interfaceC965500bES != null) {
                    interfaceC965500bES.LJI(c954730ax5);
                }
            }
        }
        C966920bGk c966920bGkLJ = c966020bFI.LJ();
        C2234001CcA c2234001CcA = new C2234001CcA(c954730ax5.LJ, C966020bFI.LJIIIZ(c966020bFI, c954730ax5.LIZ, c954730ax5.LIZIZ, c954730ax5.LIZJ, null, 56), 0L, C1282000jSw.LIZIZ(c954730ax5.LJI), EnumC2231871CWz.Unknown, new C968550bJN(c954730ax5.LIZLLL.notSuggestToUid));
        C966100bFQ c966100bFQ = new C966100bFQ(c966020bFI.LJ, "leave group", interfaceC966890bGh, new C965390bEH(c966020bFI, c954730ax5));
        c966100bFQ.LLILZ = new C965610bEd(c966020bFI);
        c966020bFI.LJIIJ(c966100bFQ, null);
        c966920bGkLJ.LJJLIIIJJIZ(c2234001CcA, new C966240bFe(c966100bFQ, null));
    }

    @Override // X.InterfaceC954180awC
    public final void LJLLL(final C926250aD9 c926250aD9, final InterfaceC920680a4A<DirectJoinResult> interfaceC920680a4A) {
        long id;
        boolean z;
        EnumC969750bLJ enumC969750bLJ;
        EnumC965920bF8 enumC965920bF8;
        C966020bFI c966020bFI = this.LJFF;
        LiveRoomUser.Builder builder = new LiveRoomUser.Builder();
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null) {
            id = room.getId();
        } else {
            id = 0;
        }
        builder.setRoomId(id);
        builder.setUserId(UserService.getInstance().user().getCurrentUserId());
        DirectJoinData.Builder builder2 = new DirectJoinData.Builder(builder.build());
        builder2.setChannelId(this.LJFF.LIZLLL);
        builder2.setBizJoinDirectParams(c926250aD9.LIZ);
        DirectJoinData directJoinDataBuild = builder2.build();
        InterfaceC966890bGh<DirectJoinResult> interfaceC966890bGh = new InterfaceC966890bGh<DirectJoinResult>() { // from class: X.0bDT
            @Override // X.InterfaceC966890bGh
            public final void LIZ(DirectJoinResult directJoinResult) {
                InterfaceC964840bDO interfaceC964840bDOLJLIIL;
                BizJoinDirectParams bizJoinDirectParams = c926250aD9.LIZ;
                if (bizJoinDirectParams != null && bizJoinDirectParams.replyType == 1 && (interfaceC964840bDOLJLIIL = this.LLJLILLLLZIIL().LJLIIL()) != null) {
                    interfaceC964840bDOLJLIIL.LJIIIZ();
                }
                InterfaceC920680a4A<DirectJoinResult> interfaceC920680a4A2 = interfaceC920680a4A;
                if (interfaceC920680a4A2 != null) {
                    interfaceC920680a4A2.onSuccess(directJoinResult);
                }
            }

            @Override // X.InterfaceC966890bGh
            public final void LIZIZ(LinkCoreError linkCoreError, Throwable th) {
                InterfaceC920680a4A<DirectJoinResult> interfaceC920680a4A2 = interfaceC920680a4A;
                if (interfaceC920680a4A2 != null) {
                    interfaceC920680a4A2.LIZ(linkCoreError, th);
                }
            }
        };
        C965350bED c965350bED = c966020bFI.LJJ;
        String str = c966020bFI.LJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("joinDirect");
        sbLIZ.append(" start data=");
        sbLIZ.append(directJoinDataBuild);
        C1AZW.LIZIZ(c965350bED, str, C2188811AlT.LIZIZ(sbLIZ), null, null);
        C965350bED c965350bED2 = c966020bFI.LJJ;
        String str2 = c966020bFI.LJ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("joinDirect start channelId=");
        sbLIZ2.append(c966020bFI.LIZLLL);
        sbLIZ2.append(" state=");
        sbLIZ2.append(c966020bFI.LJIIIIZZ);
        sbLIZ2.append(" joinData=");
        sbLIZ2.append(directJoinDataBuild);
        C1AZW.LIZIZ(c965350bED2, str2, C2188811AlT.LIZIZ(sbLIZ2), null, null);
        C966920bGk c966920bGkLJ = c966020bFI.LJ();
        BizJoinDirectParams bizJoinDirectParams = directJoinDataBuild.bizJoinDirectParams;
        if (bizJoinDirectParams != null && bizJoinDirectParams.replyType == 1) {
            z = true;
        } else {
            z = false;
            if (bizJoinDirectParams == null) {
                bizJoinDirectParams = new BizJoinDirectParams(0L, 0, 0, 0, 0, 0, 0);
            }
        }
        if (bizJoinDirectParams.linkType == 1) {
            enumC969750bLJ = EnumC969750bLJ.Video;
        } else {
            enumC969750bLJ = EnumC969750bLJ.Audio;
        }
        EnumC2235671Cer enumC2235671CerLIZLLL = C968680bJa.LIZLLL(bizJoinDirectParams.replyType);
        EnumC968720bJe enumC968720bJeLJI = C968680bJa.LJI(bizJoinDirectParams.userReturnType);
        EnumC968740bJg enumC968740bJgLJFF = C968680bJa.LJFF(bizJoinDirectParams.shareRevenueSetting);
        C2236771Cgd c2236771Cgd = EnumC2236751Cgb.Companion;
        int i = bizJoinDirectParams.shareRevenueSettingRatio;
        c2236771Cgd.getClass();
        EnumC2236751Cgb enumC2236751CgbLIZ = C2236771Cgd.LIZ(i);
        int i2 = bizJoinDirectParams.outsideRoomInviteSource;
        if (i2 >= EnumC965920bF8.values().length) {
            enumC965920bF8 = EnumC965920bF8.OutsideRoomInviteSourceUnknown;
            C968680bJa.LIZ(enumC965920bF8);
        } else {
            EnumC965920bF8.Companion.getClass();
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 == 3) {
                            enumC965920bF8 = EnumC965920bF8.OutsideRoomInviteSourceEmptyPosition;
                        } else {
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("Unmatched primitive enum value: MultiGuestOutsideRoomInviteSource with ");
                            sbLIZ3.append(i2);
                            throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ3));
                        }
                    } else {
                        enumC965920bF8 = EnumC965920bF8.OutsideRoomInviteSourceCapsule;
                    }
                } else {
                    enumC965920bF8 = EnumC965920bF8.OutsideRoomInviteSourcePanel;
                }
            } else {
                enumC965920bF8 = EnumC965920bF8.OutsideRoomInviteSourceUnknown;
            }
        }
        C969280bKY c969280bKY = new C969280bKY(z, new C969270bKX(enumC969750bLJ, enumC2235671CerLIZLLL, enumC968720bJeLJI, enumC968740bJgLJFF, enumC2236751CgbLIZ, enumC965920bF8, bizJoinDirectParams.joinDirectType));
        C966100bFQ c966100bFQ = new C966100bFQ(c966020bFI.LJ, "joinDirect", interfaceC966890bGh, new C965940bFA());
        c966020bFI.LJIIJ(c966100bFQ, null);
        c966920bGkLJ.LJLLLLLL(c969280bKY, new C966240bFe(c966100bFQ, null));
    }

    @Override // X.InterfaceC954180awC
    public final void LJZL(C920420a3k c920420a3k, final C919260a1s c919260a1s) {
        C966020bFI c966020bFI = this.LJFF;
        LiveRoomUser.Builder builder = new LiveRoomUser.Builder();
        builder.setRoomId(c920420a3k.LIZ);
        builder.setUserId(c920420a3k.LIZIZ);
        builder.setLinkMicId(c920420a3k.LIZJ);
        KickOutData.Builder builder2 = new KickOutData.Builder(builder.build());
        builder2.setKickOutReason(c920420a3k.LIZLLL);
        KickOutData kickOutDataBuild = builder2.build();
        InterfaceC966890bGh<KickOutResult> interfaceC966890bGh = new InterfaceC966890bGh<KickOutResult>() { // from class: X.0bDy
            @Override // X.InterfaceC966890bGh
            public final void LIZ(KickOutResult kickOutResult) {
                InterfaceC920680a4A<KickOutResult> interfaceC920680a4A = c919260a1s;
                if (interfaceC920680a4A != null) {
                    interfaceC920680a4A.onSuccess(kickOutResult);
                }
            }

            @Override // X.InterfaceC966890bGh
            public final void LIZIZ(LinkCoreError linkCoreError, Throwable th) {
                InterfaceC920680a4A<KickOutResult> interfaceC920680a4A = c919260a1s;
                if (interfaceC920680a4A != null) {
                    interfaceC920680a4A.LIZ(linkCoreError, th);
                }
            }
        };
        C965350bED c965350bED = c966020bFI.LJJ;
        String str = c966020bFI.LJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("moderatorKickOut channelId=");
        sbLIZ.append(c966020bFI.LIZLLL);
        sbLIZ.append(" data=");
        sbLIZ.append(kickOutDataBuild);
        C1AZW.LIZIZ(c965350bED, str, C2188811AlT.LIZIZ(sbLIZ), null, null);
        C966920bGk c966920bGkLJ = c966020bFI.LJ();
        LiveRoomUser liveRoomUser = kickOutDataBuild.guest;
        C968750bJh c968750bJh = new C968750bJh(C966020bFI.LJIIIZ(c966020bFI, liveRoomUser.roomId, liveRoomUser.userId, c966020bFI.LIZLLL, null, 56), C968680bJa.LJ(kickOutDataBuild.kickOutReason));
        C966100bFQ c966100bFQ = new C966100bFQ(c966020bFI.LJ, "moderatorInvite", interfaceC966890bGh, new C967510bHh());
        c966020bFI.LJIIJ(c966100bFQ, null);
        c966920bGkLJ.LIZJ(c968750bJh, new C966240bFe(c966100bFQ, null));
    }

    @Override // X.InterfaceC954180awC
    public final void LL(C920400a3i c920400a3i, final C918500a0e c918500a0e) {
        C966020bFI c966020bFI = this.LJFF;
        LiveRoomUser.Builder builder = new LiveRoomUser.Builder();
        builder.setRoomId(c920400a3i.LIZ);
        builder.setUserId(c920400a3i.LIZIZ);
        builder.setLinkMicId(c920400a3i.LIZJ);
        CancelInviteData cancelInviteDataBuild = new CancelInviteData.Builder(builder.build(), c920400a3i.LJFF).build();
        InterfaceC966890bGh<CancelInviteResult> interfaceC966890bGh = new InterfaceC966890bGh<CancelInviteResult>() { // from class: X.0bDx
            @Override // X.InterfaceC966890bGh
            public final void LIZ(CancelInviteResult cancelInviteResult) {
                InterfaceC920680a4A<CancelInviteResult> interfaceC920680a4A = c918500a0e;
                if (interfaceC920680a4A != null) {
                    interfaceC920680a4A.onSuccess(cancelInviteResult);
                }
            }

            @Override // X.InterfaceC966890bGh
            public final void LIZIZ(LinkCoreError linkCoreError, Throwable th) {
                InterfaceC920680a4A<CancelInviteResult> interfaceC920680a4A = c918500a0e;
                if (interfaceC920680a4A != null) {
                    interfaceC920680a4A.LIZ(linkCoreError, th);
                }
            }
        };
        C965350bED c965350bED = c966020bFI.LJJ;
        String str = c966020bFI.LJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("moderatorCancelInvite channelId=");
        sbLIZ.append(c966020bFI.LIZLLL);
        sbLIZ.append(" state=");
        sbLIZ.append(c966020bFI.LJIIIIZZ);
        sbLIZ.append(" data=");
        sbLIZ.append(cancelInviteDataBuild);
        C1AZW.LIZIZ(c965350bED, str, C2188811AlT.LIZIZ(sbLIZ), null, null);
        C966920bGk c966920bGkLJ = c966020bFI.LJ();
        LiveRoomUser liveRoomUser = cancelInviteDataBuild.invitee;
        C2231451CVj c2231451CVj = new C2231451CVj(C966020bFI.LJIIIZ(c966020bFI, liveRoomUser.roomId, liveRoomUser.userId, c966020bFI.LIZLLL, null, 56), C2097608Jq.LJ());
        C966100bFQ c966100bFQ = new C966100bFQ(c966020bFI.LJ, "moderatorCancelInvite", interfaceC966890bGh, new C966750bGT());
        c966020bFI.LJIIJ(c966100bFQ, null);
        c966920bGkLJ.LJIIIIZZ(c2231451CVj, new C966240bFe(c966100bFQ, null));
    }

    @Override // X.InterfaceC954180awC
    public final void LLF(final C954620awu c954620awu, final InterfaceC920680a4A<ReplyInviteGroupResult> interfaceC920680a4A) {
        List<InterfaceC965500bES> listLJLJL;
        C966020bFI c966020bFI = this.LJFF;
        InterfaceC966890bGh<ReplyInviteGroupResult> interfaceC966890bGh = new InterfaceC966890bGh<ReplyInviteGroupResult>() { // from class: X.0bDR
            @Override // X.InterfaceC966890bGh
            public final void LIZ(ReplyInviteGroupResult replyInviteGroupResult) {
                if (c954620awu.LJ == 1 && !LinkMicSdkCoHostUpdateLayoutTimeOptSetting.INSTANCE.isOpt()) {
                    this.LLJLILLLLZIIL().LJJJJIZL(LiveCoHostLayoutIdConfigSetting.INSTANCE.getNormalExpand(true), false, false, true, false, new C916150Zwr());
                }
                InterfaceC920680a4A<ReplyInviteGroupResult> interfaceC920680a4A2 = interfaceC920680a4A;
                if (interfaceC920680a4A2 != null) {
                    interfaceC920680a4A2.onSuccess(replyInviteGroupResult);
                }
            }

            @Override // X.InterfaceC966890bGh
            public final void LIZIZ(LinkCoreError linkCoreError, Throwable th) {
                InterfaceC920680a4A<ReplyInviteGroupResult> interfaceC920680a4A2 = interfaceC920680a4A;
                if (interfaceC920680a4A2 != null) {
                    interfaceC920680a4A2.LIZ(linkCoreError, th);
                }
            }
        };
        C965350bED c965350bED = c966020bFI.LJJ;
        String str = c966020bFI.LJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("reply invite group");
        sbLIZ.append(" start data=");
        sbLIZ.append(c954620awu);
        C1AZW.LIZIZ(c965350bED, str, C2188811AlT.LIZIZ(sbLIZ), null, null);
        boolean z = true;
        if (c954620awu.LJ != 1) {
            z = false;
        }
        InterfaceC965990bFF interfaceC965990bFF = c966020bFI.LJIIZILJ;
        if (interfaceC965990bFF != null && (listLJLJL = interfaceC965990bFF.LJLJL()) != null) {
            for (InterfaceC965500bES interfaceC965500bES : listLJLJL) {
                if (z) {
                    if (interfaceC965500bES != null) {
                        interfaceC965500bES.LJIL(c954620awu);
                    }
                } else if (interfaceC965500bES != null) {
                    interfaceC965500bES.LJIILIIL(c954620awu);
                }
            }
        }
        C966920bGk c966920bGkLJ = c966020bFI.LJ();
        C2235641Ceo c2235641Ceo = new C2235641Ceo(C966020bFI.LJIIIZ(c966020bFI, c954620awu.LIZ, c954620awu.LIZIZ, c954620awu.LIZJ, null, 56), C968680bJa.LIZLLL(c954620awu.LJ), c954620awu.LIZLLL, new C2235661Ceq(r0.replyStatus, r0.sourceType, c954620awu.LJFF.algoRequestId, new C968600bJS(), r0.matchedPreferenceTag), c954620awu.LJI, C13BV.INSTANCE);
        C966100bFQ c966100bFQ = new C966100bFQ(c966020bFI.LJ, "reply invite group", interfaceC966890bGh, new C965570bEZ(c966020bFI, z, c954620awu));
        c966100bFQ.LLILZ = new C965540bEW(c966020bFI, z, c954620awu);
        c966020bFI.LJIIJ(c966100bFQ, null);
        c966920bGkLJ.LJLLI(c2235641Ceo, new C966240bFe(c966100bFQ, null));
    }

    @Override // X.InterfaceC954180awC
    public final void LLFF(C920450a3n c920450a3n, final InterfaceC920680a4A<ChangeMaxPositionResult> interfaceC920680a4A) {
        long j;
        long j2;
        C966020bFI c966020bFI = this.LJFF;
        ChangeMaxPositionData.Builder builder = new ChangeMaxPositionData.Builder();
        builder.setMaxPosition(c920450a3n.LIZ);
        builder.setCustomData(c920450a3n.LIZLLL);
        builder.setLayoutId(c920450a3n.LIZIZ);
        builder.setSceneVersion(LLJLILLLLZIIL().LJJJLZIJ().LIZ);
        builder.setBizChangeLayoutParams(c920450a3n.LIZJ);
        ChangeMaxPositionData changeMaxPositionDataBuild = builder.build();
        InterfaceC966890bGh<ChangeMaxPositionResult> interfaceC966890bGh = new InterfaceC966890bGh<ChangeMaxPositionResult>() { // from class: X.0bEw
            @Override // X.InterfaceC966890bGh
            public final void LIZ(ChangeMaxPositionResult changeMaxPositionResult) {
                InterfaceC920680a4A<ChangeMaxPositionResult> interfaceC920680a4A2 = interfaceC920680a4A;
                if (interfaceC920680a4A2 != null) {
                    interfaceC920680a4A2.onSuccess(changeMaxPositionResult);
                }
            }

            @Override // X.InterfaceC966890bGh
            public final void LIZIZ(LinkCoreError linkCoreError, Throwable th) {
                InterfaceC920680a4A<ChangeMaxPositionResult> interfaceC920680a4A2 = interfaceC920680a4A;
                if (interfaceC920680a4A2 != null) {
                    interfaceC920680a4A2.LIZ(linkCoreError, th);
                }
            }
        };
        C965350bED c965350bED = c966020bFI.LJJ;
        String str = c966020bFI.LJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("changeMaxPosition start channelId=");
        sbLIZ.append(c966020bFI.LIZLLL);
        sbLIZ.append(" state=");
        sbLIZ.append(c966020bFI.LJIIIIZZ);
        sbLIZ.append(" data=");
        sbLIZ.append(changeMaxPositionDataBuild);
        C1AZW.LJIIIZ(c965350bED, str, C2188811AlT.LIZIZ(sbLIZ), null, null);
        String str2 = "";
        if (C917740ZzQ.LIZIZ(c966020bFI.LIZIZ)) {
            C966920bGk c966920bGkLJ = c966020bFI.LJ();
            long j3 = changeMaxPositionDataBuild.maxPosition;
            String str3 = changeMaxPositionDataBuild.layoutId;
            if (str3 != null) {
                str2 = str3;
            }
            long j4 = changeMaxPositionDataBuild.sceneVersion;
            BizChangeLayoutParams bizChangeLayoutParams = changeMaxPositionDataBuild.bizChangeLayoutParams;
            if (bizChangeLayoutParams != null) {
                j2 = bizChangeLayoutParams.displayId;
            } else {
                j2 = 0;
            }
            C2234011CcB c2234011CcB = new C2234011CcB(j3, str2, j4, new C968540bJM(j2));
            C966100bFQ c966100bFQ = new C966100bFQ(c966020bFI.LJ, "changeMaxPosition", interfaceC966890bGh, new C967540bHk());
            c966020bFI.LJIIJ(c966100bFQ, null);
            c966920bGkLJ.LJJLIIIJLJLI(c2234011CcB, new C966240bFe(c966100bFQ, null));
            return;
        }
        C966920bGk c966920bGkLJ2 = c966020bFI.LJ();
        long j5 = changeMaxPositionDataBuild.maxPosition;
        String str4 = changeMaxPositionDataBuild.layoutId;
        if (str4 != null) {
            str2 = str4;
        }
        long j6 = changeMaxPositionDataBuild.sceneVersion;
        BizChangeLayoutParams bizChangeLayoutParams2 = changeMaxPositionDataBuild.bizChangeLayoutParams;
        if (bizChangeLayoutParams2 != null) {
            j = bizChangeLayoutParams2.displayId;
        } else {
            j = 0;
        }
        C2234011CcB c2234011CcB2 = new C2234011CcB(j5, str2, j6, new C968540bJM(j));
        C966100bFQ c966100bFQ2 = new C966100bFQ(c966020bFI.LJ, "changeMaxPosition", interfaceC966890bGh, new C967550bHl());
        c966020bFI.LJIIJ(c966100bFQ2, null);
        c966920bGkLJ2.LJJJLL(c2234011CcB2, new C966240bFe(c966100bFQ2, null));
    }

    @Override // X.InterfaceC954180awC
    public final void LLFII(final C950850aqp c950850aqp, final InterfaceC920680a4A<ReplyResult> interfaceC920680a4A) {
        long j;
        C966020bFI c966020bFI = this.LJFF;
        LiveRoomUser.Builder builder = new LiveRoomUser.Builder();
        builder.setRoomId(c950850aqp.LIZ);
        builder.setUserId(c950850aqp.LIZIZ);
        ReplyInviteData.Builder builder2 = new ReplyInviteData.Builder(builder.build());
        builder2.setReplyStatus(c950850aqp.LIZJ);
        builder2.setBizReplyParams(c950850aqp.LIZLLL);
        builder2.setInviteOperatorUid(c950850aqp.LJ);
        ReplyInviteData replyInviteDataBuild = builder2.build();
        InterfaceC966890bGh<ReplyResult> interfaceC966890bGh = new InterfaceC966890bGh<ReplyResult>() { // from class: X.0bDU
            @Override // X.InterfaceC966890bGh
            public final void LIZ(ReplyResult replyResult) {
                InterfaceC964840bDO interfaceC964840bDOLJLIIL;
                ReplyResult replyResult2 = replyResult;
                if (c950850aqp.LIZJ == 1 && (interfaceC964840bDOLJLIIL = this.LLJLILLLLZIIL().LJLIIL()) != null) {
                    interfaceC964840bDOLJLIIL.LJFF(replyResult2.inviteeLinkMicId);
                }
                InterfaceC920680a4A<ReplyResult> interfaceC920680a4A2 = interfaceC920680a4A;
                if (interfaceC920680a4A2 != null) {
                    interfaceC920680a4A2.onSuccess(replyResult2);
                }
            }

            @Override // X.InterfaceC966890bGh
            public final void LIZIZ(LinkCoreError linkCoreError, Throwable th) {
                InterfaceC920680a4A<ReplyResult> interfaceC920680a4A2 = interfaceC920680a4A;
                if (interfaceC920680a4A2 != null) {
                    interfaceC920680a4A2.LIZ(linkCoreError, th);
                }
            }
        };
        C965350bED c965350bED = c966020bFI.LJJ;
        String str = c966020bFI.LJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("replyInvite start channelId=");
        sbLIZ.append(c966020bFI.LIZLLL);
        sbLIZ.append(" state=");
        sbLIZ.append(c966020bFI.LJIIIIZZ);
        sbLIZ.append(" data=");
        sbLIZ.append(replyInviteDataBuild);
        C1AZW.LIZIZ(c965350bED, str, C2188811AlT.LIZIZ(sbLIZ), null, null);
        C966920bGk c966920bGkLJ = c966020bFI.LJ();
        EnumC2235671Cer enumC2235671CerLIZLLL = C968680bJa.LIZLLL(replyInviteDataBuild.replyStatus);
        LiveRoomUser liveRoomUser = replyInviteDataBuild.inviter;
        C967180bHA c967180bHALJIIIZ = C966020bFI.LJIIIZ(c966020bFI, liveRoomUser.roomId, liveRoomUser.userId, c966020bFI.LIZLLL, null, 56);
        C967180bHA c967180bHALJIIIZ2 = C966020bFI.LJIIIZ(c966020bFI, c966020bFI.LIZ.getId(), replyInviteDataBuild.inviteOperatorUid, c966020bFI.LIZLLL, null, 56);
        BizReplyParams bizReplyParams = replyInviteDataBuild.bizReplyParams;
        long j2 = 0;
        if (bizReplyParams != null) {
            j = bizReplyParams.linkType;
            j2 = bizReplyParams.isTurnOffInvitation;
        } else {
            j = 0;
        }
        C969140bKK c969140bKK = new C969140bKK(enumC2235671CerLIZLLL, c967180bHALJIIIZ, c967180bHALJIIIZ2, new C968580bJQ(j, j2));
        C966100bFQ c966100bFQ = new C966100bFQ(c966020bFI.LJ, "replyInvite", interfaceC966890bGh, new C965620bEe());
        c966020bFI.LJIIJ(c966100bFQ, null);
        c966920bGkLJ.LJJZ(c969140bKK, new C966240bFe(c966100bFQ, null));
    }

    @Override // X.InterfaceC954180awC
    public final void LLIIIL(C920420a3k c920420a3k, final InterfaceC920680a4A<KickOutResult> interfaceC920680a4A) {
        C966020bFI c966020bFI = this.LJFF;
        LiveRoomUser.Builder builder = new LiveRoomUser.Builder();
        builder.setRoomId(c920420a3k.LIZ);
        builder.setUserId(c920420a3k.LIZIZ);
        builder.setLinkMicId(c920420a3k.LIZJ);
        KickOutData.Builder builder2 = new KickOutData.Builder(builder.build());
        builder2.setKickOutReason(c920420a3k.LIZLLL);
        KickOutData kickOutDataBuild = builder2.build();
        InterfaceC966890bGh<KickOutResult> interfaceC966890bGh = new InterfaceC966890bGh<KickOutResult>() { // from class: X.0bEx
            @Override // X.InterfaceC966890bGh
            public final void LIZ(KickOutResult kickOutResult) {
                InterfaceC920680a4A<KickOutResult> interfaceC920680a4A2 = interfaceC920680a4A;
                if (interfaceC920680a4A2 != null) {
                    interfaceC920680a4A2.onSuccess(kickOutResult);
                }
            }

            @Override // X.InterfaceC966890bGh
            public final void LIZIZ(LinkCoreError linkCoreError, Throwable th) {
                InterfaceC920680a4A<KickOutResult> interfaceC920680a4A2 = interfaceC920680a4A;
                if (interfaceC920680a4A2 != null) {
                    interfaceC920680a4A2.LIZ(linkCoreError, th);
                }
            }
        };
        C965350bED c965350bED = c966020bFI.LJJ;
        String str = c966020bFI.LJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("kickOut channelId=");
        sbLIZ.append(c966020bFI.LIZLLL);
        sbLIZ.append(" state=");
        sbLIZ.append(c966020bFI.LJIIIIZZ);
        sbLIZ.append(" data=");
        sbLIZ.append(kickOutDataBuild);
        C1AZW.LIZIZ(c965350bED, str, C2188811AlT.LIZIZ(sbLIZ), null, null);
        C966920bGk c966920bGkLJ = c966020bFI.LJ();
        LiveRoomUser liveRoomUser = kickOutDataBuild.guest;
        C968750bJh c968750bJh = new C968750bJh(C966020bFI.LJIIIZ(c966020bFI, liveRoomUser.roomId, liveRoomUser.userId, c966020bFI.LIZLLL, null, 56), C968680bJa.LJ(kickOutDataBuild.kickOutReason));
        C966100bFQ c966100bFQ = new C966100bFQ(c966020bFI.LJ, "kickOut", interfaceC966890bGh, new C967520bHi());
        c966020bFI.LJIIJ(c966100bFQ, null);
        c966920bGkLJ.LJLJJLL(c968750bJh, new C966240bFe(c966100bFQ, null));
    }

    @Override // X.InterfaceC954180awC
    public final void LLIIL(Cert cert, String str) {
        Integer numValueOf;
        C966020bFI c966020bFI = this.LJFF;
        C965350bED c965350bED = c966020bFI.LJJ;
        String str2 = c966020bFI.LJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[turnOffEngine], source=");
        sbLIZ.append(str);
        C1AZW.LIZIZ(c965350bED, str2, C2188811AlT.LIZIZ(sbLIZ), null, null);
        C1276910jKj c1276910jKj = c966020bFI.LJJI.LIZIZ;
        if (c1276910jKj != null) {
            C965350bED c965350bED2 = c1276910jKj.LLILZ.LJJ;
            String str3 = c1276910jKj.LLILZIL;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("[turnOff]");
            InterfaceC1276380jJs interfaceC1276380jJs = c1276910jKj.LLJJJJ;
            if (interfaceC1276380jJs != null) {
                numValueOf = Integer.valueOf(interfaceC1276380jJs.hashCode());
            } else {
                numValueOf = null;
            }
            sbLIZ2.append(numValueOf);
            C1AZW.LIZIZ(c965350bED2, str3, C2188811AlT.LIZIZ(sbLIZ2), null, null);
            c1276910jKj.LJJJJZI(true, true, "turnOff", cert);
        }
    }

    @Override // X.InterfaceC954180awC
    public final void LLIIZ(C954590awr c954590awr, final C954480awg c954480awg) {
        long jLongValue;
        List<InterfaceC965500bES> listLJLJL;
        C966020bFI c966020bFI = this.LJFF;
        InterfaceC966890bGh<ApplyGroupResult> interfaceC966890bGh = new InterfaceC966890bGh<ApplyGroupResult>() { // from class: X.0bDp
            @Override // X.InterfaceC966890bGh
            public final void LIZ(ApplyGroupResult applyGroupResult) {
                InterfaceC920680a4A<ApplyGroupResult> interfaceC920680a4A = c954480awg;
                if (interfaceC920680a4A != null) {
                    interfaceC920680a4A.onSuccess(applyGroupResult);
                }
            }

            @Override // X.InterfaceC966890bGh
            public final void LIZIZ(LinkCoreError linkCoreError, Throwable th) {
                InterfaceC920680a4A<ApplyGroupResult> interfaceC920680a4A = c954480awg;
                if (interfaceC920680a4A != null) {
                    interfaceC920680a4A.LIZ(linkCoreError, th);
                }
            }
        };
        C965350bED c965350bED = c966020bFI.LJJ;
        String str = c966020bFI.LJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("apply group");
        sbLIZ.append(" data=");
        sbLIZ.append(c954590awr);
        C1AZW.LIZIZ(c965350bED, str, C2188811AlT.LIZIZ(sbLIZ), null, null);
        Long l = c954590awr.LIZLLL;
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        InterfaceC965990bFF interfaceC965990bFF = c966020bFI.LJIIZILJ;
        if (interfaceC965990bFF != null && (listLJLJL = interfaceC965990bFF.LJLJL()) != null) {
            for (InterfaceC965500bES interfaceC965500bES : listLJLJL) {
                if (interfaceC965500bES != null) {
                    interfaceC965500bES.LJIIJ(c954590awr);
                }
            }
        }
        C966920bGk c966920bGkLJ = c966020bFI.LJ();
        C967180bHA c967180bHALJIIIZ = C966020bFI.LJIIIZ(c966020bFI, c954590awr.LIZ, c954590awr.LIZIZ, c954590awr.LIZJ, null, 56);
        BizJoinGroupParams bizJoinGroupParams = c954590awr.LJFF;
        C2235631Cen c2235631Cen = new C2235631Cen(c967180bHALJIIIZ, jLongValue, new C2235651Cep(bizJoinGroupParams.sourceType, bizJoinGroupParams.checkPerceptionCenter, bizJoinGroupParams.tagType, bizJoinGroupParams.tagValue, bizJoinGroupParams.needWithdraw, bizJoinGroupParams.algoRequestId, new C968600bJS()), c954590awr.LJII, C13BV.INSTANCE);
        C966100bFQ c966100bFQ = new C966100bFQ(c966020bFI.LJ, "apply group", interfaceC966890bGh, new C965370bEF(c966020bFI, c954590awr));
        c966100bFQ.LLILZ = new C965510bET(c966020bFI, c954590awr);
        c966920bGkLJ.LJJLI(c2235631Cen, new C966240bFe(c966100bFQ, null));
    }

    @Override // X.InterfaceC938940aXc
    public final void LLIL(int i, Object obj) {
        this.LJFF.LLIL(i, obj);
    }

    @Override // X.InterfaceC954180awC
    public final void LLILIL(final Boolean bool, final String str) {
        if (str.length() == 0) {
            return;
        }
        C965350bED c965350bED = this.LJJII;
        String str2 = this.LJIIIIZZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateDslLayoutById layoutId:");
        sbLIZ.append(str);
        C1AZW.LIZIZ(c965350bED, str2, C2188811AlT.LIZIZ(sbLIZ), null, null);
        int iLJJJJJ = LLJLILLLLZIIL().LJJJJJ(str);
        this.LIZJ = iLJJJJJ;
        this.LJIILL.LJJJ(this.LIZIZ, iLJJJJJ, new InterfaceC1303110k0z() { // from class: X.0bDu
            @Override // X.InterfaceC1303110k0z
            public final void LIZ(DslLayout dslLayout) {
                this.LIZ.LLJLILLLLZIIL().LLIIIJ(dslLayout);
                if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
                    this.LIZ.LLJLILLLLZIIL().LJJIJLIJ(dslLayout.version, str);
                }
            }
        }, null);
    }

    @Override // X.InterfaceC954180awC
    public final void LLILZ(String str, boolean z) {
        RTCVideoInterface rTCVideoInterfaceLJJJJZ;
        RTCVideoInterface rTCVideoInterfaceLJJJJZ2;
        C1276910jKj c1276910jKj = this.LJFF.LJJI.LIZIZ;
        if (c1276910jKj != null) {
            if (z) {
                InterfaceC1276380jJs interfaceC1276380jJs = c1276910jKj.LLJJJJ;
                if (interfaceC1276380jJs != null && (rTCVideoInterfaceLJJJJZ2 = interfaceC1276380jJs.LJJJJZ()) != null) {
                    rTCVideoInterfaceLJJJJZ2.startAudioCapture();
                    return;
                }
                return;
            }
            InterfaceC1276380jJs interfaceC1276380jJs2 = c1276910jKj.LLJJJJ;
            if (interfaceC1276380jJs2 == null || (rTCVideoInterfaceLJJJJZ = interfaceC1276380jJs2.LJJJJZ()) == null) {
                return;
            }
            rTCVideoInterfaceLJJJJZ.stopAudioCapture();
        }
    }

    @Override // X.InterfaceC954180awC
    public final void LLJI(C957690b1r c957690b1r, final InterfaceC920680a4A<KickOutAllResult> interfaceC920680a4A) {
        C966020bFI c966020bFI = this.LJFF;
        KickOutAllData kickOutAllData = new KickOutAllData(null, c957690b1r.LIZIZ, c957690b1r.LIZ);
        InterfaceC966890bGh<KickOutAllResult> interfaceC966890bGh = new InterfaceC966890bGh<KickOutAllResult>() { // from class: X.0bE9
            @Override // X.InterfaceC966890bGh
            public final void LIZ(KickOutAllResult kickOutAllResult) {
                InterfaceC920680a4A<KickOutAllResult> interfaceC920680a4A2 = interfaceC920680a4A;
                if (interfaceC920680a4A2 != null) {
                    interfaceC920680a4A2.onSuccess(kickOutAllResult);
                }
            }

            @Override // X.InterfaceC966890bGh
            public final void LIZIZ(LinkCoreError linkCoreError, Throwable th) {
                InterfaceC920680a4A<KickOutAllResult> interfaceC920680a4A2 = interfaceC920680a4A;
                if (interfaceC920680a4A2 != null) {
                    interfaceC920680a4A2.LIZ(linkCoreError, th);
                }
            }
        };
        C965350bED c965350bED = c966020bFI.LJJ;
        String str = c966020bFI.LJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("kickOutAll");
        sbLIZ.append(" channelId=");
        sbLIZ.append(c966020bFI.LIZLLL);
        sbLIZ.append(" state=");
        sbLIZ.append(c966020bFI.LJIIIIZZ);
        sbLIZ.append(" data=");
        sbLIZ.append(kickOutAllData);
        C1AZW.LIZIZ(c965350bED, str, C2188811AlT.LIZIZ(sbLIZ), null, null);
        C966920bGk c966920bGkLJ = c966020bFI.LJ();
        C968530bJL c968530bJL = new C968530bJL(kickOutAllData.kickOutAllReason);
        C966100bFQ c966100bFQ = new C966100bFQ(c966020bFI.LJ, "kickOutAll", interfaceC966890bGh, new C967650bHv());
        c966020bFI.LJIIJ(c966100bFQ, null);
        c966920bGkLJ.LJJJJZ(c968530bJL, new C966240bFe(c966100bFQ, null));
    }

    @Override // X.InterfaceC954180awC
    public final void LLJILJILJ(List<MixStreamWaterMarkTask> list, boolean z) {
        C1AXM c1axm;
        if (LLJLILLLLZIIL() instanceof C1AXM) {
            InterfaceC964790bDJ interfaceC964790bDJLLJLILLLLZIIL = LLJLILLLLZIIL();
            if ((interfaceC964790bDJLLJLILLLLZIIL instanceof C1AXM) && (c1axm = (C1AXM) interfaceC964790bDJLLJLILLLLZIIL) != null) {
                C2181231AYf c2181231AYfLJLLLL = c1axm.LJLLLL();
                c2181231AYfLJLLLL.LIZJ.clear();
                c2181231AYfLJLLLL.LIZJ.addAll(list);
                if (z) {
                    c2181231AYfLJLLLL.LJI("setCustomWaterMarks", false);
                    return;
                }
                return;
            }
            return;
        }
        C2181391AYv c2181391AYv = this.LJIIZILJ;
        if (c2181391AYv == null) {
            return;
        }
        C2181241AYg c2181241AYg = c2181391AYv.LLJILJIL;
        c2181241AYg.LIZJ.clear();
        c2181241AYg.LIZJ.addAll(list);
        if (!z) {
            return;
        }
        c2181241AYg.LJI("setCustomWaterMarks", false);
    }

    @Override // X.InterfaceC954180awC
    public final void LLJJIJIL(C954600aws c954600aws, final C954490awh c954490awh) {
        long jLongValue;
        C966020bFI c966020bFI = this.LJFF;
        InterfaceC966890bGh<InviteGroupResult> interfaceC966890bGh = new InterfaceC966890bGh<InviteGroupResult>() { // from class: X.0bDs
            @Override // X.InterfaceC966890bGh
            public final void LIZ(InviteGroupResult inviteGroupResult) {
                InterfaceC920680a4A<InviteGroupResult> interfaceC920680a4A = c954490awh;
                if (interfaceC920680a4A != null) {
                    interfaceC920680a4A.onSuccess(inviteGroupResult);
                }
            }

            @Override // X.InterfaceC966890bGh
            public final void LIZIZ(LinkCoreError linkCoreError, Throwable th) {
                InterfaceC920680a4A<InviteGroupResult> interfaceC920680a4A = c954490awh;
                if (interfaceC920680a4A != null) {
                    interfaceC920680a4A.LIZ(linkCoreError, th);
                }
            }
        };
        C965350bED c965350bED = c966020bFI.LJJ;
        String str = c966020bFI.LJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("invite group");
        sbLIZ.append(" start data=");
        sbLIZ.append(c954600aws);
        C1AZW.LIZIZ(c965350bED, str, C2188811AlT.LIZIZ(sbLIZ), null, null);
        InterfaceC965990bFF interfaceC965990bFF = c966020bFI.LJIIZILJ;
        if (interfaceC965990bFF != null) {
            C966020bFI.LIZIZ(interfaceC965990bFF, false, new C966280bFi(c966020bFI, c954600aws));
        }
        C966920bGk c966920bGkLJ = c966020bFI.LJ();
        C967180bHA c967180bHALJIIIZ = C966020bFI.LJIIIZ(c966020bFI, c954600aws.LIZ, c954600aws.LIZIZ, c954600aws.LIZJ, null, 56);
        Long l = c954600aws.LIZLLL;
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        BizJoinGroupParams bizJoinGroupParams = c954600aws.LJFF;
        C2235631Cen c2235631Cen = new C2235631Cen(c967180bHALJIIIZ, jLongValue, new C2235651Cep(bizJoinGroupParams.sourceType, bizJoinGroupParams.checkPerceptionCenter, bizJoinGroupParams.tagType, bizJoinGroupParams.tagValue, bizJoinGroupParams.needWithdraw, bizJoinGroupParams.algoRequestId, new C968600bJS()), c954600aws.LJII, C13BV.INSTANCE);
        C966100bFQ c966100bFQ = new C966100bFQ(c966020bFI.LJ, "invite group", interfaceC966890bGh, new C965380bEG(c966020bFI, c954600aws));
        c966100bFQ.LLILZ = new C965520bEU(c966020bFI, c954600aws);
        c966020bFI.LJIIJ(c966100bFQ, null);
        c966920bGkLJ.LJJJJL(c2235631Cen, new C966240bFe(c966100bFQ, null));
    }

    @Override // X.InterfaceC954180awC
    public final void LLJJJ(C963720bBa c963720bBa, final InterfaceC920680a4A<DestroyChannelResult> interfaceC920680a4A) {
        this.LJIIL = true;
        C966020bFI c966020bFI = this.LJFF;
        DestroyChannelData.Builder builder = new DestroyChannelData.Builder();
        builder.setFinishReason(c963720bBa.LIZ);
        builder.setLinkArchType(c963720bBa.LIZIZ.getLinkArchType());
        DestroyChannelData destroyChannelDataBuild = builder.build();
        InterfaceC966890bGh<DestroyChannelResult> interfaceC966890bGh = new InterfaceC966890bGh<DestroyChannelResult>() { // from class: X.0bEE
            @Override // X.InterfaceC966890bGh
            public final void LIZ(DestroyChannelResult destroyChannelResult) {
                ((InterfaceC968390bJ7) this.LIZ.LJIL.getValue()).release();
                this.LIZ.LLJLILLLLZIIL().LJIJ(null);
                InterfaceC920680a4A<DestroyChannelResult> interfaceC920680a4A2 = interfaceC920680a4A;
                if (interfaceC920680a4A2 != null) {
                    interfaceC920680a4A2.onSuccess(destroyChannelResult);
                }
                C965340bEC c965340bEC = this.LIZ;
                InterfaceC968120bIg interfaceC968120bIg = c965340bEC.LJI;
                if (interfaceC968120bIg != null) {
                    long j = c965340bEC.LJFF.LIZLLL;
                    C965340bEC c965340bEC2 = this.LIZ;
                    interfaceC968120bIg.LIZJ(new C965710bEn(j, c965340bEC2.LIZIZ, c965340bEC2.LIZLLL, null, false, false, 56));
                }
            }

            @Override // X.InterfaceC966890bGh
            public final void LIZIZ(LinkCoreError linkCoreError, Throwable th) {
                InterfaceC920680a4A<DestroyChannelResult> interfaceC920680a4A2 = interfaceC920680a4A;
                if (interfaceC920680a4A2 != null) {
                    interfaceC920680a4A2.LIZ(linkCoreError, th);
                }
            }
        };
        C965350bED c965350bED = c966020bFI.LJJ;
        String str = c966020bFI.LJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("destroyChannel");
        sbLIZ.append(" start cur channelId ");
        sbLIZ.append(c966020bFI.LIZLLL);
        sbLIZ.append(", state ");
        sbLIZ.append(c966020bFI.LJIIIIZZ);
        sbLIZ.append(" data=");
        sbLIZ.append(destroyChannelDataBuild);
        C1AZW.LIZIZ(c965350bED, str, C2188811AlT.LIZIZ(sbLIZ), null, null);
        C966920bGk c966920bGkLJ = c966020bFI.LJ();
        C2234021CcC c2234021CcC = new C2234021CcC(String.valueOf(destroyChannelDataBuild.finishReason), C1282000jSw.LIZ(destroyChannelDataBuild.finishReason), destroyChannelDataBuild.linkArchType);
        C966100bFQ c966100bFQ = new C966100bFQ(c966020bFI.LJ, "destroyChannel", interfaceC966890bGh, new C967530bHj());
        c966020bFI.LJIIJ(c966100bFQ, null);
        c966920bGkLJ.LJJJJI(c2234021CcC, new C966240bFe(c966100bFQ, null));
    }

    @Override // X.InterfaceC954180awC
    public final void LLJJJJ(EnumC965730bEp enumC965730bEp, InterfaceC969870bLV interfaceC969870bLV) {
        C1AXM c1axm;
        LiveStreamMixer liveStreamMixerLJLLJ;
        if (LLJLILLLLZIIL() instanceof C1AXM) {
            InterfaceC964790bDJ interfaceC964790bDJLLJLILLLLZIIL = LLJLILLLLZIIL();
            if ((interfaceC964790bDJLLJLILLLLZIIL instanceof C1AXM) && (c1axm = (C1AXM) interfaceC964790bDJLLJLILLLLZIIL) != null && (liveStreamMixerLJLLJ = c1axm.LJLLJ()) != null) {
                liveStreamMixerLJLLJ.setPlayerInfoProvider(interfaceC969870bLV);
                return;
            }
            return;
        }
        C2181391AYv c2181391AYv = this.LJIIZILJ;
        if (c2181391AYv == null) {
            return;
        }
        c2181391AYv.setPlayerInfoProviderWithArchType(enumC965730bEp.getLinkArchType(), interfaceC969870bLV);
    }

    @Override // X.InterfaceC954180awC
    public final void LLJJJJLIIL(C954800axC c954800axC, final C954550awn c954550awn) {
        List<InterfaceC965500bES> listLJLJL;
        C966020bFI c966020bFI = this.LJFF;
        InterfaceC966890bGh<CancelApplyJoinGroupResult> interfaceC966890bGh = new InterfaceC966890bGh<CancelApplyJoinGroupResult>() { // from class: X.0bDq
            @Override // X.InterfaceC966890bGh
            public final void LIZ(CancelApplyJoinGroupResult cancelApplyJoinGroupResult) {
                InterfaceC920680a4A<CancelApplyJoinGroupResult> interfaceC920680a4A = c954550awn;
                if (interfaceC920680a4A != null) {
                    interfaceC920680a4A.onSuccess(cancelApplyJoinGroupResult);
                }
            }

            @Override // X.InterfaceC966890bGh
            public final void LIZIZ(LinkCoreError linkCoreError, Throwable th) {
                InterfaceC920680a4A<CancelApplyJoinGroupResult> interfaceC920680a4A = c954550awn;
                if (interfaceC920680a4A != null) {
                    interfaceC920680a4A.LIZ(linkCoreError, th);
                }
            }
        };
        C965350bED c965350bED = c966020bFI.LJJ;
        String str = c966020bFI.LJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("cancel apply group");
        sbLIZ.append(" start data=");
        sbLIZ.append(c954800axC);
        C1AZW.LIZIZ(c965350bED, str, C2188811AlT.LIZIZ(sbLIZ), null, null);
        InterfaceC965990bFF interfaceC965990bFF = c966020bFI.LJIIZILJ;
        if (interfaceC965990bFF != null && (listLJLJL = interfaceC965990bFF.LJLJL()) != null) {
            for (InterfaceC965500bES interfaceC965500bES : listLJLJL) {
                if (interfaceC965500bES != null) {
                    interfaceC965500bES.LJJIFFI(c954800axC);
                }
            }
        }
        C966920bGk c966920bGkLJ = c966020bFI.LJ();
        C969440bKo c969440bKo = new C969440bKo(C966020bFI.LJIIIZ(c966020bFI, c954800axC.LIZ, c954800axC.LIZIZ, c954800axC.LIZJ, null, 56), c954800axC.LIZLLL, c954800axC.LJ);
        C966100bFQ c966100bFQ = new C966100bFQ(c966020bFI.LJ, "cancel apply group", interfaceC966890bGh, new C965600bEc(c966020bFI, c954800axC));
        c966100bFQ.LLILZ = new C965550bEX(c966020bFI, c954800axC);
        c966020bFI.LJIIJ(c966100bFQ, null);
        c966920bGkLJ.LJJJJLL(c969440bKo, new C966240bFe(c966100bFQ, null));
    }

    public final LinkUser LLJZ(Player player, String str) {
        Long lValueOf;
        LinkUser.Builder builder = new LinkUser.Builder();
        Long lValueOf2 = null;
        if (player != null) {
            lValueOf = Long.valueOf(player.roomId);
        } else {
            lValueOf = null;
        }
        builder.setRoomId(lValueOf);
        if (player != null) {
            lValueOf2 = Long.valueOf(player.uid);
        }
        builder.setUserId(lValueOf2);
        builder.setLinkMicId(str);
        builder.setChannelId(Long.valueOf(this.LJFF.LIZLLL));
        return builder.build();
    }

    public final void LLJZIJLIL(PermitApplyData permitApplyData, boolean z) {
        LayoutDSLConfig layoutDSLConfig = permitApplyData.layoutDSLConfig;
        if (layoutDSLConfig != null && permitApplyData.permitStatus == 1) {
            if (z) {
                InterfaceC964840bDO interfaceC964840bDOLJLIIL = LLJLILLLLZIIL().LJLIIL();
                if (interfaceC964840bDOLJLIIL != null) {
                    LiveRoomUser liveRoomUser = permitApplyData.applicant;
                    interfaceC964840bDOLJLIIL.LIZLLL(layoutDSLConfig, liveRoomUser.userId, liveRoomUser.linkMicId);
                }
            } else {
                InterfaceC964840bDO interfaceC964840bDOLJLIIL2 = LLJLILLLLZIIL().LJLIIL();
                if (interfaceC964840bDOLJLIIL2 != null) {
                    interfaceC964840bDOLJLIIL2.LJIIJ(layoutDSLConfig);
                }
            }
        }
        if (permitApplyData.permitStatus == 1) {
            C967770bI7 c967770bI7 = this.LJFF.LJJIFFI;
            LinkUser.Builder builder = new LinkUser.Builder();
            builder.setUserId(Long.valueOf(permitApplyData.applicant.userId));
            builder.setLinkMicId(permitApplyData.applicant.linkMicId);
            c967770bI7.LJIIIIZZ(builder.build());
        }
    }

    @Override // X.InterfaceC954180awC
    public final void muteRemoteAudioStream(String str, boolean z) {
        C966020bFI c966020bFI = this.LJFF;
        c966020bFI.LJJIFFI.LJFF(str, z);
        c966020bFI.LJ().muteRemoteAudioStream(str, z);
    }

    @Override // X.InterfaceC954180awC
    public final void sendUserMessage(String str, String str2) {
        InterfaceC1276380jJs interfaceC1276380jJs;
        C1276910jKj c1276910jKj = this.LJFF.LJJI.LIZIZ;
        if (c1276910jKj != null && (interfaceC1276380jJs = c1276910jKj.LLJJJJ) != null) {
            interfaceC1276380jJs.sendUserMessage(str, str2);
        }
    }

    @Override // X.InterfaceC954180awC
    public final void LJIJ(int i, String str, String str2) {
        this.LJFF.LJ().LJIJ(i, str, str2);
    }

    @Override // X.InterfaceC954180awC
    public final void LJJIIZI(String str, Map<String, String> map, boolean z) {
        if (LLJLILLLLZIIL() instanceof C1AXM) {
            LLJLILLLLZIIL().LJJIIZI(str, map, z);
            return;
        }
        C2181391AYv c2181391AYv = this.LJIIZILJ;
        if (c2181391AYv == null || !LivesdkLinkmicSeiEnabledBusinessIdSetting.INSTANCE.isEnable(str)) {
            return;
        }
        synchronized (c2181391AYv.LJIIJJI()) {
            try {
                c2181391AYv.LJIIJJI().put(str, map);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (!z) {
            return;
        }
        c2181391AYv.LJIILIIL("postPermanentMixStreamData");
    }

    @Override // X.InterfaceC954180awC
    public final void LJJJJI(String str, boolean z, List list) {
        if (z) {
            LJIJJLI(list);
            LLJLILLLLZIIL().LJJJJIZL(str, false, false, true, false, new C916150Zwr());
        } else {
            LLJLILLLLZIIL().LJLLI(str, list);
        }
    }

    @Override // X.InterfaceC922560a7C
    public final void LJJL(Boolean bool, String str, String str2) {
        C965350bED c965350bED = this.LJJII;
        String str3 = this.LJIIIIZZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("monitorVideoApiCall apiName:");
        sbLIZ.append("LiveStream.switchVideoCapture");
        sbLIZ.append(" source:");
        sbLIZ.append(str);
        sbLIZ.append(" mute:");
        sbLIZ.append(bool);
        sbLIZ.append(" extMsg:");
        sbLIZ.append(str2);
        C1AZW.LIZIZ(c965350bED, str3, C2188811AlT.LIZIZ(sbLIZ), null, null);
    }

    @Override // X.InterfaceC922560a7C
    public final void LJLJJL(int i, int i2, int i3) {
        C965350bED c965350bED = this.LJJII;
        String str = this.LJIIIIZZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("monitorVideoCaptureCallback captureStatus:");
        sbLIZ.append(i);
        sbLIZ.append(" captureDevices:");
        sbLIZ.append(i2);
        sbLIZ.append(" captureFps:");
        sbLIZ.append(i3);
        C1AZW.LIZIZ(c965350bED, str, C2188811AlT.LIZIZ(sbLIZ), null, null);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.0bDv] */
    @Override // X.InterfaceC954180awC
    public final void LLILLIZIL(C963830bBl c963830bBl, final InterfaceC920680a4A<CreateChannelResult> interfaceC920680a4A, BizResumeParams bizResumeParams) {
        C966020bFI c966020bFI = this.LJFF;
        CreateChannelData.Builder builder = new CreateChannelData.Builder();
        builder.setMaxPosition(c963830bBl.LIZ);
        builder.setLayoutId(c963830bBl.LIZIZ);
        builder.setBizCreateChannelParams(c963830bBl.LIZJ);
        builder.setLiveRoomMode(c963830bBl.LIZLLL);
        builder.setLinkArchType(c963830bBl.LJ.getLinkArchType());
        CreateChannelData createChannelDataBuild = builder.build();
        ?? r2 = new InterfaceC966890bGh<CreateChannelResult>() { // from class: X.0bDv
            @Override // X.InterfaceC966890bGh
            public final void LIZ(CreateChannelResult createChannelResult) {
                InterfaceC964790bDJ interfaceC964790bDJLLJLILLLLZIIL = this.LIZ.LLJLILLLLZIIL();
                C965340bEC c965340bEC = this.LIZ;
                LinkUser.Builder builder2 = new LinkUser.Builder();
                builder2.setRoomId(Long.valueOf(c965340bEC.LIZLLL.getId()));
                builder2.setUserId(Long.valueOf(c965340bEC.LIZLLL.getOwnerUserId()));
                builder2.setLinkMicId(c965340bEC.LJFF.LJFF().linkMicId);
                builder2.setChannelId(Long.valueOf(c965340bEC.LJFF.LIZLLL));
                interfaceC964790bDJLLJLILLLLZIIL.LJLLILLLL(builder2.build(), null, null, true);
                InterfaceC920680a4A<CreateChannelResult> interfaceC920680a4A2 = interfaceC920680a4A;
                if (interfaceC920680a4A2 != null) {
                    interfaceC920680a4A2.onSuccess(createChannelResult);
                }
            }

            @Override // X.InterfaceC966890bGh
            public final void LIZIZ(LinkCoreError linkCoreError, Throwable th) {
                InterfaceC920680a4A<CreateChannelResult> interfaceC920680a4A2 = interfaceC920680a4A;
                if (interfaceC920680a4A2 != null) {
                    interfaceC920680a4A2.LIZ(linkCoreError, th);
                }
            }
        };
        C965350bED c965350bED = c966020bFI.LJJ;
        String str = c966020bFI.LJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("createChannel start create channel currentChannelId=");
        sbLIZ.append(c966020bFI.LIZLLL);
        sbLIZ.append(", state=");
        sbLIZ.append(c966020bFI.LJIIIIZZ);
        sbLIZ.append(", data=");
        sbLIZ.append(createChannelDataBuild);
        sbLIZ.append(", scene=");
        sbLIZ.append(c966020bFI.LIZJ);
        C1AZW.LIZIZ(c965350bED, str, C2188811AlT.LIZIZ(sbLIZ), null, null);
        C966270bFh c966270bFh = new C966270bFh(c966020bFI, createChannelDataBuild, r2, bizResumeParams);
        C969310bKb c969310bKb = C969310bKb.LIZLLL;
        if (Intrinsics.LJFF(c969310bKb.LIZIZ, Looper.myLooper())) {
            c966270bFh.invoke();
        } else {
            c969310bKb.LIZ(new RunnableC966320bFm(c966270bFh));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLL(X.C945320ahu r9, com.bytedance.android.livesdk.sei.SeiAppData r10, boolean r11) {
        /*
            Method dump skipped, instruction units count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C965340bEC.LLL(X.0ahu, com.bytedance.android.livesdk.sei.SeiAppData, boolean):void");
    }

    @Override // X.InterfaceC922560a7C
    public final void LLIZLLLIL(Boolean bool, String str, String str2, String str3) {
        C965350bED c965350bED = this.LJJII;
        String str4 = this.LJIIIIZZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("monitorAudioApiCall apiName:");
        sbLIZ.append(str);
        sbLIZ.append(" source:");
        sbLIZ.append(str2);
        sbLIZ.append(" mute:");
        sbLIZ.append(bool);
        sbLIZ.append(" extMsg:");
        sbLIZ.append(str3);
        C1AZW.LIZIZ(c965350bED, str4, C2188811AlT.LIZIZ(sbLIZ), null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d5 A[PHI: r4
      0x00d5: PHI (r4v7 java.lang.String) = (r4v4 java.lang.String), (r4v8 java.lang.String) binds: [B:16:0x0040, B:14:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.InterfaceC954180awC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <A, B> void LLJILJIL(int r46, A r47, X.C926820aE4<B> r48, java.util.Map<java.lang.String, ? extends java.lang.Object> r49) {
        /*
            Method dump skipped, instruction units count: 431
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C965340bEC.LLJILJIL(int, java.lang.Object, X.0aE4, java.util.Map):void");
    }

    @Override // X.InterfaceC954180awC
    public final void LJJLIIIJL(boolean z, ImageModel imageModel, String str, boolean z2, boolean z3) {
        AbstractC1273900jFs abstractC1273900jFs;
        C966020bFI c966020bFI = this.LJFF;
        c966020bFI.LJ().LJJJJJL(z, str);
        C1276910jKj c1276910jKj = c966020bFI.LJJI.LIZIZ;
        if (c1276910jKj != null) {
            if (z) {
                InterfaceC754220TiG interfaceC754220TiG = c1276910jKj.LLJJJIL;
                InterfaceC1273910jFt liveCore = null;
                if (interfaceC754220TiG != null) {
                    liveCore = interfaceC754220TiG.getLiveCore();
                }
                if ((liveCore instanceof AbstractC1273900jFs) && (abstractC1273900jFs = (AbstractC1273900jFs) liveCore) != null) {
                    c1276910jKj.LJJLJLI(abstractC1273900jFs);
                }
            } else {
                return;
            }
        } else if (!z) {
            return;
        }
        C1276840jKc.LIZ.getClass();
        C1276840jKc.LIZLLL(new ArrayList());
        C1276840jKc.LJ(new ArrayList());
        C1276840jKc.LJFF(new ArrayList());
        C1276840jKc.LJIIL("");
        C1276840jKc.LJIILL("");
        C1276840jKc.LJJIZ("");
        C1276840jKc.LJIILLIIL("");
        C1276840jKc.LJIIZILJ("");
        C1276840jKc.LIZIZ("");
        C1276840jKc.LIZJ("");
        C1276840jKc.LJJJLZIJ = 4;
    }

    public C965340bEC(Context context, int i, int i2, Room room, boolean z, long j, InterfaceC968120bIg interfaceC968120bIg, InterfaceC937900aVw interfaceC937900aVw) {
        String str;
        C2181391AYv c2181391AYv;
        C966020bFI c966020bFI = new C966020bFI(room, z, i, j);
        this.LIZ = context;
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = room;
        this.LJ = z;
        this.LJFF = c966020bFI;
        this.LJI = interfaceC968120bIg;
        this.LJII = interfaceC937900aVw;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        if (i == 0) {
            str = "Union";
        } else if (i == 4) {
            str = " Multi";
        } else {
            str = "Cross";
        }
        sbLIZ.append(str);
        sbLIZ.append("Session[");
        sbLIZ.append(hashCode() % 10000);
        sbLIZ.append(']');
        this.LJIIIIZZ = C2188811AlT.LIZIZ(sbLIZ);
        this.LJIILIIL = new C557050Lt1(false);
        this.LJIILJJIL = C452501pT.LIZIZ(new C966850bGd(this));
        this.LJIILL = C1303220k1A.LIZ.getValue();
        if (z) {
            c2181391AYv = new C2181391AYv(new C2181271AYj(i, room.getId(), true, room.getOwner().getId(), C354201Zc.LIZ(room.getStreamType()), true, new InterfaceC2181411AYx() { // from class: X.0bGm
                @Override // X.InterfaceC2181411AYx
                public final Map<String, OnLineMicInfo> LIZ() {
                    return this.LIZ.LLJLL().LIZ();
                }

                @Override // X.InterfaceC2181411AYx
                public final List<LinkUser> LIZLLL() {
                    return this.LIZ.LLJLL().LIZLLL();
                }

                @Override // X.InterfaceC2181411AYx
                public final void LJI() {
                    this.LIZ.LLJLL().LJI();
                }

                @Override // X.InterfaceC2181411AYx
                public final long LJIIJJI() {
                    return this.LIZ.LLJLL().LJIIJJI();
                }

                @Override // X.InterfaceC2181411AYx
                public final void LJIILIIL() {
                    this.LIZ.LLJLL().LJIILIIL();
                }

                @Override // X.InterfaceC2181411AYx
                public final List<C1276580jKC> LJIILL() {
                    return this.LIZ.LLJLL().LJIILL();
                }

                @Override // X.InterfaceC2181411AYx
                public final int LJJI() {
                    return this.LIZ.LJFF.LJIILL;
                }

                @Override // X.InterfaceC2181411AYx
                public final String LJJIIJ() {
                    return this.LIZ.LLJLL().LJJIIJ();
                }

                @Override // X.InterfaceC2181411AYx
                public final int LJJIIJZLJL() {
                    int i3 = this.LIZ.LJFF.LJIILL;
                    if (i3 != 1) {
                        return (i3 == 2 || i3 == 3) ? 2 : 0;
                    }
                    return 1;
                }

                @Override // X.InterfaceC2181411AYx
                public final boolean LJJIIZ() {
                    return C781520UlC.LJFF(this.LIZ.LIZLLL);
                }

                @Override // X.InterfaceC2181411AYx
                public final boolean LJJIJ() {
                    return this.LIZ.LIZIZ == 0;
                }

                @Override // X.InterfaceC2181411AYx
                public final Pair<Integer, Integer> LJJJJJ() {
                    return this.LIZ.LLJLL().LJJJJJ();
                }

                @Override // X.InterfaceC2181411AYx
                public final C949400aoU LJJJJJL() {
                    return this.LIZ.LJIIIZ;
                }

                @Override // X.InterfaceC2181411AYx
                public final String getChannelId() {
                    return this.LIZ.LLJLL().getChannelId();
                }

                @Override // X.InterfaceC2181411AYx
                public final String getGroupChannelId() {
                    return this.LIZ.LLJLL().getGroupChannelId();
                }

                @Override // X.InterfaceC2181411AYx
                public final void LIZJ(String str2) {
                    this.LIZ.LLJLL().LIZJ(str2);
                }

                @Override // X.InterfaceC2181411AYx
                public final void LJJ(Map<String, String> map) {
                    this.LIZ.LLJLL().LJJ(map);
                }

                @Override // X.InterfaceC2181411AYx
                public final LinkUser LJJIFFI(String str2) {
                    C968900bJw c968900bJwLLJLL = this.LIZ.LLJLL();
                    if (str2 == null) {
                        str2 = "";
                    }
                    return c968900bJwLLJLL.LJJIFFI(str2);
                }

                @Override // X.InterfaceC2181411AYx
                public final int LJJJJLI(String str2) {
                    return this.LIZ.LJFF.LJ().LLI(str2);
                }

                @Override // X.InterfaceC2181411AYx
                public final int LJJJJZ(String str2) {
                    return this.LIZ.LJFF.LJ().LJZ(str2);
                }

                @Override // X.InterfaceC2181411AYx
                public final void LJIILJJIL(String str2, C1276750jKT c1276750jKT) {
                    this.LIZ.LLJLL().LJIILJJIL(str2, c1276750jKT);
                }

                @Override // X.InterfaceC2181411AYx
                public final void LJJIII(String str2, List<? extends C1276580jKC> list) {
                    this.LIZ.LLJLL().LJJIII(str2, list);
                }

                @Override // X.InterfaceC2181411AYx
                public final C1AZI LJJJJLL(List<C2183391Acj> list, C1AZR c1azr) {
                    return this.LIZ.LLJLL().LIZ.LJ().LJLJLJ(list, c1azr);
                }

                @Override // X.InterfaceC2181411AYx
                public final JSONObject LJJJJL(C1275030jHh c1275030jHh, List list, Map map, String str2, InterfaceC969870bLV interfaceC969870bLV, Map map2, int i3) {
                    if (C354201Zc.LIZJ(this.LIZ.LIZLLL.getStreamType())) {
                        return C969340bKe.LIZLLL(c1275030jHh, list, map, null, "", str2, interfaceC969870bLV, map2, i3);
                    }
                    return null;
                }
            }));
        } else {
            c2181391AYv = null;
        }
        this.LJIIZILJ = c2181391AYv;
        this.LJIJ = C452501pT.LIZIZ(new C965250bE3(this));
        C964760bDG c964760bDG = new C964760bDG(i, room, z, this, c2181391AYv, new C965040bDi(this));
        this.LJIJI = c964760bDG;
        this.LJIJJ = C452501pT.LIZIZ(new C966580bGC(this));
        this.LJIJJLI = C452501pT.LIZIZ(new C965320bEA(this));
        this.LJIL = C452501pT.LIZIZ(new C968150bIj(this));
        this.LJJ = C452501pT.LIZIZ(new C966610bGF(this));
        this.LJJI = C452501pT.LIZIZ(new C964940bDY(this));
        this.LJJIFFI = new HashMap<>();
        C965350bED c965350bED = new C965350bED(this);
        this.LJJII = c965350bED;
        c966020bFI.LJJ = c965350bED;
        c966020bFI.LJIIZILJ = c964760bDG;
        c966020bFI.LJJIFFI.LJIJJLI.add(c964760bDG);
        c966020bFI.LJIIL = new C965650bEh(this);
        C965900bF6.LIZ(new C967620bHs(this));
        C1303200k18.LJ = room.getIdStr();
        C1303200k18.LJFF = C354201Zc.LIZ(room.getStreamType());
        C1303200k18.LJI = i;
    }
}
