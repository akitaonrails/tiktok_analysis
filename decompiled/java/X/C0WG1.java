package X;

import java.util.EnumMap;
import kotlin.jvm.internal.AwS257S0300000_13;

/* JADX INFO: renamed from: X.0WG1, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WG1 {
    public final C0WG2 LIZ;
    public final C0WG0 LIZIZ;

    public final synchronized void LIZ() {
        this.LIZIZ.LIZIZ();
        if (this.LIZIZ.LIZLLL) {
            C0WG2 c0wg2 = this.LIZ;
            if (!c0wg2.LIZJ) {
                if (c0wg2.LIZIZ) {
                    C1913870zu5.LIZ.getClass();
                    if (!C1913870zu5.LIZ()) {
                    }
                }
                boolean z = c0wg2.LIZ;
                C0WG6 c0wg6 = C0WG5.LIZIZ;
                C844470XAv.LIZ.getClass();
                C0WG5 c0wg5LIZ = c0wg6.LIZ(C844470XAv.LIZ());
                C20144713rx c20144713rx = new C20144713rx(939524364);
                C837720Wte.LIZ("Firebase", "setAnalyticsCollectionEnabled", c20144713rx, new C0WGT(z, c20144713rx, c0wg5LIZ));
                c0wg2.LIZ(c0wg2.LIZ);
                c0wg2.LIZJ = true;
            }
        }
    }

    public final void LIZIZ() {
        C0WG0 c0wg0 = this.LIZIZ;
        c0wg0.getClass();
        EnumMap enumMap = new EnumMap(EnumC820330WFz.class);
        EnumC820330WFz enumC820330WFz = EnumC820330WFz.ANALYTICS_STORAGE;
        C0WG4 c0wg4 = C0WG4.DENIED;
        enumMap.put(enumC820330WFz, c0wg4);
        enumMap.put(EnumC820330WFz.AD_STORAGE, c0wg4);
        enumMap.put(EnumC820330WFz.AD_USER_DATA, c0wg4);
        enumMap.put(EnumC820330WFz.AD_PERSONALIZATION, c0wg4);
        C0WG6 c0wg6 = C0WG5.LIZIZ;
        C844470XAv c844470XAv = C844470XAv.LIZ;
        c844470XAv.getClass();
        C0WG5 c0wg5LIZ = c0wg6.LIZ(C844470XAv.LIZ());
        C20144713rx c20144713rx = new C20144713rx(939524367);
        C837720Wte.LIZ("Firebase", "setConsent", c20144713rx, new AwS257S0300000_13(enumMap, c20144713rx, c0wg5LIZ, 3));
        c0wg0.LIZ(false, false);
        C0WG2 c0wg2 = this.LIZ;
        c0wg2.getClass();
        c844470XAv.getClass();
        C0WG5 c0wg5LIZ2 = c0wg6.LIZ(C844470XAv.LIZ());
        C20144713rx c20144713rx2 = new C20144713rx(939524364);
        C837720Wte.LIZ("Firebase", "setAnalyticsCollectionEnabled", c20144713rx2, new C0WGT(false, c20144713rx2, c0wg5LIZ2));
        c0wg2.LIZ(false);
    }

    public C0WG1(boolean z, boolean z2, boolean z3) {
        this.LIZ = new C0WG2(z, z2);
        this.LIZIZ = new C0WG0(z3, z, z2);
    }
}
