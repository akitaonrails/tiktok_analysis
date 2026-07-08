package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0UTR, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class C0UTR extends C2217421BqW implements Function1<C0UTQ, Map<String, String>> {
    public C0UTR(Object obj) {
        super(1, obj, C0UTP.class, "onLiveCoreInitDone", "onLiveCoreInitDone(Lcom/bytedance/android/livesdk/broadcast/utils/log/GoLiveEventData;)Ljava/util/Map;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Map<String, String> invoke(C0UTQ c0utq) {
        long jLIZ;
        C0UTQ c0utq2 = c0utq;
        this.receiver.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C0UTP c0utp = C0UTP.LIZ;
        long j = c0utq2.LIZ;
        long j2 = c0utq2.LJIIIIZZ;
        long j3 = c0utq2.LJIIJJI;
        c0utp.getClass();
        linkedHashMap.put("t_live_core_init", String.valueOf(C0UTP.LIZ(j, j2, j3)));
        long j4 = c0utq2.LJIIL;
        if (j4 == 0) {
            jLIZ = 0;
        } else {
            jLIZ = C0UTP.LIZ(c0utq2.LIZ, c0utq2.LJIIIIZZ, j4);
        }
        if (c0utq2.LJIILIIL == 0) {
            linkedHashMap.put("t_live_core_init_success", String.valueOf(Math.max(jLIZ, 0L)));
            linkedHashMap.put("r_live_core_init_error_code", CardStruct.IStatusCode.DEFAULT);
            return linkedHashMap;
        }
        linkedHashMap.put("t_live_core_init_fail", String.valueOf(jLIZ));
        linkedHashMap.put("r_live_core_init_error_code", String.valueOf(c0utq2.LJIILIIL));
        return linkedHashMap;
    }
}
