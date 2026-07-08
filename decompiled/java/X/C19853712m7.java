package X;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.12m7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19853712m7 {
    public static volatile C19853712m7 LIZIZ;
    public static final C19853712m7 LIZJ = new C19853712m7(0);
    public final Map<C19853612m6, C19906912uh<?, ?>> LIZ;

    public C19853712m7() {
        this.LIZ = new HashMap();
    }

    public C19853712m7(int i) {
        this.LIZ = Collections.emptyMap();
    }

    public final C19906912uh LIZ(final int i, final InterfaceC19901112tl interfaceC19901112tl) {
        return this.LIZ.get(new Object(i, interfaceC19901112tl) { // from class: X.12m6
            public final Object LIZ;
            public final int LIZIZ;

            public final int hashCode() {
                return (System.identityHashCode(this.LIZ) * 65535) + this.LIZIZ;
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof C19853612m6)) {
                    return false;
                }
                C19853612m6 c19853612m6 = (C19853612m6) obj;
                if (this.LIZ != c19853612m6.LIZ || this.LIZIZ != c19853612m6.LIZIZ) {
                    return false;
                }
                return true;
            }

            {
                this.LIZ = interfaceC19901112tl;
                this.LIZIZ = i;
            }
        });
    }
}
