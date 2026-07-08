package X;

import Y.AfS184S0100000_15;
import Y.AfS33S1000000_12;
import android.content.Context;
import android.media.MediaMetadataRetriever;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.liveinteract.multiguestv3.main.socialgame.letsdance.api.ILetsDanceServerApi;
import com.bytedance.android.live.liveinteract.multilive.social.model.GameFinishReq;
import com.bytedance.android.live.liveinteract.multilive.social.model.GameStartReq;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.tiktok.kmp.live.socialgamebusinessapi.event.MultiLetsDanceOpenPickSongPageEvent;
import com.tiktok.kmp.live.socialgamebusinessapi.event.MultiLetsDanceOpenRankPageEvent;
import java.io.File;
import java.util.List;

/* JADX INFO: renamed from: X.0akg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C947040akg extends C947050akh {
    public final List<EnumC947020ake> LJIILIIL;
    public boolean LJIILJJIL;

    @Override // X.C947050akh
    public final void LJI() {
        Object c098200Yq;
        try {
            C480460Ism.LIZ().getClass();
            ILetsDanceServerApi iLetsDanceServerApi = (ILetsDanceServerApi) C480460Ism.LIZLLL(ILetsDanceServerApi.class);
            GameFinishReq gameFinishReq = new GameFinishReq();
            Long lLJIIJ = C930540aK4.LJIIJ();
            gameFinishReq.roomId = lLJIIJ != null ? lLJIIJ.longValue() : 0L;
            C947420alI value = this.LJIIIIZZ.getValue();
            gameFinishReq.gameSessionId = value != null ? value.LIZIZ : 0L;
            gameFinishReq.source = 2;
            c098200Yq = iLetsDanceServerApi.finishGame(gameFinishReq).LJJLL(new AfS33S1000000_12("game_over", 0), new AfS33S1000000_12("game_over", 1));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("finishGame error ");
            sbLIZ.append(thM5exceptionOrNullimpl);
            C20441214yg.LJ("AnchorLetsDanceBizViewModel", C2188811AlT.LIZIZ(sbLIZ));
            C946950akX.LIZLLL("game_over", "fail", thM5exceptionOrNullimpl.getMessage(), 8);
        }
    }

    @Override // X.C947050akh
    public final void LJIILJJIL() {
        if (this.LJIILJJIL) {
            C20441214yg.LIZIZ("AnchorLetsDanceBizViewModel", "Main spot clicked by anchor, isStartingGame, return");
            return;
        }
        C20441214yg.LIZIZ("AnchorLetsDanceBizViewModel", "Main spot clicked by anchor");
        C946950akX.LIZ("mainSpot");
        EnumC947440alK value = this.LJIIIZ.getValue();
        if (value == EnumC947440alK.PREPARING) {
            this.LIZ.LC0(MultiLetsDanceOpenPickSongPageEvent.class, new C946890akR("prepare", "dance_mic", "mainSpot"));
        } else if (value == EnumC947440alK.PLAYING || value == EnumC947440alK.FINISH) {
            this.LIZ.FQ2(MultiLetsDanceOpenRankPageEvent.class);
        }
    }

    public final long LJIJ() {
        String strLIZJ;
        InterfaceC946970akZ interfaceC946970akZLJII = LJII();
        if (interfaceC946970akZLJII == null || (strLIZJ = interfaceC946970akZLJII.LIZJ(EnumC947020ake.GAME_MATERIAL)) == null) {
            return 120000L;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(strLIZJ);
        sbLIZ.append(File.separator);
        sbLIZ.append("dance_video.mp4");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            mediaMetadataRetriever.setDataSource(strLIZIZ);
            String strLIZJ2 = C20144413ru.LIZJ(mediaMetadataRetriever);
            long j = strLIZJ2 != null ? CastLongProtector.parseLong(strLIZJ2) : 0L;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("getDanceVideoDuration, duration=");
            sbLIZ2.append(j);
            sbLIZ2.append(", filePath=");
            sbLIZ2.append(strLIZIZ);
            C20441214yg.LIZIZ("AnchorLetsDanceBizViewModel", C2188811AlT.LIZIZ(sbLIZ2));
            return j;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            C189200o6.m1boximpl(c098200Yq);
            return 120000L;
        }
    }

    @Override // X.C947050akh
    public final List<EnumC947020ake> LJIIIIZZ() {
        return this.LJIILIIL;
    }

    @Override // X.C947050akh
    public final void LJIILLIIL(String str) {
        Object c098200Yq;
        long jLongValue;
        LJIIZILJ(true);
        C20441214yg.LIZIZ("AnchorLetsDanceBizViewModel", "Bottom button clicked by anchor");
        C945730aiZ c945730aiZ = C945730aiZ.LIZ;
        DataChannel dataChannel = this.LIZ;
        c945730aiZ.getClass();
        C945730aiZ.LJI(dataChannel, "start");
        C946950akX.LJIIIIZZ("start_click", C2097608Jq.LJ());
        InterfaceC946970akZ interfaceC946970akZLJII = LJII();
        if (interfaceC946970akZLJII != null && interfaceC946970akZLJII.LJIIIIZZ()) {
            this.LJIILJJIL = true;
            C20441214yg.LIZIZ("AnchorLetsDanceBizViewModel", "Anchor starts the game");
            try {
                C480460Ism.LIZ().getClass();
                ILetsDanceServerApi iLetsDanceServerApi = (ILetsDanceServerApi) C480460Ism.LIZLLL(ILetsDanceServerApi.class);
                GameStartReq gameStartReq = new GameStartReq();
                Long lLJIIJ = C930540aK4.LJIIJ();
                long j = 0;
                if (lLJIIJ != null) {
                    jLongValue = lLJIIJ.longValue();
                } else {
                    jLongValue = 0;
                }
                gameStartReq.roomId = jLongValue;
                C947420alI value = this.LJIIIIZZ.getValue();
                if (value != null) {
                    j = value.LIZIZ;
                }
                gameStartReq.gameSessionId = j;
                gameStartReq.gameDuration = LJIJ();
                c098200Yq = iLetsDanceServerApi.startGame(gameStartReq).LJIILIIL(new C0UO0()).LJJLJLI(new AfS184S0100000_15(this, 4));
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("startGame error ");
                sbLIZ.append(thM5exceptionOrNullimpl);
                C20441214yg.LJ("AnchorLetsDanceBizViewModel", C2188811AlT.LIZIZ(sbLIZ));
                C946950akX.LJ("fail", thM5exceptionOrNullimpl.getMessage(), null);
                LJIIZILJ(false);
                this.LJIILJJIL = false;
            }
            C189200o6.m1boximpl(c098200Yq);
            return;
        }
        C20441214yg.LIZIZ("AnchorLetsDanceBizViewModel", "Cannot start game, check conditions");
    }

    public C947040akg(Context context, C947280al4 c947280al4, DataChannel dataChannel) {
        super(context, c947280al4, dataChannel);
        this.LJIILIIL = C1697810uHb.LJIIJJI(EnumC947020ake.GAME_MATERIAL, EnumC947020ake.SCORE_EFFECT, EnumC947020ake.LAYOUT_RESOURCE);
    }

    @Override // X.C947050akh
    public final void LJIILIIL(EnumC947440alK enumC947440alK, EnumC947440alK enumC947440alK2, Object obj) {
        Long l;
        Long l2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onGamePhaseChanged: ");
        sbLIZ.append(enumC947440alK);
        sbLIZ.append(" -> ");
        sbLIZ.append(enumC947440alK2);
        sbLIZ.append(", cause: ");
        sbLIZ.append(obj);
        C20441214yg.LIZIZ("AnchorLetsDanceBizViewModel", C2188811AlT.LIZIZ(sbLIZ));
        int i = C947100akm.LIZ[enumC947440alK2.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        C20441214yg.LIZIZ("AnchorLetsDanceBizViewModel", "Game Ended");
                        return;
                    }
                    return;
                }
                C20441214yg.LIZIZ("AnchorLetsDanceBizViewModel", "Game Finished");
                return;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Game is in PLAYING phase. startTime = ");
            C947420alI value = this.LJIIIIZZ.getValue();
            if (value != null) {
                l = value.LIZLLL;
            } else {
                l = null;
            }
            sbLIZ2.append(l);
            C20441214yg.LIZIZ("AnchorLetsDanceBizViewModel", C2188811AlT.LIZIZ(sbLIZ2));
            this.LJIILJJIL = false;
            C947420alI value2 = this.LJIIIIZZ.getValue();
            if (value2 == null || (l2 = value2.LIZLLL) == null) {
                return;
            }
            long jLongValue = l2.longValue();
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("Game will be start in ");
            sbLIZ3.append(jLongValue - C158B.LIZ());
            C20441214yg.LIZIZ("AnchorLetsDanceBizViewModel", C2188811AlT.LIZIZ(sbLIZ3));
            LifecycleOwner lifecycleOwner = this.LIZIZ;
            if (!(lifecycleOwner instanceof C947280al4)) {
                return;
            }
            ((C947280al4) lifecycleOwner).LJIIZILJ(jLongValue, null);
            return;
        }
        C20441214yg.LIZIZ("AnchorLetsDanceBizViewModel", "Game is in PREPARING phase, anchor can start the game");
    }
}
