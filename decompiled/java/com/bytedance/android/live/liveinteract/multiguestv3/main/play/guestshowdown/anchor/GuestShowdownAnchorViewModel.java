package com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.anchor;

import X.C01GW;
import X.C01I4;
import X.C01IF;
import X.C01II;
import X.C01NB;
import X.C01ZC;
import X.C0UO0;
import X.C13LE;
import X.C15B9;
import X.C1697810uHb;
import X.C19487111Lx;
import X.C20441214yg;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C303201Fm;
import X.C304101Fv;
import X.C304201Fw;
import X.C334801Rq;
import X.C452501pT;
import X.C480460Ism;
import X.C500260Jjc;
import X.C515801zg;
import X.C516201zk;
import X.C5182020e;
import X.C918060Zzw;
import X.C948450amx;
import X.C954140aw8;
import X.EnumC919910a2v;
import X.InterfaceC2217461Bqa;
import X.InterfaceC305401Gi;
import X.InterfaceC920110a3F;
import X.InterfaceC921620a5g;
import X.InterfaceC927510aFB;
import X.InterfaceC938550aWz;
import android.content.Context;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.common.IMultiGuestPlayApi;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.anchor.GuestShowdownAnchorViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.BaseGuestShowdownViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.IGuestShowdownApi;
import com.bytedance.android.live.liveinteract.multilive.model.GetUserPlaySettingsParams;
import com.bytedance.android.live.liveinteract.multilive.model.GuestShowdownCloseParams;
import com.bytedance.android.live.liveinteract.multilive.model.GuestShowdownStartParams;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.BugFixShowdownAuxStreamIdGetSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;
import tikcast.linkmic.common.MgTraceInfo;
import tikcast.linkmic.common.PosIdentity;
import webcast.data.multi_guest_play.GuestShowdownConfig;
import webcast.data.multi_guest_play.GuestShowdownContent;

