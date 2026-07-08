package X;

import android.os.SystemClock;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.18UT, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18UT {
    public static final /* synthetic */ int LJIIIIZZ = 0;
    public final long LIZ;
    public C18UV LIZIZ;
    public final ConcurrentHashMap<String, Long> LIZJ;
    public final ConcurrentHashMap<String, Long> LIZLLL;
    public Long LJ;
    public Long LJFF;
    public Long LJI;
    public Long LJII;

    public C18UT() {
        this(0);
    }

    public C18UT(int i) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        C18UV c18uv = C18UV.PARAMS2MESSAGE;
        this.LIZ = jUptimeMillis;
        this.LIZIZ = c18uv;
        this.LIZJ = new ConcurrentHashMap<>();
        this.LIZLLL = new ConcurrentHashMap<>();
    }

    public final void LIZIZ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onEndUploadPhoto: ");
        sbLIZ.append(str);
        C21290818Tq.LIZJ("AiChatSendMessageStageTracker", C2188811AlT.LIZIZ(sbLIZ));
        this.LIZLLL.put(str, Long.valueOf(SystemClock.uptimeMillis()));
    }

    public final Long LIZJ(String str) {
        Long l;
        Long l2;
        if (str == null) {
            l = (Long) C13LP.LJJLL(this.LIZJ.values());
            l2 = (Long) C13LP.LJJLIIIJLJLI(this.LIZLLL.values());
        } else {
            l = this.LIZJ.get(str);
            l2 = this.LIZLLL.get(str);
        }
        return LIZ(l, l2);
    }

    public static Long LIZ(Long l, Long l2) {
        if (l2 != null && l != null) {
            return Long.valueOf(l2.longValue() - l.longValue());
        }
        return null;
    }
}
