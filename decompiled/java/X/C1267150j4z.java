package X;

import com.ss.lyrax.augur.AugurAdaptiveWrapper;

/* JADX INFO: renamed from: X.0j4z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1267150j4z {
    public final /* synthetic */ C1266350j3h LIZ;

    public C1267150j4z(C1266350j3h c1266350j3h) {
        this.LIZ = c1266350j3h;
    }

    public final void LIZ(boolean z, boolean z2) throws Exception {
        C1266350j3h c1266350j3h = this.LIZ;
        c1266350j3h.getClass();
        c1266350j3h.LLLZLL();
        if (c1266350j3h.LLZZZZ != null) {
            C1267160j50 c1267160j50 = new C1267160j50();
            c1267160j50.LIZIZ = z2 ? 1 : 0;
            c1267160j50.LIZ = z ? 1 : 0;
            C1267080j4s c1267080j4s = c1266350j3h.LLZZZZ.LIZLLL;
            c1267080j4s.LIZ(c1267080j4s.LJIIJJI, c1267160j50);
        }
        AugurAdaptiveWrapper augurAdaptiveWrapper = c1266350j3h.c;
        if (augurAdaptiveWrapper != null) {
            augurAdaptiveWrapper.updateFeature("gputurbo_enable_status", z2 ? 1 : 0);
            c1266350j3h.c.updateFeature("can_enable_gputurbo", z ? 1 : 0);
        }
    }
}
