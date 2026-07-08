package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.debug.api.IFeatureDebugSwitch;
import com.ss.android.ugc.aweme.im.saas.host.api.feature.annotation.Feature;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AFwS269S0000000_27;

/* JADX INFO: renamed from: X.0y0f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1841070y0f {
    public final IFeatureDebugSwitch LIZ;
    public final Map<C13IQ<?>, Boolean> LIZIZ = new LinkedHashMap();
    public final ThreadLocal<Set<C13IQ<?>>> LIZJ = new ThreadLocal<>();

    public C1841070y0f(IFeatureDebugSwitch iFeatureDebugSwitch) {
        this.LIZ = iFeatureDebugSwitch;
    }

    public final boolean LIZ(C13IQ<?> c13iq) {
        Feature feature = (Feature) C09R7.LIZ(c13iq).getAnnotation(Feature.class);
        if (feature == null) {
            return false;
        }
        IFeatureDebugSwitch iFeatureDebugSwitch = this.LIZ;
        if (iFeatureDebugSwitch != null) {
            feature.id();
            if (iFeatureDebugSwitch.LIZJ()) {
                return false;
            }
        }
        if (PluggableExtentionKt.pluggableSpiForReal(C09R7.LIZ(c13iq)) == null) {
            return false;
        }
        C13IQ<?>[] c13iqArrLIZIZ = C13LE.LIZIZ(feature.parents());
        if (c13iqArrLIZIZ.length != 0) {
            int i = C1781790wT3.LIZ[feature.dependencyMode().ordinal()];
            if (i != 1) {
                if (i == 2) {
                    for (C13IQ<?> c13iq2 : c13iqArrLIZIZ) {
                        if (!LIZIZ(c13iq2)) {
                        }
                    }
                    return false;
                }
                throw new C1954807lC();
            }
            for (C13IQ<?> c13iq3 : c13iqArrLIZIZ) {
                if (!LIZIZ(c13iq3)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean LIZIZ(C13IQ<?> c13iq) {
        Boolean bool = (Boolean) ((LinkedHashMap) this.LIZIZ).get(c13iq);
        if (bool != null) {
            return bool.booleanValue();
        }
        Set<C13IQ<?>> linkedHashSet = this.LIZJ.get();
        if (linkedHashSet == null) {
            linkedHashSet = new LinkedHashSet<>();
            this.LIZJ.set(linkedHashSet);
        }
        if (linkedHashSet.contains(c13iq)) {
            C13LP.LJJLIIIJ(linkedHashSet, " -> ", null, null, 0, null, AFwS269S0000000_27.get$arr$(470), 30);
            return false;
        }
        linkedHashSet.add(c13iq);
        try {
            boolean zLIZ = LIZ(c13iq);
            this.LIZIZ.put(c13iq, Boolean.valueOf(zLIZ));
            linkedHashSet.remove(c13iq);
            if (linkedHashSet.isEmpty()) {
                this.LIZJ.remove();
            }
            return zLIZ;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            linkedHashSet.remove(c13iq);
            if (linkedHashSet.isEmpty()) {
                this.LIZJ.remove();
            }
            throw th;
        }
    }
}
