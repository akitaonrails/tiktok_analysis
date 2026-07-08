package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0yWg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public /* synthetic */ class C1860920yWg extends C2217421BqW implements Function2<String, C1785090wYN, Unit> {
    public C1860920yWg(C1862130yYd c1862130yYd) {
        super(2, c1862130yYd, C1862130yYd.class, "onGeneratingMessage", "onGeneratingMessage(Ljava/lang/String;Lcom/ss/android/ugc/aweme/tako/base/handlers/MessageChunkProxy$TrackChunkStreamCost;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(String str, C1785090wYN c1785090wYN) {
        long jLongValue;
        String str2 = str;
        C1785090wYN c1785090wYN2 = c1785090wYN;
        this.receiver.getClass();
        if (str2 == null) {
            str2 = "";
        }
        C1862130yYd.LIZJ = str2;
        C1862180yYi c1862180yYi = C1862130yYd.LJFF;
        if (c1862180yYi.LIZIZ != -1 && c1862180yYi.LJIIIIZZ == null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            Long lValueOf = Long.valueOf(jCurrentTimeMillis - c1862180yYi.LIZIZ);
            c1862180yYi.LJIIIIZZ = lValueOf;
            if (lValueOf != null) {
                jLongValue = lValueOf.longValue();
            } else {
                jLongValue = 0;
            }
            c1862180yYi.LIZ(Long.valueOf(jLongValue), "generating_chunk_cost");
            if (c1785090wYN2 != null) {
                c1862180yYi.LIZ(Long.valueOf(jCurrentTimeMillis - c1785090wYN2.LIZ), "chunk_stream_generating_cost");
            }
        }
        return Unit.LIZ;
    }
}
