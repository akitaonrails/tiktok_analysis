package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0UTT, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class C0UTT extends C2217421BqW implements Function1<C0UTQ, Map<String, String>> {
    public C0UTT(Object obj) {
        super(1, obj, C0UTP.class, "onFirstPingAnchorDone", "onFirstPingAnchorDone(Lcom/bytedance/android/livesdk/broadcast/utils/log/GoLiveEventData;)Ljava/util/Map;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Map<String, String> invoke(C0UTQ c0utq) {
        C0UTQ c0utq2 = c0utq;
        this.receiver.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C0UTP c0utp = C0UTP.LIZ;
        long j = c0utq2.LIZ;
        long j2 = c0utq2.LJIIIIZZ;
        long j3 = c0utq2.LJIILLIIL;
        c0utp.getClass();
        long jLIZ = C0UTP.LIZ(j, j2, j3);
        if (c0utq2.LJIIZILJ == 0) {
            linkedHashMap.put("t_ping_anchor_first_success", String.valueOf(jLIZ));
            linkedHashMap.put("r_ping_anchor_error_code", CardStruct.IStatusCode.DEFAULT);
            return linkedHashMap;
        }
        linkedHashMap.put("t_ping_anchor_fail", String.valueOf(jLIZ));
        linkedHashMap.put("r_ping_anchor_error_code", String.valueOf(c0utq2.LJIIZILJ));
        return linkedHashMap;
    }
}
