package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1Cjy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2238841Cjy {
    public static final HashMap<String, C2238881Ck2<?>> LIZ = new HashMap<>();
    public static final AtomicLong LIZIZ = new AtomicLong(0);

    public static void LIZ(C2238881Ck2 c2238881Ck2) {
        HashMap<String, C2238881Ck2<?>> map = LIZ;
        synchronized (map) {
            try {
                map.remove(c2238881Ck2.LIZ.getName());
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static void LIZIZ(C1576580r84 c1576580r84, List list) {
        HashMap<String, C2238881Ck2<?>> map = LIZ;
        synchronized (map) {
            try {
                Iterator<C2238881Ck2<?>> it2 = map.values().iterator();
                while (it2.hasNext()) {
                    C2238881Ck2<?> next = it2.next();
                    if (Intrinsics.LJFF(next.LJI, c1576580r84) && (list == null || list.contains(next.LIZ))) {
                        it2.remove();
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
