package X;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.13AF, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13AF implements C13AJ {
    public final C13AE LIZ = new C13AE();

    @Override // X.C13AJ
    public final void initialize() {
    }

    @Override // X.C13AJ
    public final String LIZIZ() {
        throw new UnsupportedOperationException();
    }

    public C13AF() {
        new C13AM();
        new Object() { // from class: X.0uMG
            {
                new Object() { // from class: X.0uMH
                    {
                        new ThreadLocal();
                    }
                };
                new InheritableThreadLocal<Map<String, String>>() { // from class: X.0uMF
                    @Override // java.lang.InheritableThreadLocal
                    public final Map<String, String> childValue(Map<String, String> map) {
                        Map<String, String> map2 = map;
                        if (map2 == null) {
                            return null;
                        }
                        return new HashMap(map2);
                    }
                };
            }
        };
    }

    @Override // X.C13AJ
    public final C13AN LIZ() {
        return this.LIZ;
    }
}
