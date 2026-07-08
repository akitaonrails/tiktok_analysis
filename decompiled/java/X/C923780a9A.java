package X;

import Y.AfS7S0010000_15;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0a9A, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C923780a9A {
    public static boolean LIZ;
    public static C00CH LIZIZ;
    public static final Map<String, String> LIZJ = new HashMap();
    public static final Map<String, String> LIZLLL = new HashMap();
    public static C11JF LJ;

    public static final void LIZ() {
        LIZ = false;
        LIZIZ = null;
        ((HashMap) LIZJ).clear();
        ((HashMap) LIZLLL).clear();
        C11JF c11jf = LJ;
        if (c11jf != null) {
            c11jf.dispose();
        }
        LJ = null;
    }

    public static void LIZIZ(boolean z) {
        C11JF c11jf = LJ;
        if (c11jf != null) {
            c11jf.dispose();
        }
        LJ = (C11JF) C11NZ.LJJJJLL(0L, 1L, 1L, 1L, TimeUnit.MINUTES).LJIILIIL(new C0UO0()).LJJLL(new AfS7S0010000_15(z, 2), new C09JN() { // from class: X.0a9N
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("LinkReportActiveMonitor@b072.startReportAnchorLinkMicActiveForMultiCoHost$2");
                C1C7U.LIZIZ("LinkReportActiveMonitor@b072.startReportAnchorLinkMicActiveForMultiCoHost$2");
            }
        });
    }
}
