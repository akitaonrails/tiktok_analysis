package X;

import android.content.Context;
import com.ss.android.ugc.tiktok.tpsc.core.render.TPSCRenderManager;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: renamed from: X.107w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C191958107w {
    public static AnonymousClass1081 LIZ;
    public static C107W LIZIZ;

    public static AnonymousClass1081 LIZ() throws AnonymousClass1080 {
        AnonymousClass1081 anonymousClass1081 = LIZ;
        if (anonymousClass1081 != null) {
            return anonymousClass1081;
        }
        throw new AnonymousClass1080("TPSCPrivacyBusiness Not initialized");
    }

    public static void LIZIZ(C191957107v c191957107v, C107W c107w) {
        LIZ = c191957107v;
        LIZIZ = c107w;
        C191968108g c191968108g = new C104D() { // from class: X.108g
            @Override // X.C104D
            public final List<AbstractC191843103l> LIZ(C191848103q c191848103q, C104A c104a) {
                if (c104a instanceof C191995109h) {
                    return Collections.singletonList(new C109U(c191848103q, (C191995109h) c104a));
                }
                if (c104a instanceof C191989109b) {
                    return Collections.singletonList(new C109V(c191848103q, (C191989109b) c104a));
                }
                if (c104a instanceof C191991109d) {
                    return Collections.singletonList(new C109S(c191848103q, (C191991109d) c104a));
                }
                return C13BV.INSTANCE;
            }
        };
        TPSCRenderManager.LIZ.getClass();
        TPSCRenderManager.LJI(C191995109h.class, c191968108g);
        TPSCRenderManager.LJI(C191989109b.class, c191968108g);
        TPSCRenderManager.LJI(C191991109d.class, c191968108g);
        C191959107x c191959107x = new AnonymousClass1031() { // from class: X.107x
            @Override // X.AnonymousClass1031
            public final AbstractC191843103l LIZ(C191848103q c191848103q, C104A c104a) {
                AnonymousClass1031 anonymousClass1031 = (AnonymousClass1031) ((LinkedHashMap) C103G.LIZ).get(c104a.LIZ);
                if (anonymousClass1031 != null) {
                    return anonymousClass1031.LIZ(c191848103q, c104a);
                }
                if (c104a instanceof C107O) {
                    C107O c107o = (C107O) c104a;
                    int i = c107o.LJIIJ;
                    if (i != 1) {
                        if (i != 2) {
                            return new C191981108t(c191848103q, c107o);
                        }
                        return new C109X(c191848103q, c107o);
                    }
                    return new C109O(c191848103q, c107o);
                }
                if (c104a instanceof C107P) {
                    C107P c107p = (C107P) c104a;
                    if (c107p.LJIIL == 1) {
                        return new C191964108c(c191848103q, c107p);
                    }
                    return new C191962108a(c191848103q, c107p);
                }
                if (c104a instanceof C107N) {
                    C107N c107n = (C107N) c104a;
                    int i2 = c107n.LJIIJ;
                    if (i2 != 1) {
                        if (i2 != 2) {
                            return new C191977108p(c191848103q, c107n);
                        }
                        return new C109W(c191848103q, c107n);
                    }
                    return new AnonymousClass1097(c191848103q, c107n);
                }
                if (c104a instanceof C103P) {
                    return new AbstractC191963108b(c191848103q, (C103P) c104a) { // from class: X.103Q
                        @Override // X.AbstractC191843103l
                        public final List<AbstractC191840103i> LJ(Context context) {
                            return C13BV.INSTANCE;
                        }

                        {
                            String str = c103p.LIZLLL;
                            String str2 = c103p.LJ;
                        }
                    };
                }
                return null;
            }
        };
        TPSCRenderManager.LJI(C107P.class, c191959107x);
        TPSCRenderManager.LJI(C107O.class, c191959107x);
        TPSCRenderManager.LJI(C107N.class, c191959107x);
        TPSCRenderManager.LJI(C103P.class, c191959107x);
    }
}
