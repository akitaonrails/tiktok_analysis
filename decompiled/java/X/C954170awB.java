package X;

import android.graphics.Rect;
import android.view.SurfaceView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.liveinteract.multihost.biz.quickcohost.service.IQuickCoHostService;
import com.bytedance.android.live.liveinteract.multihost.core.adapter.IMultiHostCrossAdapter;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ApplyGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ApplyMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ApplyResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.AsyncAuxStreamCreateTask;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CancelApplyGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CancelApplyMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CancelApplyResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CancelInviteGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CancelInviteJoinGroupResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CancelInviteMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CancelInviteResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ChangeMaxPositionResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CreateChannelMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CreateChannelResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CustomLinkMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.DestroyChannelMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.DestroyChannelResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.DirectJoinMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.DirectJoinResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.GroupChangeMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.InteractAudioVolumeInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.InviteGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.InviteGroupResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.InviteMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.InviteResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.JoinRoomDirectMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.KickOutAllResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.KickOutMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.KickOutResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LeaveChannelResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LeaveGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LeaveMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkLayerRTCMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ListChangeMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.MicPositionContentInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.MixStreamWaterMarkTask;
import com.bytedance.android.livesdk.comp.api.linkcore.model.OnLineMicInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.P2PGroupChangeMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.PermitApplyGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.PermitApplyGroupResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.PermitApplyMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.PermitResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.RechargeResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ReplyInviteGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ReplyInviteGroupResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ReplyInviteMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ReplyResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.RtcStartResultMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.RtcUserInfo;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveDirectMatchSetting;
import com.bytedance.bpea.basics.Cert;
import com.ss.lyrax.transcoder.LyraxTranscoderFeature;
import com.ss.lyrax.video.TTLHVideoContentReportConfig;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS559S0100000_15;
import org.json.JSONObject;
import tikcast.linkmic.common.PosIdentity;
import webcast.data.multi_guest_social_data.Avatar;
import webcast.data.multilive_biz.BizResumeParams;

