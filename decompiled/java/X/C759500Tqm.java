package X;

import android.os.Handler;
import android.os.Looper;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.AwS161S1100000_12;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Tqm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C759500Tqm {
    public static final C01GW<C759500Tqm> LJ = C452501pT.LIZ(EnumC452301pR.SYNCHRONIZED, AFwS199S0000000_12.get$arr$(513));
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(514));
    public final ConcurrentHashMap<String, C1894200zOM> LIZIZ = new ConcurrentHashMap<>();
    public final HashSet<String> LIZJ = new HashSet<>();
    public final C01GW LIZLLL;

    public C759500Tqm() {
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(515));
        this.LIZLLL = c01gwLIZIZ;
        C1537060q6K c1537060q6K = C1529590puH.LIZ;
        C1537060q6K.LJIIL((C1051630dTN) c01gwLIZIZ.getValue(), Boolean.FALSE);
    }

    public final void LIZ(String str) {
        Iterator<Map.Entry<String, C1894200zOM>> it2 = this.LIZIZ.entrySet().iterator();
        while (it2.hasNext()) {
            C1894200zOM value = it2.next().getValue();
            value.getClass();
            C01U6.LIZIZ(new AwS161S1100000_12(value, str, 8));
        }
        this.LIZIZ.clear();
    }

    public final C1894200zOM LIZJ(String str) {
        C1894200zOM c1894200zOM = this.LIZIZ.get(str);
        if (c1894200zOM == null) {
            C1894220zOO.LIZ(-2, str, "preloadInstance null when getPreloadInstance");
            return null;
        }
        return c1894200zOM;
    }

    public final void LIZLLL(Runnable runnable) {
        if (Intrinsics.LJFF(C786410Ut5.u3(), Looper.getMainLooper().getThread())) {
            runnable.run();
        } else {
            C786410Ut5.LJJZZIII((Handler) this.LIZ.getValue(), runnable);
        }
    }

    public final void LIZIZ(String str, String str2) {
        C1894200zOM c1894200zOM = this.LIZIZ.get(str);
        if (c1894200zOM == null) {
            return;
        }
        C01U6.LIZIZ(new AwS161S1100000_12(c1894200zOM, str2, 8));
        this.LIZIZ.remove(str);
    }
}
