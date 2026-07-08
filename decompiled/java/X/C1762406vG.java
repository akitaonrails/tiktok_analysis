package X;

import android.os.SystemClock;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;

/* JADX INFO: renamed from: X.06vG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1762406vG {
    public static final ConcurrentHashMap<String, C1762406vG> LIZLLL = new ConcurrentHashMap<>();
    public static Boolean LJ;
    public final boolean LIZ;
    public final long LIZIZ;
    public final InterfaceC1762506vH LIZJ;

    public final void LIZIZ() {
        LIZ(C1761806vA.LIZ(new Pair("stage", "message_task"), new Pair("step", "send"), new Pair("time", LIZJ())));
    }

    public final String LIZJ() {
        return String.valueOf(SystemClock.uptimeMillis() - this.LIZIZ);
    }

    public final void LIZ(Map<String, String> map) {
        if (this.LIZ) {
            this.LIZJ.LIZIZ(map);
        }
    }

    public C1762406vG(boolean z, long j, C1762606vI c1762606vI) {
        this.LIZ = z;
        this.LIZIZ = j;
        this.LIZJ = c1762606vI;
    }
}
