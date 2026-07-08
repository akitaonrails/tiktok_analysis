package X;

import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.HashMap;
import java.util.Map;
import kotlin.text.Charsets;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pWY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1514880pWY implements InterfaceC473820Ii4 {
    public final Map<String, String> LIZ;
    public final JSONObject LIZIZ;
    public BPEAHandler LIZJ;
    public final long LIZLLL;
    public final long LJ;
    public int LJFF;
    public final RunnableC1514870pWX LJI;

    static {
        new Object() { // from class: X.0pWZ
        };
    }

    @Override // X.InterfaceC473820Ii4
    public final void LIZ() {
        if (this.LIZIZ == null || this.LIZJ != null) {
            return;
        }
        C20441214yg.LIZIZ("LivePreviewWatchHeartbeatImpl", "onPreviewResume");
        this.LIZJ = new BPEAHandler(Looper.getMainLooper());
        C2203431BLp c2203431BLp = C2203431BLp.LIZIZ;
        if (c2203431BLp.getState() == C0XE1.CONNECTION_UNKNOWN && C1ECM.LJFF) {
            c2203431BLp.LJ("live_preview");
        }
        BPEAHandler bPEAHandler = this.LIZJ;
        if (bPEAHandler != null) {
            C786410Ut5.LJLIIL(this.LIZLLL, bPEAHandler, this.LJI);
        }
    }

    @Override // X.InterfaceC473820Ii4
    public final void LIZIZ() {
        C20441214yg.LIZIZ("LivePreviewWatchHeartbeatImpl", "onPreviewPause");
        BPEAHandler bPEAHandler = this.LIZJ;
        if (bPEAHandler != null) {
            bPEAHandler.removeCallbacks(this.LJI);
        }
        this.LIZJ = null;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [X.0pWX] */
    public C1514880pWY(Map<String, String> map) {
        Long lValueOf;
        Long lValueOf2;
        this.LIZ = map;
        JSONObject jSONObject = null;
        try {
            JSONObject jSONObject2 = new JSONObject();
            HashMap map2 = (HashMap) map;
            String str = (String) map2.get("uid");
            if (str != null) {
                lValueOf = Long.valueOf(CastLongProtector.parseLong(str));
            } else {
                lValueOf = null;
            }
            jSONObject2.put("user_id", lValueOf);
            String str2 = (String) map2.get("roomId");
            if (str2 != null) {
                lValueOf2 = Long.valueOf(CastLongProtector.parseLong(str2));
            } else {
                lValueOf2 = null;
            }
            jSONObject2.put("room_id", lValueOf2);
            jSONObject2.put("enter_from_merge", map2.get("enterFromMerge"));
            jSONObject2.put("enter_method", map2.get("enterMethod"));
            jSONObject = jSONObject2;
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        this.LIZIZ = jSONObject;
        this.LIZLLL = ((long) C1ECM.LIZLLL) * 1000;
        this.LJ = ((long) C1ECM.LJ) * 1000;
        this.LJFF = 1;
        this.LJI = new Runnable() { // from class: X.0pWX
            public final void LIZ() {
                JSONObject jSONObject3;
                String strJ3;
                C1514880pWY c1514880pWY = this.LL;
                c1514880pWY.getClass();
                try {
                    JSONObject jSONObject4 = c1514880pWY.LIZIZ;
                    if (jSONObject4 != null) {
                        jSONObject4.put("action", c1514880pWY.LJFF);
                    }
                    JSONObject jSONObject5 = c1514880pWY.LIZIZ;
                    if (jSONObject5 != null) {
                        jSONObject5.put("timestamp", System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT));
                    }
                    jSONObject3 = c1514880pWY.LIZIZ;
                } catch (JSONException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
                byte[] bytes = (jSONObject3 == null || (strJ3 = C786410Ut5.J3(jSONObject3)) == null) ? null : strJ3.getBytes(Charsets.UTF_8);
                StringBuilder sb = new StringBuilder("sendMsg, roomId:");
                JSONObject jSONObject6 = c1514880pWY.LIZIZ;
                sb.append(jSONObject6 != null ? jSONObject6.get("room_id") : null);
                sb.append(", uid:");
                JSONObject jSONObject7 = c1514880pWY.LIZIZ;
                sb.append(jSONObject7 != null ? jSONObject7.get("user_id") : null);
                sb.append(", action:");
                sb.append(c1514880pWY.LJFF);
                sb.append(", enterFromMerge: ");
                JSONObject jSONObject8 = c1514880pWY.LIZIZ;
                sb.append(jSONObject8 != null ? jSONObject8.get("enter_from_merge") : null);
                C20441214yg.LIZIZ("LivePreviewWatchHeartbeatImpl", sb.toString());
                WsChannelMsg wsChannelMsg = new WsChannelMsg();
                wsChannelMsg.service = 67108942;
                wsChannelMsg.method = 1;
                wsChannelMsg.payload = bytes;
                wsChannelMsg.payloadType = "json";
                C2203431BLp c2203431BLp = C2203431BLp.LIZIZ;
                if (c2203431BLp.isConnected()) {
                    try {
                        c2203431BLp.LIZ(wsChannelMsg);
                        c1514880pWY.LJFF = 2;
                    } catch (Exception e3) {
                        TryCatchGuardChecker.doCheck(e3);
                        C20441214yg.LJI("LivePreviewWatchHeartbeatImpl", e3);
                    }
                }
                C1514880pWY c1514880pWY2 = this.LL;
                BPEAHandler bPEAHandler = c1514880pWY2.LIZJ;
                if (bPEAHandler != null) {
                    C786410Ut5.LJLIIL(c1514880pWY2.LJ, bPEAHandler, this);
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("LivePreviewWatchHeartbeatImpl@cc2.runnable$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("LivePreviewWatchHeartbeatImpl@cc2.runnable$1");
            }
        };
    }
}
