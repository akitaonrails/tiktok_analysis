package X;

import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0z0t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1879650z0t {
    public final String LIZ;
    public long LIZIZ;
    public long LIZJ;
    public long LIZLLL;

    public C1879650z0t(String str) {
        this.LIZ = str;
    }

    public final void LIZ(String str, String str2) {
        long j;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (Intrinsics.LJFF(str, "prev")) {
            j = this.LIZIZ;
        } else if (Intrinsics.LJFF(str, "next")) {
            j = this.LIZJ;
        } else {
            j = 0;
        }
        C20684815ws.LJIILLIIL("ac_load_more_end", C2097608Jq.LJIIIIZZ(new Pair("start_timestamp", String.valueOf(j)), new Pair("end_timestamp", String.valueOf(jCurrentTimeMillis)), new Pair("duration", String.valueOf(jCurrentTimeMillis - j)), new Pair("react_id", this.LIZ), new Pair("page_name", "watch_history"), new Pair("direction", str), new Pair("cursor", str2), new Pair("is_exp", String.valueOf(1))));
    }

    public final void LIZIZ(String str, String str2) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (Intrinsics.LJFF(str, "prev")) {
            this.LIZIZ = jCurrentTimeMillis;
        } else if (Intrinsics.LJFF(str, "next")) {
            this.LIZJ = jCurrentTimeMillis;
        }
        C20684815ws.LJIILLIIL("ac_load_more_start", C2097608Jq.LJIIIIZZ(new Pair("start_timestamp", String.valueOf(jCurrentTimeMillis)), new Pair("react_id", this.LIZ), new Pair("page_name", "watch_history"), new Pair("direction", str), new Pair("cursor", str2), new Pair("is_exp", String.valueOf(1))));
    }
}
