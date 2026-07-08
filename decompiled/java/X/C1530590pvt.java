package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.List;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0pvt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1530590pvt {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(String str) {
        List<String> list;
        try {
            C1530600pvu c1530600pvu = C1535630q41.LJ;
            if (c1530600pvu != null && (list = c1530600pvu.LIZIZ) != null) {
                Iterator<String> it2 = list.iterator();
                while (it2.hasNext()) {
                    if (a0.LJJIIZI(str, it2.next(), false)) {
                        return true;
                    }
                }
                return false;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return false;
    }
}
