package X;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Ya0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class C876500Ya0 extends C2217421BqW implements Function2<List<? extends C0Y8T>, Long, Boolean> {
    public C876500Ya0(C876680YaI c876680YaI) {
        super(2, c876680YaI, C876680YaI.class, "onGetConversationsFromLocalCompensation", "onGetConversationsFromLocalCompensation(Ljava/util/List;J)Z", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Boolean invoke(List<? extends C0Y8T> list, Long l) {
        List<? extends C0Y8T> list2 = list;
        long jLongValue = l.longValue();
        C876680YaI c876680YaI = (C876680YaI) this.receiver;
        c876680YaI.getClass();
        EnumC876540Ya4 enumC876540Ya4 = EnumC876540Ya4.RESHOW_UNREAD_CONVERSATION;
        boolean z = false;
        if (!list2.isEmpty()) {
            C876800YaU.LIZ(c876680YaI.LIZLLL, "try_enqueue_conversations", C1906580ziK.LJI());
            if (c876680YaI.LJFF.LIZLLL(false)) {
                C876800YaU.LIZ(c876680YaI.LIZLLL, "discard_conversations_enqueue", C1906580ziK.LJI());
            } else {
                C879090YeB c879090YeBLIZIZ = c876680YaI.LIZIZ();
                List<C876550Ya5> list3 = c879090YeBLIZIZ.LIZLLL;
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
                for (C0Y8T c0y8t : list2) {
                    C876550Ya5.LJI.getClass();
                    arrayList.add(new C876550Ya5(EnumC876650YaF.CONVERSATION, enumC876540Ya4, null, c0y8t, c0y8t.getConversationId(), null, 100));
                }
                list3.addAll(arrayList);
                C876800YaU c876800YaU = c879090YeBLIZIZ.LIZ;
                if (c876800YaU != null) {
                    C876800YaU.LIZ(c876800YaU, "enqueue_conv_to_aggregated_push", C1906580ziK.LJI());
                }
                c876680YaI.LJ(Math.max((30000 - C876390YZp.LJIIIZ) - (SystemClock.elapsedRealtime() - jLongValue), 0L));
                z = true;
            }
        }
        c876680YaI.LIZLLL(EnumC876540Ya4.RESHOW_UNREAD_CONVERSATION, jLongValue);
        return Boolean.valueOf(z);
    }
}