/* JADX INFO: renamed from: X.0awB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C954170awB implements InterfaceC954900axM, InterfaceC954180awC {
    public final InterfaceC954180awC LIZ;
    public final AbstractC957580b1g<C954600aws, InviteGroupResult> LIZIZ;
    public final AbstractC957580b1g<C954670awz, CancelInviteJoinGroupResult> LIZJ;
    public final AbstractC957580b1g<C954620awu, ReplyInviteGroupResult> LIZLLL;
    public final InterfaceC954210awF LJ;
    public final InterfaceC954190awD LJFF;
    public final InterfaceC954200awE LJI;
    public final long LJII;
    public final IQuickCoHostService LJIIIIZZ;
    public InterfaceC964770bDH LJIIIZ = C921730a5r.LL;

    @Override // X.InterfaceC954180awC
    public final boolean A0() {
        return this.LIZ.A0();
    }

    @Override // X.InterfaceC954180awC
    public final RtcUserInfo G0() {
        return this.LIZ.G0();
    }

    @Override // X.InterfaceC954180awC
    public final int LIZIZ() {
        return this.LIZ.LIZIZ();
    }

    @Override // X.InterfaceC954180awC
    public final void LIZJ(String str) {
        this.LIZ.LIZJ(str);
    }

    @Override // X.InterfaceC954180awC
    public final List<LinkUser> LIZLLL() {
        return this.LIZ.LIZLLL();
    }

    @Override // X.InterfaceC954180awC
    public final boolean LJ(String str) {
        return this.LIZ.LJ(str);
    }

    @Override // X.InterfaceC954180awC
    public final void LJFF(String str) {
        this.LIZ.LJFF(str);
    }

    @Override // X.InterfaceC954180awC
    public final boolean LJI(String str) {
        return this.LIZ.LJI(str);
    }

    @Override // X.InterfaceC954180awC
    public final List<LinkUser> LJII() {
        return this.LIZ.LJII();
    }

    @Override // X.InterfaceC954180awC
    public final void LJIIIIZZ(List<? extends LyraxTranscoderFeature> list) {
        this.LIZ.LJIIIIZZ(list);
    }

    @Override // X.InterfaceC954180awC
    public final void LJIIIZ(int i, String str) {
        this.LIZ.LJIIIZ(i, str);
    }

    @Override // X.InterfaceC954180awC
    public final Rect LJIIJ(String str) {
        return this.LIZ.LJIIJ(str);
    }

    @Override // X.InterfaceC954180awC
    public final List<PosIdentity> LJIIJJI() {
        return this.LIZ.LJIIJJI();
    }

    @Override // X.InterfaceC954180awC
    public final void LJIIL(int i) {
        this.LIZ.LJIIL(i);
    }

    @Override // X.InterfaceC954180awC
    public final boolean LJIILIIL() {
        return this.LIZ.LJIILIIL();
    }

    @Override // X.InterfaceC954180awC
    public final List<String> LJIILJJIL() {
        return this.LIZ.LJIILJJIL();
    }

    @Override // X.InterfaceC954180awC
    public final void LJIILL(String str) {
        this.LIZ.LJIILL(str);
    }

    @Override // X.InterfaceC954180awC
    public final void LJIILLIIL(String str) {
        this.LIZ.LJIILLIIL(str);
    }

    @Override // X.InterfaceC954180awC
    public final void LJIIZILJ(Map<String, MicPositionContentInfo> map) {
        this.LIZ.LJIIZILJ(map);
    }

    @Override // X.InterfaceC954180awC
    public final void LJIJ(int i, String str, String str2) {
        this.LIZ.LJIJ(i, str, str2);
    }

    @Override // X.InterfaceC954180awC
    public final void LJIJI(String str, Map<String, ? extends JSONObject> map) {
        this.LIZ.LJIJI(str, map);
    }

    @Override // X.InterfaceC954180awC
    public final void LJIJJ(String str, C01IM c01im) {
        this.LIZ.LJIJJ(str, c01im);
    }

    @Override // X.InterfaceC954180awC
    public final void LJIJJLI(List<PosIdentity> list) {
        this.LIZ.LJIJJLI(list);
    }

    @Override // X.InterfaceC954180awC
    public final List<LinkUser> LJIL() {
        return this.LIZ.LJIL();
    }

    @Override // X.InterfaceC954180awC
    public final void LJJ(Map<String, Object> map, boolean z) {
        this.LIZ.LJJ(map, z);
    }

    @Override // X.InterfaceC954180awC
    public final void LJJI(String str, boolean z) {
        this.LIZ.LJJI(str, z);
    }

    @Override // X.InterfaceC954180awC
    public final void LJJIFFI(boolean z) {
        this.LIZ.LJJIFFI(z);
    }

    @Override // X.InterfaceC954180awC
    public final boolean LJJII() {
        return this.LIZ.LJJII();
    }

    @Override // X.InterfaceC954180awC
    public final void LJJIII() {
        this.LIZ.LJJIII();
    }

    @Override // X.InterfaceC954180awC
    public final C914780Zue LJJIIJ() {
        return this.LIZ.LJJIIJ();
    }

    @Override // X.InterfaceC954180awC
    public final EnumC467700IVs LJJIIJZLJL() {
        return this.LIZ.LJJIIJZLJL();
    }

    @Override // X.InterfaceC954180awC
    public final void LJJIIZ(String str, boolean z) {
        this.LIZ.LJJIIZ(str, z);
    }

    @Override // X.InterfaceC954180awC
    public final void LJJIIZI(String str, Map<String, String> map, boolean z) {
        this.LIZ.LJJIIZI(str, map, z);
    }

    @Override // X.InterfaceC954180awC
    public final C1275750jIr LJJIJ(C01IN c01in) {
        return this.LIZ.LJJIJ(c01in);
    }

    @Override // X.InterfaceC954180awC
    public final List<LinkUser> LJJIJIIJI() {
        return this.LIZ.LJJIJIIJI();
    }

    @Override // X.InterfaceC954180awC
    public final Pair<Integer, Rect> LJJIJIIJIL(String str) {
        return this.LIZ.LJJIJIIJIL(str);
    }

    @Override // X.InterfaceC954180awC
    public final void LJJIJIL(String str, SurfaceView surfaceView) {
        this.LIZ.LJJIJIL(str, surfaceView);
    }

    @Override // X.InterfaceC954180awC
    public final void LJJIJL(long j, boolean z) {
        this.LIZ.LJJIJL(j, z);
    }

    @Override // X.InterfaceC954180awC
    public final List<LinkUser> LJJIJLIJ() {
        return this.LIZ.LJJIJLIJ();
    }

    @Override // X.InterfaceC954180awC
    public final void LJJIL(Map map, Map map2) {
        this.LIZ.LJJIL(map, map2);
    }

    @Override // X.InterfaceC954180awC
    public final void LJJIZ(String str) {
        this.LIZ.LJJIZ(str);
    }

    @Override // X.InterfaceC954180awC
    public final void LJJJ() {
        this.LIZ.LJJJ();
    }

    @Override // X.InterfaceC954180awC
    public final List<LinkUser> LJJJI() {
        return this.LIZ.LJJJI();
    }

    @Override // X.InterfaceC954180awC
    public final void LJJJIL(long j, boolean z) {
        this.LIZ.LJJJIL(j, z);
    }

    @Override // X.InterfaceC954180awC
    public final List<LinkUser> LJJJJ() {
        return this.LIZ.LJJJJ();
    }

    @Override // X.InterfaceC954180awC
    public final void LJJJJI(String str, boolean z, List list) {
        this.LIZ.LJJJJI(str, z, list);
    }

    @Override // X.InterfaceC954180awC
    public final void LJJJJIZL(C920430a3l c920430a3l, InterfaceC920680a4A<CancelApplyResult> interfaceC920680a4A) {
        this.LIZ.LJJJJIZL(c920430a3l, interfaceC920680a4A);
    }

    @Override // X.InterfaceC954180awC
    public final C949400aoU LJJJJJ() {
        return this.LIZ.LJJJJJ();
    }

    @Override // X.InterfaceC954180awC
    public final HashSet<String> LJJJJJL(String str) {
        return this.LIZ.LJJJJJL(str);
    }

    @Override // X.InterfaceC954180awC
    public final void LJJJJL(C954610awt c954610awt, InterfaceC920680a4A<PermitApplyGroupResult> interfaceC920680a4A) {
        this.LIZ.LJJJJL(c954610awt, interfaceC920680a4A);
    }

    @Override // X.InterfaceC954180awC
    public final void LJJJJLI(C949840apC c949840apC, InterfaceC920680a4A<ApplyResult> interfaceC920680a4A) {
        this.LIZ.LJJJJLI(c949840apC, interfaceC920680a4A);
    }

    @Override // X.InterfaceC954180awC
    public final void LJJJJLL(C920400a3i c920400a3i, InterfaceC920680a4A<CancelInviteResult> interfaceC920680a4A) {
        this.LIZ.LJJJJLL(c920400a3i, interfaceC920680a4A);
    }

    @Override // X.InterfaceC954180awC
    public final void LJJJJZ(C920410a3j c920410a3j, InterfaceC920680a4A<PermitResult> interfaceC920680a4A) {
        this.LIZ.LJJJJZ(c920410a3j, interfaceC920680a4A);
    }

    @Override // X.InterfaceC954180awC
    public final void LJJJJZI(String str, boolean z) {
        this.LIZ.LJJJJZI(str, z);
    }

    @Override // X.InterfaceC954180awC
    public final EnumC952680atm LJJJLIIL() {
        return this.LIZ.LJJJLIIL();
    }

    @Override // X.InterfaceC954180awC
    public final void LJJJLL(InterfaceC920680a4A<RechargeResult> interfaceC920680a4A) {
        this.LIZ.LJJJLL(interfaceC920680a4A);
    }

    @Override // X.InterfaceC954180awC
    public final void LJJJLZIJ(String str, Map<String, MicPositionContentInfo> map) {
        this.LIZ.LJJJLZIJ(str, map);
    }

    @Override // X.InterfaceC954180awC
    public final void LJJJZ(C920410a3j c920410a3j, C919480a2E c919480a2E) {
        this.LIZ.LJJJZ(c920410a3j, c919480a2E);
    }

    @Override // X.InterfaceC922560a7C
    public final void LJJL(Boolean bool, String str, String str2) {
        this.LIZ.LJJL(bool, str, str2);
    }

    @Override // X.InterfaceC954180awC
    public final boolean LJJLI() {
        return this.LIZ.LJJLI();
    }

    @Override // X.InterfaceC954180awC
    public final String LJJLIIIIJ() {
        return this.LIZ.LJJLIIIIJ();
    }

    @Override // X.InterfaceC954180awC
    public final void LJJLIIIJ(C945320ahu c945320ahu, InterfaceC940430aa1 interfaceC940430aa1) {
        this.LIZ.LJJLIIIJ(c945320ahu, interfaceC940430aa1);
    }

    @Override // X.InterfaceC954180awC
    public final void LJJLIIIJILLIZJL(C923520a8k c923520a8k, InterfaceC920680a4A<LeaveChannelResult> interfaceC920680a4A) {
        this.LIZ.LJJLIIIJILLIZJL(c923520a8k, interfaceC920680a4A);
    }

    @Override // X.InterfaceC954180awC
    public final void LJJLIIIJJI(EnumC952680atm enumC952680atm, String str) {
        this.LIZ.LJJLIIIJJI(enumC952680atm, str);
    }

    @Override // X.InterfaceC954180awC
    public final void LJJLIIIJJIZ(long j, String str) {
        this.LIZ.LJJLIIIJJIZ(j, str);
    }

    @Override // X.InterfaceC954180awC
    public final void LJJLIIIJL(boolean z, ImageModel imageModel, String str, boolean z2, boolean z3) {
        this.LIZ.LJJLIIIJL(z, imageModel, str, z2, z3);
    }

    @Override // X.InterfaceC954180awC
    public final int LJJLIIIJLJLI() {
        return this.LIZ.LJJLIIIJLJLI();
    }

    @Override // X.InterfaceC954180awC
    public final InterfaceC947140akq LJJLIIIJLLLLLLLZ() {
        return this.LIZ.LJJLIIIJLLLLLLLZ();
    }

    @Override // X.InterfaceC954180awC
    public final boolean LJJLIIJ() {
        return this.LIZ.LJJLIIJ();
    }

    @Override // X.InterfaceC954180awC
    public final boolean LJJLIL(String str) {
        return this.LIZ.LJJLIL(str);
    }

    @Override // X.InterfaceC954180awC
    public final void LJJLJ() {
        this.LIZ.LJJLJ();
    }

    @Override // X.InterfaceC954180awC
    public final LinkUser LJJLJLI(String str) {
        return this.LIZ.LJJLJLI(str);
    }

    @Override // X.InterfaceC954180awC
    public final void LJJLL(C954670awz c954670awz, C954530awl c954530awl) {
        this.LIZ.LJJLL(c954670awz, c954530awl);
    }

    @Override // X.InterfaceC954180awC
    public final void LJJZ(InterfaceC969870bLV interfaceC969870bLV) {
        this.LIZ.LJJZ(interfaceC969870bLV);
    }

    @Override // X.InterfaceC954180awC
    public final void LJJZZI(String str, C01IL c01il) {
        this.LIZ.LJJZZI(str, c01il);
    }

    @Override // X.InterfaceC954180awC
    public final OnLineMicInfo LJL(String str) {
        return this.LIZ.LJL(str);
    }

    @Override // X.InterfaceC954180awC
    public final boolean LJLIIIL() {
        return this.LIZ.LJLIIIL();
    }

    @Override // X.InterfaceC954180awC
    public final int LJLIIL(String str) {
        return this.LIZ.LJLIIL(str);
    }

    @Override // X.InterfaceC954180awC
    public final void LJLIL(Function0<Unit> function0) {
        this.LIZ.LJLIL(function0);
    }

    @Override // X.InterfaceC954180awC
    public final void LJLILLLLZI(C963530bBH c963530bBH) {
        this.LIZ.LJLILLLLZI(c963530bBH);
    }

    @Override // X.InterfaceC954180awC
    public final void LJLJI(String str, EnumC965730bEp enumC965730bEp) {
        this.LIZ.LJLJI(str, enumC965730bEp);
    }

    @Override // X.InterfaceC954180awC
    public final void LJLJJI(C949850apD c949850apD, InterfaceC920680a4A<InviteResult> interfaceC920680a4A) {
        this.LIZ.LJLJJI(c949850apD, interfaceC920680a4A);
    }

    @Override // X.InterfaceC922560a7C
    public final void LJLJJL(int i, int i2, int i3) {
        this.LIZ.LJLJJL(i, i2, i3);
    }

    @Override // X.InterfaceC954180awC
    @InterfaceC1294060jmO
    public final void LJLJJLL() {
        this.LIZ.LJLJJLL();
    }

    @Override // X.InterfaceC954180awC
    public final void LJLJL(C945380ai0 c945380ai0) {
        this.LIZ.LJLJL(c945380ai0);
    }

    @Override // X.InterfaceC954180awC
    public final boolean LJLJLJ() {
        return this.LIZ.LJLJLJ();
    }

    @Override // X.InterfaceC954180awC
    public final void LJLJLLL(C949850apD c949850apD, InterfaceC920680a4A<InviteResult> interfaceC920680a4A) {
        this.LIZ.LJLJLLL(c949850apD, interfaceC920680a4A);
    }

    @Override // X.InterfaceC954180awC
    public final void LJLL(C954730ax5 c954730ax5, C987180bnQ c987180bnQ) {
        this.LIZ.LJLL(c954730ax5, c987180bnQ);
    }

    @Override // X.InterfaceC954180awC
    public final void LJLLI(boolean z) {
        this.LIZ.LJLLI(z);
    }

    @Override // X.InterfaceC954180awC
    public final boolean LJLLILLLL() {
        return this.LIZ.LJLLILLLL();
    }

    @Override // X.InterfaceC954180awC
    public final void LJLLL(C926250aD9 c926250aD9, InterfaceC920680a4A<DirectJoinResult> interfaceC920680a4A) {
        this.LIZ.LJLLL(c926250aD9, interfaceC920680a4A);
    }

    @Override // X.InterfaceC954180awC
    public final void LJLZ(AwS559S0100000_15 awS559S0100000_15) {
        this.LIZ.LJLZ(awS559S0100000_15);
    }

    @Override // X.InterfaceC954180awC
    public final List<String> LJZ() {
        return this.LIZ.LJZ();
    }

    @Override // X.InterfaceC954180awC
    public final String LJZI() {
        return this.LIZ.LJZI();
    }

    @Override // X.InterfaceC954180awC
    public final void LJZL(C920420a3k c920420a3k, C919260a1s c919260a1s) {
        this.LIZ.LJZL(c920420a3k, c919260a1s);
    }

    @Override // X.InterfaceC954180awC
    public final void LL(C920400a3i c920400a3i, C918500a0e c918500a0e) {
        this.LIZ.LL(c920400a3i, c918500a0e);
    }

    @Override // X.InterfaceC954180awC
    public final LinkUser LLD(long j) {
        return this.LIZ.LLD(j);
    }

    @Override // X.InterfaceC954180awC
    public final void LLF(C954620awu c954620awu, InterfaceC920680a4A<ReplyInviteGroupResult> interfaceC920680a4A) {
        this.LIZ.LLF(c954620awu, interfaceC920680a4A);
    }

    @Override // X.InterfaceC954180awC
    public final void LLFF(C920450a3n c920450a3n, InterfaceC920680a4A<ChangeMaxPositionResult> interfaceC920680a4A) {
        this.LIZ.LLFF(c920450a3n, interfaceC920680a4A);
    }

    @Override // X.InterfaceC954180awC
    public final void LLFFF(C963530bBH c963530bBH) {
        this.LIZ.LLFFF(c963530bBH);
    }

    @Override // X.InterfaceC954180awC
    public final void LLFII(C950850aqp c950850aqp, InterfaceC920680a4A<ReplyResult> interfaceC920680a4A) {
        this.LIZ.LLFII(c950850aqp, interfaceC920680a4A);
    }

    @Override // X.InterfaceC954180awC
    public final void LLFZ(boolean z) {
        this.LIZ.LLFZ(z);
    }

    @Override // X.InterfaceC954180awC
    public final void LLI(AsyncAuxStreamCreateTask asyncAuxStreamCreateTask) {
        this.LIZ.LLI(asyncAuxStreamCreateTask);
    }

    @Override // X.InterfaceC954180awC
    public final OnLineMicInfo LLII(String str) {
        return this.LIZ.LLII(str);
    }

    @Override // X.InterfaceC954180awC
    public final void LLIIII(InterfaceC1303110k0z interfaceC1303110k0z) {
        this.LIZ.LLIIII(interfaceC1303110k0z);
    }

    @Override // X.InterfaceC954180awC
    public final void LLIIIILZ(String str) {
        this.LIZ.LLIIIILZ(str);
    }

    @Override // X.InterfaceC954180awC
    public final void LLIIIJ(long j) {
        this.LIZ.LLIIIJ(j);
    }

    @Override // X.InterfaceC954180awC
    public final void LLIIIL(C920420a3k c920420a3k, InterfaceC920680a4A<KickOutResult> interfaceC920680a4A) {
        this.LIZ.LLIIIL(c920420a3k, interfaceC920680a4A);
    }

    @Override // X.InterfaceC954180awC
    public final Set<Long> LLIIIZ() {
        return this.LIZ.LLIIIZ();
    }

    @Override // X.InterfaceC954180awC
    public final Set<Long> LLIIJI() {
        return this.LIZ.LLIIJI();
    }

    @Override // X.InterfaceC954180awC
    public final InterfaceC937900aVw LLIIJLIL() {
        return this.LIZ.LLIIJLIL();
    }

    @Override // X.InterfaceC954180awC
    public final void LLIIL(Cert cert, String str) {
        this.LIZ.LLIIL(cert, str);
    }

    @Override // X.InterfaceC954180awC
    public final void LLIILII(Function0<Unit> function0) {
        this.LIZ.LLIILII(function0);
    }

    @Override // X.InterfaceC954180awC
    public final void LLIILZL(int i) {
        this.LIZ.LLIILZL(i);
    }

    @Override // X.InterfaceC954180awC
    public final void LLIIZ(C954590awr c954590awr, C954480awg c954480awg) {
        this.LIZ.LLIIZ(c954590awr, c954480awg);
    }

    @Override // X.InterfaceC954180awC
    public final void LLILIL(Boolean bool, String str) {
        this.LIZ.LLILIL(bool, str);
    }

    @Override // X.InterfaceC954180awC
    public final boolean LLILL() {
        return this.LIZ.LLILL();
    }

    @Override // X.InterfaceC954180awC
    public final void LLILLIZIL(C963830bBl c963830bBl, InterfaceC920680a4A<CreateChannelResult> interfaceC920680a4A, BizResumeParams bizResumeParams) {
        this.LIZ.LLILLIZIL(c963830bBl, interfaceC920680a4A, bizResumeParams);
    }

    @Override // X.InterfaceC954180awC
    public final C0TCJ LLILLJJLI() {
        return this.LIZ.LLILLJJLI();
    }

    @Override // X.InterfaceC954180awC
    public final void LLILLL(TTLHVideoContentReportConfig tTLHVideoContentReportConfig) {
        this.LIZ.LLILLL(tTLHVideoContentReportConfig);
    }

    @Override // X.InterfaceC954180awC
    public final void LLILZ(String str, boolean z) {
        this.LIZ.LLILZ(str, z);
    }

    @Override // X.InterfaceC954180awC
    public final void LLILZIL(long j) {
        this.LIZ.LLILZIL(j);
    }

    @Override // X.InterfaceC954180awC
    public final C945380ai0 LLILZLL() {
        return this.LIZ.LLILZLL();
    }

    @Override // X.InterfaceC954180awC
    public final void LLIZ(String str) {
        this.LIZ.LLIZ(str);
    }

    @Override // X.InterfaceC922560a7C
    public final void LLIZLLLIL(Boolean bool, String str, String str2, String str3) {
        this.LIZ.LLIZLLLIL(bool, str, str2, str3);
    }

    @Override // X.InterfaceC954180awC
    public final void LLJ(Cert cert) {
        this.LIZ.LLJ(cert);
    }

    @Override // X.InterfaceC954180awC
    public final void LLJI(C957690b1r c957690b1r, InterfaceC920680a4A<KickOutAllResult> interfaceC920680a4A) {
        this.LIZ.LLJI(c957690b1r, interfaceC920680a4A);
    }

    @Override // X.InterfaceC954180awC
    public final String LLJIJIL(int i) {
        return this.LIZ.LLJIJIL(i);
    }

    @Override // X.InterfaceC954180awC
    public final <A, B> void LLJILJIL(int i, A a, C926820aE4<B> c926820aE4, Map<String, ? extends Object> map) {
        this.LIZ.LLJILJIL(i, a, c926820aE4, map);
    }

    @Override // X.InterfaceC954180awC
    public final void LLJILJILJ(List<MixStreamWaterMarkTask> list, boolean z) {
        this.LIZ.LLJILJILJ(list, z);
    }

    @Override // X.InterfaceC954180awC
    @InterfaceC1294060jmO
    public final InterfaceC958070b2T LLJJ() {
        return this.LIZ.LLJJ();
    }

    @Override // X.InterfaceC954180awC
    public final void LLJJI() {
        this.LIZ.LLJJI();
    }

    @Override // X.InterfaceC954180awC
    public final boolean LLJJIJIIJIL() {
        return this.LIZ.LLJJIJIIJIL();
    }

    @Override // X.InterfaceC954180awC
    public final void LLJJIJIL(C954600aws c954600aws, C954490awh c954490awh) {
        this.LIZ.LLJJIJIL(c954600aws, c954490awh);
    }

    @Override // X.InterfaceC954180awC
    public final void LLJJJ(C963720bBa c963720bBa, InterfaceC920680a4A<DestroyChannelResult> interfaceC920680a4A) {
        this.LIZ.LLJJJ(c963720bBa, interfaceC920680a4A);
    }

    @Override // X.InterfaceC954180awC
    public final InterfaceC955150axl LLJJJIL() {
        return this.LIZ.LLJJJIL();
    }

    @Override // X.InterfaceC954180awC
    public final void LLJJJJ(EnumC965730bEp enumC965730bEp, InterfaceC969870bLV interfaceC969870bLV) {
        this.LIZ.LLJJJJ(enumC965730bEp, interfaceC969870bLV);
    }

    @Override // X.InterfaceC954180awC
    public final void LLJJJJJIL(C925560aC2 c925560aC2) {
        this.LIZ.LLJJJJJIL(c925560aC2);
    }

    @Override // X.InterfaceC954180awC
    public final void LLJJJJLIIL(C954800axC c954800axC, C954550awn c954550awn) {
        this.LIZ.LLJJJJLIIL(c954800axC, c954550awn);
    }

    @Override // X.InterfaceC954180awC
    @InterfaceC1294060jmO
    public final int LLJLLIL() {
        return this.LIZ.LLJLLIL();
    }

    @Override // X.InterfaceC954180awC
    public final String U3() {
        return this.LIZ.U3();
    }

    @Override // X.InterfaceC954180awC
    public final boolean Z4() {
        return this.LIZ.Z4();
    }

    @Override // X.InterfaceC954180awC
    public final boolean ae() {
        return this.LIZ.ae();
    }

    @Override // X.InterfaceC954180awC
    public final void b0(boolean z) {
        this.LIZ.b0(z);
    }

    @Override // X.InterfaceC954180awC
    public final boolean b9(C949400aoU c949400aoU) {
        return this.LIZ.b9(c949400aoU);
    }

    @Override // X.InterfaceC954180awC
    public final int getSessionVersion() {
        return this.LIZ.getSessionVersion();
    }

    @Override // X.InterfaceC954180awC
    public final boolean isLinked() {
        return this.LIZ.isLinked();
    }

    @Override // X.InterfaceC954180awC
    public final void muteRemoteAudioStream(String str, boolean z) {
        this.LIZ.muteRemoteAudioStream(str, z);
    }

    @Override // X.InterfaceC954180awC
    public final void pause() {
        this.LIZ.pause();
    }

    @Override // X.InterfaceC954180awC
    public final void resume() {
        this.LIZ.resume();
    }

    @Override // X.InterfaceC954180awC
    public final int scene() {
        return this.LIZ.scene();
    }

    @Override // X.InterfaceC954180awC
    public final void sendRoomMessage(String str) {
        this.LIZ.sendRoomMessage(str);
    }

    @Override // X.InterfaceC954180awC
    public final void sendUserMessage(String str, String str2) {
        this.LIZ.sendUserMessage(str, str2);
    }

    @Override // X.InterfaceC954180awC
    public final int startAuxStream(String str) {
        return this.LIZ.startAuxStream(str);
    }

    @Override // X.InterfaceC954180awC
    public final void stopAuxStream(String str) {
        this.LIZ.stopAuxStream(str);
    }

    @Override // X.InterfaceC954900axM
    public final InterfaceC954180awC LJLLLLLL() {
        return this.LIZ;
    }

    @Override // X.InterfaceC954180awC
    public final void LIZ(InterfaceC964720bDC interfaceC964720bDC) {
        if (interfaceC964720bDC instanceof IMultiHostCrossAdapter) {
            this.LJFF.LIZ(interfaceC964720bDC);
        }
        this.LIZ.LIZ(interfaceC964720bDC);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.0bDF, X.0bDH] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // X.InterfaceC954180awC
    public final void LJJZZIII(final InterfaceC964770bDH interfaceC964770bDH) {
        if (interfaceC964770bDH instanceof IMultiHostCrossAdapter) {
            final InterfaceC954180awC interfaceC954180awC = this.LIZ;
            final InterfaceC954190awD interfaceC954190awD = this.LJFF;
            final long j = this.LJII;
            final IQuickCoHostService iQuickCoHostService = this.LJIIIIZZ;
            ?? r1 = new InterfaceC964770bDH(interfaceC964770bDH, interfaceC954180awC, interfaceC954190awD, j, iQuickCoHostService) { // from class: X.0bDF
                public final InterfaceC964770bDH LL;
                public final InterfaceC954180awC LLILLJJLI;
                public final InterfaceC954190awD LLILLL;
                public final long LLILZ;
                public final IQuickCoHostService LLILZIL;

                @Override // X.InterfaceC964770bDH
                public final void LIZ(long j2, C1AZU c1azu) {
                    this.LL.LIZ(j2, c1azu);
                }

                @Override // X.InterfaceC964770bDH
                public final void LJFF(C954780axA c954780axA) {
                    this.LL.LJFF(c954780axA);
                }

                @Override // X.InterfaceC964770bDH
                public final void LJII(long j2, C1AZU c1azu, C969700bLE c969700bLE) {
                    this.LL.LJII(j2, c1azu, c969700bLE);
                }

                @Override // X.InterfaceC964770bDH
                public final void LJIIJ(String str, C1AZU c1azu, C2231141CUe c2231141CUe) {
                    this.LL.LJIIJ(str, c1azu, c2231141CUe);
                }

                @Override // X.InterfaceC964770bDH
                public final void LJIIJJI(String str, SurfaceView surfaceView) {
                    this.LL.LJIIJJI(str, surfaceView);
                }

                @Override // X.InterfaceC964770bDH
                public final void LJIIZILJ(String str, SurfaceView surfaceView) {
                    this.LL.LJIIZILJ(str, surfaceView);
                }

                @Override // X.InterfaceC964770bDH
                public final void LJIJJLI(String str, boolean z) {
                    this.LL.LJIJJLI(str, z);
                }

                @Override // X.InterfaceC964770bDH
                @InterfaceC1294060jmO
                public final void LJJ(Map<String, String> map) {
                    this.LL.LJJ(map);
                }

                @Override // X.InterfaceC964770bDH
                public final void LJJI(long j2, C1AZU c1azu) {
                    this.LL.LJJI(j2, c1azu);
                }

                @Override // X.InterfaceC964770bDH
                public final void LJJIFFI(int i, int i2, int i3) {
                    this.LL.LJJIFFI(i, i2, i3);
                }

                @Override // X.InterfaceC964770bDH
                @InterfaceC1294060jmO
                public final void LJJIIJ(List<LinkUser> list, List<LinkUser> list2) {
                    this.LL.LJJIIJ(list, list2);
                }

                @Override // X.InterfaceC964770bDH
                public final void LJJIIZI(String str, String str2) {
                    this.LL.LJJIIZI(str, str2);
                }

                @Override // X.InterfaceC964770bDH
                public final void LJJIJIIJIL(String str, boolean z) {
                    this.LL.LJJIJIIJIL(str, z);
                }

                @Override // X.InterfaceC964770bDH
                public final void LJJIL(String str, boolean z) {
                    this.LL.LJJIL(str, z);
                }

                @Override // X.InterfaceC964770bDH
                public final void LJJIZ(String str, long j2) {
                    this.LL.LJJIZ(str, j2);
                }

                @Override // X.InterfaceC964770bDH
                public final void LJJJ() {
                    this.LL.LJJJ();
                }

                @Override // X.InterfaceC964770bDH
                public final void LJJJJ() {
                    this.LL.LJJJJ();
                }

                @Override // X.InterfaceC964770bDH
                public final void LJJJJJ(String str, float f, float f2) {
                    this.LL.LJJJJJ(str, f, f2);
                }

                @Override // X.InterfaceC964770bDH
                public final void LJJJJJL(int i, C965030bDh c965030bDh) {
                    this.LL.LJJJJJL(i, c965030bDh);
                }

                @Override // X.InterfaceC964770bDH
                @InterfaceC1294060jmO
                public final void LJJJJZ(List<LinkUser> list, List<LinkUser> list2) {
                    this.LL.LJJJJZ(list, list2);
                }

                @Override // X.InterfaceC964770bDH
                public final void LJJJJZI(C954780axA c954780axA) {
                    this.LL.LJJJJZI(c954780axA);
                }

                @Override // X.InterfaceC964770bDH
                public final void LJJJLL(C954780axA c954780axA) {
                    this.LL.LJJJLL(c954780axA);
                }

                @Override // X.InterfaceC964770bDH
                public final void LJJJLZIJ(Map<String, MicPositionContentInfo> map) {
                    this.LL.LJJJLZIJ(map);
                }

                @Override // X.InterfaceC964770bDH
                public final void LJJJZ(int i, String str) {
                    this.LL.LJJJZ(i, str);
                }

                @Override // X.InterfaceC964770bDH
                public final void LJJLIIIJ() {
                    this.LL.LJJLIIIJ();
                }

                @Override // X.InterfaceC964770bDH
                public final void LJJLIIIJILLIZJL(Avatar avatar, String str) {
                    this.LL.LJJLIIIJILLIZJL(avatar, str);
                }

                @Override // X.InterfaceC964770bDH
                @InterfaceC1294060jmO
                public final void LJJLIIIJJIZ(String str) {
                    this.LL.LJJLIIIJJIZ(str);
                }

                @Override // X.InterfaceC964770bDH
                public final void LJJLIIIJLJLI() {
                    this.LL.LJJLIIIJLJLI();
                }

                @Override // X.InterfaceC964770bDH
                public final void LJJLIL() {
                    this.LL.LJJLIL();
                }

                @Override // X.InterfaceC964770bDH
                public final void LJJLJLI(C966020bFI c966020bFI, ListChangeMessage listChangeMessage) {
                    this.LL.LJJLJLI(c966020bFI, listChangeMessage);
                }

                @Override // X.InterfaceC964770bDH
                public final void LJJLL(int i, int i2) {
                    this.LL.LJJLL(i, i2);
                }

                @Override // X.InterfaceC964770bDH
                public final void LJJZZI(C965210bDz c965210bDz) {
                    this.LL.LJJZZI(c965210bDz);
                }

                @Override // X.InterfaceC964770bDH
                public final void LJL(InterfaceC954180awC interfaceC954180awC2, P2PGroupChangeMessage p2PGroupChangeMessage) {
                    this.LL.LJL(interfaceC954180awC2, p2PGroupChangeMessage);
                }

                @Override // X.InterfaceC964770bDH
                public final void LJLI(InterfaceC954180awC interfaceC954180awC2, ReplyInviteGroupMessage replyInviteGroupMessage) {
                    this.LL.LJLI(interfaceC954180awC2, replyInviteGroupMessage);
                }

                @Override // X.InterfaceC964770bDH
                public final void LJLIIIL(InterfaceC954180awC interfaceC954180awC2, InviteGroupMessage inviteGroupMessage) {
                    this.LL.LJLIIIL(interfaceC954180awC2, inviteGroupMessage);
                }

                @Override // X.InterfaceC964770bDH
                public final void LJLILLLLZI(InterfaceC954180awC interfaceC954180awC2, DestroyChannelMessage destroyChannelMessage, Integer num, Integer num2) {
                    this.LL.LJLILLLLZI(interfaceC954180awC2, destroyChannelMessage, num, num2);
                }

                @Override // X.InterfaceC964770bDH
                public final void LJLJI(InterfaceC954180awC interfaceC954180awC2, C949400aoU c949400aoU) {
                    this.LL.LJLJI(interfaceC954180awC2, c949400aoU);
                }

                @Override // X.InterfaceC964770bDH
                public final void LJLJJI(InterfaceC954180awC interfaceC954180awC2, boolean z, LinkCoreError linkCoreError) {
                    this.LL.LJLJJI(interfaceC954180awC2, z, linkCoreError);
                }

                @Override // X.InterfaceC964770bDH
                public final InterfaceC965500bES LJLJJLL(InterfaceC954180awC interfaceC954180awC2) {
                    return this.LL.LJLJJLL(interfaceC954180awC2);
                }

                @Override // X.InterfaceC964770bDH
                public final void LJLJL(InterfaceC954180awC interfaceC954180awC2, RtcStartResultMessage rtcStartResultMessage) {
                    this.LL.LJLJL(interfaceC954180awC2, rtcStartResultMessage);
                }

                @Override // X.InterfaceC964770bDH
                public final void LJLJLLL(int i, InterfaceC954180awC interfaceC954180awC2) {
                    this.LL.LJLJLLL(i, interfaceC954180awC2);
                }

                @Override // X.InterfaceC964770bDH
                public final void LJLL(InterfaceC954180awC interfaceC954180awC2, PermitApplyGroupMessage permitApplyGroupMessage) {
                    this.LL.LJLL(interfaceC954180awC2, permitApplyGroupMessage);
                }

                @Override // X.InterfaceC964770bDH
                public final void LJLLILLLL(InterfaceC954180awC interfaceC954180awC2) {
                    this.LL.LJLLILLLL(interfaceC954180awC2);
                }

                @Override // X.InterfaceC964770bDH
                public final void LJLLL(InterfaceC954180awC interfaceC954180awC2) {
                    this.LL.LJLLL(interfaceC954180awC2);
                }

                @Override // X.InterfaceC964770bDH
                public final void LJLLLL(InterfaceC954180awC interfaceC954180awC2, String str) {
                    this.LL.LJLLLL(interfaceC954180awC2, str);
                }

                @Override // X.InterfaceC964770bDH
                public final void LJLLLLLL(InterfaceC954180awC interfaceC954180awC2, ReplyInviteMessage replyInviteMessage) {
                    this.LL.LJLLLLLL(interfaceC954180awC2, replyInviteMessage);
                }

                @Override // X.InterfaceC964770bDH
                public final void LJZI(InterfaceC954180awC interfaceC954180awC2, JoinRoomDirectMessage joinRoomDirectMessage) {
                    this.LL.LJZI(interfaceC954180awC2, joinRoomDirectMessage);
                }

                @Override // X.InterfaceC964770bDH
                public final void LL(InterfaceC954180awC interfaceC954180awC2, LinkCoreError linkCoreError) {
                    this.LL.LL(interfaceC954180awC2, linkCoreError);
                }

                @Override // X.InterfaceC964770bDH
                public final void LLFZ(InterfaceC954180awC interfaceC954180awC2, LeaveGroupMessage leaveGroupMessage) {
                    this.LL.LLFZ(interfaceC954180awC2, leaveGroupMessage);
                }

                @Override // X.InterfaceC964770bDH
                public final void LLIIII(InterfaceC954180awC interfaceC954180awC2, GroupChangeMessage groupChangeMessage) {
                    this.LL.LLIIII(interfaceC954180awC2, groupChangeMessage);
                }

                @Override // X.InterfaceC964770bDH
                public final void LLIIIILZ(InterfaceC954180awC interfaceC954180awC2, String str) {
                    this.LL.LLIIIILZ(interfaceC954180awC2, str);
                }

                @Override // X.InterfaceC964770bDH
                public final void LLIIIJ(InterfaceC954180awC interfaceC954180awC2, ApplyMessage applyMessage) {
                    this.LL.LLIIIJ(interfaceC954180awC2, applyMessage);
                }

                @Override // X.InterfaceC964770bDH
                public final void LLIIIZ(InterfaceC954180awC interfaceC954180awC2, int i) {
                    this.LL.LLIIIZ(interfaceC954180awC2, i);
                }

                @Override // X.InterfaceC964770bDH
                public final void LLIIL(InterfaceC954180awC interfaceC954180awC2, DirectJoinMessage directJoinMessage) {
                    this.LL.LLIIL(interfaceC954180awC2, directJoinMessage);
                }

                @Override // X.InterfaceC964770bDH
                public final void LLIILZL() {
                    this.LL.LLIILZL();
                }

                @Override // X.InterfaceC964770bDH
                public final void LLIL(List<LinkUser> list) {
                    this.LL.LLIL(list);
                }

                @Override // X.InterfaceC964770bDH
                public final void LLILLIZIL(InterfaceC954180awC interfaceC954180awC2, CancelInviteGroupMessage cancelInviteGroupMessage) {
                    this.LL.LLILLIZIL(interfaceC954180awC2, cancelInviteGroupMessage);
                }

                @Override // X.InterfaceC964770bDH
                public final void LLILLJJLI(InterfaceC954180awC interfaceC954180awC2, InviteMessage inviteMessage) {
                    this.LL.LLILLJJLI(interfaceC954180awC2, inviteMessage);
                }

                @Override // X.InterfaceC964770bDH
                public final void LLIZLLLIL(InterfaceC954180awC interfaceC954180awC2, String str, String str2) {
                    this.LL.LLIZLLLIL(interfaceC954180awC2, str, str2);
                }

                @Override // X.InterfaceC964770bDH
                @InterfaceC1294060jmO
                public final void LLJI(String str, boolean z, boolean z2) {
                    this.LL.LLJI(str, z, z2);
                }

                @Override // X.InterfaceC964770bDH
                public final void LLJIJIL(InterfaceC954180awC interfaceC954180awC2, CancelApplyMessage cancelApplyMessage) {
                    this.LL.LLJIJIL(interfaceC954180awC2, cancelApplyMessage);
                }

                @Override // X.InterfaceC964770bDH
                public final void LLJJIJIIJIL(InterfaceC954180awC interfaceC954180awC2, KickOutMessage kickOutMessage) {
                    this.LL.LLJJIJIIJIL(interfaceC954180awC2, kickOutMessage);
                }

                @Override // X.InterfaceC964770bDH
                public final void LLJJJJ(InterfaceC954180awC interfaceC954180awC2, CreateChannelMessage createChannelMessage) {
                    this.LL.LLJJJJ(interfaceC954180awC2, createChannelMessage);
                }

                @Override // X.InterfaceC964770bDH
                public final void LLJJL(InterfaceC954180awC interfaceC954180awC2, InviteMessage inviteMessage) {
                    this.LL.LLJJL(interfaceC954180awC2, inviteMessage);
                }

                @Override // X.InterfaceC964770bDH
                public final void LLJLLIL(InterfaceC954180awC interfaceC954180awC2, int i, InterfaceC958070b2T interfaceC958070b2T, String str, CustomLinkMessage customLinkMessage) {
                    this.LL.LLJLLIL(interfaceC954180awC2, i, interfaceC958070b2T, str, customLinkMessage);
                }

                @Override // X.InterfaceC964770bDH
                public final void LLJZ(InterfaceC954180awC interfaceC954180awC2, int i, int i2) {
                    this.LL.LLJZ(interfaceC954180awC2, i, i2);
                }

                @Override // X.InterfaceC964770bDH
                public final void LLL(InterfaceC954180awC interfaceC954180awC2, int i, C967130bH5 c967130bH5, String str, CustomLinkMessage customLinkMessage) {
                    this.LL.LLL(interfaceC954180awC2, i, c967130bH5, str, customLinkMessage);
                }

                @Override // X.InterfaceC964770bDH
                public final void LLLFFI(InterfaceC954180awC interfaceC954180awC2, int i, InterfaceC958070b2T interfaceC958070b2T, String str, CustomLinkMessage customLinkMessage) {
                    this.LL.LLLFFI(interfaceC954180awC2, i, interfaceC958070b2T, str, customLinkMessage);
                }

                @Override // X.InterfaceC964770bDH
                public final void LLLII(InterfaceC954180awC interfaceC954180awC2, LinkUser linkUser, CustomLinkMessage customLinkMessage) {
                    this.LL.LLLII(interfaceC954180awC2, linkUser, customLinkMessage);
                }

                @Override // X.InterfaceC964770bDH
                public final void LLLIIII(long j2, InterfaceC954180awC interfaceC954180awC2) {
                    this.LL.LLLIIII(j2, interfaceC954180awC2);
                }

                @Override // X.InterfaceC964770bDH
                public final void LLLIILIL(InterfaceC954180awC interfaceC954180awC2, CancelApplyGroupMessage cancelApplyGroupMessage) {
                    this.LL.LLLIILIL(interfaceC954180awC2, cancelApplyGroupMessage);
                }

                @Override // X.InterfaceC964770bDH
                @InterfaceC1294060jmO
                public final void LLLIL(LinkLayerRTCMessage linkLayerRTCMessage) {
                    this.LL.LLLIL(linkLayerRTCMessage);
                }

                @Override // X.InterfaceC964770bDH
                public final void LLLILZJ(InterfaceC954180awC interfaceC954180awC2) {
                    this.LL.LLLILZJ(interfaceC954180awC2);
                }

                @Override // X.InterfaceC964770bDH
                public final void LLLL(InterfaceC954180awC interfaceC954180awC2, PermitApplyMessage permitApplyMessage) {
                    this.LL.LLLL(interfaceC954180awC2, permitApplyMessage);
                }

                @Override // X.InterfaceC964770bDH
                public final void LLLLLIL(InterfaceC954180awC interfaceC954180awC2, CancelInviteMessage cancelInviteMessage) {
                    this.LL.LLLLLIL(interfaceC954180awC2, cancelInviteMessage);
                }

                @Override // X.InterfaceC964770bDH
                public final void LLLLLLIL(InterfaceC954180awC interfaceC954180awC2, LeaveMessage leaveMessage) {
                    this.LL.LLLLLLIL(interfaceC954180awC2, leaveMessage);
                }

                @Override // X.InterfaceC964770bDH
                public final void LLLLLLJ(InterfaceC954180awC interfaceC954180awC2, PermitApplyMessage permitApplyMessage) {
                    this.LL.LLLLLLJ(interfaceC954180awC2, permitApplyMessage);
                }

                @Override // X.InterfaceC964770bDH
                public final void LLLLLLL(InterfaceC954180awC interfaceC954180awC2, ReplyInviteMessage replyInviteMessage) {
                    this.LL.LLLLLLL(interfaceC954180awC2, replyInviteMessage);
                }

                @Override // X.InterfaceC964770bDH
                public final void LLLLLLLLL(List<InteractAudioVolumeInfo> list) {
                    this.LL.LLLLLLLLL(list);
                }

                @Override // X.InterfaceC964770bDH
                public final void LLLLLLZZ(InterfaceC954180awC interfaceC954180awC2, ApplyGroupMessage applyGroupMessage) {
                    this.LL.LLLLLLZZ(interfaceC954180awC2, applyGroupMessage);
                }

                @Override // X.InterfaceC964770bDH
                public final void LLLLLZ(String str) {
                    this.LL.LLLLLZ(str);
                }

                /* JADX WARN: Removed duplicated region for block: B:106:0x027a  */
                /* JADX WARN: Removed duplicated region for block: B:112:0x028b  */
                /* JADX WARN: Removed duplicated region for block: B:113:0x0290  */
                /* JADX WARN: Removed duplicated region for block: B:114:0x0292  */
                /* JADX WARN: Removed duplicated region for block: B:83:0x01fb  */
                /* JADX WARN: Removed duplicated region for block: B:86:0x0218  */
                /* JADX WARN: Removed duplicated region for block: B:92:0x022c  */
                /* JADX WARN: Removed duplicated region for block: B:95:0x023d  */
                @Override // X.InterfaceC964770bDH
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void LJJJLIIL(com.bytedance.android.livesdk.comp.api.linkcore.model.JoinGroupDirectIMModel r18) {
                    /*
                        Method dump skipped, instruction units count: 791
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C964750bDF.LJJJLIIL(com.bytedance.android.livesdk.comp.api.linkcore.model.JoinGroupDirectIMModel):void");
                }

                @Override // X.InterfaceC964770bDH
                public final void LLLIIL(InterfaceC954180awC interfaceC954180awC2, String str, String str2) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onUserMsgReceived ");
                    sbLIZ.append(str2);
                    C20441214yg.LIZIZ("DecoratedLinkMicEventListener", C2188811AlT.LIZIZ(sbLIZ));
                }

                {
                    this.LL = interfaceC964770bDH;
                    this.LLILLJJLI = interfaceC954180awC;
                    this.LLILLL = interfaceC954190awD;
                    this.LLILZ = j;
                    this.LLILZIL = iQuickCoHostService;
                }
            };
            this.LJIIIZ = r1;
            this.LJ.LJ(r1);
            this.LIZ.LJJZZIII(this.LJIIIZ);
            return;
        }
        this.LIZ.LJJZZIII(interfaceC964770bDH);
    }

    @Override // X.InterfaceC954180awC
    public final void LLIFFJFJJ(InterfaceC964770bDH interfaceC964770bDH) {
        if (interfaceC964770bDH instanceof IMultiHostCrossAdapter) {
            this.LJ.LIZIZ();
            this.LIZ.LLIFFJFJJ(this.LJIIIZ);
            this.LJIIIZ = C921730a5r.LL;
            return;
        }
        this.LIZ.LLIFFJFJJ(interfaceC964770bDH);
    }

    @Override // X.InterfaceC954180awC
    public final void LLILII(InterfaceC964720bDC interfaceC964720bDC) {
        if (interfaceC964720bDC instanceof IMultiHostCrossAdapter) {
            this.LJFF.LJ();
        }
        this.LIZ.LLILII(interfaceC964720bDC);
    }

    @Override // X.InterfaceC954900axM
    public final void LJLLJ(C954620awu c954620awu, AbstractC915270ZvR abstractC915270ZvR, C954510awj c954510awj) {
        if (!this.LIZLLL.LIZ(c954620awu, abstractC915270ZvR, c954510awj)) {
            this.LIZ.LLF(c954620awu, c954510awj);
        } else {
            this.LJI.LIZ();
        }
    }

    @Override // X.InterfaceC954900axM
    public final void LLJILLL(C954600aws c954600aws, AbstractC915270ZvR abstractC915270ZvR, C954490awh c954490awh) {
        if (!this.LIZIZ.LIZ(c954600aws, abstractC915270ZvR, c954490awh)) {
            this.LIZ.LLJJIJIL(c954600aws, c954490awh);
        } else {
            this.LJI.LIZLLL();
            this.LJFF.LIZJ(EnumC964700bDA.INVITE, c954600aws.LIZIZ, LiveDirectMatchSetting.INSTANCE.getValue().inviterTimeout);
        }
    }

    @Override // X.InterfaceC954900axM
    public final void LLJJIII(AbstractC915270ZvR abstractC915270ZvR, C954530awl c954530awl, C954670awz c954670awz) {
        if (!this.LIZJ.LIZ(c954670awz, abstractC915270ZvR, c954530awl)) {
            this.LIZ.LJJLL(c954670awz, c954530awl);
            return;
        }
        InterfaceC954190awD interfaceC954190awD = this.LJFF;
        EnumC964700bDA enumC964700bDA = EnumC964700bDA.INVITE;
        interfaceC954190awD.LIZLLL(enumC964700bDA, c954670awz.LIZIZ);
        this.LJI.LIZJ(this.LJFF.LIZIZ(enumC964700bDA));
    }

    public C954170awB(InterfaceC954180awC interfaceC954180awC, C954340awS c954340awS, C957570b1f c957570b1f, C954330awR c954330awR, C954270awL c954270awL, C964640bD4 c964640bD4, C954270awL c954270awL2, long j, IQuickCoHostService iQuickCoHostService) {
        this.LIZ = interfaceC954180awC;
        this.LIZIZ = c954340awS;
        this.LIZJ = c957570b1f;
        this.LIZLLL = c954330awR;
        this.LJ = c954270awL;
        this.LJFF = c964640bD4;
        this.LJI = c954270awL2;
        this.LJII = j;
        this.LJIIIIZZ = iQuickCoHostService;
    }
}
