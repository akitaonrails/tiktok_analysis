package Y;

import X.C09JN;
import X.C1161920gLG;
import X.C1C7U;
import X.C20441214yg;
import X.C465680INy;
import com.bytedance.android.live.livepullstream.api.IPullStreamService;
import com.bytedance.android.livesdkapi.host.IHostNetwork;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public class AfS27S2100000_12 implements C09JN {
    public final int $t;
    public Object l2;
    public String s0;
    public String s1;

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
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void accept$0(Y.AfS27S2100000_12 r10, java.lang.Object r11) {
        /*
            java.lang.String r2 = "LiveBroadcastFragment@d956.sendSubscribeSEI$1"
            X.C1C7U.LIZ(r2)
            com.bytedance.ies.sdk.datachannel.DataChannelGlobal r1 = com.bytedance.ies.sdk.datachannel.DataChannelGlobal.LLILZ
            java.lang.Class<X.0aKd> r0 = X.C930890aKd.class
            java.lang.Object r0 = r1.gg0(r0)
            X.0UIe r0 = (X.InterfaceC769940UIe) r0
            if (r0 == 0) goto L17
            X.0jFs r3 = r0.getLiveCore()
            if (r3 != 0) goto L21
        L17:
            java.lang.Object r0 = r10.l2
            com.bytedance.android.livesdk.broadcast.video.LiveBroadcastFragment r0 = (com.bytedance.android.livesdk.broadcast.video.LiveBroadcastFragment) r0
            X.0jFr r0 = r0.LLLI
            if (r0 == 0) goto L2f
            X.0jFs r3 = r0.LJI
        L21:
            if (r3 == 0) goto L2f
            java.lang.String r4 = r10.s0
            java.lang.String r9 = "1"
            r8 = 1
            r5 = 0
            java.lang.String r7 = r10.s1
            r6 = r5
            r3.LJJIZ(r4, r5, r6, r7, r8, r9)
        L2f:
            X.C1C7U.LIZIZ(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS27S2100000_12.accept$0(Y.AfS27S2100000_12, java.lang.Object):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void accept$1(Y.AfS27S2100000_12 r10, java.lang.Object r11) {
        /*
            java.lang.String r2 = "VoiceChatBroadcastFragment@4fc.sendSubscribeSEI$1"
            X.C1C7U.LIZ(r2)
            com.bytedance.ies.sdk.datachannel.DataChannelGlobal r1 = com.bytedance.ies.sdk.datachannel.DataChannelGlobal.LLILZ
            java.lang.Class<X.0aKd> r0 = X.C930890aKd.class
            java.lang.Object r0 = r1.gg0(r0)
            X.0UIe r0 = (X.InterfaceC769940UIe) r0
            if (r0 == 0) goto L17
            X.0jFs r3 = r0.getLiveCore()
            if (r3 != 0) goto L21
        L17:
            java.lang.Object r0 = r10.l2
            com.bytedance.android.livesdk.broadcast.voicechat.VoiceChatBroadcastFragment r0 = (com.bytedance.android.livesdk.broadcast.voicechat.VoiceChatBroadcastFragment) r0
            X.0jFr r0 = r0.LLJJJ
            if (r0 == 0) goto L2f
            X.0jFs r3 = r0.LJI
        L21:
            if (r3 == 0) goto L2f
            java.lang.String r4 = r10.s0
            java.lang.String r9 = "1"
            r8 = 1
            r5 = 0
            java.lang.String r7 = r10.s1
            r6 = r5
            r3.LJJIZ(r4, r5, r6, r7, r8, r9)
        L2f:
            X.C1C7U.LIZIZ(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS27S2100000_12.accept$1(Y.AfS27S2100000_12, java.lang.Object):void");
    }

    public static final void accept$2(AfS27S2100000_12 afS27S2100000_12, Object obj) {
        C1C7U.LIZ("DualDeviceTTLHReporter@2b2a.reportTTLHEvent$dispose$1");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("live_platform_version", C465680INy.LIZ());
            jSONObject.put("event_key", "business_api_monitor");
            jSONObject.put("product_line", "live");
            jSONObject.put("mode", "push");
            jSONObject.put("project_key", "live-stream-sdk");
            jSONObject.put("api", afS27S2100000_12.s0);
            Long l = (Long) afS27S2100000_12.l2;
            if (l != null) {
                jSONObject.put("room_id", String.valueOf(l.longValue()));
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("str", afS27S2100000_12.s1);
            jSONObject2.put("is_ws_connected", ((IHostNetwork) C1161920gLG.LIZJ(IHostNetwork.class)).isWsConnected());
            jSONObject.put("message", jSONObject2);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C20441214yg.LJI("StreamLog", th);
        }
        ((IPullStreamService) C1161920gLG.LIZJ(IPullStreamService.class)).Xj1().B0(jSONObject, true);
        C1C7U.LIZIZ("DualDeviceTTLHReporter@2b2a.reportTTLHEvent$dispose$1");
    }

    public AfS27S2100000_12(Object obj, String str, String str2, int i) {
        this.$t = i;
        this.l2 = obj;
        this.s0 = str;
        this.s1 = str2;
    }
}
