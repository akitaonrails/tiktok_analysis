package X;

import android.os.SystemClock;
import com.bytedance.android.livesdkapi.ws.LiveWsMessage;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ugc.live.sdk.message.MessageMonitor;
import com.ss.ugc.live.sdk.message.data.PayloadItem;
import com.ss.ugc.live.sdk.message.interfaces.IMessageWsClient;
import java.util.HashMap;

/* JADX INFO: renamed from: X.1Bxg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2221861Bxg implements InterfaceC1528010prj {
    public boolean LIZ;
    public final String LIZIZ;
    public final HashMap<String, String> LIZJ;
    public final /* synthetic */ C2221851Bxf LIZLLL;

    @Override // X.InterfaceC1528010prj
    public final void LIZ(LiveWsMessage liveWsMessage) {
        try {
            C2221851Bxf c2221851Bxf = this.LIZLLL;
            if (c2221851Bxf.LIZLLL != null) {
                PayloadItem payloadItemLIZLLL = C2221851Bxf.LIZLLL(liveWsMessage);
                if (payloadItemLIZLLL.getExtraParams() != null) {
                    payloadItemLIZLLL.getMessageTrackTimeInfo().receiveMessageTime = C158B.LIZ();
                    payloadItemLIZLLL.getExtraParams().put(MessageMonitor.getLiveMessageStageName("all_time", MessageMonitor.Stage.START), Long.valueOf(SystemClock.elapsedRealtime()));
                }
                IMessageWsClient.Callback callback = c2221851Bxf.LIZLLL;
                if (callback != null) {
                    callback.onWebSocketMessage(payloadItemLIZLLL);
                }
                C2221821Bxc.LJIIJJI(liveWsMessage);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LJFF("LiveWs", "receive message error", e);
            C2221821Bxc.LJIIJ(liveWsMessage, e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:136:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008c  */
    @Override // X.InterfaceC1528010prj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(X.EnumC1527990prh r25, org.json.JSONObject r26) {
        /*
            Method dump skipped, instruction units count: 904
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2221861Bxg.LIZIZ(X.0prh, org.json.JSONObject):void");
    }

    public C2221861Bxg(String str, HashMap<String, String> map, C2221851Bxf c2221851Bxf) {
        this.LIZLLL = c2221851Bxf;
        this.LIZIZ = str;
        this.LIZJ = map;
    }
}
