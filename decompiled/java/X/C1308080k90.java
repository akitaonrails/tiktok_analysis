package X;

import com.bytedance.android.starship.StarshipCxxContainer;
import com.bytedance.android.starship.StarshipCxxContainerImpl;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0k90, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1308080k90 {
    public final StarshipCxxContainerImpl LIZ(StarshipCxxContainer.Type type) {
        ConcurrentHashMap<StarshipCxxContainer.Type, StarshipCxxContainerImpl> concurrentHashMap = StarshipCxxContainerImpl.instances;
        StarshipCxxContainerImpl starshipCxxContainerImpl = concurrentHashMap.get(type);
        if (starshipCxxContainerImpl != null) {
            return starshipCxxContainerImpl;
        }
        synchronized (this) {
            try {
                StarshipCxxContainerImpl starshipCxxContainerImpl2 = concurrentHashMap.get(type);
                if (starshipCxxContainerImpl2 != null) {
                    return starshipCxxContainerImpl2;
                }
                StarshipCxxContainerImpl starshipCxxContainerImpl3 = new StarshipCxxContainerImpl(type);
                concurrentHashMap.put(type, starshipCxxContainerImpl3);
                return starshipCxxContainerImpl3;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
