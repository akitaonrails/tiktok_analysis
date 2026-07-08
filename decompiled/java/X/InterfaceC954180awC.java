package X;

import android.graphics.Rect;
import android.view.SurfaceView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ApplyResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.AsyncAuxStreamCreateTask;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CancelApplyResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CancelInviteResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ChangeMaxPositionResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CreateChannelResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.DestroyChannelResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.DirectJoinResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.InviteResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.KickOutAllResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.KickOutResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LeaveChannelResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.comp.api.linkcore.model.MicPositionContentInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.MixStreamWaterMarkTask;
import com.bytedance.android.livesdk.comp.api.linkcore.model.OnLineMicInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.PermitApplyGroupResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.PermitResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.RechargeResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ReplyInviteGroupResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ReplyResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.RtcUserInfo;
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
import webcast.data.multilive_biz.BizResumeParams;

/* JADX INFO: renamed from: X.0awC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public interface InterfaceC954180awC extends InterfaceC922560a7C {
    boolean A0();

    RtcUserInfo G0();

    void LIZ(InterfaceC964720bDC interfaceC964720bDC);

    int LIZIZ();

    void LIZJ(String str);

    List<LinkUser> LIZLLL();

    boolean LJ(String str);

    void LJFF(String str);

    boolean LJI(String str);

    List<LinkUser> LJII();

    void LJIIIIZZ(List<? extends LyraxTranscoderFeature> list);

    void LJIIIZ(int i, String str);

    Rect LJIIJ(String str);

    List<PosIdentity> LJIIJJI();

    void LJIIL(int i);

    boolean LJIILIIL();

    List<String> LJIILJJIL();

    void LJIILL(String str);

    void LJIILLIIL(String str);

    void LJIIZILJ(Map<String, MicPositionContentInfo> map);

    void LJIJ(int i, String str, String str2);

    void LJIJI(String str, Map<String, ? extends JSONObject> map);

    void LJIJJ(String str, C01IM c01im);

    void LJIJJLI(List<PosIdentity> list);

    List<LinkUser> LJIL();

    void LJJ(Map<String, Object> map, boolean z);

    void LJJI(String str, boolean z);

    void LJJIFFI(boolean z);

    boolean LJJII();

    void LJJIII();

    C914780Zue LJJIIJ();

    EnumC467700IVs LJJIIJZLJL();

    void LJJIIZ(String str, boolean z);

    void LJJIIZI(String str, Map<String, String> map, boolean z);

    C1275750jIr LJJIJ(C01IN c01in);

    List<LinkUser> LJJIJIIJI();

    Pair<Integer, Rect> LJJIJIIJIL(String str);

    void LJJIJIL(String str, SurfaceView surfaceView);

    void LJJIJL(long j, boolean z);

    List<LinkUser> LJJIJLIJ();

    void LJJIL(Map map, Map map2);

    void LJJIZ(String str);

    void LJJJ();

    List<LinkUser> LJJJI();

    void LJJJIL(long j, boolean z);

    List<LinkUser> LJJJJ();

    void LJJJJI(String str, boolean z, List list);

    void LJJJJIZL(C920430a3l c920430a3l, InterfaceC920680a4A<CancelApplyResult> interfaceC920680a4A);

    C949400aoU LJJJJJ();

    HashSet<String> LJJJJJL(String str);

    void LJJJJL(C954610awt c954610awt, InterfaceC920680a4A<PermitApplyGroupResult> interfaceC920680a4A);

    void LJJJJLI(C949840apC c949840apC, InterfaceC920680a4A<ApplyResult> interfaceC920680a4A);

    void LJJJJLL(C920400a3i c920400a3i, InterfaceC920680a4A<CancelInviteResult> interfaceC920680a4A);

    void LJJJJZ(C920410a3j c920410a3j, InterfaceC920680a4A<PermitResult> interfaceC920680a4A);

    void LJJJJZI(String str, boolean z);

    EnumC952680atm LJJJLIIL();

    void LJJJLL(InterfaceC920680a4A<RechargeResult> interfaceC920680a4A);

    void LJJJLZIJ(String str, Map<String, MicPositionContentInfo> map);

    void LJJJZ(C920410a3j c920410a3j, C919480a2E c919480a2E);

    boolean LJJLI();

    String LJJLIIIIJ();

    void LJJLIIIJ(C945320ahu c945320ahu, InterfaceC940430aa1 interfaceC940430aa1);

    void LJJLIIIJILLIZJL(C923520a8k c923520a8k, InterfaceC920680a4A<LeaveChannelResult> interfaceC920680a4A);

    void LJJLIIIJJI(EnumC952680atm enumC952680atm, String str);

    void LJJLIIIJJIZ(long j, String str);

    void LJJLIIIJL(boolean z, ImageModel imageModel, String str, boolean z2, boolean z3);

    int LJJLIIIJLJLI();

    InterfaceC947140akq LJJLIIIJLLLLLLLZ();

    boolean LJJLIIJ();

    boolean LJJLIL(String str);

    void LJJLJ();

    LinkUser LJJLJLI(String str);

    void LJJLL(C954670awz c954670awz, C954530awl c954530awl);

    void LJJZ(InterfaceC969870bLV interfaceC969870bLV);

    void LJJZZI(String str, C01IL c01il);

    void LJJZZIII(InterfaceC964770bDH interfaceC964770bDH);

    OnLineMicInfo LJL(String str);

    boolean LJLIIIL();

    int LJLIIL(String str);

    void LJLIL(Function0<Unit> function0);

    void LJLILLLLZI(C963530bBH c963530bBH);

    void LJLJI(String str, EnumC965730bEp enumC965730bEp);

    void LJLJJI(C949850apD c949850apD, InterfaceC920680a4A<InviteResult> interfaceC920680a4A);

    @InterfaceC1294060jmO
    void LJLJJLL();

    void LJLJL(C945380ai0 c945380ai0);

    boolean LJLJLJ();

    void LJLJLLL(C949850apD c949850apD, InterfaceC920680a4A<InviteResult> interfaceC920680a4A);

    void LJLL(C954730ax5 c954730ax5, C987180bnQ c987180bnQ);

    void LJLLI(boolean z);

    boolean LJLLILLLL();

    void LJLLL(C926250aD9 c926250aD9, InterfaceC920680a4A<DirectJoinResult> interfaceC920680a4A);

    void LJLZ(AwS559S0100000_15 awS559S0100000_15);

    List<String> LJZ();

    String LJZI();

    void LJZL(C920420a3k c920420a3k, C919260a1s c919260a1s);

    void LL(C920400a3i c920400a3i, C918500a0e c918500a0e);

    LinkUser LLD(long j);

    void LLF(C954620awu c954620awu, InterfaceC920680a4A<ReplyInviteGroupResult> interfaceC920680a4A);

    void LLFF(C920450a3n c920450a3n, InterfaceC920680a4A<ChangeMaxPositionResult> interfaceC920680a4A);

    void LLFFF(C963530bBH c963530bBH);

    void LLFII(C950850aqp c950850aqp, InterfaceC920680a4A<ReplyResult> interfaceC920680a4A);

    void LLFZ(boolean z);

    void LLI(AsyncAuxStreamCreateTask asyncAuxStreamCreateTask);

    void LLIFFJFJJ(InterfaceC964770bDH interfaceC964770bDH);

    OnLineMicInfo LLII(String str);

    void LLIIII(InterfaceC1303110k0z interfaceC1303110k0z);

    void LLIIIILZ(String str);

    void LLIIIJ(long j);

    void LLIIIL(C920420a3k c920420a3k, InterfaceC920680a4A<KickOutResult> interfaceC920680a4A);

    Set<Long> LLIIIZ();

    Set<Long> LLIIJI();

    InterfaceC937900aVw LLIIJLIL();

    void LLIIL(Cert cert, String str);

    void LLIILII(Function0<Unit> function0);

    void LLIILZL(int i);

    void LLIIZ(C954590awr c954590awr, C954480awg c954480awg);

    void LLILII(InterfaceC964720bDC interfaceC964720bDC);

    void LLILIL(Boolean bool, String str);

    boolean LLILL();

    void LLILLIZIL(C963830bBl c963830bBl, InterfaceC920680a4A<CreateChannelResult> interfaceC920680a4A, BizResumeParams bizResumeParams);

    C0TCJ LLILLJJLI();

    void LLILLL(TTLHVideoContentReportConfig tTLHVideoContentReportConfig);

    void LLILZ(String str, boolean z);

    void LLILZIL(long j);

    C945380ai0 LLILZLL();

    void LLIZ(String str);

    void LLJ(Cert cert);

    void LLJI(C957690b1r c957690b1r, InterfaceC920680a4A<KickOutAllResult> interfaceC920680a4A);

    String LLJIJIL(int i);

    <A, B> void LLJILJIL(int i, A a, C926820aE4<B> c926820aE4, Map<String, ? extends Object> map);

    void LLJILJILJ(List<MixStreamWaterMarkTask> list, boolean z);

    @InterfaceC1294060jmO
    InterfaceC958070b2T LLJJ();

    void LLJJI();

    boolean LLJJIJIIJIL();

    void LLJJIJIL(C954600aws c954600aws, C954490awh c954490awh);

    void LLJJJ(C963720bBa c963720bBa, InterfaceC920680a4A<DestroyChannelResult> interfaceC920680a4A);

    InterfaceC955150axl LLJJJIL();

    void LLJJJJ(EnumC965730bEp enumC965730bEp, InterfaceC969870bLV interfaceC969870bLV);

    void LLJJJJJIL(C925560aC2 c925560aC2);

    void LLJJJJLIIL(C954800axC c954800axC, C954550awn c954550awn);

    @InterfaceC1294060jmO
    int LLJLLIL();

    String U3();

    boolean Z4();

    boolean ae();

    void b0(boolean z);

    boolean b9(C949400aoU c949400aoU);

    int getSessionVersion();

    boolean isLinked();

    void muteRemoteAudioStream(String str, boolean z);

    void pause();

    void resume();

    int scene();

    void sendRoomMessage(String str);

    void sendUserMessage(String str, String str2);

    int startAuxStream(String str);

    void stopAuxStream(String str);
}
