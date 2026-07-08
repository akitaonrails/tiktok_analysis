package X;

import com.ss.android.ugc.aweme.tako.ccl.model.api.ServerProcessInfo;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0yYW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public /* synthetic */ class C1862060yYW extends C2217421BqW implements InterfaceC1631620sYq<ServerProcessInfo, C1785090wYN, String, Unit> {
    public C1862060yYW(C1862130yYd c1862130yYd) {
        super(3, c1862130yYd, C1862130yYd.class, "onEventFirstPacketReceived", "onEventFirstPacketReceived(Lcom/ss/android/ugc/aweme/tako/ccl/model/api/ServerProcessInfo;Lcom/ss/android/ugc/aweme/tako/base/handlers/MessageChunkProxy$TrackChunkStreamCost;Ljava/lang/String;)V", 0);
    }

    @Override // X.InterfaceC1631620sYq
    public final Unit invoke(ServerProcessInfo serverProcessInfo, C1785090wYN c1785090wYN, String str) {
        long jLongValue;
        ServerProcessInfo serverProcessInfo2 = serverProcessInfo;
        C1785090wYN c1785090wYN2 = c1785090wYN;
        String str2 = str;
        this.receiver.getClass();
        C1862180yYi c1862180yYi = C1862130yYd.LJFF;
        if (c1862180yYi.LIZIZ != -1 && serverProcessInfo2 != null && c1862180yYi.LJIIIZ == null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            c1862180yYi.LIZLLL = jCurrentTimeMillis;
            Long lValueOf = Long.valueOf(jCurrentTimeMillis - c1862180yYi.LIZIZ);
            c1862180yYi.LJIIIZ = lValueOf;
            long jLongValue2 = 0;
            if (lValueOf != null) {
                jLongValue = lValueOf.longValue();
            } else {
                jLongValue = 0;
            }
            c1862180yYi.LIZ(Long.valueOf(jLongValue), "first_packet_cost");
            if (c1785090wYN2 != null) {
                c1862180yYi.LIZ(Long.valueOf(c1862180yYi.LIZLLL - c1785090wYN2.LIZ), "chunk_stream_first_packet_cost");
            }
            Long l = c1862180yYi.LJIIIZ;
            if (l != null) {
                Long lValueOf2 = Long.valueOf(((l.longValue() - serverProcessInfo2.serverChunkLatency) - serverProcessInfo2.engineChunkLatency) - (c1862180yYi.LIZJ - c1862180yYi.LIZIZ));
                c1862180yYi.LJIIJ = lValueOf2;
                if (lValueOf2 != null) {
                    jLongValue2 = lValueOf2.longValue();
                }
                c1862180yYi.LIZ(Long.valueOf(jLongValue2), "first_packet_net_cost");
                c1862180yYi.LIZ(Long.valueOf(serverProcessInfo2.serverChunkLatency), "first_packet_server_cost");
                c1862180yYi.LIZ(Long.valueOf(serverProcessInfo2.engineChunkLatency), "first_packet_engine_cost");
                C1862130yYd.LIZ.getClass();
                C1862170yYh c1862170yYh = C1862130yYd.LJI;
                if (c1862170yYh.LIZJ == null) {
                    c1862170yYh.LIZJ = str2;
                    if (str2 == null) {
                        str2 = "";
                    }
                    c1862170yYh.LIZ(str2, "tako_log_id");
                }
            }
        }
        return Unit.LIZ;
    }
}
