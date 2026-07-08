package Y;

import X.AbstractC948890anf;
import X.C09JN;
import X.C0UVC;
import X.C1494450ozb;
import X.C1494690ozz;
import X.C1C7U;
import X.C20441214yg;
import X.C2188811AlT;
import X.C470590Icr;
import X.C473410IhP;
import X.C497740JfY;
import X.C501520Jle;
import X.C766270U4b;
import X.C915980Zwa;
import X.C927600aFK;
import X.C930480aJy;
import X.C933910aPV;
import X.C948850anb;
import X.C958790b3d;
import X.C958830b3h;
import X.C960000b5a;
import X.C962050b8t;
import X.C963140bAe;
import X.C969610bL5;
import X.C974540bT2;
import X.C976430bW5;
import X.C976450bW7;
import X.C976460bW8;
import X.C976940bWu;
import X.EnumC919170a1j;
import X.EnumC948930anj;
import X.EnumC958840b3i;
import X.EnumC959580b4u;
import X.EnumC959750b5B;
import X.EnumC976390bW1;
import X.InterfaceC926280aDC;
import X.InterfaceC954910axN;
import X.InterfaceC962060b8u;
import X.InterfaceC969600bL4;
import X.InterfaceC969670bLB;
import X.InterfaceC975810bV5;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.randommatch.RandomMatchGuestViewModel;
import com.bytedance.android.live.liveinteract.multilive.model.GetMultiGuestRecommendRoomsResponse;
import com.bytedance.android.live.liveinteract.multilive.model.MultiGuestRecommendRoomInfo;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.bytedance.android.livesdk.livesetting.linkmic.RandomLinkMicKeepLiveMaxRetryCountSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.RandomLinkMicKeepLiveRetryEnableSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchQualityOptimizeSetting;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleInfoResponse;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes16.dex */
public class AfS67S0201000_15 implements C09JN {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
            case 2:
                accept$2(this, obj);
                break;
            case 3:
                accept$3(this, obj);
                break;
            case 4:
                accept$4(this, obj);
                break;
            case 5:
                accept$5(this, obj);
                break;
            case 6:
                accept$6(this, obj);
                break;
            case 7:
                accept$7(this, obj);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$0(AfS67S0201000_15 afS67S0201000_15, Object obj) {
        EnumC948930anj enumC948930anj;
        C1C7U.LIZ("RandomMatchGuestViewModel@4.start$1");
        C470590Icr c470590Icr = (C470590Icr) obj;
        C20441214yg.LJIIIZ("RandomMatchGuestViewModel", "start success");
        C473410IhP.LIZ().removeCallbacks(((RandomMatchGuestViewModel) afS67S0201000_15.l0).LLJI);
        C930480aJy.LIZ.getClass();
        if (C930480aJy.LJJIFFI(c470590Icr)) {
            MultiGuestRecommendRoomInfo multiGuestRecommendRoomInfo = ((GetMultiGuestRecommendRoomsResponse.ResponseData) c470590Icr.data).autoPermitRoom;
            RandomMatchGuestViewModel randomMatchGuestViewModel = (RandomMatchGuestViewModel) afS67S0201000_15.l0;
            randomMatchGuestViewModel.LLILZ = afS67S0201000_15.i2;
            randomMatchGuestViewModel.LLILZIL = (AbstractC948890anf) afS67S0201000_15.l1;
            randomMatchGuestViewModel.LLILLL = c470590Icr.LIZIZ;
            if (multiGuestRecommendRoomInfo != null) {
                C948850anb value = randomMatchGuestViewModel.LLILLJJLI.getValue();
                if (value != null) {
                    enumC948930anj = value.LIZ;
                } else {
                    enumC948930anj = null;
                }
                ((RandomMatchGuestViewModel) afS67S0201000_15.l0).BQ2("startSuccess", multiGuestRecommendRoomInfo.hostInfo, multiGuestRecommendRoomInfo.roomId, true);
                if (enumC948930anj != EnumC948930anj.MATCHING) {
                    ((RandomMatchGuestViewModel) afS67S0201000_15.l0).wQ2();
                }
            } else {
                randomMatchGuestViewModel.AQ2(C963140bAe.LIZJ(), C963140bAe.LIZJ() + ((RandomMatchGuestViewModel) afS67S0201000_15.l0).LLIZLLLIL, "startSuccess");
            }
        } else {
            ((RandomMatchGuestViewModel) afS67S0201000_15.l0).yQ2("startFail");
        }
        C1C7U.LIZIZ("RandomMatchGuestViewModel@4.start$1");
    }

