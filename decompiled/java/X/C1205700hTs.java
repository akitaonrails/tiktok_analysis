package X;

import android.os.SystemClock;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0hTs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1205700hTs {
    public final Function1<C1205760hTy, Unit> LIZ;

    public C1205700hTs() {
        this(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1205700hTs(Function1<? super C1205760hTy, Unit> function1) {
        this.LIZ = function1;
    }

    public static void LIZ(C1205700hTs c1205700hTs, String str, Map map, int i) {
        Map mapLJ;
        Map mapLJ2 = map;
        if ((i & 2) != 0) {
            mapLJ = C2097608Jq.LJ();
        } else {
            mapLJ = null;
        }
        if ((i & 4) != 0) {
            mapLJ2 = C2097608Jq.LJ();
        }
        Function1<C1205760hTy, Unit> function1 = c1205700hTs.LIZ;
        if (function1 != null) {
            function1.invoke(new C1205760hTy(str, mapLJ, mapLJ2, SystemClock.elapsedRealtime()));
        }
    }
}
