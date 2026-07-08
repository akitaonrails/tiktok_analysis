package X;

import Y.AfS181S0100000_12;
import Y.AfS184S0100000_15;
import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.GuestApplyEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.PlaybookUtilKt;
import com.bytedance.android.live.liveinteract.multiguestv3.main.socialgame.letsdance.api.ILetsDanceServerApi;
import com.bytedance.android.live.liveinteract.multilive.social.model.GameUserJoinReq;
import com.bytedance.android.live.liveinteract.multilive.social.model.GameUserQuitReq;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.tiktok.kmp.live.socialgamebusinessapi.event.MultiLetsDanceMediaIsPlayingChannel;
import com.tiktok.kmp.live.socialgamebusinessapi.event.MultiLetsDanceNotOpenCameraEvent;
import com.tiktok.kmp.live.socialgamebusinessapi.event.MultiLetsDanceOpenRankPageEvent;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS594S0100000_15;

/* JADX INFO: renamed from: X.0aki, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C947060aki extends C947050akh {
    @Override // X.C947050akh
    public final void LJI() {
        C20441214yg.LIZIZ("GuestLetsDanceBizViewModel", "finishGame");
    }

    @Override // X.C947050akh
    public final void LJIILJJIL() {
        EnumC947440alK value = this.LJIIIZ.getValue();
        if (value == EnumC947440alK.PLAYING || value == EnumC947440alK.FINISH) {
            this.LIZ.FQ2(MultiLetsDanceOpenRankPageEvent.class);
        }
        if (C947050akh.LJIIJ()) {
            C20441214yg.LIZIZ("GuestLetsDanceBizViewModel", "Main spot clicked by guest");
        } else {
            C20441214yg.LIZIZ("GuestLetsDanceBizViewModel", "Main spot clicked by audience");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C947050akh
    public final List<EnumC947020ake> LJIIIIZZ() {
        Integer num;
        return (C947050akh.LJIIJ() || ((num = (Integer) C924790aAn.LIZLLL().LIZIZ) != null && 1 == num.intValue())) ? C1697810uHb.LJIIJJI(EnumC947020ake.GAME_MATERIAL, EnumC947020ake.SCORE_EFFECT, EnumC947020ake.LAYOUT_RESOURCE) : Collections.singletonList(EnumC947020ake.LAYOUT_RESOURCE);
    }

    @Override // X.C947050akh
    public final void LJIIIZ() {
        super.LJIIIZ();
        this.LIZ.BQ2(this.LIZIZ, MultiLetsDanceNotOpenCameraEvent.class, new AwS594S0100000_15(this, 24));
    }

    public final void LJIJ() {
        Object c098200Yq;
        try {
            C480460Ism.LIZ().getClass();
            ILetsDanceServerApi iLetsDanceServerApi = (ILetsDanceServerApi) C480460Ism.LIZLLL(ILetsDanceServerApi.class);
            GameUserQuitReq gameUserQuitReq = new GameUserQuitReq();
            Long lLJIIJ = C930540aK4.LJIIJ();
            gameUserQuitReq.roomId = lLJIIJ != null ? lLJIIJ.longValue() : 0L;
            C947420alI value = this.LJIIIIZZ.getValue();
            gameUserQuitReq.gameSessionId = value != null ? value.LIZIZ : 0L;
            gameUserQuitReq.source = 4;
            c098200Yq = iLetsDanceServerApi.userQuitGame(gameUserQuitReq).LJJLL(new C09JN() { // from class: X.0akl
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("GuestLetsDanceMainSpotViewModel@78ce.guestClickCancel$1$2");
                    C20441214yg.LIZIZ("GuestLetsDanceBizViewModel", "guestClickCancel success");
                    C946950akX.LJII("success", null, null);
                    C1C7U.LIZIZ("GuestLetsDanceMainSpotViewModel@78ce.guestClickCancel$1$2");
                }
            }, new AfS184S0100000_15(this, 5));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("guestClickCancel error ");
            sbLIZ.append(thM5exceptionOrNullimpl);
            C20441214yg.LJ("GuestLetsDanceBizViewModel", C2188811AlT.LIZIZ(sbLIZ));
            LJIIZILJ(false);
            C946950akX.LJII("fail", thM5exceptionOrNullimpl.getMessage(), String.valueOf(PlaybookUtilKt.LJIIL(thM5exceptionOrNullimpl)));
        }
    }

    @Override // X.C947050akh
    public final void LJIILLIIL(String str) {
        String str2;
        EnumC942260acy enumC942260acy;
        Object c098200Yq;
        long jLongValue;
        if (str == null) {
            str2 = "join";
        } else {
            str2 = "join_from_fe";
        }
        long j = 0;
        if (C947050akh.LJIIJ()) {
            C20441214yg.LIZIZ("GuestLetsDanceBizViewModel", "Bottom button clicked by guest");
            LJIIZILJ(true);
            C947590alZ value = this.LJIIJ.getValue();
            if (value != null) {
                enumC942260acy = value.LIZJ;
            } else {
                enumC942260acy = null;
            }
            if (enumC942260acy != EnumC942260acy.READY) {
                try {
                    C480460Ism.LIZ().getClass();
                    ILetsDanceServerApi iLetsDanceServerApi = (ILetsDanceServerApi) C480460Ism.LIZLLL(ILetsDanceServerApi.class);
                    GameUserJoinReq gameUserJoinReq = new GameUserJoinReq();
                    Long lLJIIJ = C930540aK4.LJIIJ();
                    if (lLJIIJ != null) {
                        jLongValue = lLJIIJ.longValue();
                    } else {
                        jLongValue = 0;
                    }
                    gameUserJoinReq.roomId = jLongValue;
                    C947420alI value2 = this.LJIIIIZZ.getValue();
                    if (value2 != null) {
                        j = value2.LIZIZ;
                    }
                    gameUserJoinReq.gameSessionId = j;
                    gameUserJoinReq.source = 1;
                    c098200Yq = iLetsDanceServerApi.userJoinGame(gameUserJoinReq).LJJLL(new C09JN() { // from class: X.0T9o
                        @Override // X.C09JN
                        public final void accept(Object obj) {
                            C1C7U.LIZ("BaseLetsDanceMainSpotViewModel@4ca6.joinGame$1$2");
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("joinGame success ");
                            sbLIZ.append(obj);
                            C20441214yg.LIZIZ("BaseLetsDanceBizViewModel", C2188811AlT.LIZIZ(sbLIZ));
                            C946950akX.LJFF("success", null, 14);
                            C1C7U.LIZIZ("BaseLetsDanceMainSpotViewModel@4ca6.joinGame$1$2");
                        }
                    }, new AfS181S0100000_12(this, 21));
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
                if (thM5exceptionOrNullimpl != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("joinGame error ");
                    sbLIZ.append(thM5exceptionOrNullimpl);
                    C20441214yg.LJ("BaseLetsDanceBizViewModel", C2188811AlT.LIZIZ(sbLIZ));
                    C946950akX.LJFF("fail", thM5exceptionOrNullimpl.getMessage(), 12);
                    LJIIZILJ(false);
                }
                C945730aiZ c945730aiZ = C945730aiZ.LIZ;
                DataChannel dataChannel = this.LIZ;
                c945730aiZ.getClass();
                C945730aiZ.LJI(dataChannel, "join");
                return;
            }
            C946950akX.LJIIIIZZ("click_sitout", new LinkedHashMap());
            LJIJ();
            C945730aiZ c945730aiZ2 = C945730aiZ.LIZ;
            DataChannel dataChannel2 = this.LIZ;
            c945730aiZ2.getClass();
            C945730aiZ.LJI(dataChannel2, "sitout");
            return;
        }
        C20441214yg.LIZIZ("GuestLetsDanceBizViewModel", "Bottom button clicked by audience");
        if (C922570a7D.LIZ(this.LIZ)) {
            C20441214yg.LJ("GuestLetsDanceBizViewModel", "onBottomButtonClicked isInViewerLimit");
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("action_type", str2);
        C946950akX.LJIIIIZZ("click_join", linkedHashMap);
        C945730aiZ c945730aiZ3 = C945730aiZ.LIZ;
        DataChannel dataChannel3 = this.LIZ;
        c945730aiZ3.getClass();
        C945730aiZ.LJI(dataChannel3, "join");
        if (C924790aAn.LIZLLL().LJI()) {
            C766270U4b.LJIIJJI(C20642515q3.LJI(2131854409));
            return;
        }
        if (str == null) {
            str = "dance_join";
        }
        C925600aC6.LIZ = str;
        C947420alI value3 = this.LJIIIIZZ.getValue();
        if (value3 != null) {
            j = value3.LIZIZ;
        }
        C925770aCN c925770aCN = new C925770aCN(null, 0, 19, false, 0, false, 0, 0L, null, j, null, 6139);
        Map mapLJ = C2097608Jq.LJ();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("result", "success");
        linkedHashMap2.putAll(mapLJ);
        C946950akX.LJIIIIZZ("apply_join_game_request", linkedHashMap2);
        this.LIZ.LC0(GuestApplyEvent.class, c925770aCN);
        InterfaceC946970akZ interfaceC946970akZLJII = LJII();
        if (interfaceC946970akZLJII != null) {
            interfaceC946970akZLJII.LJIIJJI(C1697810uHb.LJIIJJI(EnumC947020ake.GAME_MATERIAL, EnumC947020ake.SCORE_EFFECT, EnumC947020ake.LAYOUT_RESOURCE));
        }
    }

    public C947060aki(Context context, C947280al4 c947280al4, DataChannel dataChannel) {
        super(context, c947280al4, dataChannel);
    }

    @Override // X.C947050akh
    public final void LJIILIIL(EnumC947440alK enumC947440alK, EnumC947440alK enumC947440alK2, Object obj) {
        boolean zBooleanValue;
        Long l;
        Long l2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onGamePhaseChanged: ");
        sbLIZ.append(enumC947440alK);
        sbLIZ.append(" -> ");
        sbLIZ.append(enumC947440alK2);
        sbLIZ.append(", cause: ");
        sbLIZ.append(obj);
        C20441214yg.LIZIZ("GuestLetsDanceBizViewModel", C2188811AlT.LIZIZ(sbLIZ));
        int i = C947080akk.LIZ[enumC947440alK2.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    if (C947050akh.LJIIJ()) {
                        C20441214yg.LIZIZ("GuestLetsDanceBizViewModel", "[Guest] Game ended");
                        return;
                    } else {
                        C20441214yg.LIZIZ("GuestLetsDanceBizViewModel", "[Audience] Game ended");
                        return;
                    }
                }
                return;
            }
            Boolean bool = (Boolean) this.LIZ.gg0(MultiLetsDanceMediaIsPlayingChannel.class);
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                zBooleanValue = false;
            }
            if (C947050akh.LJIIJ()) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("[Guest] Game is in playingPhase, media is playing=");
                sbLIZ2.append(zBooleanValue);
                C20441214yg.LIZIZ("GuestLetsDanceBizViewModel", C2188811AlT.LIZIZ(sbLIZ2));
                C947420alI value = this.LJIIIIZZ.getValue();
                if (value == null || (l2 = value.LIZLLL) == null) {
                    return;
                }
                long jLongValue = l2.longValue();
                if (zBooleanValue) {
                    return;
                }
                if (LJIIJJI()) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("Game will be start in ");
                    sbLIZ3.append(jLongValue - C158B.LIZ());
                    C20441214yg.LIZIZ("GuestLetsDanceBizViewModel", C2188811AlT.LIZIZ(sbLIZ3));
                    LifecycleOwner lifecycleOwner = this.LIZIZ;
                    if (!(lifecycleOwner instanceof C947280al4)) {
                        return;
                    }
                    ((C947280al4) lifecycleOwner).LJIIZILJ(jLongValue, null);
                    return;
                }
                C20441214yg.LIZIZ("GuestLetsDanceBizViewModel", "Game resource not ready, not start count down");
                LifecycleOwner lifecycleOwner2 = this.LIZIZ;
                if (!(lifecycleOwner2 instanceof C947280al4)) {
                    return;
                }
                ((C947280al4) lifecycleOwner2).LJIILLIIL(true);
                return;
            }
            C20441214yg.LIZIZ("GuestLetsDanceBizViewModel", "[Audience] Game is in playingPhase");
            C947420alI value2 = this.LJIIIIZZ.getValue();
            if (value2 == null || (l = value2.LIZLLL) == null) {
                return;
            }
            long jLongValue2 = l.longValue();
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("Game will be start in ");
            sbLIZ4.append(jLongValue2 - C158B.LIZ());
            C20441214yg.LIZIZ("GuestLetsDanceBizViewModel", C2188811AlT.LIZIZ(sbLIZ4));
            return;
        }
        if (C947050akh.LJIIJ()) {
            C20441214yg.LIZIZ("GuestLetsDanceBizViewModel", "[Guest] Game is in preparing phase, waiting for anchor to start");
        } else {
            C20441214yg.LIZIZ("GuestLetsDanceBizViewModel", "[Audience] Game is in preparing phase, waiting for anchor to start");
        }
    }

    @Override // X.C947050akh
    public final void LJIILL(C947590alZ c947590alZ, C947590alZ c947590alZ2, Object obj) {
        int i;
        EnumC942260acy enumC942260acy;
        super.LJIILL(c947590alZ, c947590alZ2, obj);
        if (c947590alZ2 != null && (enumC942260acy = c947590alZ2.LIZJ) != null) {
            i = C947080akk.LIZIZ[enumC942260acy.ordinal()];
        } else {
            i = -1;
        }
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    C20441214yg.LIZIZ("GuestLetsDanceBizViewModel", "Player is idle");
                }
            } else {
                C20441214yg.LIZIZ("GuestLetsDanceBizViewModel", "Player is joined");
            }
        } else {
            C20441214yg.LIZIZ("GuestLetsDanceBizViewModel", "Player is ready");
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onPlayerStatusChanged: ");
        sbLIZ.append(c947590alZ);
        sbLIZ.append(" -> ");
        sbLIZ.append(c947590alZ2);
        sbLIZ.append(", cause: ");
        sbLIZ.append(obj);
        C20441214yg.LIZIZ("GuestLetsDanceBizViewModel", C2188811AlT.LIZIZ(sbLIZ));
    }
}