    public static final void accept$1(AfS67S0201000_15 afS67S0201000_15, Object obj) {
        C1C7U.LIZ("MultiGuestV3Manager@4508.updateGuestMirrorStatus$1");
        C20441214yg.LIZIZ("OneVn_MultiGuestV3Manager", "updateGuestMirrorStatus success");
        ((C927600aFK) afS67S0201000_15.l0).LJIILIIL().LJIJ.postValue(Integer.valueOf(afS67S0201000_15.i2));
        Function1 function1 = (Function1) afS67S0201000_15.l1;
        if (function1 != null) {
            function1.invoke(Boolean.TRUE);
        }
        C1C7U.LIZIZ("MultiGuestV3Manager@4508.updateGuestMirrorStatus$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$2(AfS67S0201000_15 afS67S0201000_15, Object obj) {
        InterfaceC962060b8u interfaceC962060b8uLIZJ;
        InterfaceC969670bLB interfaceC969670bLBLIZIZ;
        C1C7U.LIZ("MatchFeedWidgetPresenter@981d.checkBattleInfo$1$1");
        BaseResponse baseResponse = (BaseResponse) obj;
        C962050b8t c962050b8t = (C962050b8t) afS67S0201000_15.l0;
        InterfaceC969600bL4 interfaceC969600bL4 = ((C969610bL5) afS67S0201000_15.l1).LIZ;
        if (interfaceC969600bL4 != null && (interfaceC969670bLBLIZIZ = interfaceC969600bL4.LIZIZ()) != null) {
            interfaceC962060b8uLIZJ = interfaceC969670bLBLIZIZ.LIZJ();
        } else {
            interfaceC962060b8uLIZJ = null;
        }
        c962050b8t.LJIIL();
        c962050b8t.LJIILL(interfaceC962060b8uLIZJ);
        c962050b8t.LJIILJJIL("battle_info_succeed");
        BattleInfoResponse battleInfoResponse = (BattleInfoResponse) baseResponse.data;
        if (((C969610bL5) afS67S0201000_15.l1).LIZ == null) {
            C20441214yg.LJIIIZ("MatchFeedWidgetPresenter", "checkBattleInfo, info success, return by viewInterface");
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("checkBattleInfo, info=");
            sbLIZ.append(battleInfoResponse);
            C20441214yg.LJIIIZ("MatchFeedWidgetPresenter", C2188811AlT.LIZIZ(sbLIZ));
            InterfaceC969600bL4 interfaceC969600bL42 = ((C969610bL5) afS67S0201000_15.l1).LIZ;
            if (interfaceC969600bL42 != null && !interfaceC969600bL42.LIZ(battleInfoResponse, afS67S0201000_15.i2)) {
                if (LiveMatchQualityOptimizeSetting.INSTANCE.enableOptimize()) {
                    ((C969610bL5) afS67S0201000_15.l1).LIZ(afS67S0201000_15.i2);
                }
            } else {
                C20441214yg.LJIIIZ("MatchFeedWidgetPresenter", "checkBattleInfo viewInterface?.handleBattleInfo(info, type) == true");
            }
        }
        C1C7U.LIZIZ("MatchFeedWidgetPresenter@981d.checkBattleInfo$1$1");
    }

    public static final void accept$3(AfS67S0201000_15 afS67S0201000_15, Object obj) {
        boolean z;
        C1C7U.LIZ("QuickCoHostKeepAliveManager@d36.keepAlive$1$1");
        InterfaceC954910axN.LIZ.getClass();
        C958790b3d.LIZLLL((BaseResponse) obj, null);
        C20441214yg.LIZIZ("QuickCoHostKeepAliveManager", "keepAlive request success");
        C958830b3h c958830b3h = (C958830b3h) afS67S0201000_15.l0;
        int i = afS67S0201000_15.i2;
        if (i == 2) {
            z = true;
        } else {
            z = false;
        }
        c958830b3h.getClass();
        c958830b3h.LJIIL(C958830b3h.LJJIII(i, z), "auto_match_request_scene", true);
        c958830b3h.LJIJJLI("auto_match_keep_alive_succeed");
        ((C960000b5a) afS67S0201000_15.l1).LIZ.c0().LJI = 0;
        C1C7U.LIZIZ("QuickCoHostKeepAliveManager@d36.keepAlive$1$1");
    }

    public static final void accept$4(AfS67S0201000_15 afS67S0201000_15, Object obj) {
        boolean z;
        C501520Jle c501520Jle;
        C1C7U.LIZ("QuickCoHostKeepAliveManager@d36.keepAlive$1$2");
        Throwable th = (Throwable) obj;
        if (RandomLinkMicKeepLiveRetryEnableSetting.INSTANCE.isEnable()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("keepAlive request fail, keepAliveErrorCount:");
            sbLIZ.append(((C960000b5a) afS67S0201000_15.l0).LIZ.c0().LJI);
            sbLIZ.append(" ,localizedMessage:");
            sbLIZ.append(th);
            C20441214yg.LJ("QuickCoHostKeepAliveManager", C2188811AlT.LIZIZ(sbLIZ));
            if (!(th instanceof C1494450ozb) && !(th instanceof C1494690ozz)) {
                C958830b3h c958830b3h = (C958830b3h) afS67S0201000_15.l1;
                int i = ((C960000b5a) afS67S0201000_15.l0).LIZ.c0().LJI;
                int i2 = afS67S0201000_15.i2;
                if (i2 == 2) {
                    z = true;
                } else {
                    z = false;
                }
                c958830b3h.LJIIJJI(th);
                c958830b3h.LJIIL(Integer.valueOf(i), "keepAliveErrorCount", true);
                c958830b3h.LJIIL(C958830b3h.LJJIII(i2, z), "auto_match_request_scene", true);
                c958830b3h.LJIJJLI("auto_match_keep_alive_falied");
                ((C960000b5a) afS67S0201000_15.l0).LIZ.c0().LJI++;
                if (((C960000b5a) afS67S0201000_15.l0).LIZ.c0().LJI >= RandomLinkMicKeepLiveMaxRetryCountSetting.INSTANCE.getValue()) {
                    C20441214yg.LIZIZ("QuickCoHostKeepAliveManager", "keepAlive request fail, error cnt exceed max retry cnt, end quick cohost");
                    if (((C960000b5a) afS67S0201000_15.l0).LIZ.d0() != EnumC958840b3i.TEAM_PAIR && ((C960000b5a) afS67S0201000_15.l0).LIZ.d0() != EnumC958840b3i.QUICK_BATTLE) {
                        C766270U4b.LJIIJJI(C497740JfY.LJIJI(2131843881));
                    }
                    C915980Zwa.LJIIIZ().LIZ(EnumC959580b4u.KEEP_ALIVE_MAX_RETRY, null);
                } else if ((th instanceof C501520Jle) && (c501520Jle = (C501520Jle) th) != null && c501520Jle.getErrorCode() == 4032001 && ((C960000b5a) afS67S0201000_15.l0).LIZ.d0() != EnumC958840b3i.TEAM_PAIR && ((C960000b5a) afS67S0201000_15.l0).LIZ.d0() != EnumC958840b3i.QUICK_BATTLE) {
                    C20441214yg.LIZIZ("QuickCoHostKeepAliveManager", "keepAlive request fail, restart quick cohost");
                    C915980Zwa.LJIIIZ().LIZIZ(EnumC959750b5B.TYPE_RETRY_BY_KEEP_ALIVE, null);
                }
            }
        }
        C1C7U.LIZIZ("QuickCoHostKeepAliveManager@d36.keepAlive$1$2");
    }

    public static final void accept$5(AfS67S0201000_15 afS67S0201000_15, Object obj) {
        C1C7U.LIZ("IndividualMatchInviteeCoordinator@9ce5.requestRejectApi$1");
        C974540bT2 c974540bT2 = C974540bT2.LIZ;
        int i = afS67S0201000_15.i2;
        long j = ((C976460bW8) afS67S0201000_15.l0).LJII;
        C976430bW5 c976430bW5 = EnumC976390bW1.Companion;
        EnumC976390bW1 enumC976390bW1 = (EnumC976390bW1) afS67S0201000_15.l1;
        c976430bW5.getClass();
        c974540bT2.LJLLILLLL(i, j, C976430bW5.LIZ(enumC976390bW1), (C470590Icr) obj, EnumC919170a1j.MATCH_TYPE_INDIVIDUAL);
        C976450bW7.LIZ((C976460bW8) afS67S0201000_15.l0, false);
        C976460bW8 c976460bW8 = (C976460bW8) afS67S0201000_15.l0;
        EnumC976390bW1 enumC976390bW12 = (EnumC976390bW1) afS67S0201000_15.l1;
        if (!c976460bW8.LJ) {
            C976940bWu c976940bWu = c976460bW8.LIZLLL;
            if (c976940bWu != null) {
                c976940bWu.LJIIL.setValue(Boolean.TRUE);
            }
            InterfaceC975810bV5 interfaceC975810bV5LIZLLL = C915980Zwa.LJI().LIZLLL();
            if (interfaceC975810bV5LIZLLL != null) {
                interfaceC975810bV5LIZLLL.LJIILL(interfaceC975810bV5LIZLLL.LIZIZ());
            }
            c976460bW8.LJIIJJI.invoke(enumC976390bW12);
        }
        C1C7U.LIZIZ("IndividualMatchInviteeCoordinator@9ce5.requestRejectApi$1");
    }

    public static final void accept$6(AfS67S0201000_15 afS67S0201000_15, Object obj) {
        C1C7U.LIZ("IndividualMatchInviteeCoordinator@9ce5.requestRejectApi$2");
        Throwable th = (Throwable) obj;
        C974540bT2.LIZ.LJLLI(afS67S0201000_15.i2, ((C976460bW8) afS67S0201000_15.l0).LJII, th);
        C0UVC.LIZIZ(th);
        C976460bW8 c976460bW8 = (C976460bW8) afS67S0201000_15.l0;
        EnumC976390bW1 enumC976390bW1 = (EnumC976390bW1) afS67S0201000_15.l1;
        if (!c976460bW8.LJ) {
            C976940bWu c976940bWu = c976460bW8.LIZLLL;
            if (c976940bWu != null) {
                c976940bWu.LJIIL.setValue(Boolean.TRUE);
            }
            c976460bW8.LJIIL.invoke(enumC976390bW1);
        }
        C1C7U.LIZIZ("IndividualMatchInviteeCoordinator@9ce5.requestRejectApi$2");
    }

    public static final void accept$7(AfS67S0201000_15 afS67S0201000_15, Object obj) {
        C1C7U.LIZ("MultiLiveAnchorUserInfoPresenter@6075.updateApplierSetting$2");
        Throwable th = (Throwable) obj;
        if (((MultiLiveAnchorPanelSettings) afS67S0201000_15.l0).applierSortSetting == afS67S0201000_15.i2) {
            ((InterfaceC926280aDC) ((C933910aPV) afS67S0201000_15.l1).LL).hy(th);
        }
        C1C7U.LIZIZ("MultiLiveAnchorUserInfoPresenter@6075.updateApplierSetting$2");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AfS67S0201000_15(int r2, X.C960000b5a r3, X.C958830b3h r4, int r5) {
        /*
            r1 = this;
            r1.$t = r5
            int r5 = 3 - r5
            if (r5 == 0) goto L11
            r0 = r1
            r0.l0 = r3
            r0.l1 = r4
            r0.i2 = r2
        Ld:
            r0.<init>()
            return
        L11:
            r0 = r1
            r0.l0 = r4
            r0.i2 = r2
            r0.l1 = r3
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS67S0201000_15.<init>(int, X.0b5a, X.0b3h, int):void");
    }

    public AfS67S0201000_15(int i, Object obj, Object obj2, int i2) {
        this.$t = i2;
        this.i2 = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
