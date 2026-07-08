package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.text.NumberFormat;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0DQn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C338950DQn {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(long j) {
        Object c098200Yq;
        try {
            c098200Yq = NumberFormat.getNumberInstance().format(j);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            c098200Yq = String.valueOf(j);
        }
        return (String) c098200Yq;
    }

    public static final Pair<String, String> LIZIZ(int i, int i2) {
        String strLJIJI;
        String strLJIJI2;
        int i3 = i2 - i;
        if (i3 > 0) {
            strLJIJI = C497740JfY.LJIIL(2131756018, i3, Integer.valueOf(i3));
            strLJIJI2 = C497740JfY.LJIJI(2131856865);
        } else {
            strLJIJI = C497740JfY.LJIJI(2131856864);
            strLJIJI2 = C497740JfY.LJIJI(2131856863);
        }
        return new Pair<>(strLJIJI, strLJIJI2);
    }
}