/* JADX INFO: loaded from: classes.dex */
public final class GuestShowdownAnchorViewModel extends BaseGuestShowdownViewModel {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJI;
    public final DataChannel LLJ;
    public boolean LLJILJIL;
    public C19487111Lx LLJJI;
    public final C01II LLJJIII;
    public final MutableLiveData<List<LinkPlayerInfo>> LLJI = new MutableLiveData<>(null);
    public final MutableLiveData<GuestShowdownConfig> LLJIJIL = new MutableLiveData<>(null);
    public final C304201Fw LLJILJILJ = new C304201Fw("ZOOM_SERVICE");
    public final C01GW LLJILLL = C452501pT.LIZIZ(new C5182020e(this, 308));
    public final C01GW LLJJ = C452501pT.LIZIZ(new C5182020e(this, 306));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(GuestShowdownAnchorViewModel.class, "zoomService", "getZoomService()Lcom/bytedance/android/live/liveinteract/multiguestv3/main/zoom/common/IZoomInterface;", 0);
        C13LE.LIZ.getClass();
        LLJJIJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.BaseGuestShowdownViewModel
    public final String BQ2() {
        return "GuestShowdownAnchorViewModel";
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.BaseGuestShowdownViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        InterfaceC921620a5g interfaceC921620a5g = (InterfaceC921620a5g) C948450amx.LIZIZ.LJIIJJI("MULTI_GUEST_V3_ANCHOR_USER_MANAGER");
        if (interfaceC921620a5g != null) {
            interfaceC921620a5g.LJJIIJ((C303201Fm) this.LLJILLL.getValue());
        }
        C01II c01ii = this.LLJJIII;
        Object value = this.LLJJ.getValue();
        if (c01ii.LJJ.contains(value)) {
            c01ii.LJJ.remove(value);
        }
        C19487111Lx c19487111Lx = this.LLJJI;
        if (c19487111Lx != null) {
            c19487111Lx.dispose();
        }
        this.LLJJI = null;
        super.onCleared();
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.BaseGuestShowdownViewModel
    public final InterfaceC938550aWz vQ2() {
        C15B9 c15b9 = this.LLIZ;
        if (c15b9 != null) {
            return c15b9;
        }
        C20441214yg.LJIIIZ("GeniusAnimationController", "getAnimationController create");
        C15B9 c15b92 = new C15B9(this.LLJ);
        this.LLIZ = c15b92;
        c15b92.LJFF("onCreate");
        return c15b92;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.BaseGuestShowdownViewModel
    public final String yQ2() {
        String str;
        if (BugFixShowdownAuxStreamIdGetSetting.INSTANCE.isEnable() && C01ZC.LIZIZ()) {
            GuestShowdownContent guestShowdownContent = this.LLJJIII.LIZIZ;
            return (guestShowdownContent == null || (str = guestShowdownContent.streamId) == null || str.length() == 0) ? this.LLJJIII.LJIJJ : str;
        }
        GuestShowdownContent guestShowdownContent2 = this.LLJJIII.LIZIZ;
        if (guestShowdownContent2 != null) {
            return guestShowdownContent2.streamId;
        }
        return null;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.BaseGuestShowdownViewModel
    public final void clearCache() throws JSONException {
        super.clearCache();
        C19487111Lx c19487111Lx = this.LLJJI;
        if (c19487111Lx != null) {
            c19487111Lx.dispose();
        }
        this.LLJJI = null;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.BaseGuestShowdownViewModel
    public final void onInit() {
        super.onInit();
        InterfaceC921620a5g interfaceC921620a5g = (InterfaceC921620a5g) C948450amx.LIZIZ.LJIIJJI("MULTI_GUEST_V3_ANCHOR_USER_MANAGER");
        if (interfaceC921620a5g != null) {
            interfaceC921620a5g.LJJIJIL((C303201Fm) this.LLJILLL.getValue());
        }
        C01II c01ii = this.LLJJIII;
        Object value = this.LLJJ.getValue();
        if (c01ii.LJJ.contains(value)) {
            return;
        }
        c01ii.LJJ.add((InterfaceC305401Gi) value);
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.BaseGuestShowdownViewModel
    public final /* bridge */ /* synthetic */ C01I4 xQ2() {
        return this.LLJJIII;
    }

    public final void FQ2(int i) {
        long j;
        C20441214yg.LJIIIZ("GuestShowdownAnchorViewModel", "requestClosePlay");
        GuestShowdownCloseParams guestShowdownCloseParams = new GuestShowdownCloseParams();
        guestShowdownCloseParams.roomId = C954140aw8.LIZJ();
        guestShowdownCloseParams.channelId = C954140aw8.LIZIZ();
        C01II c01ii = this.LLJJIII;
        GuestShowdownContent guestShowdownContent = c01ii.LIZIZ;
        if (guestShowdownContent != null) {
            j = guestShowdownContent.playId;
        } else {
            j = 0;
        }
        guestShowdownCloseParams.playId = j;
        guestShowdownCloseParams.closeScene = i;
        C480460Ism.LIZ().getClass();
        wQ2().LIZ(C01NB.LIZIZ(((IGuestShowdownApi) C480460Ism.LIZLLL(IGuestShowdownApi.class)).close(guestShowdownCloseParams), "GuestShowdownAnchorModel", "close").LJIILL(new C516201zk(c01ii, 213)).LJFF(new C0UO0()).LJFF(new C0UO0()).LJJIIZ(new C516201zk(this, 38), new C516201zk(this, 39)));
    }

    public final void GQ2(boolean z) {
        List<String> listLJIILJJIL;
        if (this.LLJILJIL && z) {
            return;
        }
        this.LLJILJIL = true;
        C01II c01ii = this.LLJJIII;
        c01ii.getClass();
        C480460Ism.LIZ().getClass();
        IMultiGuestPlayApi iMultiGuestPlayApi = (IMultiGuestPlayApi) C480460Ism.LIZLLL(IMultiGuestPlayApi.class);
        GetUserPlaySettingsParams getUserPlaySettingsParams = new GetUserPlaySettingsParams();
        if (C01ZC.LIZIZ()) {
            listLJIILJJIL = C1697810uHb.LJIILJJIL("guest_showdown_duration", "guest_showdown_loser_num", "guest_showdown_max_loser_num", "guest_showdown_winner_num", "guest_showdown_max_position");
        } else {
            listLJIILJJIL = C1697810uHb.LJIILJJIL("guest_showdown_duration", "guest_showdown_loser_num", "guest_showdown_max_loser_num");
        }
        getUserPlaySettingsParams.settingKeys = listLJIILJJIL;
        wQ2().LIZ(C01NB.LIZ(C01NB.LIZIZ(iMultiGuestPlayApi.getUserPlaySettings(getUserPlaySettingsParams), "GuestShowdownAnchorModel", "getUserPlaySettings").LJIILL(new C516201zk(c01ii, 215))).LJFF(new C0UO0()).LJFF(new C0UO0()).LJJIIZ(new C516201zk(this, 40), new C516201zk(this, 41)));
    }

    public GuestShowdownAnchorViewModel(Context context, DataChannel dataChannel) {
        this.LLJ = dataChannel;
        this.LLJJIII = new C01II(dataChannel);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0029, code lost:
    
        if (r10 != 4) goto L30;
     */
    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.BaseGuestShowdownViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DQ2(int r9, int r10) {
        /*
            r8 = this;
            super.DQ2(r9, r10)
            r7 = 5
            r6 = 4
            r4 = 3
            r5 = 2
            if (r9 != r5) goto L18
            if (r10 == r4) goto Lf
            if (r10 == r6) goto Lf
            if (r10 != r7) goto L18
        Lf:
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r8.LLJ
            if (r1 == 0) goto L18
            java.lang.Class<com.bytedance.android.livesdk.model.GuestShowdownEntityFinishEvent> r0 = com.bytedance.android.livesdk.model.GuestShowdownEntityFinishEvent.class
            r1.FQ2(r0)
        L18:
            java.lang.String r3 = "guest_showdown"
            r2 = 1
            java.lang.String r1 = "MULTI_GUEST_TICKET_SEI_WRITER"
            if (r10 == 0) goto La0
            if (r10 == r2) goto L77
            if (r10 == r5) goto L77
            if (r10 == r4) goto L77
            if (r10 == r6) goto L5e
            if (r10 == r7) goto La0
        L29:
            if (r10 != r6) goto L8f
        L2b:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            X.11Hj r3 = X.AbstractC19484711Kz.LJIJJLI(r0)
            com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.utils.setting.MultiGuestGuestShowdownConfigSetting r0 = com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.utils.setting.MultiGuestGuestShowdownConfigSetting.INSTANCE
            com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.utils.setting.GuestShowDownConfig r0 = r0.getSettingValue()
            long r1 = r0.maxPunishmentDuration
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS
            X.11LU r2 = r3.LJIIIIZZ(r1, r0)
            X.01zk r1 = new X.01zk
            r0 = 37
            r1.<init>(r8, r0)
            X.11J2 r1 = r2.LJIIIZ(r1)
            X.11QI r0 = new X.11QI
            r0.<init>(r1)
            X.11Lf r0 = r0.LJIILL()
            X.01kM r0 = r0.LJIIZILJ()
            X.11Lx r0 = (X.C19487111Lx) r0
            r8.LLJJI = r0
        L5d:
            return
        L5e:
            boolean r0 = X.C01ZE.LIZ()
            if (r0 != 0) goto L2b
            X.0amx r0 = X.C948450amx.LIZIZ
            java.lang.Object r1 = r0.LJIIJJI(r1)
            X.01Gh r1 = (X.InterfaceC305301Gh) r1
            if (r1 == 0) goto L2b
            X.01Gf r0 = new X.01Gf
            r0.<init>()
            r1.LIZ(r0)
            goto L2b
        L77:
            boolean r0 = X.C01ZE.LIZ()
            if (r0 != 0) goto L8f
            X.0amx r0 = X.C948450amx.LIZIZ
            java.lang.Object r1 = r0.LJIIJJI(r1)
            X.01Gh r1 = (X.InterfaceC305301Gh) r1
            if (r1 == 0) goto L8f
            X.01Gk r0 = new X.01Gk
            r0.<init>(r3)
            r1.LIZ(r0)
        L8f:
            X.11Lx r0 = r8.LLJJI
            if (r0 == 0) goto L96
            r0.dispose()
        L96:
            r0 = 0
            r8.LLJJI = r0
            if (r10 != r4) goto L5d
            r0 = 0
            r8.GQ2(r0)
            return
        La0:
            boolean r0 = X.C01ZE.LIZ()
            if (r0 != 0) goto L29
            X.0amx r0 = X.C948450amx.LIZIZ
            java.lang.Object r0 = r0.LJIIJJI(r1)
            X.01Gh r0 = (X.InterfaceC305301Gh) r0
            if (r0 == 0) goto L29
            r0.LJIIJJI(r3)
            goto L29
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.anchor.GuestShowdownAnchorViewModel.DQ2(int, int):void");
    }

    public final void KQ2(int i, int i2, long j) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("requestUpdateConfigWhenIdle, updateLoserNum: ");
        sbLIZ.append(i);
        sbLIZ.append(", duration: ");
        sbLIZ.append(j);
        sbLIZ.append(", winnerNum: ");
        sbLIZ.append(i2);
        C20441214yg.LJIIIZ("GuestShowdownAnchorViewModel", C2188811AlT.LIZIZ(sbLIZ));
        C500260Jjc.LJJLIIIJILLIZJL(new C304101Fv(this, j, i, i2));
    }

    public final void HQ2(final long j, final int i, final int i2, final long j2, final boolean z, final C334801Rq c334801Rq, final Function1 function1) {
        Boolean boolValueOf;
        String strLJIILIIL;
        InterfaceC927510aFB interfaceC927510aFB;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("requestStartPlay, duration: ");
        sbLIZ.append(j);
        sbLIZ.append("， loserNum: ");
        sbLIZ.append(i);
        C20441214yg.LJIIIZ("GuestShowdownAnchorViewModel", C2188811AlT.LIZIZ(sbLIZ));
        C918060Zzw.LIZ.getClass();
        if (!C918060Zzw.LIZ(true)) {
            C304201Fw c304201Fw = this.LLJILJILJ;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJI;
            InterfaceC927510aFB interfaceC927510aFB2 = (InterfaceC927510aFB) c304201Fw.LIZ();
            if (interfaceC927510aFB2 != null) {
                boolValueOf = Boolean.valueOf(interfaceC927510aFB2.LJIIIIZZ());
            } else {
                boolValueOf = null;
            }
            if (C500260Jjc.LJJJI(boolValueOf)) {
                C20441214yg.LJIIIZ("GuestShowdownAnchorViewModel", "requestStartPlay, need to cancel zoom");
                InterfaceC927510aFB interfaceC927510aFB3 = (InterfaceC927510aFB) this.LLJILJILJ.LIZ();
                if (interfaceC927510aFB3 != null && (strLJIILIIL = interfaceC927510aFB3.LJIILIIL()) != null && (interfaceC927510aFB = (InterfaceC927510aFB) this.LLJILJILJ.LIZ()) != null) {
                    interfaceC927510aFB.LJI(strLJIILIIL, new InterfaceC920110a3F() { // from class: X.01Gd
                        @Override // X.InterfaceC920110a3F
                        public final void LIZ(int i3, String str, String str2, Throwable th) {
                        }

                        @Override // X.InterfaceC920110a3F
                        public final void LIZIZ(List<PosIdentity> list, Function1<? super PosIdentity, Unit> function12) {
                        }

                        @Override // X.InterfaceC920110a3F
                        public final void LIZJ(String str) {
                            GuestShowdownAnchorViewModel.IQ2(z, this, j2, c334801Rq, j, i, i2, function1);
                        }
                    }, true, false, true, false, EnumC919910a2v.FROM_MULTI_GUEST_MANAGE_PANEL, c334801Rq);
                    return;
                }
                return;
            }
        }
        C20441214yg.LJIIIZ("GuestShowdownAnchorViewModel", "requestStartPlay, needn't to cancel zoom");
        IQ2(z, this, j2, c334801Rq, j, i, i2, function1);
    }

    public static final void IQ2(boolean z, GuestShowdownAnchorViewModel guestShowdownAnchorViewModel, long j, C334801Rq c334801Rq, long j2, int i, int i2, Function1<? super Boolean, Unit> function1) {
        String strLJIL;
        MgTraceInfo mgTraceInfoLIZ = null;
        if (!z || (strLJIL = guestShowdownAnchorViewModel.yQ2()) == null) {
            strLJIL = guestShowdownAnchorViewModel.LLJJIII.LJIL(null);
        }
        if (strLJIL.length() == 0) {
            C20441214yg.LJ("GuestShowdownAnchorViewModel", "requestStartPlay error, streamId is empty");
            return;
        }
        GuestShowdownStartParams guestShowdownStartParams = new GuestShowdownStartParams();
        guestShowdownStartParams.roomId = C954140aw8.LIZJ();
        guestShowdownStartParams.channelId = C954140aw8.LIZIZ();
        guestShowdownStartParams.prePlayId = j;
        guestShowdownStartParams.streamId = strLJIL;
        GuestShowdownConfig guestShowdownConfig = new GuestShowdownConfig();
        guestShowdownConfig.duration = j2;
        guestShowdownConfig.loserNum = i;
        guestShowdownConfig.winnerNum = i2;
        guestShowdownStartParams.playConfig = guestShowdownConfig;
        if (c334801Rq != null) {
            mgTraceInfoLIZ = C01IF.LIZ(c334801Rq);
        }
        guestShowdownStartParams.mgTraceInfo = mgTraceInfoLIZ;
        C01II c01ii = guestShowdownAnchorViewModel.LLJJIII;
        c01ii.getClass();
        C480460Ism.LIZ().getClass();
        guestShowdownAnchorViewModel.wQ2().LIZ(C01NB.LIZ(C01NB.LIZIZ(((IGuestShowdownApi) C480460Ism.LIZLLL(IGuestShowdownApi.class)).start(guestShowdownStartParams), "GuestShowdownAnchorModel", "start").LJIILL(new C516201zk(c01ii, 216))).LJFF(new C0UO0()).LJFF(new C0UO0()).LJJIIZ(new C515801zg(guestShowdownAnchorViewModel, function1, 9), new C515801zg(guestShowdownAnchorViewModel, function1, 10)));
    }
}
