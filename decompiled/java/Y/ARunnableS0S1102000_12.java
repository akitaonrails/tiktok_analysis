package Y;

import X.C0IJT;
import X.C1161920gLG;
import X.C1273890jFr;
import X.C1C7U;
import X.C20441214yg;
import X.C2188811AlT;
import X.C474500IjA;
import X.C762040Tus;
import X.C781270Ukn;
import X.C930940aKi;
import X.InterfaceC774920UaY;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdk.broadcast.trymode.TryModeBroadcastFragment;
import com.bytedance.android.livesdk.broadcast.video.LiveBroadcastFragment;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.AFwS245S0000000_12;
import kotlin.jvm.internal.AwS591S0100000_12;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public class ARunnableS0S1102000_12 implements Runnable {
    public final int $t;
    public int i2;
    public int i3;
    public Object l1;
    public String s0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        double dOptDouble;
        double dOptDouble2;
        int i = this.i2;
        if (i == 35) {
            if (this.i3 == 1) {
                double dOptDouble3 = 0.0d;
                try {
                    String str = this.s0;
                    JSONObject jSONObject = new JSONObject(str != null ? str : "");
                    dOptDouble = jSONObject.optDouble("cost_time", 0.0d);
                    try {
                        dOptDouble2 = jSONObject.optDouble("bright_before", 0.0d);
                        try {
                            dOptDouble3 = jSONObject.optDouble("bright_after", 0.0d);
                        } catch (Exception e) {
                            e = e;
                            TryCatchGuardChecker.doCheck(e);
                            C20441214yg.LJII(e);
                        }
                    } catch (Exception e2) {
                        e = e2;
                        dOptDouble2 = 0.0d;
                    }
                } catch (Exception e3) {
                    e = e3;
                    dOptDouble = 0.0d;
                    dOptDouble2 = 0.0d;
                }
                InterfaceC774920UaY interfaceC774920UaY = ((C1273890jFr) this.l1).LJIIJ;
                if (interfaceC774920UaY != null) {
                    interfaceC774920UaY.vn(dOptDouble2, dOptDouble3, dOptDouble);
                    return;
                }
                return;
            }
            return;
        }
        if (i == 50) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("message:");
            sbLIZ.append(this.s0);
            C20441214yg.LIZIZ("LiveStreamTag", C2188811AlT.LIZIZ(sbLIZ));
            try {
                IInteractService iInteractService = (IInteractService) C1161920gLG.LIZJ(IInteractService.class);
                String str2 = iInteractService.UN0() ? "Multi-Guest&Cohost" : iInteractService.w9() ? "Cohost" : iInteractService.o1() ? "Multi-Guest" : "General";
                String str3 = this.s0;
                if (str3 == null) {
                    str3 = "";
                }
                JSONObject jSONObjectOptJSONObject = new JSONObject(str3).optJSONObject("bleep");
                if (jSONObjectOptJSONObject == null) {
                    jSONObjectOptJSONObject = new JSONObject();
                }
                JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("segments");
                JSONArray jSONArray = new JSONArray();
                if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                    int length = jSONArrayOptJSONArray.length();
                    for (int i2 = 0; i2 < length; i2++) {
                        JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i2);
                        if (jSONObjectOptJSONObject2 != null) {
                            String strOptString = jSONObjectOptJSONObject2.optString("text", "");
                            if (strOptString.length() > 0) {
                                jSONArray.put(strOptString);
                            }
                        }
                    }
                }
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_audio_auto_bleep_recognized");
                DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
                Room room = (Room) dataChannelGlobal.gg0(C930940aKi.class);
                c474500IjALIZ.LJJII(room != null ? Long.valueOf(room.getOwnerUserId()) : null, "anchor_id");
                Room room2 = (Room) dataChannelGlobal.gg0(C930940aKi.class);
                c474500IjALIZ.LJJII(room2 != null ? Long.valueOf(room2.getId()) : null, "room_id");
                Room room3 = (Room) dataChannelGlobal.gg0(C930940aKi.class);
                c474500IjALIZ.LJJII(room3 != null ? Long.valueOf(room3.getOwnerUserId()) : null, "bleep_source_user_id");
                c474500IjALIZ.LJJII(jSONArray.toString(), "bleep_key_words");
                c474500IjALIZ.LJJII(str2, "live_room_type");
                c474500IjALIZ.LJJII(jSONObjectOptJSONObject.optString("action_time_unix"), "action_time_unix");
                c474500IjALIZ.LIZ();
            } catch (Exception e4) {
                TryCatchGuardChecker.doCheck(e4);
                C20441214yg.LJII(e4);
            }
        }
    }

    public static final void run$0(ARunnableS0S1102000_12 aRunnableS0S1102000_12) {
        boolean zLIZ;
        C1C7U.LIZ("LiveStream@b84d.infoListener$1$onInfo$1");
        try {
            aRunnableS0S1102000_12.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveStream@b84d.infoListener$1$onInfo$1");
    }

    public static final void run$1(ARunnableS0S1102000_12 aRunnableS0S1102000_12) {
        boolean zLIZ;
        C1C7U.LIZ("TryModeBroadcastFragment@9777.stateListener$1$onInfo$1");
        try {
            C781270Ukn.LJI().showEffectTextInputDialog(((TryModeBroadcastFragment) aRunnableS0S1102000_12.l1).getDataChannel(), new C762040Tus(aRunnableS0S1102000_12.i2, aRunnableS0S1102000_12.i3, aRunnableS0S1102000_12.s0), new AwS591S0100000_12((TryModeBroadcastFragment) aRunnableS0S1102000_12.l1, 461));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TryModeBroadcastFragment@9777.stateListener$1$onInfo$1");
    }

    public static final void run$2(ARunnableS0S1102000_12 aRunnableS0S1102000_12) {
        boolean zLIZ;
        C1C7U.LIZ("LiveBroadcastFragment@d956.stateListener$1$onInfo$1");
        try {
            C781270Ukn.LJI().showEffectTextInputDialog(((LiveBroadcastFragment) aRunnableS0S1102000_12.l1).getDataChannel(), new C762040Tus(aRunnableS0S1102000_12.i2, aRunnableS0S1102000_12.i3, aRunnableS0S1102000_12.s0), AFwS245S0000000_12.get$arr$(47));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveBroadcastFragment@d956.stateListener$1$onInfo$1");
    }

    public ARunnableS0S1102000_12(int i, int i2, String str, Object obj, int i3) {
        this.$t = i3;
        this.i2 = i;
        this.i3 = i2;
        this.s0 = str;
        this.l1 = obj;
    }
}
