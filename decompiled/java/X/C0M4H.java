package X;

/* JADX INFO: renamed from: X.0M4H, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0M4H {
    public static void LIZ(C0M4E c0m4e) {
        final boolean z;
        C0M4F c0m4f;
        EnumC562220M3g enumC562220M3g;
        if (c0m4e.LIZIZ == null && (((c0m4f = c0m4e.LJFF) == C0M4F.ALL || c0m4f == C0M4F.EXCEPT_TTN) && ((enumC562220M3g = c0m4e.LJ) == EnumC562220M3g.NORMAL || enumC562220M3g == EnumC562220M3g.ALL))) {
            z = true;
        } else {
            z = false;
        }
        C823050WQl.LIZJ().execute(new Runnable() { // from class: X.0M4G
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("DraftQueryPerformanceMobHelper@cdc4.mobRawQuery$1");
                try {
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    c2344009Gk.LJ(Boolean.valueOf(z), "is_large_query");
                    C20684815ws.LJIILLIIL("draft_query_performance", c2344009Gk.LIZ);
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("DraftQueryPerformanceMobHelper@cdc4.mobRawQuery$1");
            }
        });
    }
}
