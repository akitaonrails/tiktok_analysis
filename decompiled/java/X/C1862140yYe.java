package X;

import com.ss.android.ugc.aweme.tako.ccl.model.api.ServerProcessInfo;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0yYe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public /* synthetic */ class C1862140yYe extends C2217421BqW implements InterfaceC1685420txc<Long, ServerProcessInfo, C1785090wYN, String, String, Unit> {
    public C1862140yYe(C1862130yYd c1862130yYd) {
        super(5, c1862130yYd, C1862130yYd.class, "onEventWholePacketReceived", "onEventWholePacketReceived(JLcom/ss/android/ugc/aweme/tako/ccl/model/api/ServerProcessInfo;Lcom/ss/android/ugc/aweme/tako/base/handlers/MessageChunkProxy$TrackChunkStreamCost;Ljava/lang/String;Ljava/lang/String;)V", 0);
    }

    @Override // X.InterfaceC1685420txc
    public final Unit invoke(Long l, ServerProcessInfo serverProcessInfo, C1785090wYN c1785090wYN, String str, String str2) {
        long jLongValue;
        long jLongValue2 = l.longValue();
        ServerProcessInfo serverProcessInfo2 = serverProcessInfo;
        C1785090wYN c1785090wYN2 = c1785090wYN;
        String str3 = str;
        String str4 = str2;
        this.receiver.getClass();
        C1862180yYi c1862180yYi = C1862130yYd.LJFF;
        if (c1862180yYi.LIZIZ != -1 && c1862180yYi.LJIILIIL == null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            c1862180yYi.LJ = jCurrentTimeMillis;
            Long lValueOf = Long.valueOf(jCurrentTimeMillis - c1862180yYi.LIZIZ);
            c1862180yYi.LJIILIIL = lValueOf;
            if (lValueOf != null) {
                jLongValue = lValueOf.longValue();
            } else {
                jLongValue = 0;
            }
            c1862180yYi.LIZ(Long.valueOf(jLongValue), "whole_packet_receive_cost");
            if (c1785090wYN2 != null) {
                c1862180yYi.LIZ(Long.valueOf(c1862180yYi.LJ - c1785090wYN2.LIZ), "chunk_stream_whole_packet_receive_cost");
            }
            Long l2 = c1862180yYi.LJIILIIL;
            if (l2 != null) {
                c1862180yYi.LIZ(Long.valueOf(l2.longValue() - jLongValue2), "whole_packet_net_cost");
            }
        }
        if (str3 != null) {
            C1862170yYh c1862170yYh = C1862130yYd.LJI;
            c1862170yYh.LJI = str3;
            c1862170yYh.LIZ(str3, "user_intent");
        }
        if (C1533950q1J.LJ(str4)) {
            C1862170yYh c1862170yYh2 = C1862130yYd.LJI;
            if (str4 != null) {
                c1862170yYh2.LIZ(str4, "message_id");
            } else {
                c1862170yYh2.getClass();
            }
        }
        if (serverProcessInfo2 != null && serverProcessInfo2.bizStateCode != null) {
            C1862170yYh c1862170yYh3 = C1862130yYd.LJI;
            Long l3 = serverProcessInfo2.bizStateCode;
            if (l3 != null) {
                c1862170yYh3.LIZ(l3, "biz_error_code");
            } else {
                c1862170yYh3.getClass();
            }
            String str5 = serverProcessInfo2.bizStateDesc;
            if (str5 != null) {
                c1862170yYh3.LIZ(str5, "biz_error_desc");
            } else {
                c1862170yYh3.getClass();
            }
            Integer num = serverProcessInfo2.hitEngineCache;
            if (num != null) {
                c1862170yYh3.LJII = num;
                c1862170yYh3.LIZ(num, "hit_engine_cache");
            } else {
                c1862170yYh3.getClass();
            }
            Integer num2 = serverProcessInfo2.isMultiAnswer;
            if (num2 != null) {
                c1862170yYh3.LIZ(num2, "is_multi_answer");
            } else {
                c1862170yYh3.getClass();
            }
            String str6 = serverProcessInfo2.botIntent;
            if (str6 != null) {
                c1862170yYh3.LIZ(str6, "bot_intent");
            } else {
                c1862170yYh3.getClass();
            }
            Integer num3 = serverProcessInfo2.useEngineSearch;
            if (num3 != null) {
                c1862170yYh3.LIZ(num3, "use_engine_search");
            } else {
                c1862170yYh3.getClass();
            }
        }
        return Unit.LIZ;
    }
}
