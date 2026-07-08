package X;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0YZz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class C876490YZz extends C2217421BqW implements Function2<List<? extends String>, Long, Boolean> {
    public C876490YZz(C876680YaI c876680YaI) {
        super(2, c876680YaI, C876680YaI.class, "onGetMessageRequest", "onGetMessageRequest(Ljava/util/List;J)Z", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Boolean invoke(List<? extends String> list, Long l) {
        List<? extends String> list2 = list;
        long jLongValue = l.longValue();
        C876680YaI c876680YaI = (C876680YaI) this.receiver;
        c876680YaI.getClass();
        boolean z = false;
        if (!list2.isEmpty()) {
            C876800YaU.LIZ(c876680YaI.LIZLLL, "try_enqueue_message_request", C1906580ziK.LJI());
            if (!c876680YaI.LJFF.LIZLLL(false)) {
                C879090YeB c879090YeBLIZIZ = c876680YaI.LIZIZ();
                EnumC876540Ya4 enumC876540Ya4 = EnumC876540Ya4.MESSAGE_REQUEST_AGGREGATED;
                List<C876550Ya5> list3 = c879090YeBLIZIZ.LJ;
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
                for (String str : list2) {
                    C876550Ya5.LJI.getClass();
                    arrayList.add(new C876550Ya5(EnumC876650YaF.SINGLE_CHAT_CONVERSATION_ID, enumC876540Ya4, null, null, str, null, 108));
                }
                list3.addAll(arrayList);
                C876800YaU c876800YaU = c879090YeBLIZIZ.LIZ;
                if (c876800YaU != null) {
                    C876800YaU.LIZ(c876800YaU, "enqueue_conv_id_to_message_request_aggregated_push", C1906580ziK.LJI());
                }
                c876680YaI.LJ(Math.max((30000 - C876390YZp.LJIIIZ) - (SystemClock.elapsedRealtime() - jLongValue), 0L));
                z = true;
            } else {
                C876800YaU.LIZ(c876680YaI.LIZLLL, "discard_message_request", C1906580ziK.LJI());
            }
        }
        return Boolean.valueOf(z);
    }
}
