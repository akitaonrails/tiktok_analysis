package X;

import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0ciX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1022590ciX {
    public final long LIZ;
    public final String LIZIZ;

    public final Map<String, Object> LIZ() {
        return C2097608Jq.LJIIJ(new Pair("track_now_time", Long.valueOf(this.LIZ)), new Pair("track_thread_name", this.LIZIZ));
    }

    public C1022590ciX() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        String name = C786410Ut5.u3().getName();
        this.LIZ = jCurrentTimeMillis;
        this.LIZIZ = name;
    }
}
