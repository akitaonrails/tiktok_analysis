package X;

import android.os.SystemClock;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0Ya2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class C876520Ya2 extends C2217421BqW implements InterfaceC1631620sYq<List<? extends C869590Y9l>, Integer, Long, Unit> {
    public C876520Ya2(C876680YaI c876680YaI) {
        super(3, c876680YaI, C876680YaI.class, "onGetMsgFromLocalCompensation", "onGetMsgFromLocalCompensation(Ljava/util/List;IJ)V", 0);
    }

    @Override // X.InterfaceC1631620sYq
    public final Unit invoke(List<? extends C869590Y9l> list, Integer num, Long l) {
        List<? extends C869590Y9l> list2 = list;
        int iIntValue = num.intValue();
        long jLongValue = l.longValue();
        C876680YaI c876680YaI = (C876680YaI) this.receiver;
        c876680YaI.getClass();
        if (!list2.isEmpty()) {
            C876800YaU.LIZ(c876680YaI.LIZLLL, "try_enqueue_compensation_msg", C1906580ziK.LJI());
            int size = c876680YaI.LJFF(list2, EnumC876540Ya4.REVIEW_MSG_RECEIVED_IN_BACKGROUND).size();
            long jElapsedRealtime = SystemClock.elapsedRealtime() - jLongValue;
            if (size > 0) {
                c876680YaI.LJ(Math.max((30000 - C876390YZp.LJIIIZ) - jElapsedRealtime, 0L));
            }
            c876680YaI.LIZLLL.LIZIZ.sendEvent("query_db_for_review_msg_received_in_bg", C2097608Jq.LJIIIIZZ(new Pair("time_consume_in_ms", String.valueOf(jElapsedRealtime)), new Pair("need_review_msg_num", String.valueOf(iIntValue)), new Pair("message_num", String.valueOf(list2.size())), new Pair("enqueued_message_num", String.valueOf(size))));
        }
        c876680YaI.LIZLLL(EnumC876540Ya4.REVIEW_MSG_RECEIVED_IN_BACKGROUND, jLongValue);
        return Unit.LIZ;
    }
}
