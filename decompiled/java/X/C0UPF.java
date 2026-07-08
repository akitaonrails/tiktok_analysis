package X;

import com.bytedance.android.live.liveinteract.multilive.model.PlaybookStartResponse;
import com.bytedance.android.livesdk.api.LivePlayBookApi;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.Map;
import kotlin.jvm.internal.AFwS245S0000000_12;
import kotlin.jvm.internal.AwS221S0300000_12;
import kotlin.jvm.internal.AwS378S0200000_12;
import kotlin.jvm.internal.AwS55S1000000_4;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.text.a0;
import tikcast.api.anchor.GetGoLIVEAnchorPlaybookEffectParams;
import tikcast.api.anchor.GetGoLIVEAnchorPlaybookReq;
import tikcast.api.anchor.GetGoLIVEAnchorPlaybookResp;
import webcast.data.multi_guest_play.Playbook;

/* JADX INFO: renamed from: X.0UPF, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UPF {
    public C099G LIZ;
    public String LIZIZ = "";
    public C768910UEf LIZJ;
    public C09AY LIZLLL;
    public C772900UTo LJ;
    public long LJFF;
    public long LJI;
    public long LJII;
    public long LJIIIIZZ;
    public long LJIIIZ;
    public long LJIIJ;
    public Playbook LJIIJJI;
    public C11NJ LJIIL;
    public boolean LJIILIIL;

    public final void LIZ() {
        C20441214yg.LIZIZ("PlayBookViewModel", "cancelRequest");
        C099G c099g = this.LIZ;
        if (c099g != null) {
            c099g.LIZIZ(null);
        }
        this.LIZ = null;
        C11NJ c11nj = this.LJIIL;
        if (c11nj != null) {
            c11nj.dispose();
        }
        this.LJIIL = null;
        this.LIZJ = null;
        this.LIZLLL = null;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [X.09AY, kotlin.jvm.functions.Function1] */
    public final void LJ(DataChannel dataChannel) {
        String strLJII;
        ?? r0;
        C23250099c.LIZIZ(C817503Hh.LL, C0PEM.LIZJ, null, new C760390TsD(this, dataChannel, null), 2);
        C0UTJ c0utjPl1 = C781270Ukn.LJIILJJIL().Pl1(dataChannel);
        if (c0utjPl1 == null || (strLJII = c0utjPl1.LJII()) == null) {
            strLJII = "";
        }
        if ((!a0.LJJJIL(strLJII)) && (r0 = this.LIZLLL) != 0) {
            r0.invoke(strLJII);
        }
        C0UTJ c0utjPl12 = C781270Ukn.LJIILJJIL().Pl1(dataChannel);
        if (c0utjPl12 != null) {
            c0utjPl12.LJIL(EnumC20429414wm.DETAIL, "fyp_go_live_button", null);
        }
        C766270U4b.LJ(2131851335, 1, C497740JfY.LJII());
    }

    public final C20382814pG LIZIZ(C0UP6 c0up6, DataChannel dataChannel) {
        String str;
        Playbook playbook = this.LJIIJJI;
        Map<String, String> map = c0up6.LIZLLL;
        C0UOI c0uoi = c0up6.LIZIZ;
        if (c0uoi == null || (str = c0uoi.LIZ) == null) {
            str = "";
        }
        return new C20382814pG(0L, 0L, false, false, false, "normal", null, playbook, false, 1, null, map, new AwS221S0300000_12(c0up6, this, dataChannel, 13), new AwS55S1000000_4(str, 3), new AwS591S0100000_12(this, 686), new AwS378S0200000_12(this, c0up6, 40), AFwS245S0000000_12.get$arr$(107), new AwS591S0100000_12(this, 687), null, null, null, null, null, null, null, null, null, false, -1042337);
    }

    public final void LIZLLL(final DataChannel dataChannel, String str) {
        Long lValueOf;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("goLiveWithPlaybook, effectId: ");
        sbLIZ.append(str);
        C20441214yg.LIZIZ("PlayBookViewModel", C2188811AlT.LIZIZ(sbLIZ));
        C772900UTo c772900UTo = this.LJ;
        if (c772900UTo != null) {
            Playbook playbook = this.LJIIJJI;
            if (playbook != null) {
                lValueOf = Long.valueOf(playbook.playbookId);
            } else {
                lValueOf = null;
            }
            c772900UTo.LIZIZ(String.valueOf(lValueOf), "golive");
        }
        C0UTJ c0utjPl1 = C781270Ukn.LJIILJJIL().Pl1(dataChannel);
        if (c0utjPl1 != null) {
            c0utjPl1.LJJIII(new C20386714pt(this.LJIIJJI, null, "fyp_go_live_button", C20392214qm.LIZ(), "recommend", false, true, null, null, new InterfaceC170900l9<C470590Icr<PlaybookStartResponse.ResponseData>>() { // from class: X.0UPG
                @Override // X.InterfaceC170900l9
                public final void LIZ(C470590Icr<PlaybookStartResponse.ResponseData> c470590Icr) {
                    C20441214yg.LIZIZ("PlayBookViewModel", "start playbook onSucceeded");
                    this.LIZ.LJ(dataChannel);
                }

                @Override // X.InterfaceC170900l9
                public final void onFailed(Throwable th) {
                    String message;
                    C772900UTo c772900UTo2 = this.LIZ.LJ;
                    String message2 = null;
                    if (c772900UTo2 != null) {
                        if (th != null) {
                            message = th.getMessage();
                        } else {
                            message = null;
                        }
                        c772900UTo2.LIZJ("open", message);
                    }
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("start playbook fail, error_msg=");
                    if (th != null) {
                        message2 = th.getMessage();
                    }
                    sbLIZ2.append(message2);
                    C20441214yg.LIZIZ("PlayBookViewModel", C2188811AlT.LIZIZ(sbLIZ2));
                }
            }, 418));
        }
    }

    public final Object LIZJ(String str, String str2, String str3, InterfaceC1364105Vn<? super GetGoLIVEAnchorPlaybookResp.Data> interfaceC1364105Vn) {
        long jLongValue;
        C23260099m c23260099m = new C23260099m(C099M.LIZLLL(interfaceC1364105Vn));
        C01GW<C0UVW> c01gw = C0UVW.LIZIZ;
        C0UVW c0uvwLIZ = C01QD.LIZ();
        c0uvwLIZ.getClass();
        LivePlayBookApi livePlayBookApi = (LivePlayBookApi) c0uvwLIZ.LIZJ(LivePlayBookApi.class);
        GetGoLIVEAnchorPlaybookReq getGoLIVEAnchorPlaybookReq = new GetGoLIVEAnchorPlaybookReq();
        Long lLJIILIIL = C2095008Iq.LJIILIIL(str);
        long jLongValue2 = 0;
        if (lLJIILIIL != null) {
            jLongValue = lLJIILIIL.longValue();
        } else {
            jLongValue = 0;
        }
        getGoLIVEAnchorPlaybookReq.roomId = jLongValue;
        GetGoLIVEAnchorPlaybookEffectParams getGoLIVEAnchorPlaybookEffectParams = new GetGoLIVEAnchorPlaybookEffectParams();
        Long lLJIILIIL2 = C2095008Iq.LJIILIIL(this.LIZIZ);
        if (lLJIILIIL2 != null) {
            jLongValue2 = lLJIILIIL2.longValue();
        }
        getGoLIVEAnchorPlaybookEffectParams.effectSourceId = jLongValue2;
        getGoLIVEAnchorPlaybookReq.effectParams = getGoLIVEAnchorPlaybookEffectParams;
        getGoLIVEAnchorPlaybookReq.preGenerateTaskId = str2;
        getGoLIVEAnchorPlaybookReq.featureName = str3;
        livePlayBookApi.fetchPlayBookNew(getGoLIVEAnchorPlaybookReq).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LIZIZ(new C786350Usz(c23260099m, 0));
        Object objLIZ = c23260099m.LIZ();
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLIZ;
    }
}
