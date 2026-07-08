package X;

import Y.AfS181S0100000_12;
import Y.AfS189S0100000_20;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.android.livesdk.config.GameAudioInferModel;
import com.bytedance.android.livesdk.game.api.GameLiveHighlightApi;
import com.bytedance.android.livesdk.game.broadcast.bgbroadcast.clientai.model.GameMomentResults;
import com.bytedance.android.livesdk.game.broadcast.bgbroadcast.internalrecord.EnableFallbackAudioOldChainSetting;
import com.bytedance.android.livesdk.game.common.datachannel.BroadCastGameMomentChannel;
import com.bytedance.android.livesdk.game.data.GameClientAIMomentData;
import com.bytedance.android.livesdk.livesetting.game.GameAudioInferConfigSetting;
import com.bytedance.android.livesdk.livesetting.game.GameAudioInferModelSetting;
import com.bytedance.android.livesdk.livesetting.game.moment.LiveGameMomentImageSelfKillEffectArraySetting;
import com.bytedance.android.livesdk.model.GameTag;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.livesdkapi.host.IHostResource;
import com.bytedance.android.livesdkapi.host.ILiveGameService;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.game_revenue.ReportModelDataRequest;

/* JADX INFO: renamed from: X.151O, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C151O implements InterfaceC1272460jDY, InterfaceC785730Urz {
    public static final long LJIIIIZZ;
    public static final long LJIIIZ;
    public final Room LIZ;
    public final AbstractC1273900jFs LIZIZ;
    public C204525151f LIZJ;
    public final C11JF LJ;
    public final C204524151e LJI;
    public final HashMap<String, Long> LJII;
    public final boolean LIZLLL = ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isOffline();
    public final C01GW LJFF = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(521));

    static {
        GameAudioInferConfigSetting gameAudioInferConfigSetting = GameAudioInferConfigSetting.INSTANCE;
        LJIIIIZZ = gameAudioInferConfigSetting.getConfig().intervalIgnoreResultMs;
        LJIIIZ = gameAudioInferConfigSetting.getConfig().modelDownLoadTimer;
    }

    @Override // X.InterfaceC1272460jDY
    public final void LIZ(Exception exc) {
        if (this.LIZLLL) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("IAudioRecordThreadObserver.onError: thread=");
            sbLIZ.append(C786410Ut5.u3().getName());
            sbLIZ.append(", code=");
            sbLIZ.append(-302);
            sbLIZ.append(", exception=");
            sbLIZ.append(Log.getStackTraceString(exc));
            C20441214yg.LJ("Sonava#GameKeyTimeInferAudio", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    @Override // X.InterfaceC785730Urz
    public final void LIZLLL(C151Q c151q) {
        long jCurrentTimeMillis;
        long jLongValue;
        String string;
        int i;
        String str;
        String strLJIIIIZZ;
        long jLJJIL;
        long jLJJIJIIJIL;
        String string2;
        long jLongValue2;
        String idStr;
        LiveMode streamType;
        C1269340j8W c1269340j8WLLD;
        C1269340j8W c1269340j8WLLD2;
        Long l = c151q.LIZ;
        if (l != null) {
            jCurrentTimeMillis = l.longValue();
        } else {
            jCurrentTimeMillis = System.currentTimeMillis();
        }
        String str2 = c151q.LIZIZ;
        if (str2 != null) {
            boolean zLJFF = Intrinsics.LJFF(str2, "1");
            Long l2 = this.LJII.get(str2);
            if (l2 != null) {
                jLongValue = l2.longValue();
            } else {
                jLongValue = 0;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("messageType = ");
            sbLIZ.append(str2);
            sbLIZ.append(",lastHighlightReportTime = ");
            sbLIZ.append(jLongValue);
            C20441214yg.LJIIIZ("Sonava#GameKeyTimeInferAudio", C2188811AlT.LIZIZ(sbLIZ));
            long jCurrentTimeMillis2 = System.currentTimeMillis() - jLongValue;
            if (jCurrentTimeMillis2 < LJIIIIZZ) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("audio highlight deduplicated messageType= ");
                sbLIZ2.append(str2);
                sbLIZ2.append(",timeDiff = ");
                sbLIZ2.append(jCurrentTimeMillis2);
                C20441214yg.LJIIIZ("Sonava#GameKeyTimeInferAudio", C2188811AlT.LIZIZ(sbLIZ2));
            } else {
                String strValueOf = String.valueOf(((ILiveGameService) C1161920gLG.LIZJ(ILiveGameService.class)).getFeature("g_interaction_fusion_tag_name"));
                Object feature = ((ILiveGameService) C1161920gLG.LIZJ(ILiveGameService.class)).getFeature("g_interaction_fusion_tag_id");
                String strLIZ = "";
                if (feature == null || (string = feature.toString()) == null) {
                    string = "";
                }
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("fusionTag = ");
                sbLIZ3.append(strValueOf);
                sbLIZ3.append(",fusionId = ");
                sbLIZ3.append(string);
                C20441214yg.LJIIIZ("Sonava#GameKeyTimeInferAudio", C2188811AlT.LIZIZ(sbLIZ3));
                if (TextUtils.isEmpty(strValueOf)) {
                    LIZIZ(0, "fusion_tag_error");
                } else {
                    this.LJII.put(str2, Long.valueOf(System.currentTimeMillis()));
                    ReportModelDataRequest reportModelDataRequest = new ReportModelDataRequest();
                    GameMomentResults gameMomentResults = new GameMomentResults();
                    if (zLJFF) {
                        i = 1;
                    } else {
                        i = 2;
                    }
                    gameMomentResults.gameMomentType = i;
                    if (zLJFF) {
                        str = "victory";
                    } else {
                        str = "self_kill";
                    }
                    gameMomentResults.gameMomentSubType = str;
                    gameMomentResults.fusionIdTag = strValueOf;
                    gameMomentResults.platform = "Android";
                    if (zLJFF) {
                        gameMomentResults.prob = C1697810uHb.LJIIJJI(Float.valueOf(0.1f), Float.valueOf(0.1f), Float.valueOf(0.1f), Float.valueOf(0.1f), Float.valueOf(0.999f), Float.valueOf(0.1f));
                        gameMomentResults.threshold = C1697810uHb.LJIIJJI(Float.valueOf(0.99f), Float.valueOf(0.99f), Float.valueOf(0.99f), Float.valueOf(0.99f), Float.valueOf(0.99f), Float.valueOf(0.99f));
                    } else {
                        gameMomentResults.prob = C1697810uHb.LJIIJJI(Float.valueOf(0.99f), Float.valueOf(0.99f), Float.valueOf(0.99f), Float.valueOf(0.99f), Float.valueOf(0.99f), Float.valueOf(0.99f));
                        gameMomentResults.threshold = C1697810uHb.LJIIJJI(Float.valueOf(0.1f), Float.valueOf(0.999f), Float.valueOf(0.1f), Float.valueOf(0.1f), Float.valueOf(0.1f), Float.valueOf(0.1f));
                    }
                    gameMomentResults.source = "audio";
                    try {
                        strLJIIIIZZ = C2348809Ig.LJIIIIZZ(gameMomentResults);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        strLJIIIIZZ = "";
                    }
                    reportModelDataRequest.result = strLJIIIIZZ;
                    AbstractC1273900jFs abstractC1273900jFs = this.LIZIZ;
                    if (abstractC1273900jFs != null && (c1269340j8WLLD2 = abstractC1273900jFs.LLD()) != null) {
                        jLJJIL = c1269340j8WLLD2.LJJIL(0);
                    } else {
                        jLJJIL = 224;
                    }
                    reportModelDataRequest.width = jLJJIL;
                    AbstractC1273900jFs abstractC1273900jFs2 = this.LIZIZ;
                    if (abstractC1273900jFs2 != null && (c1269340j8WLLD = abstractC1273900jFs2.LLD()) != null) {
                        jLJJIJIIJIL = c1269340j8WLLD.LJJIJIIJIL(0);
                    } else {
                        jLJJIJIIJIL = 224;
                    }
                    reportModelDataRequest.height = jLJJIJIIJIL;
                    Room room = this.LIZ;
                    if (room == null || (string2 = Long.valueOf(room.getId()).toString()) == null) {
                        string2 = "";
                    }
                    reportModelDataRequest.roomIdStr = string2;
                    Long lLJIILIIL = C2095008Iq.LJIILIIL(string);
                    if (lLJIILIIL != null) {
                        jLongValue2 = lLJIILIIL.longValue();
                    } else {
                        jLongValue2 = 0;
                    }
                    reportModelDataRequest.gameTagId = jLongValue2;
                    reportModelDataRequest.modelName = "game_moment_model";
                    reportModelDataRequest.modelVersion = CardStruct.IStatusCode.DEFAULT;
                    Room room2 = this.LIZ;
                    if (room2 != null && (streamType = room2.getStreamType()) != null) {
                        strLIZ = C354201Zc.LIZ(streamType);
                    }
                    reportModelDataRequest.streamMode = strLIZ;
                    reportModelDataRequest.liveTimeOffset = 0L;
                    reportModelDataRequest.timestampStr = String.valueOf(jCurrentTimeMillis / ((long) LSPassThroughRecordSizeConfig.DEFAULT));
                    C480460Ism.LIZ().getClass();
                    ((GameLiveHighlightApi) C480460Ism.LIZLLL(GameLiveHighlightApi.class)).reportHighlightWithClientAITransfer(reportModelDataRequest).LJIILIIL(new C0UO0()).LJJLL(new AfS189S0100000_20(this, 10), new AfS189S0100000_20(this, 11));
                    DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
                    C204543151x c204543151x = new C204543151x();
                    c204543151x.LIZ = 3;
                    GameClientAIMomentData gameClientAIMomentData = new GameClientAIMomentData();
                    gameClientAIMomentData.messageType = 2;
                    gameClientAIMomentData.recognitionEnd = "Android";
                    gameClientAIMomentData.eventTime = jCurrentTimeMillis;
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    Room room3 = this.LIZ;
                    if (room3 != null) {
                        idStr = room3.getIdStr();
                    } else {
                        idStr = null;
                    }
                    sbLIZ4.append(idStr);
                    sbLIZ4.append('_');
                    sbLIZ4.append(jCurrentTimeMillis);
                    gameClientAIMomentData.uniqueId = C2188811AlT.LIZIZ(sbLIZ4);
                    ArrayList arrayList = new ArrayList();
                    arrayList.addAll(C13LQ.LJJLJ(LiveGameMomentImageSelfKillEffectArraySetting.INSTANCE.getValue()));
                    gameClientAIMomentData.momentEffects = arrayList;
                    c204543151x.LIZJ = gameClientAIMomentData;
                    dataChannelGlobal.HQ2(BroadCastGameMomentChannel.class, c204543151x);
                }
            }
        }
        if (this.LIZLLL) {
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("onAudioMatch() realFrameTime = ");
            sbLIZ5.append(jCurrentTimeMillis);
            sbLIZ5.append(",messageType = ");
            sbLIZ5.append(str2);
            C20441214yg.LJIIIZ("Sonava#GameKeyTimeInferAudio", C2188811AlT.LIZIZ(sbLIZ5));
        }
        if (str2 != null) {
            LJ(str2, "audio_match", Long.valueOf(jCurrentTimeMillis));
        }
    }

    public C151O(Room room, AbstractC1273900jFs abstractC1273900jFs) {
        final GameAudioInferModel gameAudioInferModel;
        List<GameTag> list;
        this.LIZ = room;
        this.LIZIZ = abstractC1273900jFs;
        long jLongValue = 0;
        if (room != null && (list = room.gameTags) != null) {
            Iterator<GameTag> it2 = list.iterator();
            loop0: while (true) {
                while (it2.hasNext()) {
                    Long l = it2.next().id;
                    jLongValue = l != null ? l.longValue() : 0L;
                }
            }
        }
        Map<String, GameAudioInferModel> value = GameAudioInferModelSetting.INSTANCE.getValue();
        if (value != null) {
            gameAudioInferModel = value.get(String.valueOf(jLongValue));
        } else {
            gameAudioInferModel = null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("gameTagId = ");
        sbLIZ.append(jLongValue);
        C20441214yg.LJIIIZ("Sonava#GameKeyTimeInferAudio", C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("gameAudioInferModel.modeFile = ");
        sbLIZ2.append(gameAudioInferModel != null ? gameAudioInferModel.getModeFile() : null);
        C20441214yg.LJIIIZ("Sonava#GameKeyTimeInferAudio", C2188811AlT.LIZIZ(sbLIZ2));
        if (gameAudioInferModel != null) {
            this.LJ = (C11JF) C11NZ.LJJJJL(0L, LJIIIZ, TimeUnit.SECONDS, C11S5.LIZ()).LJJIL(new C1339330kxP(gameAudioInferModel, 1)).LJJJJZI(new InterfaceC1487280oo2() { // from class: X.0k1D
                @Override // X.InterfaceC1487280oo2
                public final Object apply(Object obj) {
                    String path;
                    String modeFile = gameAudioInferModel.getModeFile();
                    if (modeFile == null) {
                        modeFile = "";
                    }
                    File fileLJII = C1143780fs0.LJII("tiktok_live_game_demand_2", modeFile);
                    if (fileLJII == null) {
                        ((IHostResource) C1161920gLG.LIZJ(IHostResource.class)).NP0("tiktok_live_game_demand_2");
                        fileLJII = C1143780fs0.LJII("tiktok_live_game_demand_2", modeFile);
                    }
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("map file = ");
                    if (fileLJII != null) {
                        path = fileLJII.getPath();
                    } else {
                        path = null;
                    }
                    sbLIZ3.append(path);
                    C20441214yg.LJIIIZ("Sonava#GameKeyTimeInferAudio", C2188811AlT.LIZIZ(sbLIZ3));
                    return fileLJII;
                }
            }).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS181S0100000_12(this, 305), new C09JN() { // from class: X.0UoS
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("GameKeyTimeInferAudio@ae81.<init>$5");
                    C20441214yg.LJ("Sonava#GameKeyTimeInferAudio", Log.getStackTraceString((Throwable) obj));
                    C1C7U.LIZIZ("GameKeyTimeInferAudio@ae81.<init>$5");
                }
            });
        }
        if (EnableFallbackAudioOldChainSetting.INSTANCE.enable()) {
            this.LJI = new C204524151e(this.LIZIZ);
        }
        this.LJII = new HashMap<>();
    }

    @Override // X.InterfaceC785730Urz
    public final void LIZIZ(int i, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onAudioLog() state = ");
        sbLIZ.append(str);
        sbLIZ.append(",code =");
        sbLIZ.append(i);
        C20441214yg.LJIIIZ("Sonava#GameKeyTimeInferAudio", C2188811AlT.LIZIZ(sbLIZ));
        LJ(String.valueOf(i), str, null);
    }

    public final void LJ(Object obj, String str, Object obj2) {
        Long lValueOf;
        long jLongValue;
        Long l;
        LiveMode streamType;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_game_sound_effect_detction_process_detail_android");
        Room room = this.LIZ;
        String str2 = null;
        if (room != null) {
            lValueOf = Long.valueOf(room.getId());
        } else {
            lValueOf = null;
        }
        c474500IjALIZ.LJJII(lValueOf, "room_id");
        Room room2 = this.LIZ;
        if (room2 != null && (streamType = room2.getStreamType()) != null) {
            str2 = streamType.logStreamingType;
        }
        c474500IjALIZ.LJJII(str2, "live_type");
        GameTag gameTag = EnumC754690Tj1.SCREEN_RECORD.getGameTag();
        if (gameTag != null && (l = gameTag.id) != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = -1;
        }
        c474500IjALIZ.LJJII(Long.valueOf(jLongValue), "game_tag_id");
        c474500IjALIZ.LJJII(this.LJFF.getValue(), "anchor_id");
        c474500IjALIZ.LJJII(str, "state");
        c474500IjALIZ.LJJII(obj, "code");
        if (obj2 != null) {
            c474500IjALIZ.LJJII(obj2, "sub_code");
        }
        c474500IjALIZ.LIZ();
    }

    @Override // X.InterfaceC1272460jDY
    public final void LIZJ(ByteBuffer byteBuffer, int i, int i2, int i3, long j) {
        Map<String, Object> map = C1338270kvh.LIZ;
        C204525151f c204525151f = this.LIZJ;
        if (c204525151f != null) {
            c204525151f.LIZJ(byteBuffer, i, i2, i3, j);
        }
        C204524151e c204524151e = this.LJI;
        if (c204524151e != null) {
            c204524151e.LIZJ(byteBuffer, i, i2, i3, j);
        }
    }
}
