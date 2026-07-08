package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0T9r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C742250T9r {
    public final long LIZ;
    public final long LIZIZ;
    public final long LIZJ;
    public final boolean LIZLLL;
    public final ConcurrentHashMap<String, String> LJ;

    public final Map<String, String> LIZ() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("network_time_cost", String.valueOf(this.LIZIZ - this.LIZ));
        linkedHashMap.put("post_process_time_cost", String.valueOf(this.LIZJ - this.LIZIZ));
        linkedHashMap.put("process_time_cost", String.valueOf(this.LIZJ - this.LIZ));
        linkedHashMap.put("is_success", this.LIZLLL ? CardStruct.IStatusCode.DEFAULT : "1");
        for (Map.Entry<String, String> entry : this.LJ.entrySet()) {
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        return linkedHashMap;
    }

    public C742250T9r(long j, long j2, long j3, boolean z, ConcurrentHashMap concurrentHashMap) {
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = j3;
        this.LIZLLL = z;
        this.LJ = concurrentHashMap;
    }
}
