package X;

import com.bytedance.android.live.room.GameMomentChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.game.data.GameClientAIMomentData;
import com.bytedance.android.livesdk.game.data.GameOnDeviceMomentData;
import com.bytedance.android.livesdk.game.model.GameTagDetail;
import com.bytedance.android.livesdk.livesetting.game.moment.LiveGameMomentAudienceEnabledSetting;
import com.bytedance.android.livesdk.livesetting.game.moment.LiveGameMomentImageSelfKillEffectArraySetting;
import com.bytedance.android.livesdk.livesetting.game.moment.LiveGameSoundEffectMomentIgnoreDurationSetting;
import com.bytedance.android.livesdk.model.message.GameMomentMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.ILiveGameService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS221S0000000_31;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.151w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C204542151w implements OnMessageListener, C0IFV {
    public final DataChannel LL;
    public long LLILLJJLI;
    public final Set<C204543151x> LLILLL = new LinkedHashSet();
    public final C01GW LLILZ = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(26));
    public final C01GW LLILZIL = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(25));
    public IMessageManager LLILZLL;
    public boolean LLIZ;
    public int LLIZLLLIL;
    public C204541151v LLJ;

    @Override // X.C0IFV
    public final boolean LIZIZ() {
        return this.LLILZLL != null;
    }

    @Override // X.C0IFV
    public final void LIZJ() {
        IMessageManager iMessageManager = this.LLILZLL;
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener(C001A.GAME_MOMENT_MESSAGE.ordinal(), this);
        }
        this.LLILZLL = null;
        ((Set) this.LLILZ.getValue()).clear();
        C204541151v c204541151v = this.LLJ;
        if (c204541151v != null) {
            c204541151v.LIZLLL.LJ();
            Iterator it2 = ((LinkedHashMap) c204541151v.LIZJ).values().iterator();
            while (it2.hasNext()) {
                c204541151v.LIZ((C204543151x) ((Pair) it2.next()).getFirst());
            }
            ((LinkedHashMap) c204541151v.LIZJ).clear();
        }
    }

    @Override // X.C0IFV
    public final void onPause() {
        C20441214yg.LJIIIZ("GameMomentTimeHelper", "GameMomentTimeHelper on pause");
        this.LLIZ = true;
    }

    @Override // X.C0IFV
    public final void onResume() {
        C20441214yg.LJIIIZ("GameMomentTimeHelper", "GameMomentTimeHelper on resume");
        this.LLIZ = false;
    }

    public C204542151w(DataChannel dataChannel) {
        this.LL = dataChannel;
    }

    @Override // X.C0IFV
    public final void LIZ(IMessageManager iMessageManager) {
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(C001A.GAME_MOMENT_MESSAGE.ordinal(), this);
            this.LLILZLL = iMessageManager;
        }
    }

    @Override // X.C0IFV
    public final void LIZLLL(String str) {
        if (str != null) {
            try {
                if (a0.LJJIIZI(str, "live_sei_game_clientai_moment", false)) {
                    LJIIIIZZ(new JSONObject(str));
                    return;
                }
                if (a0.LJJIIZI(str, "live_on_device_game_moment", false)) {
                    LJIIJ(new JSONObject(str));
                    return;
                }
                JSONObject jSONObject = new JSONObject(str);
                if (!LJIIIZ(jSONObject)) {
                    String strOptString = jSONObject.optString("app_data");
                    if (strOptString.length() > 0) {
                        LJIIIZ(new JSONObject(strOptString));
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onSeiUpdate error ");
                sbLIZ.append(C13SZ.LIZIZ(e));
                C20441214yg.LJ("GameMomentTimeHelper", C2188811AlT.LIZIZ(sbLIZ));
            }
        }
    }

    public final void LJFF(final C204543151x c204543151x) {
        final int i;
        this.LL.zW(GameMomentChannel.class, c204543151x);
        C1117140fB2 c1117140fB2 = new C1117140fB2();
        c1117140fB2.LIZ = 1;
        c1117140fB2.LIZIZ = c204543151x;
        C1117130fB1.LIZ(c1117140fB2);
        LJIILIIL(c204543151x, "livesdk_game_moment_dispatch");
        if (this.LLJ == null) {
            this.LLJ = new C204541151v(this);
        }
        final C204541151v c204541151v = this.LLJ;
        if (c204541151v != null) {
            if (c204543151x.LIZIZ() != -1) {
                int iLIZIZ = c204543151x.LIZIZ();
                long jCurrentTimeMillis = System.currentTimeMillis();
                c204541151v.LIZIZ.put(Integer.valueOf(iLIZIZ), new Pair<>(c204543151x, Long.valueOf(jCurrentTimeMillis)));
                Pair pair = (Pair) ((LinkedHashMap) c204541151v.LIZJ).get(Integer.valueOf(iLIZIZ));
                if (pair != null) {
                    c204541151v.LIZIZ("covered_by_follow", (C204543151x) pair.getFirst(), c204543151x);
                    c204541151v.LIZJ.remove(Integer.valueOf(iLIZIZ));
                }
            } else if (c204543151x.LIZ == 2) {
                GameOnDeviceMomentData gameOnDeviceMomentData = c204543151x.LIZLLL;
                if (gameOnDeviceMomentData != null) {
                    i = gameOnDeviceMomentData.shadowMessageType;
                } else {
                    i = -1;
                }
                final long jCurrentTimeMillis2 = System.currentTimeMillis();
                Pair pair2 = (Pair) ((LinkedHashMap) c204541151v.LIZJ).get(Integer.valueOf(i));
                if (pair2 != null) {
                    c204541151v.LIZ((C204543151x) pair2.getFirst());
                }
                Pair pair3 = (Pair) ((LinkedHashMap) c204541151v.LIZIZ).get(Integer.valueOf(i));
                if (pair3 != null) {
                    C204543151x c204543151x2 = (C204543151x) pair3.getFirst();
                    if (jCurrentTimeMillis2 < ((Number) pair3.getSecond()).longValue() + ((long) 5000)) {
                        c204541151v.LIZIZ("covered_by_before", c204543151x, c204543151x2);
                    } else {
                        c204541151v.LIZIZ.remove(Integer.valueOf(i));
                    }
                }
                c204541151v.LIZJ.put(Integer.valueOf(i), new Pair<>(c204543151x, Long.valueOf(jCurrentTimeMillis2)));
                C11JF c11jf = c204541151v.LJ;
                if (c11jf != null) {
                    c204541151v.LIZLLL.LIZJ(c11jf);
                }
                InterfaceC420801kM interfaceC420801kMLJJLJLI = C19490011Na.LIZLLL(0L, 6L, 0L, 1L, TimeUnit.SECONDS).LJIILIIL(new C0UO0()).LJJIIJZLJL(new InterfaceC781210Ukh() { // from class: X.151t
                    @Override // X.InterfaceC781210Ukh
                    public final void run() {
                        C204541151v c204541151v2 = c204541151v;
                        int i2 = i;
                        long j = jCurrentTimeMillis2;
                        C204543151x c204543151x3 = c204543151x;
                        synchronized (c204541151v2) {
                            try {
                                Pair pair4 = (Pair) ((LinkedHashMap) c204541151v2.LIZJ).get(Integer.valueOf(i2));
                                if (pair4 != null && ((Number) pair4.getSecond()).longValue() == j) {
                                    c204541151v2.LIZ(c204543151x3);
                                    c204541151v2.LIZJ.remove(Integer.valueOf(i2));
                                }
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                throw th;
                            }
                        }
                    }
                }).LJJLJLI(new C09JN() { // from class: X.00MS
                    @Override // X.C09JN
                    public final /* bridge */ /* synthetic */ void accept(Object obj) {
                        C1C7U.LIZ("GameOnDeviceMomentEvaluator@571e.onPreLaunchedOnDeviceMomentDispatch$5");
                        C1C7U.LIZIZ("GameOnDeviceMomentEvaluator@571e.onPreLaunchedOnDeviceMomentDispatch$5");
                    }
                });
                c204541151v.LJ = (C11JF) interfaceC420801kMLJJLJLI;
                c204541151v.LIZLLL.LIZ(interfaceC420801kMLJJLJLI);
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("dispatch game moment, unique_id=");
        sbLIZ.append(c204543151x.LJI());
        C20441214yg.LJIIIZ("GameMomentTimeHelper", C2188811AlT.LIZIZ(sbLIZ));
    }

    public final long LJI(C204543151x c204543151x) {
        Long l = (Long) this.LL.gg0(C753830Thd.class);
        if (l != null) {
            return c204543151x.LIZJ() - l.longValue();
        }
        return 0L;
    }

    public final void LJII(C204543151x c204543151x) {
        String str;
        Map<String, Object> map = C1338270kvh.LIZ;
        LJIILIIL(c204543151x, "livesdk_game_moment_recv");
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_highlight_moment_broadcast_latency");
        c474500IjALIZ.LJIJJLI(this.LL);
        c474500IjALIZ.LJJII("audience", "user_type");
        c474500IjALIZ.LJJII(C778700Uge.LIZ(c204543151x.LIZIZ()), "highlight_moment_type");
        if (C497740JfY.LJIL()) {
            str = "portrait";
        } else {
            str = "landscape";
        }
        c474500IjALIZ.LJJII(str, "room_orientation");
        c474500IjALIZ.LJJII(Long.valueOf(LJI(c204543151x)), "latency");
        c474500IjALIZ.LJJII("ocr", "identify_source");
        c474500IjALIZ.LIZ();
        if (this.LLIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("receive message when OnPause, uniqueId=");
            sbLIZ.append(c204543151x.LJI());
            C20441214yg.LJIIIZ("GameMomentTimeHelper", C2188811AlT.LIZIZ(sbLIZ));
            ((Set) this.LLILZIL.getValue()).add(c204543151x);
            return;
        }
        for (C204543151x c204543151x2 : this.LLILLL) {
            if (c204543151x.LIZ == 0 && 1 != 0 && Intrinsics.LJFF(c204543151x2.LJI(), c204543151x.LJI())) {
                LJIIJJI(c204543151x, "duplicated");
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("duplicate message. unique_id=");
                sbLIZ2.append(c204543151x.LJI());
                C20441214yg.LJIIIZ("GameMomentTimeHelper", C2188811AlT.LIZIZ(sbLIZ2));
                return;
            }
        }
        int iLIZ = C204544151y.LIZ(c204543151x, this.LLILLJJLI);
        if (iLIZ != 0) {
            if (iLIZ != 1) {
                if (iLIZ != 2) {
                    if (iLIZ == 3) {
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("receive message in advance, moment max time =");
                        sbLIZ3.append(c204543151x.LIZLLL());
                        sbLIZ3.append("  sei time=");
                        sbLIZ3.append(this.LLILLJJLI);
                        C20441214yg.LJIIIZ("GameMomentTimeHelper", C2188811AlT.LIZIZ(sbLIZ3));
                        this.LLILLL.add(c204543151x);
                        ((Set) this.LLILZ.getValue()).add(c204543151x);
                        return;
                    }
                    return;
                }
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("moment is expired, moment max time =");
                sbLIZ4.append(c204543151x.LIZLLL());
                sbLIZ4.append("  sei time=");
                sbLIZ4.append(this.LLILLJJLI);
                C20441214yg.LJIIIZ("GameMomentTimeHelper", C2188811AlT.LIZIZ(sbLIZ4));
                LJIIJJI(c204543151x, "expired");
                return;
            }
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("receive message no timestamp, uniqueId=");
            sbLIZ5.append(c204543151x.LJI());
            C20441214yg.LJIIIZ("GameMomentTimeHelper", C2188811AlT.LIZIZ(sbLIZ5));
            LJIIJJI(c204543151x, "no_timestamp");
            return;
        }
        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
        sbLIZ6.append("receive message right time, unique_id=");
        sbLIZ6.append(c204543151x.LJI());
        C20441214yg.LJIIIZ("GameMomentTimeHelper", C2188811AlT.LIZIZ(sbLIZ6));
        this.LLILLL.add(c204543151x);
        LJFF(c204543151x);
    }

    public final void LJIIIIZZ(JSONObject jSONObject) {
        String idStr;
        try {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("live_sei_game_clientai_moment");
            if (jSONObjectOptJSONObject != null) {
                long jOptLong = jSONObjectOptJSONObject.optLong("timestamp");
                String strOptString = jSONObjectOptJSONObject.optString("highlight_moment_type");
                String str = "";
                if (strOptString == null) {
                    strOptString = "";
                }
                String strOptString2 = jSONObjectOptJSONObject.optString("highlight_moment_sub_type");
                if (strOptString2 == null) {
                    strOptString2 = "";
                }
                String strOptString3 = jSONObjectOptJSONObject.optString("game_name");
                if (strOptString3 == null) {
                    strOptString3 = "";
                }
                String strOptString4 = jSONObjectOptJSONObject.optString("identify_source");
                if (strOptString4 == null) {
                    strOptString4 = "clientai";
                }
                String strOptString5 = jSONObjectOptJSONObject.optString("recognition_end");
                if (strOptString5 != null) {
                    str = strOptString5;
                }
                Map<String, Object> map = C1338270kvh.LIZ;
                if (jOptLong != 0 && strOptString.length() != 0 && strOptString2.length() != 0) {
                    if (LiveGameMomentAudienceEnabledSetting.INSTANCE.enableClientAIMoment() && ((Intrinsics.LJFF(strOptString, "kill") || Intrinsics.LJFF(strOptString, "killTime")) && Intrinsics.LJFF(strOptString2, "self"))) {
                        C204543151x c204543151x = new C204543151x();
                        c204543151x.LIZ = 1;
                        GameClientAIMomentData gameClientAIMomentData = new GameClientAIMomentData();
                        gameClientAIMomentData.messageType = 2;
                        gameClientAIMomentData.eventTime = jOptLong;
                        gameClientAIMomentData.recognitionEnd = str;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        Room room = (Room) this.LL.gg0(RoomChannel.class);
                        if (room != null) {
                            idStr = room.getIdStr();
                        } else {
                            idStr = null;
                        }
                        sbLIZ.append(idStr);
                        sbLIZ.append('_');
                        sbLIZ.append(jOptLong);
                        gameClientAIMomentData.uniqueId = C2188811AlT.LIZIZ(sbLIZ);
                        ArrayList arrayList = new ArrayList();
                        arrayList.addAll(C13LQ.LJJLJ(LiveGameMomentImageSelfKillEffectArraySetting.INSTANCE.getValue()));
                        gameClientAIMomentData.momentEffects = arrayList;
                        c204543151x.LIZJ = gameClientAIMomentData;
                        LJII(c204543151x);
                        return;
                    }
                    LJIILJJIL(jOptLong, strOptString, strOptString2, strOptString3, strOptString4);
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(" sei parse error ");
            sbLIZ2.append(C13SZ.LIZIZ(e));
            sbLIZ2.append(' ');
            C20441214yg.LJIIIZ("GameMomentTimeHelper", C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    public final boolean LJIIIZ(JSONObject jSONObject) {
        try {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("live_sei_game_moment");
            if (jSONObjectOptJSONObject != null) {
                long jOptLong = jSONObjectOptJSONObject.optLong("timestamp");
                this.LL.SX0(C753830Thd.class, Long.valueOf(jOptLong));
                if (this.LLILLJJLI < jOptLong) {
                    this.LLILLJJLI = jOptLong;
                    for (C204543151x c204543151x : this.LLILLL) {
                        if (C204544151y.LIZ(c204543151x, this.LLILLJJLI) == 2) {
                            Map<String, Object> map = C1338270kvh.LIZ;
                            this.LLILLL.remove(c204543151x);
                        }
                    }
                    if (!this.LLIZ) {
                        for (C204543151x c204543151x2 : (Set) this.LLILZ.getValue()) {
                            int iLIZ = C204544151y.LIZ(c204543151x2, this.LLILLJJLI);
                            if (iLIZ != 0) {
                                if (iLIZ == 2) {
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append("handle sei, moment is expired, unique_id=");
                                    sbLIZ.append(c204543151x2.LJI());
                                    C20441214yg.LJIIIZ("GameMomentTimeHelper", C2188811AlT.LIZIZ(sbLIZ));
                                    LJIIJJI(c204543151x2, "expired");
                                    ((Set) this.LLILZ.getValue()).remove(c204543151x2);
                                }
                            } else {
                                Map<String, Object> map2 = C1338270kvh.LIZ;
                                LJFF(c204543151x2);
                                ((Set) this.LLILZ.getValue()).remove(c204543151x2);
                            }
                        }
                        for (C204543151x c204543151x3 : (Set) this.LLILZIL.getValue()) {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("handle sei,m oment that receive when OnPause, uniqueId=");
                            sbLIZ2.append(c204543151x3.LJI());
                            C20441214yg.LJIIIZ("GameMomentTimeHelper", C2188811AlT.LIZIZ(sbLIZ2));
                            LJII(c204543151x3);
                            ((Set) this.LLILZIL.getValue()).remove(c204543151x3);
                        }
                        return true;
                    }
                    return true;
                }
                return true;
            }
            return false;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            Map<String, Object> map3 = C1338270kvh.LIZ;
            return false;
        }
    }

    public final void LJIIJ(JSONObject jSONObject) {
        try {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("live_on_device_game_moment");
            if (jSONObjectOptJSONObject != null) {
                Map<String, Object> map = C1338270kvh.LIZ;
                long jOptLong = jSONObjectOptJSONObject.optLong("moment_delay_ms");
                int iOptInt = jSONObjectOptJSONObject.optInt("message_type");
                JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("effect_array");
                ArrayList arrayList = new ArrayList();
                if (jSONArrayOptJSONArray != null) {
                    int length = jSONArrayOptJSONArray.length();
                    for (int i = 0; i < length; i++) {
                        arrayList.add(Integer.valueOf(jSONArrayOptJSONArray.optInt(i)));
                    }
                }
                String strOptString = jSONObjectOptJSONObject.optString("recognition_method");
                int iOptInt2 = jSONObjectOptJSONObject.optInt("shadow_message_type");
                long jOptLong2 = jSONObjectOptJSONObject.optLong("moment_live_duration_ms");
                String strOptString2 = jSONObjectOptJSONObject.optString("recognition_end");
                String strOptString3 = jSONObjectOptJSONObject.optString("unique_id");
                String strOptString4 = jSONObjectOptJSONObject.optString("recognition_detail_json");
                if (LiveGameMomentAudienceEnabledSetting.INSTANCE.enableSoundEffectMoment()) {
                    C204543151x c204543151x = new C204543151x();
                    c204543151x.LIZ = 2;
                    GameOnDeviceMomentData gameOnDeviceMomentData = new GameOnDeviceMomentData();
                    gameOnDeviceMomentData.messageType = iOptInt;
                    gameOnDeviceMomentData.momentEffects = arrayList;
                    gameOnDeviceMomentData.recognitionMethod = strOptString;
                    gameOnDeviceMomentData.momentLiveDuration = jOptLong2;
                    gameOnDeviceMomentData.momentDelay = jOptLong;
                    gameOnDeviceMomentData.shadowMessageType = iOptInt2;
                    gameOnDeviceMomentData.uniqueId = strOptString3;
                    gameOnDeviceMomentData.recognitionEnd = strOptString2;
                    gameOnDeviceMomentData.recognitionDetailJson = strOptString4;
                    gameOnDeviceMomentData.maxTime = LiveGameSoundEffectMomentIgnoreDurationSetting.INSTANCE.getValue();
                    c204543151x.LIZLLL = gameOnDeviceMomentData;
                    LJII(c204543151x);
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(" sei parse error ");
            sbLIZ.append(C13SZ.LIZIZ(e));
            sbLIZ.append(' ');
            C20441214yg.LJIIIZ("GameMomentTimeHelper", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public final void LJIILL(String str) {
        if (str != null) {
            try {
                this.LLIZLLLIL = CastIntegerProtector.parseInt(str);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("parse clientVersion to Int fail, clientVersion=");
                sbLIZ.append(str);
                sbLIZ.append(" , ");
                sbLIZ.append(C13SZ.LIZIZ(e));
                C20441214yg.LJ("GameMomentTimeHelper", C2188811AlT.LIZIZ(sbLIZ));
            }
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        if (iMessage instanceof GameMomentMessage) {
            C204543151x c204543151x = new C204543151x();
            c204543151x.LIZ = 0;
            c204543151x.LIZIZ = (GameMomentMessage) iMessage;
            LJII(c204543151x);
        }
    }

    public static void LJ(C204543151x c204543151x, C474500IjA c474500IjA) {
        long j;
        String str;
        int i;
        GameOnDeviceMomentData gameOnDeviceMomentData;
        GameOnDeviceMomentData gameOnDeviceMomentData2;
        GameOnDeviceMomentData gameOnDeviceMomentData3;
        if (c204543151x.LIZ == 2) {
            c474500IjA.LJJII(Long.valueOf(c204543151x.LIZJ()), "moment_live_duration");
            if (c204543151x.LIZ == 2 && (gameOnDeviceMomentData3 = c204543151x.LIZLLL) != null) {
                j = gameOnDeviceMomentData3.momentDelay;
            } else {
                j = 0;
            }
            c474500IjA.LJJII(Long.valueOf(j), "moment_delay");
            if (c204543151x.LIZ != 2 || (gameOnDeviceMomentData2 = c204543151x.LIZLLL) == null || (str = gameOnDeviceMomentData2.recognitionDetailJson) == null) {
                str = "";
            }
            c474500IjA.LJJII(str, "recognition_detail_json");
            if (c204543151x.LIZ == 2 && (gameOnDeviceMomentData = c204543151x.LIZLLL) != null) {
                i = gameOnDeviceMomentData.shadowMessageType;
            } else {
                i = -1;
            }
            c474500IjA.LJJII(Integer.valueOf(i), "shadow_message_type");
        }
    }

    public final void LJIIJJI(C204543151x c204543151x, String str) {
        long startTime;
        long j;
        GameTagDetail gameTagDetail;
        Room room = (Room) this.LL.gg0(RoomChannel.class);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_game_moment_ignore");
        c474500IjALIZ.LJIJJLI(this.LL);
        long jLIZJ = c204543151x.LIZJ();
        if (room != null) {
            startTime = room.getStartTime();
        } else {
            startTime = 0;
        }
        c474500IjALIZ.LJJII(Long.valueOf(jLIZJ - (startTime * ((long) LSPassThroughRecordSizeConfig.DEFAULT))), "moment_live_duration");
        c474500IjALIZ.LJJII(Long.valueOf(-LJI(c204543151x)), "moment_delay");
        if (room != null && (gameTagDetail = room.gameTagDetail) != null) {
            j = gameTagDetail.gameTagId;
        } else {
            j = -1;
        }
        c474500IjALIZ.LJJII(Long.valueOf(j), "game_tag_id");
        c474500IjALIZ.LJJII(String.valueOf(((ILiveGameService) C1161920gLG.LIZJ(ILiveGameService.class)).getFeature("g_interaction_fusion_tag_name")), "game_fusion_label");
        c474500IjALIZ.LJJII(c204543151x.LJ(), "recognition_end");
        c474500IjALIZ.LJJII(c204543151x.LJFF(), "recognition_method");
        c474500IjALIZ.LJJII(c204543151x.LJI(), "unique_id");
        c474500IjALIZ.LJJII(str, "reason");
        c474500IjALIZ.LJJII(Integer.valueOf(c204543151x.LIZIZ()), "message_type");
        c474500IjALIZ.LJJII(c204543151x.LIZ().toString(), "effect_array");
        c474500IjALIZ.LJJII(Boolean.FALSE, "is_anchor");
        c474500IjALIZ.LJJII(Integer.valueOf(this.LLIZLLLIL), "anchor_client_version");
        LJ(c204543151x, c474500IjALIZ);
        c474500IjALIZ.LIZ();
    }

    public final void LJIIL(C204543151x c204543151x, C474500IjA c474500IjA) {
        long j;
        GameTagDetail gameTagDetail;
        Room room = (Room) this.LL.gg0(RoomChannel.class);
        c474500IjA.LJIJJLI(this.LL);
        LJ(c204543151x, c474500IjA);
        if (room != null && (gameTagDetail = room.gameTagDetail) != null) {
            j = gameTagDetail.gameTagId;
        } else {
            j = -1;
        }
        c474500IjA.LJJII(Long.valueOf(j), "game_tag_id");
        c474500IjA.LJJII(String.valueOf(((ILiveGameService) C1161920gLG.LIZJ(ILiveGameService.class)).getFeature("g_interaction_fusion_tag_name")), "game_fusion_label");
        c474500IjA.LJJII(c204543151x.LJ(), "recognition_end");
        c474500IjA.LJJII(c204543151x.LJFF(), "recognition_method");
        c474500IjA.LJJII(c204543151x.LJI(), "unique_id");
        c474500IjA.LJJII(Integer.valueOf(c204543151x.LIZIZ()), "message_type");
        c474500IjA.LJJII(c204543151x.LIZ().toString(), "effect_array");
        c474500IjA.LJJII(Boolean.FALSE, "is_anchor");
        c474500IjA.LJJII(Integer.valueOf(this.LLIZLLLIL), "anchor_client_version");
        c474500IjA.LIZ();
    }

    public final void LJIILIIL(C204543151x c204543151x, String str) {
        long startTime;
        long j;
        GameTagDetail gameTagDetail;
        Room room = (Room) this.LL.gg0(RoomChannel.class);
        C474500IjA c474500IjALIZ = C0IJT.LIZ(str);
        c474500IjALIZ.LJIJJLI(this.LL);
        long jLIZJ = c204543151x.LIZJ();
        if (room != null) {
            startTime = room.getStartTime();
        } else {
            startTime = 0;
        }
        c474500IjALIZ.LJJII(Long.valueOf(jLIZJ - (startTime * ((long) LSPassThroughRecordSizeConfig.DEFAULT))), "moment_live_duration");
        c474500IjALIZ.LJJII(Long.valueOf(-LJI(c204543151x)), "moment_delay");
        if (room != null && (gameTagDetail = room.gameTagDetail) != null) {
            j = gameTagDetail.gameTagId;
        } else {
            j = -1;
        }
        c474500IjALIZ.LJJII(Long.valueOf(j), "game_tag_id");
        c474500IjALIZ.LJJII(String.valueOf(((ILiveGameService) C1161920gLG.LIZJ(ILiveGameService.class)).getFeature("g_interaction_fusion_tag_name")), "game_fusion_label");
        c474500IjALIZ.LJJII(c204543151x.LJ(), "recognition_end");
        c474500IjALIZ.LJJII(c204543151x.LJFF(), "recognition_method");
        c474500IjALIZ.LJJII(c204543151x.LJI(), "unique_id");
        c474500IjALIZ.LJJII(Integer.valueOf(c204543151x.LIZIZ()), "message_type");
        c474500IjALIZ.LJJII(c204543151x.LIZ().toString(), "effect_array");
        c474500IjALIZ.LJJII(Boolean.FALSE, "is_anchor");
        c474500IjALIZ.LJJII(Integer.valueOf(this.LLIZLLLIL), "anchor_client_version");
        LJ(c204543151x, c474500IjALIZ);
        c474500IjALIZ.LIZ();
    }

    public final void LJIILJJIL(long j, String str, String str2, String str3, String str4) {
        String str5;
        long jLongValue;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_highlight_moment_broadcast_latency");
        c474500IjALIZ.LJIJJLI(this.LL);
        c474500IjALIZ.LJJII("audience", "user_type");
        c474500IjALIZ.LJJII(str, "highlight_moment_type");
        c474500IjALIZ.LJJII(str2, "highlight_moment_sub_type");
        if (C497740JfY.LJIL()) {
            str5 = "portrait";
        } else {
            str5 = "landscape";
        }
        c474500IjALIZ.LJJII(str5, "room_orientation");
        Long l = (Long) this.LL.gg0(C753830Thd.class);
        if (l != null) {
            jLongValue = j - l.longValue();
        } else {
            jLongValue = 0;
        }
        c474500IjALIZ.LJJII(Long.valueOf(jLongValue), "latency");
        c474500IjALIZ.LJJII(str4, "identify_source");
        c474500IjALIZ.LJJII(str3, "game_name");
        c474500IjALIZ.LIZ();
    }
}
