package X;

import Y.AfS151S0200000_15;
import Y.AfS184S0100000_15;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.liveinteract.api.event.ShowMatchPanelForQuickMatchEvent;
import com.bytedance.android.live.liveinteract.competition.event.actions.CompetitionActionEvent;
import com.bytedance.android.live.liveinteract.match.business.event.BattleStateChannel;
import com.bytedance.android.live.liveinteract.match.remote.api.LinkBattleApi;
import com.bytedance.android.live.liveinteract.multimatch.event.MatchIconVisibleEvent;
import com.bytedance.android.live.liveinteract.multimatch.event.MatchPermissionData;
import com.bytedance.android.livesdk.dataChannel.LinkBattleGuideEvent;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveMatchTakeStageOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveTwoMatchLinkOptSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import kotlin.jvm.internal.AFwS250S0000000_15;
import kotlin.jvm.internal.AwS594S0100000_15;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0bTZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C974870bTZ extends AbstractC945390ai1<InterfaceC974880bTa> {
    public int LL;
    public InterfaceC420801kM LLILLJJLI;
    public final C11NJ LLILLL = new C11NJ();
    public final C987070bnF LLILZ = new C987070bnF(this, 4);

    public final void LJJJJLL() {
        LiveMatchTakeStageOptSetting liveMatchTakeStageOptSetting = LiveMatchTakeStageOptSetting.INSTANCE;
        if (liveMatchTakeStageOptSetting.isEnableOptMatchButton()) {
            DataChannel dataChannel = this.dataChannel;
            if (C500260Jjc.LJJJI(dataChannel != null ? (Boolean) dataChannel.gg0(MatchPermissionData.class) : null)) {
                InterfaceC974880bTa interfaceC974880bTa = (InterfaceC974880bTa) this.mView;
                if (interfaceC974880bTa != null) {
                    interfaceC974880bTa.ys0(true);
                    return;
                }
                return;
            }
        }
        C013C c013c = new C013C();
        c013c.element = this.LL == LiveTwoMatchLinkOptSetting.INSTANCE.getValue().permission_retry_count;
        C974540bT2 c974540bT2 = C974540bT2.LIZ;
        C974540bT2.LJIILIIL = C158B.LIZ();
        JSONObject jSONObject = new JSONObject();
        C0K04.LJFF("role_type", "anchor", jSONObject);
        JSONObject jSONObject2 = new JSONObject();
        C0K04.LJFF("role_type", "anchor", jSONObject2);
        C0K04.LJIIIZ(jSONObject2, "is_match_button_opt", liveMatchTakeStageOptSetting.isEnableOptMatchButton());
        C0K04.LJIIIZ(jSONObject2, "is_match_api_opt", C973510bRN.LIZIZ());
        C974540bT2.LLII(c974540bT2, "battle_permission_request", jSONObject, jSONObject2, null, 24);
        C480460Ism.LIZ().getClass();
        ((C0J1N) ((LinkBattleApi) C480460Ism.LIZLLL(LinkBattleApi.class)).checkPermission().LIZJ(autoDisposeWithTransformer())).LIZ(new AfS184S0100000_15(this, 118), new AfS151S0200000_15(this, c013c, 33));
    }

    public final void LJJJJZI() {
        InterfaceC420801kM interfaceC420801kM;
        InterfaceC420801kM interfaceC420801kM2 = this.LLILLJJLI;
        if (interfaceC420801kM2 != null && !interfaceC420801kM2.isDisposed() && (interfaceC420801kM = this.LLILLJJLI) != null) {
            interfaceC420801kM.dispose();
        }
        this.LL = 0;
    }

    @Override // X.AbstractC945390ai1, X.C0JSV
    public final void detachView() {
        IMessageManager iMessageManager;
        LJJJJZI();
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && (iMessageManager = (IMessageManager) dataChannel.gg0(C776250Uch.class)) != null) {
            iMessageManager.removeMessageListener(this.LLILZ);
        }
        C11NJ c11nj = this.LLILLL;
        if (c11nj != null) {
            c11nj.dispose();
        }
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            dataChannel2.zQ2(this.mView);
        }
        super.detachView();
        C20441214yg.LJ("MultiMatchAnchorPresent", "detachView");
    }

    @Override // X.AbstractC945390ai1
    /* JADX INFO: renamed from: LJJJJLI, reason: merged with bridge method [inline-methods] */
    public final void attachView(InterfaceC974880bTa interfaceC974880bTa) {
        IMessageManager iMessageManager;
        super.attachView(interfaceC974880bTa);
        C973890bRz.LJFF = false;
        LJJJJZI();
        LJJJJLL();
        this.LLILLL.LIZ(C784440Upu.LIZ().LJ(C964150bCH.class).LJJLL(new AfS184S0100000_15(this, 121), new C09JN() { // from class: X.00L8
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("MultiMatchAnchorPresenter@b1fd.observerEvent$2");
                C1C7U.LIZIZ("MultiMatchAnchorPresenter@b1fd.observerEvent$2");
            }
        }));
        this.LLILLL.LIZ(C784440Upu.LIZ().LJ(C975600bUk.class).LJJLL(new AfS184S0100000_15(this, 122), new C09JN() { // from class: X.0T7g
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("MultiMatchAnchorPresenter@b1fd.observerEvent$4");
                C20441214yg.LJFF("MultiMatchAnchorPresent", "observerMessage error", (Throwable) obj);
                C1C7U.LIZIZ("MultiMatchAnchorPresenter@b1fd.observerEvent$4");
            }
        }));
        this.LLILLL.LIZ(C784440Upu.LIZ().LJ(C974150bSP.class).LJJLL(new AfS184S0100000_15(this, 123), new C09JN() { // from class: X.0T7h
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("MultiMatchAnchorPresenter@b1fd.observerEvent$6");
                C20441214yg.LJFF("MultiMatchAnchorPresent", "observerMessage error", (Throwable) obj);
                C1C7U.LIZIZ("MultiMatchAnchorPresenter@b1fd.observerEvent$6");
            }
        }));
        this.LLILLL.LIZ(C784440Upu.LIZ().LJ(C974180bSS.class).LJJLL(new AfS184S0100000_15(this, 124), new C09JN() { // from class: X.0T7i
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("MultiMatchAnchorPresenter@b1fd.observerEvent$8");
                C20441214yg.LJFF("MultiMatchAnchorPresent", "observerMessage error", (Throwable) obj);
                C1C7U.LIZIZ("MultiMatchAnchorPresenter@b1fd.observerEvent$8");
            }
        }));
        this.LLILLL.LIZ(C784440Upu.LIZ().LJ(C960280b62.class).LJJLL(new AfS184S0100000_15(this, 125), new C09JN() { // from class: X.0T7e
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("MultiMatchAnchorPresenter@b1fd.observerEvent$10");
                C20441214yg.LJFF("MultiMatchAnchorPresent", "observerMessage error", (Throwable) obj);
                C1C7U.LIZIZ("MultiMatchAnchorPresenter@b1fd.observerEvent$10");
            }
        }));
        this.LLILLL.LIZ(C784440Upu.LIZ().LJ(ShowMatchPanelForQuickMatchEvent.class).LJJLL(new AfS184S0100000_15(this, 120), new C09JN() { // from class: X.0T7f
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("MultiMatchAnchorPresenter@b1fd.observerEvent$12");
                C20441214yg.LJFF("MultiMatchAnchorPresent", "observerMessage error", (Throwable) obj);
                C1C7U.LIZIZ("MultiMatchAnchorPresenter@b1fd.observerEvent$12");
            }
        }));
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.CQ2(LinkBattleGuideEvent.class, this.mView, new AwS594S0100000_15(this, 718));
            dataChannel.BQ2((LifecycleOwner) this.mView, BattleStateChannel.class, AFwS250S0000000_15.get$arr$(164));
            dataChannel.BQ2((LifecycleOwner) this.mView, MatchIconVisibleEvent.class, new AwS594S0100000_15(this, 719));
            dataChannel.BQ2((LifecycleOwner) this.mView, CompetitionActionEvent.class, new AwS594S0100000_15(this, 720));
        }
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null && (iMessageManager = (IMessageManager) dataChannel2.gg0(C776250Uch.class)) != null) {
            iMessageManager.addMessageListener(C001A.LINK_MIC_BATTLE.getIntType(), this.LLILZ);
            iMessageManager.addMessageListener(C001A.LINK_MIC_BATTLE_NOTICE.getIntType(), this.LLILZ);
            iMessageManager.addMessageListener(C001A.COMPETITION_MESSAGE.getIntType(), this.LLILZ);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("attachView ");
        sbLIZ.append(this);
        C20441214yg.LJ("MultiMatchAnchorPresent", C2188811AlT.LIZIZ(sbLIZ));
    }
}
